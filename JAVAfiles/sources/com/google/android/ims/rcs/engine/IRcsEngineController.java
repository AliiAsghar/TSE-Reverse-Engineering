package com.google.android.ims.rcs.engine;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.ims.rcsservice.lifecycle.InitializeAndStartRcsTransportRequest;
import com.google.android.ims.rcsservice.lifecycle.StopAllRcsTransportsExceptRequest;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IRcsEngineController extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static abstract class Stub extends BaseStub implements IRcsEngineController {
        static final int TRANSACTION_destroy = 2;
        static final int TRANSACTION_initialize = 1;
        static final int TRANSACTION_initializeAndStartRcsTransport = 5;
        static final int TRANSACTION_stopAllRcsTransportsExcept = 6;
        static final int TRANSACTION_triggerStartRcsStack = 3;
        static final int TRANSACTION_triggerStopRcsStack = 4;

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public static class Proxy extends BaseProxy implements IRcsEngineController {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcs.engine.IRcsEngineController");
            }

            @Override // com.google.android.ims.rcs.engine.IRcsEngineController
            public RcsEngineLifecycleServiceResult destroy(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                RcsEngineLifecycleServiceResult rcsEngineLifecycleServiceResult = (RcsEngineLifecycleServiceResult) iax.a(transactAndReadException, RcsEngineLifecycleServiceResult.CREATOR);
                transactAndReadException.recycle();
                return rcsEngineLifecycleServiceResult;
            }

            @Override // com.google.android.ims.rcs.engine.IRcsEngineController
            public RcsEngineLifecycleServiceResult initialize(int i, int i2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                RcsEngineLifecycleServiceResult rcsEngineLifecycleServiceResult = (RcsEngineLifecycleServiceResult) iax.a(transactAndReadException, RcsEngineLifecycleServiceResult.CREATOR);
                transactAndReadException.recycle();
                return rcsEngineLifecycleServiceResult;
            }

            @Override // com.google.android.ims.rcs.engine.IRcsEngineController
            public RcsEngineLifecycleServiceResult initializeAndStartRcsTransport(InitializeAndStartRcsTransportRequest initializeAndStartRcsTransportRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, initializeAndStartRcsTransportRequest);
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
                RcsEngineLifecycleServiceResult rcsEngineLifecycleServiceResult = (RcsEngineLifecycleServiceResult) iax.a(transactAndReadException, RcsEngineLifecycleServiceResult.CREATOR);
                transactAndReadException.recycle();
                return rcsEngineLifecycleServiceResult;
            }

            @Override // com.google.android.ims.rcs.engine.IRcsEngineController
            public RcsEngineLifecycleServiceResult stopAllRcsTransportsExcept(StopAllRcsTransportsExceptRequest stopAllRcsTransportsExceptRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, stopAllRcsTransportsExceptRequest);
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken);
                RcsEngineLifecycleServiceResult rcsEngineLifecycleServiceResult = (RcsEngineLifecycleServiceResult) iax.a(transactAndReadException, RcsEngineLifecycleServiceResult.CREATOR);
                transactAndReadException.recycle();
                return rcsEngineLifecycleServiceResult;
            }

            @Override // com.google.android.ims.rcs.engine.IRcsEngineController
            public RcsEngineLifecycleServiceResult triggerStartRcsStack(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                RcsEngineLifecycleServiceResult rcsEngineLifecycleServiceResult = (RcsEngineLifecycleServiceResult) iax.a(transactAndReadException, RcsEngineLifecycleServiceResult.CREATOR);
                transactAndReadException.recycle();
                return rcsEngineLifecycleServiceResult;
            }

            @Override // com.google.android.ims.rcs.engine.IRcsEngineController
            public RcsEngineLifecycleServiceResult triggerStopRcsStack(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                RcsEngineLifecycleServiceResult rcsEngineLifecycleServiceResult = (RcsEngineLifecycleServiceResult) iax.a(transactAndReadException, RcsEngineLifecycleServiceResult.CREATOR);
                transactAndReadException.recycle();
                return rcsEngineLifecycleServiceResult;
            }
        }

        public Stub() {
            super("com.google.android.ims.rcs.engine.IRcsEngineController");
        }

        public static IRcsEngineController asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcs.engine.IRcsEngineController");
            if (queryLocalInterface instanceof IRcsEngineController) {
                return (IRcsEngineController) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    int readInt = parcel.readInt();
                    int readInt2 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    RcsEngineLifecycleServiceResult initialize = initialize(readInt, readInt2);
                    parcel2.writeNoException();
                    iax.e(parcel2, initialize);
                    return true;
                case 2:
                    int readInt3 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    RcsEngineLifecycleServiceResult destroy = destroy(readInt3);
                    parcel2.writeNoException();
                    iax.e(parcel2, destroy);
                    return true;
                case 3:
                    int readInt4 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    RcsEngineLifecycleServiceResult triggerStartRcsStack = triggerStartRcsStack(readInt4);
                    parcel2.writeNoException();
                    iax.e(parcel2, triggerStartRcsStack);
                    return true;
                case 4:
                    int readInt5 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    RcsEngineLifecycleServiceResult triggerStopRcsStack = triggerStopRcsStack(readInt5);
                    parcel2.writeNoException();
                    iax.e(parcel2, triggerStopRcsStack);
                    return true;
                case 5:
                    InitializeAndStartRcsTransportRequest initializeAndStartRcsTransportRequest = (InitializeAndStartRcsTransportRequest) iax.a(parcel, InitializeAndStartRcsTransportRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    RcsEngineLifecycleServiceResult initializeAndStartRcsTransport = initializeAndStartRcsTransport(initializeAndStartRcsTransportRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, initializeAndStartRcsTransport);
                    return true;
                case 6:
                    StopAllRcsTransportsExceptRequest stopAllRcsTransportsExceptRequest = (StopAllRcsTransportsExceptRequest) iax.a(parcel, StopAllRcsTransportsExceptRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    RcsEngineLifecycleServiceResult stopAllRcsTransportsExcept = stopAllRcsTransportsExcept(stopAllRcsTransportsExceptRequest);
                    parcel2.writeNoException();
                    iax.e(parcel2, stopAllRcsTransportsExcept);
                    return true;
                default:
                    return false;
            }
        }
    }

    RcsEngineLifecycleServiceResult destroy(int i);

    RcsEngineLifecycleServiceResult initialize(int i, int i2);

    RcsEngineLifecycleServiceResult initializeAndStartRcsTransport(InitializeAndStartRcsTransportRequest initializeAndStartRcsTransportRequest);

    RcsEngineLifecycleServiceResult stopAllRcsTransportsExcept(StopAllRcsTransportsExceptRequest stopAllRcsTransportsExceptRequest);

    RcsEngineLifecycleServiceResult triggerStartRcsStack(int i);

    RcsEngineLifecycleServiceResult triggerStopRcsStack(int i);
}
