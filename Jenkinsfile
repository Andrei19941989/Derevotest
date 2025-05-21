ppipeline {
    agent any

    environment {
        IMAGE_NAME = "servak"
        CONTAINER_NAME = "ServakCont"
        
    }

    stages {
        stage('Build JAR') {
            steps {
                sh './gradlew build' // Если используете Gradle
                // sh 'mvn package -DskipTests' // Если используете Maven
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t ${IMAGE_NAME} .'
            }
        }


        stage('Check Running Containers') {
            steps {
                sh 'docker ps'
            }
        }
    }

    post {
        always {
            echo 'Pipeline завершён'
        }
        failure {
            echo 'Что-то пошло не так...'
        }
    }
}
