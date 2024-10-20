package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class airf extends View.BaseSavedState {
    public static final Parcelable.Creator<airf> CREATOR = new ahzu(15);
    boolean a;

    public airf(Parcel parcel) {
        super(parcel);
        this.a = parcel.readByte() == 1;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
    }

    public airf(Parcelable parcelable) {
        super(parcelable);
    }
}
