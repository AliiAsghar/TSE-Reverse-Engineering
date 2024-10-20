package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.ablm;
import defpackage.ablq;
import defpackage.d;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new ablm(15);
    public final PasswordRequestOptions a;
    public final GoogleIdTokenRequestOptions b;
    public final String c;
    public final boolean d;
    public final int e;
    public final PasskeysRequestOptions f;
    public final PasskeyJsonRequestOptions g;
    public final boolean h;

    /* compiled from: PG */
    @Deprecated
    /* loaded from: classes2.dex */
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new ablq(3);
        public final boolean a;
        public final String b;
        public final String c;
        public final boolean d;
        public final String e;
        public final List f;
        public final boolean g;

        public GoogleIdTokenRequestOptions(boolean z, String str, String str2, boolean z2, String str3, List list, boolean z3) {
            boolean z4 = true;
            if (z2 && z3) {
                z4 = false;
            }
            d.t(z4, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.a = z;
            if (z) {
                d.aC(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.b = str;
            this.c = str2;
            this.d = z2;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.f = arrayList;
            this.e = str3;
            this.g = z3;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            if (this.a != googleIdTokenRequestOptions.a || !d.B(this.b, googleIdTokenRequestOptions.b) || !d.B(this.c, googleIdTokenRequestOptions.c) || this.d != googleIdTokenRequestOptions.d || !d.B(this.e, googleIdTokenRequestOptions.e) || !d.B(this.f, googleIdTokenRequestOptions.f) || this.g != googleIdTokenRequestOptions.g) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, this.c, Boolean.valueOf(this.d), this.e, this.f, Boolean.valueOf(this.g)});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            boolean z = this.a;
            int e = abhi.e(parcel);
            abhi.h(parcel, 1, z);
            abhi.q(parcel, 2, this.b, false);
            abhi.q(parcel, 3, this.c, false);
            abhi.h(parcel, 4, this.d);
            abhi.q(parcel, 5, this.e, false);
            abhi.G(parcel, 6, this.f);
            abhi.h(parcel, 7, this.g);
            abhi.g(parcel, e);
        }
    }

    /* compiled from: PG */
    @Deprecated
    /* loaded from: classes2.dex */
    public static final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeyJsonRequestOptions> CREATOR = new ablq(6);
        public final boolean a;
        public final String b;

        public PasskeyJsonRequestOptions(boolean z, String str) {
            if (z) {
                abhg.m(str);
            }
            this.a = z;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeyJsonRequestOptions)) {
                return false;
            }
            PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
            if (this.a == passkeyJsonRequestOptions.a && d.B(this.b, passkeyJsonRequestOptions.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            boolean z = this.a;
            int e = abhi.e(parcel);
            abhi.h(parcel, 1, z);
            abhi.q(parcel, 2, this.b, false);
            abhi.g(parcel, e);
        }
    }

    /* compiled from: PG */
    @Deprecated
    /* loaded from: classes2.dex */
    public static final class PasskeysRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new ablq(7);
        public final boolean a;
        public final byte[] b;
        public final String c;

        public PasskeysRequestOptions(boolean z, byte[] bArr, String str) {
            if (z) {
                abhg.m(bArr);
                abhg.m(str);
            }
            this.a = z;
            this.b = bArr;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeysRequestOptions)) {
                return false;
            }
            PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
            if (this.a == passkeysRequestOptions.a && Arrays.equals(this.b, passkeysRequestOptions.b) && Objects.equals(this.c, passkeysRequestOptions.c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (Objects.hash(Boolean.valueOf(this.a), this.c) * 31) + Arrays.hashCode(this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            boolean z = this.a;
            int e = abhi.e(parcel);
            abhi.h(parcel, 1, z);
            abhi.j(parcel, 2, this.b, false);
            abhi.q(parcel, 3, this.c, false);
            abhi.g(parcel, e);
        }
    }

    /* compiled from: PG */
    @Deprecated
    /* loaded from: classes2.dex */
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new ablq(8);
        public final boolean a;

        public PasswordRequestOptions(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof PasswordRequestOptions) || this.a != ((PasswordRequestOptions) obj).a) {
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

    public BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z, int i, PasskeysRequestOptions passkeysRequestOptions, PasskeyJsonRequestOptions passkeyJsonRequestOptions, boolean z2) {
        abhg.m(passwordRequestOptions);
        this.a = passwordRequestOptions;
        abhg.m(googleIdTokenRequestOptions);
        this.b = googleIdTokenRequestOptions;
        this.c = str;
        this.d = z;
        this.e = i;
        this.f = passkeysRequestOptions == null ? new PasskeysRequestOptions(false, null, null) : passkeysRequestOptions;
        this.g = passkeyJsonRequestOptions == null ? new PasskeyJsonRequestOptions(false, null) : passkeyJsonRequestOptions;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        if (!d.B(this.a, beginSignInRequest.a) || !d.B(this.b, beginSignInRequest.b) || !d.B(this.f, beginSignInRequest.f) || !d.B(this.g, beginSignInRequest.g) || !d.B(this.c, beginSignInRequest.c) || this.d != beginSignInRequest.d || this.e != beginSignInRequest.e || this.h != beginSignInRequest.h) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.f, this.g, this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.h)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PasswordRequestOptions passwordRequestOptions = this.a;
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, passwordRequestOptions, i, false);
        abhi.o(parcel, 2, this.b, i, false);
        abhi.q(parcel, 3, this.c, false);
        abhi.h(parcel, 4, this.d);
        abhi.m(parcel, 5, this.e);
        abhi.o(parcel, 6, this.f, i, false);
        abhi.o(parcel, 7, this.g, i, false);
        abhi.h(parcel, 8, this.h);
        abhi.g(parcel, e);
    }
}
