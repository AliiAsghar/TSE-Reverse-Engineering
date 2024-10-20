package com.google.android.play.core.install.protocol;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IInstallServiceCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static abstract class Stub extends BaseStub implements IInstallServiceCallback {
        static final int TRANSACTION_onCompleteUpdate = 3;
        static final int TRANSACTION_onRequestInfo = 2;
        static final int TRANSACTION_onRequestInstall = 1;

        /* compiled from: PG */
        /* loaded from: classes4.dex */
        public static class Proxy extends BaseProxy implements IInstallServiceCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.play.core.install.protocol.IInstallServiceCallback");
            }

            @Override // com.google.android.play.core.install.protocol.IInstallServiceCallback
            public void onCompleteUpdate(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.play.core.install.protocol.IInstallServiceCallback
            public void onRequestInfo(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.play.core.install.protocol.IInstallServiceCallback
            public void onRequestInstall(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.play.core.install.protocol.IInstallServiceCallback");
        }

        public static IInstallServiceCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.install.protocol.IInstallServiceCallback");
            if (queryLocalInterface instanceof IInstallServiceCallback) {
                return (IInstallServiceCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    Bundle bundle = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onCompleteUpdate(bundle);
                } else {
                    Bundle bundle2 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onRequestInfo(bundle2);
                }
            } else {
                Bundle bundle3 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onRequestInstall(bundle3);
            }
            return true;
        }
    }

    void onCompleteUpdate(Bundle bundle);

    void onRequestInfo(Bundle bundle);

    void onRequestInstall(Bundle bundle);
}
