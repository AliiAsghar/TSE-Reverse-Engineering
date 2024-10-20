package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xvp extends hte {
    private static final byte[] b = "com.google.android.apps.messaging.shared.ui.glide.HorizontalFlip".getBytes(a);

    @Override // defpackage.hne
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.hte
    protected final Bitmap c(hqa hqaVar, Bitmap bitmap, int i, int i2) {
        return hun.h(bitmap, 2);
    }

    @Override // defpackage.hne
    public final boolean equals(Object obj) {
        return obj instanceof xvp;
    }

    @Override // defpackage.hne
    public final int hashCode() {
        return -1018665206;
    }
}
