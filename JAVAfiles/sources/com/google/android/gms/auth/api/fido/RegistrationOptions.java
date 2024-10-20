package com.google.android.gms.auth.api.fido;

import android.accounts.Account;
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
public class RegistrationOptions extends AbstractSafeParcelable implements ablp, ablo {
    public static final Parcelable.Creator<RegistrationOptions> CREATOR = new ablm(11);
    public final PublicKeyCredentialCreationOptions a;
    public final String b;
    public final String c;
    public final BrowserOptions d;
    public final Account e;
    public final boolean f;
    public final long g;
    private final acbi h;
    private final egy i;

    public RegistrationOptions(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, String str, String str2, BrowserOptions browserOptions, Account account, int i, Bundle bundle, Boolean bool, long j) {
        egy a;
        boolean z;
        acbi b = acbi.b(i);
        if (bundle == null) {
            a = null;
        } else {
            a = abhn.a(bundle);
        }
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "Must provide a valid endTime.");
        abhg.m(publicKeyCredentialCreationOptions);
        this.a = publicKeyCredentialCreationOptions;
        abhg.m(str);
        this.b = str;
        abhg.m(str2);
        this.c = str2;
        this.d = browserOptions;
        this.e = account;
        this.h = b;
        this.i = a;
        this.f = bool.booleanValue();
        this.g = j;
    }

    @Override // defpackage.ablo
    public final egy a() {
        return this.i;
    }

    @Override // defpackage.ablp
    public final acbi b() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RegistrationOptions)) {
            return false;
        }
        RegistrationOptions registrationOptions = (RegistrationOptions) obj;
        if (!d.B(this.a, registrationOptions.a) || !d.B(this.b, registrationOptions.b) || !d.B(this.c, registrationOptions.c) || !d.B(this.d, registrationOptions.d) || !d.B(this.e, registrationOptions.e) || !d.B(this.h, registrationOptions.h) || !d.B(this.i, registrationOptions.i) || !d.B(Boolean.valueOf(this.f), Boolean.valueOf(registrationOptions.f)) || this.g != registrationOptions.g) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.h, this.i, Boolean.valueOf(this.f), Long.valueOf(this.g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 2, publicKeyCredentialCreationOptions, i, false);
        abhi.q(parcel, 3, this.b, false);
        abhi.q(parcel, 4, this.c, false);
        abhi.o(parcel, 5, this.d, i, false);
        abhi.o(parcel, 6, this.e, i, false);
        abhi.m(parcel, 7, abhx.a(this));
        abhi.t(parcel, 8, abhi.a(this));
        abhi.h(parcel, 9, this.f);
        abhi.n(parcel, 10, this.g);
        abhi.g(parcel, e);
    }
}
