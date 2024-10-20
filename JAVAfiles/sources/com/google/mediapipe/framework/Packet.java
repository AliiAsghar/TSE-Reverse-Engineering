package com.google.mediapipe.framework;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class Packet {
    private long a;

    private Packet(long j) {
        this.a = j;
    }

    public static Packet create(long j) {
        return new Packet(j);
    }

    private native void nativeReleasePacket(long j);

    public long getNativeHandle() {
        return this.a;
    }

    public void release() {
        long j = this.a;
        if (j != 0) {
            nativeReleasePacket(j);
            this.a = 0L;
        }
    }
}
