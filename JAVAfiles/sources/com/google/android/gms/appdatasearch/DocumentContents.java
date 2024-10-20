package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abjg;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DocumentContents extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DocumentContents> CREATOR = new abjg(5);
    final DocumentSection[] a;
    public final String b;
    public final boolean c;
    public final Account d;

    public DocumentContents(DocumentSection[] documentSectionArr, String str, boolean z, Account account) {
        this.a = documentSectionArr;
        this.b = str;
        this.c = z;
        this.d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DocumentContents) {
            DocumentContents documentContents = (DocumentContents) obj;
            if (d.B(this.b, documentContents.b) && d.B(Boolean.valueOf(this.c), Boolean.valueOf(documentContents.c)) && d.B(this.d, documentContents.d) && Arrays.equals(this.a, documentContents.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Boolean.valueOf(this.c), this.d, Integer.valueOf(Arrays.hashCode(this.a))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.H(parcel, 1, this.a, i);
        abhi.q(parcel, 2, this.b, false);
        abhi.h(parcel, 3, this.c);
        abhi.o(parcel, 4, this.d, i, false);
        abhi.g(parcel, e);
    }
}
