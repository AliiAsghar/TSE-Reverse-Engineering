package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.aced;
import defpackage.brg;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PolylineOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PolylineOptions> CREATOR = new aced(18);
    public final List a;
    public float b;
    public int c;
    public float d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public List i;
    private Cap j;
    private Cap k;
    private List l;

    public PolylineOptions() {
        this.b = 10.0f;
        this.c = -16777216;
        this.d = brg.a;
        this.e = true;
        this.f = false;
        this.g = false;
        this.j = new ButtCap();
        this.k = new ButtCap();
        this.h = 0;
        this.i = null;
        this.l = new ArrayList();
        this.a = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int e = abhi.e(parcel);
        abhi.r(parcel, 2, list, false);
        abhi.l(parcel, 3, this.b);
        abhi.m(parcel, 4, this.c);
        abhi.l(parcel, 5, this.d);
        abhi.h(parcel, 6, this.e);
        abhi.h(parcel, 7, this.f);
        abhi.h(parcel, 8, this.g);
        abhi.o(parcel, 9, this.j.a(), i, false);
        abhi.o(parcel, 10, this.k.a(), i, false);
        abhi.m(parcel, 11, this.h);
        abhi.r(parcel, 12, this.i, false);
        ArrayList arrayList = new ArrayList(this.l.size());
        for (StyleSpan styleSpan : this.l) {
            StrokeStyle strokeStyle = styleSpan.a;
            float f = strokeStyle.a;
            Pair pair = new Pair(Integer.valueOf(strokeStyle.b), Integer.valueOf(strokeStyle.c));
            int intValue = ((Integer) pair.first).intValue();
            int intValue2 = ((Integer) pair.second).intValue();
            boolean z = strokeStyle.d;
            arrayList.add(new StyleSpan(new StrokeStyle(this.b, intValue, intValue2, this.e, strokeStyle.e), styleSpan.b));
        }
        abhi.r(parcel, 13, arrayList, false);
        abhi.g(parcel, e);
    }

    public PolylineOptions(List list, float f, int i, float f2, boolean z, boolean z2, boolean z3, Cap cap, Cap cap2, int i2, List list2, List list3) {
        this.b = 10.0f;
        this.c = -16777216;
        this.d = brg.a;
        this.e = true;
        this.f = false;
        this.g = false;
        this.j = new ButtCap();
        this.k = new ButtCap();
        this.h = 0;
        this.i = null;
        this.l = new ArrayList();
        this.a = list;
        this.b = f;
        this.c = i;
        this.d = f2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        if (cap != null) {
            this.j = cap;
        }
        if (cap2 != null) {
            this.k = cap2;
        }
        this.h = i2;
        this.i = list2;
        if (list3 != null) {
            this.l = list3;
        }
    }
}
