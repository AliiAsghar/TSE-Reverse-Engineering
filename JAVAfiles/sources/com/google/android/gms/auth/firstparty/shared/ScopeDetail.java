package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abmm;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ScopeDetail extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ScopeDetail> CREATOR = new abmm(4);
    final int a;
    final String b;
    final String c;
    final String d;
    final String e;
    final String f;
    final List g;
    public final FACLData h;

    public ScopeDetail(int i, String str, String str2, String str3, String str4, String str5, List list, FACLData fACLData) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = list;
        this.h = fACLData;
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
        abhi.G(parcel, 7, this.g);
        abhi.o(parcel, 8, this.h, i, false);
        abhi.g(parcel, e);
    }
}
