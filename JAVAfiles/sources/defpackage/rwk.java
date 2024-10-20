package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rwk {
    public final tqk a;
    public final String b;

    public rwk() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rwk) {
            rwk rwkVar = (rwk) obj;
            if (this.a.equals(rwkVar.a) && this.b.equals(rwkVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "MessageDestinationRowInfo{recipientType=" + this.a.toString() + ", recipientValue=" + this.b + "}";
    }

    public rwk(tqk tqkVar, String str) {
        if (tqkVar == null) {
            throw new NullPointerException("Null recipientType");
        }
        this.a = tqkVar;
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null recipientValue");
    }
}
