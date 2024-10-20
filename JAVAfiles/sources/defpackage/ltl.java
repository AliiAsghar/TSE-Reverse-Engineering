package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ltl implements lth {
    public final MessageIdType a;

    public ltl(MessageIdType messageIdType, MessagesTable.BindData bindData, ParticipantsTable.BindData bindData2, List list, ssi ssiVar) {
        apds.b(bindData.t()).getClass();
        new ltk(bindData2);
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                alwl alwlVar = (alwl) lti.a.i();
                alvz alvzVar = ltp.a;
                alwlVar.X(ltp.a, messageIdType.toString());
                int size = list.size();
                ArrayList arrayList = new ArrayList(aqjn.J(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PartsTable.BindData) it.next()).x());
                }
                alwlVar.w("[PresentRepliedToMessage] Replied-to message has %d parts with content types: %s", size, arrayList);
            }
            new ltj((PartsTable.BindData) list.get(0));
            if (ssiVar != null) {
                new ltg(ssiVar);
            }
            this.a = messageIdType;
            return;
        }
        throw new IllegalArgumentException("[PresentRepliedToMessage] partsData is empty");
    }
}
