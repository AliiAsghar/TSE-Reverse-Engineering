package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.abhi;
import defpackage.abjg;
import defpackage.abji;
import defpackage.d;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DocumentSection extends AbstractSafeParcelable {
    public final String b;
    final RegisterSectionInfo c;
    public final int d;
    public final byte[] e;
    public static final int a = Integer.parseInt("-1");
    public static final Parcelable.Creator<DocumentSection> CREATOR = new abjg(8);

    static {
        ArrayList arrayList = new ArrayList();
    }

    public DocumentSection(String str, RegisterSectionInfo registerSectionInfo, int i, byte[] bArr) {
        String str2;
        int i2 = a;
        boolean z = true;
        if (i != i2 && abji.a(i) == null) {
            z = false;
        }
        d.t(z, a.bV(i, "Invalid section type "));
        this.b = str;
        this.c = registerSectionInfo;
        this.d = i;
        this.e = bArr;
        if (i != i2 && abji.a(i) == null) {
            str2 = "Invalid section type " + i;
        } else if (str != null && bArr != null) {
            str2 = "Both content and blobContent set";
        } else {
            str2 = null;
        }
        if (str2 == null) {
        } else {
            throw new IllegalArgumentException(str2);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.o(parcel, 3, this.c, i, false);
        abhi.m(parcel, 4, this.d);
        abhi.j(parcel, 5, this.e, false);
        abhi.g(parcel, e);
    }
}
