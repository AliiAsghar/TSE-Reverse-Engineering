package com.google.android.gms.wallet.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IFragmentWrapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;
import com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate;
import com.google.android.gms.wallet.fragment.internal.IWalletFragmentStateListener;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IWalletDynamiteCreator extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IWalletDynamiteCreator {
        static final int TRANSACTION_newWalletFragmentDelegate = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IWalletDynamiteCreator {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
            }

            @Override // com.google.android.gms.wallet.internal.IWalletDynamiteCreator
            public IWalletFragmentDelegate newWalletFragmentDelegate(IObjectWrapper iObjectWrapper, IFragmentWrapper iFragmentWrapper, WalletFragmentOptions walletFragmentOptions, IWalletFragmentStateListener iWalletFragmentStateListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                iax.f(obtainAndWriteInterfaceToken, iFragmentWrapper);
                iax.d(obtainAndWriteInterfaceToken, walletFragmentOptions);
                iax.f(obtainAndWriteInterfaceToken, iWalletFragmentStateListener);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                IWalletFragmentDelegate asInterface = IWalletFragmentDelegate.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }
        }

        public Stub() {
            super("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
        }

        public static IWalletDynamiteCreator asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
            if (queryLocalInterface instanceof IWalletDynamiteCreator) {
                return (IWalletDynamiteCreator) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IFragmentWrapper asInterface2 = IFragmentWrapper.Stub.asInterface(parcel.readStrongBinder());
                WalletFragmentOptions walletFragmentOptions = (WalletFragmentOptions) iax.a(parcel, WalletFragmentOptions.CREATOR);
                IWalletFragmentStateListener asInterface3 = IWalletFragmentStateListener.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                IWalletFragmentDelegate newWalletFragmentDelegate = newWalletFragmentDelegate(asInterface, asInterface2, walletFragmentOptions, asInterface3);
                parcel2.writeNoException();
                iax.f(parcel2, newWalletFragmentDelegate);
                return true;
            }
            return false;
        }
    }

    IWalletFragmentDelegate newWalletFragmentDelegate(IObjectWrapper iObjectWrapper, IFragmentWrapper iFragmentWrapper, WalletFragmentOptions walletFragmentOptions, IWalletFragmentStateListener iWalletFragmentStateListener);
}
