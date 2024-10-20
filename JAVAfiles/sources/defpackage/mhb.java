package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mhb implements mhk {
    private final MessageCoreData a;
    private final String b;

    public mhb() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mhb) {
            mhb mhbVar = (mhb) obj;
            if (this.a.equals(mhbVar.a) && this.b.equals(mhbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "MessageDeliveredEvent{message=" + this.a.toString() + ", receiptRawSenderId=" + this.b + "}";
    }

    public mhb(MessageCoreData messageCoreData, String str) {
        this.a = messageCoreData;
        if (str == null) {
            throw new NullPointerException("Null receiptRawSenderId");
        }
        this.b = str;
    }
}
