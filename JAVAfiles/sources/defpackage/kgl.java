package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kgl {
    public final jzk a;
    public final boolean b;
    private final MessageId c;

    public kgl(jzk jzkVar, MessageId messageId, boolean z) {
        this.a = jzkVar;
        this.c = messageId;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kgl)) {
            return false;
        }
        kgl kglVar = (kgl) obj;
        if (d.F(this.a, kglVar.a) && d.F(this.c, kglVar.c) && this.b == kglVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + a.v(this.b);
    }

    public final String toString() {
        return "ScheduledMessagesListItemUiData(scheduledMessage=" + this.a + ", messageId=" + this.c + ", isVisible=" + this.b + ")";
    }
}
