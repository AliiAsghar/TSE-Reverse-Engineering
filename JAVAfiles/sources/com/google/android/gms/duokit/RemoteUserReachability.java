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
public final class RemoteUserReachability extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteUserReachability> CREATOR = new abuz(20);
    public DuoId a;
    public int b;
    public int c;

    public RemoteUserReachability() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RemoteUserReachability) {
            RemoteUserReachability remoteUserReachability = (RemoteUserReachability) obj;
            if (d.B(this.a, remoteUserReachability.a) && d.B(Integer.valueOf(this.b), Integer.valueOf(remoteUserReachability.b)) && d.B(Integer.valueOf(this.c), Integer.valueOf(remoteUserReachability.c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, this.a, i, false);
        abhi.m(parcel, 2, this.b);
        abhi.m(parcel, 3, this.c);
        abhi.g(parcel, e);
    }

    public RemoteUserReachability(DuoId duoId, int i, int i2) {
        this.a = duoId;
        this.b = i;
        this.c = i2;
    }
}
