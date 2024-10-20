package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.aciz;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class Cart extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Cart> CREATOR = new aciz(10);
    String a;
    String b;
    final ArrayList c;

    public Cart(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 2, this.a, false);
        abhi.q(parcel, 3, this.b, false);
        abhi.r(parcel, 4, this.c, false);
        abhi.g(parcel, e);
    }

    Cart() {
        this.c = new ArrayList();
    }
}
