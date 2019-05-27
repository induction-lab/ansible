node() {
  stage("x") {
    library identifier: 'local-lib@master', retriever: legacySCM(scm);
    import com.company.Sample;
    echo "ok"
  }
}
