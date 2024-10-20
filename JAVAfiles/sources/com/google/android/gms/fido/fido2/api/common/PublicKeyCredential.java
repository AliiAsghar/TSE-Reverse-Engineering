package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhn;
import defpackage.abzb;
import defpackage.aozb;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PublicKeyCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new abzb(18);
    public final String a;
    public final String b;
    public final AuthenticatorAttestationResponse c;
    public final AuthenticatorAssertionResponse d;
    public final AuthenticatorErrorResponse e;
    public final AuthenticationExtensionsClientOutputs f;
    public final String g;
    public String h;
    private final aozb i;

    public PublicKeyCredential(String str, String str2, aozb aozbVar, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3) {
        boolean z;
        boolean z2 = true;
        if ((authenticatorAttestationResponse != null && authenticatorAssertionResponse == null && authenticatorErrorResponse == null) || ((authenticatorAttestationResponse == null && authenticatorAssertionResponse != null && authenticatorErrorResponse == null) || (authenticatorAttestationResponse == null && authenticatorAssertionResponse == null && authenticatorErrorResponse != null))) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "Must provide a response object.");
        if (authenticatorErrorResponse == null && (str == null || aozbVar == null)) {
            z2 = false;
        }
        d.t(z2, "Must provide id and rawId if not an error response.");
        this.a = str;
        this.b = str2;
        this.i = aozbVar;
        this.c = authenticatorAttestationResponse;
        this.d = authenticatorAssertionResponse;
        this.e = authenticatorErrorResponse;
        this.f = authenticationExtensionsClientOutputs;
        this.g = str3;
        this.h = null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        if (!d.B(this.a, publicKeyCredential.a) || !d.B(this.b, publicKeyCredential.b) || !d.B(this.i, publicKeyCredential.i) || !d.B(this.c, publicKeyCredential.c) || !d.B(this.d, publicKeyCredential.d) || !d.B(this.e, publicKeyCredential.e) || !d.B(this.f, publicKeyCredential.f) || !d.B(this.g, publicKeyCredential.g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.i, this.d, this.c, this.e, this.f, this.g});
    }

    public final String toString() {
        byte[] H;
        aozb aozbVar = this.i;
        if (aozbVar == null) {
            H = null;
        } else {
            H = aozbVar.H();
        }
        String str = this.b;
        String str2 = this.a;
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.c;
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.d;
        AuthenticatorErrorResponse authenticatorErrorResponse = this.e;
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.f;
        String str3 = this.g;
        return "PublicKeyCredential{\n id='" + str2 + "', \n type='" + str + "', \n rawId=" + abhn.g(H) + ", \n registerResponse=" + String.valueOf(authenticatorAttestationResponse) + ", \n signResponse=" + String.valueOf(authenticatorAssertionResponse) + ", \n errorResponse=" + String.valueOf(authenticatorErrorResponse) + ", \n extensionsClientOutputs=" + String.valueOf(authenticationExtensionsClientOutputs) + ", \n authenticatorAttachment='" + str3 + "'}";
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x02a2 A[Catch: JSONException -> 0x02fd, TRY_LEAVE, TryCatch #7 {JSONException -> 0x02fd, blocks: (B:56:0x00a1, B:57:0x00c4, B:59:0x00c9, B:61:0x00d5, B:63:0x00e2, B:64:0x00db, B:67:0x00e5, B:69:0x00ee, B:71:0x0108, B:73:0x0119, B:74:0x011f, B:76:0x0123, B:78:0x0135, B:80:0x0152, B:81:0x016b, B:86:0x018f, B:93:0x028e, B:95:0x02a2, B:98:0x01b1, B:100:0x01c4, B:105:0x01db, B:108:0x01fb, B:110:0x020f, B:112:0x0215, B:113:0x0234, B:114:0x0239, B:115:0x023a, B:116:0x023f, B:121:0x024d, B:123:0x025c, B:125:0x026a, B:126:0x0282, B:127:0x0287, B:128:0x0288, B:129:0x028d, B:130:0x02b0, B:131:0x02b5, B:133:0x02b7, B:134:0x02be, B:135:0x02bf, B:136:0x02c4, B:140:0x02c8, B:141:0x02cf, B:143:0x02d0, B:144:0x02d7, B:146:0x02d9, B:147:0x02e0, B:148:0x02e1, B:149:0x02e8, B:151:0x02ea, B:152:0x02f1, B:156:0x02f5, B:157:0x02fc), top: B:55:0x00a1, outer: #9, inners: #2, #5, #8 }] */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void writeToParcel(android.os.Parcel r23, int r24) {
        /*
            Method dump skipped, instructions count: 950
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.writeToParcel(android.os.Parcel, int):void");
    }
}
