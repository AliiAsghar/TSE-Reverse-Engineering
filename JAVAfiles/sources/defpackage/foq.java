package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class foq extends fom {
    public static final Parcelable.Creator<foq> CREATOR = new eri(19);
    public final String a;
    public final byte[] b;

    public foq(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = eul.a;
        this.a = readString;
        this.b = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            foq foqVar = (foq) obj;
            if (Objects.equals(this.a, foqVar.a) && Arrays.equals(this.b, foqVar.b)) {
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
        return ((i + 527) * 31) + Arrays.hashCode(this.b);
    }

    @Override // defpackage.fom
    public final String toString() {
        return this.f + ": owner=" + this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
    }

    public foq(String str, byte[] bArr) {
        super("PRIV");
        this.a = str;
        this.b = bArr;
    }
}
