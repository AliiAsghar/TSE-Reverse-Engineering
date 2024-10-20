package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fog extends fom {
    public static final Parcelable.Creator<fog> CREATOR = new eri(12);
    public final byte[] a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public fog(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = defpackage.eul.a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fog.<init>(android.os.Parcel):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fog fogVar = (fog) obj;
            if (this.f.equals(fogVar.f) && Arrays.equals(this.a, fogVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f.hashCode() + 527) * 31) + Arrays.hashCode(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f);
        parcel.writeByteArray(this.a);
    }

    public fog(String str, byte[] bArr) {
        super(str);
        this.a = bArr;
    }
}
