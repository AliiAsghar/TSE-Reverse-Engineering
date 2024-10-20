package com.google.android.gms.auth.api.fido;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abhn;
import defpackage.ablm;
import defpackage.alog;
import defpackage.aozb;
import defpackage.d;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PublicKeyCredentialRequestOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialRequestOptions> CREATOR = new ablm(9);
    public final Double a;
    public final String b;
    public final alog c;
    public final TokenBinding d;
    public final AuthenticationExtensions e;
    private final aozb f;
    private final UserVerificationRequirement g;

    public PublicKeyCredentialRequestOptions(aozb aozbVar, Double d, String str, List list, TokenBinding tokenBinding, UserVerificationRequirement userVerificationRequirement, AuthenticationExtensions authenticationExtensions) {
        alog n;
        this.f = aozbVar;
        this.a = d;
        abhg.k(str);
        this.b = str;
        if (list == null) {
            n = null;
        } else {
            n = alog.n(list);
        }
        this.c = n;
        this.d = tokenBinding;
        this.g = userVerificationRequirement;
        this.e = authenticationExtensions;
    }

    public final boolean equals(Object obj) {
        alog alogVar;
        alog alogVar2;
        if (!(obj instanceof PublicKeyCredentialRequestOptions)) {
            return false;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        if (!d.B(this.f, publicKeyCredentialRequestOptions.f) || !d.B(this.a, publicKeyCredentialRequestOptions.a) || !d.B(this.b, publicKeyCredentialRequestOptions.b) || ((((alogVar = this.c) != null || publicKeyCredentialRequestOptions.c != null) && (alogVar == null || (alogVar2 = publicKeyCredentialRequestOptions.c) == null || !alogVar.containsAll(alogVar2) || !publicKeyCredentialRequestOptions.c.containsAll(this.c))) || !d.B(this.d, publicKeyCredentialRequestOptions.d) || !d.B(this.g, publicKeyCredentialRequestOptions.g) || !d.B(this.e, publicKeyCredentialRequestOptions.e))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f, this.a, this.b, this.c, this.d, this.g, this.e});
    }

    public final String toString() {
        return String.format(Locale.US, "PublicKeyCredentialCreationOptions: {\nchallenge: %s\ntimeoutSeconds: %s\nrpId: %s\nallowList: %s\ntokenBinding: %s\nauthenticationExtensions :%s}", abhn.g(this.f.H()), this.a, this.b, this.c, this.d, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        aozb aozbVar = this.f;
        int e = abhi.e(parcel);
        abhi.j(parcel, 2, aozbVar.H(), false);
        abhi.v(parcel, 3, this.a);
        abhi.q(parcel, 4, this.b, false);
        abhi.r(parcel, 5, this.c, false);
        abhi.o(parcel, 6, this.d, i, false);
        UserVerificationRequirement userVerificationRequirement = this.g;
        if (userVerificationRequirement == null) {
            str = null;
        } else {
            str = userVerificationRequirement.d;
        }
        abhi.q(parcel, 7, str, false);
        abhi.o(parcel, 8, this.e, i, false);
        abhi.g(parcel, e);
    }
}
