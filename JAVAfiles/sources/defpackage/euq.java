package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class euq implements erj {
    public static final Parcelable.Creator<euq> CREATOR = new eri(3);
    public final float a;
    public final float b;

    public euq(float f, float f2) {
        boolean z = false;
        if (f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f) {
            z = true;
        }
        d.t(z, "Invalid latitude or longitude");
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.erj
    public final /* synthetic */ eqn a() {
        return null;
    }

    @Override // defpackage.erj
    public final /* synthetic */ byte[] c() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            euq euqVar = (euq) obj;
            if (this.a == euqVar.a && this.b == euqVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((albo.cz(this.a) + 527) * 31) + albo.cz(this.b);
    }

    public final String toString() {
        return "xyz: latitude=" + this.a + ", longitude=" + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
    }

    public euq(Parcel parcel) {
        this.a = parcel.readFloat();
        this.b = parcel.readFloat();
    }

    @Override // defpackage.erj
    public final /* synthetic */ void b(erg ergVar) {
    }
}
