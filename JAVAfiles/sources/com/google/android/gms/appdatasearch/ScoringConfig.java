package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abjj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ScoringConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ScoringConfig> CREATOR = new abjj(9);
    public final boolean a;

    public ScoringConfig(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ScoringConfig) && this.a == ((ScoringConfig) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.a) {
            return 1;
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.h(parcel, 1, this.a);
        abhi.g(parcel, e);
    }
}
