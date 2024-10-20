package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qzu {
    public final MessageCoreData a;
    public final boolean b;
    public final boolean c;
    public final ParticipantsTable.BindData d;

    public qzu() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qzu) {
            qzu qzuVar = (qzu) obj;
            if (this.a.equals(qzuVar.a) && this.b == qzuVar.b && this.c == qzuVar.c && this.d.equals(qzuVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() ^ 1000003;
        int i2 = 1237;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i3 = ((hashCode * 1000003) ^ i) * 1000003;
        if (true == this.c) {
            i2 = 1231;
        }
        return ((i3 ^ i2) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        ParticipantsTable.BindData bindData = this.d;
        return "LaunchCriticalActionsParams{message=" + this.a.toString() + ", conference=" + this.b + ", bot=" + this.c + ", rawSender=" + bindData.toString() + "}";
    }

    public qzu(MessageCoreData messageCoreData, boolean z, boolean z2, ParticipantsTable.BindData bindData) {
        this.a = messageCoreData;
        this.b = z;
        this.c = z2;
        this.d = bindData;
    }
}
