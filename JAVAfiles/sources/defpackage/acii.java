package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acii implements acis {
    public final Object a;
    public final Object b;
    private final Executor c;
    private final /* synthetic */ int d;

    public acii(Executor executor, acig acigVar, aciv acivVar, int i) {
        this.d = i;
        this.c = executor;
        this.b = acigVar;
        this.a = acivVar;
    }

    @Override // defpackage.acis
    public final void a(acir acirVar) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (acirVar.l()) {
                            synchronized (this.a) {
                            }
                            this.c.execute(new acaj(this, acirVar, 9, (char[]) null));
                            return;
                        }
                        return;
                    }
                    if (!acirVar.l() && !((aciv) acirVar).c) {
                        synchronized (this.a) {
                        }
                        this.c.execute(new acaj(this, acirVar, 8, (char[]) null));
                        return;
                    }
                    return;
                }
                synchronized (this.a) {
                }
                this.c.execute(new acaj(this, acirVar, 7, (char[]) null));
                return;
            }
            this.c.execute(new acaj(this, acirVar, 5, (char[]) null));
            return;
        }
        if (((aciv) acirVar).c) {
            synchronized (this.a) {
            }
            new acbq(this, 3, null).run();
        }
    }

    public acii(Executor executor, Object obj, int i) {
        this.d = i;
        this.a = new Object();
        this.c = executor;
        this.b = obj;
    }
}
