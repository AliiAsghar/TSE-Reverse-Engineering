package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qnd extends unp {
    public static final alwo a = alwo.o("BugleContacts");
    public final wul b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final uie g;
    private final arwe h;
    private final arpi i;
    private final armf j;
    private final armf k;

    public qnd(arwe arweVar, arpi arpiVar, uie uieVar, wul wulVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6) {
        arweVar.getClass();
        arpiVar.getClass();
        uieVar.getClass();
        wulVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        this.h = arweVar;
        this.i = arpiVar;
        this.g = uieVar;
        this.b = wulVar;
        this.c = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.f = armfVar4;
        this.j = armfVar5;
        this.k = armfVar6;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        return qno.b();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("ScheduleDeleteAndImportContactsHandler");
    }

    @Override // defpackage.unp
    public final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        akul c;
        ((aozo) apbtVar).getClass();
        c = qjh.c(this.h, arpj.a, arwf.a, new iqi(this, unsVar, (arpe) null, 14));
        return c;
    }

    @Override // defpackage.unx
    public final apca e() {
        apca parserForType = aozo.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(defpackage.arpe r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.qnb
            if (r0 == 0) goto L13
            r0 = r8
            qnb r0 = (defpackage.qnb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            qnb r0 = new qnb
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r0 = r0.a
            defpackage.aqil.P(r8)
            goto L4d
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            defpackage.aqil.P(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            arpi r2 = r7.i
            pze r4 = new pze
            r5 = 0
            r6 = 3
            r4.<init>(r8, r5, r6)
            r0.a = r8
            r0.d = r3
            java.lang.Object r0 = defpackage.arro.q(r2, r4, r0)
            if (r0 == r1) goto L8e
            r0 = r8
        L4d:
            java.util.ArrayList r8 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.aqjn.J(r0, r1)
            r8.<init>(r1)
            java.util.Iterator r1 = r0.iterator()
        L5c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L89
            java.lang.Object r2 = r1.next()
            aozy r2 = (defpackage.aozy) r2
            int r3 = r0.size()
            apag r4 = r2.b
            boolean r4 = r4.isMutable()
            if (r4 != 0) goto L77
            r2.u()
        L77:
            apag r4 = r2.b
            qmr r4 = (defpackage.qmr) r4
            qmr r5 = defpackage.qmr.a
            r4.d = r3
            apag r2 = r2.s()
            qmr r2 = (defpackage.qmr) r2
            r8.add(r2)
            goto L5c
        L89:
            alog r8 = defpackage.alzz.aZ(r8)
            return r8
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qnd.j(arpe):java.lang.Object");
    }

    public final void k() {
        Object b = this.d.b();
        b.getClass();
        qlm.d((mbl) b, 5);
    }

    public final void l() {
        ((ahqr) this.e.b()).g(qld.g, null, ahqp.ERROR);
        ((ahqr) this.e.b()).g(qld.h, null, ahqp.ERROR);
        if (((oxg) this.j.b()).a()) {
            ((lgg) this.k.b()).g(new qab(10));
        }
    }
}
