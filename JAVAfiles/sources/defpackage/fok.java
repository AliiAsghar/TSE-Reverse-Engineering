package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fok extends fom {
    public static final Parcelable.Creator<fok> CREATOR = new eri(16);
    public final String a;
    public final String b;
    public final String c;
    public final byte[] d;

    public fok(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = eul.a;
        this.a = readString;
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fok fokVar = (fok) obj;
            if (Objects.equals(this.a, fokVar.a) && Objects.equals(this.b, fokVar.b) && Objects.equals(this.c, fokVar.c) && Arrays.equals(this.d, fokVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.a;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = i + 527;
        String str3 = this.c;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return (((((i4 * 31) + i2) * 31) + i3) * 31) + Arrays.hashCode(this.d);
    }

    @Override // defpackage.fom
    public final String toString() {
        return this.f + ": mimeType=" + this.a + ", filename=" + this.b + ", description=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeByteArray(this.d);
    }

    public fok(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bArr;
    }
}
