package defpackage;

import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveP2pSuggestionsAction;
import com.google.android.apps.messaging.shared.datamodel.action.RemoveSelfNumberFromConversationsAction;
import com.google.android.apps.messaging.shared.datamodel.action.SendMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.SetupExpressiveStickersAction;
import com.google.android.apps.messaging.shared.datamodel.action.SyncTelephonyThreadsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rbs implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ rbs(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.a) {
            case 0:
                return Function$CC.$default$andThen(this, function);
            case 1:
                return Function$CC.$default$andThen(this, function);
            case 2:
                return Function$CC.$default$andThen(this, function);
            case 3:
                return Function$CC.$default$andThen(this, function);
            case 4:
                return Function$CC.$default$andThen(this, function);
            case 5:
                return Function$CC.$default$andThen(this, function);
            case 6:
                return Function$CC.$default$andThen(this, function);
            case 7:
                return Function$CC.$default$andThen(this, function);
            case 8:
                return Function$CC.$default$andThen(this, function);
            case 9:
                return Function$CC.$default$andThen(this, function);
            case 10:
                return Function$CC.$default$andThen(this, function);
            case 11:
                return Function$CC.$default$andThen(this, function);
            case 12:
                return Function$CC.$default$andThen(this, function);
            case 13:
                return Function$CC.$default$andThen(this, function);
            case 14:
                return Function$CC.$default$andThen(this, function);
            case 15:
                return Function$CC.$default$andThen(this, function);
            case 16:
                return Function$CC.$default$andThen(this, function);
            case 17:
                return Function$CC.$default$andThen(this, function);
            case 18:
                return Function$CC.$default$andThen(this, function);
            case 19:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((adit) obj).a;
            case 1:
                return new BugleConversationId((ConversationIdType) obj);
            case 2:
                return Boolean.valueOf(((MessagesTable.BindData) obj).T());
            case 3:
                return riw.g((Parcelable) obj);
            case 4:
                return riw.g((Parcelable) obj);
            case 5:
                Parcelable.Creator<Action<Void>> creator = ReceiveP2pSuggestionsAction.CREATOR;
                return (aqcz) ((apdj) ((Parcelable) obj)).a(aqcz.a, aozs.a());
            case 6:
                return riw.g((Parcelable) obj);
            case 7:
                return riw.g((Parcelable) obj);
            case 8:
                return ((smr) obj).x();
            case 9:
                return new rer((smr) obj, false);
            case 10:
                return ((rer) obj).a;
            case 11:
                return Boolean.valueOf(((msh) obj).A());
            case 12:
                snh snhVar = (snh) obj;
                xze xzeVar = RemoveSelfNumberFromConversationsAction.a;
                snhVar.e(1);
                return snhVar;
            case 13:
                Parcelable.Creator<Action<Void>> creator2 = SendMessageAction.CREATOR;
                return albo.ag(((msh) obj).j(((Boolean) new mst(4).get()).booleanValue()));
            case 14:
                return ((nfw) obj).f();
            case 15:
                return Integer.valueOf(((qwm) obj).e());
            case 16:
                xze xzeVar2 = SetupExpressiveStickersAction.a;
                return (aouy) ((aova) obj).h.get(0);
            case 17:
                snh snhVar2 = (snh) obj;
                snhVar2.c(tqc.UNARCHIVED);
                return snhVar2;
            case 18:
                smu smuVar = (smu) obj;
                return new smv[]{smuVar.a, smuVar.c, smuVar.E, smuVar.G, smuVar.F};
            case 19:
                snh snhVar3 = (snh) obj;
                snhVar3.U(new agmd("conversations.sms_thread_id", 7, Long.valueOf(yyb.cE(new xhv(0L)))));
                return snhVar3;
            default:
                smu smuVar2 = (smu) obj;
                xze xzeVar3 = SyncTelephonyThreadsAction.a;
                return new smv[]{smuVar2.a, smuVar2.b, smuVar2.M, smuVar2.O, smuVar2.ah, smuVar2.aa};
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            case 0:
                return Function$CC.$default$compose(this, function);
            case 1:
                return Function$CC.$default$compose(this, function);
            case 2:
                return Function$CC.$default$compose(this, function);
            case 3:
                return Function$CC.$default$compose(this, function);
            case 4:
                return Function$CC.$default$compose(this, function);
            case 5:
                return Function$CC.$default$compose(this, function);
            case 6:
                return Function$CC.$default$compose(this, function);
            case 7:
                return Function$CC.$default$compose(this, function);
            case 8:
                return Function$CC.$default$compose(this, function);
            case 9:
                return Function$CC.$default$compose(this, function);
            case 10:
                return Function$CC.$default$compose(this, function);
            case 11:
                return Function$CC.$default$compose(this, function);
            case 12:
                return Function$CC.$default$compose(this, function);
            case 13:
                return Function$CC.$default$compose(this, function);
            case 14:
                return Function$CC.$default$compose(this, function);
            case 15:
                return Function$CC.$default$compose(this, function);
            case 16:
                return Function$CC.$default$compose(this, function);
            case 17:
                return Function$CC.$default$compose(this, function);
            case 18:
                return Function$CC.$default$compose(this, function);
            case 19:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }
}
