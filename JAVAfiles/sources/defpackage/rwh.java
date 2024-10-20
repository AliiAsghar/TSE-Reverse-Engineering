package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rwh {
    public final tqs a;
    public final alor b;

    public rwh() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rwh) {
            rwh rwhVar = (rwh) obj;
            if (this.a.equals(rwhVar.a) && alzz.am(this.b, rwhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        alor alorVar = this.b;
        return "MessageSendReceiveAttempt{transportProtocol=" + this.a.toString() + ", regionCodes=" + String.valueOf(alorVar) + "}";
    }

    public rwh(tqs tqsVar, alor alorVar) {
        this.a = tqsVar;
        this.b = alorVar;
    }
}
