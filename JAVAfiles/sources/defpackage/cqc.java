package defpackage;

import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqc extends cga.c implements czp, cpz {
    public cpz a;
    public cqa b;
    private final Object c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cqc$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arps {
        long a;
        long b;
        /* synthetic */ Object c;
        int e;
        cqc f;

        public AnonymousClass1(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return cqc.this.c(0L, 0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cqc$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arps {
        long a;
        /* synthetic */ Object b;
        int d;
        cqc e;

        public AnonymousClass2(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return cqc.this.d(0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cqc$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqg<arwe> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return cqc.this.f();
        }
    }

    public cqc(cpz cpzVar, cqa cqaVar) {
        this.a = cpzVar;
        this.b = cqaVar == null ? new cqa() : cqaVar;
        this.c = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    private final cpz i() {
        if (this.z) {
            return e();
        }
        return null;
    }

    @Override // defpackage.cpz
    public final long a(long j, long j2, int i) {
        long j3;
        long a = this.a.a(j, j2, i);
        cpz i2 = i();
        if (i2 != null) {
            j3 = i2.a(d.aH(j, a), a.Q(j2, a), i);
        } else {
            j3 = 0;
        }
        return d.aH(a, j3);
    }

    @Override // defpackage.cpz
    public final long b(long j, int i) {
        long j2;
        cpz i2 = i();
        if (i2 != null) {
            j2 = i2.b(j, i);
        } else {
            j2 = 0;
        }
        return d.aH(j2, this.a.b(a.Q(j, j2), i));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.cpz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(long r18, long r20, defpackage.arpe r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r22
            boolean r2 = r1 instanceof defpackage.cqc.AnonymousClass1
            if (r2 == 0) goto L17
            r2 = r1
            cqc$1 r2 = (defpackage.cqc.AnonymousClass1) r2
            int r3 = r2.e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.e = r3
            goto L1c
        L17:
            cqc$1 r2 = new cqc$1
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.c
            arpl r9 = defpackage.arpl.a
            int r3 = r2.e
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L44
            if (r3 == r4) goto L38
            if (r3 != r10) goto L30
            long r2 = r2.a
            defpackage.aqil.P(r1)
            goto L85
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            long r3 = r2.b
            long r5 = r2.a
            cqc r7 = r2.f
            defpackage.aqil.P(r1)
            r13 = r3
            r11 = r5
            goto L61
        L44:
            defpackage.aqil.P(r1)
            cpz r3 = r0.a
            r2.f = r0
            r11 = r18
            r2.a = r11
            r13 = r20
            r2.b = r13
            r2.e = r4
            r4 = r18
            r6 = r20
            r8 = r2
            java.lang.Object r1 = r3.c(r4, r6, r8)
            if (r1 == r9) goto L9c
            r7 = r0
        L61:
            drp r1 = (defpackage.drp) r1
            long r4 = r1.a
            cpz r3 = r7.i()
            if (r3 == 0) goto L8d
            long r6 = defpackage.d.aH(r11, r4)
            long r11 = defpackage.a.Q(r13, r4)
            r1 = 0
            r2.f = r1
            r2.a = r4
            r2.e = r10
            r13 = r4
            r4 = r6
            r6 = r11
            r8 = r2
            java.lang.Object r1 = r3.c(r4, r6, r8)
            if (r1 == r9) goto L9c
            r2 = r13
        L85:
            drp r1 = (defpackage.drp) r1
            long r4 = r1.a
            r15 = r2
            r1 = r4
            r4 = r15
            goto L92
        L8d:
            r13 = r4
            r4 = 0
            r1 = r4
            r4 = r13
        L92:
            long r1 = defpackage.d.aH(r4, r1)
            drp r3 = new drp
            r3.<init>(r1)
            return r3
        L9c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqc.c(long, long, arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.cpz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(long r7, defpackage.arpe r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.cqc.AnonymousClass2
            if (r0 == 0) goto L13
            r0 = r9
            cqc$2 r0 = (defpackage.cqc.AnonymousClass2) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cqc$2 r0 = new cqc$2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.b
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            long r7 = r0.a
            defpackage.aqil.P(r9)
            goto L6e
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            long r7 = r0.a
            cqc r2 = r0.e
            defpackage.aqil.P(r9)
            goto L52
        L3c:
            defpackage.aqil.P(r9)
            cpz r9 = r6.i()
            if (r9 == 0) goto L57
            r0.e = r6
            r0.a = r7
            r0.d = r4
            java.lang.Object r9 = r9.d(r7, r0)
            if (r9 == r1) goto L7c
            r2 = r6
        L52:
            drp r9 = (defpackage.drp) r9
            long r4 = r9.a
            goto L5a
        L57:
            r4 = 0
            r2 = r6
        L5a:
            cpz r9 = r2.a
            long r7 = defpackage.a.Q(r7, r4)
            r2 = 0
            r0.e = r2
            r0.a = r4
            r0.d = r3
            java.lang.Object r9 = r9.d(r7, r0)
            if (r9 == r1) goto L7c
            r7 = r4
        L6e:
            drp r9 = (defpackage.drp) r9
            long r0 = r9.a
            long r7 = defpackage.d.aH(r7, r0)
            drp r9 = new drp
            r9.<init>(r7)
            return r9
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqc.d(long, arpe):java.lang.Object");
    }

    @Override // defpackage.czp
    public final Object dP() {
        return this.c;
    }

    @Override // cga.c
    public final void dQ() {
        h();
    }

    public final cqc e() {
        if (this.z) {
            return (cqc) czq.a(this);
        }
        return null;
    }

    public final arwe f() {
        arwe arweVar;
        cqc e = e();
        if ((e != null && (arweVar = e.f()) != null) || (arweVar = this.b.c) != null) {
            return arweVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final void g() {
        cqa cqaVar = this.b;
        if (cqaVar.a == this) {
            cqaVar.a = null;
        }
    }

    public final void h() {
        cqa cqaVar = this.b;
        cqaVar.a = this;
        cqaVar.b = new AnonymousClass3();
        cqaVar.c = B();
    }

    @Override // cga.c
    public final void s() {
        g();
    }
}
