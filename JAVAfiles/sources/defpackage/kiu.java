package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kiu implements aemc {
    public final arqg a;
    public final arqg b;

    public kiu(arqg arqgVar, arqg arqgVar2) {
        this.a = arqgVar;
        this.b = arqgVar2;
    }

    @Override // defpackage.aemc
    public final aemc a(arqg arqgVar) {
        return new kiu(arqgVar, this.b);
    }

    @Override // defpackage.aemc
    public final arqg b() {
        return this.a;
    }

    @Override // defpackage.aemc
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kiu)) {
            return false;
        }
        kiu kiuVar = (kiu) obj;
        if (d.F(this.a, kiuVar.a) && d.F(this.b, kiuVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DuoKitStartSetupQuestionUiData(onDismiss=" + this.a + ", onStartSetup=" + this.b + ")";
    }
}
