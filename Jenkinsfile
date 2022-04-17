pipeline {
    environment{
        imageName = ''
    }
    agent any

    stages {
        stage('Step 1 : Git Clone') {
            steps {
                script{
                    git branch : 'main' , url : "https://github.com/akhilakondapalli/ScientificCalculatorDevops.git"
                }
            }
            
        }
        stage('Step 2 : Build Maven'){
            steps{
                script{
                    sh 'mvn clean install'
                }
            }
        }
        stage('Step 3 :Docker Build'){
            steps{
                script{
                    imageName = docker.build "akhila7113/calculator:latest"
                }
            }
        }
        stage('Step 4 : push image to docker hub'){
            steps{
                script{
                    docker.withRegistry('','docker-jenkins'){
                        imageName.push()
                    }
                }
            }
        }
           stage('Step 5 : Ansible pull image from docker hub'){
            steps{
                script{
                    ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'deploy-docker/inventory', playbook: 'deploy-docker/deploy-image.yml', sudoUser: null
                    }
                }
            }
        }
        
        post {
        always {
            echo 'I will always say Hello again!'
            emailext body: '${DEFAULT_CONTENT}', recipientProviders: [buildUser()], subject: '${DEFAULT_SUBJECT}', to: 'kndpllakhila@gmail.com'

                
            
        }
    }
        
    
    }

