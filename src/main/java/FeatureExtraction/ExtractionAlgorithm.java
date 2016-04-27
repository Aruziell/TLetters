package FeatureExtraction;

import java.awt.image.BufferedImage;

public interface ExtractionAlgorithm {
    Double[] extractFeatures(BufferedImage bufferedImage);
}
