package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.List;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vfj implements ancs {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ vfj(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v104, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v109, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [vfx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [vfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v52, types: [java.util.Collection, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        boolean z;
        int i = 8;
        int i2 = 2;
        int i3 = 15;
        byte[] bArr = null;
        int i4 = 0;
        switch (this.c) {
            case 0:
                return this.a.a((aozy) obj, this.b);
            case 1:
                return vew.m((vel) this.b, (ved) obj, (aqep) this.a);
            case 2:
                return this.a.a((aozy) obj, this.b);
            case 3:
                Boolean bool = (Boolean) obj;
                aqds aqdsVar = (aqds) this.a;
                String str = aqdsVar.c;
                alvw g = vgt.a.g();
                g.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/inboxmessagedispatcher/InboxMessageDispatcherImpl", "handleInboxMessageWithinSpan", 156, "InboxMessageDispatcherImpl.java")).D("InboxMessageDispatcherImpl: Handled message messageId: %s shouldAck: %s", str, bool);
                if (bool.booleanValue()) {
                    aqfn aqfnVar = aqdsVar.h;
                    if (aqfnVar == null) {
                        aqfnVar = aqfn.a;
                    }
                    aqdq b = aqdq.b(aqdsVar.j);
                    if (b == null) {
                        b = aqdq.UNRECOGNIZED;
                    }
                    return ((vgt) this.b).a(str, aqfnVar, b);
                }
                return aktp.ag(null);
            case 4:
                return ((vhi) this.b).a((String) this.a, (vbq) obj).b();
            case 5:
                return ((zap) this.b).o((String) this.a, (amkt) obj);
            case 6:
                Object obj2 = this.a;
                zap zapVar = (zap) this.b;
                return zapVar.r((String) obj2, 8).h(new vgd((amks) obj, 20), zapVar.a);
            case 7:
                return ((zap) this.b).o((String) this.a, (amkt) obj);
            case 8:
                vwg vwgVar = (vwg) ((armf) ((vvr) this.b).h.get()).b();
                Optional.of(this.a);
                return vwgVar.a();
            case 9:
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    return aktp.ag(upm.d());
                }
                Object obj3 = this.a;
                Object obj4 = this.b;
                xwa xwaVar = (xwa) optional.get();
                ConversationIdType conversationIdType = xwaVar.a;
                ListenableFuture[] listenableFutureArr = new ListenableFuture[3];
                vwp vwpVar = (vwp) obj3;
                String str2 = vwpVar.e;
                if (1 != (vwpVar.b & 1)) {
                    z = false;
                } else {
                    z = true;
                }
                vwo vwoVar = (vwo) obj4;
                vuo vuoVar = vwoVar.k;
                akul a = vuoVar.a(conversationIdType);
                akul ai = aktp.ai(new rbn((Object) vuoVar, conversationIdType, (Object) str2, i3), vuoVar.d);
                listenableFutureArr[0] = aktp.an(a, ai).i(new pta(vuoVar, a, ai, z, 2), vuoVar.e).e(Exception.class, new vsw(i), vuoVar.e);
                listenableFutureArr[1] = aktp.ai(new vib(xwaVar, i3), vwoVar.d).h(new vqv(obj4, xwaVar, 4, bArr), vwoVar.d);
                listenableFutureArr[2] = aktp.ah(new vri(obj4, xwaVar, obj3, 3), vwoVar.d);
                return aktp.an(listenableFutureArr).i(new ncx(obj4, xwaVar, obj3, 12, (char[]) null), vwoVar.c);
            case 10:
                Object obj5 = this.b;
                alwo alwoVar = vwv.b;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Object obj6 = this.a;
                if (booleanValue) {
                    vwv.j(Level.FINE, (ConversationIdType) obj5, ((smr) obj6).V(), "Users successfully queued to be added to RCS group conversation.");
                    return aktp.ag(upm.b());
                }
                vwv.j(Level.FINE, (ConversationIdType) obj5, ((smr) obj6).V(), "Users not successfully queued to be added to RCS group conversation.");
                return aktp.ag(upm.d());
            case 11:
                Optional optional2 = (Optional) obj;
                boolean isEmpty = optional2.isEmpty();
                Object obj7 = this.b;
                Object obj8 = this.a;
                if (isEmpty) {
                    alvw m = vxd.a.m();
                    m.X(ydl.o, ((ConversationIdType) obj7).toString());
                    ((alwl) m.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler", "processPendingWorkItemAsync", 93, "RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler.java")).q("Skipping recovering ChatAPI to Vanilla RCS downgraded conversation because could not retrieve ConversationsTable bind data");
                    ((vxd) obj8).d.e("Bugle.Rcs.Groups.Recovery.Disabled.Cause", 2);
                    return aktp.ag(upm.d());
                }
                String V = ((smr) optional2.get()).V();
                String U = ((smr) optional2.get()).U();
                if (albo.ah(V)) {
                    alvw m2 = vxd.a.m();
                    m2.X(ydl.o, ((ConversationIdType) obj7).toString());
                    m2.X(ydl.I, V);
                    ((alwl) m2.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler", "processPendingWorkItemAsync", 110, "RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler.java")).q("Skipping recovering ChatAPI to Vanilla RCS downgraded conversation because we do not have valid group ID.");
                    ((vxd) obj8).d.e("Bugle.Rcs.Groups.Recovery.Disabled.Cause", 3);
                    return aktp.ag(upm.d());
                }
                if (albo.ah(U)) {
                    alvw m3 = vxd.a.m();
                    m3.X(ydl.o, ((ConversationIdType) obj7).toString());
                    m3.X(ydl.I, V);
                    ((alwl) m3.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler", "processPendingWorkItemAsync", 124, "RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler.java")).q("Skipping recovering ChatAPI to Vanilla RCS downgraded conversation because we do not have valid conference URI.");
                    ((vxd) obj8).d.e("Bugle.Rcs.Groups.Recovery.Disabled.Cause", 4);
                    return aktp.ag(upm.d());
                }
                alvw m4 = vxd.a.m();
                m4.X(ydl.o, ((ConversationIdType) obj7).toString());
                m4.X(ydl.I, V);
                ((alwl) m4.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler", "processPendingWorkItemAsync", 137, "RecoverChatApiToVanillaRcsDowngradedRcsGroupHandler.java")).q("Bugle is using ChatAPI but the conversation was disabled due to a prior downgrade to Vanilla RCS. Enabling the group.");
                return aktp.ai(new vmb(obj8, obj7, i3, bArr), ((vxd) obj8).b);
            case 12:
                qvo qvoVar = (qvo) obj;
                Object obj9 = this.b;
                if (qvoVar != null && qvoVar.c != null) {
                    vxx vxxVar = (vxx) this.a;
                    return ((vnm) ((Optional) ((apxx) vxxVar.X).a).get()).a().h(new vuu(obj9, 5), vxxVar.S);
                }
                return aktp.ag(obj9);
            case 13:
                if (((pvj) obj).equals(pvj.NOT_RCS)) {
                    return ((vyd) this.a).a(this.b);
                }
                return aktp.ag(0);
            case 14:
                if (((psv) obj).f()) {
                    return aktp.ag(0);
                }
                return ((vyd) this.a).a(this.b);
            case 15:
                return ((vyy) this.b).b.c(this.a);
            case 16:
                return ((wej) this.b).b.b(this.a);
            case 17:
                wft wftVar = (wft) this.a;
                return wftVar.c.d().h(new vqv((Integer) obj, this.b, i3), wftVar.g);
            case 18:
                if (!((Boolean) obj).booleanValue()) {
                    ((alvg) ((alvg) wgd.a.d()).h("com/google/android/apps/messaging/shared/rcsdata/PhoneNumberInputUIPresenter", "shouldPromptPhoneNumberInputUIFuture", 423, "PhoneNumberInputUIPresenter.java")).q("Not prompting PhoneNumberInputUI: RcsAvailability is not CARRIER_SETUP_PENDING");
                    return aktp.ag(false);
                }
                Object obj10 = this.a;
                Object obj11 = this.b;
                return ((wgd) obj11).c((String) obj10).h(new vqv(obj11, obj10, 16, bArr), andi.a);
            case 19:
                if (!((Boolean) obj).booleanValue()) {
                    return aktp.ag(Optional.empty());
                }
                Object obj12 = this.a;
                wgd wgdVar = (wgd) this.b;
                return wgdVar.c((String) obj12).h(new wax(17), wgdVar.f);
            default:
                List list = (List) obj;
                int i5 = 7;
                Stream filter = Collection.EL.stream(this.a).filter(new uhe((alpt) Collection.EL.stream(list).filter(new wjl(i4)).map(new wga(i5)).collect(alls.b), 19));
                int i6 = alog.d;
                alog alogVar = (alog) filter.collect(alls.a);
                alog alogVar2 = (alog) Collection.EL.stream(list).filter(new wjl(i2)).map(new wga(i5)).collect(alls.a);
                wjm wjmVar = (wjm) this.b;
                wjmVar.f(alogVar2);
                if (!alogVar.isEmpty()) {
                    if (((Boolean) ((utz) vye.b.get()).e()).booleanValue()) {
                        ((vyv) ((Optional) wjmVar.g.b()).get()).a();
                    } else {
                        aktp.ag(null);
                    }
                }
                wjmVar.e.z(alogVar);
                ((alvg) ((alvg) wjm.b.g()).h("com/google/android/apps/messaging/shared/rcsmessagetracking/RcsNotDeliveredMessageTracker", "startAutoFallbackAndNotify", 219, "RcsNotDeliveredMessageTracker.java")).r("Refreshing notification for %d not yet delivered RCS", alogVar.size());
                if (alogVar.isEmpty()) {
                    return aktp.ag(null);
                }
                return wjmVar.d.a((alog) Collection.EL.stream(alogVar).map(new wga(i)).collect(alls.a), tqg.RCS_NOT_DELIVERED);
        }
    }

    public /* synthetic */ vfj(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
