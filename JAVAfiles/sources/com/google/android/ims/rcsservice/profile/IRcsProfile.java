package com.google.android.ims.rcsservice.profile;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IRcsProfile extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static abstract class Stub extends BaseStub implements IRcsProfile {
        static final int TRANSACTION_getRcsConfig = 3;
        static final int TRANSACTION_getValue = 1;

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public static class Proxy extends BaseProxy implements IRcsProfile {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcsservice.profile.IRcsProfile");
            }

            @Override // com.google.android.ims.rcsservice.profile.IRcsProfile
            public Bundle getRcsConfig() {
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                Bundle bundle = (Bundle) iax.a(transactAndReadException, Bundle.CREATOR);
                transactAndReadException.recycle();
                return bundle;
            }

            @Override // com.google.android.ims.rcsservice.profile.IRcsProfile
            public RcsProfileServiceResult getValue(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                RcsProfileServiceResult rcsProfileServiceResult = (RcsProfileServiceResult) iax.a(transactAndReadException, RcsProfileServiceResult.CREATOR);
                transactAndReadException.recycle();
                return rcsProfileServiceResult;
            }
        }

        public Stub() {
            super("com.google.android.ims.rcsservice.profile.IRcsProfile");
        }

        public static IRcsProfile asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcsservice.profile.IRcsProfile");
            if (queryLocalInterface instanceof IRcsProfile) {
                return (IRcsProfile) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 3) {
                    return false;
                }
                Bundle rcsConfig = getRcsConfig();
                parcel2.writeNoException();
                iax.e(parcel2, rcsConfig);
            } else {
                int readInt = parcel.readInt();
                enforceNoDataAvail(parcel);
                RcsProfileServiceResult value = getValue(readInt);
                parcel2.writeNoException();
                iax.e(parcel2, value);
            }
            return true;
        }
    }

    Bundle getRcsConfig();

    RcsProfileServiceResult getValue(int i);
}
