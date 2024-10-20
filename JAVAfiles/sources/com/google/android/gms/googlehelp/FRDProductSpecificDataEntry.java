package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abzo;
import defpackage.d;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FRDProductSpecificDataEntry extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FRDProductSpecificDataEntry> CREATOR = new abzo(10);
    final int a;
    final int b;
    final List c;
    final List d;
    final List e;
    final List f;
    final byte[][] g;
    final Boolean h;

    public FRDProductSpecificDataEntry(int i, int i2, List list, List list2, List list3, List list4, byte[][] bArr, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = bArr;
        this.h = Boolean.valueOf(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FRDProductSpecificDataEntry)) {
            return false;
        }
        FRDProductSpecificDataEntry fRDProductSpecificDataEntry = (FRDProductSpecificDataEntry) obj;
        if (this.a == fRDProductSpecificDataEntry.a && this.b == fRDProductSpecificDataEntry.b && d.B(this.c, fRDProductSpecificDataEntry.c) && d.B(this.d, fRDProductSpecificDataEntry.d) && d.B(this.e, fRDProductSpecificDataEntry.e) && d.B(this.f, fRDProductSpecificDataEntry.f) && Arrays.equals(this.g, fRDProductSpecificDataEntry.g) && d.B(this.h, fRDProductSpecificDataEntry.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d, this.e, this.f, Integer.valueOf(Arrays.deepHashCode(this.g)), this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 2, this.a);
        abhi.m(parcel, 3, this.b);
        abhi.G(parcel, 4, this.c);
        abhi.C(parcel, 5, this.d);
        abhi.G(parcel, 6, this.e);
        abhi.C(parcel, 7, this.f);
        abhi.u(parcel, 8, this.g);
        abhi.s(parcel, 9, this.h);
        abhi.g(parcel, e);
    }
}
