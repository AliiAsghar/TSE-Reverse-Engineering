package com.google.android.gms.auth.frp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abmm;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FrpSnapshot extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FrpSnapshot> CREATOR = new abmm(9);
    final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    @Deprecated
    public final PersistentDeviceOwnerState e = null;

    @Deprecated
    public final boolean f = false;

    public FrpSnapshot(int i, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrpSnapshot)) {
            return false;
        }
        FrpSnapshot frpSnapshot = (FrpSnapshot) obj;
        if (this.a == frpSnapshot.a && this.b == frpSnapshot.b && this.c == frpSnapshot.c && this.d == frpSnapshot.d) {
            boolean z = frpSnapshot.f;
            PersistentDeviceOwnerState persistentDeviceOwnerState = frpSnapshot.e;
            if (Objects.equals(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), null, false);
    }

    public final String toString() {
        return String.format("FrpSnapshot[supported=%b,required=%b,ls=%b]", Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.h(parcel, 2, this.b);
        abhi.h(parcel, 3, this.c);
        abhi.h(parcel, 4, this.d);
        abhi.o(parcel, 5, null, i, false);
        abhi.h(parcel, 6, false);
        abhi.g(parcel, e);
    }
}
