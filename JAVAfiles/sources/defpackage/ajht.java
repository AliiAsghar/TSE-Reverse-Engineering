package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajht extends ehg {
    public static final Parcelable.Creator<ajht> CREATOR = new ajed(3);
    public boolean a;

    public ajht(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt() == 1;
    }

    @Override // defpackage.ehg, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a ? 1 : 0);
    }

    public ajht(Parcelable parcelable) {
        super(parcelable);
    }
}
