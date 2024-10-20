package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abzb;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CableAuthenticationExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CableAuthenticationExtension> CREATOR = new abzb(5);
    public final List a;

    public CableAuthenticationExtension(List list) {
        abhg.m(list);
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CableAuthenticationExtension)) {
            return false;
        }
        CableAuthenticationExtension cableAuthenticationExtension = (CableAuthenticationExtension) obj;
        if (!this.a.containsAll(cableAuthenticationExtension.a) || !cableAuthenticationExtension.a.containsAll(this.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int e = abhi.e(parcel);
        abhi.r(parcel, 1, list, false);
        abhi.g(parcel, e);
    }
}
