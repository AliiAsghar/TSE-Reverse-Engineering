package com.google.android.gms.people.contactssync.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IContactsSyncThirdPartyService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IContactsSyncThirdPartyService {
        static final int TRANSACTION_addDeviceContactsSyncSettingChangedListener = 224703;
        static final int TRANSACTION_getBackupAndSyncOptInState = 224702;
        static final int TRANSACTION_getDeviceContactsSyncSettingAction = 224705;
        static final int TRANSACTION_removeDeviceContactsSyncSettingChangedListener = 224704;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IContactsSyncThirdPartyService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.people.contactssync.internal.IContactsSyncThirdPartyService");
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncThirdPartyService
            public void addDeviceContactsSyncSettingChangedListener(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_addDeviceContactsSyncSettingChangedListener, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncThirdPartyService
            public void getBackupAndSyncOptInState(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getBackupAndSyncOptInState, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncThirdPartyService
            public void getDeviceContactsSyncSettingAction(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getDeviceContactsSyncSettingAction, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.people.contactssync.internal.IContactsSyncThirdPartyService
            public void removeDeviceContactsSyncSettingChangedListener(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iContactsSyncServiceCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_removeDeviceContactsSyncSettingChangedListener, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.people.contactssync.internal.IContactsSyncThirdPartyService");
        }

        public static IContactsSyncThirdPartyService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.contactssync.internal.IContactsSyncThirdPartyService");
            if (queryLocalInterface instanceof IContactsSyncThirdPartyService) {
                return (IContactsSyncThirdPartyService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case TRANSACTION_getBackupAndSyncOptInState /* 224702 */:
                    IContactsSyncServiceCallbacks asInterface = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getBackupAndSyncOptInState(asInterface);
                    break;
                case TRANSACTION_addDeviceContactsSyncSettingChangedListener /* 224703 */:
                    IContactsSyncServiceCallbacks asInterface2 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    addDeviceContactsSyncSettingChangedListener(asInterface2);
                    break;
                case TRANSACTION_removeDeviceContactsSyncSettingChangedListener /* 224704 */:
                    IContactsSyncServiceCallbacks asInterface3 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    removeDeviceContactsSyncSettingChangedListener(asInterface3);
                    break;
                case TRANSACTION_getDeviceContactsSyncSettingAction /* 224705 */:
                    IContactsSyncServiceCallbacks asInterface4 = IContactsSyncServiceCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getDeviceContactsSyncSettingAction(asInterface4);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void addDeviceContactsSyncSettingChangedListener(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks);

    void getBackupAndSyncOptInState(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks);

    void getDeviceContactsSyncSettingAction(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks);

    void removeDeviceContactsSyncSettingChangedListener(IContactsSyncServiceCallbacks iContactsSyncServiceCallbacks);
}
