package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajfg {
    private final float a;
    private final float b;
    private ajfh d;
    private ajfh e;
    private final List c = new ArrayList();
    private int f = -1;
    private int g = -1;
    private float h = brg.a;
    private int i = -1;

    public ajfg(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final ajfg a(float f, float f2, float f3) {
        h(f, f2, f3, false, true);
        return this;
    }

    public final ajfi b() {
        if (this.d != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.c.size(); i++) {
                ajfh ajfhVar = (ajfh) this.c.get(i);
                float f = this.d.b;
                float f2 = this.a;
                arrayList.add(new ajfh((f - (this.f * f2)) + (i * f2), ajfhVar.b, ajfhVar.c, ajfhVar.d, ajfhVar.e, ajfhVar.f, ajfhVar.g, ajfhVar.h));
            }
            return new ajfi(this.a, arrayList, this.f, this.g);
        }
        throw new IllegalStateException("There must be a keyline marked as focal.");
    }

    public final void c(float f, float f2, float f3, boolean z) {
        h(f, f2, f3, z, false);
    }

    public final void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, float f6) {
        if (f3 <= brg.a) {
            return;
        }
        if (z2) {
            if (!z) {
                int i = this.i;
                if (i != -1 && i != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.i = this.c.size();
            } else {
                throw new IllegalArgumentException("Anchor keylines cannot be focal.");
            }
        }
        ajfh ajfhVar = new ajfh(Float.MIN_VALUE, f, f2, f3, z2, f4, f5, f6);
        if (z) {
            if (this.d == null) {
                this.d = ajfhVar;
                this.f = this.c.size();
            }
            if (this.g != -1 && this.c.size() - this.g > 1) {
                throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
            }
            if (f3 == this.d.d) {
                this.e = ajfhVar;
                this.g = this.c.size();
            } else {
                throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
            }
        } else {
            if (this.d == null && ajfhVar.d < this.h) {
                throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
            }
            if (this.e != null && ajfhVar.d > this.h) {
                throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
            }
        }
        this.h = ajfhVar.d;
        this.c.add(ajfhVar);
    }

    public final void e(float f, float f2, float f3, int i) {
        f(f, f2, f3, i, false);
    }

    public final void f(float f, float f2, float f3, int i, boolean z) {
        if (i > 0 && f3 > brg.a) {
            for (int i2 = 0; i2 < i; i2++) {
                c((i2 * f3) + f, f2, f3, z);
            }
        }
    }

    public final void g(float f, float f2, float f3, boolean z, boolean z2, float f4) {
        d(f, f2, f3, z, z2, f4, brg.a, brg.a);
    }

    public final void h(float f, float f2, float f3, boolean z, boolean z2) {
        float f4;
        float abs;
        float f5 = f3 / 2.0f;
        float f6 = f + f5;
        float f7 = this.b;
        if (f6 > f7) {
            abs = Math.abs(f6 - Math.max(f6 - f3, f7));
        } else {
            float f8 = f - f5;
            if (f8 < brg.a) {
                abs = Math.abs(f8 - Math.min(f8 + f3, brg.a));
            } else {
                f4 = 0.0f;
                g(f, f2, f3, z, z2, f4);
            }
        }
        f4 = abs;
        g(f, f2, f3, z, z2, f4);
    }
}
