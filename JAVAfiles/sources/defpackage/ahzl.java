package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahzl extends aiao {
    public static final Parcelable.Creator<ahzl> CREATOR = new ahig(15);

    public ahzl(aian aianVar, List list, List list2, List list3) {
        super(aianVar, list, list2, list3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeList(this.b);
        parcel.writeList(this.c);
        parcel.writeList(this.d);
    }
}
