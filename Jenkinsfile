pipeline {
    agent {
    	label "master"
    }
    tools{
    	maven "MAVEN"
    }
    stages {
        stage ('Build Maven') {
            steps {
                checkout([$class:'GitSCM',branches:[[name:'*/main']],extensions:[],userRemoteConfigs:[[credentialsId:'cb480fdd-388f-4890-b35d-29cdeaf327d5',url:'https://github.com/kishore-rajkumar/demo.git']]])

                sh "mvn -Dmaven.test.failure.ignore=true clean package"
            }
        }
    }
}