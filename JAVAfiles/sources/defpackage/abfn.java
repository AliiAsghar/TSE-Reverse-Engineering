package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abfn {
    public final int a;
    public final int b;

    public abfn(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abfn)) {
            return false;
        }
        abfn abfnVar = (abfn) obj;
        if (this.a == abfnVar.a && this.b == abfnVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "PromoItemResources(icon_res_id=" + this.a + ", text_res_id=" + this.b + ")";
    }
}
