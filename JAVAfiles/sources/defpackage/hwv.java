package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwv implements hwz, hwx {
    public volatile hwx a;
    public volatile hwx b;
    private final Object c;
    private final hwz d;
    private hwy e = hwy.CLEARED;
    private hwy f = hwy.CLEARED;

    public hwv(Object obj, hwz hwzVar) {
        this.c = obj;
        this.d = hwzVar;
    }

    @Override // defpackage.hwz
    public final hwz a() {
        hwz hwzVar;
        synchronized (this.c) {
            hwz hwzVar2 = this.d;
            if (hwzVar2 != null) {
                hwzVar = hwzVar2.a();
            } else {
                hwzVar = this;
            }
        }
        return hwzVar;
    }

    @Override // defpackage.hwx
    public final void b() {
        synchronized (this.c) {
            if (this.e != hwy.RUNNING) {
                this.e = hwy.RUNNING;
                this.a.b();
            }
        }
    }

    @Override // defpackage.hwx
    public final void c() {
        synchronized (this.c) {
            this.e = hwy.CLEARED;
            this.a.c();
            hwy hwyVar = this.f;
            hwy hwyVar2 = hwy.CLEARED;
            if (hwyVar != hwyVar2) {
                this.f = hwyVar2;
                this.b.c();
            }
        }
    }

    @Override // defpackage.hwz
    public final void d(hwx hwxVar) {
        synchronized (this.c) {
            if (!hwxVar.equals(this.b)) {
                this.e = hwy.FAILED;
                hwy hwyVar = this.f;
                hwy hwyVar2 = hwy.RUNNING;
                if (hwyVar != hwyVar2) {
                    this.f = hwyVar2;
                    this.b.b();
                }
                return;
            }
            this.f = hwy.FAILED;
            hwz hwzVar = this.d;
            if (hwzVar != null) {
                hwzVar.d(this);
            }
        }
    }

    @Override // defpackage.hwz
    public final void e(hwx hwxVar) {
        synchronized (this.c) {
            if (hwxVar.equals(this.a)) {
                this.e = hwy.SUCCESS;
            } else if (hwxVar.equals(this.b)) {
                this.f = hwy.SUCCESS;
            }
            hwz hwzVar = this.d;
            if (hwzVar != null) {
                hwzVar.e(this);
            }
        }
    }

    @Override // defpackage.hwx
    public final void f() {
        synchronized (this.c) {
            if (this.e == hwy.RUNNING) {
                this.e = hwy.PAUSED;
                this.a.f();
            }
            if (this.f == hwy.RUNNING) {
                this.f = hwy.PAUSED;
                this.b.f();
            }
        }
    }

    @Override // defpackage.hwz
    public final boolean g(hwx hwxVar) {
        boolean z;
        synchronized (this.c) {
            hwz hwzVar = this.d;
            z = false;
            if ((hwzVar == null || hwzVar.g(this)) && hwxVar.equals(this.a)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r6 != false) goto L21;
     */
    @Override // defpackage.hwz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(defpackage.hwx r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.c
            monitor-enter(r0)
            hwz r1 = r5.d     // Catch: java.lang.Throwable -> L37
            r2 = 0
            if (r1 == 0) goto Le
            boolean r1 = r1.h(r5)     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L35
        Le:
            hwy r1 = r5.e     // Catch: java.lang.Throwable -> L37
            hwy r3 = defpackage.hwy.FAILED     // Catch: java.lang.Throwable -> L37
            r4 = 1
            if (r1 == r3) goto L1c
            hwx r1 = r5.a     // Catch: java.lang.Throwable -> L37
            boolean r6 = r6.equals(r1)     // Catch: java.lang.Throwable -> L37
            goto L32
        L1c:
            hwx r1 = r5.b     // Catch: java.lang.Throwable -> L37
            boolean r6 = r6.equals(r1)     // Catch: java.lang.Throwable -> L37
            if (r6 == 0) goto L31
            hwy r6 = r5.f     // Catch: java.lang.Throwable -> L37
            hwy r1 = defpackage.hwy.SUCCESS     // Catch: java.lang.Throwable -> L37
            if (r6 == r1) goto L2f
            hwy r1 = defpackage.hwy.FAILED     // Catch: java.lang.Throwable -> L37
            if (r6 != r1) goto L31
            goto L34
        L2f:
            r6 = r4
            goto L32
        L31:
            r6 = r2
        L32:
            if (r6 == 0) goto L35
        L34:
            r2 = r4
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            return r2
        L37:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hwv.h(hwx):boolean");
    }

    @Override // defpackage.hwz
    public final boolean i(hwx hwxVar) {
        boolean z;
        synchronized (this.c) {
            hwz hwzVar = this.d;
            z = true;
            if (hwzVar != null && !hwzVar.i(this)) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.hwz, defpackage.hwx
    public final boolean j() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (!this.a.j() && !this.b.j()) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.hwx
    public final boolean k() {
        boolean z;
        synchronized (this.c) {
            z = false;
            if (this.e == hwy.CLEARED && this.f == hwy.CLEARED) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.hwx
    public final boolean l() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (this.e != hwy.SUCCESS && this.f != hwy.SUCCESS) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.hwx
    public final boolean m(hwx hwxVar) {
        if (hwxVar instanceof hwv) {
            hwv hwvVar = (hwv) hwxVar;
            if (this.a.m(hwvVar.a) && this.b.m(hwvVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hwx
    public final boolean n() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (this.e != hwy.RUNNING && this.f != hwy.RUNNING) {
                z = false;
            }
        }
        return z;
    }
}
