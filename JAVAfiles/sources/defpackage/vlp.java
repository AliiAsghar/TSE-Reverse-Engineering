package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vlp {
    public final dyu a;
    public final vlm b;
    public final boolean c;
    public final Optional d;

    public vlp() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vlp) {
            vlp vlpVar = (vlp) obj;
            if (this.a.equals(vlpVar.a) && this.b.equals(vlpVar.b) && this.c == vlpVar.c && this.d.equals(vlpVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        if (true != this.c) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((hashCode * 1000003) ^ i) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Optional optional = this.d;
        vlm vlmVar = this.b;
        return "NotifyInfo{notificationBuilder=" + this.a.toString() + ", notificationType=" + vlmVar.toString() + ", isSummary=" + this.c + ", notificationTag=" + optional.toString() + "}";
    }

    public vlp(dyu dyuVar, vlm vlmVar, boolean z, Optional optional) {
        if (dyuVar == null) {
            throw new NullPointerException("Null notificationBuilder");
        }
        this.a = dyuVar;
        if (vlmVar != null) {
            this.b = vlmVar;
            this.c = z;
            if (optional != null) {
                this.d = optional;
                return;
            }
            throw new NullPointerException("Null notificationTag");
        }
        throw new NullPointerException("Null notificationType");
    }
}
