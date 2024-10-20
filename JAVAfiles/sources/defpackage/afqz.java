package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afqz implements agen {
    public final ascd a;
    public final boolean b;

    public afqz() {
        this((ascd) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afqz)) {
            return false;
        }
        afqz afqzVar = (afqz) obj;
        if (d.F(this.a, afqzVar.a) && this.b == afqzVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.v(this.b);
    }

    public final String toString() {
        return "MagicComposeConfiguration(uiState=" + this.a + ", useParentTheme=" + this.b + ")";
    }

    public afqz(ascd ascdVar, boolean z) {
        ascdVar.getClass();
        this.a = ascdVar;
        this.b = z;
    }

    public /* synthetic */ afqz(ascd ascdVar, int i) {
        this((i & 1) != 0 ? ascy.a(new afrh(null)) : ascdVar, false);
    }
}
