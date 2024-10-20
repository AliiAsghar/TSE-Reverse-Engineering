package com.google.android.ims.rcsservice.ims;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IImsConnectionTracker extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static abstract class Stub extends BaseStub implements IImsConnectionTracker {
        static final int TRANSACTION_getRegistrationState = 2;
        static final int TRANSACTION_isRegistered = 1;

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public static class Proxy extends BaseProxy implements IImsConnectionTracker {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcsservice.ims.IImsConnectionTracker");
            }

            @Override // com.google.android.ims.rcsservice.ims.IImsConnectionTracker
            public ImsRegistrationState getRegistrationState() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                ImsRegistrationState imsRegistrationState = (ImsRegistrationState) iax.a(transactAndReadException, ImsRegistrationState.CREATOR);
                transactAndReadException.recycle();
                return imsRegistrationState;
            }

            @Override // com.google.android.ims.rcsservice.ims.IImsConnectionTracker
            public boolean isRegistered() {
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }
        }

        public Stub() {
            super("com.google.android.ims.rcsservice.ims.IImsConnectionTracker");
        }

        public static IImsConnectionTracker asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcsservice.ims.IImsConnectionTracker");
            if (queryLocalInterface instanceof IImsConnectionTracker) {
                return (IImsConnectionTracker) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                ImsRegistrationState registrationState = getRegistrationState();
                parcel2.writeNoException();
                iax.e(parcel2, registrationState);
            } else {
                boolean isRegistered = isRegistered();
                parcel2.writeNoException();
                int i3 = iax.a;
                parcel2.writeInt(isRegistered ? 1 : 0);
            }
            return true;
        }
    }

    ImsRegistrationState getRegistrationState();

    boolean isRegistered();
}
