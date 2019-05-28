node() {
    stage("lets go ...") {
        def pipeline = library(identifier: 'local-lib@master', retriever: legacySCM(scm)).com.sbrf.pipeline;
        def sample = pipeline.Sample.new(5, 10);
        echo sample.toString();
    }
}
