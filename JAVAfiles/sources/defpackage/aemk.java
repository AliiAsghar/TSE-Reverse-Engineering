package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aemk {
    public final String a;
    public final aevy b;
    public final boolean c;
    public final arqg d;
    private final boolean e = false;

    public aemk(String str, aevy aevyVar, boolean z, arqg arqgVar) {
        this.a = str;
        this.b = aevyVar;
        this.c = z;
        this.d = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aemk)) {
            return false;
        }
        aemk aemkVar = (aemk) obj;
        if (!d.F(this.a, aemkVar.a) || !d.F(this.b, aemkVar.b) || this.c != aemkVar.c) {
            return false;
        }
        boolean z = aemkVar.e;
        if (d.F(this.d, aemkVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a.v(this.c)) * 31) + a.v(false)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ChipUiData(text=" + this.a + ", monogram=" + this.b + ", enabled=" + this.c + ", selected=false, onCloseClick=" + this.d + ")";
    }
}
