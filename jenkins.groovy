node() {
  stage("x") {
    def pipeline = library(identifier: 'local-lib@master', retriever: legacySCM(scm)).com.company.pipeline;
    def s = pipeline.Sample.new(5, 10);
    echo s.toString();
  }
}