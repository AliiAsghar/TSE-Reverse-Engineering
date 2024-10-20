package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfp;
import defpackage.albo;
import defpackage.algv;
import defpackage.alpt;
import defpackage.d;
import java.util.Arrays;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ImportSimContactsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ImportSimContactsRequest> CREATOR = new acfp(14);
    public final AccountWithDataSet a;
    private final Set b;

    public ImportSimContactsRequest(Set set, AccountWithDataSet accountWithDataSet) {
        this.b = alpt.o(set);
        this.a = accountWithDataSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImportSimContactsRequest)) {
            return false;
        }
        ImportSimContactsRequest importSimContactsRequest = (ImportSimContactsRequest) obj;
        if (d.B(this.b, importSimContactsRequest.b) && d.B(this.a, importSimContactsRequest.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("subscriptionIds", this.b);
        aj.b("destinationAccount", this.a);
        return aj.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.b;
        int e = abhi.e(parcel);
        abhi.y(parcel, 1, albo.cy(set));
        abhi.o(parcel, 2, this.a, i, false);
        abhi.g(parcel, e);
    }
}
