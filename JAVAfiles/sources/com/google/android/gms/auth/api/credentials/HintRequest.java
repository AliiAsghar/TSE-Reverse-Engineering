package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.ablm;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new ablm(2);
    final int a;
    public final CredentialPickerConfig b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final boolean f;
    public final String g;
    public final String h;

    public HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr, boolean z3, String str, String str2) {
        this.a = i;
        abhg.m(credentialPickerConfig);
        this.b = credentialPickerConfig;
        this.c = z;
        this.d = z2;
        abhg.m(strArr);
        this.e = strArr;
        if (i < 2) {
            this.f = true;
            this.g = null;
            this.h = null;
        } else {
            this.f = z3;
            this.g = str;
            this.h = str2;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CredentialPickerConfig credentialPickerConfig = this.b;
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, credentialPickerConfig, i, false);
        abhi.h(parcel, 2, this.c);
        abhi.h(parcel, 3, this.d);
        abhi.F(parcel, 4, this.e);
        abhi.h(parcel, 5, this.f);
        abhi.q(parcel, 6, this.g, false);
        abhi.q(parcel, 7, this.h, false);
        abhi.m(parcel, 1000, this.a);
        abhi.g(parcel, e);
    }
}
