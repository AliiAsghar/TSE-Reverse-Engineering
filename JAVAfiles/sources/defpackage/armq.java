package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class armq implements Serializable {
    public final Object a;

    public static int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static String b(Object obj) {
        if (obj instanceof armp) {
            return obj.toString();
        }
        return a.cc(obj, "Success(", ")");
    }

    public static final Throwable c(Object obj) {
        if (obj instanceof armp) {
            return ((armp) obj).a;
        }
        return null;
    }

    public static final boolean d(Object obj) {
        if (!(obj instanceof armp)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof armq) && d.F(this.a, ((armq) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
