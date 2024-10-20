package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acjp;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MaskedWalletRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWalletRequest> CREATOR = new acjp();
    String a;
    boolean b;
    boolean c;
    boolean d;
    String e;
    String f;
    String g;
    Cart h;
    boolean i;
    boolean j;
    CountrySpecification[] k;
    final boolean l;
    final boolean m;
    ArrayList n;
    PaymentMethodTokenizationParameters o;
    ArrayList p;
    String q;

    MaskedWalletRequest() {
        this.l = true;
        this.m = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 2, this.a, false);
        abhi.h(parcel, 3, this.b);
        abhi.h(parcel, 4, this.c);
        abhi.h(parcel, 5, this.d);
        abhi.q(parcel, 6, this.e, false);
        abhi.q(parcel, 7, this.f, false);
        abhi.q(parcel, 8, this.g, false);
        abhi.o(parcel, 9, this.h, i, false);
        abhi.h(parcel, 10, this.i);
        abhi.h(parcel, 11, this.j);
        abhi.H(parcel, 12, this.k, i);
        abhi.h(parcel, 13, this.l);
        abhi.h(parcel, 14, this.m);
        abhi.r(parcel, 15, this.n, false);
        abhi.o(parcel, 16, this.o, i, false);
        abhi.z(parcel, 17, this.p);
        abhi.q(parcel, 18, this.q, false);
        abhi.g(parcel, e);
    }

    public MaskedWalletRequest(String str, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, Cart cart, boolean z4, boolean z5, CountrySpecification[] countrySpecificationArr, boolean z6, boolean z7, ArrayList arrayList, PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, ArrayList arrayList2, String str5) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = cart;
        this.i = z4;
        this.j = z5;
        this.k = countrySpecificationArr;
        this.l = z6;
        this.m = z7;
        this.n = arrayList;
        this.o = paymentMethodTokenizationParameters;
        this.p = arrayList2;
        this.q = str5;
    }
}
