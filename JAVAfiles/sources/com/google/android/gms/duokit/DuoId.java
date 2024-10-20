package com.google.android.gms.duokit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abuz;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DuoId extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DuoId> CREATOR = new abuz(14);
    public int a;
    public String b;

    public DuoId() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DuoId) {
            DuoId duoId = (DuoId) obj;
            if (d.B(Integer.valueOf(this.a), Integer.valueOf(duoId.a)) && d.B(this.b, duoId.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.q(parcel, 2, this.b, false);
        abhi.g(parcel, e);
    }

    public DuoId(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
