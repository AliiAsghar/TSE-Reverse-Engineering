package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahyy extends ahyt {
    public static final Parcelable.Creator<ahyy> CREATOR = new ahig(2);

    public ahyy(aiav aiavVar, aiav aiavVar2, aiav aiavVar3, aiav aiavVar4) {
        super(aiavVar, aiavVar2, aiavVar3, aiavVar4);
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
        parcel.writeParcelable(this.d, i);
    }
}
