package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfd;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdhFootprint extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MdhFootprint> CREATOR = new acfd(18);
    public final byte[] a;
    public final byte[] b;
    public final long c;

    public MdhFootprint(byte[] bArr, byte[] bArr2, long j) {
        this.a = bArr;
        this.c = j;
        this.b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdhFootprint)) {
            return false;
        }
        MdhFootprint mdhFootprint = (MdhFootprint) obj;
        if (this.c == mdhFootprint.c && Arrays.equals(this.a, mdhFootprint.a) && Arrays.equals(this.b, mdhFootprint.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = this.a;
        if (bArr.length >= 64) {
            bArr = Arrays.copyOf(bArr, 64);
        }
        return Arrays.hashCode(new Object[]{Arrays.toString(bArr), Arrays.toString(this.b), Long.valueOf(this.c)});
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "MdhFootprint{sizeOf(data)=%d, secondaryId=%s, serverEventIdTimestamp=%d}", Integer.valueOf(this.a.length), Arrays.toString(this.b), Long.valueOf(this.c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int e = abhi.e(parcel);
        abhi.j(parcel, 1, bArr, false);
        abhi.j(parcel, 2, this.b, false);
        abhi.n(parcel, 3, this.c);
        abhi.g(parcel, e);
    }
}
