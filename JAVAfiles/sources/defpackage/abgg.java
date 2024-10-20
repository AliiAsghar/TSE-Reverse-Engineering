package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abgg {
    public static final akfc a = new akgc("WELCOME_FLOW_IS_ACTIVE_DATA");
    public final arwe b;
    public final wul c;
    public final armf d;
    private final armf e;
    private final armf f;
    private final adwu g;
    private final ahiy h;
    private final ansy i;

    public abgg(armf armfVar, arwe arweVar, armf armfVar2, adwu adwuVar, wul wulVar, armf armfVar3, ahiy ahiyVar, ansy ansyVar) {
        armfVar.getClass();
        arweVar.getClass();
        armfVar2.getClass();
        adwuVar.getClass();
        armfVar3.getClass();
        ahiyVar.getClass();
        ansyVar.getClass();
        this.e = armfVar;
        this.b = arweVar;
        this.f = armfVar2;
        this.g = adwuVar;
        this.c = wulVar;
        this.d = armfVar3;
        this.h = ahiyVar;
        this.i = ansyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.abgc
            if (r0 == 0) goto L13
            r0 = r5
            abgc r0 = (defpackage.abgc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            abgc r0 = new abgc
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L3a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.aqil.P(r5)
            r0.c = r3
            java.lang.Object r5 = r4.b(r0)
            if (r5 == r1) goto L54
        L3a:
            java.util.List r5 = (java.util.List) r5
            int r0 = r5.size()
            if (r0 != r3) goto L4f
            java.lang.Object r5 = defpackage.aqjn.X(r5)
            ajza r5 = (defpackage.ajza) r5
            ajzb r5 = r5.b
            j$.util.Optional r5 = j$.util.Optional.of(r5)
            return r5
        L4f:
            j$.util.Optional r5 = j$.util.Optional.empty()
            return r5
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abgg.a(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.arpe r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.abgd
            if (r0 == 0) goto L13
            r0 = r6
            abgd r0 = (defpackage.abgd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            abgd r0 = new abgd
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r6)
            goto L4b
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.aqil.P(r6)
            ansy r6 = r5.i
            ahiy r2 = r5.h
            akfb r2 = r2.B()
            akgd r4 = defpackage.akgd.SAME_DAY
            com.google.common.util.concurrent.ListenableFuture r6 = r6.k(r2, r4)
            r6.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.arro.F(r6, r0)
            if (r6 == r1) goto L80
        L4b:
            r6.getClass()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L59:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L7b
            java.lang.Object r1 = r6.next()
            r2 = r1
            ajza r2 = (defpackage.ajza) r2
            int r3 = r2.c
            r4 = 3
            if (r3 == r4) goto L59
            ajzb r2 = r2.b
            java.lang.String r2 = r2.i
            java.lang.String r3 = "pseudonymous"
            boolean r2 = defpackage.d.F(r3, r2)
            if (r2 != 0) goto L59
            r0.add(r1)
            goto L59
        L7b:
            java.util.List r6 = defpackage.aqjn.az(r0)
            return r6
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abgg.b(arpe):java.lang.Object");
    }

    public final Object c(boolean z, arpe arpeVar) {
        return this.c.d(new jsw(z, 9), arpeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.arpe r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.abge
            if (r0 == 0) goto L13
            r0 = r9
            abge r0 = (defpackage.abge) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            abge r0 = new abge
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            abgg r0 = r0.d
            defpackage.aqil.P(r9)
            goto L41
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L31:
            defpackage.aqil.P(r9)
            wul r9 = r8.c
            r0.d = r8
            r0.c = r3
            java.lang.Object r9 = r9.c(r0)
            if (r9 == r1) goto L65
            r0 = r8
        L41:
            abgb r9 = (defpackage.abgb) r9
            long r1 = r9.c
            r4 = 0
            int r9 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            r1 = 0
            if (r9 > 0) goto L5f
            armf r9 = r0.e
            java.lang.Object r9 = r9.b()
            ykw r9 = (defpackage.ykw) r9
            java.lang.String r0 = "conversation_list_last_popup_show_timestamp_ms"
            long r6 = r9.e(r0, r4)
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L5f
            goto L60
        L5f:
            r3 = r1
        L60:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abgg.d(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.abgf
            if (r0 == 0) goto L13
            r0 = r5
            abgf r0 = (defpackage.abgf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            abgf r0 = new abgf
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.aqil.P(r5)
            wul r5 = r4.c
            r0.c = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            abgb r5 = (defpackage.abgb) r5
            boolean r5 = r5.d
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abgg.e(arpe):java.lang.Object");
    }

    public final boolean f() {
        if (actx.f() && !this.g.b(((adtn) this.f.b()).b()) && !xvs.e()) {
            return true;
        }
        return false;
    }
}
