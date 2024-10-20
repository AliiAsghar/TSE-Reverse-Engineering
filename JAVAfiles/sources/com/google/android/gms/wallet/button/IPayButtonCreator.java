package com.google.android.gms.wallet.button;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IPayButtonCreator extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IPayButtonCreator {
        static final int TRANSACTION_newPayButton = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IPayButtonCreator {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.wallet.button.IPayButtonCreator");
            }

            @Override // com.google.android.gms.wallet.button.IPayButtonCreator
            public IObjectWrapper newPayButton(IObjectWrapper iObjectWrapper, ButtonOptions buttonOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                iax.d(obtainAndWriteInterfaceToken, buttonOptions);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }
        }

        public Stub() {
            super("com.google.android.gms.wallet.button.IPayButtonCreator");
        }

        public static IPayButtonCreator asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.button.IPayButtonCreator");
            if (queryLocalInterface instanceof IPayButtonCreator) {
                return (IPayButtonCreator) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                ButtonOptions buttonOptions = (ButtonOptions) iax.a(parcel, ButtonOptions.CREATOR);
                enforceNoDataAvail(parcel);
                IObjectWrapper newPayButton = newPayButton(asInterface, buttonOptions);
                parcel2.writeNoException();
                iax.f(parcel2, newPayButton);
                return true;
            }
            return false;
        }
    }

    IObjectWrapper newPayButton(IObjectWrapper iObjectWrapper, ButtonOptions buttonOptions);
}
