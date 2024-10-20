package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abzf;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SimpleTransactionAuthorizationExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SimpleTransactionAuthorizationExtension> CREATOR = new abzf(5);
    public final String a;

    public SimpleTransactionAuthorizationExtension(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SimpleTransactionAuthorizationExtension)) {
            return false;
        }
        return d.B(this.a, ((SimpleTransactionAuthorizationExtension) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.g(parcel, e);
    }
}
