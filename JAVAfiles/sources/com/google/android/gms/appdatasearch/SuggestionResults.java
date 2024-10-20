package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abjj;
import defpackage.alxm;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SuggestionResults extends AbstractSafeParcelable implements Iterable<abhg> {
    public static final Parcelable.Creator<SuggestionResults> CREATOR = new abjj(13);
    final String a;
    public final String[] b;
    final String[] c;

    public SuggestionResults(String str, String[] strArr, String[] strArr2) {
        this.a = str;
        this.b = strArr;
        this.c = strArr2;
    }

    @Override // java.lang.Iterable
    public final Iterator<abhg> iterator() {
        if (this.a != null) {
            return null;
        }
        return new alxm(this, 1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.F(parcel, 2, this.b);
        abhi.F(parcel, 3, this.c);
        abhi.g(parcel, e);
    }
}
