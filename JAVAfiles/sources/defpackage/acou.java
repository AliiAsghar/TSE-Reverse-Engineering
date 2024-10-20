package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acou {
    public final int a;
    private final String b;

    public acou() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acou) {
            acou acouVar = (acou) obj;
            if (this.a == acouVar.a && this.b.equals(acouVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "DisconnectionReason{cause=" + this.a + ", text=" + this.b + "}";
    }

    public acou(int i, String str) {
        this.a = i;
        if (str == null) {
            throw new NullPointerException("Null text");
        }
        this.b = str;
    }
}
