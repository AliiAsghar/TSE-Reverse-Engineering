package defpackage;

import android.telephony.gba.UaSecurityProtocolIdentifier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adws {
    public final UaSecurityProtocolIdentifier a;

    public adws() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adws) {
            return this.a.equals(((adws) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "UaSecurityProtocolIdentifierWrapper{identifier=" + this.a.toString() + "}";
    }

    public adws(UaSecurityProtocolIdentifier uaSecurityProtocolIdentifier) {
        if (uaSecurityProtocolIdentifier == null) {
            throw new NullPointerException("Null identifier");
        }
        this.a = uaSecurityProtocolIdentifier;
    }
}
