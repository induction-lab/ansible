node() {
  stage("x") {
    library identifier: 'local-lib@master', retriever: legacySCM(scm);
    echo "ok"
  }
}
