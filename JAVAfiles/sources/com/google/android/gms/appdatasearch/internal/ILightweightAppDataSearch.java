package com.google.android.gms.appdatasearch.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Request;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks;
import defpackage.aoee;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ILightweightAppDataSearch extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ILightweightAppDataSearch {
        static final int TRANSACTION_getFileDescriptorAndDelete = 2;
        static final int TRANSACTION_getRecentContext = 5;
        static final int TRANSACTION_registerCompletionFilter = 6;
        static final int TRANSACTION_reportUsage = 1;
        static final int TRANSACTION_reportUserActions = 7;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ILightweightAppDataSearch {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            }

            @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch
            public void getFileDescriptorAndDelete(ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iLightweightAppDataSearchCallbacks);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch
            public void getRecentContext(GetRecentContextCall$Request getRecentContextCall$Request, ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getRecentContextCall$Request);
                iax.f(obtainAndWriteInterfaceToken, iLightweightAppDataSearchCallbacks);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch
            public void registerCompletionFilter(ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacks, String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iLightweightAppDataSearchCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch
            public void reportUsage(ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacks, String str, UsageInfo[] usageInfoArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iLightweightAppDataSearchCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeTypedArray(usageInfoArr, 0);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch
            public void reportUserActions(ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacks, aoee[] aoeeVarArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iLightweightAppDataSearchCallbacks);
                obtainAndWriteInterfaceToken.writeTypedArray(aoeeVarArr, 0);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        }

        public static ILightweightAppDataSearch asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
            if (queryLocalInterface instanceof ILightweightAppDataSearch) {
                return (ILightweightAppDataSearch) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 7) {
                                return false;
                            }
                            ILightweightAppDataSearchCallbacks asInterface = ILightweightAppDataSearchCallbacks.Stub.asInterface(parcel.readStrongBinder());
                            aoee[] aoeeVarArr = (aoee[]) parcel.createTypedArray(aoee.CREATOR);
                            enforceNoDataAvail(parcel);
                            reportUserActions(asInterface, aoeeVarArr);
                        } else {
                            ILightweightAppDataSearchCallbacks asInterface2 = ILightweightAppDataSearchCallbacks.Stub.asInterface(parcel.readStrongBinder());
                            String readString = parcel.readString();
                            String readString2 = parcel.readString();
                            enforceNoDataAvail(parcel);
                            registerCompletionFilter(asInterface2, readString, readString2);
                        }
                    } else {
                        GetRecentContextCall$Request getRecentContextCall$Request = (GetRecentContextCall$Request) iax.a(parcel, GetRecentContextCall$Request.CREATOR);
                        ILightweightAppDataSearchCallbacks asInterface3 = ILightweightAppDataSearchCallbacks.Stub.asInterface(parcel.readStrongBinder());
                        enforceNoDataAvail(parcel);
                        getRecentContext(getRecentContextCall$Request, asInterface3);
                    }
                } else {
                    ILightweightAppDataSearchCallbacks asInterface4 = ILightweightAppDataSearchCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getFileDescriptorAndDelete(asInterface4);
                }
            } else {
                ILightweightAppDataSearchCallbacks asInterface5 = ILightweightAppDataSearchCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                UsageInfo[] usageInfoArr = (UsageInfo[]) parcel.createTypedArray(UsageInfo.CREATOR);
                enforceNoDataAvail(parcel);
                reportUsage(asInterface5, readString3, usageInfoArr);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getFileDescriptorAndDelete(ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacks);

    void getRecentContext(GetRecentContextCall$Request getRecentContextCall$Request, ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacks);

    void registerCompletionFilter(ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacks, String str, String str2);

    void reportUsage(ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacks, String str, UsageInfo[] usageInfoArr);

    void reportUserActions(ILightweightAppDataSearchCallbacks iLightweightAppDataSearchCallbacks, aoee[] aoeeVarArr);
}
