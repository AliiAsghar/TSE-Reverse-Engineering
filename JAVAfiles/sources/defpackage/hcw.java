package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hcw {
    public hig d;
    private final hct e;
    final List a = new ArrayList(1);
    public boolean b = false;
    public float c = brg.a;
    private Object f = null;
    private float g = -1.0f;
    private float h = -1.0f;

    public hcw(List list) {
        hct hcuVar;
        hct hctVar;
        if (list.isEmpty()) {
            hctVar = new hcs();
        } else {
            if (list.size() == 1) {
                hcuVar = new hcv(list);
            } else {
                hcuVar = new hcu(list);
            }
            hctVar = hcuVar;
        }
        this.e = hctVar;
    }

    private final float k() {
        float f = this.g;
        if (f == -1.0f) {
            float b = this.e.b();
            this.g = b;
            return b;
        }
        return f;
    }

    public float a() {
        float f = this.h;
        if (f == -1.0f) {
            float a = this.e.a();
            this.h = a;
            return a;
        }
        return f;
    }

    public final float b() {
        hie d = d();
        if (d != null && !d.e()) {
            return d.d.getInterpolation(c());
        }
        return brg.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float c() {
        if (!this.b) {
            hie d = d();
            if (!d.e()) {
                return (this.c - d.c()) / (d.b() - d.c());
            }
            return brg.a;
        }
        return brg.a;
    }

    public final hie d() {
        hie c = this.e.c();
        hav.a();
        return c;
    }

    public Object e() {
        Object f;
        float c = c();
        if (this.d == null && this.e.d(c)) {
            return this.f;
        }
        hie d = d();
        Interpolator interpolator = d.e;
        if (interpolator != null && d.f != null) {
            f = g(d, c, interpolator.getInterpolation(c), d.f.getInterpolation(c));
        } else {
            f = f(d, b());
        }
        this.f = f;
        return f;
    }

    public abstract Object f(hie hieVar, float f);

    protected Object g(hie hieVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public final void h(hcr hcrVar) {
        this.a.add(hcrVar);
    }

    public void i() {
        for (int i = 0; i < this.a.size(); i++) {
            ((hcr) this.a.get(i)).d();
        }
    }

    public void j(float f) {
        if (!this.e.e()) {
            if (f < k()) {
                f = k();
            } else if (f > a()) {
                f = a();
            }
            if (f != this.c) {
                this.c = f;
                if (this.e.f(f)) {
                    i();
                }
            }
        }
    }
}
