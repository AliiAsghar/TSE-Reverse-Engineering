package defpackage;

import j$.util.Collection;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qbk implements qby {
    public static final /* synthetic */ int b = 0;
    private static final alwo c = alwo.o("BugleGroupManagement");
    public final armf a;
    private final armf d;
    private final msk e;

    public qbk(armf armfVar, msk mskVar, armf armfVar2) {
        this.d = armfVar;
        this.e = mskVar;
        this.a = armfVar2;
    }

    @Override // defpackage.qby
    public final /* synthetic */ qfl a(Object obj, qbs qbsVar) {
        qey qeyVar = (qey) obj;
        d.t(qeyVar.e.equals(qbsVar.f), "Mismatch between the RCS conversation Id from the GroupFullState and ConversationsTable");
        qev qevVar = qeyVar.p;
        if (qevVar == null) {
            qevVar = qev.a;
        }
        qeu b2 = qeu.b(qevVar.c);
        if (b2 == null) {
            b2 = qeu.CAUSE_UNSPECIFIED;
        }
        if (b2.equals(qeu.CAUSE_ONLY_SELF_IN_GROUP)) {
            aozy createBuilder = qfg.a.createBuilder();
            Stream filter = Collection.EL.stream(((rtz) this.d.b()).aq(qbsVar.a)).filter(new nfp(9));
            msk mskVar = this.e;
            mskVar.getClass();
            Stream map = filter.map(new ptm(mskVar, 12)).map(new ptm(this, 13)).map(new qbb(5));
            createBuilder.getClass();
            map.forEach(new ptf(createBuilder, 14));
            if (((qfg) createBuilder.b).c.size() > 0) {
                alwl alwlVar = (alwl) c.g();
                alwlVar.X(ydl.o, qbsVar.a.toString());
                alwlVar.X(ydl.I, qbsVar.f);
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventParticipantsConverter", "buildGroupUpdateToRemoveAllParticipants", 141, "GroupEventParticipantsConverter.java")).r("Group event will remove %s participant(s) from the group in self only error state.", ((qfg) createBuilder.b).c.size());
            }
            aozy createBuilder2 = qfl.a.createBuilder();
            String str = qbsVar.f;
            str.getClass();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar = createBuilder2.b;
            qfl qflVar = (qfl) apagVar;
            qflVar.b |= 1;
            qflVar.c = str;
            if (!apagVar.isMutable()) {
                createBuilder2.u();
            }
            qfl qflVar2 = (qfl) createBuilder2.b;
            qfg qfgVar = (qfg) createBuilder.s();
            qfgVar.getClass();
            qflVar2.e = qfgVar;
            qflVar2.b |= 4;
            return (qfl) createBuilder2.s();
        }
        aozy createBuilder3 = qfg.a.createBuilder();
        for (qei qeiVar : qeyVar.f) {
            alvw m = c.m();
            m.X(ydl.o, qbsVar.a.toString());
            m.X(ydl.I, qbsVar.f);
            m.X(ydl.n, yyb.bh(qeiVar.d));
            ((alwl) m.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventParticipantsConverter", "toGroupUpdate", 78, "GroupEventParticipantsConverter.java")).q("Participant from the server to add to the client.");
            aozy createBuilder4 = qea.a.createBuilder();
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            qea qeaVar = (qea) createBuilder4.b;
            qeiVar.getClass();
            qeaVar.c = qeiVar;
            qeaVar.b |= 1;
            qfm qfmVar = qeyVar.o;
            if (qfmVar == null) {
                qfmVar = qfm.a;
            }
            if (!createBuilder4.b.isMutable()) {
                createBuilder4.u();
            }
            qea qeaVar2 = (qea) createBuilder4.b;
            qfmVar.getClass();
            qeaVar2.d = qfmVar;
            qeaVar2.b |= 2;
            createBuilder3.bi(createBuilder4);
        }
        for (qei qeiVar2 : qeyVar.g) {
            alvw m2 = c.m();
            m2.X(ydl.o, qbsVar.a.toString());
            m2.X(ydl.I, qbsVar.f);
            m2.X(ydl.n, yyb.bh(qeiVar2.d));
            ((alwl) m2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventParticipantsConverter", "toGroupUpdate", 96, "GroupEventParticipantsConverter.java")).q("Participant from the server to remove from the client.");
            aozy createBuilder5 = qfw.a.createBuilder();
            if (!createBuilder5.b.isMutable()) {
                createBuilder5.u();
            }
            qfw qfwVar = (qfw) createBuilder5.b;
            qeiVar2.getClass();
            qfwVar.c = qeiVar2;
            qfwVar.b |= 1;
            qfm qfmVar2 = qeyVar.o;
            if (qfmVar2 == null) {
                qfmVar2 = qfm.a;
            }
            if (!createBuilder5.b.isMutable()) {
                createBuilder5.u();
            }
            qfw qfwVar2 = (qfw) createBuilder5.b;
            qfmVar2.getClass();
            qfwVar2.d = qfmVar2;
            qfwVar2.b |= 2;
            createBuilder3.bj(createBuilder5);
        }
        aozy createBuilder6 = qfl.a.createBuilder();
        String str2 = qbsVar.f;
        str2.getClass();
        if (!createBuilder6.b.isMutable()) {
            createBuilder6.u();
        }
        apag apagVar2 = createBuilder6.b;
        qfl qflVar3 = (qfl) apagVar2;
        qflVar3.b |= 1;
        qflVar3.c = str2;
        if (!apagVar2.isMutable()) {
            createBuilder6.u();
        }
        qfl qflVar4 = (qfl) createBuilder6.b;
        qfg qfgVar2 = (qfg) createBuilder3.s();
        qfgVar2.getClass();
        qflVar4.e = qfgVar2;
        qflVar4.b |= 4;
        return (qfl) createBuilder6.s();
    }
}
