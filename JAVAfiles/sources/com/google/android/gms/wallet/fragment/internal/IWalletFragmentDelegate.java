package com.google.android.gms.wallet.fragment.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.fragment.WalletFragmentInitParams;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IWalletFragmentDelegate extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IWalletFragmentDelegate {
        static final int TRANSACTION_getState = 13;
        static final int TRANSACTION_initialize = 10;
        static final int TRANSACTION_onActivityResult = 9;
        static final int TRANSACTION_onCreate = 2;
        static final int TRANSACTION_onCreateView = 3;
        static final int TRANSACTION_onInflate = 1;
        static final int TRANSACTION_onPause = 6;
        static final int TRANSACTION_onResume = 5;
        static final int TRANSACTION_onSaveInstanceState = 8;
        static final int TRANSACTION_onStart = 4;
        static final int TRANSACTION_onStop = 7;
        static final int TRANSACTION_setEnabled = 12;
        static final int TRANSACTION_updateMaskedWallet = 14;
        static final int TRANSACTION_updateMaskedWalletRequest = 11;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IWalletFragmentDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            }

            @Override // com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate
            public int getState() {
                Parcel transactAndReadException = transactAndReadException(13, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate
            public void initialize(WalletFragmentInitParams walletFragmentInitParams) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, walletFragmentInitParams);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate
            public void onActivityResult(int i, int i2, Intent intent) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                iax.d(obtainAndWriteInterfaceToken, intent);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate
            public void onCreate(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate
            public IObjectWrapper onCreateView(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper2);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate
            public void onInflate(IObjectWrapper iObjectWrapper, WalletFragmentOptions walletFragmentOptions, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                iax.d(obtainAndWriteInterfaceToken, walletFragmentOptions);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate
            public void onPause() {
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate
            public void onResume() {
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate
            public void onSaveInstanceState(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
                if (transactAndReadException.readInt() != 0) {
                    bundle.readFromParcel(transactAndReadException);
                }
                transactAndReadException.recycle();
            }

            @Override // com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate
            public void onStart() {
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate
            public void onStop() {
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate
            public void setEnabled(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate
            public void updateMaskedWallet(MaskedWallet maskedWallet) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, maskedWallet);
                transactAndReadExceptionReturnVoid(14, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate
            public void updateMaskedWalletRequest(MaskedWalletRequest maskedWalletRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, maskedWalletRequest);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
        }

        public static IWalletFragmentDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.fragment.internal.IWalletFragmentDelegate");
            if (queryLocalInterface instanceof IWalletFragmentDelegate) {
                return (IWalletFragmentDelegate) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    WalletFragmentOptions walletFragmentOptions = (WalletFragmentOptions) iax.a(parcel, WalletFragmentOptions.CREATOR);
                    Bundle bundle = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onInflate(asInterface, walletFragmentOptions, bundle);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    Bundle bundle2 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onCreate(bundle2);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    Bundle bundle3 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    IObjectWrapper onCreateView = onCreateView(asInterface2, asInterface3, bundle3);
                    parcel2.writeNoException();
                    iax.f(parcel2, onCreateView);
                    return true;
                case 4:
                    onStart();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    onResume();
                    parcel2.writeNoException();
                    return true;
                case 6:
                    onPause();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    onStop();
                    parcel2.writeNoException();
                    return true;
                case 8:
                    Bundle bundle4 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onSaveInstanceState(bundle4);
                    parcel2.writeNoException();
                    iax.e(parcel2, bundle4);
                    return true;
                case 9:
                    int readInt = parcel.readInt();
                    int readInt2 = parcel.readInt();
                    Intent intent = (Intent) iax.a(parcel, Intent.CREATOR);
                    enforceNoDataAvail(parcel);
                    onActivityResult(readInt, readInt2, intent);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    WalletFragmentInitParams walletFragmentInitParams = (WalletFragmentInitParams) iax.a(parcel, WalletFragmentInitParams.CREATOR);
                    enforceNoDataAvail(parcel);
                    initialize(walletFragmentInitParams);
                    parcel2.writeNoException();
                    return true;
                case 11:
                    MaskedWalletRequest maskedWalletRequest = (MaskedWalletRequest) iax.a(parcel, MaskedWalletRequest.CREATOR);
                    enforceNoDataAvail(parcel);
                    updateMaskedWalletRequest(maskedWalletRequest);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    boolean g = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setEnabled(g);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    int state = getState();
                    parcel2.writeNoException();
                    parcel2.writeInt(state);
                    return true;
                case 14:
                    MaskedWallet maskedWallet = (MaskedWallet) iax.a(parcel, MaskedWallet.CREATOR);
                    enforceNoDataAvail(parcel);
                    updateMaskedWallet(maskedWallet);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    int getState();

    void initialize(WalletFragmentInitParams walletFragmentInitParams);

    void onActivityResult(int i, int i2, Intent intent);

    void onCreate(Bundle bundle);

    IObjectWrapper onCreateView(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, Bundle bundle);

    void onInflate(IObjectWrapper iObjectWrapper, WalletFragmentOptions walletFragmentOptions, Bundle bundle);

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onStart();

    void onStop();

    void setEnabled(boolean z);

    void updateMaskedWallet(MaskedWallet maskedWallet);

    void updateMaskedWalletRequest(MaskedWalletRequest maskedWalletRequest);
}
