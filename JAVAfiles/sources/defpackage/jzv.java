package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzv {
    public final boolean a;
    public final arqg b;
    private final boolean c;

    public jzv(boolean z, arqg arqgVar) {
        this.c = true;
        this.a = z;
        this.b = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzv)) {
            return false;
        }
        jzv jzvVar = (jzv) obj;
        boolean z = jzvVar.c;
        if (this.a == jzvVar.a && d.F(this.b, jzvVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((a.v(true) * 31) + a.v(this.a)) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AnimateParameters(includeMetatextPadding=true, isGroupedWithMessage=" + this.a + ", onAnimationFinished=" + this.b + ")";
    }

    public jzv() {
        this(false, jlc.u);
    }
}
