package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abzf;
import defpackage.abzj;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TokenBinding extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TokenBinding> CREATOR = new abzf(7);
    public final String a;
    private final TokenBindingStatus b;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public enum TokenBindingStatus implements Parcelable {
        PRESENT("present"),
        SUPPORTED("supported"),
        NOT_SUPPORTED("not-supported");

        public static final Parcelable.Creator<TokenBindingStatus> CREATOR = new abzf(6);
        public final String d;

        TokenBindingStatus(String str) {
            this.d = str;
        }

        public static TokenBindingStatus a(String str) {
            for (TokenBindingStatus tokenBindingStatus : values()) {
                if (str.equals(tokenBindingStatus.d)) {
                    return tokenBindingStatus;
                }
            }
            throw new abzj(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.d);
        }
    }

    static {
        new TokenBinding(TokenBindingStatus.SUPPORTED.d, null);
        new TokenBinding(TokenBindingStatus.NOT_SUPPORTED.d, null);
    }

    public TokenBinding(String str, String str2) {
        abhg.m(str);
        try {
            this.b = TokenBindingStatus.a(str);
            this.a = str2;
        } catch (abzj e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenBinding)) {
            return false;
        }
        TokenBinding tokenBinding = (TokenBinding) obj;
        if (!d.B(this.b, tokenBinding.b) || !d.B(this.a, tokenBinding.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b.d;
        int e = abhi.e(parcel);
        abhi.q(parcel, 2, str, false);
        abhi.q(parcel, 3, this.a, false);
        abhi.g(parcel, e);
    }
}
