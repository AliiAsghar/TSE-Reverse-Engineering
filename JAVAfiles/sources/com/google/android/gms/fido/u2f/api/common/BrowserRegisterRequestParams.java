package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abzf;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class BrowserRegisterRequestParams extends BrowserRequestParams {
    public static final Parcelable.Creator<BrowserRegisterRequestParams> CREATOR = new abzf(16);
    public final RegisterRequestParams a;
    public final Uri b;

    public BrowserRegisterRequestParams(RegisterRequestParams registerRequestParams, Uri uri) {
        boolean z;
        abhg.m(registerRequestParams);
        this.a = registerRequestParams;
        abhg.m(uri);
        if (uri.getScheme() != null) {
            z = true;
        } else {
            z = false;
        }
        d.t(z, "origin scheme must be non-empty");
        d.t(uri.getAuthority() != null, "origin authority must be non-empty");
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowserRegisterRequestParams)) {
            return false;
        }
        BrowserRegisterRequestParams browserRegisterRequestParams = (BrowserRegisterRequestParams) obj;
        if (d.B(this.a, browserRegisterRequestParams.a) && d.B(this.b, browserRegisterRequestParams.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        RegisterRequestParams registerRequestParams = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 2, registerRequestParams, i, false);
        abhi.o(parcel, 3, this.b, i, false);
        abhi.g(parcel, e);
    }
}
