package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tyv implements tyx {
    private static final alvi d = alvi.m("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/rpc/IdentityBoundRealTachyonRegistrationRpc");
    public final qei a;
    public final armf b;
    public final arwe c;
    private final apwt e;

    public tyv(qei qeiVar, apwt apwtVar, armf armfVar, arwe arweVar) {
        apwtVar.getClass();
        armfVar.getClass();
        arweVar.getClass();
        this.a = qeiVar;
        this.e = apwtVar;
        this.b = armfVar;
        this.c = arweVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f A[Catch: aqwb -> 0x0029, TryCatch #0 {aqwb -> 0x0029, blocks: (B:11:0x0025, B:12:0x0054, B:13:0x0079, B:15:0x007f, B:17:0x0089, B:19:0x008b, B:22:0x00a3, B:29:0x0037), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.vfd r7, defpackage.arpe r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.tyu
            if (r0 == 0) goto L13
            r0 = r8
            tyu r0 = (defpackage.tyu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tyu r0 = new tyu
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            vfd r7 = r0.d
            defpackage.aqil.P(r8)     // Catch: defpackage.aqwb -> L29
            goto L54
        L29:
            r8 = move-exception
            goto Lae
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.aqil.P(r8)
            apwt r8 = r6.e     // Catch: defpackage.aqwb -> L29
            java.lang.Object r8 = r8.b()     // Catch: defpackage.aqwb -> L29
            vcc r8 = (defpackage.vcc) r8     // Catch: defpackage.aqwb -> L29
            java.lang.String r2 = "Bugle.Etouffee.LookupRegistered"
            vdh r2 = defpackage.vdh.a(r2)     // Catch: defpackage.aqwb -> L29
            akul r8 = r8.b(r7, r2)     // Catch: defpackage.aqwb -> L29
            r0.d = r7     // Catch: defpackage.aqwb -> L29
            r0.c = r3     // Catch: defpackage.aqwb -> L29
            java.lang.Object r8 = defpackage.arro.F(r8, r0)     // Catch: defpackage.aqwb -> L29
            if (r8 != r1) goto L54
            return r1
        L54:
            aqdw r8 = (defpackage.aqdw) r8     // Catch: defpackage.aqwb -> L29
            java.lang.String r0 = r7.a     // Catch: defpackage.aqwb -> L29
            r8.getClass()     // Catch: defpackage.aqwb -> L29
            apax r8 = r8.c     // Catch: defpackage.aqwb -> L29
            r8.getClass()     // Catch: defpackage.aqwb -> L29
            r1 = 10
            int r1 = defpackage.aqjn.J(r8, r1)     // Catch: defpackage.aqwb -> L29
            int r1 = defpackage.aqjn.i(r1)     // Catch: defpackage.aqwb -> L29
            r2 = 16
            int r1 = defpackage.arrn.r(r1, r2)     // Catch: defpackage.aqwb -> L29
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: defpackage.aqwb -> L29
            r2.<init>(r1)     // Catch: defpackage.aqwb -> L29
            java.util.Iterator r8 = r8.iterator()     // Catch: defpackage.aqwb -> L29
        L79:
            boolean r1 = r8.hasNext()     // Catch: defpackage.aqwb -> L29
            if (r1 == 0) goto La3
            java.lang.Object r1 = r8.next()     // Catch: defpackage.aqwb -> L29
            aqgh r1 = (defpackage.aqgh) r1     // Catch: defpackage.aqwb -> L29
            aqfn r4 = r1.b     // Catch: defpackage.aqwb -> L29
            if (r4 != 0) goto L8b
            aqfn r4 = defpackage.aqfn.a     // Catch: defpackage.aqwb -> L29
        L8b:
            java.lang.String r4 = r4.c     // Catch: defpackage.aqwb -> L29
            apax r1 = r1.c     // Catch: defpackage.aqwb -> L29
            r1.getClass()     // Catch: defpackage.aqwb -> L29
            alog r1 = defpackage.alzz.aZ(r1)     // Catch: defpackage.aqwb -> L29
            armo r5 = new armo     // Catch: defpackage.aqwb -> L29
            r5.<init>(r4, r1)     // Catch: defpackage.aqwb -> L29
            java.lang.Object r1 = r5.a     // Catch: defpackage.aqwb -> L29
            java.lang.Object r4 = r5.b     // Catch: defpackage.aqwb -> L29
            r2.put(r1, r4)     // Catch: defpackage.aqwb -> L29
            goto L79
        La3:
            alor r8 = defpackage.alzz.bc(r2)     // Catch: defpackage.aqwb -> L29
            tyy r1 = new tyy     // Catch: defpackage.aqwb -> L29
            r2 = 0
            r1.<init>(r3, r0, r8, r2)     // Catch: defpackage.aqwb -> L29
            goto Le8
        Lae:
            alvi r0 = defpackage.tyv.d
            alvw r0 = r0.i()
            alvz r1 = defpackage.alwp.a
            java.lang.String r2 = "BugleEtouffee"
            r0.X(r1, r2)
            alvg r0 = (defpackage.alvg) r0
            alvw r0 = r0.g(r8)
            java.lang.String r1 = "executeRpc"
            r2 = 74
            java.lang.String r3 = "com/google/android/apps/messaging/shared/datamodel/etouffee/impl/rpc/IdentityBoundRealTachyonRegistrationRpc"
            java.lang.String r4 = "IdentityBoundRealTachyonRegistrationRpc.kt"
            alvw r0 = r0.h(r3, r1, r2, r4)
            alvg r0 = (defpackage.alvg) r0
            java.lang.String r1 = "Caught StatusRuntimeException, failed to retrieve registration Ids from tachyon"
            r0.q(r1)
            java.lang.String r7 = r7.a
            io.grpc.Status r8 = r8.a
            io.grpc.Status$Code r8 = r8.getCode()
            int r8 = r8.value()
            tyy r1 = new tyy
            r0 = 3
            alor r2 = defpackage.altc.a
            r1.<init>(r0, r7, r2, r8)
        Le8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tyv.a(vfd, arpe):java.lang.Object");
    }
}
