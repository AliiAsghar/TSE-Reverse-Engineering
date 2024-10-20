package com.google.android.gms.appdatasearch.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Response;
import com.google.android.gms.common.api.Status;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ILightweightAppDataSearchCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ILightweightAppDataSearchCallbacks {
        static final int TRANSACTION_onFileDescriptor = 2;
        static final int TRANSACTION_onGetRecentContextResponse = 4;
        static final int TRANSACTION_onStatus = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ILightweightAppDataSearchCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
            }

            @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks
            public void onFileDescriptor(Status status, ParcelFileDescriptor parcelFileDescriptor) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, parcelFileDescriptor);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks
            public void onGetRecentContextResponse(GetRecentContextCall$Response getRecentContextCall$Response) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getRecentContextCall$Response);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks
            public void onStatus(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
        }

        public static ILightweightAppDataSearchCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
            if (queryLocalInterface instanceof ILightweightAppDataSearchCallbacks) {
                return (ILightweightAppDataSearchCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        return false;
                    }
                    GetRecentContextCall$Response getRecentContextCall$Response = (GetRecentContextCall$Response) iax.a(parcel, GetRecentContextCall$Response.CREATOR);
                    enforceNoDataAvail(parcel);
                    onGetRecentContextResponse(getRecentContextCall$Response);
                } else {
                    Status status = (Status) iax.a(parcel, Status.CREATOR);
                    ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) iax.a(parcel, ParcelFileDescriptor.CREATOR);
                    enforceNoDataAvail(parcel);
                    onFileDescriptor(status, parcelFileDescriptor);
                }
            } else {
                Status status2 = (Status) iax.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                onStatus(status2);
            }
            return true;
        }
    }

    void onFileDescriptor(Status status, ParcelFileDescriptor parcelFileDescriptor);

    void onGetRecentContextResponse(GetRecentContextCall$Response getRecentContextCall$Response);

    void onStatus(Status status);
}
