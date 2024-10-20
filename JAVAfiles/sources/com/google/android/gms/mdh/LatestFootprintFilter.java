package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfd;
import defpackage.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LatestFootprintFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LatestFootprintFilter> CREATOR;
    private static final byte[] b;
    public final List a;

    static {
        byte[] bArr = new byte[0];
        b = bArr;
        new ArrayList().add(new SecondaryIdMatcher((byte[]) bArr.clone(), 2));
        new ArrayList();
        CREATOR = new acfd(15);
    }

    public LatestFootprintFilter(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return d.B(this.a, ((LatestFootprintFilter) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int e = abhi.e(parcel);
        abhi.r(parcel, 1, list, false);
        abhi.g(parcel, e);
    }
}
