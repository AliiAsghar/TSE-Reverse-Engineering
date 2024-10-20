package defpackage;

import j$.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qbi implements qby {
    public static final /* synthetic */ int a = 0;
    private static final alwo b = alwo.o("BugleGroupManagement");
    private static final qew c;
    private static final qew d;
    private static final qew e;
    private static final qew f;
    private final armf g;

    static {
        aozy createBuilder = qew.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        qew qewVar = (qew) createBuilder.b;
        qewVar.b |= 1;
        qewVar.c = false;
        c = (qew) createBuilder.s();
        aozy createBuilder2 = qew.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        qew qewVar2 = (qew) apagVar;
        qewVar2.b |= 1;
        qewVar2.c = true;
        qpd qpdVar = qpd.NONE;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        qew qewVar3 = (qew) createBuilder2.b;
        qewVar3.d = qpdVar.a();
        qewVar3.b |= 2;
        d = (qew) createBuilder2.s();
        aozy createBuilder3 = qew.a.createBuilder();
        if (!createBuilder3.b.isMutable()) {
            createBuilder3.u();
        }
        apag apagVar2 = createBuilder3.b;
        qew qewVar4 = (qew) apagVar2;
        qewVar4.b |= 1;
        qewVar4.c = true;
        qpd qpdVar2 = qpd.RCS_GROUP_SELF_ONLY;
        if (!apagVar2.isMutable()) {
            createBuilder3.u();
        }
        qew qewVar5 = (qew) createBuilder3.b;
        qewVar5.d = qpdVar2.a();
        qewVar5.b |= 2;
        e = (qew) createBuilder3.s();
        aozy createBuilder4 = qew.a.createBuilder();
        if (!createBuilder4.b.isMutable()) {
            createBuilder4.u();
        }
        apag apagVar3 = createBuilder4.b;
        qew qewVar6 = (qew) apagVar3;
        qewVar6.b |= 1;
        qewVar6.c = true;
        qpd qpdVar3 = qpd.RCS_GROUP_NOT_FOUND;
        if (!apagVar3.isMutable()) {
            createBuilder4.u();
        }
        qew qewVar7 = (qew) createBuilder4.b;
        qewVar7.d = qpdVar3.a();
        qewVar7.b |= 2;
        f = (qew) createBuilder4.s();
    }

    public qbi(armf armfVar) {
        this.g = armfVar;
    }

    private static void b(String str, qbs qbsVar) {
        alvw m = b.m();
        m.X(ydl.o, qbsVar.a.toString());
        m.X(ydl.I, qbsVar.f);
        ((alwl) m.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventErrorStateConverter", "logExistingErrorState", 247, "GroupEventErrorStateConverter.java")).D("#%s existing error state %s", str, qbsVar.m.name());
    }

    @Override // defpackage.qby
    public final /* synthetic */ qfl a(Object obj, qbs qbsVar) {
        qew qewVar;
        qei qeiVar;
        qey qeyVar = (qey) obj;
        d.t(qeyVar.e.equals(qbsVar.f), "GroupEvent conversation ID does not match database RCS group ID");
        qev qevVar = qeyVar.p;
        if (qevVar == null) {
            qevVar = qev.a;
        }
        alwo alwoVar = b;
        alvw n = alwoVar.n();
        n.X(ydl.o, qbsVar.a.toString());
        n.X(ydl.I, qbsVar.f);
        alwl alwlVar = (alwl) n.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventErrorStateConverter", "createGroupErrorStateChange", 93, "GroupEventErrorStateConverter.java");
        qeu b2 = qeu.b(qevVar.c);
        if (b2 == null) {
            b2 = qeu.CAUSE_UNSPECIFIED;
        }
        alwlVar.t("GroupEventErrorStateConverter with cause %s", b2);
        qeu b3 = qeu.b(qevVar.c);
        if (b3 == null) {
            b3 = qeu.CAUSE_UNSPECIFIED;
        }
        int ordinal = b3.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    alwl alwlVar2 = (alwl) alwoVar.i();
                    alwlVar2.X(ydl.o, qbsVar.a.toString());
                    alwlVar2.X(ydl.I, qbsVar.f);
                    alwl alwlVar3 = (alwl) alwlVar2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventErrorStateConverter", "createGroupErrorStateChange", 110, "GroupEventErrorStateConverter.java");
                    qeu b4 = qeu.b(qevVar.c);
                    if (b4 == null) {
                        b4 = qeu.CAUSE_UNSPECIFIED;
                    }
                    alwlVar3.r("GroupEventErrorStateConverter unrecognized cause %s", b4.d);
                    qewVar = c;
                } else {
                    qev qevVar2 = qeyVar.p;
                    if (qevVar2 == null) {
                        qevVar2 = qev.a;
                    }
                    qeu b5 = qeu.b(qevVar2.c);
                    if (b5 == null) {
                        b5 = qeu.CAUSE_UNSPECIFIED;
                    }
                    boolean equals = b5.equals(qeu.CAUSE_GROUP_NOT_FOUND);
                    qeu b6 = qeu.b(qevVar2.c);
                    if (b6 == null) {
                        b6 = qeu.CAUSE_UNSPECIFIED;
                    }
                    albo.N(equals, "#handleCauseGroupNotFound with wrong cause %s", b6);
                    b("handleCauseGroupNotFound", qbsVar);
                    if (qpd.RCS_GROUP_NOT_FOUND.equals(qbsVar.m)) {
                        qewVar = c;
                    } else {
                        qewVar = f;
                    }
                }
            } else {
                qev qevVar3 = qeyVar.p;
                if (qevVar3 == null) {
                    qevVar3 = qev.a;
                }
                qeu b7 = qeu.b(qevVar3.c);
                if (b7 == null) {
                    b7 = qeu.CAUSE_UNSPECIFIED;
                }
                boolean equals2 = b7.equals(qeu.CAUSE_ONLY_SELF_IN_GROUP);
                qeu b8 = qeu.b(qevVar3.c);
                if (b8 == null) {
                    b8 = qeu.CAUSE_UNSPECIFIED;
                }
                albo.N(equals2, "#handleCauseOnlySelfInGroup with wrong cause %s", b8);
                b("handleCauseOnlySelfInGroup", qbsVar);
                if (qpd.RCS_GROUP_SELF_ONLY.equals(qbsVar.m)) {
                    qewVar = c;
                } else {
                    qewVar = e;
                }
            }
        } else {
            qev qevVar4 = qeyVar.p;
            if (qevVar4 == null) {
                qevVar4 = qev.a;
            }
            qeu b9 = qeu.b(qevVar4.c);
            if (b9 == null) {
                b9 = qeu.CAUSE_UNSPECIFIED;
            }
            boolean equals3 = b9.equals(qeu.CAUSE_UNSPECIFIED);
            qeu b10 = qeu.b(qevVar4.c);
            if (b10 == null) {
                b10 = qeu.CAUSE_UNSPECIFIED;
            }
            albo.N(equals3, "#handleCauseUnspecified with wrong cause %s", b10);
            int ordinal2 = qbsVar.m.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    if (ordinal2 != 2 && ordinal2 != 3 && ordinal2 != 4) {
                        alwl alwlVar4 = (alwl) alwoVar.i();
                        alwlVar4.X(ydl.o, qbsVar.a.toString());
                        alwlVar4.X(ydl.I, qbsVar.f);
                        ((alwl) alwlVar4.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventErrorStateConverter", "handleCauseUnspecified", 164, "GroupEventErrorStateConverter.java")).r("#handleCauseUnspecified undefined existing error state %s", qbsVar.m.a());
                        qewVar = c;
                    }
                } else {
                    apax apaxVar = qeyVar.f;
                    if (((okf) this.g.b()).a()) {
                        qeiVar = qeyVar.q;
                        if (qeiVar == null) {
                            qeiVar = qei.a;
                        }
                    } else {
                        qeiVar = qbsVar.j;
                    }
                    if (Collection.EL.stream(apaxVar).anyMatch(new ncc(qeiVar, 11))) {
                        qewVar = d;
                    }
                }
            }
            qewVar = c;
        }
        aozy createBuilder = qfl.a.createBuilder();
        String str = qeyVar.e;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        qfl qflVar = (qfl) apagVar;
        str.getClass();
        qflVar.b |= 1;
        qflVar.c = str;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        qfl qflVar2 = (qfl) createBuilder.b;
        qewVar.getClass();
        qflVar2.i = qewVar;
        qflVar2.b |= 64;
        return (qfl) createBuilder.s();
    }
}
