package com.google.android.libraries.abuse.hades.tartarus.runtime;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class TartarusKt {
    public static final native void freeTartarusBuffer(ByteBuffer byteBuffer);

    public static final native void hashScarAndProtectionComponentsV2(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int[] iArr, byte[][] bArr, byte[] bArr2);

    public static final native void loadScarAssets(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, Data data, Data data2);

    public static final native void runScarBlobs(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, Data data, Data data2);
}
