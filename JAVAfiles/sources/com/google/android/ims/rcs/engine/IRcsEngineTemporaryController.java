package com.google.android.ims.rcs.engine;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IRcsEngineTemporaryController extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static abstract class Stub extends BaseStub implements IRcsEngineTemporaryController {
        static final int TRANSACTION_triggerStartRcsStack = 1;
        static final int TRANSACTION_triggerStopRcsStack = 2;

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public static class Proxy extends BaseProxy implements IRcsEngineTemporaryController {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcs.engine.IRcsEngineTemporaryController");
            }

            @Override // com.google.android.ims.rcs.engine.IRcsEngineTemporaryController
            public void triggerStartRcsStack(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.rcs.engine.IRcsEngineTemporaryController
            public void triggerStopRcsStack(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.ims.rcs.engine.IRcsEngineTemporaryController");
        }

        public static IRcsEngineTemporaryController asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcs.engine.IRcsEngineTemporaryController");
            if (queryLocalInterface instanceof IRcsEngineTemporaryController) {
                return (IRcsEngineTemporaryController) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                String readString = parcel.readString();
                enforceNoDataAvail(parcel);
                triggerStopRcsStack(readString);
            } else {
                String readString2 = parcel.readString();
                enforceNoDataAvail(parcel);
                triggerStartRcsStack(readString2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void triggerStartRcsStack(String str);

    void triggerStopRcsStack(String str);
}
