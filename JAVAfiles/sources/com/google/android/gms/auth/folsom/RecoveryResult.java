package com.google.android.gms.auth.folsom;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abmm;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RecoveryResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RecoveryResult> CREATOR = new abmm(6);
    public int a;
    public long b;

    private RecoveryResult() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RecoveryResult) {
            RecoveryResult recoveryResult = (RecoveryResult) obj;
            if (d.B(Integer.valueOf(this.a), Integer.valueOf(recoveryResult.a)) && d.B(Long.valueOf(this.b), Long.valueOf(recoveryResult.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.n(parcel, 2, this.b);
        abhi.g(parcel, e);
    }

    public RecoveryResult(int i, long j) {
        this.a = i;
        this.b = j;
    }
}
