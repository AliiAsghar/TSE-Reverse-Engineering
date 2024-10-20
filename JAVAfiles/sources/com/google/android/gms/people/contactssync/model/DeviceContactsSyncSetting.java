package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DeviceContactsSyncSetting extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DeviceContactsSyncSetting> CREATOR = new acfp(9);
    public static final int NOT_APPLICABLE = 1;
    public static final int OFF = 2;
    public static final int ON = 3;
    public static final int UNKNOWN_SYNC_SETTING = 0;
    private final int a;

    public DeviceContactsSyncSetting(int i) {
        this.a = i;
    }

    public static DeviceContactsSyncSetting create(int i) {
        return new DeviceContactsSyncSetting(i);
    }

    public int getSyncSetting() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, getSyncSetting());
        abhi.g(parcel, e);
    }
}
