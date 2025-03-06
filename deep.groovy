pipeline {
    agent any

    stages {
        stage('Intro') {
            steps {
                echo 'I am a student at SAKEC.'
            }
        }
        stage('Education') {
            steps {
                echo 'I study in TY in B.Tech IT.'
            }
        }
        stage('Future') {
            steps {
                echo 'I aspire to become a Cloud Engineer.'
            }
        }
    }
}
