grails.project.class.dir = "target/classes"
grails.project.target.level = 1.7
grails.project.source.level = 1.7
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"

grails.project.dependency.resolution = {
  // inherit Grails' default dependencies
  inherits("global") {
    // uncomment to disable ehcache
    // excludes 'ehcache'
  }
  log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
  repositories {
    grailsPlugins()
    grailsHome()
    grailsCentral()
    mavenCentral()

    mavenRepo "http://snapshots.repository.codehaus.org" // do we need this?

    // TODO get these into nexus if they're not there
    mavenRepo "http://repository.codehaus.org"
    mavenRepo "http://download.java.net/maven/2/"
    mavenRepo "http://repository.jboss.com/maven2/"
    mavenRepo "https://apelon-dts.svn.sourceforge.net/svnroot/apelon-dts/repos/repo/"
    mavenRepo "http://maven.springframework.org/milestone/"
    mavenRepo 'https://oss.sonatype.org/content/repositories/snapshots'
    mavenRepo 'http://repo.grails.org/grails/repo/'
    mavenRepo 'http://wo-repository.doit.com.br/content/repositories/thirdparty'
  }
  dependencies {
    // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.

    // runtime 'mysql:mysql-connector-java:5.1.18'
  }

  plugins {
    build(":tomcat:7.0.55",
          ":release:3.0.1") {
        export = false
    }
    compile ':plugin-config:0.2.0'
  }
}
