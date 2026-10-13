package com.liskovsoft.mediaserviceinterfaces.data;

/**
 * One bucket of YouTube's "Most replayed" heatmap.
 */
public interface HeatMarker {
    long getStartMs();
    long getDurationMs();
    /**
     * Replay intensity normalized to [0, 1]
     */
    float getIntensity();
}
