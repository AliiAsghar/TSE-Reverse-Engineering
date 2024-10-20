package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbt {
    public static Executor a = Executors.newCachedThreadPool();
    public volatile hbr b;
    private final Set c;
    private final Set d;
    private final Handler e;

    public hbt(Callable callable) {
        this(callable, false);
    }

    public final synchronized void a(Throwable th) {
        ArrayList arrayList = new ArrayList(this.d);
        if (arrayList.isEmpty()) {
            hhw.b("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((hbn) arrayList.get(i)).a(th);
        }
    }

    public final synchronized void b(Object obj) {
        ArrayList arrayList = new ArrayList(this.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((hbn) arrayList.get(i)).a(obj);
        }
    }

    public final void c(hbr hbrVar) {
        if (this.b == null) {
            this.b = hbrVar;
            this.e.post(new gtq(this, 4));
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public final synchronized void d(hbn hbnVar) {
        Throwable th;
        hbr hbrVar = this.b;
        if (hbrVar != null && (th = hbrVar.b) != null) {
            hbnVar.a(th);
        }
        this.d.add(hbnVar);
    }

    public final synchronized void e(hbn hbnVar) {
        Object obj;
        hbr hbrVar = this.b;
        if (hbrVar != null && (obj = hbrVar.a) != null) {
            hbnVar.a(obj);
        }
        this.c.add(hbnVar);
    }

    public final synchronized void f(hbn hbnVar) {
        this.d.remove(hbnVar);
    }

    public final synchronized void g(hbn hbnVar) {
        this.c.remove(hbnVar);
    }

    public hbt(Callable callable, boolean z) {
        this.c = new LinkedHashSet(1);
        this.d = new LinkedHashSet(1);
        this.e = new Handler(Looper.getMainLooper());
        this.b = null;
        if (z) {
            try {
                c((hbr) callable.call());
                return;
            } catch (Throwable th) {
                c(new hbr(th));
                return;
            }
        }
        a.execute(new hbs(this, callable));
    }
}
