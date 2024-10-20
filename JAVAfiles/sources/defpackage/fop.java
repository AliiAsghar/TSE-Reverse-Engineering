package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fop extends fom {
    public static final Parcelable.Creator<fop> CREATOR = new eri(18);
    public final int a;
    public final int b;
    public final int c;
    public final int[] d;
    public final int[] e;

    public fop(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = iArr;
        this.e = iArr2;
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
            fop fopVar = (fop) obj;
            if (this.a == fopVar.a && this.b == fopVar.b && this.c == fopVar.c && Arrays.equals(this.d, fopVar.d) && Arrays.equals(this.e, fopVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a + 527) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeIntArray(this.e);
    }

    public fop(Parcel parcel) {
        super("MLLT");
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i = eul.a;
        this.d = createIntArray;
        this.e = parcel.createIntArray();
    }
}
