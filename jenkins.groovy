// node() {
  // stage("x") {
    
    // def s = pipeline.Sample.new(5, 10);
    // echo s.toString();
  // }
// }

def core = library(identifier: 'local-lib@master', retriever: legacySCM(scm));

pipeline {
    agent any
    stages {
        stage('Example') {
            steps {
                echo 'Hello World'
                build(this)
            }
        }
    }
}