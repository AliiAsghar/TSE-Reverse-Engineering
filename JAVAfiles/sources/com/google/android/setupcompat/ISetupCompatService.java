package com.google.android.setupcompat;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface ISetupCompatService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static abstract class Stub extends BaseStub implements ISetupCompatService {
        static final int TRANSACTION_logMetric = 2;
        static final int TRANSACTION_onFocusStatusChanged = 3;

        /* compiled from: PG */
        /* loaded from: classes4.dex */
        public static class Proxy extends BaseProxy implements ISetupCompatService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.setupcompat.ISetupCompatService");
            }

            @Override // com.google.android.setupcompat.ISetupCompatService
            public void logMetric(int i, Bundle bundle, Bundle bundle2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                iax.d(obtainAndWriteInterfaceToken, bundle2);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.setupcompat.ISetupCompatService
            public void onFocusStatusChanged(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.setupcompat.ISetupCompatService");
        }

        public static ISetupCompatService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.setupcompat.ISetupCompatService");
            if (queryLocalInterface instanceof ISetupCompatService) {
                return (ISetupCompatService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                Bundle bundle = (Bundle) iax.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onFocusStatusChanged(bundle);
                return true;
            }
            int readInt = parcel.readInt();
            Bundle bundle2 = (Bundle) iax.a(parcel, Bundle.CREATOR);
            Bundle bundle3 = (Bundle) iax.a(parcel, Bundle.CREATOR);
            enforceNoDataAvail(parcel);
            logMetric(readInt, bundle2, bundle3);
            return true;
        }
    }

    void logMetric(int i, Bundle bundle, Bundle bundle2);

    void onFocusStatusChanged(Bundle bundle);
}
