package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vxh extends unp {
    public static final alwo a = alwo.o("BugleGroupManagement");
    public final anen b;
    public final pss c;
    public final armf d;
    public final vxr e;
    public final vbu f;
    public final mbl g;
    public final okf h;
    public final pfx i;
    private final anen j;

    public vxh(anen anenVar, anen anenVar2, pss pssVar, armf armfVar, vxr vxrVar, vbu vbuVar, okf okfVar, mbl mblVar, pfx pfxVar) {
        this.j = anenVar;
        this.b = anenVar2;
        this.c = pssVar;
        this.d = armfVar;
        this.e = vxrVar;
        this.f = vbuVar;
        this.h = okfVar;
        this.g = mblVar;
        this.i = pfxVar;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("RecoverDisabledRcsGroupHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        final vxj vxjVar = (vxj) apbtVar;
        final ConversationIdType b = ruy.b(vxjVar.c);
        if (b.b()) {
            ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverDisabledRcsGroupHandler", "processPendingWorkItemAsync", 112, "RecoverDisabledRcsGroupHandler.java")).q("Skipping recovering conversation because conversation ID is empty");
            return aktp.ag(upm.d());
        }
        return aktp.ai(new vib(b, 17), this.j).i(new ancs() { // from class: vxf
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ancs
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                boolean isEmpty = optional.isEmpty();
                vxh vxhVar = vxh.this;
                ConversationIdType conversationIdType = b;
                if (isEmpty) {
                    alwl alwlVar = (alwl) vxh.a.i();
                    alwlVar.X(ydl.o, conversationIdType.toString());
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverDisabledRcsGroupHandler", "processPendingWorkItemAsync", 123, "RecoverDisabledRcsGroupHandler.java")).q("Skipping recovering conversation because could not retrieve ConversationsTable bind data");
                    vxhVar.g.e("Bugle.Rcs.Groups.Recovery.Disabled.Cause", 2);
                    return aktp.ag(upm.d());
                }
                String V = ((smr) optional.get()).V();
                String U = ((smr) optional.get()).U();
                if (albo.ah(V)) {
                    alwl alwlVar2 = (alwl) vxh.a.i();
                    alwlVar2.X(ydl.o, conversationIdType.toString());
                    alwlVar2.X(ydl.I, V);
                    ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverDisabledRcsGroupHandler", "processPendingWorkItemAsync", 140, "RecoverDisabledRcsGroupHandler.java")).q("Skipping conversation because we do not have valid group ID. Updating join state to CONVERSATION_JOIN_STATE_DIFFERENT_CONFIG");
                    sng sngVar = new sng();
                    sngVar.aj("RecoverDisabledRcsGroupHandler.processPendingWorkItemAsync-conversationw1");
                    sngVar.v(3);
                    sngVar.e(((smr) optional.get()).x());
                    vxhVar.g.e("Bugle.Rcs.Groups.Recovery.Disabled.Cause", 3);
                    return aktp.ag(upm.b());
                }
                if (albo.ah(U)) {
                    alwl alwlVar3 = (alwl) vxh.a.i();
                    alwlVar3.X(ydl.o, conversationIdType.toString());
                    alwlVar3.X(ydl.I, V);
                    ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverDisabledRcsGroupHandler", "processPendingWorkItemAsync", 160, "RecoverDisabledRcsGroupHandler.java")).q("Skipping conversation because we do not have valid conference URI.");
                    if (((smr) optional.get()).l() == 4) {
                        sng sngVar2 = new sng();
                        sngVar2.aj("RecoverDisabledRcsGroupHandler#processPendingWorkItemAsync-conversationw2");
                        sngVar2.v(3);
                        sngVar2.e(((smr) optional.get()).x());
                        vxhVar.g.e("Bugle.Rcs.Groups.Recovery.Disabled.Cause", 4);
                        ((alwl) ((alwl) vxh.a.i()).h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverDisabledRcsGroupHandler", "processPendingWorkItemAsync", 171, "RecoverDisabledRcsGroupHandler.java")).q("Updating join state to CONVERSATION_JOIN_STATE_DIFFERENT_CONFIG");
                    }
                    return aktp.ag(upm.b());
                }
                if (!vxhVar.i.a()) {
                    vxo a2 = vxhVar.e.a(((smr) optional.get()).F());
                    if (a2.a.isEmpty()) {
                        alwl alwlVar4 = (alwl) vxh.a.i();
                        alwlVar4.X(ydl.o, conversationIdType.toString());
                        alwlVar4.X(ydl.I, V);
                        ((alwl) alwlVar4.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverDisabledRcsGroupHandler", "conversationIsNotVerifiedForCurrentActiveRcsMsisdn", 280, "RecoverDisabledRcsGroupHandler.java")).q("Skipping conversation because we cannot retrieve the RcsGroupTelephonyData.");
                    } else {
                        vbu vbuVar = vxhVar.f;
                        okf okfVar = vxhVar.h;
                        String k = vbuVar.k();
                        if (!okfVar.a() && albo.ah(k)) {
                            alwl alwlVar5 = (alwl) vxh.a.i();
                            alwlVar5.X(ydl.o, conversationIdType.toString());
                            alwlVar5.X(ydl.I, V);
                            ((alwl) alwlVar5.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverDisabledRcsGroupHandler", "conversationIsNotVerifiedForCurrentActiveRcsMsisdn", 290, "RecoverDisabledRcsGroupHandler.java")).q("Skipping conversation because we cannot retrieve the current RCS MSISDN.");
                        } else {
                            String str = ((vxm) a2.a.get()).b;
                            if (!vxhVar.h.a() && !str.equals(vxhVar.f.k())) {
                                alwl alwlVar6 = (alwl) vxh.a.i();
                                alwlVar6.X(ydl.o, conversationIdType.toString());
                                alwlVar6.X(ydl.I, V);
                                ((alwl) alwlVar6.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverDisabledRcsGroupHandler", "conversationIsNotVerifiedForCurrentActiveRcsMsisdn", 302, "RecoverDisabledRcsGroupHandler.java")).q("Skipping conversation we were in this conversation under a different RCS msisdn. Updating join state to CONVERSATION_JOIN_STATE_DIFFERENT_CONFIG");
                                sng sngVar3 = new sng();
                                sngVar3.aj("conversationIsNotVerifiedForCurrentActiveRcsMsisdn");
                                sngVar3.v(3);
                                sngVar3.e(conversationIdType);
                            }
                        }
                    }
                    return aktp.ag(upm.d());
                }
                snf e = sni.e();
                e.w("conversationIsCorruptAndShouldNotBeRecovered");
                smu smuVar = sni.c;
                e.c(smuVar.a, smuVar.b);
                e.h(new vxg(V, 0));
                alog t = e.b().t();
                alsx alsxVar = (alsx) t;
                if (alsxVar.c > 1) {
                    HashSet hashSet = new HashSet();
                    int i = alsxVar.c;
                    for (int i2 = 0; i2 < i; i2++) {
                        smr smrVar = (smr) t.get(i2);
                        vxo a3 = vxhVar.e.a(smrVar.F());
                        if (!a3.a.isEmpty()) {
                            vxm vxmVar = (vxm) a3.a.get();
                            if (V.equals(vxmVar.c)) {
                                if (hashSet.contains(vxmVar.b)) {
                                    alwl alwlVar7 = (alwl) vxh.a.i();
                                    alwlVar7.X(ydl.o, smrVar.x().toString());
                                    alwlVar7.X(ydl.I, V);
                                    ((alwl) alwlVar7.h("com/google/android/apps/messaging/shared/rcs/groups/recovery/RecoverDisabledRcsGroupHandler", "conversationIsCorruptAndShouldNotBeRecovered", 356, "RecoverDisabledRcsGroupHandler.java")).q("Skipping conversation because RCS group is forked.");
                                } else {
                                    hashSet.add(vxmVar.b);
                                }
                            }
                        }
                        return aktp.ag(upm.d());
                    }
                }
                qei qeiVar = vxjVar.d;
                if (qeiVar == null) {
                    qeiVar = qei.a;
                }
                aozy createBuilder = qfb.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                qfb qfbVar = (qfb) createBuilder.b;
                V.getClass();
                qfbVar.b |= 1;
                qfbVar.c = V;
                qei a4 = ((psq) vxhVar.d.b()).a(U, true);
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                qfb qfbVar2 = (qfb) createBuilder.b;
                a4.getClass();
                qfbVar2.d = a4;
                qfbVar2.b |= 2;
                qfb qfbVar3 = (qfb) createBuilder.s();
                aozy createBuilder2 = qgs.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                qgs qgsVar = (qgs) createBuilder2.b;
                V.getClass();
                qgsVar.b |= 1;
                qgsVar.c = V;
                qgs qgsVar2 = (qgs) createBuilder2.s();
                aozy createBuilder3 = qgt.a.createBuilder();
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                apag apagVar = createBuilder3.b;
                qgt qgtVar = (qgt) apagVar;
                qfbVar3.getClass();
                qgtVar.c = qfbVar3;
                qgtVar.b |= 1;
                if (!apagVar.isMutable()) {
                    createBuilder3.u();
                }
                qgt qgtVar2 = (qgt) createBuilder3.b;
                qeiVar.getClass();
                qgtVar2.e = qeiVar;
                qgtVar2.b |= 4;
                aozb byteString = qgsVar2.toByteString();
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                qgt qgtVar3 = (qgt) createBuilder3.b;
                qgtVar3.b |= 2;
                qgtVar3.d = byteString;
                return vxhVar.c.f((qgt) createBuilder3.s()).h(new tul(vxhVar, conversationIdType, V, 14, (char[]) null), vxhVar.b);
            }
        }, this.j);
    }

    @Override // defpackage.unx
    public final apca e() {
        return vxj.a.getParserForType();
    }
}
