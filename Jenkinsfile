pipeline{
    agent any
    tools{
        maven 'Maven 3.6.3'
    }
    stages{
        stage('Info & clean'){
            steps{
                echo 'Group 4'
                sh 'java --version'
                sh 'mvn --version'
                sh 'mvn clean compile'

            }
        }
        stage('Tests'){
            steps{
                sh 'mvn test'
                sh 'mvn failsafe:integration-test'
                sh 'mvn verify'
            }
        }
        stage('Build'){
            steps {
                sh 'mvn package'
                sh 'docker build -t jlissman/javaverktygprojekt:souter .'
            }
        }
        stage('Push'){
            steps{
                sh 'docker login -u jlissman -p losenordforprojekt11'
                sh 'docker push jlissman/javaverktygprojekt:souter'
            }

        }
    }
}