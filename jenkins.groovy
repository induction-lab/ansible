node() {
  stage("x") {
    library identifier: 'local-lib@master', retriever: legacySCM(scm);
    import Sample;
    echo "ok"
  }
}
