pipline{
agent {
label 'master'
}

options{
buildDiscarder(
logRotator(
daysToKeepStr : '7',
numToKeepStr : '7',
artifactDaysToKeepStr : '7',
artifactNumToKeepStr : '7',
)

)
ansiColor('xterm')

}
stages{
stage('checkoutcode')
{
steps{
sh '''echo "Absolute Folder Path = ${PWD}"
      UPSTREAM_BUILD_NUMBER=${BUILD_NUMBER}
      echo ${UPSTREAM_BUILD_NUMBER}'''
}
}
}


}