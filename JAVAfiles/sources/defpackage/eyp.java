package defpackage;

import android.content.Context;
import android.graphics.Matrix;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyp implements eyc {
    public final float a = 1.0f;
    public final float b = 1.0f;
    public final float c;
    private final Matrix d;
    private Matrix e;

    public eyp(float f) {
        this.c = f;
        Matrix matrix = new Matrix();
        this.d = matrix;
        matrix.postScale(1.0f, 1.0f);
        matrix.postRotate(f);
    }

    @Override // defpackage.exs
    public final eug b(int i, int i2) {
        boolean z;
        boolean z2;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "inputWidth must be positive");
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        d.t(z2, "inputHeight must be positive");
        this.e = new Matrix(this.d);
        if (this.d.isIdentity()) {
            return new eug(i, i2);
        }
        float f = i;
        float f2 = i2;
        float f3 = f / f2;
        this.e.preScale(f3, 1.0f);
        this.e.postScale(1.0f / f3, 1.0f);
        float[][] fArr = {new float[]{-1.0f, -1.0f, brg.a, 1.0f}, new float[]{-1.0f, 1.0f, brg.a, 1.0f}, new float[]{1.0f, -1.0f, brg.a, 1.0f}, new float[]{1.0f, 1.0f, brg.a, 1.0f}};
        float f4 = Float.MIN_VALUE;
        float f5 = Float.MAX_VALUE;
        float f6 = Float.MAX_VALUE;
        float f7 = Float.MIN_VALUE;
        for (int i3 = 0; i3 < 4; i3++) {
            float[] fArr2 = fArr[i3];
            this.e.mapPoints(fArr2);
            f5 = Math.min(f5, fArr2[0]);
            f4 = Math.max(f4, fArr2[0]);
            f6 = Math.min(f6, fArr2[1]);
            f7 = Math.max(f7, fArr2[1]);
        }
        float f8 = (f4 - f5) / 2.0f;
        float f9 = (f7 - f6) / 2.0f;
        this.e.postScale(1.0f / f8, 1.0f / f9);
        return new eug(Math.round(f * f8), Math.round(f2 * f9));
    }

    @Override // defpackage.exs
    public final /* synthetic */ ews c(Context context, boolean z) {
        return dzm.d(this, context, z);
    }

    @Override // defpackage.exr
    public final /* bridge */ /* synthetic */ exw d(Context context, boolean z) {
        exw c;
        c = c(context, z);
        return c;
    }

    @Override // defpackage.exr
    public final boolean e(int i, int i2) {
        eug b = b(i, i2);
        Matrix matrix = this.e;
        dzg.h(matrix);
        if (matrix.isIdentity() && i == b.b && i2 == b.c) {
            return true;
        }
        return false;
    }

    @Override // defpackage.eyc
    public final Matrix f() {
        Matrix matrix = this.e;
        dzg.i(matrix, "configure must be called first");
        return matrix;
    }

    @Override // defpackage.exs
    public final /* synthetic */ float[] g() {
        return dzn.k(this);
    }

    @Override // defpackage.eqk
    public final /* synthetic */ void a() {
    }
}
