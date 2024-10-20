package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abzb;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GoogleSilentVerificationExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSilentVerificationExtension> CREATOR = new abzb(11);
    public final boolean a;

    public GoogleSilentVerificationExtension(boolean z) {
        Boolean.valueOf(z).getClass();
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GoogleSilentVerificationExtension) || this.a != ((GoogleSilentVerificationExtension) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int e = abhi.e(parcel);
        abhi.h(parcel, 1, z);
        abhi.g(parcel, e);
    }
}
