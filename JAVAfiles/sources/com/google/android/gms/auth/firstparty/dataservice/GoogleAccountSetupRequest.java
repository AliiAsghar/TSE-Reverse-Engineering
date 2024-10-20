package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abmh;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GoogleAccountSetupRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleAccountSetupRequest> CREATOR = new abmh();
    final int a;
    final Bundle b;
    boolean c;
    boolean d;
    boolean e;
    String f;
    String g;
    String h;
    String i;
    boolean j;
    boolean k;
    boolean l;
    String m;
    AppDescription n;
    AccountCredentials o;
    CaptchaSolution p;
    String q;
    String r;

    public GoogleAccountSetupRequest(int i, Bundle bundle, boolean z, boolean z2, boolean z3, String str, String str2, String str3, String str4, boolean z4, boolean z5, boolean z6, String str5, AppDescription appDescription, AccountCredentials accountCredentials, CaptchaSolution captchaSolution, String str6, String str7) {
        this.a = i;
        this.b = bundle;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = str5;
        this.n = appDescription;
        this.o = accountCredentials;
        this.p = captchaSolution;
        this.q = str6;
        this.r = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.t(parcel, 2, this.b);
        abhi.h(parcel, 3, this.c);
        abhi.h(parcel, 4, this.d);
        abhi.h(parcel, 5, this.e);
        abhi.q(parcel, 6, this.f, false);
        abhi.q(parcel, 7, this.g, false);
        abhi.q(parcel, 8, this.h, false);
        abhi.q(parcel, 9, this.i, false);
        abhi.h(parcel, 10, this.j);
        abhi.h(parcel, 11, this.k);
        abhi.h(parcel, 12, this.l);
        abhi.q(parcel, 13, this.m, false);
        abhi.o(parcel, 14, this.n, i, false);
        abhi.o(parcel, 15, this.o, i, false);
        abhi.o(parcel, 16, this.p, i, false);
        abhi.q(parcel, 17, this.q, false);
        abhi.q(parcel, 18, this.r, false);
        abhi.g(parcel, e);
    }

    public GoogleAccountSetupRequest() {
        this.a = 1;
        this.b = new Bundle();
    }
}
