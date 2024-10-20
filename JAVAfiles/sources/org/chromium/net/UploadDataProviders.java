package org.chromium.net;

import android.os.ParcelFileDescriptor;
import defpackage.atdx;
import defpackage.atdy;
import defpackage.atea;
import defpackage.atow;
import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new atea(new atdx(parcelFileDescriptor, 0));
    }

    public static UploadDataProvider create(File file) {
        return new atea(new atdx(file, 1));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new atdy(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr) {
        return atow.y(bArr, 0, bArr.length);
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return atow.y(bArr, i, i2);
    }
}
