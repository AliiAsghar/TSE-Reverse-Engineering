package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxf implements hwz, hwx {
    public volatile hwx a;
    public volatile hwx b;
    private final hwz c;
    private final Object d;
    private hwy e = hwy.CLEARED;
    private hwy f = hwy.CLEARED;
    private boolean g;

    public hxf(Object obj, hwz hwzVar) {
        this.d = obj;
        this.c = hwzVar;
    }

    @Override // defpackage.hwz
    public final hwz a() {
        hwz hwzVar;
        synchronized (this.d) {
            hwz hwzVar2 = this.c;
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
        synchronized (this.d) {
            this.g = true;
            try {
                if (this.e != hwy.SUCCESS) {
                    hwy hwyVar = this.f;
                    hwy hwyVar2 = hwy.RUNNING;
                    if (hwyVar != hwyVar2) {
                        this.f = hwyVar2;
                        this.b.b();
                    }
                }
                if (this.g) {
                    hwy hwyVar3 = this.e;
                    hwy hwyVar4 = hwy.RUNNING;
                    if (hwyVar3 != hwyVar4) {
                        this.e = hwyVar4;
                        this.a.b();
                    }
                }
            } finally {
                this.g = false;
            }
        }
    }

    @Override // defpackage.hwx
    public final void c() {
        synchronized (this.d) {
            this.g = false;
            this.e = hwy.CLEARED;
            this.f = hwy.CLEARED;
            this.b.c();
            this.a.c();
        }
    }

    @Override // defpackage.hwz
    public final void d(hwx hwxVar) {
        synchronized (this.d) {
            if (!hwxVar.equals(this.a)) {
                this.f = hwy.FAILED;
                return;
            }
            this.e = hwy.FAILED;
            hwz hwzVar = this.c;
            if (hwzVar != null) {
                hwzVar.d(this);
            }
        }
    }

    @Override // defpackage.hwz
    public final void e(hwx hwxVar) {
        synchronized (this.d) {
            if (hwxVar.equals(this.b)) {
                this.f = hwy.SUCCESS;
                return;
            }
            this.e = hwy.SUCCESS;
            hwz hwzVar = this.c;
            if (hwzVar != null) {
                hwzVar.e(this);
            }
            if (!this.f.f) {
                this.b.c();
            }
        }
    }

    @Override // defpackage.hwx
    public final void f() {
        synchronized (this.d) {
            if (!this.f.f) {
                this.f = hwy.PAUSED;
                this.b.f();
            }
            if (!this.e.f) {
                this.e = hwy.PAUSED;
                this.a.f();
            }
        }
    }

    @Override // defpackage.hwz
    public final boolean g(hwx hwxVar) {
        boolean z;
        synchronized (this.d) {
            hwz hwzVar = this.c;
            z = false;
            if ((hwzVar == null || hwzVar.g(this)) && hwxVar.equals(this.a) && this.e != hwy.PAUSED) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.hwz
    public final boolean h(hwx hwxVar) {
        boolean z;
        synchronized (this.d) {
            hwz hwzVar = this.c;
            z = false;
            if ((hwzVar == null || hwzVar.h(this)) && hwxVar.equals(this.a) && !j()) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.hwz
    public final boolean i(hwx hwxVar) {
        boolean z;
        synchronized (this.d) {
            hwz hwzVar = this.c;
            z = false;
            if ((hwzVar == null || hwzVar.i(this)) && (hwxVar.equals(this.a) || this.e != hwy.SUCCESS)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.hwz, defpackage.hwx
    public final boolean j() {
        boolean z;
        synchronized (this.d) {
            z = true;
            if (!this.b.j() && !this.a.j()) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.hwx
    public final boolean k() {
        boolean z;
        synchronized (this.d) {
            if (this.e == hwy.CLEARED) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.hwx
    public final boolean l() {
        boolean z;
        synchronized (this.d) {
            if (this.e == hwy.SUCCESS) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.hwx
    public final boolean m(hwx hwxVar) {
        if (hwxVar instanceof hxf) {
            hxf hxfVar = (hxf) hwxVar;
            if (this.a != null ? this.a.m(hxfVar.a) : hxfVar.a == null) {
                if (this.b == null) {
                    if (hxfVar.b == null) {
                        return true;
                    }
                } else if (this.b.m(hxfVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.hwx
    public final boolean n() {
        boolean z;
        synchronized (this.d) {
            if (this.e == hwy.RUNNING) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }
}
