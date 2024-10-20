package com.google.android.gms.fido.credentialstore;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abxj;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class KeyCreationRequestOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<KeyCreationRequestOptions> CREATOR = new abxj(11);
    public final String a;
    public final boolean b;
    public final int c;
    public final int[] d;
    public final byte[] e;
    public final String f;
    public final String g;
    public final Account h;
    public final boolean i;
    public final boolean j;

    public KeyCreationRequestOptions(String str, boolean z, int i, int[] iArr, byte[] bArr, String str2, String str3, Account account, boolean z2, boolean z3) {
        boolean z4 = false;
        if (str != null && str.length() > 0) {
            z4 = true;
        }
        d.t(z4, "rpId cannot be empty");
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = iArr;
        this.e = bArr;
        this.f = str2;
        this.g = str3;
        this.h = account;
        this.i = z2;
        this.j = z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof KeyCreationRequestOptions)) {
            return false;
        }
        KeyCreationRequestOptions keyCreationRequestOptions = (KeyCreationRequestOptions) obj;
        if (!d.B(this.a, keyCreationRequestOptions.a) || !d.B(Boolean.valueOf(this.b), Boolean.valueOf(keyCreationRequestOptions.b)) || !d.B(Integer.valueOf(this.c), Integer.valueOf(keyCreationRequestOptions.c)) || !d.B(this.d, keyCreationRequestOptions.d) || !Arrays.equals(this.e, keyCreationRequestOptions.e) || !d.B(this.f, keyCreationRequestOptions.f) || !d.B(this.g, keyCreationRequestOptions.g) || !d.B(this.h, keyCreationRequestOptions.h) || !d.B(Boolean.valueOf(this.i), Boolean.valueOf(keyCreationRequestOptions.i)) || !d.B(Boolean.valueOf(this.j), Boolean.valueOf(keyCreationRequestOptions.j))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e, this.f, this.g, Boolean.valueOf(this.i), Boolean.valueOf(this.j)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.h(parcel, 2, this.b);
        abhi.m(parcel, 3, this.c);
        abhi.y(parcel, 4, this.d);
        abhi.j(parcel, 5, this.e, false);
        abhi.q(parcel, 6, this.f, false);
        abhi.q(parcel, 7, this.g, false);
        abhi.o(parcel, 8, this.h, i, false);
        abhi.h(parcel, 9, this.i);
        abhi.h(parcel, 10, this.j);
        abhi.g(parcel, e);
    }
}
