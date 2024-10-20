package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abuc;
import defpackage.d;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ApiFeatureRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new abuc(15);
    public final List a;
    public final boolean b;
    public final String c;
    public final String d;

    public ApiFeatureRequest(List list, boolean z, String str, String str2) {
        abhg.m(list);
        this.a = list;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        if (this.b != apiFeatureRequest.b || !d.B(this.a, apiFeatureRequest.a) || !d.B(this.c, apiFeatureRequest.c) || !d.B(this.d, apiFeatureRequest.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), this.a, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int e = abhi.e(parcel);
        abhi.r(parcel, 1, list, false);
        abhi.h(parcel, 2, this.b);
        abhi.q(parcel, 3, this.c, false);
        abhi.q(parcel, 4, this.d, false);
        abhi.g(parcel, e);
    }
}
