package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvi implements hnn {
    private final hnn b;

    public hvi(hnn hnnVar) {
        hwr.i(hnnVar);
        this.b = hnnVar;
    }

    @Override // defpackage.hne
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.hnn
    public final hpt b(Context context, hpt hptVar, int i, int i2) {
        hvf hvfVar = (hvf) hptVar.c();
        hpt huhVar = new huh(hvfVar.a(), hkz.b(context).a, 1);
        hpt b = this.b.b(context, huhVar, i, i2);
        if (!huhVar.equals(b)) {
            huhVar.e();
        }
        Bitmap bitmap = (Bitmap) b.c();
        hvfVar.a.a.e(this.b, bitmap);
        return hptVar;
    }

    @Override // defpackage.hne
    public final boolean equals(Object obj) {
        if (obj instanceof hvi) {
            return this.b.equals(((hvi) obj).b);
        }
        return false;
    }

    @Override // defpackage.hne
    public final int hashCode() {
        return this.b.hashCode();
    }
}
