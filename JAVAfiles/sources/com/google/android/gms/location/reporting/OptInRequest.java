package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acdi;
import defpackage.acex;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class OptInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OptInRequest> CREATOR = new acdi(18);
    public final Account a;
    public final String b;
    public final String c;
    private final boolean d;

    public OptInRequest(Account account, String str, String str2, boolean z) {
        this.a = account;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptInRequest)) {
            return false;
        }
        OptInRequest optInRequest = (OptInRequest) obj;
        if (this.a.equals(optInRequest.a) && d.B(this.b, optInRequest.b) && d.B(this.c, optInRequest.c) && d.B(Boolean.valueOf(this.d), Boolean.valueOf(optInRequest.d))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Boolean.valueOf(this.d)});
    }

    public final String toString() {
        return "UploadRequest{, account=" + acex.g(this.a) + ", tag='" + this.b + ", auditToken=" + this.c + ", enableAdsSubconsent=" + this.d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 2, account, i, false);
        abhi.q(parcel, 3, this.b, false);
        abhi.q(parcel, 4, this.c, false);
        boolean z = this.d;
        Boolean.valueOf(z).getClass();
        abhi.h(parcel, 5, z);
        abhi.g(parcel, e);
    }
}
