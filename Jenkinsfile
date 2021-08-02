pipeline {
  agent any
  stages {	
	stage('Maven Compile'){
		steps{
			echo 'Project compile stage'
			bat label: 'Compilation running', script: '''mvn compile'''
	       	}
	}
	
	stage('Unit Test') {
	   steps {
			echo 'Project Testing stage'
			bat label: 'Test running', script: '''mvn test'''
	       
       		}
   	}

	stage('Jacoco Coverage Report') {
        	steps{
            		jacoco()
		}
	}
       
stage('SonarQube'){
		steps{
				bat label: '',
				script: '''cd store-demo
				mvn sonar:sonar \
				-Dsonar.host.url=http://localhost:9000 \
				-Dsonar.login=8f406784463e4753a0117f639b3e0f572a78d893'''
			}
   		}
	
	stage('Maven Package'){
		steps{
			echo 'Project packaging stage'
			bat label: 'Project packaging', script: '''mvn package'''
		}
	} 		
    
  }
}

