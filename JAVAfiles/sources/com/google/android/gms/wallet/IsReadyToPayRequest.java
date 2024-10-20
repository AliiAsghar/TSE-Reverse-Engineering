package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.aciz;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class IsReadyToPayRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<IsReadyToPayRequest> CREATOR = new aciz(17);
    ArrayList a;
    String b;
    String c;
    ArrayList d;
    boolean e;
    String f;

    IsReadyToPayRequest() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.z(parcel, 2, this.a);
        abhi.q(parcel, 4, this.b, false);
        abhi.q(parcel, 5, this.c, false);
        abhi.z(parcel, 6, this.d);
        abhi.h(parcel, 7, this.e);
        abhi.q(parcel, 8, this.f, false);
        abhi.g(parcel, e);
    }

    public IsReadyToPayRequest(ArrayList arrayList, String str, String str2, ArrayList arrayList2, boolean z, String str3) {
        this.a = arrayList;
        this.b = str;
        this.c = str2;
        this.d = arrayList2;
        this.e = z;
        this.f = str3;
    }
}
