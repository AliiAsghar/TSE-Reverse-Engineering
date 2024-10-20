package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.action.RemoveSelfNumberFromConversationsAction;
import com.google.android.apps.messaging.shared.datamodel.action.SanitizeParticipantsAction;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateConversationEncryptionStatusAction;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateRbmBotParticipantAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.execution.DeferBackgroundWorkAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rbw implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rbw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.b) {
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

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v3, types: [wfe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [agnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, arqr] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                xze xzeVar = rcr.a;
                return this.a.a(obj);
            case 1:
                return this.a.e((qei) obj);
            case 2:
                xze xzeVar2 = rcr.a;
                return this.a.a(obj);
            case 3:
                return this.a.a(obj);
            case 4:
                syc sycVar = (syc) obj;
                sycVar.U(new agmd("messages.mms_transaction_id", 1, String.valueOf(this.a)));
                return sycVar;
            case 5:
                syc sycVar2 = (syc) obj;
                xze xzeVar3 = RemoveSelfNumberFromConversationsAction.a;
                sycVar2.f((ConversationIdType) this.a);
                return sycVar2;
            case 6:
                syc sycVar3 = (syc) obj;
                sycVar3.I((Uri) this.a);
                return sycVar3;
            case 7:
                tbd tbdVar = (tbd) obj;
                Parcelable.Creator<Action<alog<ParticipantsTable.BindData>>> creator = SanitizeParticipantsAction.CREATOR;
                tbdVar.q(-2);
                tbdVar.h(((ParticipantsTable.BindData) this.a).M());
                return tbdVar;
            case 8:
                return ((lqn) this.a).k((apdj) obj);
            case 9:
                return ((ryg) this.a).e((SelfIdentityId) obj);
            case 10:
                return (mez) ((algf) this.a).fu((amed) obj);
            case 11:
                return ((aiqj) this.a).d((String) obj);
            case 12:
                return ((aiqj) this.a).b((String) obj);
            case 13:
                return ((psq) ((UpdateConversationEncryptionStatusAction) this.a).b.b()).c(((adit) ((Optional) obj).get()).a);
            case 14:
                tbd tbdVar2 = (tbd) obj;
                Parcelable.Creator<Action<Void>> creator2 = UpdateRbmBotParticipantAction.CREATOR;
                tbdVar2.l(((ParticipantsTable.BindData) this.a).O());
                return tbdVar2;
            case 15:
                Action c = ((DeferBackgroundWorkAction) this.a).a.c((Bundle) obj);
                c.getClass();
                return c;
            case 16:
                return ((rib) this.a).a((Action) obj);
            case 17:
                tbu tbuVar = (tbu) obj;
                tbuVar.f(this.a.Z());
                return tbuVar;
            case 18:
                syc sycVar4 = (syc) obj;
                sycVar4.i((MessageIdType) this.a);
                return sycVar4;
            case 19:
                return Long.valueOf(this.a.P("backup_metadata", (ContentValues) obj));
            default:
                sfy sfyVar = (sfy) obj;
                sfyVar.b(new rpf(this.a, 0), new rhr(17));
                return sfyVar;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.b) {
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
