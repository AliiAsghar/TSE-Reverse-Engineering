package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mhi implements mhk {
    private final MessageCoreData a;
    private final int b;
    private final int c;
    private final int d;

    public mhi() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mhi) {
            mhi mhiVar = (mhi) obj;
            if (this.a.equals(mhiVar.a) && this.b == mhiVar.b && this.c == mhiVar.c && this.d == mhiVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        return "MessageSentFailureEvent{message=" + this.a.toString() + ", resultCode=" + this.b + ", httpStatusCode=" + this.c + ", errorCode=" + this.d + "}";
    }

    public mhi(MessageCoreData messageCoreData, int i, int i2, int i3) {
        if (messageCoreData == null) {
            throw new NullPointerException("Null message");
        }
        this.a = messageCoreData;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}
