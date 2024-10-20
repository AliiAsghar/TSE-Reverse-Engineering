package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bol {
    public final long a;
    private final bin b = null;

    public bol(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bol)) {
            return false;
        }
        bol bolVar = (bol) obj;
        if (!a.bB(this.a, bolVar.a)) {
            return false;
        }
        bin binVar = bolVar.b;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.A(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) cku.g(this.a)) + ", rippleAlpha=null)";
    }
}
