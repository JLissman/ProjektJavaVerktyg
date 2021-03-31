pipeline{
    agent any
    tools{
        maven 'Maven 3.6.3'
    }
    stages{
        stage('Build'){
            steps{
                echo 'Group 4'
                bat 'java --version'
                bat 'mvn clean compile'
            }
        }
        stage('Test'){
            steps{
                bat 'mvn test'
            }
        }
        stage('Deploy'){
            steps {
                bat 'mvn package'
            }
        }
    }
}