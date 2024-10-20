package com.google.android.gms.mdh.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.internal.IFootprintsRecordingSettingsListener;
import com.google.android.gms.mdh.internal.ILatestFootprintListener;
import com.google.android.gms.mdh.internal.ITimeSeriesFootprintsListener;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IMobileDataHubListenerService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IMobileDataHubListenerService {
        static final int TRANSACTION_registerFootprintsRecordingSettingsListener = 5;
        static final int TRANSACTION_registerLatestFootprintListener = 1;
        static final int TRANSACTION_registerTimeSeriesFootprintsListener = 3;
        static final int TRANSACTION_unregisterFootprintsRecordingSettingsListener = 6;
        static final int TRANSACTION_unregisterLatestFootprintListener = 2;
        static final int TRANSACTION_unregisterTimeSeriesFootprintsListener = 4;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IMobileDataHubListenerService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.mdh.internal.IMobileDataHubListenerService");
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubListenerService
            public void registerFootprintsRecordingSettingsListener(IStatusCallback iStatusCallback, Account account, int i, IFootprintsRecordingSettingsListener iFootprintsRecordingSettingsListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.f(obtainAndWriteInterfaceToken, iFootprintsRecordingSettingsListener);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubListenerService
            public void registerLatestFootprintListener(IStatusCallback iStatusCallback, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter, ILatestFootprintListener iLatestFootprintListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                iax.d(obtainAndWriteInterfaceToken, latestFootprintFilter);
                iax.f(obtainAndWriteInterfaceToken, iLatestFootprintListener);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubListenerService
            public void registerTimeSeriesFootprintsListener(IStatusCallback iStatusCallback, Account account, int i, int i2, ITimeSeriesFootprintsListener iTimeSeriesFootprintsListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                iax.f(obtainAndWriteInterfaceToken, iTimeSeriesFootprintsListener);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubListenerService
            public void unregisterFootprintsRecordingSettingsListener(IStatusCallback iStatusCallback, Account account, int i, IFootprintsRecordingSettingsListener iFootprintsRecordingSettingsListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.f(obtainAndWriteInterfaceToken, iFootprintsRecordingSettingsListener);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubListenerService
            public void unregisterLatestFootprintListener(IStatusCallback iStatusCallback, Account account, int i, int i2, ILatestFootprintListener iLatestFootprintListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                iax.f(obtainAndWriteInterfaceToken, iLatestFootprintListener);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdh.internal.IMobileDataHubListenerService
            public void unregisterTimeSeriesFootprintsListener(IStatusCallback iStatusCallback, Account account, int i, int i2, ITimeSeriesFootprintsListener iTimeSeriesFootprintsListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, account);
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                iax.f(obtainAndWriteInterfaceToken, iTimeSeriesFootprintsListener);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.mdh.internal.IMobileDataHubListenerService");
        }

        public static IMobileDataHubListenerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdh.internal.IMobileDataHubListenerService");
            if (queryLocalInterface instanceof IMobileDataHubListenerService) {
                return (IMobileDataHubListenerService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IStatusCallback asInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account = (Account) iax.a(parcel, Account.CREATOR);
                    int readInt = parcel.readInt();
                    int readInt2 = parcel.readInt();
                    LatestFootprintFilter latestFootprintFilter = (LatestFootprintFilter) iax.a(parcel, LatestFootprintFilter.CREATOR);
                    ILatestFootprintListener asInterface2 = ILatestFootprintListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    registerLatestFootprintListener(asInterface, account, readInt, readInt2, latestFootprintFilter, asInterface2);
                    break;
                case 2:
                    IStatusCallback asInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account2 = (Account) iax.a(parcel, Account.CREATOR);
                    int readInt3 = parcel.readInt();
                    int readInt4 = parcel.readInt();
                    ILatestFootprintListener asInterface4 = ILatestFootprintListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    unregisterLatestFootprintListener(asInterface3, account2, readInt3, readInt4, asInterface4);
                    break;
                case 3:
                    IStatusCallback asInterface5 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account3 = (Account) iax.a(parcel, Account.CREATOR);
                    int readInt5 = parcel.readInt();
                    int readInt6 = parcel.readInt();
                    ITimeSeriesFootprintsListener asInterface6 = ITimeSeriesFootprintsListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    registerTimeSeriesFootprintsListener(asInterface5, account3, readInt5, readInt6, asInterface6);
                    break;
                case 4:
                    IStatusCallback asInterface7 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account4 = (Account) iax.a(parcel, Account.CREATOR);
                    int readInt7 = parcel.readInt();
                    int readInt8 = parcel.readInt();
                    ITimeSeriesFootprintsListener asInterface8 = ITimeSeriesFootprintsListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    unregisterTimeSeriesFootprintsListener(asInterface7, account4, readInt7, readInt8, asInterface8);
                    break;
                case 5:
                    IStatusCallback asInterface9 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account5 = (Account) iax.a(parcel, Account.CREATOR);
                    int readInt9 = parcel.readInt();
                    IFootprintsRecordingSettingsListener asInterface10 = IFootprintsRecordingSettingsListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    registerFootprintsRecordingSettingsListener(asInterface9, account5, readInt9, asInterface10);
                    break;
                case 6:
                    IStatusCallback asInterface11 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Account account6 = (Account) iax.a(parcel, Account.CREATOR);
                    int readInt10 = parcel.readInt();
                    IFootprintsRecordingSettingsListener asInterface12 = IFootprintsRecordingSettingsListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    unregisterFootprintsRecordingSettingsListener(asInterface11, account6, readInt10, asInterface12);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void registerFootprintsRecordingSettingsListener(IStatusCallback iStatusCallback, Account account, int i, IFootprintsRecordingSettingsListener iFootprintsRecordingSettingsListener);

    void registerLatestFootprintListener(IStatusCallback iStatusCallback, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter, ILatestFootprintListener iLatestFootprintListener);

    void registerTimeSeriesFootprintsListener(IStatusCallback iStatusCallback, Account account, int i, int i2, ITimeSeriesFootprintsListener iTimeSeriesFootprintsListener);

    void unregisterFootprintsRecordingSettingsListener(IStatusCallback iStatusCallback, Account account, int i, IFootprintsRecordingSettingsListener iFootprintsRecordingSettingsListener);

    void unregisterLatestFootprintListener(IStatusCallback iStatusCallback, Account account, int i, int i2, ILatestFootprintListener iLatestFootprintListener);

    void unregisterTimeSeriesFootprintsListener(IStatusCallback iStatusCallback, Account account, int i, int i2, ITimeSeriesFootprintsListener iTimeSeriesFootprintsListener);
}
