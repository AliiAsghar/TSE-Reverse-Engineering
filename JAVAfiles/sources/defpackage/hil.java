package defpackage;

import com.android.ex.photo.views.PhotoView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hil implements Runnable {
    public final PhotoView a;
    public float b;
    public float c;
    public long d = -1;
    public boolean e;
    public boolean f;

    public hil(PhotoView photoView) {
        this.a = photoView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        float f2;
        float f3;
        if (!this.f) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.d;
            if (j != -1) {
                f = (float) (currentTimeMillis - j);
            } else {
                f = 0.0f;
            }
            if (j == -1) {
                this.d = currentTimeMillis;
            }
            if (f >= 100.0f) {
                f3 = this.b;
                f2 = this.c;
            } else {
                float f4 = 100.0f - f;
                float f5 = this.b / f4;
                float f6 = this.c / f4;
                float f7 = f5 * 10.0f;
                if (Math.abs(f7) > Math.abs(this.b) || Float.isNaN(f7)) {
                    f7 = this.b;
                }
                float f8 = 10.0f * f6;
                if (Math.abs(f8) > Math.abs(this.c) || Float.isNaN(f8)) {
                    f8 = this.c;
                }
                float f9 = f7;
                f2 = f8;
                f3 = f9;
            }
            this.a.b(f3, f2);
            float f10 = this.b - f3;
            this.b = f10;
            float f11 = this.c - f2;
            this.c = f11;
            if (f10 == brg.a && f11 == brg.a) {
                this.e = false;
                this.f = true;
            }
            if (!this.f) {
                this.a.post(this);
            }
        }
    }
}
