package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahzd extends aiab {
    public static final Parcelable.Creator<ahzd> CREATOR = new ahig(7);

    public ahzd(aiae aiaeVar, Double d, Integer num, Integer num2, Integer num3, Instant instant) {
        super(aiaeVar, d, num, num2, num3, instant);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeDouble(this.b.doubleValue());
        parcel.writeInt(this.c.intValue());
        if (this.d == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(this.d.intValue());
        }
        if (this.e == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(this.e.intValue());
        }
        if (this.f == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(this.f);
        }
    }
}
