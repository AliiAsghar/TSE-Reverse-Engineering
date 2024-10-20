package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkk {
    public final fjt a = new fjt();
    public final fki b;
    public final fkj c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public int h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    private float p;
    private float q;

    public fkk(Context context) {
        DisplayManager displayManager;
        fki fkiVar;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            fkiVar = null;
        } else {
            fkiVar = new fki(this, displayManager);
        }
        this.b = fkiVar;
        this.c = fkiVar != null ? fkj.a : null;
        this.i = -9223372036854775807L;
        this.j = -9223372036854775807L;
        this.f = -1.0f;
        this.g = 1.0f;
        this.h = 0;
    }

    public final void a() {
        Surface surface;
        if (eul.a >= 30 && (surface = this.e) != null && this.h != Integer.MIN_VALUE && this.q != brg.a) {
            this.q = brg.a;
            eed.h(surface, brg.a);
        }
    }

    public final void b() {
        this.k = 0L;
        this.n = -1L;
        this.l = -1L;
    }

    public final void c(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.i = refreshRate;
            this.j = (refreshRate * 80) / 100;
        } else {
            eub.f("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.i = -9223372036854775807L;
            this.j = -9223372036854775807L;
        }
    }

    public final void d() {
        float f;
        long j;
        if (eul.a >= 30 && this.e != null) {
            if (this.a.a()) {
                if (this.a.a()) {
                    f = (float) (1.0E9d / r0.a.b());
                } else {
                    f = -1.0f;
                }
            } else {
                f = this.f;
            }
            float f2 = this.p;
            if (f != f2) {
                if (f != -1.0f && f2 != -1.0f) {
                    float f3 = 1.0f;
                    if (this.a.a()) {
                        fjt fjtVar = this.a;
                        if (fjtVar.a()) {
                            j = fjtVar.a.b;
                        } else {
                            j = -9223372036854775807L;
                        }
                        if (j >= 5000000000L) {
                            f3 = 0.02f;
                        }
                    }
                    if (Math.abs(f - this.p) < f3) {
                        return;
                    }
                } else if (f == -1.0f && this.a.e < 30) {
                    return;
                }
                this.p = f;
                e(false);
            }
        }
    }

    public final void e(boolean z) {
        Surface surface;
        if (eul.a >= 30 && (surface = this.e) != null && this.h != Integer.MIN_VALUE) {
            boolean z2 = this.d;
            float f = brg.a;
            if (z2) {
                float f2 = this.p;
                if (f2 != -1.0f) {
                    f = this.g * f2;
                }
            }
            if (z || this.q != f) {
                this.q = f;
                eed.h(surface, f);
            }
        }
    }
}
