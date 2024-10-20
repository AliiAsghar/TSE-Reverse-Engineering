package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bys extends cag implements Parcelable {
    public static final Parcelable.Creator<bys> CREATOR = new Parcelable.Creator<bys>() { // from class: bys.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ bys createFromParcel(Parcel parcel) {
            return new bys(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ bys[] newArray(int i) {
            return new bys[i];
        }
    };

    public bys(int i) {
        super(i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(b());
    }
}
