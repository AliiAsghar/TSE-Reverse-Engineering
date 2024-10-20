package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.ackp;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CapabilityInfoParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CapabilityInfoParcelable> CREATOR = new ackp(3);
    public final String a;
    public final List b;

    public CapabilityInfoParcelable(String str, List list) {
        this.a = str;
        this.b = list;
        abhg.m(str);
        abhg.m(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CapabilityInfoParcelable capabilityInfoParcelable = (CapabilityInfoParcelable) obj;
        String str = this.a;
        if (str == null ? capabilityInfoParcelable.a != null : !str.equals(capabilityInfoParcelable.a)) {
            return false;
        }
        List list = this.b;
        if (list == null ? capabilityInfoParcelable.b == null : list.equals(capabilityInfoParcelable.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        List list = this.b;
        if (list != null) {
            i2 = list.hashCode();
        }
        return ((i + 31) * 31) + i2;
    }

    public final String toString() {
        return "CapabilityInfo{" + this.a + ", " + String.valueOf(this.b) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 2, str, false);
        abhi.r(parcel, 3, this.b, false);
        abhi.g(parcel, e);
    }
}
