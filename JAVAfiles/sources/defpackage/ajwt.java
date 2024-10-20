package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajwt implements Parcelable {
    public static final Parcelable.Creator<ajwt> CREATOR = new ajuw(3);
    public final int a;

    public ajwt() {
        throw null;
    }

    public static ajwt a(int i) {
        boolean z;
        if (i >= -1) {
            z = true;
        } else {
            z = false;
        }
        albo.U(z, "Invalid AccountId");
        return new ajwt(i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ajwt) && this.a == ((ajwt) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        return "AccountId{id=" + this.a + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }

    public ajwt(int i) {
        this.a = i;
    }
}
