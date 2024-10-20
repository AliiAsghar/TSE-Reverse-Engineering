package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.achi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SetIncludeInGlobalSearchCall$Request extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetIncludeInGlobalSearchCall$Request> CREATOR = new achi(4);
    public String a;
    public String b;
    public boolean c;

    public SetIncludeInGlobalSearchCall$Request() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, this.a, false);
        abhi.h(parcel, 2, this.c);
        abhi.q(parcel, 3, this.b, false);
        abhi.g(parcel, e);
    }

    public SetIncludeInGlobalSearchCall$Request(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
