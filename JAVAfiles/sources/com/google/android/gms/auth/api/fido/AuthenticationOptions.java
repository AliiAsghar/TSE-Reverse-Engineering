package com.google.android.gms.auth.api.fido;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abhn;
import defpackage.abhx;
import defpackage.ablm;
import defpackage.ablo;
import defpackage.ablp;
import defpackage.acbi;
import defpackage.d;
import defpackage.egy;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AuthenticationOptions extends AbstractSafeParcelable implements ablp, ablo {
    public static final Parcelable.Creator<AuthenticationOptions> CREATOR = new ablm(6);
    public final PublicKeyCredentialRequestOptions a;
    public final String b;
    public final String c;
    public final BrowserOptions d;
    public final boolean e;
    public final long f;
    private final acbi g;
    private final egy h;

    public AuthenticationOptions(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, String str, String str2, BrowserOptions browserOptions, int i, Bundle bundle, boolean z, long j) {
        egy a;
        boolean z2;
        acbi b = acbi.b(i);
        if (bundle == null) {
            a = null;
        } else {
            a = abhn.a(bundle);
        }
        if (j > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        d.t(z2, "Must provide a valid endTime.");
        abhg.m(publicKeyCredentialRequestOptions);
        this.a = publicKeyCredentialRequestOptions;
        abhg.m(str);
        this.b = str;
        abhg.m(str2);
        this.c = str2;
        this.d = browserOptions;
        this.g = b;
        this.h = a;
        this.e = z;
        this.f = j;
    }

    @Override // defpackage.ablo
    public final egy a() {
        return this.h;
    }

    @Override // defpackage.ablp
    public final acbi b() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationOptions)) {
            return false;
        }
        AuthenticationOptions authenticationOptions = (AuthenticationOptions) obj;
        if (!d.B(this.a, authenticationOptions.a) || !d.B(this.b, authenticationOptions.b) || !d.B(this.c, authenticationOptions.c) || !d.B(this.d, authenticationOptions.d) || !d.B(this.g, authenticationOptions.g) || !d.B(this.h, authenticationOptions.h) || !d.B(Boolean.valueOf(this.e), Boolean.valueOf(authenticationOptions.e)) || this.f != authenticationOptions.f) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.g, this.h, Boolean.valueOf(this.e), Long.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 2, publicKeyCredentialRequestOptions, i, false);
        abhi.q(parcel, 3, this.b, false);
        abhi.q(parcel, 4, this.c, false);
        abhi.o(parcel, 5, this.d, i, false);
        abhi.m(parcel, 6, abhx.a(this));
        abhi.t(parcel, 7, abhi.a(this));
        abhi.h(parcel, 8, this.e);
        abhi.n(parcel, 9, this.f);
        abhi.g(parcel, e);
    }
}
