package com.google.android.gms.people.account.categories;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfe;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ClassifyAccountTypeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClassifyAccountTypeRequest> CREATOR = new acfe(17);
    public final String a;
    public final String b;
    public final int c;

    public ClassifyAccountTypeRequest(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ClassifyAccountTypeRequest classifyAccountTypeRequest = (ClassifyAccountTypeRequest) obj;
            if (d.B(this.a, classifyAccountTypeRequest.a) && d.B(this.b, classifyAccountTypeRequest.b) && this.c == classifyAccountTypeRequest.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.m(parcel, 3, this.c);
        abhi.g(parcel, e);
    }
}
