package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class znx {
    public final arqg a;
    public final arqg b;

    public znx(arqg arqgVar, arqg arqgVar2) {
        this.a = arqgVar;
        this.b = arqgVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof znx)) {
            return false;
        }
        znx znxVar = (znx) obj;
        if (d.F(this.a, znxVar.a) && d.F(this.b, znxVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "TurnOffRcsScreenUiData(onPositiveClick=" + this.a + ", onNegativeClick=" + this.b + ")";
    }

    public znx() {
        this(yyo.j, yyo.k);
    }
}
