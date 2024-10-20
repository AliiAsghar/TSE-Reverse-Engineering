package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajux implements Parcelable {
    public static final Parcelable.Creator<ajux> CREATOR = new ajuw(0);
    private final int a;
    private Bundle b;

    /* JADX INFO: Access modifiers changed from: protected */
    public ajux(Parcel parcel) {
        int readInt = parcel.readInt();
        this.b = new Bundle();
        this.a = readInt;
        this.b = parcel.readBundle(Bundle.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeBundle(this.b);
    }
}
