package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arfz implements aral {
    final arga a;
    public final /* synthetic */ argc b;

    public arfz(argc argcVar, arga argaVar) {
        this.b = argcVar;
        this.a = argaVar;
    }

    private static final Integer b(aqut aqutVar) {
        String str = (String) aqutVar.b(argc.b);
        if (str != null) {
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                return -1;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0265  */
    @Override // defpackage.aral
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(io.grpc.Status r21, defpackage.arak r22, defpackage.aqut r23) {
        /*
            Method dump skipped, instructions count: 781
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arfz.a(io.grpc.Status, arak, aqut):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        if (r0.d.compareAndSet(r1, java.lang.Math.min(r0.c + r1, r2)) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        r0 = r5.b;
        r0.g.execute(new defpackage.ardm(r5, r6, 4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        r1 = r0.d.get();
        r2 = r0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (r1 != r2) goto L12;
     */
    @Override // defpackage.aral
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.aqut r6) {
        /*
            r5 = this;
            arga r0 = r5.a
            int r0 = r0.d
            if (r0 <= 0) goto L18
            aquo r0 = defpackage.argc.a
            r6.e(r0)
            arga r0 = r5.a
            aquo r1 = defpackage.argc.a
            int r0 = r0.d
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r6.h(r1, r0)
        L18:
            argc r0 = r5.b
            arga r1 = r5.a
            r0.r(r1)
            argc r0 = r5.b
            arfy r0 = r0.q
            arga r0 = r0.f
            arga r1 = r5.a
            if (r0 != r1) goto L56
            argc r0 = r5.b
            argb r0 = r0.o
            if (r0 == 0) goto L49
        L2f:
            java.util.concurrent.atomic.AtomicInteger r1 = r0.d
            int r1 = r1.get()
            int r2 = r0.a
            if (r1 != r2) goto L3a
            goto L49
        L3a:
            int r3 = r0.c
            java.util.concurrent.atomic.AtomicInteger r4 = r0.d
            int r3 = r3 + r1
            int r2 = java.lang.Math.min(r3, r2)
            boolean r1 = r4.compareAndSet(r1, r2)
            if (r1 == 0) goto L2f
        L49:
            argc r0 = r5.b
            ardm r1 = new ardm
            r2 = 4
            r1.<init>(r5, r6, r2)
            java.util.concurrent.Executor r6 = r0.g
            r6.execute(r1)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arfz.c(aqut):void");
    }

    @Override // defpackage.arhq
    public final void d(arhp arhpVar) {
        boolean z;
        arfy arfyVar = this.b.q;
        if (arfyVar.f != null) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "Headers should be received prior to messages.");
        if (arfyVar.f != this.a) {
            arcb.g(arhpVar);
            return;
        }
        argc argcVar = this.b;
        argcVar.g.execute(new ardm(this, arhpVar, 7, null));
    }

    @Override // defpackage.arhq
    public final void e() {
        if (!this.b.o()) {
            return;
        }
        argc argcVar = this.b;
        argcVar.g.execute(new arer(this, 10));
    }
}
