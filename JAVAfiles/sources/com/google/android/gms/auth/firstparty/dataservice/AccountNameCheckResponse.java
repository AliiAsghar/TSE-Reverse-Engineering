package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.ablu;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccountNameCheckResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountNameCheckResponse> CREATOR = new ablu(7);
    final String a;
    final List b;
    final String c;
    final CaptchaChallenge d;

    public AccountNameCheckResponse(String str, List list, String str2, CaptchaChallenge captchaChallenge) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = captchaChallenge;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 2, str, false);
        abhi.G(parcel, 3, this.b);
        abhi.q(parcel, 4, this.c, false);
        abhi.o(parcel, 5, this.d, i, false);
        abhi.g(parcel, e);
    }
}
