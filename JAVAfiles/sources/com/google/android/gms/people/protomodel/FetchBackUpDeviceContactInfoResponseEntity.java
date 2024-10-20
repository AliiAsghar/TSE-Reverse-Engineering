package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfy;
import defpackage.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FetchBackUpDeviceContactInfoResponseEntity extends AbstractSafeParcelable implements FetchBackUpDeviceContactInfoResponse {
    public static final Parcelable.Creator<FetchBackUpDeviceContactInfoResponseEntity> CREATOR = new acfy(11);
    private final List a;
    private List b;

    public FetchBackUpDeviceContactInfoResponseEntity(List list) {
        this.a = list;
    }

    @Override // com.google.android.gms.people.protomodel.FetchBackUpDeviceContactInfoResponse
    public final List a() {
        List list;
        if (this.b == null && (list = this.a) != null) {
            this.b = new ArrayList(list.size());
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                this.b.add((BackedUpContactsPerDevice) it.next());
            }
        }
        return this.b;
    }

    @Override // defpackage.abtr
    public final /* bridge */ /* synthetic */ Object d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FetchBackUpDeviceContactInfoResponse)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return d.B(a(), ((FetchBackUpDeviceContactInfoResponse) obj).a());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.r(parcel, 2, a(), false);
        abhi.g(parcel, e);
    }
}
