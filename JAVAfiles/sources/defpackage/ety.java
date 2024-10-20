package defpackage;

import android.os.Looper;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ety {
    public final etu a;
    public final etw b;
    public final CopyOnWriteArraySet c;
    private final eti d;
    private final ArrayDeque e;
    private final ArrayDeque f;
    private final Object g;
    private boolean h;
    private boolean i;

    public ety(Looper looper, eti etiVar, etw etwVar) {
        this(new CopyOnWriteArraySet(), looper, etiVar, etwVar, true);
    }

    public final ety a(Looper looper, etw etwVar) {
        return new ety(this.c, looper, this.d, etwVar, this.i);
    }

    public final void b(Object obj) {
        synchronized (this.g) {
            if (this.h) {
                return;
            }
            this.c.add(new etx(obj));
        }
    }

    public final void c() {
        g();
        if (!this.f.isEmpty()) {
            if (!this.a.c()) {
                etu etuVar = this.a;
                etuVar.j(etuVar.f(1));
            }
            boolean isEmpty = this.e.isEmpty();
            this.e.addAll(this.f);
            this.f.clear();
            if (isEmpty) {
                while (!this.e.isEmpty()) {
                    ((Runnable) this.e.peekFirst()).run();
                    this.e.removeFirst();
                }
            }
        }
    }

    public final void d(int i, etv etvVar) {
        g();
        this.f.add(new qq(new CopyOnWriteArraySet(this.c), i, etvVar, 4));
    }

    public final void e() {
        g();
        synchronized (this.g) {
            this.h = true;
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((etx) it.next()).a(this.b);
        }
        this.c.clear();
    }

    public final void f(int i, etv etvVar) {
        d(i, etvVar);
        c();
    }

    public final void g() {
        boolean z;
        if (!this.i) {
            return;
        }
        if (Thread.currentThread() == ((eui) this.a).b.getLooper().getThread()) {
            z = true;
        } else {
            z = false;
        }
        dzg.d(z);
    }

    private ety(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, eti etiVar, etw etwVar, boolean z) {
        this.d = etiVar;
        this.c = copyOnWriteArraySet;
        this.b = etwVar;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.a = etiVar.b(looper, new hvk(this, 1, null));
        this.i = z;
    }
}
