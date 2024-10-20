package defpackage;

import android.view.Choreographer;
import android.view.Display;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqw implements Runnable, Choreographer.FrameCallback, atk, bzt {
    public static long a;
    private final View b;
    private boolean d;
    private boolean f;
    private long g;
    private final cbh c = new cbh(new ati[16]);
    private final Choreographer e = Choreographer.getInstance();

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a implements atj {
        private final long a;

        public a(long j) {
            this.a = j;
        }

        @Override // defpackage.atj
        public final long a() {
            return Math.max(0L, this.a - System.nanoTime());
        }
    }

    public aqw(View view) {
        this.b = view;
        if (a == 0) {
            Display display = view.getDisplay();
            float f = 60.0f;
            if (!view.isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            a = 1.0E9f / f;
        }
    }

    @Override // defpackage.atk
    public final void a(ati atiVar) {
        this.c.n(atiVar);
        if (!this.d) {
            this.d = true;
            this.b.post(this);
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f) {
            this.g = j;
            this.b.post(this);
        }
    }

    @Override // defpackage.bzt
    public final void h() {
        this.f = false;
        this.b.removeCallbacks(this);
        this.e.removeFrameCallback(this);
    }

    @Override // defpackage.bzt
    public final void i() {
        this.f = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c.b != 0 && this.d && this.f && this.b.getWindowVisibility() == 0) {
            a aVar = new a(this.g + a);
            boolean z = false;
            while (true) {
                if (this.c.b != 0) {
                    if (z) {
                        break;
                    }
                    if (aVar.a() > 0 && !((ati) this.c.a[0]).c(aVar)) {
                        this.c.c(0);
                    } else {
                        z = true;
                    }
                } else if (!z) {
                    this.d = false;
                    return;
                }
            }
            this.e.postFrameCallback(this);
            return;
        }
        this.d = false;
    }

    @Override // defpackage.bzt
    public final void g() {
    }
}
