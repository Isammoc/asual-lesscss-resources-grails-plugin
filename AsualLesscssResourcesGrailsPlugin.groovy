import org.grails.plugin.resource.CSSPreprocessorResourceMapper
import org.grails.plugin.resource.CSSRewriterResourceMapper

class AsualLesscssResourcesGrailsPlugin {
	// the plugin version
	def version = "0.2"
	// the version or versions of Grails the plugin is designed for
	def grailsVersion = "2.2 > *"

	def title = "Asual Lesscss Resources Plugin" // Headline display name of the plugin
	def author = "Isammoc OFF"
	def authorEmail = "isammoc@gmail.com"
	def description = '''This plugin supports server-side compilation of .less CSS files to their .css counterparts. Less compiler based on asual lesscss
'''

	def documentation = "http://grails.org/plugin/asual-lesscss-resources"
	def license = "APACHE"
	def issueManagement = [ system: "github", url: "https://github.com/Isammoc/asual-lesscss-resources-grails-plugin/issues" ]
	def scm = [ url: "https://github.com/Isammoc/asual-lesscss-resources-grails-plugin" ]

	def doWithSpring = {
		CSSPreprocessorResourceMapper.defaultIncludes.add('**/*.less')
		CSSRewriterResourceMapper.defaultIncludes.add('**/*.less')
	}
}
