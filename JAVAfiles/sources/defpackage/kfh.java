package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfh {
    public final MessageId a;
    public final mxy b;

    public kfh(MessageId messageId, mxy mxyVar) {
        this.a = messageId;
        this.b = mxyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfh)) {
            return false;
        }
        kfh kfhVar = (kfh) obj;
        if (d.F(this.a, kfhVar.a) && d.F(this.b, kfhVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ToolstoneArgs(messageId=" + this.a + ", content=" + this.b + ")";
    }
}
