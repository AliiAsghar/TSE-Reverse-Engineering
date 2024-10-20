package defpackage;

import android.text.Layout;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fst {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public fsn r;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final int a() {
        int i;
        int i2 = this.h;
        if (i2 == -1 && this.i == -1) {
            return -1;
        }
        int i3 = 0;
        if (i2 == 1) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.i == 1) {
            i3 = 2;
        }
        return i | i3;
    }

    public final void b(int i) {
        this.d = i;
        this.e = true;
    }

    public final void c(int i) {
        this.b = i;
        this.c = true;
    }

    public final void d(fst fstVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fstVar != null) {
            if (!this.c && fstVar.c) {
                c(fstVar.b);
            }
            if (this.h == -1) {
                this.h = fstVar.h;
            }
            if (this.i == -1) {
                this.i = fstVar.i;
            }
            if (this.a == null && (str = fstVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = fstVar.f;
            }
            if (this.g == -1) {
                this.g = fstVar.g;
            }
            if (this.n == -1) {
                this.n = fstVar.n;
            }
            if (this.o == null && (alignment2 = fstVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = fstVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = fstVar.q;
            }
            if (this.j == -1) {
                this.j = fstVar.j;
                this.k = fstVar.k;
            }
            if (this.r == null) {
                this.r = fstVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = fstVar.s;
            }
            if (!this.e && fstVar.e) {
                b(fstVar.d);
            }
            if (this.m == -1 && (i = fstVar.m) != -1) {
                this.m = i;
            }
        }
    }
}
