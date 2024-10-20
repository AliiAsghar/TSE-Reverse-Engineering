package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.aciz;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class UsageReportingOptInOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UsageReportingOptInOptions> CREATOR = new aciz(6);
    public final int a;
    public final boolean b;
    public final List c;
    public final int d;
    public final String e;
    public final boolean f;

    public UsageReportingOptInOptions(int i, boolean z, List list, int i2, String str, boolean z2) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = i;
        this.b = z;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.d = i2;
        this.e = str;
        this.f = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 2, this.a);
        abhi.h(parcel, 3, this.b);
        abhi.G(parcel, 4, this.c);
        abhi.m(parcel, 5, this.d);
        abhi.q(parcel, 6, this.e, false);
        abhi.h(parcel, 7, this.f);
        abhi.g(parcel, e);
    }
}
