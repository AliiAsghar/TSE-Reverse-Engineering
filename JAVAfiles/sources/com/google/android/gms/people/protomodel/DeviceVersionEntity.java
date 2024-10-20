package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfy;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DeviceVersionEntity extends AbstractSafeParcelable implements DeviceVersion {
    public static final Parcelable.Creator<DeviceVersionEntity> CREATOR = new acfy(9);
    public final Integer a;

    public DeviceVersionEntity(Integer num) {
        this.a = num;
    }

    @Override // com.google.android.gms.people.protomodel.DeviceVersion
    public final Integer a() {
        return this.a;
    }

    @Override // defpackage.abtr
    public final /* bridge */ /* synthetic */ Object d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DeviceVersion)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return d.B(a(), ((DeviceVersion) obj).a());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.a;
        int e = abhi.e(parcel);
        abhi.A(parcel, 2, num);
        abhi.g(parcel, e);
    }
}
