package com.google.android.gms.auth.account.device.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IDeviceAccountCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IDeviceAccountCallbacks {
        static final int TRANSACTION_onCastCertificateAddedToDeviceAccount = 1;
        static final int TRANSACTION_onGetDeviceAccountJwt = 3;
        static final int TRANSACTION_onGetIddid = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IDeviceAccountCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.account.device.internal.IDeviceAccountCallbacks");
            }

            @Override // com.google.android.gms.auth.account.device.internal.IDeviceAccountCallbacks
            public void onCastCertificateAddedToDeviceAccount(Status status, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeString(str);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.device.internal.IDeviceAccountCallbacks
            public void onGetDeviceAccountJwt(Status status, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeString(str);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.auth.account.device.internal.IDeviceAccountCallbacks
            public void onGetIddid(Status status, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeString(str);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.account.device.internal.IDeviceAccountCallbacks");
        }

        public static IDeviceAccountCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.device.internal.IDeviceAccountCallbacks");
            if (queryLocalInterface instanceof IDeviceAccountCallbacks) {
                return (IDeviceAccountCallbacks) queryLocalInterface;
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
                    Status status = (Status) iax.a(parcel, Status.CREATOR);
                    String readString = parcel.readString();
                    enforceNoDataAvail(parcel);
                    onGetDeviceAccountJwt(status, readString);
                } else {
                    Status status2 = (Status) iax.a(parcel, Status.CREATOR);
                    String readString2 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    onGetIddid(status2, readString2);
                }
            } else {
                Status status3 = (Status) iax.a(parcel, Status.CREATOR);
                String readString3 = parcel.readString();
                enforceNoDataAvail(parcel);
                onCastCertificateAddedToDeviceAccount(status3, readString3);
            }
            return true;
        }
    }

    void onCastCertificateAddedToDeviceAccount(Status status, String str);

    void onGetDeviceAccountJwt(Status status, String str);

    void onGetIddid(Status status, String str);
}
