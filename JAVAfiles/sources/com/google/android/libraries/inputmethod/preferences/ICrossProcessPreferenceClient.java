package com.google.android.libraries.inputmethod.preferences;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface ICrossProcessPreferenceClient extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static abstract class Stub extends BaseStub implements ICrossProcessPreferenceClient {
        static final int TRANSACTION_onPreferenceChange = 2;
        static final int TRANSACTION_onServerDestroy = 3;

        /* compiled from: PG */
        /* loaded from: classes4.dex */
        public static class Proxy extends BaseProxy implements ICrossProcessPreferenceClient {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceClient");
            }

            @Override // com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceClient
            public void onPreferenceChange(byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceClient
            public void onServerDestroy() {
                transactOneway(3, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceClient");
        }

        public static ICrossProcessPreferenceClient asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceClient");
            if (queryLocalInterface instanceof ICrossProcessPreferenceClient) {
                return (ICrossProcessPreferenceClient) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                onServerDestroy();
                return true;
            }
            byte[] createByteArray = parcel.createByteArray();
            enforceNoDataAvail(parcel);
            onPreferenceChange(createByteArray);
            return true;
        }
    }

    void onPreferenceChange(byte[] bArr);

    void onServerDestroy();
}
