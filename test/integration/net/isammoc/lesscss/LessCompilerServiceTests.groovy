package net.isammoc.lesscss

import org.junit.Test


class LessCompilerServiceTests {

	def grailsApplication
	def lessCompilerService

	@Test
	void compile_css_only_less_into_CSS() {
		// given
		def srcLessFile = "css-only.less"
		def modelCssFile = "css-only.css"
		def tmpTarget = File.createTempFile("LessCompilerServiceSpec", ".css")
		tmpTarget.deleteOnExit()
		def srcFile = grailsApplication.parentContext.getResource(srcLessFile)?.file
		def modelFile = grailsApplication.parentContext.getResource(modelCssFile)?.file
		def importPath = srcFile?.parentFile?.absolutePath
		
		// when
		lessCompilerService.compile(srcFile, tmpTarget, [importPath])

		// then
		tmpTarget.text.equals(modelFile.text)
	}
}
