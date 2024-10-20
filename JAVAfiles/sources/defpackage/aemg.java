package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aemg {
    public final String a;
    public final arqg b;
    private final aerb c = null;

    public aemg(String str, arqg arqgVar) {
        this.a = str;
        this.b = arqgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aemg)) {
            return false;
        }
        aemg aemgVar = (aemg) obj;
        if (!d.F(this.a, aemgVar.a)) {
            return false;
        }
        aerb aerbVar = aemgVar.c;
        if (d.F(this.b, aemgVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 961) + this.b.hashCode();
    }

    public final String toString() {
        return "CardstoneButtonUiData(text=" + this.a + ", icon=null, onClick=" + this.b + ")";
    }
}
