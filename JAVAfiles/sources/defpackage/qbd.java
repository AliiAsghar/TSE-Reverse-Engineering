package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qbd implements qby {
    public static final /* synthetic */ int a = 0;
    private static final alwo b = alwo.o("BugleGroupManagement");
    private final qbx c;
    private final armf d;

    public qbd(qbx qbxVar, armf armfVar) {
        this.c = qbxVar;
        this.d = armfVar;
    }

    public static qfh b(qff qffVar) {
        qfe qfeVar = qfe.DEPARTED;
        qfe b2 = qfe.b(qffVar.d);
        if (b2 == null) {
            b2 = qfe.UNKNOWN_STATE;
        }
        if (qfeVar.equals(b2)) {
            qei qeiVar = qffVar.c;
            if (qeiVar == null) {
                qeiVar = qei.a;
            }
            qfm qfmVar = qffVar.e;
            if (qfmVar == null) {
                qfmVar = qfm.a;
            }
            qei qeiVar2 = qfmVar.c;
            if (qeiVar2 == null) {
                qeiVar2 = qei.a;
            }
            if (qeiVar.equals(qeiVar2)) {
                return qfh.LEFT_GROUP;
            }
            return qfh.KICKED_OUT;
        }
        return qfh.MEMBERSHIP_CONFIRMED;
    }

    @Override // defpackage.qby
    public final /* synthetic */ qfl a(Object obj, qbs qbsVar) {
        qei qeiVar;
        qez qezVar = (qez) obj;
        aozy createBuilder = qfl.a.createBuilder();
        String a2 = qbsVar.a.a();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qfl qflVar = (qfl) createBuilder.b;
        a2.getClass();
        qflVar.b |= 1;
        qflVar.c = a2;
        aozy createBuilder2 = qfi.a.createBuilder();
        if (((okf) this.d.b()).a()) {
            qei qeiVar2 = qezVar.k;
            if (qeiVar2 == null) {
                qeiVar2 = qei.a;
            }
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            qfl qflVar2 = (qfl) createBuilder.b;
            qeiVar2.getClass();
            qflVar2.k = qeiVar2;
            qflVar2.b |= 256;
            Stream map = Collection.EL.stream(qezVar.g).filter(new nfp(8)).map(new qbb(4));
            int i = alog.d;
            alog alogVar = (alog) map.collect(alls.a);
            Optional b2 = this.c.b(alogVar, qbsVar);
            createBuilder2.getClass();
            b2.ifPresent(new ptf(createBuilder2, 12));
            this.c.a(alogVar, qbsVar).ifPresent(new ptf(createBuilder2, 13));
        } else {
            Optional c = qbx.c(qbsVar);
            createBuilder2.getClass();
            c.ifPresent(new ptf(createBuilder2, 12));
        }
        for (qff qffVar : qezVar.g) {
            if (((okf) this.d.b()).a()) {
                qeiVar = qezVar.k;
                if (qeiVar == null) {
                    qeiVar = qei.a;
                }
            } else {
                qeiVar = qbsVar.j;
            }
            qei qeiVar3 = qffVar.c;
            if (qeiVar3 == null) {
                qeiVar3 = qei.a;
            }
            if (qeiVar.equals(qeiVar3)) {
                qfh b3 = b(qffVar);
                alvw m = b.m();
                m.X(ydl.o, qbsVar.a.toString());
                m.X(ydl.I, qbsVar.f);
                ((alwl) m.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateSelfMembershipConverter", "toGroupUpdate", 98, "GroupFullStateSelfMembershipConverter.java")).t("Explicit self participant membership state found %s", b3);
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                qfi qfiVar = (qfi) createBuilder2.b;
                qfiVar.c = b3.e;
                qfiVar.b |= 1;
                qfm qfmVar = qfm.a;
                qfm qfmVar2 = qffVar.e;
                if (qfmVar2 == null) {
                    qfmVar2 = qfmVar;
                }
                if (!qfmVar.equals(qfmVar2)) {
                    qfm qfmVar3 = qffVar.e;
                    if (qfmVar3 == null) {
                        qfmVar3 = qfm.a;
                    }
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    qfi qfiVar2 = (qfi) createBuilder2.b;
                    qfmVar3.getClass();
                    qfiVar2.d = qfmVar3;
                    qfiVar2.b |= 2;
                }
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                qfl qflVar3 = (qfl) createBuilder.b;
                qfi qfiVar3 = (qfi) createBuilder2.s();
                qfiVar3.getClass();
                qflVar3.h = qfiVar3;
                qflVar3.b |= 32;
                return (qfl) createBuilder.s();
            }
        }
        qfh qfhVar = qfh.KICKED_OUT;
        alvw m2 = b.m();
        m2.X(ydl.o, qbsVar.a.toString());
        m2.X(ydl.I, qbsVar.f);
        ((alwl) m2.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateSelfMembershipConverter", "toGroupUpdate", 120, "GroupFullStateSelfMembershipConverter.java")).q("Explicit self participant membership state not found. Assuming has been removed from the group.");
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        qfi qfiVar4 = (qfi) createBuilder2.b;
        qfiVar4.c = qfhVar.e;
        qfiVar4.b |= 1;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qfl qflVar4 = (qfl) createBuilder.b;
        qfi qfiVar5 = (qfi) createBuilder2.s();
        qfiVar5.getClass();
        qflVar4.h = qfiVar5;
        qflVar4.b |= 32;
        return (qfl) createBuilder.s();
    }
}
