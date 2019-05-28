// node() {
  // stage("x") {
    
    // def s = pipeline.Sample.new(5, 10);
    // echo s.toString();
  // }
// }

// def pipeline = library(identifier: 'local-lib@master', retriever: legacySCM(scm)).com.sbrf.pipeline;

pipeline {
    agent any
    stages {
        stage('Example') {
            steps {
                echo 'Hello World'
            }
        }
    }
}