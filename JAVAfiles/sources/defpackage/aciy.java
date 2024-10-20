package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aciy implements acix {
    private final Object a = new Object();
    private final int b;
    private final aciv c;
    private int d;
    private int e;
    private int f;
    private Exception g;
    private boolean h;

    public aciy(int i, aciv acivVar) {
        this.b = i;
        this.c = acivVar;
    }

    private final void c() {
        if (this.d + this.e + this.f == this.b) {
            if (this.g != null) {
                this.c.t(new ExecutionException(this.e + " out of " + this.b + " underlying tasks failed", this.g));
                return;
            }
            if (this.h) {
                this.c.w();
            } else {
                this.c.u(null);
            }
        }
    }

    @Override // defpackage.acij
    public final void b() {
        synchronized (this.a) {
            this.f++;
            this.h = true;
            c();
        }
    }

    @Override // defpackage.acil
    public final void d(Exception exc) {
        synchronized (this.a) {
            this.e++;
            this.g = exc;
            c();
        }
    }

    @Override // defpackage.acim
    public final void e(Object obj) {
        synchronized (this.a) {
            this.d++;
            c();
        }
    }
}
