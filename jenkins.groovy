node() {
  stage("x") {
    git init
    def repoPath = pwd();
    library identifier: 'local-lib@master', retriever: modernSCM([$class: 'GitSCMSource', remote: repoPath]);
    echo "ok"
  }
}
