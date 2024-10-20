package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.achi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AnnotateCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AnnotateCall$Request> CREATOR = new achi(12);
    public final String a;
    public final String b;
    public final int[] c;
    public final Bundle d;

    public AnnotateCall$Request(String str, String str2, int[] iArr, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = iArr;
        this.d = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.y(parcel, 3, this.c);
        abhi.t(parcel, 4, this.d);
        abhi.g(parcel, e);
    }
}
