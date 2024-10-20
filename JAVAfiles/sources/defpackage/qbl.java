package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qbl implements qby {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventSelfMembershipConverter");
    public final armf b;
    private final qbx c;
    private final armf d;
    private final armf e;

    public qbl(qbx qbxVar, armf armfVar, armf armfVar2, armf armfVar3) {
        this.c = qbxVar;
        this.d = armfVar;
        this.e = armfVar2;
        this.b = armfVar3;
    }

    @Override // defpackage.qby
    public final /* synthetic */ qfl a(Object obj, qbs qbsVar) {
        qei qeiVar;
        qfh qfhVar;
        qey qeyVar = (qey) obj;
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
        if (((okf) this.e.b()).a()) {
            qei qeiVar2 = qeyVar.q;
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
            Stream[] streamArr = new Stream[3];
            streamArr[0] = Collection.EL.stream(((rtz) this.d.b()).x(qbsVar.a)).filter(new nfp(10)).map(new qbb(6)).map(new ptm(this, 14)).filter(new nfp(11)).map(new qbb(7));
            streamArr[1] = Collection.EL.stream(qeyVar.f);
            qei qeiVar3 = qeyVar.q;
            if (qeiVar3 == null) {
                qeiVar3 = qei.a;
            }
            streamArr[2] = Stream.CC.of(qeiVar3);
            alpt o = alpt.o(alzz.G((Set) Stream.CC.of((Object[]) streamArr).flatMap(new qbb(8)).collect(alls.b), alpt.o(qeyVar.g)));
            Optional b = this.c.b(o, qbsVar);
            createBuilder2.getClass();
            b.ifPresent(new ptf(createBuilder2, 15));
            this.c.a(o, qbsVar).map(new qbb(9)).ifPresent(new ptf(createBuilder2, 16));
            qei qeiVar4 = qeyVar.q;
            if (qeiVar4 == null) {
                qeiVar4 = qei.a;
            }
            qei qeiVar5 = ((qfi) createBuilder2.b).e;
            if (qeiVar5 == null) {
                qeiVar5 = qei.a;
            }
            if (!o.contains(qeiVar4) && !qeiVar5.equals(qeiVar4) && !qbsVar.j.equals(qeiVar4)) {
                alvw d = a.d();
                d.X(alwp.a, "BugleGroupManagement");
                alvg alvgVar = (alvg) d;
                alvgVar.X(ydl.p, qbsVar.a);
                alvgVar.X(ydl.I, qbsVar.f);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventSelfMembershipConverter", "toGroupUpdate", 109, "GroupEventSelfMembershipConverter.java")).t("Self participant is not member of the group, returning %s", qfh.UNKNOWN_STATE);
                qfh qfhVar2 = qfh.UNKNOWN_STATE;
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                qfi qfiVar = (qfi) createBuilder2.b;
                qfiVar.c = qfhVar2.e;
                qfiVar.b |= 1;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                qfl qflVar3 = (qfl) createBuilder.b;
                qfi qfiVar2 = (qfi) createBuilder2.s();
                qfiVar2.getClass();
                qflVar3.h = qfiVar2;
                qflVar3.b |= 32;
                return (qfl) createBuilder.s();
            }
        } else {
            Optional c = qbx.c(qbsVar);
            createBuilder2.getClass();
            c.ifPresent(new ptf(createBuilder2, 15));
        }
        if (((okf) this.e.b()).a()) {
            qeiVar = qeyVar.q;
            if (qeiVar == null) {
                qeiVar = qei.a;
            }
        } else {
            qeiVar = qbsVar.j;
        }
        Iterator<E> it = qeyVar.g.iterator();
        while (it.hasNext()) {
            if (qeiVar.equals((qei) it.next())) {
                qfm qfmVar = qeyVar.o;
                if (qfmVar == null) {
                    qfmVar = qfm.a;
                }
                qei qeiVar6 = qfmVar.c;
                if (qeiVar6 == null) {
                    qeiVar6 = qei.a;
                }
                if (qeiVar.equals(qeiVar6)) {
                    qfhVar = qfh.LEFT_GROUP;
                } else {
                    qfhVar = qfh.KICKED_OUT;
                }
                alvw d2 = a.d();
                d2.X(alwp.a, "BugleGroupManagement");
                alvg alvgVar2 = (alvg) d2;
                alvgVar2.X(ydl.p, qbsVar.a);
                alvgVar2.X(ydl.I, qbsVar.f);
                ((alvg) alvgVar2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventSelfMembershipConverter", "toGroupUpdate", 140, "GroupEventSelfMembershipConverter.java")).t("Self participant membership changed, reason %s", qfhVar);
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                qfi qfiVar3 = (qfi) createBuilder2.b;
                qfiVar3.c = qfhVar.e;
                qfiVar3.b |= 1;
                qfm qfmVar2 = qfm.a;
                qfm qfmVar3 = qeyVar.o;
                if (qfmVar3 == null) {
                    qfmVar3 = qfmVar2;
                }
                if (!qfmVar2.equals(qfmVar3)) {
                    qfm qfmVar4 = qeyVar.o;
                    if (qfmVar4 == null) {
                        qfmVar4 = qfm.a;
                    }
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    qfi qfiVar4 = (qfi) createBuilder2.b;
                    qfmVar4.getClass();
                    qfiVar4.d = qfmVar4;
                    qfiVar4.b |= 2;
                }
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
        qfh qfhVar3 = qfh.UNKNOWN_STATE;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        qfi qfiVar6 = (qfi) createBuilder2.b;
        qfiVar6.c = qfhVar3.e;
        qfiVar6.b |= 1;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qfl qflVar5 = (qfl) createBuilder.b;
        qfi qfiVar7 = (qfi) createBuilder2.s();
        qfiVar7.getClass();
        qflVar5.h = qfiVar7;
        qflVar5.b |= 32;
        return (qfl) createBuilder.s();
    }
}
