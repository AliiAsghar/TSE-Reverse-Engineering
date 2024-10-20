package defpackage;

import com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ime {
    public final MessageCoreData a;
    public final rto b;
    public final RepliedToDataAdapter c;
    public final int d;

    public ime() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ime) {
            ime imeVar = (ime) obj;
            if (this.a.equals(imeVar.a) && this.b.equals(imeVar.b)) {
                int i = this.d;
                int i2 = imeVar.d;
                if (i != 0) {
                    if (i == i2) {
                        RepliedToDataAdapter repliedToDataAdapter = this.c;
                        RepliedToDataAdapter repliedToDataAdapter2 = imeVar.c;
                        if (repliedToDataAdapter != null ? repliedToDataAdapter.equals(repliedToDataAdapter2) : repliedToDataAdapter2 == null) {
                            return true;
                        }
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i = this.d;
        a.aS(i);
        RepliedToDataAdapter repliedToDataAdapter = this.c;
        if (repliedToDataAdapter == null) {
            hashCode = 0;
        } else {
            hashCode = repliedToDataAdapter.hashCode();
        }
        return (((hashCode2 * 1000003) ^ i) * 1000003) ^ hashCode;
    }

    public final String toString() {
        RepliedToDataAdapter repliedToDataAdapter = this.c;
        rto rtoVar = this.b;
        return "DraftData{message=" + String.valueOf(this.a) + ", conversation=" + String.valueOf(rtoVar) + ", source=" + hwr.n(this.d) + ", repliedToDataAdapter=" + String.valueOf(repliedToDataAdapter) + "}";
    }

    public ime(MessageCoreData messageCoreData, rto rtoVar, int i, RepliedToDataAdapter repliedToDataAdapter) {
        this.a = messageCoreData;
        this.b = rtoVar;
        this.d = i;
        this.c = repliedToDataAdapter;
    }
}
