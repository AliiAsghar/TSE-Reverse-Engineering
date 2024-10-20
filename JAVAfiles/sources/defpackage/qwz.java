package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.CheckActiveDesktopIsAliveAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.DeleteMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.FixupMessageStatusOnStartupAction;
import com.google.android.apps.messaging.shared.datamodel.action.MarkAsReadAction;
import com.google.android.apps.messaging.shared.datamodel.action.NoConfirmationMessageSendAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qwz implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qwz(Object obj, int i) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v60, types: [wfe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.lang.Iterable] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Integer valueOf;
        switch (this.b) {
            case 0:
                tbd tbdVar = (tbd) obj;
                alwo alwoVar = qxb.a;
                tbdVar.U(new agmf("participants.sub_id", 4, tbd.Y((int[]) this.a), true));
                return tbdVar;
            case 1:
                tkq tkqVar = (tkq) obj;
                tkqVar.U(new agmd("self_participants.sim_serial_number", 1, String.valueOf(this.a)));
                tkqVar.U(new agoi("self_participants.sub_id", 2, -1));
                return tkqVar;
            case 2:
                tkq tkqVar2 = (tkq) obj;
                alwo alwoVar2 = qxb.a;
                tkqVar2.U(new agmf("self_participants.sub_id", 4, tkq.Y((int[]) this.a), true));
                return tkqVar2;
            case 3:
                return this.a.a(obj);
            case 4:
                return ((qya) this.a).a((ParticipantsTable.BindData) obj);
            case 5:
                tph tphVar = (tph) obj;
                tphVar.b(((anlw) this.a).b);
                return tphVar;
            case 6:
                ses sesVar = (ses) obj;
                sesVar.U(new agmd("verified_sms_senders.sender_id", 1, String.valueOf(this.a)));
                return sesVar;
            case 7:
                tbd tbdVar2 = (tbd) obj;
                tbdVar2.h((String) this.a);
                return tbdVar2;
            case 8:
                trm trmVar = (trm) obj;
                if (!trmVar.d && trmVar.c != tqe.SATELLITE) {
                    CheckActiveDesktopIsAliveAsyncAction checkActiveDesktopIsAliveAsyncAction = (CheckActiveDesktopIsAliveAsyncAction) this.a;
                    if (((lpg) checkActiveDesktopIsAliveAsyncAction.f.b()).z()) {
                        return checkActiveDesktopIsAliveAsyncAction.d(trmVar.e.d.toByteArray(), trmVar.b, trmVar);
                    }
                    return checkActiveDesktopIsAliveAsyncAction.d(trmVar.a.toByteArray(), trmVar.b, trmVar);
                }
                return aktp.ag(null);
            case 9:
                syc sycVar = (syc) obj;
                Parcelable.Creator<Action<Bundle>> creator = DeleteMessageAction.CREATOR;
                sycVar.m(this.a);
                return sycVar;
            case 10:
                svp svpVar = (svp) obj;
                Parcelable.Creator<Action<Bundle>> creator2 = DeleteMessageAction.CREATOR;
                svpVar.b(this.a);
                return svpVar;
            case 11:
                syc sycVar2 = (syc) obj;
                sycVar2.f((ConversationIdType) this.a);
                sycVar2.w(2);
                sycVar2.U(new agoi("messages.mms_expiry", 7, 0L));
                return sycVar2;
            case 12:
                syc sycVar3 = (syc) obj;
                xze xzeVar = FixupMessageStatusOnStartupAction.a;
                sycVar3.P(5, 6);
                sycVar3.x(3);
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 17030) {
                    agnc.t("queue_insert_timestamp", intValue);
                }
                sycVar3.U(new agmd("messages.queue_insert_timestamp", 7, Long.valueOf(uzz.k((Instant) this.a))));
                return sycVar3;
            case 13:
                alwo alwoVar3 = rat.a;
                return this.a.a(obj);
            case 14:
                alwo alwoVar4 = rat.a;
                return this.a.a(obj);
            case 15:
                sry sryVar = (sry) obj;
                xze xzeVar2 = MarkAsReadAction.a;
                alob alobVar = new alob();
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    alobVar.h(String.valueOf(ruy.a((ConversationIdType) it.next())));
                }
                sryVar.U(new agmf("lighter_conversations_table.conversation_id", 3, sry.X(alobVar.g()), true));
                return sryVar;
            case 16:
                syc sycVar4 = (syc) obj;
                xze xzeVar3 = MarkAsReadAction.a;
                sycVar4.i((MessageIdType) this.a);
                return sycVar4;
            case 17:
                return ((msk) ((NoConfirmationMessageSendAction) this.a).a.b()).q((ParticipantsTable.BindData) obj);
            case 18:
                xpe xpeVar = (xpe) obj;
                xpeVar.b(this.a.B());
                return xpeVar;
            case 19:
                return Boolean.valueOf(this.a.k((qei) obj));
            default:
                syc sycVar5 = (syc) obj;
                sycVar5.f((ConversationIdType) this.a);
                return sycVar5;
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
