package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.aciz;
import defpackage.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ConsentInformation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConsentInformation> CREATOR;
    public final boolean a;
    public final boolean b;
    private final List c;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static class AccountConsentInformation extends AbstractSafeParcelable {
        public static final Parcelable.Creator<AccountConsentInformation> CREATOR = new aciz(2);
        public final String a;
        public final byte[] b;
        public final List c;

        public AccountConsentInformation(String str, byte[] bArr, List list) {
            ArrayList arrayList;
            this.a = str;
            this.b = bArr;
            if (list == null) {
                arrayList = new ArrayList(0);
            } else {
                arrayList = new ArrayList(list);
            }
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AccountConsentInformation)) {
                return false;
            }
            AccountConsentInformation accountConsentInformation = (AccountConsentInformation) obj;
            if (d.B(this.a, accountConsentInformation.a) && d.B(this.b, accountConsentInformation.b) && d.B(this.c, accountConsentInformation.c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str = this.a;
            int e = abhi.e(parcel);
            abhi.q(parcel, 1, str, false);
            abhi.j(parcel, 2, this.b, false);
            abhi.z(parcel, 3, new ArrayList(this.c));
            abhi.g(parcel, e);
        }
    }

    static {
        new ConsentInformation(null, false, false);
        CREATOR = new aciz(3);
    }

    public ConsentInformation(List list, boolean z, boolean z2) {
        ArrayList arrayList;
        if (list == null) {
            arrayList = new ArrayList(0);
        } else {
            arrayList = new ArrayList(list);
        }
        this.c = arrayList;
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConsentInformation)) {
            return false;
        }
        ConsentInformation consentInformation = (ConsentInformation) obj;
        if (d.B(this.c, consentInformation.c) && d.B(Boolean.valueOf(this.a), Boolean.valueOf(consentInformation.a))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.r(parcel, 1, new ArrayList(this.c), false);
        abhi.h(parcel, 2, this.a);
        abhi.h(parcel, 3, this.b);
        abhi.g(parcel, e);
    }
}
