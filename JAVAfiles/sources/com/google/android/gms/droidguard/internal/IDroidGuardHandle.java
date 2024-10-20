package com.google.android.gms.droidguard.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import defpackage.iax;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IDroidGuardHandle extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IDroidGuardHandle {
        static final int TRANSACTION_close = 3;
        static final int TRANSACTION_init = 1;
        static final int TRANSACTION_initWithExtras = 5;
        static final int TRANSACTION_snapshot = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IDroidGuardHandle {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.droidguard.internal.IDroidGuardHandle");
            }

            @Override // com.google.android.gms.droidguard.internal.IDroidGuardHandle
            public void close() {
                transactOneway(3, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.droidguard.internal.IDroidGuardHandle
            public void init(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.droidguard.internal.IDroidGuardHandle
            public DroidGuardInitReply initWithExtras(String str, DroidGuardResultsRequest droidGuardResultsRequest) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, droidGuardResultsRequest);
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
                DroidGuardInitReply droidGuardInitReply = (DroidGuardInitReply) iax.a(transactAndReadException, DroidGuardInitReply.CREATOR);
                transactAndReadException.recycle();
                return droidGuardInitReply;
            }

            @Override // com.google.android.gms.droidguard.internal.IDroidGuardHandle
            public byte[] snapshot(Map map) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeMap(map);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                byte[] createByteArray = transactAndReadException.createByteArray();
                transactAndReadException.recycle();
                return createByteArray;
            }
        }

        public Stub() {
            super("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
        }

        public static IDroidGuardHandle asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardHandle");
            if (queryLocalInterface instanceof IDroidGuardHandle) {
                return (IDroidGuardHandle) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            return false;
                        }
                        String readString = parcel.readString();
                        DroidGuardResultsRequest droidGuardResultsRequest = (DroidGuardResultsRequest) iax.a(parcel, DroidGuardResultsRequest.CREATOR);
                        enforceNoDataAvail(parcel);
                        DroidGuardInitReply initWithExtras = initWithExtras(readString, droidGuardResultsRequest);
                        parcel2.writeNoException();
                        iax.e(parcel2, initWithExtras);
                    } else {
                        close();
                    }
                } else {
                    HashMap c = iax.c(parcel);
                    enforceNoDataAvail(parcel);
                    byte[] snapshot = snapshot(c);
                    parcel2.writeNoException();
                    parcel2.writeByteArray(snapshot);
                }
            } else {
                String readString2 = parcel.readString();
                enforceNoDataAvail(parcel);
                init(readString2);
            }
            return true;
        }
    }

    void close();

    void init(String str);

    DroidGuardInitReply initWithExtras(String str, DroidGuardResultsRequest droidGuardResultsRequest);

    byte[] snapshot(Map map);
}
