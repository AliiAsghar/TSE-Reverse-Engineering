package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.abgj;
import defpackage.abhi;
import defpackage.abvm;
import defpackage.acbp;
import defpackage.acee;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CurrentLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CurrentLocationRequest> CREATOR = new acbp(13);
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final boolean e;
    public final int f;
    public final WorkSource g;
    public final ClientIdentity h;

    public CurrentLocationRequest(long j, int i, int i2, long j2, boolean z, int i3, WorkSource workSource, ClientIdentity clientIdentity) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = j2;
        this.e = z;
        this.f = i3;
        this.g = workSource;
        this.h = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CurrentLocationRequest)) {
            return false;
        }
        CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) obj;
        if (this.a != currentLocationRequest.a || this.b != currentLocationRequest.b || this.c != currentLocationRequest.c || this.d != currentLocationRequest.d || this.e != currentLocationRequest.e || this.f != currentLocationRequest.f || !d.B(this.g, currentLocationRequest.g) || !d.B(this.h, currentLocationRequest.h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Long.valueOf(this.d)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CurrentLocationRequest[");
        sb.append(abgj.j(this.c));
        if (this.a != Long.MAX_VALUE) {
            sb.append(", maxAge=");
            acee.a(this.a, sb);
        }
        if (this.d != Long.MAX_VALUE) {
            sb.append(", duration=");
            sb.append(this.d);
            sb.append("ms");
        }
        if (this.b != 0) {
            sb.append(", ");
            sb.append(abgj.m(this.b));
        }
        if (this.e) {
            sb.append(", bypass");
        }
        if (this.f != 0) {
            sb.append(", ");
            sb.append(abgj.i(this.f));
        }
        if (!abvm.c(this.g)) {
            sb.append(", workSource=");
            sb.append(this.g);
        }
        if (this.h != null) {
            sb.append(", impersonation=");
            sb.append(this.h);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int e = abhi.e(parcel);
        abhi.n(parcel, 1, j);
        abhi.m(parcel, 2, this.b);
        abhi.m(parcel, 3, this.c);
        abhi.n(parcel, 4, this.d);
        abhi.h(parcel, 5, this.e);
        abhi.o(parcel, 6, this.g, i, false);
        abhi.m(parcel, 7, this.f);
        abhi.o(parcel, 9, this.h, i, false);
        abhi.g(parcel, e);
    }
}
