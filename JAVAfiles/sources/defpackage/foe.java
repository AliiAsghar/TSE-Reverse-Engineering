package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class foe implements erj {
    public static final Parcelable.Creator<foe> CREATOR = new eri(10);
    public final byte[] a;
    public final String b;
    public final String c;

    public foe(byte[] bArr, String str, String str2) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.erj
    public final /* synthetic */ eqn a() {
        return null;
    }

    @Override // defpackage.erj
    public final void b(erg ergVar) {
        String str = this.b;
        if (str != null) {
            ergVar.a = str;
        }
    }

    @Override // defpackage.erj
    public final /* synthetic */ byte[] c() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Arrays.equals(this.a, ((foe) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.b, this.c, Integer.valueOf(this.a.length));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public foe(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        dzg.g(createByteArray);
        this.a = createByteArray;
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
}
