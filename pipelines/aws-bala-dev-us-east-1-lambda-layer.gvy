pipeline {
    agent any 
	options{
			buildDiscarder(
						logRotator(
						daysToKeepStr : '7',
						numToKeepStr : '7',
						artifactDaysToKeepStr : '7',
						artifactNumToKeepStr : '7'
						)

						)
			}

    stages {
        stage('Stage 1') {
            steps {
               sh ''' echo "Absolute Folder path=${PWD}" 
			   UPSTREAM_BUILD_NUMBER=${BUILD_NUMBER}
			   echo ${UPSTREAM_BUILD_NUMBER}
			   '''
            }
        }
    }
}
