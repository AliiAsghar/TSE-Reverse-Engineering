package com.google.android.gms.mdh.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdh.FootprintsRecordingSetting;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IMdhFootprintsRecordingSettingCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IMdhFootprintsRecordingSettingCallback {
        static final int TRANSACTION_onDataRetrieved = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IMdhFootprintsRecordingSettingCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.mdh.internal.IMdhFootprintsRecordingSettingCallback");
            }

            @Override // com.google.android.gms.mdh.internal.IMdhFootprintsRecordingSettingCallback
            public void onDataRetrieved(Status status, FootprintsRecordingSetting footprintsRecordingSetting) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, footprintsRecordingSetting);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.mdh.internal.IMdhFootprintsRecordingSettingCallback");
        }

        public static IMdhFootprintsRecordingSettingCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdh.internal.IMdhFootprintsRecordingSettingCallback");
            if (queryLocalInterface instanceof IMdhFootprintsRecordingSettingCallback) {
                return (IMdhFootprintsRecordingSettingCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) iax.a(parcel, Status.CREATOR);
                FootprintsRecordingSetting footprintsRecordingSetting = (FootprintsRecordingSetting) iax.a(parcel, FootprintsRecordingSetting.CREATOR);
                enforceNoDataAvail(parcel);
                onDataRetrieved(status, footprintsRecordingSetting);
                return true;
            }
            return false;
        }
    }

    void onDataRetrieved(Status status, FootprintsRecordingSetting footprintsRecordingSetting);
}
