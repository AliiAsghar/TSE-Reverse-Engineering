package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wwc extends unp {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/simstatetracker/SimStateUpdateHandler");
    public final armf b;
    private final arwe c;
    private final armf d;
    private final armf e;

    public wwc(arwe arweVar, armf armfVar, armf armfVar2, armf armfVar3) {
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        this.c = arweVar;
        this.b = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        a2.c(unv.WORKMANAGER_ONLY);
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("SimStateUpdateHandler");
    }

    @Override // defpackage.unp
    public final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        akul c;
        wwd wwdVar = (wwd) apbtVar;
        wwdVar.getClass();
        c = qjh.c(this.c, arpj.a, arwf.a, new wwh(this, wwdVar, (arpe) null, 1));
        return c;
    }

    @Override // defpackage.unx
    public final apca e() {
        apca parserForType = wwd.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.unp, defpackage.unx
    public final String f() {
        return "sim_state_update_queue";
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(defpackage.arpe r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.wwb
            if (r0 == 0) goto L13
            r0 = r8
            wwb r0 = (defpackage.wwb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wwb r0 = new wwb
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            wwc r0 = r0.d
            defpackage.aqil.P(r8)
            goto L61
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L31:
            defpackage.aqil.P(r8)
            alvi r8 = defpackage.wwc.a
            alvw r8 = r8.g()
            java.lang.String r2 = "handleUpdatePhoneSimsState"
            r4 = 101(0x65, float:1.42E-43)
            java.lang.String r5 = "com/google/android/apps/messaging/shared/simstatetracker/SimStateUpdateHandler"
            java.lang.String r6 = "SimStateUpdateHandler.kt"
            alvw r8 = r8.h(r5, r2, r4, r6)
            alvg r8 = (defpackage.alvg) r8
            java.lang.String r2 = "Handling update phone SIM state."
            r8.q(r2)
            armf r8 = r7.b
            java.lang.Object r8 = r8.b()
            wvm r8 = (defpackage.wvm) r8
            r0.d = r7
            r0.c = r3
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L60
            return r1
        L60:
            r0 = r7
        L61:
            wxa r8 = (defpackage.wxa) r8
            wwk r8 = defpackage.wwk.WORK_TYPE_UPDATE_PHONE_SIMS_STATE
            r0.k(r8)
            upm r8 = defpackage.upm.b()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wwc.j(arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [armf, java.lang.Object] */
    public final void k(wwk wwkVar) {
        if (((okc) this.e.b()).a()) {
            wfh wfhVar = (wfh) this.d.b();
            wwkVar.getClass();
            ((mbl) wfhVar.a.b()).e("Bugle.Dsdr.SimStateUpdateHandler", wwkVar.ordinal());
        }
    }
}
