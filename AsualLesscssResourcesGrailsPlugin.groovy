class AsualLesscssResourcesGrailsPlugin {
	// the plugin version
	def version = "0.1"
	// the version or versions of Grails the plugin is designed for
	def grailsVersion = "2.2 > *"
	// resources that are excluded from plugin packaging
	def pluginExcludes = [
		"grails-app/views/error.gsp"
	]

	// TODO Fill in these fields
	def title = "Asual Lesscss Resources Plugin" // Headline display name of the plugin
	def author = "Isammoc OFF"
	def authorEmail = "isammoc@gmail.com"
	def description = '''\
This plugin supports server-side compilation of .less CSS files to their .css counterparts.
Less compiler based on asual lesscss
'''

	// URL to the plugin's documentation
	def documentation = "http://grails.org/plugin/asual-lesscss-resources"

	// Extra (optional) plugin metadata

	// License: one of 'APACHE', 'GPL2', 'GPL3'
	def license = "APACHE"

	// Any additional developers beyond the author specified above.
//	def developers = [ [ name: "Joe Bloggs", email: "joe@bloggs.net" ]]

	// Location of the plugin's issue tracker.
	def issueManagement = [ system: "github", url: "https://github.com/Isammoc/asual-lesscss-resources-grails-plugin/issues" ]

	// Online location of the plugin's browseable source code.
	def scm = [ url: "https://github.com/Isammoc/asual-lesscss-resources-grails-plugin" ]

	def doWithWebDescriptor = { xml ->
		// TODO Implement additions to web.xml (optional), this event occurs before
	}

	def doWithSpring = {
		// TODO Implement runtime spring config (optional)
	}

	def doWithDynamicMethods = { ctx ->
		// TODO Implement registering dynamic methods to classes (optional)
	}

	def doWithApplicationContext = { applicationContext ->
		// TODO Implement post initialization spring config (optional)
	}

	def onChange = { event ->
		// TODO Implement code that is executed when any artefact that this plugin is
		// watching is modified and reloaded. The event contains: event.source,
		// event.application, event.manager, event.ctx, and event.plugin.
	}

	def onConfigChange = { event ->
		// TODO Implement code that is executed when the project configuration changes.
		// The event is the same as for 'onChange'.
	}

	def onShutdown = { event ->
		// TODO Implement code that is executed when the application shuts down (optional)
	}
}
