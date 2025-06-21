pipeline {
    agent any

    tools {
        maven 'Maven 3' // We'll configure this below
    }

    stages {
        stage('Clone') {
            steps {
                git url: 'https://github.com/vitsjumbad/java-devops-ec2.git', branch: 'main'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t springboot-app .'
            }
        }

        stage('Run Container') {
            steps {
                sh 'docker stop springboot-app || true'
                sh 'docker rm springboot-app || true'
                sh 'docker run -d -p 8082:8081 --name springboot-app springboot-app'
            }
        }
    }
}

