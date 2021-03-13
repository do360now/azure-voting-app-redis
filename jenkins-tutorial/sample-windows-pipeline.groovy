pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
           }
           
        }
        stage('Goodbye') {
            steps {
                echo 'Goodbye World'
            }
            
        }    

        stage('Hello Wdndows World') {
            steps {
                powershell label: '', script: 'Write-Output "Hello Windows World!!"'
            }
            
        }       

    }
    
}
