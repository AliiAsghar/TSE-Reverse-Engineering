package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acbp;
import defpackage.brg;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DeviceOrientation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceOrientation> CREATOR = new acbp(15);
    public final float a;
    public final float b;
    public final long c;
    public final byte d;
    public final float e;
    public final float f;
    private final float[] g;

    public DeviceOrientation(float[] fArr, float f, float f2, long j, byte b, float f3, float f4) {
        boolean z;
        boolean z2;
        if (fArr != null && fArr.length == 4) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "Input attitude array should be of length 4.");
        if (!Float.isNaN(fArr[0]) && !Float.isNaN(fArr[1]) && !Float.isNaN(fArr[2]) && !Float.isNaN(fArr[3])) {
            z2 = true;
        } else {
            z2 = false;
        }
        d.t(z2, "Input attitude cannot contain NaNs.");
        d.s(j >= 0);
        this.g = fArr;
        float f5 = f % 360.0f;
        this.a = f5 < brg.a ? f5 + 360.0f : f5;
        this.b = c(f2);
        this.e = f3;
        this.f = c(f4);
        this.c = j;
        this.d = (byte) (((byte) (((byte) (b | 16)) | 4)) | 8);
    }

    private static float c(float f) {
        return Math.max(brg.a, Math.min(f, 180.0f));
    }

    public final boolean a() {
        if ((this.d & 64) != 0) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if ((this.d & 32) != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceOrientation)) {
            return false;
        }
        DeviceOrientation deviceOrientation = (DeviceOrientation) obj;
        if (b() == deviceOrientation.b() && (!b() || Float.compare(this.e, deviceOrientation.e) == 0)) {
            z = true;
        } else {
            z = false;
        }
        if (a() == deviceOrientation.a() && (!a() || Float.compare(this.f, deviceOrientation.f) == 0)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (Float.compare(this.a, deviceOrientation.a) == 0 && Float.compare(this.b, deviceOrientation.b) == 0 && z && z2 && this.c == deviceOrientation.c && Arrays.equals(this.g, deviceOrientation.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.f), Long.valueOf(this.c), this.g, Byte.valueOf(this.d)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceOrientation[attitude=");
        sb.append(Arrays.toString(this.g));
        sb.append(", headingDegrees=");
        sb.append(this.a);
        sb.append(", headingErrorDegrees=");
        sb.append(this.b);
        if (a()) {
            sb.append(", conservativeHeadingErrorDegrees=");
            sb.append(this.f);
        }
        sb.append(", elapsedRealtimeNs=");
        sb.append(this.c);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        float[] fArr = this.g;
        int e = abhi.e(parcel);
        float[] fArr2 = (float[]) fArr.clone();
        if (fArr2 != null) {
            int f = abhi.f(parcel, 1);
            parcel.writeFloatArray(fArr2);
            abhi.g(parcel, f);
        }
        abhi.l(parcel, 4, this.a);
        abhi.l(parcel, 5, this.b);
        abhi.n(parcel, 6, this.c);
        abhi.i(parcel, 7, this.d);
        abhi.l(parcel, 8, this.e);
        abhi.l(parcel, 9, this.f);
        abhi.g(parcel, e);
    }
}
