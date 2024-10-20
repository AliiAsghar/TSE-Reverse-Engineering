package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adcc {
    public final Optional a;
    public final Optional b;

    public adcc() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adcc) {
            adcc adccVar = (adcc) obj;
            if (this.a.equals(adccVar.a) && this.b.equals(adccVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        Optional optional = this.b;
        return "ReceiveMessageRequest{message=" + String.valueOf(this.a) + ", session=" + String.valueOf(optional) + "}";
    }

    public adcc(Optional optional, Optional optional2) {
        this.a = optional;
        this.b = optional2;
    }
}
