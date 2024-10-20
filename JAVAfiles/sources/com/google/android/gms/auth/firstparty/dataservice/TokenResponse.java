package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.AuthzenBeginTxData;
import com.google.android.gms.auth.ResolutionData;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abmk;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TokenResponse extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenResponse> CREATOR = new abmk();
    AuthzenBeginTxData A;
    boolean B;
    final int a;

    @Deprecated
    String b;
    String c;

    @Deprecated
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;
    boolean j;
    boolean k;
    boolean l;
    boolean m;
    CaptchaChallenge n;
    final List o;
    String p;
    String q;
    boolean r;
    int s;
    PostSignInData t;
    Account u;
    String v;
    TokenData w;
    Bundle x;
    String y;
    ResolutionData z;

    public TokenResponse() {
        this.x = new Bundle();
        this.a = 9;
        this.o = new ArrayList();
    }

    public final void a(Account account) {
        this.u = account;
        this.b = account.name;
    }

    public final void b(TokenData tokenData) {
        if (tokenData == null) {
            tokenData = null;
            this.d = null;
        } else {
            this.d = tokenData.b;
        }
        this.w = tokenData;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.q(parcel, 2, this.b, false);
        abhi.q(parcel, 3, this.c, false);
        abhi.q(parcel, 4, this.d, false);
        abhi.q(parcel, 5, this.e, false);
        abhi.q(parcel, 6, this.f, false);
        abhi.q(parcel, 7, this.g, false);
        abhi.q(parcel, 8, this.h, false);
        abhi.q(parcel, 9, this.i, false);
        abhi.h(parcel, 10, this.j);
        abhi.h(parcel, 11, this.k);
        abhi.h(parcel, 12, this.l);
        abhi.h(parcel, 13, this.m);
        abhi.o(parcel, 14, this.n, i, false);
        abhi.r(parcel, 15, this.o, false);
        abhi.q(parcel, 16, this.p, false);
        abhi.q(parcel, 17, this.q, false);
        abhi.h(parcel, 19, this.r);
        abhi.m(parcel, 20, this.s);
        abhi.o(parcel, 21, this.t, i, false);
        abhi.o(parcel, 22, this.u, i, false);
        abhi.q(parcel, 26, this.v, false);
        abhi.o(parcel, 27, this.w, i, false);
        abhi.t(parcel, 28, this.x);
        abhi.q(parcel, 29, this.y, false);
        abhi.o(parcel, 30, this.z, i, false);
        abhi.o(parcel, 31, this.A, i, false);
        abhi.h(parcel, 32, this.B);
        abhi.g(parcel, e);
    }

    public TokenResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4, CaptchaChallenge captchaChallenge, List list, String str9, String str10, boolean z5, int i2, PostSignInData postSignInData, Account account, String str11, TokenData tokenData, Bundle bundle, String str12, ResolutionData resolutionData, AuthzenBeginTxData authzenBeginTxData, boolean z6) {
        this.x = new Bundle();
        this.a = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = captchaChallenge;
        this.o = list == null ? new ArrayList() : list;
        this.p = str9;
        this.q = str10;
        this.r = z5;
        this.s = i2;
        this.t = postSignInData;
        this.v = str11;
        this.x = bundle;
        this.y = str12;
        this.z = resolutionData;
        this.A = authzenBeginTxData;
        this.B = z6;
        if (account != null) {
            a(account);
        } else if (TextUtils.isEmpty(str)) {
            this.b = null;
            this.u = null;
        } else {
            a(new Account(str, "com.google"));
        }
        if (str3 != null && tokenData == null) {
            b(TextUtils.isEmpty(str3) ? null : new TokenData(1, str3, null, false, false, null, null));
        } else {
            b(tokenData);
        }
    }
}
