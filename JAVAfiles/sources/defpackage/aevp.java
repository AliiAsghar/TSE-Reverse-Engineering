package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aevp {
    public final String a;

    public aevp(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aevp) && d.F(this.a, ((aevp) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Text(text=" + this.a + ")";
    }
}
