package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fhk implements fhv {
    public final int a;
    final /* synthetic */ fhm b;

    public fhk(fhm fhmVar, int i) {
        this.b = fhmVar;
        this.a = i;
    }

    @Override // defpackage.fhv
    public final int a(long j) {
        fhm fhmVar = this.b;
        if (fhmVar.x()) {
            return 0;
        }
        int i = this.a;
        fhmVar.t(i);
        fhu fhuVar = fhmVar.i[i];
        int b = fhuVar.b(j, fhmVar.t);
        fhuVar.o(b);
        if (b != 0) {
            return b;
        }
        fhmVar.u(i);
        return 0;
    }

    @Override // defpackage.fhv
    public final void b() {
        fhm fhmVar = this.b;
        fhu fhuVar = fhmVar.i[this.a];
        fdp fdpVar = fhuVar.d;
        if (fdpVar != null && fdpVar.a() == 1) {
            fdo c = fhuVar.d.c();
            dzg.g(c);
            throw c;
        }
        fhmVar.v();
    }

    @Override // defpackage.fhv
    public final boolean c() {
        fhm fhmVar = this.b;
        if (!fhmVar.x()) {
            if (fhmVar.i[this.a].q(fhmVar.t)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (r12 != 0) goto L21;
     */
    @Override // defpackage.fhv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(defpackage.fqu r12, defpackage.ewl r13, int r14) {
        /*
            r11 = this;
            fhm r0 = r11.b
            boolean r1 = r0.x()
            r2 = -3
            if (r1 == 0) goto La
            goto L63
        La:
            int r1 = r11.a
            r0.t(r1)
            fhu[] r3 = r0.i
            r3 = r3[r1]
            boolean r8 = r0.t
            r4 = r14 & 2
            fhs r9 = r3.b
            r10 = 1
            if (r4 == 0) goto L1e
            r7 = r10
            goto L20
        L1e:
            r4 = 0
            r7 = r4
        L20:
            r4 = r3
            r5 = r12
            r6 = r13
            int r12 = r4.v(r5, r6, r7, r8, r9)
            r4 = -4
            if (r12 != r4) goto L5c
            boolean r12 = r13.eR()
            if (r12 != 0) goto L5b
            r12 = r14 & 1
            r14 = r14 & 4
            if (r14 != 0) goto L53
            if (r12 == 0) goto L44
            fhr r12 = r3.a
            fhs r14 = r3.b
            fhq r3 = r12.c
            euf r12 = r12.a
            defpackage.fhr.b(r3, r13, r14, r12)
            goto L5b
        L44:
            fhr r12 = r3.a
            fhs r14 = r3.b
            fhq r5 = r12.c
            euf r6 = r12.a
            fhq r13 = defpackage.fhr.b(r5, r13, r14, r6)
            r12.c = r13
            goto L56
        L53:
            if (r12 == 0) goto L56
            goto L5b
        L56:
            int r12 = r3.f
            int r12 = r12 + r10
            r3.f = r12
        L5b:
            r12 = r4
        L5c:
            if (r12 != r2) goto L62
            r0.u(r1)
            return r12
        L62:
            r2 = r12
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhk.d(fqu, ewl, int):int");
    }
}
