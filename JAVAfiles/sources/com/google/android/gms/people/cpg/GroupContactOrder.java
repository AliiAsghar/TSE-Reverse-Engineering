package com.google.android.gms.people.cpg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfp;
import defpackage.d;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GroupContactOrder extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GroupContactOrder> CREATOR = new acfp(19);
    public final String a;
    public final List b;
    public final long c;

    public GroupContactOrder(String str, List list, long j) {
        this.a = str;
        this.b = list;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            GroupContactOrder groupContactOrder = (GroupContactOrder) obj;
            if (d.B(this.a, groupContactOrder.a) && d.B(this.b, groupContactOrder.b) && this.c == groupContactOrder.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.C(parcel, 2, this.b);
        abhi.n(parcel, 3, this.c);
        abhi.g(parcel, e);
    }
}
