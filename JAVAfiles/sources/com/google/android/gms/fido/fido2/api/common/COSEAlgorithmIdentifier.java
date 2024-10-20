package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhg;
import defpackage.abyy;
import defpackage.abzb;
import defpackage.abzc;
import defpackage.abzd;
import defpackage.abzh;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class COSEAlgorithmIdentifier implements Parcelable {
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new abzb(3);
    public final abyy a;

    public COSEAlgorithmIdentifier(abyy abyyVar) {
        abhg.m(abyyVar);
        this.a = abyyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static COSEAlgorithmIdentifier a(int i) {
        abzh abzhVar;
        if (i == abzh.LEGACY_RS1.i) {
            abzhVar = abzh.RS1;
        } else {
            abzh[] values = abzh.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    abzh abzhVar2 = values[i2];
                    if (abzhVar2.i == i) {
                        abzhVar = abzhVar2;
                        break;
                    }
                    i2++;
                } else {
                    for (abzd abzdVar : abzd.values()) {
                        if (abzdVar.h == i) {
                            abzhVar = abzdVar;
                        }
                    }
                    throw new abzc(i);
                }
            }
        }
        return new COSEAlgorithmIdentifier(abzhVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof COSEAlgorithmIdentifier) || this.a.a() != ((COSEAlgorithmIdentifier) obj).a.a()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "COSEAlgorithmIdentifier{algorithm=" + this.a.toString() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.a());
    }
}
