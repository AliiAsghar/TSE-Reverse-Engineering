package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fof extends fom {
    public static final Parcelable.Creator<fof> CREATOR = new eri(11);
    public final String a;
    public final String b;
    public final int c;
    public final byte[] d;

    public fof(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = eul.a;
        this.a = readString;
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.createByteArray();
    }

    @Override // defpackage.fom, defpackage.erj
    public final void b(erg ergVar) {
        ergVar.a(this.d, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fof fofVar = (fof) obj;
            if (this.c == fofVar.c && Objects.equals(this.a, fofVar.a) && Objects.equals(this.b, fofVar.b) && Arrays.equals(this.d, fofVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = this.c;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((((((i3 + 527) * 31) + i) * 31) + i2) * 31) + Arrays.hashCode(this.d);
    }

    @Override // defpackage.fom
    public final String toString() {
        return this.f + ": mimeType=" + this.a + ", description=" + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeByteArray(this.d);
    }

    public fof(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = bArr;
    }
}
