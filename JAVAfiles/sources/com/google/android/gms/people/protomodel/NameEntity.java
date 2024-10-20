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
public class NameEntity extends AbstractSafeParcelable implements Name {
    public static final Parcelable.Creator<NameEntity> CREATOR = new acfy(12);
    public final PersonFieldMetadataEntity a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public NameEntity(PersonFieldMetadataEntity personFieldMetadataEntity, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = personFieldMetadataEntity;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final PersonFieldMetadata a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String c() {
        return this.e;
    }

    @Override // defpackage.abtr
    public final /* bridge */ /* synthetic */ Object d() {
        throw null;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Name)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Name name = (Name) obj;
        if (!d.B(a(), name.a()) || !d.B(b(), name.b()) || !d.B(h(), name.h()) || !d.B(f(), name.f()) || !d.B(c(), name.c()) || !d.B(g(), name.g()) || !d.B(e(), name.e())) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String f() {
        return this.d;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String g() {
        return this.f;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String h() {
        return this.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b(), h(), f(), c(), g(), e()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PersonFieldMetadataEntity personFieldMetadataEntity = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 2, personFieldMetadataEntity, i, false);
        abhi.q(parcel, 3, this.b, false);
        abhi.q(parcel, 4, this.g, false);
        abhi.q(parcel, 5, this.d, false);
        abhi.q(parcel, 6, this.e, false);
        abhi.q(parcel, 7, this.f, false);
        abhi.q(parcel, 17, this.c, false);
        abhi.g(parcel, e);
    }
}
