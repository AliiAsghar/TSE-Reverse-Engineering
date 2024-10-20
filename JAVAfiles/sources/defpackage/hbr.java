package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbr {
    public final Object a;
    public final Throwable b;

    public hbr(Object obj) {
        this.a = obj;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbr)) {
            return false;
        }
        hbr hbrVar = (hbr) obj;
        Object obj2 = this.a;
        if (obj2 != null && obj2.equals(hbrVar.a)) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || hbrVar.b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public hbr(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
