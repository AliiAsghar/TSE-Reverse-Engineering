package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abxj;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AuthenticationExtensions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new abxj(18);
    public final FidoAppIdExtension a;
    public final CableAuthenticationExtension b;
    public final UserVerificationMethodExtension c;
    public final GoogleMultiAssertionExtension d;
    public final GoogleSessionIdExtension e;
    public final GoogleSilentVerificationExtension f;
    public final DevicePublicKeyExtension g;
    public final GoogleTunnelServerIdExtension h;
    public final GoogleThirdPartyPaymentExtension i;
    public final PrfExtension j;
    public final SimpleTransactionAuthorizationExtension k;
    public final HmacSecretExtension l;
    public final PaymentExtension m;

    public AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, CableAuthenticationExtension cableAuthenticationExtension, UserVerificationMethodExtension userVerificationMethodExtension, GoogleMultiAssertionExtension googleMultiAssertionExtension, GoogleSessionIdExtension googleSessionIdExtension, GoogleSilentVerificationExtension googleSilentVerificationExtension, DevicePublicKeyExtension devicePublicKeyExtension, GoogleTunnelServerIdExtension googleTunnelServerIdExtension, GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, PrfExtension prfExtension, SimpleTransactionAuthorizationExtension simpleTransactionAuthorizationExtension, HmacSecretExtension hmacSecretExtension, PaymentExtension paymentExtension) {
        this.a = fidoAppIdExtension;
        this.c = userVerificationMethodExtension;
        this.b = cableAuthenticationExtension;
        this.d = googleMultiAssertionExtension;
        this.e = googleSessionIdExtension;
        this.f = googleSilentVerificationExtension;
        this.g = devicePublicKeyExtension;
        this.h = googleTunnelServerIdExtension;
        this.i = googleThirdPartyPaymentExtension;
        this.j = prfExtension;
        this.k = simpleTransactionAuthorizationExtension;
        this.l = hmacSecretExtension;
        this.m = paymentExtension;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions a(org.json.JSONObject r19) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.a(org.json.JSONObject):com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        if (!d.B(this.a, authenticationExtensions.a) || !d.B(this.b, authenticationExtensions.b) || !d.B(this.c, authenticationExtensions.c) || !d.B(this.d, authenticationExtensions.d) || !d.B(this.e, authenticationExtensions.e) || !d.B(this.f, authenticationExtensions.f) || !d.B(this.g, authenticationExtensions.g) || !d.B(this.h, authenticationExtensions.h) || !d.B(this.i, authenticationExtensions.i) || !d.B(this.j, authenticationExtensions.j) || !d.B(this.k, authenticationExtensions.k) || !d.B(this.l, authenticationExtensions.l) || !d.B(this.m, authenticationExtensions.m)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m});
    }

    public final String toString() {
        PaymentExtension paymentExtension = this.m;
        SimpleTransactionAuthorizationExtension simpleTransactionAuthorizationExtension = this.k;
        PrfExtension prfExtension = this.j;
        GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = this.i;
        GoogleTunnelServerIdExtension googleTunnelServerIdExtension = this.h;
        DevicePublicKeyExtension devicePublicKeyExtension = this.g;
        GoogleSilentVerificationExtension googleSilentVerificationExtension = this.f;
        GoogleSessionIdExtension googleSessionIdExtension = this.e;
        GoogleMultiAssertionExtension googleMultiAssertionExtension = this.d;
        UserVerificationMethodExtension userVerificationMethodExtension = this.c;
        CableAuthenticationExtension cableAuthenticationExtension = this.b;
        return "AuthenticationExtensions{\n fidoAppIdExtension=" + String.valueOf(this.a) + ", \n cableAuthenticationExtension=" + String.valueOf(cableAuthenticationExtension) + ", \n userVerificationMethodExtension=" + String.valueOf(userVerificationMethodExtension) + ", \n googleMultiAssertionExtension=" + String.valueOf(googleMultiAssertionExtension) + ", \n googleSessionIdExtension=" + String.valueOf(googleSessionIdExtension) + ", \n googleSilentVerificationExtension=" + String.valueOf(googleSilentVerificationExtension) + ", \n devicePublicKeyExtension=" + String.valueOf(devicePublicKeyExtension) + ", \n googleTunnelServerIdExtension=" + String.valueOf(googleTunnelServerIdExtension) + ", \n googleThirdPartyPaymentExtension=" + String.valueOf(googleThirdPartyPaymentExtension) + ", \n prfExtension=" + String.valueOf(prfExtension) + ", \n simpleTransactionAuthorizationExtension=" + String.valueOf(simpleTransactionAuthorizationExtension) + ", \n paymentExtension=" + String.valueOf(paymentExtension) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        FidoAppIdExtension fidoAppIdExtension = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 2, fidoAppIdExtension, i, false);
        abhi.o(parcel, 3, this.b, i, false);
        abhi.o(parcel, 4, this.c, i, false);
        abhi.o(parcel, 5, this.d, i, false);
        abhi.o(parcel, 6, this.e, i, false);
        abhi.o(parcel, 7, this.f, i, false);
        abhi.o(parcel, 8, this.g, i, false);
        abhi.o(parcel, 9, this.h, i, false);
        abhi.o(parcel, 10, this.i, i, false);
        abhi.o(parcel, 11, this.j, i, false);
        abhi.o(parcel, 12, this.k, i, false);
        abhi.o(parcel, 13, this.l, i, false);
        abhi.o(parcel, 14, this.m, i, false);
        abhi.g(parcel, e);
    }
}
