package com.google.android.gms.auth.firstparty.delegate;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abmi;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class StartAddAccountSessionWorkflowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StartAddAccountSessionWorkflowRequest> CREATOR = new abmi(14);
    public final int a;
    public final AppDescription b;
    public final String c;
    public final AccountAuthenticatorResponse d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;
    private final List k;
    private final Bundle l;

    public StartAddAccountSessionWorkflowRequest(int i, List list, Bundle bundle, AppDescription appDescription, String str, AccountAuthenticatorResponse accountAuthenticatorResponse, boolean z, boolean z2, String str2, String str3, boolean z3, boolean z4) {
        this.a = i;
        this.k = list;
        this.l = bundle;
        abhg.m(appDescription);
        this.b = appDescription;
        this.c = str;
        this.d = accountAuthenticatorResponse;
        this.e = z;
        this.f = z2;
        this.g = str2;
        this.h = str3;
        this.i = z3;
        this.j = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List unmodifiableList;
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        List list = this.k;
        if (list == null) {
            unmodifiableList = null;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        abhi.G(parcel, 2, unmodifiableList);
        abhi.t(parcel, 3, new Bundle(this.l));
        abhi.o(parcel, 4, this.b, i, false);
        abhi.q(parcel, 5, this.c, false);
        abhi.o(parcel, 6, this.d, i, false);
        abhi.h(parcel, 7, this.e);
        abhi.h(parcel, 8, this.f);
        abhi.q(parcel, 9, this.g, false);
        abhi.q(parcel, 10, this.h, false);
        abhi.h(parcel, 11, this.i);
        abhi.h(parcel, 12, this.j);
        abhi.g(parcel, e);
    }
}
