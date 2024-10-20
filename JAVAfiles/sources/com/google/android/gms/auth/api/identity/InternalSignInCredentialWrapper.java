package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.ablq;
import defpackage.albo;
import defpackage.algv;
import defpackage.alog;
import defpackage.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class InternalSignInCredentialWrapper extends AbstractSafeParcelable implements Comparable<InternalSignInCredentialWrapper> {
    public static final Parcelable.Creator<InternalSignInCredentialWrapper> CREATOR = new ablq(4);
    public final Account a;
    public final SignInCredential b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final boolean f;
    public final long g;
    public final String h;
    private final List i;

    static {
        new Scope("profile");
        new Scope("email");
        new Scope("openid");
        new Scope("https://www.googleapis.com/auth/userinfo.profile");
        new Scope("https://www.googleapis.com/auth/userinfo.email");
    }

    public InternalSignInCredentialWrapper(Account account, SignInCredential signInCredential, List list, boolean z, boolean z2, long j, boolean z3, long j2, String str) {
        this.a = account;
        abhg.m(signInCredential);
        this.b = signInCredential;
        if (!TextUtils.isEmpty(signInCredential.f)) {
            d.t(list.isEmpty(), "Password credentials should have empty granted-scopes list");
            d.t(!z, "Converted credentials should not contain the original password");
        }
        abhg.m(list);
        this.i = alog.n(list);
        this.c = z;
        this.d = z2;
        this.e = j;
        this.f = z3;
        this.g = j2;
        this.h = str;
    }

    private final int a() {
        int i;
        if (this.d) {
            i = 100000;
        } else if (this.b.f == null) {
            i = 1000;
        } else if (this.a != null) {
            i = 100;
        } else {
            i = 0;
        }
        SignInCredential signInCredential = this.b;
        int i2 = 1;
        if (true != TextUtils.isEmpty(signInCredential.b)) {
            i2 = 2;
        }
        if (!TextUtils.isEmpty(signInCredential.c)) {
            i2++;
        }
        if (!TextUtils.isEmpty(signInCredential.d)) {
            i2++;
        }
        Uri uri = signInCredential.e;
        if (uri != null && !Uri.EMPTY.equals(uri)) {
            i2++;
        }
        return i + i2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(InternalSignInCredentialWrapper internalSignInCredentialWrapper) {
        InternalSignInCredentialWrapper internalSignInCredentialWrapper2 = internalSignInCredentialWrapper;
        int a = a();
        int a2 = internalSignInCredentialWrapper2.a();
        if (a == a2) {
            return Long.compare(this.g, internalSignInCredentialWrapper2.g);
        }
        return Integer.compare(a, a2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InternalSignInCredentialWrapper)) {
            return false;
        }
        InternalSignInCredentialWrapper internalSignInCredentialWrapper = (InternalSignInCredentialWrapper) obj;
        if (!d.B(this.a, internalSignInCredentialWrapper.a) || !d.B(this.b, internalSignInCredentialWrapper.b) || !d.B(this.i, internalSignInCredentialWrapper.i) || this.c != internalSignInCredentialWrapper.c || this.d != internalSignInCredentialWrapper.d || this.e != internalSignInCredentialWrapper.e || this.f != internalSignInCredentialWrapper.f || this.g != internalSignInCredentialWrapper.g || !d.B(this.h, internalSignInCredentialWrapper.h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.i, Boolean.valueOf(this.c), Boolean.valueOf(this.d), Long.valueOf(this.e), Boolean.valueOf(this.f), Long.valueOf(this.g), this.h});
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("owningAccount", this.a);
        aj.b("signInCredential", this.b);
        aj.b("grantedScopes", this.i);
        aj.h("representsConvertedCredential", this.c);
        aj.h("representsLinkedThirdPartyAccount", this.d);
        aj.g("linkingTimeInMillis", this.e);
        aj.h("autoSelectSupportedByAppAndAccount", this.f);
        aj.g("lastUsedTimeMillis", this.g);
        aj.b("originalAffiliation", this.h);
        return aj.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, account, i, false);
        abhi.o(parcel, 2, this.b, i, false);
        abhi.r(parcel, 3, new ArrayList(this.i), false);
        abhi.h(parcel, 4, this.c);
        abhi.h(parcel, 5, this.d);
        abhi.n(parcel, 6, this.e);
        abhi.h(parcel, 7, this.f);
        abhi.n(parcel, 8, this.g);
        abhi.q(parcel, 9, this.h, false);
        abhi.g(parcel, e);
    }
}
