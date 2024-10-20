package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acin implements acis, acim, acil, acij {
    public final aciv a;
    public final Object b;
    private final Executor c;
    private final /* synthetic */ int d;

    public acin(Executor executor, Object obj, aciv acivVar, int i) {
        this.d = i;
        this.c = executor;
        this.b = obj;
        this.a = acivVar;
    }

    @Override // defpackage.acis
    public final void a(acir acirVar) {
        if (this.d != 0) {
            this.c.execute(new acaj(this, acirVar, 6, (char[]) null));
        } else {
            this.c.execute(new acaj(this, acirVar, 10, (char[]) null));
        }
    }

    @Override // defpackage.acij
    public final void b() {
        if (this.d != 0) {
            this.a.w();
        } else {
            this.a.w();
        }
    }

    @Override // defpackage.acil
    public final void d(Exception exc) {
        if (this.d != 0) {
            this.a.t(exc);
        } else {
            this.a.t(exc);
        }
    }

    @Override // defpackage.acim
    public final void e(Object obj) {
        if (this.d != 0) {
            this.a.u(obj);
        } else {
            this.a.u(obj);
        }
    }
}
