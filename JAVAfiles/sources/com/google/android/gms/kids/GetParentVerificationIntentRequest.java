package com.google.android.gms.kids;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acbp;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GetParentVerificationIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetParentVerificationIntentRequest> CREATOR = new acbp(2);
    public int a;
    public int b;
    public String c;
    public int d;
    public byte[] e;
    public PendingIntent f;
    public PendingIntent g;
    public byte[] h;

    private GetParentVerificationIntentRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetParentVerificationIntentRequest) {
            GetParentVerificationIntentRequest getParentVerificationIntentRequest = (GetParentVerificationIntentRequest) obj;
            if (d.B(Integer.valueOf(this.a), Integer.valueOf(getParentVerificationIntentRequest.a)) && d.B(Integer.valueOf(this.b), Integer.valueOf(getParentVerificationIntentRequest.b)) && d.B(this.c, getParentVerificationIntentRequest.c) && d.B(Integer.valueOf(this.d), Integer.valueOf(getParentVerificationIntentRequest.d)) && Arrays.equals(this.e, getParentVerificationIntentRequest.e) && d.B(this.f, getParentVerificationIntentRequest.f) && d.B(this.g, getParentVerificationIntentRequest.g) && Arrays.equals(this.h, getParentVerificationIntentRequest.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, Integer.valueOf(this.d), Integer.valueOf(Arrays.hashCode(this.e)), this.f, this.g, Integer.valueOf(Arrays.hashCode(this.h))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.m(parcel, 2, this.b);
        abhi.q(parcel, 3, this.c, false);
        abhi.m(parcel, 4, this.d);
        abhi.j(parcel, 5, this.e, false);
        abhi.o(parcel, 7, this.f, i, false);
        abhi.j(parcel, 8, this.h, false);
        abhi.o(parcel, 9, this.g, i, false);
        abhi.g(parcel, e);
    }

    public GetParentVerificationIntentRequest(int i, int i2, String str, int i3, byte[] bArr, PendingIntent pendingIntent, PendingIntent pendingIntent2, byte[] bArr2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = i3;
        this.e = bArr;
        this.f = pendingIntent;
        this.g = pendingIntent2;
        this.h = bArr2;
    }
}
