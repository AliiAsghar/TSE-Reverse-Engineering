package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hps implements hpt, hza {
    private static final ecf a = hzc.a(20, new hqx(1));
    private hpt b;
    private boolean c;
    private boolean d;
    private final zeq e = new zeq();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static hps d(hpt hptVar) {
        hps hpsVar = (hps) a.a();
        hwr.i(hpsVar);
        hpsVar.d = false;
        hpsVar.c = true;
        hpsVar.b = hptVar;
        return hpsVar;
    }

    @Override // defpackage.hpt
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.hpt
    public final Class b() {
        return this.b.b();
    }

    @Override // defpackage.hpt
    public final Object c() {
        return this.b.c();
    }

    @Override // defpackage.hpt
    public final synchronized void e() {
        this.e.a();
        this.d = true;
        if (!this.c) {
            this.b.e();
            this.b = null;
            a.b(this);
        }
    }

    @Override // defpackage.hza
    public final zeq f() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void g() {
        this.e.a();
        if (this.c) {
            this.c = false;
            if (this.d) {
                e();
                return;
            }
            return;
        }
        throw new IllegalStateException("Already unlocked");
    }
}
