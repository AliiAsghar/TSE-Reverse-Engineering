package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.aciz;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CardRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CardRequirements> CREATOR = new aciz(9);
    ArrayList a;
    final boolean b;
    boolean c;
    int d;

    private CardRequirements() {
        this.b = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.z(parcel, 1, this.a);
        abhi.h(parcel, 2, this.b);
        abhi.h(parcel, 3, this.c);
        abhi.m(parcel, 4, this.d);
        abhi.g(parcel, e);
    }

    public CardRequirements(ArrayList arrayList, boolean z, boolean z2, int i) {
        this.a = arrayList;
        this.b = z;
        this.c = z2;
        this.d = i;
    }
}
