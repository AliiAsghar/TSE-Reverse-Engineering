package defpackage;

import com.android.ex.photo.views.PhotoView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class him implements Runnable {
    public boolean a;
    private final PhotoView b;
    private float c;
    private float d;
    private float e;
    private float f;
    private long g = -1;
    private boolean h;

    public him(PhotoView photoView) {
        this.b = photoView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        float f2;
        float f3;
        if (!this.h) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.g;
            if (j != -1) {
                f = ((float) (currentTimeMillis - j)) / 1000.0f;
            } else {
                f = 0.0f;
            }
            int b = this.b.b(this.c * f, this.d * f);
            this.g = currentTimeMillis;
            float f4 = this.e * f;
            if (Math.abs(this.c) > Math.abs(f4)) {
                this.c -= f4;
            } else {
                this.c = brg.a;
            }
            float f5 = this.f * f;
            if (Math.abs(this.d) > Math.abs(f5)) {
                f3 = this.d - f5;
                this.d = f3;
                f2 = f3;
            } else {
                this.d = brg.a;
                f2 = 0.0f;
                f3 = 0.0f;
            }
            float f6 = this.c;
            if ((f6 == brg.a && f3 == brg.a) || b == 0) {
                this.a = false;
                this.h = true;
                this.b.d();
            } else {
                float f7 = 20000.0f;
                if (b == 1) {
                    if (f6 <= brg.a) {
                        f7 = -20000.0f;
                    }
                    this.e = f7;
                    this.f = brg.a;
                    this.d = brg.a;
                } else if (b == 2) {
                    this.e = brg.a;
                    if (f2 <= brg.a) {
                        f7 = -20000.0f;
                    }
                    this.f = f7;
                    this.c = brg.a;
                }
            }
            if (!this.h) {
                this.b.post(this);
            }
        }
    }
}
