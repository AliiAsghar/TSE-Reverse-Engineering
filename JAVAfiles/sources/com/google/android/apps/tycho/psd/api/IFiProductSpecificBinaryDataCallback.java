package com.google.android.apps.tycho.psd.api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.feedback.FileTeleporter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IFiProductSpecificBinaryDataCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IFiProductSpecificBinaryDataCallback {
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onSuccess = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IFiProductSpecificBinaryDataCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.tycho.psd.api.IFiProductSpecificBinaryDataCallback");
            }

            @Override // com.google.android.apps.tycho.psd.api.IFiProductSpecificBinaryDataCallback
            public void onError(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.apps.tycho.psd.api.IFiProductSpecificBinaryDataCallback
            public void onSuccess(List<FileTeleporter> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeTypedList(list);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.tycho.psd.api.IFiProductSpecificBinaryDataCallback");
        }

        public static IFiProductSpecificBinaryDataCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.tycho.psd.api.IFiProductSpecificBinaryDataCallback");
            if (queryLocalInterface instanceof IFiProductSpecificBinaryDataCallback) {
                return (IFiProductSpecificBinaryDataCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                String readString = parcel.readString();
                enforceNoDataAvail(parcel);
                onError(readString);
            } else {
                ArrayList createTypedArrayList = parcel.createTypedArrayList(FileTeleporter.CREATOR);
                enforceNoDataAvail(parcel);
                onSuccess(createTypedArrayList);
            }
            return true;
        }
    }

    void onError(String str);

    void onSuccess(List<FileTeleporter> list);
}
