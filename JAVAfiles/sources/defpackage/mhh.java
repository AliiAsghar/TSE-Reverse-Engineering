package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mhh implements mhk {
    private final MessageCoreData a;

    public mhh() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mhh) {
            return this.a.equals(((mhh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "MessageSentEvent{message=" + this.a.toString() + "}";
    }

    public mhh(MessageCoreData messageCoreData) {
        if (messageCoreData == null) {
            throw new NullPointerException("Null message");
        }
        this.a = messageCoreData;
    }
}
