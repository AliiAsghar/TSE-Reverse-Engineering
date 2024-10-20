package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class absw {
    private final Object a;
    private final String b;

    public absw(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final String a() {
        return this.b + "@" + System.identityHashCode(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof absw)) {
            return false;
        }
        absw abswVar = (absw) obj;
        if (this.a == abswVar.a && this.b.equals(abswVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
    }
}
