package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.rcsprovisioning.singleregistration.SingleRegistrationCapabilityReceiver;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lso implements ancs {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lso(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [agnq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v103, types: [nfn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v34, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v53, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        int i = 15;
        int i2 = 7;
        int i3 = 19;
        int i4 = 5;
        int i5 = 1;
        int i6 = 0;
        switch (this.b) {
            case 0:
                ((wjr) ((SingleRegistrationCapabilityReceiver) this.a).g.b()).i(amww.SINGLE_REGISTRATION_CAPABILITY_UPDATE);
                return aktp.ag(Optional.empty());
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = this.a;
                if (booleanValue) {
                    return aktp.ag(Integer.valueOf(((lqx) obj2).i));
                }
                lqx lqxVar = (lqx) obj2;
                lqxVar.i++;
                return lqxVar.a(true);
            case 2:
                String str = (String) obj;
                if ("NO_REFERRER".equals(str)) {
                    return aktp.ag(Optional.empty());
                }
                if (TextUtils.isEmpty(str)) {
                    mfh mfhVar = (mfh) this.a;
                    hin hinVar = (hin) mfhVar.d.b();
                    ListenableFuture m = d.m(new mfg(mfhVar, hinVar, i6));
                    hinVar.getClass();
                    m.c(akto.j(new kut(hinVar, i)), mfhVar.b);
                    akul g = akul.g(m);
                    akul h = g.h(new mdr(11), andi.a);
                    mdt mdtVar = mfhVar.c;
                    mdtVar.getClass();
                    return h.i(new lso(mdtVar, 3), mfhVar.b).i(new lso(g, 4), andi.a);
                }
                return aktp.ag(Optional.of(str));
            case 3:
                return akul.g(((mdt) this.a).c.b(new itk((String) obj, i3), andi.a));
            case 4:
                return this.a;
            case 5:
                Long l = (Long) obj;
                if (l != null) {
                    return aktp.ai(new kli(i4), ((mfo) this.a).x).h(new mdq(l.longValue(), i4), andi.a);
                }
                return aktp.ag(false);
            case 6:
                return ((akul) this.a).h(new mds((amhf) obj, i4), andi.a);
            case 7:
                Object obj3 = this.a;
                mfo mfoVar = (mfo) obj3;
                return ((yul) mfoVar.G.b()).e().h(new yts(i2), andi.a).h(new ijq(obj3, (Boolean) obj, 14), mfoVar.y);
            case 8:
                if (((Boolean) obj).booleanValue()) {
                    lig ligVar = (lig) this.a;
                    return ((zai) ligVar.f.b()).c().h(new mdr(i), ligVar.g);
                }
                return aktp.ag(amip.HAPPINESS_TRACKING_MODE_HIDDEN);
            case 9:
                return ((mdt) ((mic) this.a).z.b()).c();
            case 10:
                qsa qsaVar = ((mie) this.a).c;
                qsaVar.getClass();
                return (ListenableFuture) ((Optional) obj).map(new mjz(qsaVar, i5)).orElse(aktp.ag(qry.b()));
            case 11:
                nfw nfwVar = (nfw) ((Optional) obj).orElse(null);
                mlx mlxVar = (mlx) this.a;
                mlxVar.e = nfwVar;
                return aktp.ag(mlxVar.a());
            case 12:
                alwl alwlVar = (alwl) mlv.a.i();
                alwlVar.X(ydl.q, this.a);
                ((alwl) ((alwl) alwlVar.g((Throwable) obj)).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationUnlatcher", "attemptUnlatchingConversation", 100, "BugleConversationUnlatcher.java")).q("Unlatcher: Exception thrown while unlatching. Conversation will remain latched.");
                return aktp.ag(null);
            case 13:
                ConversationIdType conversationIdType = (ConversationIdType) obj;
                if (!conversationIdType.b()) {
                    Object obj4 = this.a;
                    ((alwl) ((alwl) mmg.a.g()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "createConversationFromIdString", 465, "DefaultConversationRepository.java")).t("Returning conversation with id = %s.", conversationIdType.a());
                    return aktp.ag(((mmg) obj4).n.i(new BugleConversationId(conversationIdType), false));
                }
                ((alwl) ((alwl) mmg.a.i()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversationRepository", "createConversationFromIdString", 461, "DefaultConversationRepository.java")).q("Null conversationId after getOrCreateConversation.");
                throw new IllegalStateException("Null conversationId after getOrCreateConversation.");
            case 14:
                ((ifq) this.a).e.c("LighterConversationManager#deleteAllLighterConversations", new ezq(i3));
                return aktp.ag(null);
            case 15:
                return ((mui) this.a).a().a((mzc) obj);
            case 16:
                Object obj5 = this.a;
                mxc mxcVar = (mxc) obj5;
                alor alorVar = (alor) ((alor) obj).getOrDefault(mxcVar.d.a, altc.a);
                if (alorVar.isEmpty()) {
                    int i7 = alog.d;
                    return aktp.ag(alsx.a);
                }
                return mxcVar.e.b().h(new mmq(obj5, alorVar, i2), mxcVar.b);
            case 17:
                Integer num = (Integer) obj;
                if (num != null && num.intValue() == 1) {
                    return this.a.a();
                }
                return aktp.ag(false);
            case 18:
                Throwable th = (Throwable) obj;
                alwl alwlVar2 = (alwl) ney.b.i();
                alwlVar2.X(ydl.C, ((ney) this.a).d());
                ((alwl) ((alwl) alwlVar2.g(th)).h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/RcsContactsRcsCapabilitiesSupplier", "getAsync", 99, "RcsContactsRcsCapabilitiesSupplier.java")).q("Exception while retrieving RCS Capabilities from Service RPC.");
                if (th instanceof psx) {
                    return aktp.af(th);
                }
                return aktp.ag(ney.a);
            case 19:
                Throwable th2 = (Throwable) obj;
                alwl alwlVar3 = (alwl) ney.b.i();
                alwlVar3.X(ydl.C, ((ney) this.a).d());
                ((alwl) ((alwl) alwlVar3.g(th2)).h("com/google/android/apps/messaging/shared/api/messaging/recipient/rcs/RcsContactsRcsCapabilitiesSupplier", "getAsync", 133, "RcsContactsRcsCapabilitiesSupplier.java")).q("Exception while retrieving Cached RCS Capabilities.");
                if (th2 instanceof psx) {
                    return aktp.af(th2);
                }
                return aktp.ag(Optional.empty());
            default:
                qei qeiVar = (qei) obj;
                Object obj6 = this.a;
                if (qeiVar == null) {
                    alwl alwlVar4 = (alwl) nga.a.i();
                    alwlVar4.X(ydl.t, Integer.valueOf(((nga) obj6).f));
                    ((alwl) alwlVar4.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/encryption/EtouffeeEncryptionStateSupplier", "getEtouffeeEnabled", 130, "EtouffeeEncryptionStateSupplier.java")).q("Can not get e2ee status for convo2, identity is missing");
                    return aktp.ag(false);
                }
                return ((ttj) ((nga) obj6).c.b()).b(qeiVar.d);
        }
    }
}
