package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahzp extends aiau {
    public static final Parcelable.Creator<ahzp> CREATOR = new ahig(19);

    public ahzp(String str, int i, int i2, String str2, String str3, ahyx ahyxVar) {
        super(str, i, i2, str2, str3, ahyxVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        if (this.e == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.e);
        }
        parcel.writeParcelable(this.f, i);
    }
}
