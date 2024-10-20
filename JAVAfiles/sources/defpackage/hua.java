package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hua extends hte {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(a);

    @Override // defpackage.hne
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.hte
    protected final Bitmap c(hqa hqaVar, Bitmap bitmap, int i, int i2) {
        return hun.c(hqaVar, bitmap, i, i2);
    }

    @Override // defpackage.hne
    public final boolean equals(Object obj) {
        return obj instanceof hua;
    }

    @Override // defpackage.hne
    public final int hashCode() {
        return 1572326941;
    }
}
