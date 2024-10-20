package com.google.android.gms.duokit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abxj;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SetupDuoRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetupDuoRequest> CREATOR = new abxj(1);
    public DuoId[] a;

    public SetupDuoRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetupDuoRequest) {
            return Arrays.equals(this.a, ((SetupDuoRequest) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.H(parcel, 1, this.a, i);
        abhi.g(parcel, e);
    }

    public SetupDuoRequest(DuoId[] duoIdArr) {
        this.a = duoIdArr;
    }
}
