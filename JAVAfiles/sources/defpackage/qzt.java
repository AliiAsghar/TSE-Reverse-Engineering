package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.group.GroupInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qzt {
    public final MessageCoreData a;
    public final boolean b;
    public final boolean c;
    public final ParticipantsTable.BindData d;
    public final long e;
    public final GroupInfo f;
    public final int g;
    private final long h;

    public qzt() {
        throw null;
    }

    public final boolean equals(Object obj) {
        GroupInfo groupInfo;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qzt) {
            qzt qztVar = (qzt) obj;
            if (this.a.equals(qztVar.a) && this.b == qztVar.b && this.c == qztVar.c && this.d.equals(qztVar.d) && this.h == qztVar.h && this.e == qztVar.e && ((groupInfo = this.f) != null ? groupInfo.equals(qztVar.f) : qztVar.f == null) && this.g == qztVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        int i2 = 1237;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i3 = ((hashCode2 * 1000003) ^ i) * 1000003;
        if (true == this.c) {
            i2 = 1231;
        }
        int hashCode3 = ((i3 ^ i2) * 1000003) ^ this.d.hashCode();
        GroupInfo groupInfo = this.f;
        if (groupInfo == null) {
            hashCode = 0;
        } else {
            hashCode = groupInfo.hashCode();
        }
        long j = this.h;
        long j2 = this.e;
        return (((((((hashCode3 * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ hashCode) * 1000003) ^ this.g;
    }

    public final String toString() {
        GroupInfo groupInfo = this.f;
        ParticipantsTable.BindData bindData = this.d;
        return "InsertRcsFileTransferInTelephonyDbParams{message=" + this.a.toString() + ", conference=" + this.b + ", bot=" + this.c + ", rawSender=" + bindData.toString() + ", associatedSessionId=" + this.h + ", threadId=" + this.e + ", groupInfo=" + String.valueOf(groupInfo) + ", subId=" + this.g + "}";
    }

    public qzt(MessageCoreData messageCoreData, boolean z, boolean z2, ParticipantsTable.BindData bindData, long j, long j2, GroupInfo groupInfo, int i) {
        if (messageCoreData == null) {
            throw new NullPointerException("Null message");
        }
        this.a = messageCoreData;
        this.b = z;
        this.c = z2;
        if (bindData != null) {
            this.d = bindData;
            this.h = j;
            this.e = j2;
            this.f = groupInfo;
            this.g = i;
            return;
        }
        throw new NullPointerException("Null rawSender");
    }
}
