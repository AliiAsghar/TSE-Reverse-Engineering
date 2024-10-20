package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aefg extends adcx {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public aefg(int i, int i2, int i3, int i4) {
        super(null, null);
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aefg)) {
            return false;
        }
        aefg aefgVar = (aefg) obj;
        if (this.a == aefgVar.a && this.b == aefgVar.b && this.c == aefgVar.c && this.d == aefgVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }
}
