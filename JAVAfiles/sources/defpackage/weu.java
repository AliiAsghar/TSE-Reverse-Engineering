package defpackage;

import j$.util.Optional;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class weu implements uun {
    private final mbl c;
    private final Optional d;
    private final uvf e;
    private final armf f;
    private final armf g;
    private final armf h;
    private final wpp i;
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/rcs/performance/PrewarmTickleHandler");
    static final uuf a = uuh.i(uuh.b, "open_bind_after_prewarm", true);

    public weu(mbl mblVar, Optional optional, uvf uvfVar, wpp wppVar, armf armfVar, armf armfVar2, armf armfVar3) {
        this.c = mblVar;
        this.d = optional;
        this.e = uvfVar;
        this.i = wppVar;
        this.f = armfVar;
        this.g = armfVar2;
        this.h = armfVar3;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [armf, java.lang.Object] */
    @Override // defpackage.uun
    public final void a(aoiq aoiqVar) {
        aqfn aqfnVar;
        if (!((Boolean) a.e()).booleanValue()) {
            return;
        }
        alvi alviVar = b;
        ((alvg) ((alvg) alviVar.g()).h("com/google/android/apps/messaging/shared/rcs/performance/PrewarmTickleHandler", "onMessageReceived", 103, "PrewarmTickleHandler.java")).q("Received prewarm tickle");
        akrh e = aktp.e("PrewarmTickleHandler::onTickleReceived");
        try {
            String str = (String) aoiqVar.c().get("receiverId");
            String str2 = null;
            if (str != null) {
                aqfnVar = uvc.a(str);
            } else {
                aqfnVar = null;
            }
            if (aqfnVar == null) {
                ((alvg) ((alvg) alviVar.g()).h("com/google/android/apps/messaging/shared/rcs/performance/PrewarmTickleHandler", "onMessageReceived", 111, "PrewarmTickleHandler.java")).q("Received null receiver id in prewarm tickle.");
                String str3 = (String) aoiqVar.c().get("id_hash");
                if (str3 == null) {
                    ((alvg) ((alvg) alviVar.i()).h("com/google/android/apps/messaging/shared/rcs/performance/PrewarmTickleHandler", "onMessageReceived", 116, "PrewarmTickleHandler.java")).q("Tickle was missing id_hash");
                } else {
                    iji ijiVar = (iji) this.f.b();
                    int i = ambp.a;
                    ambk ambkVar = ambm.a;
                    amcn amcnVar = amcn.h;
                    znj znjVar = (znj) ijiVar.b.b();
                    aiwl a2 = wus.a();
                    a2.i(wuk.TACHYON_PHONE);
                    a2.k(vee.a);
                    a2.h(new toe(19));
                    a2.g(true);
                    aluq listIterator = znjVar.ab(a2.f()).k().keySet().listIterator();
                    while (true) {
                        if (!listIterator.hasNext()) {
                            break;
                        }
                        String str4 = (String) listIterator.next();
                        if (amcnVar.f().j(ambkVar.c(str4, StandardCharsets.US_ASCII).e()).equals(str3)) {
                            str2 = str4;
                            break;
                        }
                    }
                    if (str2 == null) {
                        ((alvg) ((alvg) b.i()).h("com/google/android/apps/messaging/shared/rcs/performance/PrewarmTickleHandler", "onMessageReceived", 122, "PrewarmTickleHandler.java")).q("Unable to find PN for id_hash.");
                    } else {
                        aozy createBuilder = aqfn.a.createBuilder();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        apag apagVar = createBuilder.b;
                        ((aqfn) apagVar).d = "RCS";
                        if (!apagVar.isMutable()) {
                            createBuilder.u();
                        }
                        apag apagVar2 = createBuilder.b;
                        ((aqfn) apagVar2).c = str2;
                        asku askuVar = asku.PHONE_NUMBER;
                        if (!apagVar2.isMutable()) {
                            createBuilder.u();
                        }
                        ((aqfn) createBuilder.b).b = askuVar.a();
                        aqfnVar = (aqfn) createBuilder.s();
                    }
                }
                e.close();
            }
            aqfn aqfnVar2 = aqfnVar;
            String str5 = (String) aoiqVar.c().get("tickle");
            if (str5 == null) {
                ((alvg) ((alvg) b.i()).h("com/google/android/apps/messaging/shared/rcs/performance/PrewarmTickleHandler", "onMessageReceived", 135, "PrewarmTickleHandler.java")).q("Received null tickle id in prewarm tickle.");
            } else {
                int b2 = aoiqVar.b();
                int a3 = aoiqVar.a();
                if (this.d.isEmpty()) {
                    ((alvg) ((alvg) b.g()).h("com/google/android/apps/messaging/shared/rcs/performance/PrewarmTickleHandler", "onTickleReceivedInSpan", 73, "PrewarmTickleHandler.java")).q("Ignore received Firebase message because TachyonReceiverManager is not present.");
                } else {
                    if (!vht.d()) {
                        ((alvg) ((alvg) b.g()).h("com/google/android/apps/messaging/shared/rcs/performance/PrewarmTickleHandler", "onTickleReceivedInSpan", 79, "PrewarmTickleHandler.java")).q("Ignore phone tickle when phone registration is not enabled.");
                    } else {
                        yyt yytVar = (yyt) this.g.b();
                        atok ba = yyb.ba();
                        aozy createBuilder2 = asgx.a.createBuilder();
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        apag apagVar3 = createBuilder2.b;
                        asgx asgxVar = (asgx) apagVar3;
                        ba.getClass();
                        asgxVar.c = ba;
                        asgxVar.b = 1 | asgxVar.b;
                        if (!apagVar3.isMutable()) {
                            createBuilder2.u();
                        }
                        ((asgx) createBuilder2.b).e = a.aq(5);
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        ((asgx) createBuilder2.b).g = arsd.at(48);
                        aozy createBuilder3 = asgv.a.createBuilder();
                        if (!createBuilder3.b.isMutable()) {
                            createBuilder3.u();
                        }
                        asgv asgvVar = (asgv) createBuilder3.b;
                        apax apaxVar = asgvVar.b;
                        if (!apaxVar.c()) {
                            asgvVar.b = apag.mutableCopy(apaxVar);
                        }
                        asgvVar.b.add(str5);
                        asgv asgvVar2 = (asgv) createBuilder3.s();
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        asgx asgxVar2 = (asgx) createBuilder2.b;
                        asgvVar2.getClass();
                        asgxVar2.d = asgvVar2;
                        asgxVar2.b |= 2;
                        if (yad.a(ba)) {
                            yytVar.V(createBuilder2);
                        }
                        this.c.c("Bugle.PhoneIdentity.Prewarm.FcmPush");
                        this.e.b(str5, aqfnVar2, new weh(this.i, 4), new wax(13), "Prewarm", uvf.c(b2, a3), true, ((Boolean) xct.a.e()).booleanValue(), ((Boolean) xct.b.e()).booleanValue(), ((Boolean) xct.c.e()).booleanValue());
                    }
                }
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.uun
    public final void b() {
    }

    @Override // defpackage.uun
    public final void c() {
    }
}
