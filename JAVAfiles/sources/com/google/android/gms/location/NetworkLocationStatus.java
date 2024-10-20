package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acdi;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class NetworkLocationStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<NetworkLocationStatus> CREATOR = new acdi(4);
    public final int a;
    public final int b;
    public final long c;
    public final long d;

    public NetworkLocationStatus(int i, int i2, long j, long j2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof NetworkLocationStatus) {
            NetworkLocationStatus networkLocationStatus = (NetworkLocationStatus) obj;
            if (this.a == networkLocationStatus.a && this.b == networkLocationStatus.b && this.c == networkLocationStatus.c && this.d == networkLocationStatus.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a), Long.valueOf(this.d), Long.valueOf(this.c)});
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.a + " Cell status: " + this.b + " elapsed time NS: " + this.d + " system time ms: " + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.m(parcel, 2, this.b);
        abhi.n(parcel, 3, this.c);
        abhi.n(parcel, 4, this.d);
        abhi.g(parcel, e);
    }
}
