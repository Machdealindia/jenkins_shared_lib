def call(credentialsId){

    withSonarQubeEnv(credentialsId: credentialsId) {
         // Dynamically downloads and runs the plugin without explicit version locking
         sh 'mvn clean package org.sonarsource.scanner.maven:sonar-maven-plugin:sonar'
    }
}
