package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiyj {
    public final String a;
    public final int b;

    public aiyj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aiyj) {
            aiyj aiyjVar = (aiyj) obj;
            if (this.a.equals(aiyjVar.a) && this.b == aiyjVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "Body{text=" + this.a + ", charSet=" + this.b + "}";
    }

    public aiyj(String str, int i) {
        this.a = str;
        this.b = i;
    }
}
