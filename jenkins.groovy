node() {
  stage("x") {
    def pipeline = library(identifier: 'local-lib@master', retriever: legacySCM(scm)).com.company.pipeline;
    def s = pipeline.Sample(5, 10);
  }
}
