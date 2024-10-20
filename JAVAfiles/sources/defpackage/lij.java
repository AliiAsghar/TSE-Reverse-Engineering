package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lij {
    public final ascv a;
    public final lhn b;
    public final ascv c;
    public final ascv d;
    public final ascv e;

    public lij(ascv ascvVar, lhn lhnVar, ascv ascvVar2, ascv ascvVar3, ascv ascvVar4) {
        ascvVar.getClass();
        ascvVar2.getClass();
        this.a = ascvVar;
        this.b = lhnVar;
        this.c = ascvVar2;
        this.d = ascvVar3;
        this.e = ascvVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lij)) {
            return false;
        }
        lij lijVar = (lij) obj;
        if (d.F(this.a, lijVar.a) && d.F(this.b, lijVar.b) && d.F(this.c, lijVar.c) && d.F(this.d, lijVar.d) && d.F(this.e, lijVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "MultiShareScreenUiData(autoCompleteTopAppBarUiData=" + this.a + ", multiShareListUiData=" + this.b + ", extendedFabUiData=" + this.c + ", destinationsDialogUiData=" + this.d + ", editMessageUiData=" + this.e + ")";
    }
}
