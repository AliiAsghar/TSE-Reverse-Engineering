package defpackage;

import android.graphics.Matrix;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aavu {
    public int a;
    public int b;
    public boolean c;
    public final Handler d;
    public final aavs e;
    private final Matrix f = new Matrix();

    public aavu(aavs aavsVar, Looper looper) {
        this.d = new aavt(this, looper);
        this.e = aavsVar;
    }

    public final void a() {
        float f;
        if (this.a != 0 && this.b != 0) {
            Matrix matrix = new Matrix();
            boolean z = this.c;
            int i = this.a;
            int i2 = this.b;
            if (true != z) {
                f = 1.0f;
            } else {
                f = -1.0f;
            }
            matrix.setScale(f, 1.0f);
            matrix.postRotate(brg.a);
            float f2 = i;
            float f3 = i2;
            matrix.postScale(f2 / 2000.0f, f3 / 2000.0f);
            matrix.postTranslate(f2 / 2.0f, f3 / 2.0f);
            matrix.invert(this.f);
        }
    }
}
