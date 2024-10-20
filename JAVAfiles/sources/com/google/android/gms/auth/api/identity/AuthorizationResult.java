package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.ablm;
import defpackage.d;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AuthorizationResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthorizationResult> CREATOR = new ablm(14);
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final GoogleSignInAccount e;
    public final PendingIntent f;

    public AuthorizationResult(String str, String str2, String str3, List list, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        abhg.m(list);
        this.d = list;
        this.f = pendingIntent;
        this.e = googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationResult)) {
            return false;
        }
        AuthorizationResult authorizationResult = (AuthorizationResult) obj;
        if (!d.B(this.a, authorizationResult.a) || !d.B(this.b, authorizationResult.b) || !d.B(this.c, authorizationResult.c) || !d.B(this.d, authorizationResult.d) || !d.B(this.f, authorizationResult.f) || !d.B(this.e, authorizationResult.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.f, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.q(parcel, 3, this.c, false);
        abhi.G(parcel, 4, this.d);
        abhi.o(parcel, 5, this.e, i, false);
        abhi.o(parcel, 6, this.f, i, false);
        abhi.g(parcel, e);
    }
}
