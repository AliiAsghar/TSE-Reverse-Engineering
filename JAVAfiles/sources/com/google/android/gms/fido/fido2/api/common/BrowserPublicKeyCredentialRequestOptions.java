package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abhn;
import defpackage.abzb;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BrowserPublicKeyCredentialRequestOptions extends BrowserRequestOptions {
    public static final Parcelable.Creator<BrowserPublicKeyCredentialRequestOptions> CREATOR = new abzb(2);
    public final PublicKeyCredentialRequestOptions a;
    public final Uri b;
    public final byte[] c;

    public BrowserPublicKeyCredentialRequestOptions(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, Uri uri, byte[] bArr) {
        boolean z;
        boolean z2;
        abhg.m(publicKeyCredentialRequestOptions);
        this.a = publicKeyCredentialRequestOptions;
        abhg.m(uri);
        if (uri.getScheme() != null) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "origin scheme must be non-empty");
        if (uri.getAuthority() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        d.t(z2, "origin authority must be non-empty");
        this.b = uri;
        d.t(bArr == null || bArr.length == 32, "clientDataHash must be 32 bytes long");
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialRequestOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = (BrowserPublicKeyCredentialRequestOptions) obj;
        if (!d.B(this.a, browserPublicKeyCredentialRequestOptions.a) || !d.B(this.b, browserPublicKeyCredentialRequestOptions.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        byte[] bArr = this.c;
        Uri uri = this.b;
        return "BrowserPublicKeyCredentialRequestOptions{\n publicKeyCredentialRequestOptions=" + this.a.toString() + ", \n origin=" + String.valueOf(uri) + ", \n clientDataHash=" + abhn.g(bArr) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 2, publicKeyCredentialRequestOptions, i, false);
        abhi.o(parcel, 3, this.b, i, false);
        abhi.j(parcel, 4, this.c, false);
        abhi.g(parcel, e);
    }
}
