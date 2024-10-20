package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class env {
    public static final Object a = new Object();
    public final Object b;
    int c;
    public boolean d;
    public volatile Object e;
    public int f;
    private final ta g;
    private volatile Object h;
    private boolean i;
    private boolean j;
    private final Runnable k;

    public env() {
        this.b = new Object();
        this.g = new ta();
        this.c = 0;
        Object obj = a;
        this.e = obj;
        this.k = new ou(this, 19);
        this.h = obj;
        this.f = -1;
    }

    static void b(String str) {
        sq.a();
        if (a.y()) {
        } else {
            throw new IllegalStateException(a.bW(str, "Cannot invoke ", " on a background thread"));
        }
    }

    private final void l(enu enuVar) {
        if (enuVar.d) {
            if (!enuVar.a()) {
                enuVar.d(false);
                return;
            }
            int i = enuVar.e;
            int i2 = this.f;
            if (i < i2) {
                enuVar.e = i2;
                enuVar.c.a(this.h);
            }
        }
    }

    public final Object a() {
        Object obj = this.h;
        if (obj != a) {
            return obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(enu enuVar) {
        if (this.i) {
            this.j = true;
            return;
        }
        this.i = true;
        while (true) {
            this.j = false;
            if (enuVar != null) {
                l(enuVar);
            } else {
                sx e = this.g.e();
                while (e.hasNext()) {
                    l((enu) ((sw) e.next()).b);
                    if (this.j) {
                        break;
                    }
                }
            }
            if (this.j) {
                enuVar = null;
            } else {
                this.i = false;
                return;
            }
        }
    }

    public final void d(enm enmVar, enz enzVar) {
        b("observe");
        if (enmVar.N().a() != eng.DESTROYED) {
            ent entVar = new ent(this, enmVar, enzVar);
            enu enuVar = (enu) this.g.f(enzVar, entVar);
            if (enuVar != null && !enuVar.c(enmVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            }
            if (enuVar != null) {
                return;
            }
            enmVar.N().c(entVar);
        }
    }

    public final void e(enz enzVar) {
        b("observeForever");
        ens ensVar = new ens(this, enzVar);
        enu enuVar = (enu) this.g.f(enzVar, ensVar);
        if (!(enuVar instanceof ent)) {
            if (enuVar != null) {
                return;
            }
            ensVar.d(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    public final void h(Object obj) {
        Object obj2;
        Object obj3;
        synchronized (this.b) {
            obj2 = this.e;
            obj3 = a;
            this.e = obj;
        }
        if (obj2 != obj3) {
            return;
        }
        sq.a().b(this.k);
    }

    public void i(enz enzVar) {
        b("removeObserver");
        enu enuVar = (enu) this.g.b(enzVar);
        if (enuVar == null) {
            return;
        }
        enuVar.b();
        enuVar.d(false);
    }

    public void j(Object obj) {
        b("setValue");
        this.f++;
        this.h = obj;
        c(null);
    }

    public final boolean k() {
        if (this.c > 0) {
            return true;
        }
        return false;
    }

    public env(Object obj) {
        this.b = new Object();
        this.g = new ta();
        this.c = 0;
        this.e = a;
        this.k = new ou(this, 19);
        this.h = obj;
        this.f = 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g() {
    }
}
