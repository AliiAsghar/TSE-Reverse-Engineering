package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class foi extends fom {
    public static final Parcelable.Creator<foi> CREATOR = new eri(14);
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String[] d;
    private final fom[] e;

    public foi(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = eul.a;
        this.a = readString;
        this.b = parcel.readByte() != 0;
        this.c = parcel.readByte() != 0;
        this.d = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.e = new fom[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.e[i2] = (fom) parcel.readParcelable(fom.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            foi foiVar = (foi) obj;
            if (this.b == foiVar.b && this.c == foiVar.c && Objects.equals(this.a, foiVar.a) && Arrays.equals(this.d, foiVar.d) && Arrays.equals(this.e, foiVar.e)) {
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
        return (((((this.b ? 1 : 0) + 527) * 31) + (this.c ? 1 : 0)) * 31) + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.d);
        parcel.writeInt(this.e.length);
        for (fom fomVar : this.e) {
            parcel.writeParcelable(fomVar, 0);
        }
    }

    public foi(String str, boolean z, boolean z2, String[] strArr, fom[] fomVarArr) {
        super("CTOC");
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = strArr;
        this.e = fomVarArr;
    }
}
