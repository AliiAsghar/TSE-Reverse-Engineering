package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oh extends ehg {
    public static final Parcelable.Creator<oh> CREATOR = new og(0);
    public Parcelable a;

    public oh(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readParcelable(classLoader == null ? nw.class.getClassLoader() : classLoader);
    }

    @Override // defpackage.ehg, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, 0);
    }

    public oh(Parcelable parcelable) {
        super(parcelable);
    }
}
