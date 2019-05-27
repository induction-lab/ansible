node() {
  stage("x") {
    def pipeline = libraryFromLocalRepo().com.company.pipeline;
    def s = pipeline.Sample(5, 10);
  }
}

def libraryFromLocalRepo() {
    // Workaround for loading the current repo as shared build lib.
    // Checks out to workspace local folder named like the identifier.
    library(identifier: 'local-lib@master', retriever: legacySCM(scm))
}