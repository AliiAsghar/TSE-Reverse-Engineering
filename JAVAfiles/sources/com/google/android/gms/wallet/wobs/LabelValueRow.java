package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acjs;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LabelValueRow extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LabelValueRow> CREATOR = new acjs(16);

    @Deprecated
    String a;

    @Deprecated
    String b;
    final ArrayList c;

    public LabelValueRow(String str, String str2, ArrayList arrayList) {
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

    LabelValueRow() {
        this.c = new ArrayList();
    }
}
