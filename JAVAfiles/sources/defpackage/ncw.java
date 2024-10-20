package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ncw {
    public final MessageIdType a;
    public final int b;

    public ncw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ncw) {
            ncw ncwVar = (ncw) obj;
            if (this.a.equals(ncwVar.a) && this.b == ncwVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        int i = this.b;
        a.bm(i);
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        int M = a.M(this.b);
        return "InitiationResult{messageId=" + this.a.toString() + ", fallbackResult=" + Integer.toString(M) + "}";
    }

    public ncw(MessageIdType messageIdType, int i) {
        if (messageIdType == null) {
            throw new NullPointerException("Null messageId");
        }
        this.a = messageIdType;
        this.b = i;
    }
}
