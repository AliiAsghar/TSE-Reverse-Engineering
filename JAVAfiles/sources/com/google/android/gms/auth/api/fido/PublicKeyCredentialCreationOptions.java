package com.google.android.gms.auth.api.fido;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
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
public class PublicKeyCredentialCreationOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new ablm(8);
    public final PublicKeyCredentialRpEntity a;
    public final PublicKeyCredentialUserEntity b;
    public final alog c;
    public final Double d;
    public final alog e;
    public final AuthenticatorSelectionCriteria f;
    public final TokenBinding g;
    public final AuthenticationExtensions h;
    private final aozb i;
    private final AttestationConveyancePreference j;

    public PublicKeyCredentialCreationOptions(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, aozb aozbVar, List list, Double d, List list2, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, TokenBinding tokenBinding, AttestationConveyancePreference attestationConveyancePreference, AuthenticationExtensions authenticationExtensions) {
        alog n;
        d.aC(publicKeyCredentialRpEntity, "relying party entity shouldn't be null");
        this.a = publicKeyCredentialRpEntity;
        d.aC(publicKeyCredentialUserEntity, "user entity shouldn't be null");
        this.b = publicKeyCredentialUserEntity;
        this.i = aozbVar;
        d.aC(list, "parameters shouldn't be null");
        this.c = alog.n(list);
        this.d = d;
        if (list2 == null) {
            n = null;
        } else {
            n = alog.n(list2);
        }
        this.e = n;
        this.f = authenticatorSelectionCriteria;
        this.g = tokenBinding;
        this.j = attestationConveyancePreference;
        this.h = authenticationExtensions;
    }

    public final String a() {
        AttestationConveyancePreference attestationConveyancePreference = this.j;
        if (attestationConveyancePreference == null) {
            return null;
        }
        return attestationConveyancePreference.d;
    }

    public final boolean equals(Object obj) {
        alog alogVar;
        alog alogVar2;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        if (!d.B(this.a, publicKeyCredentialCreationOptions.a) || !d.B(this.b, publicKeyCredentialCreationOptions.b) || !d.B(this.i, publicKeyCredentialCreationOptions.i) || !d.B(this.d, publicKeyCredentialCreationOptions.d) || !this.c.containsAll(publicKeyCredentialCreationOptions.c) || !publicKeyCredentialCreationOptions.c.containsAll(this.c) || ((((alogVar = this.e) != null || publicKeyCredentialCreationOptions.e != null) && (alogVar == null || (alogVar2 = publicKeyCredentialCreationOptions.e) == null || !alogVar.containsAll(alogVar2) || !publicKeyCredentialCreationOptions.e.containsAll(this.e))) || !d.B(this.f, publicKeyCredentialCreationOptions.f) || !d.B(this.g, publicKeyCredentialCreationOptions.g) || !d.B(this.j, publicKeyCredentialCreationOptions.j) || !d.B(this.h, publicKeyCredentialCreationOptions.h))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.i, this.c, this.d, this.e, this.f, this.g, this.j, this.h});
    }

    public final String toString() {
        return String.format(Locale.US, "PublicKeyCredentialCreationOptions: {\nrp: %s\nuser: %s\nchallenge: %s\ntimeoutSeconds: %s\nparameters: %s\nexcludeList: %s\nauthenticatorSelection: %s\ntokenBinding: %s\nattestationConveyancePreference: %s\nauthenticationExtensions :%s}", this.a, this.b, abhn.g(this.i.H()), this.d, this.c, this.e, this.f, this.g, a(), this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 2, publicKeyCredentialRpEntity, i, false);
        abhi.o(parcel, 3, this.b, i, false);
        abhi.j(parcel, 4, this.i.H(), false);
        abhi.r(parcel, 5, this.c, false);
        abhi.v(parcel, 6, this.d);
        abhi.r(parcel, 7, this.e, false);
        abhi.o(parcel, 8, this.f, i, false);
        abhi.o(parcel, 9, this.g, i, false);
        abhi.q(parcel, 10, a(), false);
        abhi.o(parcel, 11, this.h, i, false);
        abhi.g(parcel, e);
    }
}
