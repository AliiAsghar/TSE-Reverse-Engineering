package com.google.android.gms.people.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.acfy;
import defpackage.d;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AvatarReference extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AvatarReference> CREATOR = new acfy(6);
    final int a;

    @Deprecated
    final String b;
    final String c;
    final String d;
    final String e;
    final String f;
    final Long g;
    final Long h;

    public AvatarReference(int i, String str, String str2, String str3, String str4, String str5, Long l, Long l2) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        abhg.h(z);
        this.a = i;
        this.b = true == TextUtils.isEmpty(str) ? null : str;
        this.c = true == TextUtils.isEmpty(str2) ? null : str2;
        this.d = true == TextUtils.isEmpty(str3) ? null : str3;
        this.e = true == TextUtils.isEmpty(str4) ? null : str4;
        this.f = true == TextUtils.isEmpty(str5) ? null : str5;
        this.g = l;
        this.h = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AvatarReference avatarReference = (AvatarReference) obj;
            if (this.a == avatarReference.a && d.B(this.b, avatarReference.b) && d.B(this.c, avatarReference.c) && d.B(this.d, avatarReference.d) && d.B(this.e, avatarReference.e) && d.B(this.f, avatarReference.f) && d.B(this.g, avatarReference.g) && d.B(this.h, avatarReference.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.e, this.f, this.g, this.h});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        abhg.q("source", Integer.valueOf(this.a), arrayList);
        abhg.q("location", this.b, arrayList);
        abhg.q("url", this.c, arrayList);
        abhg.q("email", this.d, arrayList);
        abhg.q("account", this.e, arrayList);
        abhg.q("focusId", this.f, arrayList);
        abhg.q("contactId", this.g, arrayList);
        abhg.q("rawContactId", this.h, arrayList);
        return abhg.p(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, i2);
        abhi.q(parcel, 2, this.b, false);
        abhi.q(parcel, 3, this.c, false);
        abhi.q(parcel, 4, this.d, false);
        abhi.q(parcel, 5, this.e, false);
        abhi.q(parcel, 6, this.f, false);
        abhi.D(parcel, 7, this.g);
        abhi.D(parcel, 8, this.h);
        abhi.g(parcel, e);
    }
}
