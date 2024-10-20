package com.google.android.gms.fido.credentialstore.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.credentialstore.KeyData;
import defpackage.iax;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IKeyDataListCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IKeyDataListCallbacks {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IKeyDataListCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.credentialstore.internal.IKeyDataListCallbacks");
            }

            @Override // com.google.android.gms.fido.credentialstore.internal.IKeyDataListCallbacks
            public void onResult(Status status, List<KeyData> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.credentialstore.internal.IKeyDataListCallbacks");
        }

        public static IKeyDataListCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.credentialstore.internal.IKeyDataListCallbacks");
            if (queryLocalInterface instanceof IKeyDataListCallbacks) {
                return (IKeyDataListCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) iax.a(parcel, Status.CREATOR);
                ArrayList createTypedArrayList = parcel.createTypedArrayList(KeyData.CREATOR);
                enforceNoDataAvail(parcel);
                onResult(status, createTypedArrayList);
                return true;
            }
            return false;
        }
    }

    void onResult(Status status, List<KeyData> list);
}
