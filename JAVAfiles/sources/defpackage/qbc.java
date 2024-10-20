package defpackage;

import j$.util.Collection;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qbc implements qby {
    public static final /* synthetic */ int b = 0;
    private static final alwo c = alwo.o("BugleGroupManagement");
    public final armf a;
    private final armf d;
    private final msk e;

    public qbc(armf armfVar, armf armfVar2, msk mskVar) {
        this.a = armfVar;
        this.d = armfVar2;
        this.e = mskVar;
    }

    @Override // defpackage.qby
    public final /* synthetic */ qfl a(Object obj, qbs qbsVar) {
        qez qezVar = (qez) obj;
        d.t(qezVar.d.equals(qbsVar.f), "Mismatch between the RCS conversation Id from the GroupFullState and ConversationsTable");
        Stream filter = Collection.EL.stream(((rtz) this.d.b()).aq(qbsVar.a)).filter(new nfp(6));
        qbb qbbVar = new qbb(0);
        msk mskVar = this.e;
        mskVar.getClass();
        alor alorVar = (alor) filter.collect(alls.a(qbbVar, new ptm(mskVar, 11)));
        qev qevVar = qezVar.j;
        if (qevVar == null) {
            qevVar = qev.a;
        }
        qeu b2 = qeu.b(qevVar.c);
        if (b2 == null) {
            b2 = qeu.CAUSE_UNSPECIFIED;
        }
        if (b2.equals(qeu.CAUSE_ONLY_SELF_IN_GROUP)) {
            alnu values = alorVar.values();
            aozy createBuilder = qfg.a.createBuilder();
            Stream map = Collection.EL.stream(values).map(new ptm(this, 10)).map(new qbb(1));
            createBuilder.getClass();
            map.forEach(new ptf(createBuilder, 11));
            if (((qfg) createBuilder.b).c.size() > 0) {
                alwl alwlVar = (alwl) c.g();
                alwlVar.X(ydl.o, qbsVar.a.toString());
                alwlVar.X(ydl.I, qbsVar.f);
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateParticipantsConverter", "buildGroupUpdateToRemoveAllParticipants", 326, "GroupFullStateParticipantsConverter.java")).r("Group full state notification will remove %s participant(s) from the group in self only error state.", ((qfg) createBuilder.b).c.size());
            }
            aozy createBuilder2 = qfl.a.createBuilder();
            String str = qbsVar.f;
            str.getClass();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar = createBuilder2.b;
            qfl qflVar = (qfl) apagVar;
            qflVar.b = 1 | qflVar.b;
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
        alor alorVar2 = (alor) Collection.EL.stream(((rtz) this.d.b()).x(qbsVar.a)).filter(new nfp(7)).collect(alls.a(new qbb(2), new qbb(3)));
        alok alokVar = new alok();
        for (qff qffVar : qezVar.g) {
            qei qeiVar = qffVar.c;
            if (qeiVar == null) {
                qeiVar = qei.a;
            }
            qeh qehVar = qeh.PHONE;
            qeh b3 = qeh.b(qeiVar.c);
            if (b3 == null) {
                b3 = qeh.UNKNOWN_TYPE;
            }
            if (!qehVar.equals(b3)) {
                alwl alwlVar2 = (alwl) ((alwl) c.i()).h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateParticipantsConverter", "toGroupUpdate", 110, "GroupFullStateParticipantsConverter.java");
                qeh b4 = qeh.b(qeiVar.c);
                if (b4 == null) {
                    b4 = qeh.UNKNOWN_TYPE;
                }
                alwlVar2.D("Group participant does not have a ChatEndpoint of type Phone. Type: %s. ID: %s.", b4.name(), yyb.bh(qeiVar.d));
            } else {
                alokVar.h(qeiVar.d, qffVar);
            }
        }
        alor b5 = alokVar.b();
        aozy createBuilder3 = qfg.a.createBuilder();
        aluq it = alzz.H(alorVar.keySet(), b5.keySet()).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            qff qffVar2 = (qff) b5.get(str2);
            qffVar2.getClass();
            qfe qfeVar = qfe.DEPARTED;
            qfe b6 = qfe.b(qffVar2.d);
            if (b6 == null) {
                b6 = qfe.UNKNOWN_STATE;
            }
            if (qfeVar.equals(b6)) {
                alvw m = c.m();
                m.X(ydl.o, qbsVar.a.toString());
                m.X(ydl.I, qbsVar.f);
                alvz alvzVar = ydl.n;
                qei qeiVar2 = qffVar2.c;
                if (qeiVar2 == null) {
                    qeiVar2 = qei.a;
                }
                m.X(alvzVar, yyb.bh(qeiVar2.d));
                alwl alwlVar3 = (alwl) m.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateParticipantsConverter", "updateBuilderWithParticipantsPresentOnClientAndServer", 169, "GroupFullStateParticipantsConverter.java");
                qfe b7 = qfe.b(qffVar2.d);
                if (b7 == null) {
                    b7 = qfe.UNKNOWN_STATE;
                }
                alwlVar3.t("Found a departed server participant. Generating remove participant GroupOperation. Participant status: %s", b7);
                aozy createBuilder4 = qfw.a.createBuilder();
                qei qeiVar3 = qffVar2.c;
                if (qeiVar3 == null) {
                    qeiVar3 = qei.a;
                }
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                qfw qfwVar = (qfw) createBuilder4.b;
                qeiVar3.getClass();
                qfwVar.c = qeiVar3;
                qfwVar.b |= 1;
                qfm qfmVar = qffVar2.e;
                if (qfmVar == null) {
                    qfmVar = qfm.a;
                }
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                qfw qfwVar2 = (qfw) createBuilder4.b;
                qfmVar.getClass();
                qfwVar2.d = qfmVar;
                qfwVar2.b |= 2;
                createBuilder3.bj(createBuilder4);
            } else {
                qfe b8 = qfe.b(qffVar2.d);
                if (b8 == null) {
                    b8 = qfe.UNKNOWN_STATE;
                }
                if (!b8.equals(alorVar2.get(str2))) {
                    alvw m2 = c.m();
                    m2.X(ydl.o, qbsVar.a.toString());
                    m2.X(ydl.I, qbsVar.f);
                    alvz alvzVar2 = ydl.n;
                    qei qeiVar4 = qffVar2.c;
                    if (qeiVar4 == null) {
                        qeiVar4 = qei.a;
                    }
                    m2.X(alvzVar2, yyb.bh(qeiVar4.d));
                    alwl alwlVar4 = (alwl) m2.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateParticipantsConverter", "updateBuilderWithParticipantsPresentOnClientAndServer", 190, "GroupFullStateParticipantsConverter.java");
                    qfe b9 = qfe.b(qffVar2.d);
                    if (b9 == null) {
                        b9 = qfe.UNKNOWN_STATE;
                    }
                    alwlVar4.t("Found an updated server participant. Generating update participant GroupOperation. Participant status: %s", b9);
                    aozy createBuilder5 = qgy.a.createBuilder();
                    qei qeiVar5 = qffVar2.c;
                    if (qeiVar5 == null) {
                        qeiVar5 = qei.a;
                    }
                    if (!createBuilder5.b.isMutable()) {
                        createBuilder5.u();
                    }
                    apag apagVar2 = createBuilder5.b;
                    qgy qgyVar = (qgy) apagVar2;
                    qeiVar5.getClass();
                    qgyVar.c = qeiVar5;
                    qgyVar.b |= 1;
                    qfe b10 = qfe.b(qffVar2.d);
                    if (b10 == null) {
                        b10 = qfe.UNKNOWN_STATE;
                    }
                    if (!apagVar2.isMutable()) {
                        createBuilder5.u();
                    }
                    qgy qgyVar2 = (qgy) createBuilder5.b;
                    qgyVar2.d = b10.e;
                    qgyVar2.b |= 2;
                    qfm qfmVar2 = qffVar2.e;
                    if (qfmVar2 == null) {
                        qfmVar2 = qfm.a;
                    }
                    if (!createBuilder5.b.isMutable()) {
                        createBuilder5.u();
                    }
                    qgy qgyVar3 = (qgy) createBuilder5.b;
                    qfmVar2.getClass();
                    qgyVar3.e = qfmVar2;
                    qgyVar3.b |= 4;
                    if (!createBuilder3.b.isMutable()) {
                        createBuilder3.u();
                    }
                    qfg qfgVar2 = (qfg) createBuilder3.b;
                    qgy qgyVar4 = (qgy) createBuilder5.s();
                    qgyVar4.getClass();
                    apax apaxVar = qfgVar2.d;
                    if (!apaxVar.c()) {
                        qfgVar2.d = apag.mutableCopy(apaxVar);
                    }
                    qfgVar2.d.add(qgyVar4);
                } else {
                    alvw m3 = c.m();
                    m3.X(ydl.o, qbsVar.a.toString());
                    m3.X(ydl.I, qbsVar.f);
                    alvz alvzVar3 = ydl.n;
                    qei qeiVar6 = qffVar2.c;
                    if (qeiVar6 == null) {
                        qeiVar6 = qei.a;
                    }
                    m3.X(alvzVar3, yyb.bh(qeiVar6.d));
                    ((alwl) m3.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateParticipantsConverter", "updateBuilderWithParticipantsPresentOnClientAndServer", 210, "GroupFullStateParticipantsConverter.java")).q("Found a participant present on both the server and the client.");
                }
            }
        }
        aluq it2 = alzz.G(b5.keySet(), alorVar.keySet()).iterator();
        while (it2.hasNext()) {
            qff qffVar3 = (qff) b5.get((String) it2.next());
            qffVar3.getClass();
            qfe qfeVar2 = qfe.JOINED;
            qfe b11 = qfe.b(qffVar3.d);
            if (b11 == null) {
                b11 = qfe.UNKNOWN_STATE;
            }
            if (!qfeVar2.equals(b11)) {
                qfe qfeVar3 = qfe.PENDING;
                qfe b12 = qfe.b(qffVar3.d);
                if (b12 == null) {
                    b12 = qfe.UNKNOWN_STATE;
                }
                if (!qfeVar3.equals(b12)) {
                    qfe qfeVar4 = qfe.UNKNOWN_STATE;
                    qfe b13 = qfe.b(qffVar3.d);
                    if (b13 == null) {
                        b13 = qfeVar4;
                    }
                    if (!qfeVar4.equals(b13)) {
                        alvw m4 = c.m();
                        m4.X(ydl.o, qbsVar.a.toString());
                        m4.X(ydl.I, qbsVar.f);
                        alvz alvzVar4 = ydl.n;
                        qei qeiVar7 = qffVar3.c;
                        if (qeiVar7 == null) {
                            qeiVar7 = qei.a;
                        }
                        m4.X(alvzVar4, yyb.bh(qeiVar7.d));
                        ((alwl) m4.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateParticipantsConverter", "updateBuilderWithParticipantsOnServerButNotOnClient", 260, "GroupFullStateParticipantsConverter.java")).q("Found a departed server participant not present on the client. Ignoring participant.");
                    }
                }
            }
            alvw m5 = c.m();
            m5.X(ydl.o, qbsVar.a.toString());
            m5.X(ydl.I, qbsVar.f);
            alvz alvzVar5 = ydl.n;
            qei qeiVar8 = qffVar3.c;
            if (qeiVar8 == null) {
                qeiVar8 = qei.a;
            }
            m5.X(alvzVar5, yyb.bh(qeiVar8.d));
            alwl alwlVar5 = (alwl) m5.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateParticipantsConverter", "updateBuilderWithParticipantsOnServerButNotOnClient", 240, "GroupFullStateParticipantsConverter.java");
            qfe b14 = qfe.b(qffVar3.d);
            if (b14 == null) {
                b14 = qfe.UNKNOWN_STATE;
            }
            alwlVar5.t("Found a server participant not present on the client. Generating add participant GroupEvent. Participant status: %s", b14);
            aozy createBuilder6 = qea.a.createBuilder();
            qei qeiVar9 = qffVar3.c;
            if (qeiVar9 == null) {
                qeiVar9 = qei.a;
            }
            if (!createBuilder6.b.isMutable()) {
                createBuilder6.u();
            }
            apag apagVar3 = createBuilder6.b;
            qea qeaVar = (qea) apagVar3;
            qeiVar9.getClass();
            qeaVar.c = qeiVar9;
            qeaVar.b |= 1;
            qfe b15 = qfe.b(qffVar3.d);
            if (b15 == null) {
                b15 = qfe.UNKNOWN_STATE;
            }
            if (!apagVar3.isMutable()) {
                createBuilder6.u();
            }
            qea qeaVar2 = (qea) createBuilder6.b;
            qeaVar2.e = b15.e;
            qeaVar2.b |= 4;
            qfm qfmVar3 = qffVar3.e;
            if (qfmVar3 == null) {
                qfmVar3 = qfm.a;
            }
            if (!createBuilder6.b.isMutable()) {
                createBuilder6.u();
            }
            qea qeaVar3 = (qea) createBuilder6.b;
            qfmVar3.getClass();
            qeaVar3.d = qfmVar3;
            qeaVar3.b |= 2;
            createBuilder3.bi(createBuilder6);
        }
        aluq it3 = alzz.G(alorVar.keySet(), b5.keySet()).iterator();
        while (it3.hasNext()) {
            String str3 = (String) it3.next();
            alvw m6 = c.m();
            m6.X(ydl.o, qbsVar.a.toString());
            m6.X(ydl.I, qbsVar.f);
            m6.X(ydl.n, yyb.bh(str3));
            ((alwl) m6.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateParticipantsConverter", "updateBuilderWithParticipantsOnClientButNotOnServer", 285, "GroupFullStateParticipantsConverter.java")).q("Found a client participant not present on the server. Generating remove participant GroupEvent.");
            aozy createBuilder7 = qfw.a.createBuilder();
            psq psqVar = (psq) this.a.b();
            msh mshVar = (msh) alorVar.get(str3);
            mshVar.getClass();
            qei e = psqVar.e(mshVar, str3);
            if (!createBuilder7.b.isMutable()) {
                createBuilder7.u();
            }
            qfw qfwVar3 = (qfw) createBuilder7.b;
            e.getClass();
            qfwVar3.c = e;
            qfwVar3.b |= 1;
            createBuilder3.bj(createBuilder7);
        }
        aozy createBuilder8 = qfl.a.createBuilder();
        String str4 = qezVar.d;
        if (!createBuilder8.b.isMutable()) {
            createBuilder8.u();
        }
        apag apagVar4 = createBuilder8.b;
        qfl qflVar3 = (qfl) apagVar4;
        str4.getClass();
        qflVar3.b = 1 | qflVar3.b;
        qflVar3.c = str4;
        if (!apagVar4.isMutable()) {
            createBuilder8.u();
        }
        qfl qflVar4 = (qfl) createBuilder8.b;
        qfg qfgVar3 = (qfg) createBuilder3.s();
        qfgVar3.getClass();
        qflVar4.e = qfgVar3;
        qflVar4.b |= 4;
        return (qfl) createBuilder8.s();
    }
}
