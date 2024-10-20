package com.google.android.gms.people.account.categories;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfe;
import defpackage.acfn;
import defpackage.acfo;
import defpackage.albo;
import defpackage.algv;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ClassifyAccountTypeResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClassifyAccountTypeResult> CREATOR = new acfe(18);
    public final String a;
    public final String b;
    private final acfn c;
    private final acfo d;

    public ClassifyAccountTypeResult(String str, String str2, int i, int i2) {
        acfn acfnVar;
        this.a = str;
        this.b = str2;
        acfo acfoVar = null;
        switch (i) {
            case 0:
                acfnVar = acfn.UNKNOWN;
                break;
            case 1:
                acfnVar = acfn.NULL_ACCOUNT;
                break;
            case 2:
                acfnVar = acfn.GOOGLE;
                break;
            case 3:
                acfnVar = acfn.DEVICE;
                break;
            case 4:
                acfnVar = acfn.SIM;
                break;
            case 5:
                acfnVar = acfn.EXCHANGE;
                break;
            case 6:
                acfnVar = acfn.THIRD_PARTY_EDITABLE;
                break;
            case 7:
                acfnVar = acfn.THIRD_PARTY_READONLY;
                break;
            case 8:
                acfnVar = acfn.SIM_SDN;
                break;
            case 9:
                acfnVar = acfn.PRELOAD_SDN;
                break;
            default:
                acfnVar = null;
                break;
        }
        this.c = acfnVar == null ? acfn.UNKNOWN : acfnVar;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                acfoVar = acfo.SHEEPDOG_ELIGIBLE;
                            }
                        } else {
                            acfoVar = acfo.HEURISTIC;
                        }
                    } else {
                        acfoVar = acfo.SUBSTRING;
                    }
                } else {
                    acfoVar = acfo.EXACT;
                }
            } else {
                acfoVar = acfo.NONE;
            }
        } else {
            acfoVar = acfo.UNKNOWN;
        }
        this.d = acfoVar == null ? acfo.UNKNOWN : acfoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ClassifyAccountTypeResult classifyAccountTypeResult = (ClassifyAccountTypeResult) obj;
            if (d.B(this.a, classifyAccountTypeResult.a) && d.B(this.b, classifyAccountTypeResult.b) && this.c == classifyAccountTypeResult.c && this.d == classifyAccountTypeResult.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("accountType", this.a);
        aj.b("dataSet", this.b);
        aj.b("category", this.c);
        aj.b("matchTag", this.d);
        return aj.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.m(parcel, 3, this.c.k);
        abhi.m(parcel, 4, this.d.g);
        abhi.g(parcel, e);
    }
}
