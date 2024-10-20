package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afmd {
    public final Object a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;

    public afmd(cg cgVar, abdc abdcVar, aqws aqwsVar, znj znjVar) {
        this.c = new ArrayList();
        this.a = new ArrayList();
        this.b = abdcVar;
        cgVar.N().c(new aaoy(this, cgVar, znjVar, aqwsVar, abdcVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, arml] */
    public final Object a(arpe arpeVar) {
        Object q = ((arxm) this.c.a()).q(arpeVar);
        if (q == arpl.a) {
            return q;
        }
        return arnb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.CharSequence r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.afma
            if (r0 == 0) goto L13
            r0 = r6
            afma r0 = (defpackage.afma) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            afma r0 = new afma
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r5 = r0.a
            defpackage.aqil.P(r6)
            goto L3e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.aqil.P(r6)
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = r4.c(r5, r0)
            if (r6 == r1) goto L79
        L3e:
            afnb r6 = (defpackage.afnb) r6
            r0 = 0
            if (r6 == 0) goto L78
            aflp r1 = r6.a()
            java.lang.CharSequence r1 = r1.a()
            boolean r1 = defpackage.d.F(r1, r5)
            if (r1 == 0) goto L56
            aflp r0 = r6.a()
            goto L78
        L56:
            java.util.Set r6 = r6.i()
            java.util.Iterator r6 = r6.iterator()
        L5e:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L76
            java.lang.Object r1 = r6.next()
            r2 = r1
            aflp r2 = (defpackage.aflp) r2
            java.lang.CharSequence r2 = r2.a()
            boolean r2 = defpackage.d.F(r2, r5)
            if (r2 == 0) goto L5e
            r0 = r1
        L76:
            aflw r0 = (defpackage.aflw) r0
        L78:
            return r0
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afmd.b(java.lang.CharSequence, arpe):java.lang.Object");
    }

    public final Object c(CharSequence charSequence, arpe arpeVar) {
        return f(new aezb(charSequence, 17), arpeVar);
    }

    public final Object d(arpe arpeVar) {
        return e(aeys.s, arpeVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, arml] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.arqr r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.afmb
            if (r0 == 0) goto L13
            r0 = r6
            afmb r0 = (defpackage.afmb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            afmb r0 = new afmb
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.a
            afmd r0 = r0.e
            defpackage.aqil.P(r6)
            goto L4b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.aqil.P(r6)
            java.lang.Object r6 = r4.b
            java.lang.Object r6 = r6.a()
            arxm r6 = (defpackage.arxm) r6
            r0.e = r4
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = r6.q(r0)
            if (r6 == r1) goto L5a
            r0 = r4
        L4b:
            java.lang.Object r6 = r0.d
            if (r6 != 0) goto L55
            java.lang.String r6 = "categories"
            defpackage.arro.b(r6)
            r6 = 0
        L55:
            java.lang.Object r5 = r5.a(r6)
            return r5
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afmd.e(arqr, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.arqr r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.afmc
            if (r0 == 0) goto L13
            r0 = r6
            afmc r0 = (defpackage.afmc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            afmc r0 = new afmc
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            aezb r5 = r0.e
            afmd r0 = r0.d
            defpackage.aqil.P(r6)
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.aqil.P(r6)
            r0.d = r4
            r6 = r5
            aezb r6 = (defpackage.aezb) r6
            r0.e = r6
            r0.c = r3
            java.lang.Object r6 = r4.a(r0)
            if (r6 == r1) goto L55
            r0 = r4
        L46:
            java.lang.Object r6 = r0.e
            if (r6 != 0) goto L50
            java.lang.String r6 = "literalsToEmoji"
            defpackage.arro.b(r6)
            r6 = 0
        L50:
            java.lang.Object r5 = r5.a(r6)
            return r5
        L55:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afmd.f(arqr, arpe):java.lang.Object");
    }

    public afmd(arwe arweVar) {
        arweVar.getClass();
        this.a = arweVar;
        this.b = armd.a(new afjm(this, 5));
        this.c = armd.a(new afjm(this, 6));
    }
}
