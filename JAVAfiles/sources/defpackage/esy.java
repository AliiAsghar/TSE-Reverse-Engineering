package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esy {
    public CharSequence a;
    public Bitmap b;
    public Layout.Alignment c;
    public Layout.Alignment d;
    public int e;
    public float f;
    public int g;
    public float h;
    public float i;
    public int j;
    public float k;
    private float l;
    private int m;
    private int n;
    private float o;
    private boolean p;
    private int q;

    public esy() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.l = -3.4028235E38f;
        this.m = Integer.MIN_VALUE;
        this.e = Integer.MIN_VALUE;
        this.f = -3.4028235E38f;
        this.g = Integer.MIN_VALUE;
        this.n = Integer.MIN_VALUE;
        this.o = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = -3.4028235E38f;
        this.p = false;
        this.q = -16777216;
        this.j = Integer.MIN_VALUE;
    }

    public final esz a() {
        return new esz(this.a, this.c, this.d, this.b, this.l, this.m, this.e, this.f, this.g, this.n, this.o, this.h, this.i, this.p, this.q, this.j, this.k);
    }

    public final void b() {
        this.p = false;
    }

    public final void c(float f, int i) {
        this.l = f;
        this.m = i;
    }

    public final void d(float f, int i) {
        this.o = f;
        this.n = i;
    }

    public final void e(int i) {
        this.q = i;
        this.p = true;
    }

    public esy(esz eszVar) {
        this.a = eszVar.t;
        this.b = eszVar.w;
        this.c = eszVar.u;
        this.d = eszVar.v;
        this.l = eszVar.x;
        this.m = eszVar.y;
        this.e = eszVar.z;
        this.f = eszVar.A;
        this.g = eszVar.B;
        this.n = eszVar.G;
        this.o = eszVar.H;
        this.h = eszVar.C;
        this.i = eszVar.D;
        this.p = eszVar.E;
        this.q = eszVar.F;
        this.j = eszVar.I;
        this.k = eszVar.J;
    }
}
