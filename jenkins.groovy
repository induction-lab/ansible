import org.apache.commons.io.FilenameUtils;

node() {
  stage("x") {
    def pipeline = library(identifier: 'local-lib@master', retriever: legacySCM(scm)).com.sbrf.pipeline;
    def s = pipeline.Sample.new(5, 10);
    echo s.toString();
    
    setup();
    
  }
}

void setup() {
    String repositoryDirectoryName = FilenameUtils.getName(System.getProperty("user.dir"))
    String dirPath = new File(System.getProperty("user.dir"))
            .getAbsoluteFile()
            .getParentFile()
            .getAbsolutePath()

    // This next call bypasses registerSharedLibrary; to allow registering a library with a different directory name
    helper.libraries.put('jenkins-library', library(repositoryDirectoryName)
                    .allowOverride(true)
                    .implicit(false)
                    .targetPath(dirPath)
                    .retriever(localSource(dirPath))
                    .build())
}