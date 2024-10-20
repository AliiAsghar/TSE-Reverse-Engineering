package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yzv implements yzx {
    public final String a;

    public yzv(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof yzv) && d.F(this.a, ((yzv) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Header(value=" + this.a + ")";
    }
}
