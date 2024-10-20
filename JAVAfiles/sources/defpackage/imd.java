package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imd {
    public final MessagesTable.BindData a;
    public final lth b;
    public final MessageIdType c;

    public imd(MessagesTable.BindData bindData, lth lthVar) {
        MessageIdType messageIdType;
        this.a = bindData;
        this.b = lthVar;
        if (lthVar instanceof ltl) {
            messageIdType = ((ltl) lthVar).a;
        } else {
            messageIdType = rvc.a;
        }
        this.c = messageIdType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imd)) {
            return false;
        }
        imd imdVar = (imd) obj;
        if (d.F(this.a, imdVar.a) && d.F(this.b, imdVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        lth lthVar = this.b;
        if (lthVar == null) {
            hashCode = 0;
        } else {
            hashCode = lthVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "DraftQueryResult(messagesTableData=" + this.a + ", messageRepliesQueryResult=" + this.b + ")";
    }
}
