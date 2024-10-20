package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahzz extends aibi {
    public static final Parcelable.Creator<ahzz> CREATOR = new ahzu(5);

    public ahzz(aiaj aiajVar, aiac aiacVar, aiak aiakVar, boolean z) {
        super(aiajVar, aiacVar, aiakVar, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
