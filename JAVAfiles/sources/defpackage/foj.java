package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class foj extends fom {
    public static final Parcelable.Creator<foj> CREATOR = new eri(15);
    public final String a;
    public final String b;
    public final String c;

    public foj(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i = eul.a;
        this.a = readString;
        this.b = parcel.readString();
        this.c = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            foj fojVar = (foj) obj;
            if (Objects.equals(this.b, fojVar.b) && Objects.equals(this.a, fojVar.a) && Objects.equals(this.c, fojVar.c)) {
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
        return (((i4 * 31) + i2) * 31) + i3;
    }

    @Override // defpackage.fom
    public final String toString() {
        return this.f + ": language=" + this.a + ", description=" + this.b + ", text=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f);
        parcel.writeString(this.a);
        parcel.writeString(this.c);
    }

    public foj(String str, String str2, String str3) {
        super("COMM");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
