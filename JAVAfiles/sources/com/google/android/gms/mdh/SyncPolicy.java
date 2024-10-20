package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfe;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SyncPolicy extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SyncPolicy> CREATOR = new acfe(1);
    public final int a;
    public final SyncSubPolicy b;
    public final SyncSubPolicy c;
    public final SyncSubPolicy d;
    public final SyncSubPolicy e;
    public final Integer f;
    public final boolean g;
    public final boolean h;

    public SyncPolicy(int i, SyncSubPolicy syncSubPolicy, SyncSubPolicy syncSubPolicy2, SyncSubPolicy syncSubPolicy3, SyncSubPolicy syncSubPolicy4, Integer num, boolean z, boolean z2) {
        this.a = i;
        this.b = syncSubPolicy;
        this.c = syncSubPolicy2;
        this.d = syncSubPolicy3;
        this.e = syncSubPolicy4;
        this.f = num;
        this.g = z;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncPolicy)) {
            return false;
        }
        SyncPolicy syncPolicy = (SyncPolicy) obj;
        if (this.a != syncPolicy.a || this.g != syncPolicy.g || this.h != syncPolicy.h || !this.b.equals(syncPolicy.b) || !this.c.equals(syncPolicy.c) || !this.d.equals(syncPolicy.d) || !this.e.equals(syncPolicy.e)) {
            return false;
        }
        Integer num = this.f;
        if (num != null) {
            return num.equals(syncPolicy.f);
        }
        if (syncPolicy.f == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
        Integer num = this.f;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        return (((((hashCode * 31) + i) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.o(parcel, 2, this.b, i, false);
        abhi.o(parcel, 3, this.c, i, false);
        abhi.o(parcel, 4, this.d, i, false);
        abhi.o(parcel, 5, this.e, i, false);
        abhi.A(parcel, 6, this.f);
        abhi.h(parcel, 7, this.g);
        abhi.h(parcel, 8, this.h);
        abhi.g(parcel, e);
    }
}
