package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class waw {
    public static final alwo a = alwo.o("BugleRcs");
    public final qco b;
    private final anen c;
    private final wav d;

    public waw(anen anenVar, wav wavVar, qco qcoVar) {
        this.c = anenVar;
        this.d = wavVar;
        this.b = qcoVar;
    }

    public final akul a(final qeg qegVar, final String str) {
        wav wavVar = this.d;
        armf armfVar = wavVar.d;
        akul c = wavVar.c.c();
        psq psqVar = (psq) armfVar.b();
        psqVar.getClass();
        return c.h(new vuu(psqVar, 20), wavVar.b).i(new ancs() { // from class: wau
            @Override // defpackage.ancs
            public final ListenableFuture a(Object obj) {
                qeg qegVar2 = qeg.this;
                qei qeiVar = (qei) obj;
                qee b = qee.b(qegVar2.d);
                if (b == null) {
                    b = qee.UNKNOWN_CAUSE;
                }
                String str2 = str;
                int ordinal = b.ordinal();
                if (ordinal != 2) {
                    if (ordinal != 4) {
                        if (ordinal != 8) {
                            alvw n = wav.a.n();
                            n.X(qas.a, qegVar2);
                            ((alwl) n.h("com/google/android/apps/messaging/shared/rcs/messaging/emitter/ResponseGroupEventEmitter", "emitGroupEventForWithSelfChatEndpoint", 86, "ResponseGroupEventEmitter.java")).q("ResponseGroupEventEmitter no GroupEvent to emit for cause");
                            return aktp.ag(Optional.empty());
                        }
                        ((alwl) wav.a.m().h("com/google/android/apps/messaging/shared/rcs/messaging/emitter/ResponseGroupEventEmitter", "emitForGroupNotFound", 130, "ResponseGroupEventEmitter.java")).q("Emitting GroupEvent for GROUP_NOT_FOUND");
                        aozy createBuilder = qey.c.createBuilder();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        qey qeyVar = (qey) createBuilder.b;
                        qeyVar.d |= 1;
                        qeyVar.e = str2;
                        aozy createBuilder2 = qev.a.createBuilder();
                        qeu qeuVar = qeu.CAUSE_GROUP_NOT_FOUND;
                        if (!createBuilder2.b.isMutable()) {
                            createBuilder2.u();
                        }
                        qev qevVar = (qev) createBuilder2.b;
                        qevVar.c = qeuVar.d;
                        qevVar.b |= 1;
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        qey qeyVar2 = (qey) createBuilder.b;
                        qev qevVar2 = (qev) createBuilder2.s();
                        qevVar2.getClass();
                        qeyVar2.p = qevVar2;
                        qeyVar2.d |= 128;
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        qey qeyVar3 = (qey) createBuilder.b;
                        qeiVar.getClass();
                        qeyVar3.q = qeiVar;
                        qeyVar3.d |= 256;
                        return aktp.ag(Optional.of((qey) createBuilder.s()));
                    }
                    aozy createBuilder3 = qey.c.createBuilder();
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    apag apagVar = createBuilder3.b;
                    qey qeyVar4 = (qey) apagVar;
                    qeyVar4.d |= 1;
                    qeyVar4.e = str2;
                    if (!apagVar.isMutable()) {
                        createBuilder3.u();
                    }
                    qey qeyVar5 = (qey) createBuilder3.b;
                    qeiVar.getClass();
                    qeyVar5.q = qeiVar;
                    qeyVar5.d |= 256;
                    createBuilder3.D(qeiVar);
                    return aktp.ag(Optional.of((qey) createBuilder3.s()));
                }
                ((alwl) wav.a.m().h("com/google/android/apps/messaging/shared/rcs/messaging/emitter/ResponseGroupEventEmitter", "emitForGroupTooFewParticipants", 97, "ResponseGroupEventEmitter.java")).q("Emitting GroupEvent for GROUP_TOO_FEW_PARTICIPANTS");
                aozy createBuilder4 = qey.c.createBuilder();
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                qey qeyVar6 = (qey) createBuilder4.b;
                qeyVar6.d |= 1;
                qeyVar6.e = str2;
                aozy createBuilder5 = qev.a.createBuilder();
                qeu qeuVar2 = qeu.CAUSE_ONLY_SELF_IN_GROUP;
                if (!createBuilder5.b.isMutable()) {
                    createBuilder5.u();
                }
                qev qevVar3 = (qev) createBuilder5.b;
                qevVar3.c = qeuVar2.d;
                qevVar3.b |= 1;
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                qey qeyVar7 = (qey) createBuilder4.b;
                qev qevVar4 = (qev) createBuilder5.s();
                qevVar4.getClass();
                qeyVar7.p = qevVar4;
                qeyVar7.d |= 128;
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                qey qeyVar8 = (qey) createBuilder4.b;
                qeiVar.getClass();
                qeyVar8.q = qeiVar;
                qeyVar8.d |= 256;
                return aktp.ag(Optional.of((qey) createBuilder4.s()));
            }
        }, wavVar.b).i(new vek(this, 18), this.c);
    }
}
