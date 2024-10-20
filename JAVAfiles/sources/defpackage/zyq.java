package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zyq {
    public final String a;
    public final int b;

    public zyq(int i, String str) {
        this.b = i;
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zyq)) {
            return false;
        }
        zyq zyqVar = (zyq) obj;
        if (this.b == zyqVar.b && d.F(this.a, zyqVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.b;
        a.bm(i);
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (i * 31) + hashCode;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("E2eeStatusUiData(e2eeStatus=");
        if (this.b != 1) {
            str = "OFF";
        } else {
            str = "ON";
        }
        sb.append((Object) str);
        sb.append(", e2eeMessage=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
