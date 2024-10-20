package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qva implements qvv {
    public final qvp a;
    public final armf b;
    public final oep c;
    public final arwe d;
    public final ahlp e = new ahlp(null, null, null, null);
    private final arwe f;

    public qva(qvp qvpVar, armf armfVar, oep oepVar, arwe arweVar, arwe arweVar2) {
        this.a = qvpVar;
        this.b = armfVar;
        this.c = oepVar;
        this.d = arweVar;
        this.f = arweVar2;
    }

    private final Object j(arqg arqgVar, arpe arpeVar) {
        alog a = this.a.a();
        if (a.isEmpty()) {
            Object i = i(arqgVar, arpeVar);
            if (i == arpl.a) {
                return i;
            }
            return (List) i;
        }
        return a;
    }

    @Override // defpackage.qvv
    public final akul a() {
        akul c;
        c = qjh.c(this.d, arpj.a, arwf.a, new qrr(this, (arpe) null, 6));
        return c;
    }

    @Override // defpackage.qvv
    @armg
    public final akul b(qwe qweVar) {
        akul c;
        qweVar.getClass();
        c = qjh.c(this.d, arpj.a, arwf.a, new qsk(this, qweVar, (arpe) null, 5));
        return c;
    }

    @Override // defpackage.qvv
    @armg
    public final akul c() {
        akul c;
        c = qjh.c(this.d, arpj.a, arwf.a, new qrr(this, (arpe) null, 8, (char[]) null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.qvv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.arpe r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.quv
            if (r0 == 0) goto L13
            r0 = r9
            quv r0 = (defpackage.quv) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            quv r0 = new quv
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L39
            if (r2 == r3) goto L33
            if (r2 != r4) goto L2b
            defpackage.aqil.P(r9)
            goto Lb0
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            java.lang.Object r0 = r0.a
            defpackage.aqil.P(r9)
            goto L56
        L39:
            defpackage.aqil.P(r9)
            qvp r9 = r8.a
            alpt r9 = r9.a
            r9.getClass()
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto L93
            r0.a = r9
            r0.d = r3
            java.lang.Object r0 = r8.e(r0)
            if (r0 == r1) goto L92
            r7 = r0
            r0 = r9
            r9 = r7
        L56:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r9 = r9.iterator()
        L61:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L7d
            java.lang.Object r2 = r9.next()
            r3 = r2
            qvo r3 = (defpackage.qvo) r3
            qwe r3 = r3.c
            r4 = r0
            alpt r4 = (defpackage.alpt) r4
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L61
            r1.add(r2)
            goto L61
        L7d:
            int r9 = r1.size()
            alpt r0 = (defpackage.alpt) r0
            int r0 = r0.size()
            if (r9 != r0) goto L8a
            return r1
        L8a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r9.<init>(r0)
            throw r9
        L92:
            return r1
        L93:
            qtq r9 = new qtq
            r9.<init>(r8, r4)
            r0.d = r4
            arwe r2 = r8.d
            ahlp r3 = r8.e
            lxi r4 = new lxi
            r5 = 0
            r6 = 3
            r4.<init>(r8, r9, r5, r6)
            arwl r9 = defpackage.albo.ax(r2, r3, r4)
            java.lang.Object r9 = r9.n(r0)
            if (r9 != r1) goto Lb0
            return r1
        Lb0:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qva.d(arpe):java.lang.Object");
    }

    @Override // defpackage.qvv
    public final Object e(arpe arpeVar) {
        return j(kek.t, arpeVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.qvv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.qwe r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.quy
            if (r0 == 0) goto L13
            r0 = r6
            quy r0 = (defpackage.quy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            quy r0 = new quy
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            qwe r5 = r0.e
            qva r0 = r0.d
            defpackage.aqil.P(r6)
            goto L5b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.aqil.P(r6)
            qvp r6 = r4.a
            j$.util.Optional r6 = r6.b(r5)
            boolean r2 = r6.isPresent()
            if (r2 == 0) goto L47
            java.lang.Object r5 = r6.get()
            return r5
        L47:
            quz r6 = new quz
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.d = r4
            r0.e = r5
            r0.c = r3
            java.lang.Object r6 = r4.j(r6, r0)
            if (r6 != r1) goto L5a
            return r1
        L5a:
            r0 = r4
        L5b:
            java.util.List r6 = (java.util.List) r6
            qvp r6 = r0.a
            j$.util.Optional r6 = r6.b(r5)
            boolean r0 = r6.isPresent()
            if (r0 == 0) goto L6e
            java.lang.Object r5 = r6.get()
            return r5
        L6e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.util.Objects.toString(r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "No MyIdentity found for token "
            java.lang.String r5 = r0.concat(r5)
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qva.f(qwe, arpe):java.lang.Object");
    }

    @Override // defpackage.qvv
    @armg
    public final Object g(arpe arpeVar) {
        Object n = albo.ax(this.f, this.e, new qrr(this, (arpe) null, 7, (byte[]) null)).n(arpeVar);
        if (n == arpl.a) {
            return n;
        }
        return arnb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.arpe r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.quw
            if (r0 == 0) goto L13
            r0 = r5
            quw r0 = (defpackage.quw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            quw r0 = new quw
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            qva r0 = r0.d
            defpackage.aqil.P(r5)
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.aqil.P(r5)
            armf r5 = r4.b
            java.lang.Object r5 = r5.b()
            qvv r5 = (defpackage.qvv) r5
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = r5.e(r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            r0 = r4
        L48:
            java.util.List r5 = (java.util.List) r5
            qvp r0 = r0.a
            r0.d(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qva.h(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.arqg r8, defpackage.arpe r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.qux
            if (r0 == 0) goto L13
            r0 = r9
            qux r0 = (defpackage.qux) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qux r0 = new qux
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r9)
            goto L4a
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.aqil.P(r9)
            arwe r9 = r7.d
            ahlp r2 = r7.e
            qsk r4 = new qsk
            r5 = 0
            r6 = 4
            r4.<init>(r7, r8, r5, r6)
            arwl r8 = defpackage.albo.ax(r9, r2, r4)
            r0.c = r3
            java.lang.Object r9 = r8.n(r0)
            if (r9 != r1) goto L4a
            return r1
        L4a:
            r9.getClass()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qva.i(arqg, arpe):java.lang.Object");
    }
}
