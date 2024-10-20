package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ClearCloudSyncMessagesAction;
import com.google.android.apps.messaging.shared.datamodel.action.ClearSessionIdsAction;
import com.google.android.apps.messaging.shared.datamodel.action.DeleteMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.FixupMessageStatusOnStartupAction;
import com.google.android.apps.messaging.shared.datamodel.action.MarkAsReadAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qza implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ qza(int i) {
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
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Object obj2;
        Object e;
        String o;
        Object e2;
        switch (this.a) {
            case 0:
                snh snhVar = (snh) obj;
                Parcelable.Creator<Action<Void>> creator = ClearSessionIdsAction.CREATOR;
                snhVar.e(2);
                return snhVar;
            case 1:
                snh snhVar2 = (snh) obj;
                snhVar2.k(new agpl(ClearCloudSyncMessagesAction.a));
                return snhVar2;
            case 2:
                obj2 = ((sxo) obj).a;
                return obj2;
            case 3:
                return ((ghw) obj).a;
            case 4:
                Parcelable.Creator<Action<Bundle>> creator2 = DeleteMessageAction.CREATOR;
                return ((sxo) obj).R;
            case 5:
                return rvc.b((String) obj);
            case 6:
                return Integer.valueOf(((nfw) obj).b());
            case 7:
                syc sycVar = (syc) obj;
                xze xzeVar = FixupMessageStatusOnStartupAction.a;
                sycVar.P(105, 103);
                return sycVar;
            case 8:
                return ((nfw) obj).f();
            case 9:
                e = ((msh) obj).e();
                return e;
            case 10:
                return lqn.n((msh) obj);
            case 11:
                xze xzeVar2 = MarkAsReadAction.a;
                return ((ConversationIdType) obj).a();
            case 12:
                xze xzeVar3 = MarkAsReadAction.a;
                return ((sxo) obj).i;
            case 13:
                xze xzeVar4 = MarkAsReadAction.a;
                return ((sxo) obj).a;
            case 14:
                xze xzeVar5 = MarkAsReadAction.a;
                return ((MessageIdType) obj).a();
            case 15:
                xze xzeVar6 = MarkAsReadAction.a;
                return ((ConversationIdType) obj).a();
            case 16:
                o = ((msh) obj).o(((Boolean) msw.d.e()).booleanValue());
                return o;
            case 17:
                e2 = ((msh) obj).e();
                return e2;
            default:
                return ((rto) obj).L();
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
            default:
                return Function$CC.$default$compose(this, function);
        }
    }
}
