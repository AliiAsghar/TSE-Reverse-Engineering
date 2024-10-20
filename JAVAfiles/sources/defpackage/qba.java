package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qba implements qby {
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

    public qba(armf armfVar) {
        this.g = armfVar;
    }

    private static void b(String str, qbs qbsVar) {
        alvw m = b.m();
        m.X(ydl.o, qbsVar.a.toString());
        m.X(ydl.I, qbsVar.f);
        ((alwl) m.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateErrorStateConverter", "logExistingErrorState", 251, "GroupFullStateErrorStateConverter.java")).D("#%s existing error state %s", str, qbsVar.m.name());
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b4, code lost:
    
        if (j$.util.Collection.EL.stream(r0).filter(new defpackage.nfp(5)).map(new defpackage.prj(20)).anyMatch(new defpackage.ncc(r10, 10)) != false) goto L63;
     */
    @Override // defpackage.qby
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ defpackage.qfl a(java.lang.Object r9, defpackage.qbs r10) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qba.a(java.lang.Object, qbs):qfl");
    }
}
