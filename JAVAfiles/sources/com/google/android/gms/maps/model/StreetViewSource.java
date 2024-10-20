package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfd;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class StreetViewSource extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewSource> CREATOR = new acfd(3);
    public static final StreetViewSource a = new StreetViewSource(0);
    public final int b;

    public StreetViewSource(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof StreetViewSource) && this.b == ((StreetViewSource) obj).b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b)});
    }

    public final String toString() {
        String str;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                str = String.format("UNKNOWN(%s)", Integer.valueOf(i));
            } else {
                str = "OUTDOOR";
            }
        } else {
            str = "DEFAULT";
        }
        return String.format("StreetViewSource:%s", str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.b;
        int e = abhi.e(parcel);
        abhi.m(parcel, 2, i2);
        abhi.g(parcel, e);
    }
}
