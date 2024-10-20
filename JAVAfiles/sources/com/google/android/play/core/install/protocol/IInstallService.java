package com.google.android.play.core.install.protocol;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.play.core.install.protocol.IInstallServiceCallback;
import defpackage.iax;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IInstallService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static abstract class Stub extends BaseStub implements IInstallService {
        static final int TRANSACTION_completeUpdate = 3;
        static final int TRANSACTION_requestInfo = 2;
        static final int TRANSACTION_requestInstall = 1;

        /* compiled from: PG */
        /* loaded from: classes4.dex */
        public static class Proxy extends BaseProxy implements IInstallService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.play.core.install.protocol.IInstallService");
            }

            @Override // com.google.android.play.core.install.protocol.IInstallService
            public void completeUpdate(String str, Bundle bundle, IInstallServiceCallback iInstallServiceCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                iax.f(obtainAndWriteInterfaceToken, iInstallServiceCallback);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.play.core.install.protocol.IInstallService
            public void requestInfo(String str, Bundle bundle, IInstallServiceCallback iInstallServiceCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                iax.f(obtainAndWriteInterfaceToken, iInstallServiceCallback);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.play.core.install.protocol.IInstallService
            public void requestInstall(String str, List<Bundle> list, Bundle bundle, IInstallServiceCallback iInstallServiceCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                iax.f(obtainAndWriteInterfaceToken, iInstallServiceCallback);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.play.core.install.protocol.IInstallService");
        }

        public static IInstallService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.install.protocol.IInstallService");
            if (queryLocalInterface instanceof IInstallService) {
                return (IInstallService) queryLocalInterface;
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
                    String readString = parcel.readString();
                    Bundle bundle = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    IInstallServiceCallback asInterface = IInstallServiceCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    completeUpdate(readString, bundle, asInterface);
                } else {
                    String readString2 = parcel.readString();
                    Bundle bundle2 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    IInstallServiceCallback asInterface2 = IInstallServiceCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    requestInfo(readString2, bundle2, asInterface2);
                }
            } else {
                String readString3 = parcel.readString();
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                Bundle bundle3 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                IInstallServiceCallback asInterface3 = IInstallServiceCallback.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                requestInstall(readString3, createTypedArrayList, bundle3, asInterface3);
            }
            return true;
        }
    }

    void completeUpdate(String str, Bundle bundle, IInstallServiceCallback iInstallServiceCallback);

    void requestInfo(String str, Bundle bundle, IInstallServiceCallback iInstallServiceCallback);

    void requestInstall(String str, List<Bundle> list, Bundle bundle, IInstallServiceCallback iInstallServiceCallback);
}
