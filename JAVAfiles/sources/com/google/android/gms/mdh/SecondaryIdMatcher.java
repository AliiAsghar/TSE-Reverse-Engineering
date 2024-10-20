package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.acfd;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SecondaryIdMatcher extends AbstractSafeParcelable {
    public final byte[] a;
    public final int b;
    private static final Charset c = Charset.forName("UTF-8");
    public static final Parcelable.Creator<SecondaryIdMatcher> CREATOR = new acfd(20);

    public SecondaryIdMatcher(byte[] bArr, int i) {
        abhg.m(bArr);
        this.a = bArr;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SecondaryIdMatcher secondaryIdMatcher = (SecondaryIdMatcher) obj;
            if (this.b == secondaryIdMatcher.b && Arrays.equals(this.a, secondaryIdMatcher.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + this.b;
    }

    public final String toString() {
        String str;
        int i = this.b;
        if (i != 1) {
            if (i != 2) {
                str = "__unknown__";
            } else {
                str = "MATCHING_TYPE_PREFIX";
            }
        } else {
            str = "MATCHING_TYPE_EXACT";
        }
        return str + ": " + new String(this.a, c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int e = abhi.e(parcel);
        abhi.j(parcel, 1, bArr, false);
        abhi.m(parcel, 2, this.b);
        abhi.g(parcel, e);
    }
}
