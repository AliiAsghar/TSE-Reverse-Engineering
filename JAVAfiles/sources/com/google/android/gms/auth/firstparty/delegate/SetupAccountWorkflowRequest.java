package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abml;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SetupAccountWorkflowRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SetupAccountWorkflowRequest> CREATOR = new abml();
    public final int a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final Bundle e;
    public final AppDescription f;
    public final boolean g;
    public final String h;
    public final AccountAuthenticatorResponse i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final ManagedAuthOptions t;
    public final String u;

    @Deprecated
    public final boolean v;
    public final int w;
    public final boolean x;

    public SetupAccountWorkflowRequest(int i, boolean z, boolean z2, List list, Bundle bundle, AppDescription appDescription, boolean z3, String str, AccountAuthenticatorResponse accountAuthenticatorResponse, boolean z4, boolean z5, String str2, String str3, String str4, String str5, boolean z6, boolean z7, boolean z8, boolean z9, ManagedAuthOptions managedAuthOptions, String str6, boolean z10, int i2, boolean z11) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = list;
        this.e = bundle;
        abhg.m(appDescription);
        this.f = appDescription;
        this.g = z3;
        this.h = str;
        this.i = accountAuthenticatorResponse;
        this.j = z4;
        this.k = z5;
        this.l = str2;
        this.m = str3;
        this.n = str4;
        this.o = str5;
        this.p = z6;
        this.q = z7;
        this.r = z8;
        this.s = z9;
        this.t = managedAuthOptions;
        this.u = str6;
        this.v = z10;
        this.w = i2;
        this.x = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.h(parcel, 2, this.b);
        abhi.h(parcel, 3, this.c);
        abhi.G(parcel, 4, this.d);
        abhi.t(parcel, 5, this.e);
        abhi.o(parcel, 6, this.f, i, false);
        abhi.h(parcel, 7, this.g);
        abhi.q(parcel, 8, this.h, false);
        abhi.o(parcel, 9, this.i, i, false);
        abhi.h(parcel, 10, this.j);
        abhi.h(parcel, 11, this.k);
        abhi.q(parcel, 12, this.l, false);
        abhi.q(parcel, 13, this.m, false);
        abhi.q(parcel, 14, this.n, false);
        abhi.q(parcel, 15, this.o, false);
        abhi.h(parcel, 16, this.p);
        abhi.h(parcel, 17, this.q);
        abhi.h(parcel, 18, this.r);
        abhi.h(parcel, 19, this.s);
        abhi.o(parcel, 20, this.t, i, false);
        abhi.q(parcel, 21, this.u, false);
        abhi.h(parcel, 22, this.v);
        abhi.m(parcel, 23, this.w);
        abhi.h(parcel, 24, this.x);
        abhi.g(parcel, e);
    }
}
