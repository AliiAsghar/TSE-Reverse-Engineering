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
public class PhotoEntity extends AbstractSafeParcelable implements Photo {
    public static final Parcelable.Creator<PhotoEntity> CREATOR = new acfy(16);
    public final PersonFieldMetadataEntity a;
    public final String b;

    public PhotoEntity(PersonFieldMetadataEntity personFieldMetadataEntity, String str) {
        this.a = personFieldMetadataEntity;
        this.b = str;
    }

    @Override // com.google.android.gms.people.protomodel.Photo
    public final PersonFieldMetadata a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.Photo
    public final String b() {
        return this.b;
    }

    @Override // defpackage.abtr
    public final /* bridge */ /* synthetic */ Object d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Photo)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Photo photo = (Photo) obj;
        if (!d.B(a(), photo.a()) || !d.B(b(), photo.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PersonFieldMetadataEntity personFieldMetadataEntity = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 2, personFieldMetadataEntity, i, false);
        abhi.q(parcel, 3, this.b, false);
        abhi.g(parcel, e);
    }
}
