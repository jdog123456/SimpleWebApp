node {
   stage('Preparation') {
      git 'https://github.com/jdog123456/SimpleWebApp.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
}