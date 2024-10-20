package com.google.android.gms.fido.common.nfc;

import android.nfc.Tag;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface INfcReaderCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements INfcReaderCallback {
        static final int TRANSACTION_onTagDiscovered = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements INfcReaderCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.common.nfc.INfcReaderCallback");
            }

            @Override // com.google.android.gms.fido.common.nfc.INfcReaderCallback
            public void onTagDiscovered(Tag tag) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, tag);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.common.nfc.INfcReaderCallback");
        }

        public static INfcReaderCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.common.nfc.INfcReaderCallback");
            if (queryLocalInterface instanceof INfcReaderCallback) {
                return (INfcReaderCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Tag tag = (Tag) iax.a(parcel, Tag.CREATOR);
                enforceNoDataAvail(parcel);
                onTagDiscovered(tag);
                parcel2.writeNoException();
                return true;
            }
            return false;
        }
    }

    void onTagDiscovered(Tag tag);
}
