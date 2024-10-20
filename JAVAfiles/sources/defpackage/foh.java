package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class foh extends fom {
    public static final Parcelable.Creator<foh> CREATOR = new eri(13);
    public final String a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    private final fom[] g;

    public foh(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = eul.a;
        this.a = readString;
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readLong();
        this.e = parcel.readLong();
        int readInt = parcel.readInt();
        this.g = new fom[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.g[i2] = (fom) parcel.readParcelable(fom.class.getClassLoader());
        }
    }

    @Override // defpackage.fom, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            foh fohVar = (foh) obj;
            if (this.b == fohVar.b && this.c == fohVar.c && this.d == fohVar.d && this.e == fohVar.e && Objects.equals(this.a, fohVar.a) && Arrays.equals(this.g, fohVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i2 = this.b;
        return ((((((((i2 + 527) * 31) + this.c) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeInt(this.g.length);
        for (fom fomVar : this.g) {
            parcel.writeParcelable(fomVar, 0);
        }
    }

    public foh(String str, int i, int i2, long j, long j2, fom[] fomVarArr) {
        super("CHAP");
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.g = fomVarArr;
    }
}
