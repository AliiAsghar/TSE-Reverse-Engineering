package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acgc;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FlagOverrides extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FlagOverrides> CREATOR = new acgc(3);
    public final List a;

    public FlagOverrides(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlagOverrides)) {
            return false;
        }
        return this.a.equals(((FlagOverrides) obj).a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlagOverrides(");
        boolean z = true;
        for (FlagOverride flagOverride : this.a) {
            if (!z) {
                sb.append(", ");
            }
            flagOverride.a(sb);
            z = false;
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int e = abhi.e(parcel);
        abhi.r(parcel, 2, list, false);
        abhi.g(parcel, e);
    }
}
