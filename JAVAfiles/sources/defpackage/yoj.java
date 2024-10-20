package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yoj {
    public final int a;
    public final String b;

    public yoj(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yoj)) {
            return false;
        }
        yoj yojVar = (yoj) obj;
        if (this.a == yojVar.a && d.F(this.b, yojVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (this.a * 31) + hashCode;
    }

    public final String toString() {
        return "SubIdAndSelfDestination(subId=" + this.a + ", selfNormalizedDestination=" + this.b + ")";
    }
}
