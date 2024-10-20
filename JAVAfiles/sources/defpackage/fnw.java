package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnw implements erj {
    public static final Parcelable.Creator<fnw> CREATOR = new eri(5);
    public final int a;
    public final String b;

    public fnw(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.erj
    public final /* synthetic */ eqn a() {
        return null;
    }

    @Override // defpackage.erj
    public final /* synthetic */ byte[] c() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Ait(controlCode=" + this.a + ",url=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.a);
    }

    @Override // defpackage.erj
    public final /* synthetic */ void b(erg ergVar) {
    }
}
