package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahzm extends aiaq {
    public static final Parcelable.Creator<ahzm> CREATOR = new ahig(16);

    public ahzm(aiav aiavVar, aiav aiavVar2, aiav aiavVar3, aiav aiavVar4, aiav aiavVar5, aiav aiavVar6, aiav aiavVar7) {
        super(aiavVar, aiavVar2, aiavVar3, aiavVar4, aiavVar5, aiavVar6, aiavVar7);
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
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeParcelable(this.g, i);
    }
}
