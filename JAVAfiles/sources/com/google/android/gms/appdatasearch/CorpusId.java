package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abjg;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CorpusId extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CorpusId> CREATOR = new abjg(2);
    public final String a;
    public final String b;
    final Bundle c;

    public CorpusId(String str, String str2, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CorpusId) {
            CorpusId corpusId = (CorpusId) obj;
            if (d.B(this.a, corpusId.a) && d.B(this.b, corpusId.b) && d.B(this.c, corpusId.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        String str;
        Bundle bundle = this.c;
        if (bundle != null) {
            str = bundle.toString();
        } else {
            str = "null";
        }
        String str2 = this.b;
        return "CorpusId[package=" + this.a + ", corpus=" + str2 + ", userHandle=" + str + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.t(parcel, 3, this.c);
        abhi.g(parcel, e);
    }
}
