package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.aced;
import defpackage.acex;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class UploadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UploadRequest> CREATOR = new aced(0);
    public final Account a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;

    public UploadRequest(Account account, String str, long j, long j2, long j3, String str2) {
        this.a = account;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadRequest)) {
            return false;
        }
        UploadRequest uploadRequest = (UploadRequest) obj;
        if (this.a.equals(uploadRequest.a) && this.b.equals(uploadRequest.b) && d.B(Long.valueOf(this.c), Long.valueOf(uploadRequest.c)) && this.d == uploadRequest.d && this.e == uploadRequest.e && d.B(this.f, uploadRequest.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e), this.f});
    }

    public final String toString() {
        return "UploadRequest{, mAccount=" + acex.g(this.a) + ", mReason='" + this.b + "', mDurationMillis=" + this.c + ", mMovingLatencyMillis=" + this.d + ", mStationaryLatencyMillis=" + this.e + ", mAppSpecificKey='" + this.f + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 2, account, i, false);
        abhi.q(parcel, 3, this.b, false);
        abhi.n(parcel, 4, this.c);
        abhi.n(parcel, 5, this.d);
        abhi.n(parcel, 6, this.e);
        abhi.q(parcel, 7, this.f, false);
        abhi.g(parcel, e);
    }
}
