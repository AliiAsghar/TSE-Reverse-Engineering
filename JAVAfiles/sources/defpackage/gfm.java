package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfm extends gez {
    public static final Parcelable.Creator<gfm> CREATOR = new fot(16);
    public final int a;

    public gfm(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }

    public gfm(Parcelable parcelable, int i) {
        super(parcelable);
        this.a = i;
    }
}
