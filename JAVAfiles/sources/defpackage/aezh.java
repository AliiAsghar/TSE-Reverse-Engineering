package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aezh {
    public final int a;
    public final int b;
    public final arqg c;
    public final arqg d;

    public aezh(int i, int i2, arqg arqgVar, arqg arqgVar2) {
        this.a = i;
        this.b = i2;
        this.c = arqgVar;
        this.d = arqgVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aezh)) {
            return false;
        }
        aezh aezhVar = (aezh) obj;
        if (this.a == aezhVar.a && this.b == aezhVar.b && d.F(this.c, aezhVar.c) && d.F(this.d, aezhVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "TextResultsBarUiData(resultCount=" + this.a + ", currentResult=" + this.b + ", onPreviousClick=" + this.c + ", onNextClick=" + this.d + ")";
    }
}
