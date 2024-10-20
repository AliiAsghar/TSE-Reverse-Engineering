package com.google.android.gms.people.cpg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfp;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CpgDocument extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CpgDocument> CREATOR = new acfp(17);
    public final int a;
    public final GroupContactOrder b;
    public final ActionPreference c;

    public CpgDocument(int i, GroupContactOrder groupContactOrder, ActionPreference actionPreference) {
        this.a = i;
        this.b = groupContactOrder;
        this.c = actionPreference;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CpgDocument cpgDocument = (CpgDocument) obj;
            if (this.a == cpgDocument.a && d.B(this.b, cpgDocument.b) && d.B(this.c, cpgDocument.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, i2);
        abhi.o(parcel, 2, this.b, i, false);
        abhi.o(parcel, 3, this.c, i, false);
        abhi.g(parcel, e);
    }
}
