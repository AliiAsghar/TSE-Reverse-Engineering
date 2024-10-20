package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erk implements Parcelable {
    public static final Parcelable.Creator<erk> CREATOR = new eri(0);
    public final erj[] a;
    public final long b;

    public erk(long j, erj... erjVarArr) {
        this.b = j;
        this.a = erjVarArr;
    }

    public final int a() {
        return this.a.length;
    }

    public final erj b(int i) {
        return this.a[i];
    }

    public final erk c(erj... erjVarArr) {
        int length = erjVarArr.length;
        if (length == 0) {
            return this;
        }
        long j = this.b;
        erj[] erjVarArr2 = this.a;
        int i = eul.a;
        int length2 = erjVarArr2.length;
        Object[] copyOf = Arrays.copyOf(erjVarArr2, length2 + length);
        System.arraycopy(erjVarArr, 0, copyOf, length2, length);
        return new erk(j, (erj[]) copyOf);
    }

    public final erk d(erk erkVar) {
        if (erkVar == null) {
            return this;
        }
        return c(erkVar.a);
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
            erk erkVar = (erk) obj;
            if (Arrays.equals(this.a, erkVar.a) && this.b == erkVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + a.A(this.b);
    }

    public final String toString() {
        String ck;
        long j = this.b;
        String arrays = Arrays.toString(this.a);
        if (j == -9223372036854775807L) {
            ck = "";
        } else {
            ck = a.ck(j, ", presentationTimeUs=");
        }
        return "entries=" + arrays + ck;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.length);
        for (erj erjVar : this.a) {
            parcel.writeParcelable(erjVar, 0);
        }
        parcel.writeLong(this.b);
    }

    public erk(Parcel parcel) {
        this.a = new erj[parcel.readInt()];
        int i = 0;
        while (true) {
            erj[] erjVarArr = this.a;
            if (i < erjVarArr.length) {
                erjVarArr[i] = (erj) parcel.readParcelable(erj.class.getClassLoader());
                i++;
            } else {
                this.b = parcel.readLong();
                return;
            }
        }
    }

    public erk(List list) {
        this((erj[]) list.toArray(new erj[0]));
    }

    public erk(erj... erjVarArr) {
        this(-9223372036854775807L, erjVarArr);
    }
}
