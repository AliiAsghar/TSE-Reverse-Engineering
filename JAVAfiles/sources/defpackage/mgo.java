package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mgo {
    public final MessageCoreData a;
    public final amlg b;

    public mgo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mgo) {
            mgo mgoVar = (mgo) obj;
            if (this.a.equals(mgoVar.a) && this.b.equals(mgoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        amlg amlgVar = this.b;
        return "MessageNotDeliveredParameters{messageSnapshot=" + String.valueOf(this.a) + ", outgoingMessageFailureReason=" + String.valueOf(amlgVar) + "}";
    }

    public mgo(MessageCoreData messageCoreData, amlg amlgVar) {
        this.a = messageCoreData;
        this.b = amlgVar;
    }
}
