package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class adon {
    public Throwable c;
    protected int d;
    protected int e;
    private Thread f;
    public volatile adpk a = adpk.INITIAL;
    public final Object b = new Object();
    private final Runnable g = new adhp(this, 11, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(acok acokVar) {
        int ordinal = acokVar.ordinal();
        if (ordinal != 21) {
            if (ordinal != 22) {
                switch (ordinal) {
                    case 1:
                        return 3;
                    case 2:
                        return 4;
                    case 3:
                        return 5;
                    case 4:
                        return 47;
                    case 5:
                        return 6;
                    case 6:
                        return 7;
                    case 7:
                        return 8;
                    case 8:
                        return 9;
                    case 9:
                        return 10;
                    case 10:
                        return 11;
                    case 11:
                        return 12;
                    case 12:
                        return 2;
                    case 13:
                        return 13;
                    case 14:
                        return 14;
                    case 15:
                        return 15;
                    case 16:
                        return 16;
                    case 17:
                        return 17;
                    default:
                        return 18;
                }
            }
            return 51;
        }
        return 50;
    }

    public abstract void c();

    public abstract void d();

    protected abstract void e();

    public abstract void f();

    public abstract void g(Throwable th);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(int i) {
        if (this.d == 0) {
            this.d = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(int i) {
        if (this.e == 0) {
            this.e = i;
        }
    }

    public final synchronized void j() {
        advr.c("Starting session in state [%s]", this.a);
        if (this.a.ordinal() != 0) {
            synchronized (this.b) {
                this.b.notify();
            }
        } else {
            this.a = adpk.STARTING;
            k();
        }
    }

    protected final synchronized void k() {
        Thread thread = new Thread(this.g);
        this.f = thread;
        thread.start();
    }

    public final synchronized void l() {
        m(null);
    }

    public final synchronized void m(Throwable th) {
        advr.c("Stopping session in state [%s] error [%s]", this.a, th);
        if (this.c == null) {
            this.c = th;
        }
        if (this.f == null) {
            advr.c("Session thread is null, starting session thread.", new Object[0]);
            k();
        }
        int ordinal = this.a.ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
            if (ordinal == 4 || ordinal == 5) {
                return;
            }
        } else {
            this.a = adpk.STOPPING;
            if (this.f != null) {
                advr.k("Interrupting session thread.", new Object[0]);
                this.f.interrupt();
            }
        }
        synchronized (this.b) {
            this.b.notify();
        }
    }

    public final synchronized void n(int i, int i2) {
        this.d = i;
        this.e = i2;
        l();
    }

    public final synchronized void o(Throwable th, int i, int i2) {
        this.d = i;
        this.e = i2;
        m(th);
    }

    public final void p() {
        try {
            advr.c("On stopped", new Object[0]);
            if (this.c == null) {
                e();
            } else {
                r();
            }
        } catch (Exception e) {
            advr.i(e, "Error while calling stopped: %s", e.getMessage());
        }
    }

    public final synchronized boolean q() {
        if (this.a != adpk.STOPPING) {
            if (this.a != adpk.STOPPED) {
                return false;
            }
        }
        return true;
    }

    protected abstract void r();

    public String toString() {
        return " State: " + String.valueOf(this.a) + "\r\n Error: " + String.valueOf(this.c);
    }

    public void b() {
    }
}
