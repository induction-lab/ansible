package com.sbrf.pipeline;

import org.apache.commons.io.FilenameUtils;

import org.junit.Before
import org.junit.Test

import com.lesfurets.jenkins.unit.BasePipelineTest
import static com.lesfurets.jenkins.unit.global.lib.LibraryConfiguration.library
import static com.lesfurets.jenkins.unit.global.lib.LocalSource.localSource

class Sample extends BasePipelineTest {

    @Override
    @Before
    void setup() {
        String repositoryDirectoryName = FilenameUtils.getName(System.getProperty("user.dir"))
        String dirPath = new File( System.getProperty("user.dir") )
                .getAbsoluteFile()
                .getParentFile()
                .getAbsolutePath()

        // This next call bypasses registerSharedLibrary; to allow registering a library with a different directory name
        helper.libraries.put('my-jenkins-library', library(repositoryDirectoryName)
                        .allowOverride(true)
                        .implicit(false)
                        .targetPath(dirPath)
                        .retriever(localSource(dirPath))
                        .build())
    }

    @Test
    void should_run_example_pipeline_without_errors() throws Exception {
        // def script = loadScript("test\\resources\\pipelines\\example1.pipeline")
        // script.execute()
        // printCallStack()
    }
}