package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mhc implements mhk {
    private final MessageCoreData a;
    private final String b;

    public mhc() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mhc) {
            mhc mhcVar = (mhc) obj;
            if (this.a.equals(mhcVar.a) && this.b.equals(mhcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "MessageDisplayedEvent{message=" + this.a.toString() + ", receiptRawSenderId=" + this.b + "}";
    }

    public mhc(MessageCoreData messageCoreData, String str) {
        this.a = messageCoreData;
        if (str == null) {
            throw new NullPointerException("Null receiptRawSenderId");
        }
        this.b = str;
    }
}
