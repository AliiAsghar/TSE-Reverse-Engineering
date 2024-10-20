package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ee implements Parcelable {
    public static final Parcelable.Creator<ee> CREATOR = new bf(9);
    final ResultReceiver a;

    public ee(Parcel parcel) {
        this.a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
    }
}
