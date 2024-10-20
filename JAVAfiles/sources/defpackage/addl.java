package defpackage;

import com.google.android.rcs.client.messaging.data.GroupNotification;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class addl {
    public final GroupNotification a;

    public addl() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof addl) {
            return this.a.equals(((addl) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ReceiveGroupNotifyRequest{groupNotification=" + String.valueOf(this.a) + "}";
    }

    public addl(GroupNotification groupNotification) {
        this.a = groupNotification;
    }
}
