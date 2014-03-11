import org.codehaus.groovy.grails.commons.GrailsApplication
import org.grails.plugin.resource.mapper.MapperPhase

/**
 * Less resource mapping. Compile .less files into .css files.
 *
 * @author Karol Balejko
 */
class LessResourceMapper {

    static phase = MapperPhase.GENERATION
    static defaultIncludes = [ '**/*.less' ]

    GrailsApplication grailsApplication
    def lessCompilerService

    def paths = [].asSynchronized()

    def map(resource, config){
        File lessFile = grailsApplication.parentContext.getResource(resource.sourceUrl).file
        File cssFile = new File(resource.processedFile.absolutePath + '.css')

        try {
            log.debug "Compiling LESS file [${lessFile}] into [${cssFile}]"
            lessCompilerService.compile (lessFile, cssFile)
            resource.processedFile = cssFile
            resource.contentType = 'text/css'
            resource.tagAttributes.rel = 'stylesheet'
            resource.updateActualUrlFromProcessedFile()
        } catch (Exception e) {
            log.error("Error compiling less file: ${lessFile}", e)
        }
    }
}
