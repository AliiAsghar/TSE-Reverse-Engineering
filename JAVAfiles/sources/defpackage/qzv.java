package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qzv {
    public final MessageCoreData a;
    private final boolean b;
    private final boolean c;
    private final ParticipantsTable.BindData d;

    public qzv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qzv) {
            qzv qzvVar = (qzv) obj;
            if (this.a.equals(qzvVar.a) && this.b == qzvVar.b && this.c == qzvVar.c && this.d.equals(qzvVar.d)) {
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
        return "LaunchNonCriticalActionsParams{message=" + this.a.toString() + ", conference=" + this.b + ", bot=" + this.c + ", rawSender=" + bindData.toString() + "}";
    }

    public qzv(MessageCoreData messageCoreData, boolean z, boolean z2, ParticipantsTable.BindData bindData) {
        this.a = messageCoreData;
        this.b = z;
        this.c = z2;
        this.d = bindData;
    }
}
