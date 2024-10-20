package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.aced;
import defpackage.brg;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PolygonOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolygonOptions> CREATOR = new aced(17);
    public final List a;
    public final List b;
    public final float c;
    public final int d;
    public final int e;
    public final float f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final List k;

    public PolygonOptions(List list, List list2, float f, int i, int i2, float f2, boolean z, boolean z2, boolean z3, int i3, List list3) {
        this.a = list;
        this.b = list2;
        this.c = f;
        this.d = i;
        this.e = i2;
        this.f = f2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = i3;
        this.k = list3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int e = abhi.e(parcel);
        abhi.r(parcel, 2, list, false);
        int f = abhi.f(parcel, 3);
        parcel.writeList(this.b);
        abhi.g(parcel, f);
        abhi.l(parcel, 4, this.c);
        abhi.m(parcel, 5, this.d);
        abhi.m(parcel, 6, this.e);
        abhi.l(parcel, 7, this.f);
        abhi.h(parcel, 8, this.g);
        abhi.h(parcel, 9, this.h);
        abhi.h(parcel, 10, this.i);
        abhi.m(parcel, 11, this.j);
        abhi.r(parcel, 12, this.k, false);
        abhi.g(parcel, e);
    }

    public PolygonOptions() {
        this.c = 10.0f;
        this.d = -16777216;
        this.e = 0;
        this.f = brg.a;
        this.g = true;
        this.h = false;
        this.i = false;
        this.j = 0;
        this.k = null;
        this.a = new ArrayList();
        this.b = new ArrayList();
    }
}
