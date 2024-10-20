package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfe;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SyncStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SyncStatus> CREATOR = new acfe(0);
    public final long a;
    public final long b;
    public final long c;

    public SyncStatus(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SyncStatus syncStatus = (SyncStatus) obj;
            if (d.B(Long.valueOf(this.a), Long.valueOf(syncStatus.a))) {
                if (d.B(Long.valueOf(this.b), Long.valueOf(syncStatus.b))) {
                    if (d.B(Long.valueOf(this.c), Long.valueOf(syncStatus.c))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int e = abhi.e(parcel);
        abhi.n(parcel, 1, j);
        abhi.n(parcel, 2, this.b);
        abhi.n(parcel, 3, this.c);
        abhi.g(parcel, e);
    }
}
