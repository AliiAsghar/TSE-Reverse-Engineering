package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjl {
    public float a = brg.a;
    public float b = brg.a;
    public float c = brg.a;
    public float d = brg.a;

    public final void a(float f, float f2, float f3, float f4) {
        this.a = Math.max(f, this.a);
        this.b = Math.max(f2, this.b);
        this.c = Math.min(f3, this.c);
        this.d = Math.min(f4, this.d);
    }

    public final void b(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean c() {
        boolean z;
        float f = this.a;
        float f2 = this.c;
        float f3 = this.b;
        float f4 = this.d;
        boolean z2 = true;
        if (f >= f2) {
            z = true;
        } else {
            z = false;
        }
        if (f3 < f4) {
            z2 = false;
        }
        return z | z2;
    }

    public final String toString() {
        return "MutableRect(" + cjk.a(this.a) + ", " + cjk.a(this.b) + ", " + cjk.a(this.c) + ", " + cjk.a(this.d) + ')';
    }
}
