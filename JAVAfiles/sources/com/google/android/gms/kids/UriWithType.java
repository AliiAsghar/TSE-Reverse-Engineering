package com.google.android.gms.kids;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acbp;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class UriWithType extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UriWithType> CREATOR = new acbp(7);
    public Uri a;
    public int b;
    public String c;

    public UriWithType() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UriWithType) {
            UriWithType uriWithType = (UriWithType) obj;
            if (d.B(this.a, uriWithType.a) && d.B(Integer.valueOf(this.b), Integer.valueOf(uriWithType.b)) && d.B(this.c, uriWithType.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, this.a, i, false);
        abhi.m(parcel, 2, this.b);
        abhi.q(parcel, 3, this.c, false);
        abhi.g(parcel, e);
    }

    public UriWithType(Uri uri, int i, String str) {
        this.a = uri;
        this.b = i;
        this.c = str;
    }
}
