package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xsq {
    public final MessageCoreData a;
    public final xrz b;

    public xsq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xsq) {
            xsq xsqVar = (xsq) obj;
            if (this.a.equals(xsqVar.a) && this.b.equals(xsqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        xrz xrzVar = this.b;
        return "SendFileTransferRequest{messageCoreData=" + String.valueOf(this.a) + ", fileUploadInfo=" + String.valueOf(xrzVar) + "}";
    }

    public xsq(MessageCoreData messageCoreData, xrz xrzVar) {
        this.a = messageCoreData;
        this.b = xrzVar;
    }
}
