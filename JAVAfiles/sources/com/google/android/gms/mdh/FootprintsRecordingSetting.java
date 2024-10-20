package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfd;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FootprintsRecordingSetting extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FootprintsRecordingSetting> CREATOR = new acfd(14);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final long d;

    public FootprintsRecordingSetting(int i, boolean z, boolean z2, long j) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FootprintsRecordingSetting) {
            FootprintsRecordingSetting footprintsRecordingSetting = (FootprintsRecordingSetting) obj;
            if (this.a == footprintsRecordingSetting.a && this.b == footprintsRecordingSetting.b && this.c == footprintsRecordingSetting.c && this.d == footprintsRecordingSetting.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Long.valueOf(this.d)});
    }

    public final String toString() {
        return "FootprintsRecordingSetting{corpusGroup=" + this.a + ", enabled=" + this.b + ", unset=" + this.c + ", lastModifiedTimeMicros=" + this.d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, i2);
        abhi.h(parcel, 2, this.b);
        abhi.h(parcel, 3, this.c);
        abhi.n(parcel, 4, this.d);
        abhi.g(parcel, e);
    }
}
