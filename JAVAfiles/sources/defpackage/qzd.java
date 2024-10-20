package defpackage;

import android.os.Parcelable;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.action.DeleteConversationAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qzd implements Function {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ qzd(BugleConversationId bugleConversationId, long j, MessageIdType messageIdType, int i) {
        this.d = i;
        this.c = bugleConversationId;
        this.a = j;
        this.b = messageIdType;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return Function$CC.$default$andThen(this, function);
                }
                return Function$CC.$default$andThen(this, function);
            }
            return Function$CC.$default$andThen(this, function);
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    tce tceVar = (tce) obj;
                    tceVar.f(tva.a((qei) this.c, (String) this.b));
                    tceVar.c(tqn.WAITING_PRIOR_MESSAGE, tqn.WAITING_IDENTITY_VERIFICATION);
                    tceVar.e(this.a);
                    return tceVar;
                }
                tce tceVar2 = (tce) obj;
                tceVar2.f(tva.a((qei) this.c, (String) this.b));
                tceVar2.c(tqn.WAITING_PRIOR_MESSAGE, tqn.WAITING_IDENTITY_VERIFICATION);
                tceVar2.U(new agoi("pending_incoming_message_rcs_table.sent_timestamp", 8, Long.valueOf(this.a)));
                return tceVar2;
            }
            syc sycVar = (syc) obj;
            akip.c(sycVar, (BugleConversationId) this.c);
            long j = this.a;
            sycVar.b(new ilg(j, 13), new lce(j, this.b, 6));
            return sycVar;
        }
        lcn lcnVar = (lcn) obj;
        Parcelable.Creator<Action<Void>> creator = DeleteConversationAction.CREATOR;
        lcnVar.U(new agmd("messages.conversation_id", 1, Long.valueOf(ruy.a((ConversationIdType) this.b))));
        lcnVar.U(new agoi("messages.received_timestamp", 10, Long.valueOf(this.a)));
        lcnVar.U(new agoi("message_labels.label", 1, Integer.valueOf(((SuperSortLabel) this.c).i)));
        return lcnVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return Function$CC.$default$compose(this, function);
                }
                return Function$CC.$default$compose(this, function);
            }
            return Function$CC.$default$compose(this, function);
        }
        return Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ qzd(ConversationIdType conversationIdType, long j, SuperSortLabel superSortLabel, int i) {
        this.d = i;
        this.b = conversationIdType;
        this.a = j;
        this.c = superSortLabel;
    }

    public /* synthetic */ qzd(qei qeiVar, String str, long j, int i) {
        this.d = i;
        this.c = qeiVar;
        this.b = str;
        this.a = j;
    }
}
