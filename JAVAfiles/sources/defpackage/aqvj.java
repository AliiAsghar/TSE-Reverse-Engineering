package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqvj extends apzj {
    private final aqsm d;
    private final apzj e;

    public aqvj() {
        super(null);
    }

    @Override // defpackage.apzj
    public final void a() {
        aqsm a = this.d.a();
        try {
            this.e.a();
        } finally {
            this.d.f(a);
        }
    }

    @Override // defpackage.apzj
    public final void b() {
        aqsm a = this.d.a();
        try {
            this.e.b();
        } finally {
            this.d.f(a);
        }
    }

    @Override // defpackage.apzj
    public final void c() {
        aqsm a = this.d.a();
        try {
            this.e.c();
        } finally {
            this.d.f(a);
        }
    }

    @Override // defpackage.apzj
    public final void d(Object obj) {
        aqsm a = this.d.a();
        try {
            this.e.d(obj);
        } finally {
            this.d.f(a);
        }
    }

    @Override // defpackage.apzj
    public final void e() {
        aqsm a = this.d.a();
        try {
            this.e.e();
        } finally {
            this.d.f(a);
        }
    }

    protected final apzj m() {
        return this.e;
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("delegate", m());
        return aj.toString();
    }

    public aqvj(apzj apzjVar, aqsm aqsmVar) {
        this();
        this.e = apzjVar;
        this.d = aqsmVar;
    }
}
