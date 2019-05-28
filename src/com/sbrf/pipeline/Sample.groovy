package com.sbrf.pipeline;

import org.apache.commons.io.FilenameUtils;
import com.lesfurets.jenkins.unit.BasePipelineTest;

public class Sample extends BasePipelineTest {
    private int x;
    private int y;

    public Sample(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Sample{" + "x=" + x + ", y=" + y + "}";
    }
}