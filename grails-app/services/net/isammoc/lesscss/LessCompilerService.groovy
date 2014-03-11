package net.isammoc.lesscss

import com.asual.lesscss.LessEngine
import com.asual.lesscss.LessOptions

class LessCompilerService {

	def compile(source, target, paths = []) {
		LessEngine engine = new LessEngine()
		target.text = engine.compile(source, true)
	}
}
