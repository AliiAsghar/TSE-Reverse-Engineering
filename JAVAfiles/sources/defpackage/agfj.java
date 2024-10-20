package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agfj implements agfm {
    public static final Parcelable.Creator<agfj> CREATOR = new aftg(14);
    public final View a;

    public agfj() {
        this((byte[]) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof agfj) && d.F(this.a, ((agfj) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        View view = this.a;
        if (view == null) {
            return 0;
        }
        return view.hashCode();
    }

    public final String toString() {
        return "Keyboard(target=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
    }

    public agfj(View view) {
        this.a = view;
    }

    public /* synthetic */ agfj(byte[] bArr) {
        this((View) null);
    }
}
