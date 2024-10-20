package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ackp;
import defpackage.d;
import j$.time.Instant;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ConsentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConsentResponse> CREATOR = new ackp(10);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final List f;
    public final String g;
    public final Long h;

    public ConsentResponse(int i, boolean z, boolean z2, boolean z3, boolean z4, List list, String str, Long l) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = list;
        this.g = str;
        this.h = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsentResponse)) {
            return false;
        }
        ConsentResponse consentResponse = (ConsentResponse) obj;
        if (this.a == consentResponse.a && this.b == consentResponse.b && this.c == consentResponse.c && this.d == consentResponse.d && this.e == consentResponse.e) {
            List list = consentResponse.f;
            List list2 = this.f;
            if (list2 == null || list == null ? list2 == list : !(!list2.containsAll(list) || this.f.size() != list.size())) {
                if (d.B(this.g, consentResponse.g) && d.B(this.h, consentResponse.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, this.g, this.h});
    }

    public final String toString() {
        Instant instant;
        Long l = this.h;
        String valueOf = String.valueOf(this.f);
        if (l != null) {
            instant = Instant.ofEpochMilli(l.longValue());
        } else {
            instant = null;
        }
        String str = this.g;
        boolean z = this.e;
        boolean z2 = this.d;
        boolean z3 = this.c;
        boolean z4 = this.b;
        return "ConsentResponse {statusCode =" + this.a + ", hasTosConsent =" + z4 + ", hasLoggingConsent =" + z3 + ", hasCloudSyncConsent =" + z2 + ", hasLocationConsent =" + z + ", accountConsentRecords =" + valueOf + ", nodeId =" + str + ", lastUpdateRequestedTime =" + String.valueOf(instant) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.h(parcel, 2, this.b);
        abhi.h(parcel, 3, this.c);
        abhi.h(parcel, 4, this.d);
        abhi.h(parcel, 5, this.e);
        abhi.r(parcel, 6, this.f, false);
        abhi.q(parcel, 7, this.g, false);
        abhi.D(parcel, 8, this.h);
        abhi.g(parcel, e);
    }
}
