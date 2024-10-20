package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abye;
import defpackage.albo;
import defpackage.algv;
import defpackage.amcn;
import defpackage.aozb;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new abye(3);
    public final aozb a;
    public final aozb b;
    public final String[] c;
    private final aozb d;

    public AuthenticatorAttestationResponse(aozb aozbVar, aozb aozbVar2, aozb aozbVar3, String[] strArr) {
        this.d = aozbVar;
        this.a = aozbVar2;
        this.b = aozbVar3;
        abhg.m(strArr);
        this.c = strArr;
    }

    public final byte[] a() {
        return this.b.H();
    }

    public final byte[] b() {
        return this.a.H();
    }

    @Deprecated
    public final byte[] c() {
        return this.d.H();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        if (!d.B(this.d, authenticatorAttestationResponse.d) || !d.B(this.a, authenticatorAttestationResponse.a) || !d.B(this.b, authenticatorAttestationResponse.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b}))});
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("keyHandle", amcn.h.j(c()));
        aj.b("clientDataJSON", amcn.h.j(b()));
        aj.b("attestationObject", amcn.h.j(a()));
        aj.b("transports", Arrays.toString(this.c));
        return aj.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.j(parcel, 2, c(), false);
        abhi.j(parcel, 3, b(), false);
        abhi.j(parcel, 4, a(), false);
        abhi.F(parcel, 5, this.c);
        abhi.g(parcel, e);
    }
}
