package defpackage;

import androidx.work.WorkerParameters;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.android.rcs.client.messaging.RevokeMessageRequest;
import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;
import com.google.android.rcs.client.messaging.data.BasicTextMessage;
import io.grpc.Status;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vze implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ vze(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v107, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v123, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [algk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v72, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v91, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [wnp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v48, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v56, types: [java.lang.Object, apbt] */
    /* JADX WARN: Type inference failed for: r1v63, types: [java.lang.Object, apbt] */
    /* JADX WARN: Type inference failed for: r1v70, types: [java.lang.Object, apbt] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, apbt] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte[] bArr = null;
        switch (this.c) {
            case 0:
                return ((vzd) this.a).a.revokeMessage((RevokeMessageRequest) this.b);
            case 1:
                return ((vzd) this.a).a.removeUserFromGroup((RemoveUserFromGroupRequest) this.b);
            case 2:
                return ((vzf) this.a).a.sendMessage((SendMessageRequest) this.b);
            case 3:
                return ((vzd) this.a).a.triggerGroupNotification((TriggerGroupNotificationRequest) this.b);
            case 4:
                return ((vzd) this.a).a.updateGroup((UpdateGroupRequest) this.b);
            case 5:
                return Boolean.valueOf(!((rtz) ((wba) this.b).i.b()).ad(((qfo) this.a).h));
            case 6:
                return Boolean.valueOf(new adjl(((vrn) ((wgd) this.a).d.a()).w(new adiw((String) this.b))).a.equals(amwt.CARRIER_SETUP_PENDING));
            case 7:
                WorkerParameters workerParameters = (WorkerParameters) this.a;
                return ((wjp) this.b).c(workerParameters.b.h("force_disable_then_reprovision"), albo.ag(workerParameters.b.d("sim_id")));
            case 8:
                return ((wjq) this.a).c((String) this.b);
            case 9:
                return Boolean.valueOf(this.a.f(this.b));
            case 10:
                return ((wue) this.a).e.refreshCapabilities((String) this.b);
            case 11:
                Object obj = this.a;
                wva wvaVar = (wva) obj;
                ((agnq) wvaVar.b.b()).e("moveDataFromSync", new wnc(obj, this.b, 5, bArr));
                return wvaVar.s();
            case 12:
                return ((wva) this.a).r(this.b);
            case 13:
                String at = this.a.at();
                at.getClass();
                aodz aodzVar = new aodz((char[]) null);
                aodzVar.o(at);
                BasicTextMessage n = aodzVar.n();
                Object obj2 = this.b;
                try {
                    return (qej) ((wzc) obj2).m.fu(((wzc) obj2).l.b(BasicTextMessage.class).b(n));
                } catch (ajsh e) {
                    throw new wyz(e);
                }
            case 14:
                ((xac) this.a).k((amvm) this.b);
                return arnb.a;
            case 15:
                aluq listIterator = ((alor) this.b).entrySet().listIterator();
                while (listIterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) listIterator.next();
                    if (((Boolean) albo.bQ((Future) entry.getValue())).booleanValue()) {
                        return ((xdn) this.a).d.f((qei) entry.getKey());
                    }
                }
                anit anitVar = anit.a;
                aqwb aqwbVar = new aqwb(Status.d);
                Status status = aqwbVar.a;
                status.getClass();
                throw new ankx("No registered Tachygram transport", anitVar, aqwbVar, status);
            case 16:
                return ((xds) this.b).d(this.a);
            case 17:
                xfc xfcVar = (xfc) this.b;
                wfh wfhVar = (wfh) xfcVar.d.b();
                ?? r4 = this.a;
                qgb qgbVar = (qgb) r4;
                qei qeiVar = qgbVar.c;
                if (qeiVar == null) {
                    qeiVar = qei.a;
                }
                ((uof) wfhVar.a.b()).a(upk.b("tachygram_revoke_message", r4, new uta(xfcVar.j(qeiVar, qgbVar.e), null, null, null, null, null)));
                alwl alwlVar = (alwl) xfc.b.g();
                alwlVar.X(ydl.a, qgbVar.d);
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "revokeMessage", 165, "TachygramOutgoingChatApi.java")).q("RevokeChatMessageRequest is queued.");
                aozb aozbVar = qgbVar.f;
                aozy createBuilder = qgc.a.createBuilder();
                qeg qegVar = xfc.a;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar = createBuilder.b;
                qgc qgcVar = (qgc) apagVar;
                qegVar.getClass();
                qgcVar.c = qegVar;
                qgcVar.b |= 1;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                qgc qgcVar2 = (qgc) createBuilder.b;
                aozbVar.getClass();
                qgcVar2.b |= 2;
                qgcVar2.d = aozbVar;
                return (qgc) createBuilder.s();
            case 18:
                wfh wfhVar2 = (wfh) ((xfc) this.b).h.b();
                ?? r1 = this.a;
                qgw qgwVar = (qgw) r1;
                qfb qfbVar = qgwVar.c;
                if (qfbVar == null) {
                    qfbVar = qfb.a;
                }
                ((uof) wfhVar2.a.b()).a(upk.b("tachygram_update_group", r1, xfc.i(qfbVar.c)));
                alwl alwlVar2 = (alwl) xfc.b.g();
                alvz alvzVar = ydl.I;
                qfb qfbVar2 = qgwVar.c;
                if (qfbVar2 == null) {
                    qfbVar2 = qfb.a;
                }
                alwlVar2.X(alvzVar, qfbVar2.c);
                ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "updateGroupChat", 248, "TachygramOutgoingChatApi.java")).q("UpdateGroupChatRequest is queued.");
                aozb aozbVar2 = qgwVar.e;
                aozy createBuilder2 = qgx.a.createBuilder();
                qeg qegVar2 = xfc.a;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar2 = createBuilder2.b;
                qgx qgxVar = (qgx) apagVar2;
                qegVar2.getClass();
                qgxVar.c = qegVar2;
                qgxVar.b |= 1;
                if (!apagVar2.isMutable()) {
                    createBuilder2.u();
                }
                qgx qgxVar2 = (qgx) createBuilder2.b;
                aozbVar2.getClass();
                qgxVar2.b |= 2;
                qgxVar2.d = aozbVar2;
                return (qgx) createBuilder2.s();
            case 19:
                wfh wfhVar3 = (wfh) ((xfc) this.b).i.b();
                ?? r12 = this.a;
                qgt qgtVar = (qgt) r12;
                qfb qfbVar3 = qgtVar.c;
                if (qfbVar3 == null) {
                    qfbVar3 = qfb.a;
                }
                ((uof) wfhVar3.a.b()).a(upk.b("tachygram_get_group_info", r12, xfc.i(qfbVar3.c)));
                alwl alwlVar3 = (alwl) xfc.b.g();
                alvz alvzVar2 = ydl.I;
                qfb qfbVar4 = qgtVar.c;
                if (qfbVar4 == null) {
                    qfbVar4 = qfb.a;
                }
                alwlVar3.X(alvzVar2, qfbVar4.c);
                ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "triggerChatGroupFullStateUpdate", 270, "TachygramOutgoingChatApi.java")).q("TriggerChatGroupFullStateUpdateRequest is queued.");
                aozb aozbVar3 = qgtVar.d;
                aozy createBuilder3 = qgu.a.createBuilder();
                qeg qegVar3 = xfc.a;
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                apag apagVar3 = createBuilder3.b;
                qgu qguVar = (qgu) apagVar3;
                qegVar3.getClass();
                qguVar.c = qegVar3;
                qguVar.b |= 1;
                if (!apagVar3.isMutable()) {
                    createBuilder3.u();
                }
                qgu qguVar2 = (qgu) createBuilder3.b;
                aozbVar3.getClass();
                qguVar2.b |= 2;
                qguVar2.d = aozbVar3;
                return (qgu) createBuilder3.s();
            default:
                wfh wfhVar4 = (wfh) ((xfc) this.b).f.b();
                ?? r13 = this.a;
                qec qecVar = (qec) r13;
                qfb qfbVar5 = qecVar.c;
                if (qfbVar5 == null) {
                    qfbVar5 = qfb.a;
                }
                ((uof) wfhVar4.a.b()).a(upk.b("tachygram_add_user_to_group", r13, xfc.i(qfbVar5.c)));
                alwl alwlVar4 = (alwl) xfc.b.g();
                alvz alvzVar3 = ydl.I;
                qfb qfbVar6 = qecVar.c;
                if (qfbVar6 == null) {
                    qfbVar6 = qfb.a;
                }
                alwlVar4.X(alvzVar3, qfbVar6.c);
                ((alwl) alwlVar4.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingChatApi", "addUserToGroupChat", 204, "TachygramOutgoingChatApi.java")).q("AddUserToGroupChatRequest is queued.");
                aozb aozbVar4 = qecVar.e;
                aozy createBuilder4 = qed.a.createBuilder();
                qeg qegVar4 = xfc.a;
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                apag apagVar4 = createBuilder4.b;
                qed qedVar = (qed) apagVar4;
                qegVar4.getClass();
                qedVar.c = qegVar4;
                qedVar.b |= 1;
                if (!apagVar4.isMutable()) {
                    createBuilder4.u();
                }
                qed qedVar2 = (qed) createBuilder4.b;
                aozbVar4.getClass();
                qedVar2.b |= 2;
                qedVar2.d = aozbVar4;
                return (qed) createBuilder4.s();
        }
    }

    public /* synthetic */ vze(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
