#!/usr/bin/groovy
def call(body) {
  // evaluate the body block, and collect configuration into the object
  def config = [:]
            
        sh "mvn fabric8:push -Ddocker.push.registry=${config.host}:${config.port}"
  }
