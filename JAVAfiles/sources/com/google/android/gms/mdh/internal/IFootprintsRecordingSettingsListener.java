package com.google.android.gms.mdh.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.mdh.FootprintsRecordingSetting;
import com.google.android.gms.mdh.SyncStatus;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IFootprintsRecordingSettingsListener extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IFootprintsRecordingSettingsListener {
        static final int TRANSACTION_onUpdate = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IFootprintsRecordingSettingsListener {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.mdh.internal.IFootprintsRecordingSettingsListener");
            }

            @Override // com.google.android.gms.mdh.internal.IFootprintsRecordingSettingsListener
            public void onUpdate(IStatusCallback iStatusCallback, FootprintsRecordingSetting footprintsRecordingSetting, SyncStatus syncStatus) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, footprintsRecordingSetting);
                iax.d(obtainAndWriteInterfaceToken, syncStatus);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.mdh.internal.IFootprintsRecordingSettingsListener");
        }

        public static IFootprintsRecordingSettingsListener asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdh.internal.IFootprintsRecordingSettingsListener");
            if (queryLocalInterface instanceof IFootprintsRecordingSettingsListener) {
                return (IFootprintsRecordingSettingsListener) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IStatusCallback asInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                FootprintsRecordingSetting footprintsRecordingSetting = (FootprintsRecordingSetting) iax.a(parcel, FootprintsRecordingSetting.CREATOR);
                SyncStatus syncStatus = (SyncStatus) iax.a(parcel, SyncStatus.CREATOR);
                enforceNoDataAvail(parcel);
                onUpdate(asInterface, footprintsRecordingSetting, syncStatus);
                return true;
            }
            return false;
        }
    }

    void onUpdate(IStatusCallback iStatusCallback, FootprintsRecordingSetting footprintsRecordingSetting, SyncStatus syncStatus);
}
