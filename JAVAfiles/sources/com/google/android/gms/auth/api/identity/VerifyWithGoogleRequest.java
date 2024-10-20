package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ablq;
import defpackage.alog;
import defpackage.d;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class VerifyWithGoogleRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<VerifyWithGoogleRequest> CREATOR = new ablq(16);
    public final alog a;
    public final String b;
    public final boolean c;
    public final String d;

    public VerifyWithGoogleRequest(List list, String str, boolean z, String str2) {
        boolean z2;
        if (list != null && !list.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        d.t(z2, "requestedScopes cannot be null or empty");
        if (z) {
            d.t(str != null, "If offline access is requested, server client id must be provided.");
        } else {
            d.t(str == null, "If offline access is not requested, server client id must not be provided.");
        }
        this.a = alog.n(list);
        this.b = str;
        this.c = z;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof VerifyWithGoogleRequest)) {
            return false;
        }
        VerifyWithGoogleRequest verifyWithGoogleRequest = (VerifyWithGoogleRequest) obj;
        if (this.a.size() != verifyWithGoogleRequest.a.size() || !this.a.containsAll(verifyWithGoogleRequest.a) || this.c != verifyWithGoogleRequest.c || !d.B(this.b, verifyWithGoogleRequest.b) || !d.B(this.d, verifyWithGoogleRequest.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        alog alogVar = this.a;
        int e = abhi.e(parcel);
        abhi.r(parcel, 1, alogVar, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.h(parcel, 3, this.c);
        abhi.q(parcel, 4, this.d, false);
        abhi.g(parcel, e);
    }
}
