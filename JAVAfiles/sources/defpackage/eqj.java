package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqj implements Comparator<eqi>, Parcelable {
    public static final Parcelable.Creator<eqj> CREATOR = new bf(20);
    public final String a;
    public final int b;
    private final eqi[] c;
    private int d;

    public eqj(Parcel parcel) {
        this.a = parcel.readString();
        eqi[] eqiVarArr = (eqi[]) parcel.createTypedArray(eqi.CREATOR);
        int i = eul.a;
        this.c = eqiVarArr;
        this.b = eqiVarArr.length;
    }

    public final eqi a(int i) {
        return this.c[i];
    }

    public final eqj b(String str) {
        if (Objects.equals(this.a, str)) {
            return this;
        }
        return new eqj(str, false, this.c);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(eqi eqiVar, eqi eqiVar2) {
        eqi eqiVar3 = eqiVar;
        eqi eqiVar4 = eqiVar2;
        if (eqc.a.equals(eqiVar3.a)) {
            if (!eqc.a.equals(eqiVar4.a)) {
                return 1;
            }
            return 0;
        }
        return eqiVar3.a.compareTo(eqiVar4.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            eqj eqjVar = (eqj) obj;
            if (Objects.equals(this.a, eqjVar.a) && Arrays.equals(this.c, eqjVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.d;
        if (i == 0) {
            String str = this.a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode2 = (hashCode * 31) + Arrays.hashCode(this.c);
            this.d = hashCode2;
            return hashCode2;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeTypedArray(this.c, 0);
    }

    public eqj(String str, boolean z, eqi... eqiVarArr) {
        this.a = str;
        eqiVarArr = z ? (eqi[]) eqiVarArr.clone() : eqiVarArr;
        this.c = eqiVarArr;
        this.b = eqiVarArr.length;
        Arrays.sort(eqiVarArr, this);
    }
}
