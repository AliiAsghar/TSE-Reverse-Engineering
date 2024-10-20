package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.ablq;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInCredential> CREATOR = new ablq(13);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public final String f;
    public final String g;
    public final String h;
    public final PublicKeyCredential i;

    public SignInCredential(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, PublicKeyCredential publicKeyCredential) {
        abhg.m(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = publicKeyCredential;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        if (!d.B(this.a, signInCredential.a) || !d.B(this.b, signInCredential.b) || !d.B(this.c, signInCredential.c) || !d.B(this.d, signInCredential.d) || !d.B(this.e, signInCredential.e) || !d.B(this.f, signInCredential.f) || !d.B(this.g, signInCredential.g) || !d.B(this.h, signInCredential.h) || !d.B(this.i, signInCredential.i)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.q(parcel, 3, this.c, false);
        abhi.q(parcel, 4, this.d, false);
        abhi.o(parcel, 5, this.e, i, false);
        abhi.q(parcel, 6, this.f, false);
        abhi.q(parcel, 7, this.g, false);
        abhi.q(parcel, 8, this.h, false);
        abhi.o(parcel, 9, this.i, i, false);
        abhi.g(parcel, e);
    }
}
