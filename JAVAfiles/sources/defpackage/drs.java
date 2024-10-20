package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class drs implements drq {
    private final float[] a;
    private final float[] b;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public static final float a(float f, float[] fArr, float[] fArr2) {
            float f2;
            float f3;
            float f4;
            float a;
            float abs = Math.abs(f);
            float signum = Math.signum(f);
            int binarySearch = Arrays.binarySearch(fArr, abs);
            if (binarySearch >= 0) {
                a = fArr2[binarySearch];
            } else {
                int i = -(binarySearch + 1);
                int i2 = i - 1;
                int length = fArr.length - 1;
                float f5 = brg.a;
                if (i2 >= length) {
                    float f6 = fArr[length];
                    float f7 = fArr2[length];
                    if (f6 == brg.a) {
                        return brg.a;
                    }
                    return f * (f7 / f6);
                }
                if (i2 == -1) {
                    f2 = fArr[0];
                    f3 = fArr2[0];
                    f4 = 0.0f;
                } else {
                    float f8 = fArr[i2];
                    f2 = fArr[i];
                    f5 = fArr2[i2];
                    f3 = fArr2[i];
                    f4 = f8;
                }
                a = drt.a(f5, f3, f4, f2, abs);
            }
            return signum * a;
        }
    }

    public drs(float[] fArr, float[] fArr2) {
        if (fArr.length == fArr2.length) {
            this.a = fArr;
            this.b = fArr2;
            return;
        }
        throw new IllegalArgumentException("Array lengths must match and be nonzero");
    }

    @Override // defpackage.drq
    public final float a(float f) {
        return a.a(f, this.b, this.a);
    }

    @Override // defpackage.drq
    public final float b(float f) {
        return a.a(f, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof drs)) {
            return false;
        }
        drs drsVar = (drs) obj;
        if (Arrays.equals(this.a, drsVar.a) && Arrays.equals(this.b, drsVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.a);
        arrays.getClass();
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.b);
        arrays2.getClass();
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
