package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abzb;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GoogleSessionIdExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSessionIdExtension> CREATOR = new abzb(10);
    public final long a;

    public GoogleSessionIdExtension(long j) {
        Long.valueOf(j).getClass();
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GoogleSessionIdExtension) || this.a != ((GoogleSessionIdExtension) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int e = abhi.e(parcel);
        abhi.n(parcel, 1, j);
        abhi.g(parcel, e);
    }
}
