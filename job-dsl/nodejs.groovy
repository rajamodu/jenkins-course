job('NodeJS example') {
    scm {
        git('git://github.com/rajamodu/docker-demo.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('rajamodu')
            node / gitConfigEmail('modurajasekhar@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
