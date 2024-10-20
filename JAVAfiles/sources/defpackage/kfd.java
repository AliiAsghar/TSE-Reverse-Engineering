package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfd {
    public final MessageId a;
    public final kam b;
    public final mxx c;

    public kfd(MessageId messageId, mxx mxxVar, kam kamVar) {
        this.a = messageId;
        this.c = mxxVar;
        this.b = kamVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfd)) {
            return false;
        }
        kfd kfdVar = (kfd) obj;
        if (d.F(this.a, kfdVar.a) && d.F(this.c, kfdVar.c) && d.F(this.b, kfdVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "TombstoneArgs(messageId=" + this.a + ", content=" + this.c + ", messageWithMetadata=" + this.b + ")";
    }
}
