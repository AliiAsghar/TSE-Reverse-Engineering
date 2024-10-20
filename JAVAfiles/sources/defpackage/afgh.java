package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afgh implements afgj {
    public static final Parcelable.Creator<afgh> CREATOR = new adsv(20);
    public final boolean a;
    public final Integer b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;

    public afgh(int i, int i2, int i3, boolean z, Integer num, String str) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.a = z;
        this.b = num;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afgh)) {
            return false;
        }
        afgh afghVar = (afgh) obj;
        if (this.d == afghVar.d && this.e == afghVar.e && this.f == afghVar.f && this.a == afghVar.a && d.F(this.b, afghVar.b) && d.F(this.c, afghVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.d;
        a.bm(i);
        int i2 = this.e;
        a.bm(i2);
        int i3 = this.f;
        a.bm(i3);
        Integer num = this.b;
        int i4 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i5 = (i * 31) + i2;
        boolean z = this.a;
        int i6 = (i5 * 31) + i3;
        String str = this.c;
        if (str != null) {
            i4 = str.hashCode();
        }
        return (((((i6 * 31) + a.v(z)) * 31) + hashCode) * 31) + i4;
    }

    public final String toString() {
        return "InApp(layout=" + ((Object) aeke.bR(this.d)) + ", facing=" + ((Object) aeke.bS(this.e)) + ", orientation=" + ((Object) aeke.bQ(this.f)) + ", isFlashOn=" + this.a + ", previewViewId=" + this.b + ", effectId=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int intValue;
        parcel.getClass();
        parcel.writeString(aeke.bR(this.d));
        parcel.writeString(aeke.bS(this.e));
        parcel.writeString(aeke.bQ(this.f));
        parcel.writeInt(this.a ? 1 : 0);
        Integer num = this.b;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
        parcel.writeString(this.c);
    }
}
