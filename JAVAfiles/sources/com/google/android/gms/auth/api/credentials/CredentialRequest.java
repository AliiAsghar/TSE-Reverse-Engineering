package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.ablm;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialRequest> CREATOR = new ablm(0);
    final int a;
    public final boolean b;
    public final String[] c;
    public final CredentialPickerConfig d;
    public final CredentialPickerConfig e;
    public final boolean f;
    public final String g;
    public final String h;
    public final boolean i;

    public CredentialRequest(int i, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z2, String str, String str2, boolean z3) {
        this.a = i;
        this.b = z;
        abhg.m(strArr);
        this.c = strArr;
        this.d = credentialPickerConfig == null ? new CredentialPickerConfig() : credentialPickerConfig;
        this.e = credentialPickerConfig2 == null ? new CredentialPickerConfig() : credentialPickerConfig2;
        if (i < 3) {
            this.f = true;
            this.g = null;
            this.h = null;
        } else {
            this.f = z2;
            this.g = str;
            this.h = str2;
        }
        this.i = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.b;
        int e = abhi.e(parcel);
        abhi.h(parcel, 1, z);
        abhi.F(parcel, 2, this.c);
        abhi.o(parcel, 3, this.d, i, false);
        abhi.o(parcel, 4, this.e, i, false);
        abhi.h(parcel, 5, this.f);
        abhi.q(parcel, 6, this.g, false);
        abhi.q(parcel, 7, this.h, false);
        abhi.h(parcel, 8, this.i);
        abhi.m(parcel, 1000, this.a);
        abhi.g(parcel, e);
    }
}
