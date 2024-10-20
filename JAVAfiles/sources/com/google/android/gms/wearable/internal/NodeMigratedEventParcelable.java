package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acll;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NodeMigratedEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<NodeMigratedEventParcelable> CREATOR = new acll(3);
    public final String a;
    public final DataHolder b;

    public NodeMigratedEventParcelable(String str, DataHolder dataHolder) {
        this.a = str;
        this.b = dataHolder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.o(parcel, 2, this.b, i, false);
        abhi.g(parcel, e);
    }
}
