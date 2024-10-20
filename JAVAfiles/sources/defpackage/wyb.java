package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class wyb {
    public abstract int a();

    public abstract int b();

    public abstract long c();

    public abstract String d();

    public final boolean equals(Object obj) {
        if (!(obj instanceof wyb)) {
            return false;
        }
        return TextUtils.equals(d(), ((wyb) obj).d());
    }

    public final int hashCode() {
        String d = d();
        if (d != null) {
            return d.hashCode();
        }
        return 0;
    }
}
