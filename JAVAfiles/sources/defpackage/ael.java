package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ael {
    public long a = 0;
    public EdgeEffect b;
    public EdgeEffect c;
    public EdgeEffect d;
    public EdgeEffect e;
    public EdgeEffect f;
    public EdgeEffect g;
    public EdgeEffect h;
    public EdgeEffect i;
    private final Context j;
    private final int k;

    public ael(Context context, int i) {
        this.j = context;
        this.k = i;
    }

    private final EdgeEffect u(ahp ahpVar) {
        EdgeEffect edgeEffect;
        int i = Build.VERSION.SDK_INT;
        Context context = this.j;
        if (i >= 31) {
            try {
                edgeEffect = new EdgeEffect(context, null);
            } catch (Throwable unused) {
                edgeEffect = new EdgeEffect(context);
            }
        } else {
            edgeEffect = new aeq(context);
        }
        edgeEffect.setColor(this.k);
        if (!a.bB(this.a, 0L)) {
            if (ahpVar == ahp.a) {
                long j = this.a;
                edgeEffect.setSize((int) (j >> 32), (int) (4294967295L & j));
            } else {
                long j2 = this.a;
                edgeEffect.setSize((int) (4294967295L & j2), (int) (j2 >> 32));
            }
        }
        return edgeEffect;
    }

    private static final boolean v(EdgeEffect edgeEffect) {
        if (edgeEffect == null || edgeEffect.isFinished()) {
            return false;
        }
        return true;
    }

    private static final boolean w(EdgeEffect edgeEffect) {
        if (edgeEffect == null || aej.a(edgeEffect) == brg.a) {
            return false;
        }
        return true;
    }

    public final EdgeEffect a() {
        EdgeEffect edgeEffect = this.c;
        if (edgeEffect == null) {
            EdgeEffect u = u(ahp.a);
            this.c = u;
            return u;
        }
        return edgeEffect;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.g;
        if (edgeEffect == null) {
            EdgeEffect u = u(ahp.a);
            this.g = u;
            return u;
        }
        return edgeEffect;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.d;
        if (edgeEffect == null) {
            EdgeEffect u = u(ahp.b);
            this.d = u;
            return u;
        }
        return edgeEffect;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.h;
        if (edgeEffect == null) {
            EdgeEffect u = u(ahp.b);
            this.h = u;
            return u;
        }
        return edgeEffect;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.e;
        if (edgeEffect == null) {
            EdgeEffect u = u(ahp.b);
            this.e = u;
            return u;
        }
        return edgeEffect;
    }

    public final EdgeEffect f() {
        EdgeEffect edgeEffect = this.i;
        if (edgeEffect == null) {
            EdgeEffect u = u(ahp.b);
            this.i = u;
            return u;
        }
        return edgeEffect;
    }

    public final EdgeEffect g() {
        EdgeEffect edgeEffect = this.b;
        if (edgeEffect == null) {
            EdgeEffect u = u(ahp.a);
            this.b = u;
            return u;
        }
        return edgeEffect;
    }

    public final EdgeEffect h() {
        EdgeEffect edgeEffect = this.f;
        if (edgeEffect == null) {
            EdgeEffect u = u(ahp.a);
            this.f = u;
            return u;
        }
        return edgeEffect;
    }

    public final boolean i() {
        return v(this.c);
    }

    public final boolean j() {
        return w(this.g);
    }

    public final boolean k() {
        return w(this.c);
    }

    public final boolean l() {
        return v(this.d);
    }

    public final boolean m() {
        return w(this.h);
    }

    public final boolean n() {
        return w(this.d);
    }

    public final boolean o() {
        return v(this.e);
    }

    public final boolean p() {
        return w(this.i);
    }

    public final boolean q() {
        return w(this.e);
    }

    public final boolean r() {
        return v(this.b);
    }

    public final boolean s() {
        return w(this.f);
    }

    public final boolean t() {
        return w(this.b);
    }
}
