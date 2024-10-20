package defpackage;

import android.graphics.Matrix;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajdc {
    public float a;
    public float b;
    public float c;

    public ajdc(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        this.a = fArr[2];
        this.b = fArr[5];
        this.c = fArr[0];
    }

    private static final boolean a(float f, float f2) {
        if (Math.abs(f - f2) < 0.001f) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ajdc)) {
            return false;
        }
        ajdc ajdcVar = (ajdc) obj;
        if (!a(this.a, ajdcVar.a) || !a(this.b, ajdcVar.b) || !a(this.c, ajdcVar.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c));
    }
}
