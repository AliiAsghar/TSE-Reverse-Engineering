package com.google.android.gms.mdisync.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.mdisync.internal.IMdiSyncCallbacks;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IMdiSyncService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IMdiSyncService {
        static final int TRANSACTION_sync = 1;
        static final int TRANSACTION_syncWithTeleportation = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IMdiSyncService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.mdisync.internal.IMdiSyncService");
            }

            @Override // com.google.android.gms.mdisync.internal.IMdiSyncService
            public void sync(IMdiSyncCallbacks iMdiSyncCallbacks, SyncRequest syncRequest, CallerInfo callerInfo, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iMdiSyncCallbacks);
                iax.d(obtainAndWriteInterfaceToken, syncRequest);
                iax.d(obtainAndWriteInterfaceToken, callerInfo);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.mdisync.internal.IMdiSyncService
            public void syncWithTeleportation(IMdiSyncCallbacks iMdiSyncCallbacks, TeleportingSyncRequest teleportingSyncRequest, CallerInfo callerInfo, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iMdiSyncCallbacks);
                iax.d(obtainAndWriteInterfaceToken, teleportingSyncRequest);
                iax.d(obtainAndWriteInterfaceToken, callerInfo);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.mdisync.internal.IMdiSyncService");
        }

        public static IMdiSyncService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdisync.internal.IMdiSyncService");
            if (queryLocalInterface instanceof IMdiSyncService) {
                return (IMdiSyncService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                IMdiSyncCallbacks asInterface = IMdiSyncCallbacks.Stub.asInterface(parcel.readStrongBinder());
                TeleportingSyncRequest teleportingSyncRequest = (TeleportingSyncRequest) iax.a(parcel, TeleportingSyncRequest.CREATOR);
                CallerInfo callerInfo = (CallerInfo) iax.a(parcel, CallerInfo.CREATOR);
                ApiMetadata apiMetadata = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                syncWithTeleportation(asInterface, teleportingSyncRequest, callerInfo, apiMetadata);
            } else {
                IMdiSyncCallbacks asInterface2 = IMdiSyncCallbacks.Stub.asInterface(parcel.readStrongBinder());
                SyncRequest syncRequest = (SyncRequest) iax.a(parcel, SyncRequest.CREATOR);
                CallerInfo callerInfo2 = (CallerInfo) iax.a(parcel, CallerInfo.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                sync(asInterface2, syncRequest, callerInfo2, apiMetadata2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void sync(IMdiSyncCallbacks iMdiSyncCallbacks, SyncRequest syncRequest, CallerInfo callerInfo, ApiMetadata apiMetadata);

    void syncWithTeleportation(IMdiSyncCallbacks iMdiSyncCallbacks, TeleportingSyncRequest teleportingSyncRequest, CallerInfo callerInfo, ApiMetadata apiMetadata);
}
