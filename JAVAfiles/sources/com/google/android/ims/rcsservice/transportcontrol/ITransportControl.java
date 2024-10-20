package com.google.android.ims.rcsservice.transportcontrol;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ITransportControl extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static abstract class Stub extends BaseStub implements ITransportControl {
        static final int TRANSACTION_useTransport = 1;

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public static class Proxy extends BaseProxy implements ITransportControl {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcsservice.transportcontrol.ITransportControl");
            }

            @Override // com.google.android.ims.rcsservice.transportcontrol.ITransportControl
            public TransportControlServiceResult useTransport(TransportOptions transportOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, transportOptions);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                TransportControlServiceResult transportControlServiceResult = (TransportControlServiceResult) iax.a(transactAndReadException, TransportControlServiceResult.CREATOR);
                transactAndReadException.recycle();
                return transportControlServiceResult;
            }
        }

        public Stub() {
            super("com.google.android.ims.rcsservice.transportcontrol.ITransportControl");
        }

        public static ITransportControl asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcsservice.transportcontrol.ITransportControl");
            if (queryLocalInterface instanceof ITransportControl) {
                return (ITransportControl) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                TransportOptions transportOptions = (TransportOptions) iax.a(parcel, TransportOptions.CREATOR);
                enforceNoDataAvail(parcel);
                TransportControlServiceResult useTransport = useTransport(transportOptions);
                parcel2.writeNoException();
                iax.e(parcel2, useTransport);
                return true;
            }
            return false;
        }
    }

    TransportControlServiceResult useTransport(TransportOptions transportOptions);
}
