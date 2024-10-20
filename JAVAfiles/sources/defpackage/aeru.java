package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeru {
    public final Integer a;
    public final Integer b;

    public aeru(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeru)) {
            return false;
        }
        aeru aeruVar = (aeru) obj;
        if (d.F(this.a, aeruVar.a) && d.F(this.b, aeruVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.a;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        Integer num2 = this.b;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ")";
    }
}
