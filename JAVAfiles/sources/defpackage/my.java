package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class my implements Parcelable {
    public static final Parcelable.Creator<my> CREATOR = new bf(14);
    public int a;
    public int b;
    public boolean c;

    public my() {
    }

    public final void a() {
        this.a = -1;
    }

    public final boolean b() {
        if (this.a >= 0) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }

    public my(my myVar) {
        this.a = myVar.a;
        this.b = myVar.b;
        this.c = myVar.c;
    }

    public my(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt() == 1;
    }
}
