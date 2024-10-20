package com.google.mediapipe.framework;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface GlSyncToken {
    long nativeToken();

    void release();

    void waitOnCpu();

    void waitOnGpu();
}
