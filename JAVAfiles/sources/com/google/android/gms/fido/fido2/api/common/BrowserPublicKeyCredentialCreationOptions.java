package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Bundle;
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
public class BrowserPublicKeyCredentialCreationOptions extends BrowserRequestOptions {
    public static final Parcelable.Creator<BrowserPublicKeyCredentialCreationOptions> CREATOR = new abzb(0);
    public final PublicKeyCredentialCreationOptions a;
    public final Uri b;
    public final byte[] c;
    public final Bundle d;

    public BrowserPublicKeyCredentialCreationOptions(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, Uri uri, byte[] bArr, Bundle bundle) {
        boolean z;
        boolean z2;
        abhg.m(publicKeyCredentialCreationOptions);
        this.a = publicKeyCredentialCreationOptions;
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
        this.d = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialCreationOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions = (BrowserPublicKeyCredentialCreationOptions) obj;
        if (!d.B(this.a, browserPublicKeyCredentialCreationOptions.a) || !d.B(this.b, browserPublicKeyCredentialCreationOptions.b) || !d.B(this.d, browserPublicKeyCredentialCreationOptions.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d});
    }

    public final String toString() {
        Bundle bundle = this.d;
        byte[] bArr = this.c;
        Uri uri = this.b;
        return "BrowserPublicKeyCredentialCreationOptions{\n publicKeyCredentialCreationOptions=" + this.a.toString() + ", \n origin=" + String.valueOf(uri) + ", \n clientDataHash=" + abhn.g(bArr) + ", \n chromeParameters=" + String.valueOf(bundle) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 2, publicKeyCredentialCreationOptions, i, false);
        abhi.o(parcel, 3, this.b, i, false);
        abhi.j(parcel, 4, this.c, false);
        abhi.t(parcel, 5, this.d);
        abhi.g(parcel, e);
    }
}
