package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.action.SendMessageToConversationOrParticipantsAction;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mhr implements algk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ mhr(SendMessageToConversationOrParticipantsAction sendMessageToConversationOrParticipantsAction, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, List list, int i) {
        this.e = i;
        this.b = sendMessageToConversationOrParticipantsAction;
        this.c = conversationIdType;
        this.a = selfIdentityId;
        this.d = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21, types: [com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, java.lang.Object] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        amwx amwxVar;
        int i = 10;
        int i2 = 3;
        int i3 = 4;
        switch (this.e) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                aozy aozyVar = (aozy) this.c;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                Object obj2 = this.d;
                amfl amflVar = (amfl) aozyVar.b;
                amfl amflVar2 = amfl.a;
                amflVar.b |= 4;
                amflVar.e = booleanValue;
                aozy aozyVar2 = (aozy) obj2;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                Object obj3 = this.b;
                amic amicVar = (amic) aozyVar2.b;
                amfl amflVar3 = (amfl) aozyVar.s();
                amic amicVar2 = amic.a;
                amflVar3.getClass();
                amicVar.c = amflVar3;
                amicVar.b |= 2;
                aozy aozyVar3 = (aozy) obj3;
                if (!aozyVar3.b.isMutable()) {
                    aozyVar3.u();
                }
                Object obj4 = this.a;
                amfq amfqVar = (amfq) obj3;
                amfr amfrVar = (amfr) amfqVar.b;
                amic amicVar3 = (amic) aozyVar2.s();
                amfr amfrVar2 = amfr.a;
                amicVar3.getClass();
                amfrVar.o = amicVar3;
                amfrVar.b |= 64;
                ((mic) obj4).x.j(amfqVar);
                return null;
            case 1:
                if (!((Boolean) obj).booleanValue()) {
                    ((abno) this.b).c();
                }
                if (((mbb) this.a).e) {
                    Object obj5 = this.d;
                    amfr amfrVar3 = (amfr) ((aozy) this.c).s();
                    alvw e = mbb.a.e();
                    e.X(alwp.a, "BugleClearcutLogger");
                    alvg alvgVar = (alvg) e;
                    alvgVar.X(mdu.m, Boolean.valueOf(!r12.booleanValue()));
                    alvgVar.X(mdu.d, Integer.valueOf(amfrVar3.getSerializedSize()));
                    alvgVar.X(mdu.n, obj5);
                    alvgVar.X(mdu.c, amfrVar3);
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/analytics/common/BugleClearcutLoggerV2Impl", "dispatch", 256, "BugleClearcutLoggerV2Impl.java")).q("\nprotobuf ");
                }
                return null;
            case 2:
                List list = (List) obj;
                qbq qbqVar = (qbq) this.a;
                qxr qxrVar = (qxr) qbqVar.h.b();
                int size = list.size();
                Object obj6 = this.d;
                qbs qbsVar = (qbs) this.b;
                qgr qgrVar = (qgr) obj6;
                qxrVar.j(qbsVar.f, size, 3, qgrVar);
                aozy createBuilder = qen.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                String str = qbsVar.f;
                apag apagVar = createBuilder.b;
                qen qenVar = (qen) apagVar;
                str.getClass();
                qenVar.b |= 1;
                qenVar.c = str;
                String ag = albo.ag(qbsVar.c);
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                Object obj7 = this.c;
                qen qenVar2 = (qen) createBuilder.b;
                qenVar2.b |= 2;
                qenVar2.d = ag;
                if (!((okf) qbqVar.i.b()).a()) {
                    obj7 = qbsVar.j;
                }
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                qen qenVar3 = (qen) createBuilder.b;
                obj7.getClass();
                qenVar3.f = (qei) obj7;
                qenVar3.b |= 8;
                Stream map = Collection.EL.stream(((msk) qbqVar.g.b()).w(list)).map(new qbb(i));
                int i4 = alog.d;
                createBuilder.B((alog) map.collect(alls.a));
                aozy createBuilder2 = qem.a.createBuilder();
                String str2 = qbsVar.f;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar2 = createBuilder2.b;
                qem qemVar = (qem) apagVar2;
                str2.getClass();
                qemVar.b |= 1;
                qemVar.c = str2;
                if (!apagVar2.isMutable()) {
                    createBuilder2.u();
                }
                qem.a((qem) createBuilder2.b);
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                qem qemVar2 = (qem) createBuilder2.b;
                obj6.getClass();
                qemVar2.e = qgrVar;
                qemVar2.b |= 4;
                aozb byteString = ((qem) createBuilder2.s()).toByteString();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                qen qenVar4 = (qen) createBuilder.b;
                qenVar4.b |= 16;
                qenVar4.h = byteString;
                return (qen) createBuilder.s();
            case 3:
                MessageCoreData h = ((SendMessageToConversationOrParticipantsAction) this.b).j.h(((Integer) obj).intValue(), (ConversationIdType) this.c, this.a);
                ((MessageData) h).i.addAll(this.d);
                return h;
            case 4:
                String str3 = (String) obj;
                qei qeiVar = ((qdk) this.a).a.d;
                if (qeiVar == null) {
                    qeiVar = qei.a;
                }
                Object obj8 = this.c;
                rve rveVar = (rve) this.b;
                if (((tvg) obj8).f.b((apwl) this.d, rveVar, qeiVar.d, str3)) {
                    xyo c = tvg.a.c();
                    c.H("FTD handling was scheduled.");
                    c.g(rveVar);
                    c.q();
                    return pwh.SUCCESS;
                }
                xyo e2 = tvg.a.e();
                e2.H("Failed to schedule FTD handling.");
                e2.g(rveVar);
                e2.q();
                return pwh.FAIL_NO_RETRY;
            case 5:
                gtc gtcVar = (gtc) obj;
                xyo d = upq.a.d();
                d.H("confirmed from wm");
                upr uprVar = (upr) this.c;
                d.y("rowId", uprVar.k());
                Object obj9 = this.d;
                d.z("queue", obj9);
                d.z(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, uprVar.p());
                d.q();
                upz upzVar = new upz();
                upzVar.aj("WorkQueueSchedulerImpl#launchToWorkManager2");
                upzVar.d();
                upzVar.c(uprVar.k());
                String str4 = (String) obj9;
                ((upq) this.b).d(str4, upo.PERSISTED, (UUID) ((kkc) this.a).a);
                return gtcVar;
            case 6:
                aozy builder = ((vee) obj).toBuilder();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                Object obj10 = this.d;
                Object obj11 = this.c;
                Object obj12 = this.b;
                ((vee) builder.b).k = ((ved) this.a).a();
                builder.getClass();
                ((Optional) obj12).ifPresent(new uoa(builder, 9));
                ((Optional) obj11).ifPresent(new uoa(builder, i));
                ((Optional) obj10).ifPresent(new uoa(builder, 11));
                return (vee) builder.s();
            case 7:
                qeg qegVar = (qeg) obj;
                boolean n = vui.n(qegVar);
                Object obj13 = this.d;
                Object obj14 = this.b;
                if (n) {
                    Object obj15 = this.c;
                    vui vuiVar = (vui) obj14;
                    vuiVar.l((smr) this.a, null, (UUID) obj13, qegVar, !((vuk) obj15).f);
                    return upm.d();
                }
                ((vti) ((vui) obj14).m.b()).h(((UUID) obj13).toString());
                return upm.b();
            case 8:
                Object obj16 = this.c;
                Object obj17 = this.d;
                return ((vui) this.b).j((smr) this.a, (psr) obj, (UUID) obj17, (vuk) obj16);
            case 9:
                Object obj18 = this.c;
                Object obj19 = this.d;
                return ((vui) this.b).j((smr) this.a, (vpd) obj, (UUID) obj19, (vuk) obj18);
            case 10:
                qei qeiVar2 = (qei) obj;
                apax apaxVar = ((vww) this.d).d;
                aozy createBuilder3 = qem.a.createBuilder();
                smr smrVar = (smr) this.b;
                String V = smrVar.V();
                V.getClass();
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                apag apagVar3 = createBuilder3.b;
                qem qemVar3 = (qem) apagVar3;
                qemVar3.b |= 1;
                qemVar3.c = V;
                if (!apagVar3.isMutable()) {
                    createBuilder3.u();
                }
                qem.a((qem) createBuilder3.b);
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                Object obj20 = this.a;
                qem qemVar4 = (qem) createBuilder3.b;
                obj20.getClass();
                qemVar4.e = (qgr) obj20;
                qemVar4.b |= 4;
                qem qemVar5 = (qem) createBuilder3.s();
                aozy createBuilder4 = qen.a.createBuilder();
                String V2 = smrVar.V();
                V2.getClass();
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                qen qenVar5 = (qen) createBuilder4.b;
                qenVar5.b |= 1;
                qenVar5.c = V2;
                String ag2 = albo.ag(smrVar.P());
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                apag apagVar4 = createBuilder4.b;
                qen qenVar6 = (qen) apagVar4;
                qenVar6.b |= 2;
                qenVar6.d = ag2;
                if (!apagVar4.isMutable()) {
                    createBuilder4.u();
                }
                Object obj21 = this.c;
                qen qenVar7 = (qen) createBuilder4.b;
                qeiVar2.getClass();
                qenVar7.f = qeiVar2;
                qenVar7.b |= 8;
                Stream map2 = Collection.EL.stream(apaxVar).map(new vte(obj21, 17)).map(new vvi(i2)).map(new vvi(i3));
                int i5 = alog.d;
                createBuilder4.B((Iterable) map2.collect(alls.a));
                aozb byteString2 = qemVar5.toByteString();
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                qen qenVar8 = (qen) createBuilder4.b;
                qenVar8.b |= 16;
                qenVar8.h = byteString2;
                return (qen) createBuilder4.s();
            case 11:
                qeg qegVar2 = ((qeo) obj).c;
                if (qegVar2 == null) {
                    qegVar2 = qeg.a;
                }
                qef qefVar = qef.OK;
                qef b = qef.b(qegVar2.c);
                if (b == null) {
                    b = qef.UNKNOWN_STATUS;
                }
                Object obj22 = this.d;
                Object obj23 = this.b;
                if (!qefVar.equals(b)) {
                    qef qefVar2 = qef.PENDING;
                    qef b2 = qef.b(qegVar2.c);
                    if (b2 == null) {
                        b2 = qef.UNKNOWN_STATUS;
                    }
                    if (!qefVar2.equals(b2)) {
                        alwl alwlVar = (alwl) vwv.b.i();
                        alwlVar.X(ydl.o, ((smr) obj23).x().toString());
                        alwlVar.X(ydl.I, obj22);
                        alwl alwlVar2 = (alwl) alwlVar.h("com/google/android/apps/messaging/shared/rcs/groups/participants/AddMembersToRcsConversationHandler", "createGroupWithChatApi", 443, "AddMembersToRcsConversationHandler.java");
                        qee b3 = qee.b(qegVar2.d);
                        if (b3 == null) {
                            b3 = qee.UNKNOWN_CAUSE;
                        }
                        Object obj24 = this.a;
                        Object obj25 = this.c;
                        alwlVar2.t("Failed to fallback addUsersToGroup to createGroup, cause=%s", b3.name());
                        ((qxr) ((vwv) obj25).k.b()).f((String) obj22, qegVar2, (qgr) obj24);
                        return upm.d();
                    }
                }
                vwv.j(Level.FINE, ((smr) obj23).x(), (String) obj22, "Fallback addUsersToGroup to createGroup request accepted by transport");
                return upm.b();
            default:
                IllegalArgumentException illegalArgumentException = (IllegalArgumentException) obj;
                alwl alwlVar3 = (alwl) ((alwl) vwv.b.i()).g(illegalArgumentException);
                alwlVar3.X(ydl.o, ((smr) this.b).x().toString());
                alvz alvzVar = ydl.I;
                Object obj26 = this.d;
                alwlVar3.X(alvzVar, obj26);
                ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/rcs/groups/participants/AddMembersToRcsConversationHandler", "createGroupWithChatApi", 460, "AddMembersToRcsConversationHandler.java")).q("Failed to fallback addUsersToGroup to createGroup Chat API rejected the request.");
                qxr qxrVar2 = (qxr) ((vwv) this.c).k.b();
                if (illegalArgumentException instanceof IllegalArgumentException) {
                    amwxVar = amwx.CHAT_API_TRANSPORT_ILLEGAL_ARGUMENTS;
                } else {
                    amwxVar = amwx.CHAT_API_GENERIC_TRANSPORT_ERROR;
                }
                qxrVar2.g((String) obj26, amwxVar, (qgr) this.a);
                return upm.d();
        }
    }

    public /* synthetic */ mhr(Object obj, apag apagVar, Object obj2, Object obj3, int i) {
        this.e = i;
        this.c = obj;
        this.d = apagVar;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ mhr(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ mhr(mic micVar, aozy aozyVar, amfq amfqVar, aozy aozyVar2, int i) {
        this.e = i;
        this.a = micVar;
        this.c = aozyVar;
        this.b = amfqVar;
        this.d = aozyVar2;
    }

    public /* synthetic */ mhr(qbq qbqVar, qbs qbsVar, qgr qgrVar, qei qeiVar, int i) {
        this.e = i;
        this.a = qbqVar;
        this.b = qbsVar;
        this.d = qgrVar;
        this.c = qeiVar;
    }

    public /* synthetic */ mhr(upq upqVar, upr uprVar, String str, kkc kkcVar, int i) {
        this.e = i;
        this.b = upqVar;
        this.c = uprVar;
        this.d = str;
        this.a = kkcVar;
    }

    public /* synthetic */ mhr(vui vuiVar, smr smrVar, UUID uuid, vuk vukVar, int i) {
        this.e = i;
        this.b = vuiVar;
        this.a = smrVar;
        this.d = uuid;
        this.c = vukVar;
    }

    public /* synthetic */ mhr(vwv vwvVar, smr smrVar, String str, qgr qgrVar, int i) {
        this.e = i;
        this.c = vwvVar;
        this.b = smrVar;
        this.d = str;
        this.a = qgrVar;
    }
}
