package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acju;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccountConsentRecordParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountConsentRecordParcelable> CREATOR = new acju(13);
    public final String a;
    private final boolean b;

    public AccountConsentRecordParcelable(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountConsentRecordParcelable)) {
            return false;
        }
        AccountConsentRecordParcelable accountConsentRecordParcelable = (AccountConsentRecordParcelable) obj;
        if (this.a.equals(accountConsentRecordParcelable.a) && this.b == accountConsentRecordParcelable.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        boolean z = this.b;
        Boolean.valueOf(z).getClass();
        abhi.h(parcel, 2, z);
        abhi.g(parcel, e);
    }
}
