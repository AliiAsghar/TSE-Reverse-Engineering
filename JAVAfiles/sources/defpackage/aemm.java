package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aemm {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final arqg d;

    public aemm() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aemm)) {
            return false;
        }
        aemm aemmVar = (aemm) obj;
        if (this.a == aemmVar.a && this.b == aemmVar.b && this.c == aemmVar.c && d.F(this.d, aemmVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int v = a.v(this.a);
        arqg arqgVar = this.d;
        return (((((v * 31) + a.v(this.b)) * 31) + a.v(this.c)) * 31) + arqgVar.hashCode();
    }

    public final String toString() {
        return "AiInputUiData(showAiButton=" + this.a + ", isAiSuggestEnabled=" + this.b + ", hideAiButtonWhenRewriteDisabled=" + this.c + ", onShowAiButton=" + this.d + ")";
    }

    public aemm(boolean z, boolean z2, boolean z3, arqg arqgVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = arqgVar;
    }

    public /* synthetic */ aemm(byte[] bArr) {
        this(false, true, false, accd.o);
    }
}
