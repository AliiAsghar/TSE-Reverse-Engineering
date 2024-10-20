package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arjq {
    public int b;
    public int c;
    final /* synthetic */ adfg e;
    private final int f;
    private final arjp g;
    public final asqu a = new asqu();
    public boolean d = false;

    public arjq(adfg adfgVar, int i, int i2, arjp arjpVar) {
        this.e = adfgVar;
        this.f = i;
        this.b = i2;
        this.g = arjpVar;
    }

    public final int a() {
        return Math.max(0, Math.min(this.b, (int) this.a.b)) - this.c;
    }

    public final int b() {
        return Math.min(this.b, ((arjq) this.e.b).b);
    }

    public final void c(asqu asquVar, int i, boolean z) {
        do {
            int min = Math.min(i, ((arkq) ((aris) ((arir) this.e.c).b).a).a);
            int i2 = -min;
            ((arjq) this.e.b).f(i2);
            f(i2);
            try {
                boolean z2 = false;
                if (asquVar.b == min && z) {
                    z2 = true;
                }
                boolean z3 = z2;
                Object obj = this.e.c;
                int i3 = this.f;
                ((arir) obj).c.c(2, i3, asquVar, min, z3);
                try {
                    ((aris) ((arir) obj).b).a.b(z3, i3, asquVar, min);
                } catch (IOException e) {
                    ((arir) obj).a.a(e);
                }
                this.g.h(min);
                i -= min;
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } while (i > 0);
    }

    public final boolean d() {
        if (this.a.b > 0) {
            return true;
        }
        return false;
    }

    public final void e(int i, arjs arjsVar) {
        int min = Math.min(i, b());
        int i2 = 0;
        while (d() && min > 0) {
            asqu asquVar = this.a;
            long j = min;
            long j2 = asquVar.b;
            if (j >= j2) {
                int i3 = (int) j2;
                i2 += i3;
                c(asquVar, i3, this.d);
            } else {
                i2 += min;
                c(asquVar, min, false);
            }
            arjsVar.a++;
            min = Math.min(i - i2, b());
        }
    }

    public final void f(int i) {
        if (i > 0 && Integer.MAX_VALUE - i < this.b) {
            throw new IllegalArgumentException("Window size overflow for stream: " + this.f);
        }
        this.b += i;
    }
}
