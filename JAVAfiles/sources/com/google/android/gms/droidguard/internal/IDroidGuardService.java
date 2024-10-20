package com.google.android.gms.droidguard.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import com.google.android.gms.droidguard.internal.IDroidGuardCallbacks;
import com.google.android.gms.droidguard.internal.IDroidGuardHandle;
import defpackage.iax;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IDroidGuardService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IDroidGuardService {
        static final int TRANSACTION_createDroidGuardHandle = 2;
        static final int TRANSACTION_getClientBlockingOperationTimeoutMillis = 3;
        static final int TRANSACTION_getResults = 1;
        static final int TRANSACTION_getResultsWithExtras = 4;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IDroidGuardService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.droidguard.internal.IDroidGuardService");
            }

            @Override // com.google.android.gms.droidguard.internal.IDroidGuardService
            public IDroidGuardHandle createDroidGuardHandle() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                IDroidGuardHandle asInterface = IDroidGuardHandle.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.droidguard.internal.IDroidGuardService
            public int getClientBlockingOperationTimeoutMillis() {
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.droidguard.internal.IDroidGuardService
            public void getResults(IDroidGuardCallbacks iDroidGuardCallbacks, String str, Map map) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iDroidGuardCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeMap(map);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.droidguard.internal.IDroidGuardService
            public void getResultsWithExtras(IDroidGuardCallbacks iDroidGuardCallbacks, String str, Map map, DroidGuardResultsRequest droidGuardResultsRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iDroidGuardCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeMap(map);
                iax.d(obtainAndWriteInterfaceToken, droidGuardResultsRequest);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.droidguard.internal.IDroidGuardService");
        }

        public static IDroidGuardService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardService");
            if (queryLocalInterface instanceof IDroidGuardService) {
                return (IDroidGuardService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return false;
                        }
                        IDroidGuardCallbacks asInterface = IDroidGuardCallbacks.Stub.asInterface(parcel.readStrongBinder());
                        String readString = parcel.readString();
                        HashMap c = iax.c(parcel);
                        DroidGuardResultsRequest droidGuardResultsRequest = (DroidGuardResultsRequest) iax.a(parcel, DroidGuardResultsRequest.CREATOR);
                        enforceNoDataAvail(parcel);
                        getResultsWithExtras(asInterface, readString, c, droidGuardResultsRequest);
                    } else {
                        int clientBlockingOperationTimeoutMillis = getClientBlockingOperationTimeoutMillis();
                        parcel2.writeNoException();
                        parcel2.writeInt(clientBlockingOperationTimeoutMillis);
                    }
                } else {
                    IDroidGuardHandle createDroidGuardHandle = createDroidGuardHandle();
                    parcel2.writeNoException();
                    iax.f(parcel2, createDroidGuardHandle);
                }
            } else {
                IDroidGuardCallbacks asInterface2 = IDroidGuardCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                HashMap c2 = iax.c(parcel);
                enforceNoDataAvail(parcel);
                getResults(asInterface2, readString2, c2);
            }
            return true;
        }
    }

    IDroidGuardHandle createDroidGuardHandle();

    int getClientBlockingOperationTimeoutMillis();

    void getResults(IDroidGuardCallbacks iDroidGuardCallbacks, String str, Map map);

    void getResultsWithExtras(IDroidGuardCallbacks iDroidGuardCallbacks, String str, Map map, DroidGuardResultsRequest droidGuardResultsRequest);
}
