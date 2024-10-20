package com.google.android.gms.spatula.settings;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.achm;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SpatulaAvailability extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SpatulaAvailability> CREATOR = new achm(11);
    public int a;

    public SpatulaAvailability() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SpatulaAvailability) {
            return d.B(Integer.valueOf(this.a), Integer.valueOf(((SpatulaAvailability) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.g(parcel, e);
    }

    public SpatulaAvailability(int i) {
        this.a = i;
    }
}
