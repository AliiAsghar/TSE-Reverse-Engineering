package com.google.firebase.appindexing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.aoec;
import defpackage.aoei;
import defpackage.iax;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IAppIndexingCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static abstract class Stub extends BaseStub implements IAppIndexingCallback {
        static final int TRANSACTION_onGet = 4;
        static final int TRANSACTION_onGetIndexableResponse = 2;
        static final int TRANSACTION_onSearch = 3;

        /* compiled from: PG */
        /* loaded from: classes4.dex */
        public static class Proxy extends BaseProxy implements IAppIndexingCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.firebase.appindexing.internal.IAppIndexingCallback");
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingCallback
            public void onGet(Status status, List<Thing> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeList(list);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingCallback
            public void onGetIndexableResponse(aoei aoeiVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, aoeiVar);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingCallback
            public void onSearch(Status status, aoec[] aoecVarArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeTypedArray(aoecVarArr, 0);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.firebase.appindexing.internal.IAppIndexingCallback");
        }

        public static IAppIndexingCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.appindexing.internal.IAppIndexingCallback");
            if (queryLocalInterface instanceof IAppIndexingCallback) {
                return (IAppIndexingCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                    Status status = (Status) iax.a(parcel, Status.CREATOR);
                    ArrayList b = iax.b(parcel);
                    enforceNoDataAvail(parcel);
                    onGet(status, b);
                    return true;
                }
                Status status2 = (Status) iax.a(parcel, Status.CREATOR);
                aoec[] aoecVarArr = (aoec[]) parcel.createTypedArray(aoec.CREATOR);
                enforceNoDataAvail(parcel);
                onSearch(status2, aoecVarArr);
                return true;
            }
            aoei aoeiVar = (aoei) iax.a(parcel, aoei.CREATOR);
            enforceNoDataAvail(parcel);
            onGetIndexableResponse(aoeiVar);
            return true;
        }
    }

    void onGet(Status status, List<Thing> list);

    void onGetIndexableResponse(aoei aoeiVar);

    void onSearch(Status status, aoec[] aoecVarArr);
}
