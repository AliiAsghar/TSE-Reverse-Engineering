package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class krs implements mtg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public krs(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.mtg
    public final mtb a(MessageId messageId, ConversationId conversationId, MessagesTable.BindData bindData, mje mjeVar, mym mymVar, mzx mzxVar, nbv nbvVar, boolean z, alog alogVar, armf armfVar) {
        if (this.b != 0) {
            krg krgVar = (krg) this.a;
            apya apyaVar = krgVar.b.ac;
            Context context = (Context) krgVar.a.n.b();
            lgc lgcVar = new lgc();
            krv krvVar = ((krg) this.a).a;
            return new mtb(apyaVar, context, lgcVar, krvVar.Cp, krvVar.Cq, new ofl() { // from class: nnl
            }, messageId, conversationId, bindData, mjeVar, mymVar, mzxVar, nbvVar, z, alogVar, armfVar);
        }
        krv krvVar2 = ((kru) this.a).a;
        apya apyaVar2 = krvVar2.Co;
        Context context2 = (Context) krvVar2.n.b();
        lgc lgcVar2 = new lgc();
        krv krvVar3 = ((kru) this.a).a;
        return new mtb(apyaVar2, context2, lgcVar2, krvVar3.Cp, krvVar3.Cq, new ofl() { // from class: nnl
        }, messageId, conversationId, bindData, mjeVar, mymVar, mzxVar, nbvVar, z, alogVar, armfVar);
    }
}
