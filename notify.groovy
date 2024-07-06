def call(Map config = [:]) {
    def buildStatus = currentBuild.currentResult ?: 'SUCCESS'
    mail to: config.recipients,
         subject: "Build ${buildStatus}: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
         body: "Check the build details at ${env.BUILD_URL}"
}

