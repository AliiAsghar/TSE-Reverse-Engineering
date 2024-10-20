package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ablq;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MatchPasswordResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MatchPasswordResult> CREATOR = new ablq(5);
    public final List a;
    public final boolean b;

    public MatchPasswordResult(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int e = abhi.e(parcel);
        abhi.r(parcel, 1, list, false);
        abhi.h(parcel, 2, this.b);
        abhi.g(parcel, e);
    }
}
