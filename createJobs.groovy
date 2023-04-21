pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('harmoniJob') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/Gh-Badr/HarmoniAPI.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}