package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lti {
    public static final alwo a = alwo.o("BugleReplies");

    public static final lth a(sdj sdjVar) {
        ssi ssiVar;
        sdjVar.getClass();
        if (!sdjVar.f().b()) {
            if (!sdjVar.d.A().b()) {
                MessageIdType A = sdjVar.d.A();
                A.getClass();
                MessagesTable.BindData bindData = sdjVar.d;
                bindData.getClass();
                ParticipantsTable.BindData bindData2 = sdjVar.k;
                bindData2.getClass();
                PartsTable.BindData[] bindDataArr = sdjVar.s;
                bindDataArr.getClass();
                List p = aqil.p(bindDataArr);
                if (sdjVar.y.q() != null) {
                    ssiVar = sdjVar.y;
                } else {
                    ssiVar = null;
                }
                return new ltl(A, bindData, bindData2, p, ssiVar);
            }
            return ltf.a;
        }
        throw new IllegalArgumentException("toRepliesQueryResult invoked on MessageRepliesView with empty messageId");
    }
}
