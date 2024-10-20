package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rm {
    public final arnr a;
    public rg b;
    private final Runnable c;
    private OnBackInvokedCallback d;
    private OnBackInvokedDispatcher e;
    private boolean f;
    private boolean g;

    public rm() {
        this(null);
    }

    private final void g(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            if (z) {
                if (!this.f) {
                    onBackInvokedDispatcher.registerOnBackInvokedCallback(0, onBackInvokedCallback);
                    this.f = true;
                    return;
                }
                return;
            }
            if (this.f) {
                onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
                this.f = false;
            }
        }
    }

    public final ra a(rg rgVar) {
        this.a.add(rgVar);
        rk rkVar = new rk(this, rgVar);
        rgVar.e(rkVar);
        f();
        rgVar.c = new rl(this, 0);
        return rkVar;
    }

    public final void b(enm enmVar, rg rgVar) {
        enmVar.getClass();
        rgVar.getClass();
        enh N = enmVar.N();
        if (N.a() == eng.DESTROYED) {
            return;
        }
        rgVar.e(new rj(this, N, rgVar));
        f();
        rgVar.c = new rl(this, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        rg rgVar;
        rg rgVar2 = this.b;
        if (rgVar2 == null) {
            arnr arnrVar = this.a;
            ListIterator listIterator = arnrVar.listIterator(arnrVar.c);
            while (true) {
                if (listIterator.hasPrevious()) {
                    rgVar = listIterator.previous();
                    if (((rg) rgVar).b) {
                        break;
                    }
                } else {
                    rgVar = 0;
                    break;
                }
            }
            rgVar2 = rgVar;
        }
        this.b = null;
        if (rgVar2 != null) {
            rgVar2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void d() {
        rg rgVar;
        rg rgVar2 = this.b;
        if (rgVar2 == null) {
            arnr arnrVar = this.a;
            ListIterator listIterator = arnrVar.listIterator(arnrVar.c);
            while (true) {
                if (listIterator.hasPrevious()) {
                    rgVar = listIterator.previous();
                    if (((rg) rgVar).b) {
                        break;
                    }
                } else {
                    rgVar = 0;
                    break;
                }
            }
            rgVar2 = rgVar;
        }
        this.b = null;
        if (rgVar2 != null) {
            rgVar2.b();
            return;
        }
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void e(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        this.e = onBackInvokedDispatcher;
        g(this.g);
    }

    public final void f() {
        boolean z = this.g;
        arnr arnrVar = this.a;
        boolean z2 = false;
        if (!arnrVar.isEmpty()) {
            Iterator<E> it = arnrVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((rg) it.next()).b) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 != z && Build.VERSION.SDK_INT >= 33) {
            g(z2);
        }
    }

    public rm(Runnable runnable) {
        OnBackInvokedCallback pwVar;
        this.c = runnable;
        this.a = new arnr();
        if (Build.VERSION.SDK_INT >= 33) {
            if (Build.VERSION.SDK_INT >= 34) {
                pwVar = new ri(new rh(this, 0), new rh(this, 2), new rd(this, 3), new rd(this, 4));
            } else {
                pwVar = new pw(new rd(this, 5), 2);
            }
            this.d = pwVar;
        }
    }
}
