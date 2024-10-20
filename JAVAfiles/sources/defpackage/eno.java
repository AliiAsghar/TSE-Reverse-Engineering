package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eno extends enh {
    private final WeakReference d;
    private int e;
    private boolean f;
    private boolean g;
    public st b = new st();
    public eng c = eng.INITIALIZED;
    private final ArrayList h = new ArrayList();
    private final ascd i = ascy.a(eng.INITIALIZED);

    public eno(enm enmVar) {
        this.d = new WeakReference(enmVar);
    }

    public static final void g(String str) {
        sq.a();
        if (a.y()) {
        } else {
            throw new IllegalStateException(a.bW(str, "Method ", " must be called on the main thread"));
        }
    }

    private final eng h(enl enlVar) {
        sw swVar;
        Object obj;
        st stVar = this.b;
        eng engVar = null;
        if (stVar.c(enlVar)) {
            swVar = ((sw) stVar.a.get(enlVar)).d;
        } else {
            swVar = null;
        }
        if (swVar != null) {
            obj = ((enn) swVar.b).a;
        } else {
            obj = null;
        }
        if (!this.h.isEmpty()) {
            engVar = (eng) this.h.get(r0.size() - 1);
        }
        return dyw.h(dyw.h(this.c, (eng) obj), engVar);
    }

    private final void i(eng engVar) {
        eng engVar2 = this.c;
        if (engVar2 != engVar) {
            if (engVar2 == eng.INITIALIZED && engVar == eng.DESTROYED) {
                throw new IllegalStateException("State must be at least CREATED to move to " + engVar + ", but was " + this.c + " in component " + this.d.get());
            }
            this.c = engVar;
            if (!this.f && this.e == 0) {
                this.f = true;
                l();
                this.f = false;
                if (this.c == eng.DESTROYED) {
                    this.b = new st();
                    return;
                }
                return;
            }
            this.g = true;
        }
    }

    private final void j() {
        this.h.remove(r0.size() - 1);
    }

    private final void k(eng engVar) {
        this.h.add(engVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        r6.g = false;
        r6.i.f(r6.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void l() {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eno.l():void");
    }

    @Override // defpackage.enh
    public final eng a() {
        return this.c;
    }

    @Override // defpackage.enh
    public final ascv b() {
        return new ascf(this.i);
    }

    @Override // defpackage.enh
    public final void c(enl enlVar) {
        Object obj;
        enm enmVar;
        boolean z;
        enlVar.getClass();
        g("addObserver");
        eng engVar = this.c;
        eng engVar2 = eng.DESTROYED;
        if (engVar != engVar2) {
            engVar2 = eng.INITIALIZED;
        }
        enn ennVar = new enn(enlVar, engVar2);
        st stVar = this.b;
        sw a = stVar.a(enlVar);
        if (a != null) {
            obj = a.b;
        } else {
            stVar.a.put(enlVar, stVar.d(enlVar, ennVar));
            obj = null;
        }
        if (((enn) obj) == null && (enmVar = (enm) this.d.get()) != null) {
            if (this.e == 0 && !this.f) {
                z = false;
            } else {
                z = true;
            }
            eng h = h(enlVar);
            this.e++;
            while (((eng) ennVar.a).compareTo(h) < 0 && this.b.c(enlVar)) {
                k((eng) ennVar.a);
                enf a2 = ene.a((eng) ennVar.a);
                if (a2 != null) {
                    ennVar.a(enmVar, a2);
                    j();
                    h = h(enlVar);
                } else {
                    Object obj2 = ennVar.a;
                    Objects.toString(obj2);
                    throw new IllegalStateException("no event up from ".concat(String.valueOf(obj2)));
                }
            }
            if (!z) {
                l();
            }
            this.e--;
        }
    }

    @Override // defpackage.enh
    public final void d(enl enlVar) {
        enlVar.getClass();
        g("removeObserver");
        this.b.b(enlVar);
    }

    public void e(enf enfVar) {
        enfVar.getClass();
        g("handleLifecycleEvent");
        i(enfVar.a());
    }

    public final void f(eng engVar) {
        engVar.getClass();
        g("setCurrentState");
        i(engVar);
    }
}
