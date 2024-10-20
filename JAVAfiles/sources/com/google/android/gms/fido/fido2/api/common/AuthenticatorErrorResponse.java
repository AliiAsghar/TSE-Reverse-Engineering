package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhi;
import defpackage.abye;
import defpackage.abze;
import defpackage.albo;
import defpackage.algv;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AuthenticatorErrorResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = new abye(4);
    public final ErrorCode a;
    public final String b;
    public final int c;

    public AuthenticatorErrorResponse(int i, String str, int i2) {
        try {
            this.a = ErrorCode.a(i);
            this.b = str;
            this.c = i2;
        } catch (abze e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        if (!d.B(this.a, authenticatorErrorResponse.a) || !d.B(this.b, authenticatorErrorResponse.b) || !d.B(Integer.valueOf(this.c), Integer.valueOf(authenticatorErrorResponse.c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.f("errorCode", this.a.m);
        String str = this.b;
        if (str != null) {
            aj.b("errorMessage", str);
        }
        return aj.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 2, this.a.m);
        abhi.q(parcel, 3, this.b, false);
        abhi.m(parcel, 4, this.c);
        abhi.g(parcel, e);
    }
}
