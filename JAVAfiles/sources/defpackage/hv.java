package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hv {
    eer b;
    public boolean c;
    private Interpolator e;
    private long d = -1;
    private final ees f = new hu(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (!this.c) {
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((efu) arrayList.get(i)).d();
        }
        this.c = false;
    }

    public final void b() {
        View view;
        if (this.c) {
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            efu efuVar = (efu) arrayList.get(i);
            long j = this.d;
            if (j >= 0) {
                efuVar.f(j);
            }
            Interpolator interpolator = this.e;
            if (interpolator != null && (view = (View) ((WeakReference) efuVar.a).get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.b != null) {
                efuVar.g(this.f);
            }
            View view2 = (View) ((WeakReference) efuVar.a).get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.c = true;
    }

    public final void c() {
        if (!this.c) {
            this.d = 250L;
        }
    }

    public final void d(Interpolator interpolator) {
        if (!this.c) {
            this.e = interpolator;
        }
    }

    public final void e(eer eerVar) {
        if (!this.c) {
            this.b = eerVar;
        }
    }

    public final void f(efu efuVar) {
        if (!this.c) {
            this.a.add(efuVar);
        }
    }
}
