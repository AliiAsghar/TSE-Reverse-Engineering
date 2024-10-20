package com.google.android.ims.client.capabilities;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.ims.client.capabilities.CapabilitiesListenerInternal;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ICapabilitiesExchangeService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static abstract class Stub extends BaseStub implements ICapabilitiesExchangeService {
        static final int TRANSACTION_registerCapabilitiesListener = 1;
        static final int TRANSACTION_requestCapabilities = 3;
        static final int TRANSACTION_requestMultipleCapabilities = 4;
        static final int TRANSACTION_unregisterCapabilitiesListener = 2;

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public static class Proxy extends BaseProxy implements ICapabilitiesExchangeService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.client.capabilities.ICapabilitiesExchangeService");
            }

            @Override // com.google.android.ims.client.capabilities.ICapabilitiesExchangeService
            public boolean registerCapabilitiesListener(CapabilitiesListenerInternal capabilitiesListenerInternal, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, capabilitiesListenerInternal);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.ims.client.capabilities.ICapabilitiesExchangeService
            public int requestCapabilities(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.ims.client.capabilities.ICapabilitiesExchangeService
            public int requestMultipleCapabilities(String[] strArr, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.ims.client.capabilities.ICapabilitiesExchangeService
            public boolean unregisterCapabilitiesListener(CapabilitiesListenerInternal capabilitiesListenerInternal, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, capabilitiesListenerInternal);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }
        }

        public Stub() {
            super("com.google.android.ims.client.capabilities.ICapabilitiesExchangeService");
        }

        public static ICapabilitiesExchangeService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.client.capabilities.ICapabilitiesExchangeService");
            if (queryLocalInterface instanceof ICapabilitiesExchangeService) {
                return (ICapabilitiesExchangeService) queryLocalInterface;
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
                        String[] createStringArray = parcel.createStringArray();
                        Bundle bundle = (Bundle) iax.a(parcel, Bundle.CREATOR);
                        enforceNoDataAvail(parcel);
                        int requestMultipleCapabilities = requestMultipleCapabilities(createStringArray, bundle);
                        parcel2.writeNoException();
                        parcel2.writeInt(requestMultipleCapabilities);
                    } else {
                        String readString = parcel.readString();
                        Bundle bundle2 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                        enforceNoDataAvail(parcel);
                        int requestCapabilities = requestCapabilities(readString, bundle2);
                        parcel2.writeNoException();
                        parcel2.writeInt(requestCapabilities);
                    }
                } else {
                    CapabilitiesListenerInternal asInterface = CapabilitiesListenerInternal.Stub.asInterface(parcel.readStrongBinder());
                    Bundle bundle3 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    boolean unregisterCapabilitiesListener = unregisterCapabilitiesListener(asInterface, bundle3);
                    parcel2.writeNoException();
                    parcel2.writeInt(unregisterCapabilitiesListener ? 1 : 0);
                }
            } else {
                CapabilitiesListenerInternal asInterface2 = CapabilitiesListenerInternal.Stub.asInterface(parcel.readStrongBinder());
                Bundle bundle4 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                boolean registerCapabilitiesListener = registerCapabilitiesListener(asInterface2, bundle4);
                parcel2.writeNoException();
                parcel2.writeInt(registerCapabilitiesListener ? 1 : 0);
            }
            return true;
        }
    }

    boolean registerCapabilitiesListener(CapabilitiesListenerInternal capabilitiesListenerInternal, Bundle bundle);

    int requestCapabilities(String str, Bundle bundle);

    int requestMultipleCapabilities(String[] strArr, Bundle bundle);

    boolean unregisterCapabilitiesListener(CapabilitiesListenerInternal capabilitiesListenerInternal, Bundle bundle);
}
