package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pb extends ehg {
    public static final Parcelable.Creator<pb> CREATOR = new og(2);
    public boolean a;

    public pb(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.a + "}";
    }

    @Override // defpackage.ehg, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.a));
    }

    public pb(Parcelable parcelable) {
        super(parcelable);
    }
}
