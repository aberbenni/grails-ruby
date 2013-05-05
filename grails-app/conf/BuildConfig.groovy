grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"

grails.project.dependency.resolution = {
    inherits("global") {
        excludes 'ehcache'
    }

    log "info" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'

    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()
        mavenCentral()
        mavenRepo "http://repo1.maven.org/maven2/"
    }

    dependencies {
        runtime (group: 'org.jruby', name: 'jruby', version: '1.7.3')
    }

    plugins {
        build(":release:2.2.1") {
            export = false
        }
    }
}
