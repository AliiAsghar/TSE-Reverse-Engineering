package com.google.android.setupcompat.portal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.setupcompat.portal.IPortalProgressCallback;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IPortalProgressService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static abstract class Stub extends BaseStub implements IPortalProgressService {
        static final int TRANSACTION_onAllowMobileData = 4;
        static final int TRANSACTION_onGetRemainingValues = 5;
        static final int TRANSACTION_onPortalSessionStart = 1;
        static final int TRANSACTION_onSetCallback = 2;
        static final int TRANSACTION_onSuspend = 3;

        /* compiled from: PG */
        /* loaded from: classes4.dex */
        public static class Proxy extends BaseProxy implements IPortalProgressService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.setupcompat.portal.IPortalProgressService");
            }

            @Override // com.google.android.setupcompat.portal.IPortalProgressService
            public void onAllowMobileData(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.setupcompat.portal.IPortalProgressService
            public Bundle onGetRemainingValues() {
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
                Bundle bundle = (Bundle) iax.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.setupcompat.portal.IPortalProgressService
            public void onPortalSessionStart() {
                transactOneway(1, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.setupcompat.portal.IPortalProgressService
            public void onSetCallback(IPortalProgressCallback iPortalProgressCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iPortalProgressCallback);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.setupcompat.portal.IPortalProgressService
            public void onSuspend() {
                transactOneway(3, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.setupcompat.portal.IPortalProgressService");
        }

        public static IPortalProgressService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.setupcompat.portal.IPortalProgressService");
            if (queryLocalInterface instanceof IPortalProgressService) {
                return (IPortalProgressService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return false;
                            }
                            Bundle onGetRemainingValues = onGetRemainingValues();
                            parcel2.writeNoException();
                            iax.e(parcel2, onGetRemainingValues);
                        } else {
                            boolean g = iax.g(parcel);
                            enforceNoDataAvail(parcel);
                            onAllowMobileData(g);
                        }
                    } else {
                        onSuspend();
                    }
                } else {
                    IPortalProgressCallback asInterface = IPortalProgressCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    onSetCallback(asInterface);
                }
            } else {
                onPortalSessionStart();
            }
            return true;
        }
    }

    void onAllowMobileData(boolean z);

    Bundle onGetRemainingValues();

    void onPortalSessionStart();

    void onSetCallback(IPortalProgressCallback iPortalProgressCallback);

    void onSuspend();
}
