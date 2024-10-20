package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.ablq;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class SavePasswordRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new ablq(11);
    public final SignInPassword a;
    public final String b;
    public final int c;

    public SavePasswordRequest(SignInPassword signInPassword, String str, int i) {
        abhg.m(signInPassword);
        this.a = signInPassword;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        if (!d.B(this.a, savePasswordRequest.a) || !d.B(this.b, savePasswordRequest.b) || this.c != savePasswordRequest.c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SignInPassword signInPassword = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, signInPassword, i, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.m(parcel, 3, this.c);
        abhi.g(parcel, e);
    }
}
