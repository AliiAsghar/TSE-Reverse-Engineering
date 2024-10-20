package com.google.android.gms.location.internal;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.acdi;
import defpackage.aots;
import defpackage.aott;
import defpackage.aotu;
import defpackage.aozs;
import defpackage.apag;
import defpackage.apba;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SetGoogleLocationAccuracyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetGoogleLocationAccuracyRequest> CREATOR = new acdi(16);
    public final boolean a;
    private final aots b;
    private final aotu c;
    private final aott d;

    public SetGoogleLocationAccuracyRequest(boolean z, int i, byte[] bArr, byte[] bArr2) {
        aots aotsVar;
        aotu aotuVar;
        this.a = z;
        aott aottVar = null;
        switch (i) {
            case 0:
                aotsVar = aots.SOURCE_UNKNOWN;
                break;
            case 1:
                aotsVar = aots.SOURCE_SYSTEM_SETTINGS;
                break;
            case 2:
                aotsVar = aots.SOURCE_QUICK_SETTINGS;
                break;
            case 3:
                aotsVar = aots.SOURCE_LOCATION_ACCURACY;
                break;
            case 4:
                aotsVar = aots.SOURCE_LOCATION_SETTINGS_DIALOG;
                break;
            case 5:
                aotsVar = aots.SOURCE_LOCATION_OFF_WARNING_DIALOG;
                break;
            case 6:
                aotsVar = aots.SOURCE_SETUP_WIZARD;
                break;
            case 7:
                aotsVar = aots.SOURCE_ADD_ACCOUNT;
                break;
            case 8:
                aotsVar = aots.SOURCE_EMERGENCY_LOCATION_SERVICE;
                break;
            case 9:
                aotsVar = aots.SOURCE_FAMILY_LINK;
                break;
            case 10:
                aotsVar = aots.SOURCE_TEST;
                break;
            case 11:
                aotsVar = aots.SOURCE_DEMO_USER;
                break;
            default:
                aotsVar = null;
                break;
        }
        abhg.m(aotsVar);
        this.b = aotsVar;
        if (bArr != null) {
            try {
                aotuVar = (aotu) apag.parseFrom(aotu.a, bArr, aozs.a());
            } catch (apba e) {
                throw new BadParcelableException(e);
            }
        } else {
            aotuVar = null;
        }
        this.c = aotuVar;
        if (bArr2 != null) {
            aottVar = (aott) apag.parseFrom(aott.a, bArr2, aozs.a());
        }
        this.d = aottVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] byteArray;
        boolean z = this.a;
        int e = abhi.e(parcel);
        abhi.h(parcel, 1, z);
        abhi.m(parcel, 2, this.b.m);
        aotu aotuVar = this.c;
        byte[] bArr = null;
        if (aotuVar == null) {
            byteArray = null;
        } else {
            byteArray = aotuVar.toByteArray();
        }
        abhi.j(parcel, 3, byteArray, false);
        aott aottVar = this.d;
        if (aottVar != null) {
            bArr = aottVar.toByteArray();
        }
        abhi.j(parcel, 4, bArr, false);
        abhi.g(parcel, e);
    }
}
