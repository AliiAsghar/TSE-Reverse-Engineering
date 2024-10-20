package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqi implements Parcelable {
    public static final Parcelable.Creator<eqi> CREATOR = new eri(1);
    public final UUID a;
    public final String b;
    public final String c;
    public final byte[] d;
    private int e;

    public eqi(Parcel parcel) {
        this.a = new UUID(parcel.readLong(), parcel.readLong());
        this.b = parcel.readString();
        String readString = parcel.readString();
        int i = eul.a;
        this.c = readString;
        this.d = parcel.createByteArray();
    }

    public final boolean a(UUID uuid) {
        if (!eqc.a.equals(this.a) && !uuid.equals(this.a)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eqi)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        eqi eqiVar = (eqi) obj;
        if (!Objects.equals(this.b, eqiVar.b) || !Objects.equals(this.c, eqiVar.c) || !Objects.equals(this.a, eqiVar.a) || !Arrays.equals(this.d, eqiVar.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.e;
        if (i == 0) {
            int hashCode2 = this.a.hashCode() * 31;
            String str = this.b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode3 = ((((hashCode2 + hashCode) * 31) + this.c.hashCode()) * 31) + Arrays.hashCode(this.d);
            this.e = hashCode3;
            return hashCode3;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a.getMostSignificantBits());
        parcel.writeLong(this.a.getLeastSignificantBits());
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeByteArray(this.d);
    }

    public eqi(UUID uuid, String str, String str2, byte[] bArr) {
        dzg.g(uuid);
        this.a = uuid;
        this.b = str;
        dzg.g(str2);
        this.c = erl.e(str2);
        this.d = bArr;
    }

    public eqi(UUID uuid, String str, byte[] bArr) {
        this(uuid, null, str, bArr);
    }
}
