package com.google.android.ims.rcs.singleregistration;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ISingleRegistrationVendorImsController extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static abstract class Stub extends BaseStub implements ISingleRegistrationVendorImsController {
        static final int TRANSACTION_setupVendorIms = 1;
        static final int TRANSACTION_terminateVendorIms = 2;

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public static class Proxy extends BaseProxy implements ISingleRegistrationVendorImsController {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController");
            }

            @Override // com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController
            public SingleRegistrationVendorImsServiceResult setupVendorIms(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                SingleRegistrationVendorImsServiceResult singleRegistrationVendorImsServiceResult = (SingleRegistrationVendorImsServiceResult) iax.a(transactAndReadException, SingleRegistrationVendorImsServiceResult.CREATOR);
                transactAndReadException.recycle();
                return singleRegistrationVendorImsServiceResult;
            }

            @Override // com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController
            public SingleRegistrationVendorImsServiceResult terminateVendorIms(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                SingleRegistrationVendorImsServiceResult singleRegistrationVendorImsServiceResult = (SingleRegistrationVendorImsServiceResult) iax.a(transactAndReadException, SingleRegistrationVendorImsServiceResult.CREATOR);
                transactAndReadException.recycle();
                return singleRegistrationVendorImsServiceResult;
            }
        }

        public Stub() {
            super("com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController");
        }

        public static ISingleRegistrationVendorImsController asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController");
            if (queryLocalInterface instanceof ISingleRegistrationVendorImsController) {
                return (ISingleRegistrationVendorImsController) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                int readInt = parcel.readInt();
                enforceNoDataAvail(parcel);
                SingleRegistrationVendorImsServiceResult terminateVendorIms = terminateVendorIms(readInt);
                parcel2.writeNoException();
                iax.e(parcel2, terminateVendorIms);
            } else {
                int readInt2 = parcel.readInt();
                enforceNoDataAvail(parcel);
                SingleRegistrationVendorImsServiceResult singleRegistrationVendorImsServiceResult = setupVendorIms(readInt2);
                parcel2.writeNoException();
                iax.e(parcel2, singleRegistrationVendorImsServiceResult);
            }
            return true;
        }
    }

    SingleRegistrationVendorImsServiceResult setupVendorIms(int i);

    SingleRegistrationVendorImsServiceResult terminateVendorIms(int i);
}
