package com.google.firebase.appindexing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.firebase.appindexing.internal.IAppIndexingCallback;
import defpackage.aoea;
import defpackage.aoeb;
import defpackage.aoef;
import defpackage.aoeh;
import defpackage.aoej;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IAppIndexingService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static abstract class Stub extends BaseStub implements IAppIndexingService {
        static final int TRANSACTION_get = 10;
        static final int TRANSACTION_getIndexable = 5;
        static final int TRANSACTION_mutate = 8;
        static final int TRANSACTION_patch = 7;
        static final int TRANSACTION_remove = 2;
        static final int TRANSACTION_removeAll = 3;
        static final int TRANSACTION_removeTypes = 9;
        static final int TRANSACTION_search = 6;
        static final int TRANSACTION_update = 1;

        /* compiled from: PG */
        /* loaded from: classes4.dex */
        public static class Proxy extends BaseProxy implements IAppIndexingService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.firebase.appindexing.internal.IAppIndexingService");
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingService
            public void get(IAppIndexingCallback iAppIndexingCallback, String[] strArr, aoea aoeaVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iAppIndexingCallback);
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                iax.d(obtainAndWriteInterfaceToken, aoeaVar);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingService
            public void getIndexable(IAppIndexingCallback iAppIndexingCallback, aoeh aoehVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iAppIndexingCallback);
                iax.d(obtainAndWriteInterfaceToken, aoehVar);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingService
            public aoef mutate(IStatusCallback iStatusCallback, aoej aoejVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                iax.d(obtainAndWriteInterfaceToken, aoejVar);
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
                aoef aoefVar = (aoef) iax.a(transactAndReadException, aoef.CREATOR);
                transactAndReadException.recycle();
                return aoefVar;
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingService
            public void patch(IStatusCallback iStatusCallback, Thing[] thingArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeTypedArray(thingArr, 0);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingService
            public void remove(IStatusCallback iStatusCallback, String[] strArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingService
            public void removeAll(IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingService
            public void removeTypes(IStatusCallback iStatusCallback, String[] strArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingService
            public void search(IAppIndexingCallback iAppIndexingCallback, aoeb[] aoebVarArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iAppIndexingCallback);
                obtainAndWriteInterfaceToken.writeTypedArray(aoebVarArr, 0);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.firebase.appindexing.internal.IAppIndexingService
            public void update(IStatusCallback iStatusCallback, Thing[] thingArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                obtainAndWriteInterfaceToken.writeTypedArray(thingArr, 0);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.firebase.appindexing.internal.IAppIndexingService");
        }

        public static IAppIndexingService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.appindexing.internal.IAppIndexingService");
            if (queryLocalInterface instanceof IAppIndexingService) {
                return (IAppIndexingService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IStatusCallback asInterface = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Thing[] thingArr = (Thing[]) parcel.createTypedArray(Thing.CREATOR);
                    enforceNoDataAvail(parcel);
                    update(asInterface, thingArr);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    IStatusCallback asInterface2 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String[] createStringArray = parcel.createStringArray();
                    enforceNoDataAvail(parcel);
                    remove(asInterface2, createStringArray);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    IStatusCallback asInterface3 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    removeAll(asInterface3);
                    parcel2.writeNoException();
                    return true;
                case 4:
                default:
                    return false;
                case 5:
                    IAppIndexingCallback asInterface4 = IAppIndexingCallback.Stub.asInterface(parcel.readStrongBinder());
                    aoeh aoehVar = (aoeh) iax.a(parcel, aoeh.CREATOR);
                    enforceNoDataAvail(parcel);
                    getIndexable(asInterface4, aoehVar);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    IAppIndexingCallback asInterface5 = IAppIndexingCallback.Stub.asInterface(parcel.readStrongBinder());
                    aoeb[] aoebVarArr = (aoeb[]) parcel.createTypedArray(aoeb.CREATOR);
                    enforceNoDataAvail(parcel);
                    search(asInterface5, aoebVarArr);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    IStatusCallback asInterface6 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    Thing[] thingArr2 = (Thing[]) parcel.createTypedArray(Thing.CREATOR);
                    enforceNoDataAvail(parcel);
                    patch(asInterface6, thingArr2);
                    parcel2.writeNoException();
                    return true;
                case 8:
                    IStatusCallback asInterface7 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    aoej aoejVar = (aoej) iax.a(parcel, aoej.CREATOR);
                    enforceNoDataAvail(parcel);
                    aoef mutate = mutate(asInterface7, aoejVar);
                    parcel2.writeNoException();
                    iax.e(parcel2, mutate);
                    return true;
                case 9:
                    IStatusCallback asInterface8 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                    String[] createStringArray2 = parcel.createStringArray();
                    enforceNoDataAvail(parcel);
                    removeTypes(asInterface8, createStringArray2);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    IAppIndexingCallback asInterface9 = IAppIndexingCallback.Stub.asInterface(parcel.readStrongBinder());
                    String[] createStringArray3 = parcel.createStringArray();
                    aoea aoeaVar = (aoea) iax.a(parcel, aoea.CREATOR);
                    enforceNoDataAvail(parcel);
                    get(asInterface9, createStringArray3, aoeaVar);
                    parcel2.writeNoException();
                    return true;
            }
        }
    }

    void get(IAppIndexingCallback iAppIndexingCallback, String[] strArr, aoea aoeaVar);

    void getIndexable(IAppIndexingCallback iAppIndexingCallback, aoeh aoehVar);

    aoef mutate(IStatusCallback iStatusCallback, aoej aoejVar);

    void patch(IStatusCallback iStatusCallback, Thing[] thingArr);

    void remove(IStatusCallback iStatusCallback, String[] strArr);

    void removeAll(IStatusCallback iStatusCallback);

    void removeTypes(IStatusCallback iStatusCallback, String[] strArr);

    void search(IAppIndexingCallback iAppIndexingCallback, aoeb[] aoebVarArr);

    void update(IStatusCallback iStatusCallback, Thing[] thingArr);
}
