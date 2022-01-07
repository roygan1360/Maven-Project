job('my-dsl-job-1') {
    logRotator(5, 10)
    jdk('Java 8')
    scm {
        git('https://github.com/admingagan/Maven-Project.git', 'master')
    }
    triggers {
        githubPush()
        cronTrigger('* * * * *')
    }
    steps {
        maven ('clean package')
    }
}
