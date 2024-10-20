package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import defpackage.abhi;
import defpackage.abvm;
import defpackage.acdf;
import defpackage.acdi;
import defpackage.d;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class LocationRequestInternal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationRequestInternal> CREATOR = new acdi(12);
    LocationRequest a;

    public LocationRequestInternal(LocationRequest locationRequest, List list, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        WorkSource workSource;
        acdf acdfVar = new acdf(locationRequest);
        if (list != null) {
            if (list.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ClientIdentity clientIdentity = (ClientIdentity) it.next();
                    abvm.a(workSource, clientIdentity.a, clientIdentity.b);
                }
            }
            acdfVar.c = workSource;
        }
        if (z) {
            acdfVar.c(1);
        }
        if (z2) {
            acdfVar.f(2);
        }
        if (z3) {
            acdfVar.b = true;
        }
        if (z4) {
            acdfVar.a = true;
        }
        if (j != Long.MAX_VALUE) {
            acdfVar.d(j);
        }
        this.a = acdfVar.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequestInternal) {
            return d.B(this.a, ((LocationRequestInternal) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, this.a, i, false);
        abhi.g(parcel, e);
    }
}
