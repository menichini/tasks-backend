pipeline {
    agent any
    tolls {
        maven 'maven'
    }
    stages {
        stage('Build'){
            steps {
                sh '
                mvn clean package -DskipTests "
                   '
            }
        }
    }
}