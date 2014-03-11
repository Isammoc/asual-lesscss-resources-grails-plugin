grails.project.work.dir = 'target'

grails.project.dependency.resolution = {

	inherits 'global'
	log "warn"

	repositories {
		grailsCentral()
		mavenLocal()
		mavenCentral()
	}

	dependencies {
		compile 'com.asual.lesscss:lesscss-engine:1.5.0'
	}

	plugins {
		runtime ":hibernate:$grailsVersion", {
			export = false
		}

		runtime ":resources:1.2"
		build(":release:2.2.1", ":rest-client-builder:1.0.3") {
			export = false
		}
	}
}
