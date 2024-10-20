package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ed implements Parcelable {
    public static final Parcelable.Creator<ed> CREATOR = new bf(8);
    private final dy a;
    private final long b;

    public ed(Parcel parcel) {
        this.a = dy.CREATOR.createFromParcel(parcel);
        this.b = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaSession.QueueItem {Description=" + this.a + ", Id=" + this.b + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeLong(this.b);
    }
}
