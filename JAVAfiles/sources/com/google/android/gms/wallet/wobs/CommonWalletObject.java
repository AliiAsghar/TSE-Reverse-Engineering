package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acjt;
import defpackage.ahjj;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CommonWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new acjt();
    public String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;

    @Deprecated
    String h;
    int i;
    final ArrayList j;
    TimeInterval k;
    final ArrayList l;

    @Deprecated
    String m;

    @Deprecated
    String n;
    final ArrayList o;
    boolean p;
    final ArrayList q;
    final ArrayList r;
    final ArrayList s;

    public CommonWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str9, String str10, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = i;
        this.j = arrayList;
        this.k = timeInterval;
        this.l = arrayList2;
        this.m = str9;
        this.n = str10;
        this.o = arrayList3;
        this.p = z;
        this.q = arrayList4;
        this.r = arrayList5;
        this.s = arrayList6;
    }

    public static ahjj a() {
        return new ahjj(new CommonWalletObject(), (byte[]) null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 2, this.a, false);
        abhi.q(parcel, 3, this.b, false);
        abhi.q(parcel, 4, this.c, false);
        abhi.q(parcel, 5, this.d, false);
        abhi.q(parcel, 6, this.e, false);
        abhi.q(parcel, 7, this.f, false);
        abhi.q(parcel, 8, this.g, false);
        abhi.q(parcel, 9, this.h, false);
        abhi.m(parcel, 10, this.i);
        abhi.r(parcel, 11, this.j, false);
        abhi.o(parcel, 12, this.k, i, false);
        abhi.r(parcel, 13, this.l, false);
        abhi.q(parcel, 14, this.m, false);
        abhi.q(parcel, 15, this.n, false);
        abhi.r(parcel, 16, this.o, false);
        abhi.h(parcel, 17, this.p);
        abhi.r(parcel, 18, this.q, false);
        abhi.r(parcel, 19, this.r, false);
        abhi.r(parcel, 20, this.s, false);
        abhi.g(parcel, e);
    }

    public CommonWalletObject() {
        this.j = new ArrayList();
        this.l = new ArrayList();
        this.o = new ArrayList();
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.s = new ArrayList();
    }
}
