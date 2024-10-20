package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjo {
    public final String a;
    public final aerb b;
    public final boolean c;
    public final boolean d;
    public final arqg e;

    public kjo(String str, aerb aerbVar, boolean z, boolean z2, arqg arqgVar) {
        arqgVar.getClass();
        this.a = str;
        this.b = aerbVar;
        this.c = z;
        this.d = z2;
        this.e = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjo)) {
            return false;
        }
        kjo kjoVar = (kjo) obj;
        if (d.F(this.a, kjoVar.a) && this.b == kjoVar.b && this.c == kjoVar.c && this.d == kjoVar.d && d.F(this.e, kjoVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        aerb aerbVar = this.b;
        if (aerbVar == null) {
            hashCode = 0;
        } else {
            hashCode = aerbVar.hashCode();
        }
        return ((((((hashCode2 + hashCode) * 31) + a.v(this.c)) * 31) + a.v(this.d)) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "BackBehaviorUiData(title=" + this.a + ", icon=" + this.b + ", overrideSystemBack=" + this.c + ", canExecute=" + this.d + ", execute=" + this.e + ")";
    }

    public /* synthetic */ kjo(String str, aerb aerbVar, arqg arqgVar) {
        this(str, aerbVar, true, true, arqgVar);
    }
}
