package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeqj {
    public final String a;
    public final boolean b;
    public final aerb c;
    public final arqg d;

    public /* synthetic */ aeqj(String str, boolean z, aerb aerbVar, arqg arqgVar, int i) {
        boolean z2;
        this.a = str;
        if ((i & 2) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.b = (!z2) | z;
        this.c = (i & 4) != 0 ? null : aerbVar;
        this.d = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeqj)) {
            return false;
        }
        aeqj aeqjVar = (aeqj) obj;
        if (d.F(this.a, aeqjVar.a) && this.b == aeqjVar.b && this.c == aeqjVar.c && d.F(this.d, aeqjVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        aerb aerbVar = this.c;
        if (aerbVar == null) {
            hashCode = 0;
        } else {
            hashCode = aerbVar.hashCode();
        }
        return ((((hashCode2 + a.v(this.b)) * 31) + hashCode) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ExtendedFabUiData(text=" + this.a + ", enabled=" + this.b + ", icon=" + this.c + ", onClick=" + this.d + ")";
    }
}
