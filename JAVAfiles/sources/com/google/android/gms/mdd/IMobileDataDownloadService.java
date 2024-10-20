package com.google.android.gms.mdd;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.mdd.IMddFileGroupCallback;
import com.google.android.gms.mdd.IMddFileGroupWithDownloadStatusCallback;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IMobileDataDownloadService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IMobileDataDownloadService {
        static final int TRANSACTION_activateFileGroup = 12;
        static final int TRANSACTION_addConfigsForDownload = 2;
        static final int TRANSACTION_addOverrideFileGroup = 6;
        static final int TRANSACTION_clearAllState = 7;
        static final int TRANSACTION_deactivateFileGroup = 13;
        static final int TRANSACTION_downloadFileGroup = 11;
        static final int TRANSACTION_downloadPendingGroups = 3;
        static final int TRANSACTION_getFileGroup = 1;
        static final int TRANSACTION_getFileGroupListForDebugUI = 10;
        static final int TRANSACTION_handleFlagChange = 8;
        static final int TRANSACTION_maintenance = 4;
        static final int TRANSACTION_resetTesting = 5;
        static final int TRANSACTION_verifyPendingGroups = 9;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IMobileDataDownloadService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.mdd.IMobileDataDownloadService");
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void activateFileGroup(IStatusCallback iStatusCallback, FileGroupRequest fileGroupRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, fileGroupRequest);
                transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void addConfigsForDownload(IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void addOverrideFileGroup(IStatusCallback iStatusCallback, OverrideFileGroupRequest overrideFileGroupRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, overrideFileGroupRequest);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void clearAllState(IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void deactivateFileGroup(IStatusCallback iStatusCallback, FileGroupRequest fileGroupRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, fileGroupRequest);
                transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void downloadFileGroup(IMddFileGroupCallback iMddFileGroupCallback, FileGroupRequest fileGroupRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iMddFileGroupCallback);
                iax.d(obtainAndWriteInterfaceToken, fileGroupRequest);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void downloadPendingGroups(boolean z, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void getFileGroup(IMddFileGroupCallback iMddFileGroupCallback, FileGroupRequest fileGroupRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iMddFileGroupCallback);
                iax.d(obtainAndWriteInterfaceToken, fileGroupRequest);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void getFileGroupListForDebugUI(IMddFileGroupWithDownloadStatusCallback iMddFileGroupWithDownloadStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iMddFileGroupWithDownloadStatusCallback);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void handleFlagChange(IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void maintenance(IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void resetTesting(IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdd.IMobileDataDownloadService
            public void verifyPendingGroups(IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.mdd.IMobileDataDownloadService");
        }

        public static IMobileDataDownloadService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdd.IMobileDataDownloadService");
            if (queryLocalInterface instanceof IMobileDataDownloadService) {
                return (IMobileDataDownloadService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IMddFileGroupCallback asInterface = IMddFileGroupCallback.Stub.asInterface(parcel.readStrongBinder());
                    FileGroupRequest fileGroupRequest = (FileGroupRequest) iax.a(parcel, FileGroupRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    getFileGroup(asInterface, fileGroupRequest);
                    break;
                case 2:
                    IStatusCallback asInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    addConfigsForDownload(asInterface2);
                    break;
                case 3:
                    boolean g = iax.g(parcel);
                    IStatusCallback asInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    downloadPendingGroups(g, asInterface3);
                    break;
                case 4:
                    IStatusCallback asInterface4 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    maintenance(asInterface4);
                    break;
                case 5:
                    IStatusCallback asInterface5 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    resetTesting(asInterface5);
                    break;
                case 6:
                    IStatusCallback asInterface6 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    OverrideFileGroupRequest overrideFileGroupRequest = (OverrideFileGroupRequest) iax.a(parcel, OverrideFileGroupRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    addOverrideFileGroup(asInterface6, overrideFileGroupRequest);
                    break;
                case 7:
                    IStatusCallback asInterface7 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    clearAllState(asInterface7);
                    break;
                case 8:
                    IStatusCallback asInterface8 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    handleFlagChange(asInterface8);
                    break;
                case 9:
                    IStatusCallback asInterface9 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    verifyPendingGroups(asInterface9);
                    break;
                case 10:
                    IMddFileGroupWithDownloadStatusCallback asInterface10 = IMddFileGroupWithDownloadStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getFileGroupListForDebugUI(asInterface10);
                    break;
                case 11:
                    IMddFileGroupCallback asInterface11 = IMddFileGroupCallback.Stub.asInterface(parcel.readStrongBinder());
                    FileGroupRequest fileGroupRequest2 = (FileGroupRequest) iax.a(parcel, FileGroupRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    downloadFileGroup(asInterface11, fileGroupRequest2);
                    break;
                case 12:
                    IStatusCallback asInterface12 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    FileGroupRequest fileGroupRequest3 = (FileGroupRequest) iax.a(parcel, FileGroupRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    activateFileGroup(asInterface12, fileGroupRequest3);
                    break;
                case 13:
                    IStatusCallback asInterface13 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    FileGroupRequest fileGroupRequest4 = (FileGroupRequest) iax.a(parcel, FileGroupRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    deactivateFileGroup(asInterface13, fileGroupRequest4);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void activateFileGroup(IStatusCallback iStatusCallback, FileGroupRequest fileGroupRequest);

    void addConfigsForDownload(IStatusCallback iStatusCallback);

    void addOverrideFileGroup(IStatusCallback iStatusCallback, OverrideFileGroupRequest overrideFileGroupRequest);

    void clearAllState(IStatusCallback iStatusCallback);

    void deactivateFileGroup(IStatusCallback iStatusCallback, FileGroupRequest fileGroupRequest);

    void downloadFileGroup(IMddFileGroupCallback iMddFileGroupCallback, FileGroupRequest fileGroupRequest);

    void downloadPendingGroups(boolean z, IStatusCallback iStatusCallback);

    void getFileGroup(IMddFileGroupCallback iMddFileGroupCallback, FileGroupRequest fileGroupRequest);

    void getFileGroupListForDebugUI(IMddFileGroupWithDownloadStatusCallback iMddFileGroupWithDownloadStatusCallback);

    void handleFlagChange(IStatusCallback iStatusCallback);

    void maintenance(IStatusCallback iStatusCallback);

    void resetTesting(IStatusCallback iStatusCallback);

    void verifyPendingGroups(IStatusCallback iStatusCallback);
}
