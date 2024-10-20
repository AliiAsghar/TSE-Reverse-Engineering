package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acju;
import defpackage.albo;
import defpackage.algv;
import j$.util.Objects;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConnectionDelayFilters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionDelayFilters> CREATOR = new acju(6);
    public final List a;

    public ConnectionDelayFilters(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionDelayFilters)) {
            return false;
        }
        return Objects.equals(this.a, ((ConnectionDelayFilters) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("dataItemFilters", this.a);
        return aj.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int e = abhi.e(parcel);
        abhi.r(parcel, 1, list, false);
        abhi.g(parcel, e);
    }
}
