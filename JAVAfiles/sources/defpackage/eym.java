package defpackage;

import android.content.Context;
import android.graphics.Matrix;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eym implements eyc {
    private final int a;
    private final int b;
    private float c;
    private float d;
    private float e;
    private Matrix f;

    public eym(int i, int i2) {
        d.t(true, "width and aspect ratio should not both be set");
        this.a = i;
        this.b = i2;
        this.c = -1.0f;
        this.d = -1.0f;
        this.e = -1.0f;
        this.f = new Matrix();
    }

    @Override // defpackage.exs
    public final eug b(int i, int i2) {
        boolean z;
        int i3;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "inputWidth must be positive");
        if (i2 <= 0) {
            z2 = false;
        }
        d.t(z2, "inputHeight must be positive");
        Matrix matrix = new Matrix();
        this.f = matrix;
        float f = i;
        this.d = f;
        float f2 = i2;
        this.e = f2;
        int i4 = this.a;
        if (i4 != -1 && (i3 = this.b) != -1) {
            this.c = i4 / i3;
        }
        float f3 = this.c;
        if (f3 != -1.0f) {
            float f4 = f / f2;
            if (f3 > f4) {
                matrix.setScale(f4 / f3, 1.0f);
                f2 = this.e;
                f = this.c * f2;
                this.d = f;
            } else {
                matrix.setScale(1.0f, f3 / f4);
                f = this.d;
                f2 = f / this.c;
                this.e = f2;
            }
        }
        int i5 = this.b;
        if (i5 != -1) {
            int i6 = this.a;
            float f5 = i5;
            if (i6 != -1) {
                this.d = i6;
            } else {
                this.d = (f * f5) / f2;
            }
            this.e = f5;
        }
        return new eug(Math.round(this.d), Math.round(this.e));
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
        b(i, i2);
        Matrix matrix = this.f;
        dzg.h(matrix);
        if (matrix.isIdentity() && i == Math.round(this.d) && i2 == Math.round(this.e)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.eyc
    public final Matrix f() {
        Matrix matrix = this.f;
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
