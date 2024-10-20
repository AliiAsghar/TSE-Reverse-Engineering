package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abmm;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PACLConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<PACLConfig> CREATOR = new abmm(3);
    final int a;
    final String b;
    final String c;

    public PACLConfig(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PACLConfig) {
            PACLConfig pACLConfig = (PACLConfig) obj;
            if (TextUtils.equals(this.b, pACLConfig.b) && TextUtils.equals(this.c, pACLConfig.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.q(parcel, 2, this.b, false);
        abhi.q(parcel, 3, this.c, false);
        abhi.g(parcel, e);
    }
}
