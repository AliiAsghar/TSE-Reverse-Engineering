package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zvo {
    public final rsa a;
    public final boolean b;
    public final sxx c;

    public zvo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zvo) {
            zvo zvoVar = (zvo) obj;
            if (this.a.equals(zvoVar.a) && this.b == zvoVar.b && this.c.equals(zvoVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() ^ 1000003;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((hashCode * 1000003) ^ i) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        sxx sxxVar = this.c;
        return "PremiumSmsLoadedData{conversationParticipantData=" + this.a.toString() + ", bannerEligible=" + this.b + ", messagesTableQuery=" + sxxVar.toString() + "}";
    }

    public zvo(rsa rsaVar, boolean z, sxx sxxVar) {
        if (rsaVar == null) {
            throw new NullPointerException("Null conversationParticipantData");
        }
        this.a = rsaVar;
        this.b = z;
        if (sxxVar != null) {
            this.c = sxxVar;
            return;
        }
        throw new NullPointerException("Null messagesTableQuery");
    }
}
