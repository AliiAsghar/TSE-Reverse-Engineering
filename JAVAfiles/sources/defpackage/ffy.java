package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffy implements fgt, fgs {
    public final fgt a;
    long b;
    long c;
    public fga d;
    private fgs e;
    private ffx[] f = new ffx[0];
    private long g;

    public ffy(fgt fgtVar, boolean z, long j, long j2) {
        this.a = fgtVar;
        this.g = j;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.fgt
    public final long a(long j, fbi fbiVar) {
        long j2;
        long j3 = this.b;
        if (j != j3) {
            long q = eul.q(fbiVar.c, 0L, j - j3);
            long j4 = fbiVar.d;
            long j5 = this.c;
            if (j5 == Long.MIN_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j5 - j;
            }
            long q2 = eul.q(j4, 0L, j2);
            if (q != fbiVar.c || q2 != fbiVar.d) {
                fbiVar = new fbi(q, q2);
            }
            return this.a.a(j, fbiVar);
        }
        return j3;
    }

    @Override // defpackage.fhw
    public final /* bridge */ /* synthetic */ void b(fhx fhxVar) {
        fgs fgsVar = this.e;
        dzg.g(fgsVar);
        fgsVar.b(this);
    }

    @Override // defpackage.fgs
    public final void c(fgt fgtVar) {
        if (this.d != null) {
            return;
        }
        fgs fgsVar = this.e;
        dzg.g(fgsVar);
        fgsVar.c(this);
    }

    @Override // defpackage.fgt, defpackage.fhx
    public final long d() {
        long d = this.a.d();
        if (d != Long.MIN_VALUE) {
            long j = this.c;
            if (j == Long.MIN_VALUE || d < j) {
                return d;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.fgt, defpackage.fhx
    public final long e() {
        long e = this.a.e();
        if (e != Long.MIN_VALUE) {
            long j = this.c;
            if (j == Long.MIN_VALUE || e < j) {
                return e;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.fgt
    public final long f() {
        boolean z;
        if (p()) {
            long j = this.g;
            this.g = -9223372036854775807L;
            long f = f();
            if (f != -9223372036854775807L) {
                return f;
            }
            return j;
        }
        long f2 = this.a.f();
        if (f2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z2 = false;
        if (f2 >= this.b) {
            z = true;
        } else {
            z = false;
        }
        dzg.d(z);
        long j2 = this.c;
        if (j2 == Long.MIN_VALUE || f2 <= j2) {
            z2 = true;
        }
        dzg.d(z2);
        return f2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r0 > r3) goto L17;
     */
    @Override // defpackage.fgt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long g(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.g = r0
            ffx[] r0 = r7.f
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.b = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            fgt r0 = r7.a
            long r0 = r0.g(r8)
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r9 = 1
            if (r8 == 0) goto L34
            long r3 = r7.b
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 < 0) goto L35
            long r3 = r7.c
            r5 = -9223372036854775808
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L34
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 > 0) goto L35
        L34:
            r2 = r9
        L35:
            defpackage.dzg.d(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffy.g(long):long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
    
        if (r1 > r5) goto L32;
     */
    @Override // defpackage.fgt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long h(defpackage.fje[] r16, boolean[] r17, defpackage.fhv[] r18, boolean[] r19, long r20) {
        /*
            r15 = this;
            r0 = r15
            r8 = r16
            r9 = r18
            int r1 = r9.length
            ffx[] r2 = new defpackage.ffx[r1]
            r0.f = r2
            fhv[] r10 = new defpackage.fhv[r1]
            r11 = 0
            r1 = r11
        Le:
            int r2 = r9.length
            r12 = 0
            if (r1 >= r2) goto L23
            ffx[] r2 = r0.f
            r3 = r9[r1]
            ffx r3 = (defpackage.ffx) r3
            r2[r1] = r3
            if (r3 == 0) goto L1e
            fhv r12 = r3.a
        L1e:
            r10[r1] = r12
            int r1 = r1 + 1
            goto Le
        L23:
            fgt r1 = r0.a
            r2 = r16
            r3 = r17
            r4 = r10
            r5 = r19
            r6 = r20
            long r1 = r1.h(r2, r3, r4, r5, r6)
            boolean r3 = r15.p()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 == 0) goto L64
            long r6 = r0.b
            int r3 = (r20 > r6 ? 1 : (r20 == r6 ? 0 : -1))
            if (r3 != 0) goto L64
            r13 = 0
            int r3 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r3 == 0) goto L64
            int r3 = r8.length
            r6 = r11
        L4b:
            if (r6 >= r3) goto L64
            r7 = r8[r6]
            if (r7 == 0) goto L61
            eqn r7 = r7.f()
            java.lang.String r13 = r7.o
            java.lang.String r7 = r7.k
            boolean r7 = defpackage.erl.f(r13, r7)
            if (r7 != 0) goto L61
            r4 = r1
            goto L64
        L61:
            int r6 = r6 + 1
            goto L4b
        L64:
            r0.g = r4
            int r3 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            r4 = 1
            if (r3 == 0) goto L7f
            long r5 = r0.b
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L7e
            long r5 = r0.c
            r7 = -9223372036854775808
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L7f
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 > 0) goto L7e
            goto L7f
        L7e:
            r4 = r11
        L7f:
            defpackage.dzg.d(r4)
        L82:
            int r3 = r9.length
            if (r11 >= r3) goto La8
            r3 = r10[r11]
            if (r3 != 0) goto L8e
            ffx[] r3 = r0.f
            r3[r11] = r12
            goto L9f
        L8e:
            ffx[] r4 = r0.f
            r5 = r4[r11]
            if (r5 == 0) goto L98
            fhv r5 = r5.a
            if (r5 == r3) goto L9f
        L98:
            ffx r5 = new ffx
            r5.<init>(r15, r3)
            r4[r11] = r5
        L9f:
            ffx[] r3 = r0.f
            r3 = r3[r11]
            r9[r11] = r3
            int r11 = r11 + 1
            goto L82
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffy.h(fje[], boolean[], fhv[], boolean[], long):long");
    }

    @Override // defpackage.fgt
    public final fid i() {
        return this.a.i();
    }

    @Override // defpackage.fgt
    public final void j() {
        fga fgaVar = this.d;
        if (fgaVar == null) {
            this.a.j();
            return;
        }
        throw fgaVar;
    }

    @Override // defpackage.fgt
    public final void k(fgs fgsVar, long j) {
        this.e = fgsVar;
        this.a.k(this, j);
    }

    @Override // defpackage.fgt, defpackage.fhx
    public final void l(long j) {
        this.a.l(j);
    }

    public final void m(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.fgt, defpackage.fhx
    public final boolean n(fam famVar) {
        return this.a.n(famVar);
    }

    @Override // defpackage.fgt, defpackage.fhx
    public final boolean o() {
        return this.a.o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean p() {
        if (this.g != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fgt
    public final void q(long j) {
        this.a.q(j);
    }
}
