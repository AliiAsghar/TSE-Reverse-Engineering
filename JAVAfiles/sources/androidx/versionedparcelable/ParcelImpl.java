package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.gna;
import defpackage.gnb;
import defpackage.gnc;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new gna();
    private final gnc a;

    public ParcelImpl(Parcel parcel) {
        this.a = new gnb(parcel).c();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new gnb(parcel).k(this.a);
    }
}
