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
public class PersonFieldMetadataEntity extends AbstractSafeParcelable implements PersonFieldMetadata {
    public static final Parcelable.Creator<PersonFieldMetadataEntity> CREATOR = new acfy(14);
    public final Integer a;
    public final Boolean b;

    public PersonFieldMetadataEntity(Integer num, Boolean bool) {
        this.a = num;
        this.b = bool;
    }

    @Override // com.google.android.gms.people.protomodel.PersonFieldMetadata
    public final Boolean a() {
        return this.b;
    }

    @Override // com.google.android.gms.people.protomodel.PersonFieldMetadata
    public final Integer b() {
        return this.a;
    }

    @Override // defpackage.abtr
    public final /* bridge */ /* synthetic */ Object d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PersonFieldMetadata)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        PersonFieldMetadata personFieldMetadata = (PersonFieldMetadata) obj;
        if (!d.B(b(), personFieldMetadata.b()) || !d.B(a(), personFieldMetadata.a())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.a;
        int e = abhi.e(parcel);
        abhi.A(parcel, 3, num);
        abhi.s(parcel, 4, this.b);
        abhi.g(parcel, e);
    }
}
