package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class rg {
    private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public boolean b;
    public arqg c;

    public rg(boolean z) {
        this.b = z;
    }

    public abstract void b();

    public final void e(ra raVar) {
        this.a.add(raVar);
    }

    public final void f() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ra) it.next()).a();
        }
    }

    public final void g(ra raVar) {
        this.a.remove(raVar);
    }

    public final void h(boolean z) {
        this.b = z;
        arqg arqgVar = this.c;
        if (arqgVar != null) {
            arqgVar.a();
        }
    }

    public void a() {
    }

    public void d() {
    }

    public void c(qz qzVar) {
    }
}
