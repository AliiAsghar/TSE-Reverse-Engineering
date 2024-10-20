package com.google.android.gms.asterism;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abko;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SetAsterismConsentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetAsterismConsentRequest> CREATOR = new abko();
    public final int a;
    public final int b;
    public final int c;
    public final int[] d;
    public final Long e;
    public final int f;
    public final Bundle g;
    public final int h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final int q;
    public final int r;
    public final int s;

    public SetAsterismConsentRequest(int i, int i2, int i3, int[] iArr, Long l, int i4, Bundle bundle, int i5, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i6, int i7, int i8) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = iArr;
        this.e = l;
        this.f = i4;
        this.g = bundle;
        this.h = i5;
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = str4;
        this.m = str5;
        this.n = str6;
        this.o = str7;
        this.p = str8;
        this.q = i6;
        this.r = i7;
        this.s = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, i2);
        abhi.m(parcel, 2, this.b);
        abhi.m(parcel, 3, this.c);
        abhi.y(parcel, 4, this.d);
        abhi.D(parcel, 5, this.e);
        abhi.m(parcel, 6, this.f);
        abhi.t(parcel, 7, this.g);
        abhi.m(parcel, 8, this.h);
        abhi.q(parcel, 9, this.i, false);
        abhi.q(parcel, 10, this.j, false);
        abhi.q(parcel, 11, this.k, false);
        abhi.q(parcel, 12, this.l, false);
        abhi.q(parcel, 13, this.m, false);
        abhi.q(parcel, 14, this.n, false);
        abhi.q(parcel, 15, this.o, false);
        abhi.q(parcel, 16, this.p, false);
        abhi.m(parcel, 17, this.q);
        abhi.m(parcel, 18, this.r);
        abhi.m(parcel, 19, this.s);
        abhi.g(parcel, e);
    }
}
