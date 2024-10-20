package com.google.android.libraries.subscriptions.restore;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface IG1Restore extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static abstract class Stub extends BaseStub implements IG1Restore {
        static final int TRANSACTION_requestRestore = 1;

        /* compiled from: PG */
        /* loaded from: classes4.dex */
        public static class Proxy extends BaseProxy implements IG1Restore {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.libraries.subscriptions.restore.IG1Restore");
            }

            @Override // com.google.android.libraries.subscriptions.restore.IG1Restore
            public int requestRestore(Uri uri, Uri uri2, Uri uri3) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, uri);
                iax.d(obtainAndWriteInterfaceToken, uri2);
                iax.d(obtainAndWriteInterfaceToken, uri3);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }
        }

        public Stub() {
            super("com.google.android.libraries.subscriptions.restore.IG1Restore");
        }

        public static IG1Restore asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.libraries.subscriptions.restore.IG1Restore");
            if (queryLocalInterface instanceof IG1Restore) {
                return (IG1Restore) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Uri uri = (Uri) iax.a(parcel, Uri.CREATOR);
                Uri uri2 = (Uri) iax.a(parcel, Uri.CREATOR);
                Uri uri3 = (Uri) iax.a(parcel, Uri.CREATOR);
                enforceNoDataAvail(parcel);
                int requestRestore = requestRestore(uri, uri2, uri3);
                parcel2.writeNoException();
                parcel2.writeInt(requestRestore);
                return true;
            }
            return false;
        }
    }

    int requestRestore(Uri uri, Uri uri2, Uri uri3);
}
