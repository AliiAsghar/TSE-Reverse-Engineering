package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import defpackage.abhi;
import defpackage.abhn;
import defpackage.abzb;
import defpackage.d;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PublicKeyCredentialCreationOptions extends RequestOptions {
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new abzb(17);
    public final PublicKeyCredentialRpEntity a;
    public final PublicKeyCredentialUserEntity b;
    public final byte[] c;
    public final List d;
    public final Double e;
    public final List f;
    public final AuthenticatorSelectionCriteria g;
    public final Integer h;
    public final TokenBinding i;
    public final AuthenticationExtensions j;
    public final String k;
    public ResultReceiver l;
    private final AttestationConveyancePreference m;

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf A[Catch: JSONException -> 0x01dc, TryCatch #3 {JSONException -> 0x01dc, blocks: (B:19:0x0034, B:21:0x003e, B:22:0x0048, B:24:0x006b, B:25:0x0071, B:26:0x008f, B:28:0x0095, B:30:0x0099, B:33:0x009d, B:36:0x00a5, B:37:0x00b9, B:39:0x00bf, B:41:0x00c6, B:45:0x00b7, B:52:0x00cd, B:54:0x00d5, B:55:0x00e8, B:57:0x00ee, B:58:0x00f8, B:60:0x00fe, B:63:0x0111, B:65:0x0117, B:67:0x0121, B:68:0x0127, B:70:0x012d, B:71:0x0133, B:73:0x0139, B:74:0x0143, B:76:0x0149, B:77:0x014f, B:78:0x0159, B:80:0x015f, B:81:0x0170, B:93:0x0176, B:84:0x018b, B:87:0x0196, B:91:0x0192, B:96:0x0180), top: B:18:0x0034, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PublicKeyCredentialCreationOptions(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity r31, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity r32, byte[] r33, java.util.List r34, java.lang.Double r35, java.util.List r36, com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria r37, java.lang.Integer r38, com.google.android.gms.fido.fido2.api.common.TokenBinding r39, java.lang.String r40, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r41, java.lang.String r42, android.os.ResultReceiver r43) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.<init>(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity, byte[], java.util.List, java.lang.Double, java.util.List, com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria, java.lang.Integer, com.google.android.gms.fido.fido2.api.common.TokenBinding, java.lang.String, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions, java.lang.String, android.os.ResultReceiver):void");
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        if (!d.B(this.a, publicKeyCredentialCreationOptions.a) || !d.B(this.b, publicKeyCredentialCreationOptions.b) || !Arrays.equals(this.c, publicKeyCredentialCreationOptions.c) || !d.B(this.e, publicKeyCredentialCreationOptions.e) || !this.d.containsAll(publicKeyCredentialCreationOptions.d) || !publicKeyCredentialCreationOptions.d.containsAll(this.d) || ((((list = this.f) != null || publicKeyCredentialCreationOptions.f != null) && (list == null || (list2 = publicKeyCredentialCreationOptions.f) == null || !list.containsAll(list2) || !publicKeyCredentialCreationOptions.f.containsAll(this.f))) || !d.B(this.g, publicKeyCredentialCreationOptions.g) || !d.B(this.h, publicKeyCredentialCreationOptions.h) || !d.B(this.i, publicKeyCredentialCreationOptions.i) || !d.B(this.m, publicKeyCredentialCreationOptions.m) || !d.B(this.j, publicKeyCredentialCreationOptions.j) || !d.B(this.k, publicKeyCredentialCreationOptions.k))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c)), this.d, this.e, this.f, this.g, this.h, this.i, this.m, this.j, this.k});
    }

    public final String toString() {
        AuthenticationExtensions authenticationExtensions = this.j;
        AttestationConveyancePreference attestationConveyancePreference = this.m;
        TokenBinding tokenBinding = this.i;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.g;
        List list = this.f;
        List list2 = this.d;
        byte[] bArr = this.c;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.b;
        return "PublicKeyCredentialCreationOptions{\n rp=" + this.a.toString() + ", \n user=" + publicKeyCredentialUserEntity.toString() + ", \n challenge=" + abhn.g(bArr) + ", \n parameters=" + list2.toString() + ", \n timeoutSeconds=" + this.e + ", \n excludeList=" + String.valueOf(list) + ", \n authenticatorSelection=" + String.valueOf(authenticatorSelectionCriteria) + ", \n requestId=" + this.h + ", \n tokenBinding=" + String.valueOf(tokenBinding) + ", \n attestationConveyancePreference=" + String.valueOf(attestationConveyancePreference) + ", \n authenticationExtensions=" + String.valueOf(authenticationExtensions) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 2, publicKeyCredentialRpEntity, i, false);
        abhi.o(parcel, 3, this.b, i, false);
        abhi.j(parcel, 4, this.c, false);
        abhi.r(parcel, 5, this.d, false);
        abhi.v(parcel, 6, this.e);
        abhi.r(parcel, 7, this.f, false);
        abhi.o(parcel, 8, this.g, i, false);
        abhi.A(parcel, 9, this.h);
        abhi.o(parcel, 10, this.i, i, false);
        AttestationConveyancePreference attestationConveyancePreference = this.m;
        if (attestationConveyancePreference == null) {
            str = null;
        } else {
            str = attestationConveyancePreference.d;
        }
        abhi.q(parcel, 11, str, false);
        abhi.o(parcel, 12, this.j, i, false);
        abhi.q(parcel, 13, this.k, false);
        abhi.o(parcel, 14, this.l, i, false);
        abhi.g(parcel, e);
    }
}
