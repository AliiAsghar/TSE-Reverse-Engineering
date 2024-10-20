package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hty implements hnn {
    private final hnn b;
    private final boolean c;

    public hty(hnn hnnVar, boolean z) {
        this.b = hnnVar;
        this.c = z;
    }

    @Override // defpackage.hne
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.hnn
    public final hpt b(Context context, hpt hptVar, int i, int i2) {
        hqa hqaVar = hkz.b(context).a;
        Drawable drawable = (Drawable) hptVar.c();
        hpt a = htx.a(hqaVar, drawable, i, i2);
        if (a == null) {
            if (!this.c) {
                return hptVar;
            }
            throw new IllegalArgumentException(hht.b(drawable, "Unable to convert ", " to a Bitmap"));
        }
        hpt b = this.b.b(context, a, i, i2);
        if (b.equals(a)) {
            b.e();
            return hptVar;
        }
        return huh.f(context.getResources(), b);
    }

    @Override // defpackage.hne
    public final boolean equals(Object obj) {
        if (obj instanceof hty) {
            return this.b.equals(((hty) obj).b);
        }
        return false;
    }

    @Override // defpackage.hne
    public final int hashCode() {
        return this.b.hashCode();
    }
}
