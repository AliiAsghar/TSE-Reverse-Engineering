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
public class PhoneEntity extends AbstractSafeParcelable implements Phone {
    public static final Parcelable.Creator<PhoneEntity> CREATOR = new acfy(15);
    public final PersonFieldMetadataEntity a;
    public final String b;
    public final String c;

    public PhoneEntity(PersonFieldMetadataEntity personFieldMetadataEntity, String str, String str2) {
        this.a = personFieldMetadataEntity;
        this.b = str;
        this.c = str2;
    }

    @Override // com.google.android.gms.people.protomodel.Phone
    public final PersonFieldMetadata a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.Phone
    public final String b() {
        return this.c;
    }

    @Override // com.google.android.gms.people.protomodel.Phone
    public final String c() {
        return this.b;
    }

    @Override // defpackage.abtr
    public final /* bridge */ /* synthetic */ Object d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Phone)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Phone phone = (Phone) obj;
        if (!d.B(a(), phone.a()) || !d.B(c(), phone.c()) || !d.B(b(), phone.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), c(), b()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PersonFieldMetadataEntity personFieldMetadataEntity = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 2, personFieldMetadataEntity, i, false);
        abhi.q(parcel, 3, this.b, false);
        abhi.q(parcel, 4, this.c, false);
        abhi.g(parcel, e);
    }
}
