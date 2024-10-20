package com.google.android.ims.rcsservice.businessinfo;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IBusinessInfo extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static abstract class Stub extends BaseStub implements IBusinessInfo {
        private static final String DESCRIPTOR = "com.google.android.ims.rcsservice.businessinfo.IBusinessInfo";
        static final int TRANSACTION_retrieveBusinessInfo = 1;

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public static class Proxy extends BaseProxy implements IBusinessInfo {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            @Override // com.google.android.ims.rcsservice.businessinfo.IBusinessInfo
            public void retrieveBusinessInfo(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super(DESCRIPTOR);
        }

        public static IBusinessInfo asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface instanceof IBusinessInfo) {
                return (IBusinessInfo) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                String readString = parcel.readString();
                enforceNoDataAvail(parcel);
                retrieveBusinessInfo(readString);
                parcel2.writeNoException();
                return true;
            }
            return false;
        }
    }

    void retrieveBusinessInfo(String str);
}
