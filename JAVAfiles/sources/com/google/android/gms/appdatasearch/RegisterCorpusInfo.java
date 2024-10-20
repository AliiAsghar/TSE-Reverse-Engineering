package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abjj;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RegisterCorpusInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisterCorpusInfo> CREATOR = new abjj(3);
    public final String a;
    public final String b;
    public final Uri c;
    public final RegisterSectionInfo[] d;
    public final GlobalSearchCorpusConfig e;
    public final boolean f;
    public final Account g;
    public final RegisterCorpusIMEInfo h;
    public final String i;

    @Deprecated
    public final boolean j;
    public final int k;

    public RegisterCorpusInfo(String str, String str2, Uri uri, RegisterSectionInfo[] registerSectionInfoArr, GlobalSearchCorpusConfig globalSearchCorpusConfig, boolean z, Account account, RegisterCorpusIMEInfo registerCorpusIMEInfo, String str3, boolean z2, int i) {
        this.a = str;
        this.b = str2;
        this.c = uri;
        this.d = registerSectionInfoArr;
        this.e = globalSearchCorpusConfig;
        this.f = z;
        this.g = account;
        this.h = registerCorpusIMEInfo;
        this.i = str3;
        this.j = z2;
        this.k = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterCorpusInfo)) {
            return false;
        }
        RegisterCorpusInfo registerCorpusInfo = (RegisterCorpusInfo) obj;
        if (this.j == registerCorpusInfo.j && this.k == registerCorpusInfo.k && this.f == registerCorpusInfo.f && d.B(this.a, registerCorpusInfo.a) && d.B(this.b, registerCorpusInfo.b) && d.B(this.c, registerCorpusInfo.c) && d.B(this.e, registerCorpusInfo.e) && d.B(this.h, registerCorpusInfo.h) && d.B(this.g, registerCorpusInfo.g) && d.B(this.i, registerCorpusInfo.i) && Arrays.equals(this.d, registerCorpusInfo.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(Arrays.hashCode(this.d)), this.e, Boolean.valueOf(this.f), this.g, this.h, this.i, Boolean.valueOf(this.j), Integer.valueOf(this.k)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.o(parcel, 3, this.c, i, false);
        abhi.H(parcel, 4, this.d, i);
        abhi.o(parcel, 7, this.e, i, false);
        abhi.h(parcel, 8, this.f);
        abhi.o(parcel, 9, this.g, i, false);
        abhi.o(parcel, 10, this.h, i, false);
        abhi.q(parcel, 11, this.i, false);
        abhi.h(parcel, 12, this.j);
        abhi.m(parcel, 13, this.k);
        abhi.g(parcel, e);
    }
}
