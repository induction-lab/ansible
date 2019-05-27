node() {
  stage("x") {
    def repoPath = pwd();
    library identifier: 'local-lib@master', retriever: modernSCM([$class: 'GitSCMSource', remote: repoPath]);
    echo "ok"
  }
}
