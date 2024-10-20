package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mzh {
    public final MessageId a;
    public final nbg b;
    public final nbh c;

    public mzh(MessageId messageId, nbg nbgVar, nbh nbhVar) {
        nbhVar.getClass();
        this.a = messageId;
        this.b = nbgVar;
        this.c = nbhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzh)) {
            return false;
        }
        mzh mzhVar = (mzh) obj;
        if (d.F(this.a, mzhVar.a) && d.F(this.b, mzhVar.b) && this.c == mzhVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ReactionEnvelopeInfo(reactedMessageId=" + this.a + ", reaction=" + this.b + ", reactionAction=" + this.c + ")";
    }
}
