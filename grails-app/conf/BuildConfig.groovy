grails.project.work.dir = 'target'

grails.project.dependency.resolution = {
	inherits("global") 
	log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'

	repositories {
		grailsCentral()
		mavenCentral()
	}

	dependencies {
		compile 'com.asual.lesscss:lesscss-engine:1.5.0'
	}

	plugins {
		runtime ":resources:1.2"
		runtime ":hibernate:$grailsVersion", {
			export = false
		}

		build(":tomcat:$grailsVersion",
				":release:2.2.1",
				":rest-client-builder:1.0.3") {
			export = false
		}
	}
}
