package com.google.android.gms.constellation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abuz;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class VerifyPhoneNumberRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<VerifyPhoneNumberRequest> CREATOR = new abuz(10);
    public final String a;
    public final long b;
    public final IdTokenRequest c;
    public final Bundle d;
    public final List e;
    public final boolean f;
    public final int g;
    public final List h;

    public VerifyPhoneNumberRequest(String str, long j, IdTokenRequest idTokenRequest, Bundle bundle, List list, boolean z, int i, List list2) {
        this.a = str;
        this.b = j;
        this.c = idTokenRequest;
        this.d = bundle;
        this.e = list;
        this.f = z;
        this.g = i;
        this.h = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.n(parcel, 2, this.b);
        abhi.o(parcel, 3, this.c, i, false);
        abhi.t(parcel, 4, this.d);
        abhi.r(parcel, 5, this.e, false);
        abhi.h(parcel, 6, this.f);
        abhi.m(parcel, 7, this.g);
        abhi.z(parcel, 8, this.h);
        abhi.g(parcel, e);
    }
}
