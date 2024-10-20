package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.abgj;
import defpackage.abhi;
import defpackage.acbp;
import defpackage.acee;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LastLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LastLocationRequest> CREATOR = new acbp(18);
    public final long a;
    public final int b;
    public final boolean c;
    public final ClientIdentity d;

    public LastLocationRequest(long j, int i, boolean z, ClientIdentity clientIdentity) {
        this.a = j;
        this.b = i;
        this.c = z;
        this.d = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LastLocationRequest)) {
            return false;
        }
        LastLocationRequest lastLocationRequest = (LastLocationRequest) obj;
        if (this.a != lastLocationRequest.a || this.b != lastLocationRequest.b || this.c != lastLocationRequest.c || !d.B(this.d, lastLocationRequest.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LastLocationRequest[");
        if (this.a != Long.MAX_VALUE) {
            sb.append("maxAge=");
            acee.a(this.a, sb);
        }
        if (this.b != 0) {
            sb.append(", ");
            sb.append(abgj.m(this.b));
        }
        if (this.c) {
            sb.append(", bypass");
        }
        if (this.d != null) {
            sb.append(", impersonation=");
            sb.append(this.d);
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
        abhi.h(parcel, 3, this.c);
        abhi.o(parcel, 5, this.d, i, false);
        abhi.g(parcel, e);
    }
}
