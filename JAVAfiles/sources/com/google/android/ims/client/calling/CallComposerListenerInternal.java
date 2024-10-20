package com.google.android.ims.client.calling;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface CallComposerListenerInternal extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static abstract class Stub extends BaseStub implements CallComposerListenerInternal {
        static final int TRANSACTION_onCallComposerPrepareFailed = 2;
        static final int TRANSACTION_onCallComposerPrepared = 1;
        static final int TRANSACTION_onCallComposerSessionTerminated = 5;
        static final int TRANSACTION_onComposerContentTransferFailure = 4;
        static final int TRANSACTION_onComposerContentTransferSuccess = 3;

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public static class Proxy extends BaseProxy implements CallComposerListenerInternal {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.client.calling.CallComposerListenerInternal");
            }

            @Override // com.google.android.ims.client.calling.CallComposerListenerInternal
            public void onCallComposerPrepareFailed(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.CallComposerListenerInternal
            public void onCallComposerPrepared(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.CallComposerListenerInternal
            public void onCallComposerSessionTerminated(String str, int i, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.CallComposerListenerInternal
            public void onComposerContentTransferFailure(String str, int i, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.client.calling.CallComposerListenerInternal
            public void onComposerContentTransferSuccess(String str, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.ims.client.calling.CallComposerListenerInternal");
        }

        public static CallComposerListenerInternal asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.client.calling.CallComposerListenerInternal");
            if (queryLocalInterface instanceof CallComposerListenerInternal) {
                return (CallComposerListenerInternal) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return false;
                            }
                            String readString = parcel.readString();
                            int readInt = parcel.readInt();
                            Bundle bundle = (Bundle) iax.a(parcel, Bundle.CREATOR);
                            enforceNoDataAvail(parcel);
                            onCallComposerSessionTerminated(readString, readInt, bundle);
                        } else {
                            String readString2 = parcel.readString();
                            int readInt2 = parcel.readInt();
                            Bundle bundle2 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                            enforceNoDataAvail(parcel);
                            onComposerContentTransferFailure(readString2, readInt2, bundle2);
                        }
                    } else {
                        String readString3 = parcel.readString();
                        Bundle bundle3 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                        enforceNoDataAvail(parcel);
                        onComposerContentTransferSuccess(readString3, bundle3);
                    }
                } else {
                    String readString4 = parcel.readString();
                    Bundle bundle4 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                    enforceNoDataAvail(parcel);
                    onCallComposerPrepareFailed(readString4, bundle4);
                }
            } else {
                String readString5 = parcel.readString();
                Bundle bundle5 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                enforceNoDataAvail(parcel);
                onCallComposerPrepared(readString5, bundle5);
            }
            return true;
        }
    }

    void onCallComposerPrepareFailed(String str, Bundle bundle);

    void onCallComposerPrepared(String str, Bundle bundle);

    void onCallComposerSessionTerminated(String str, int i, Bundle bundle);

    void onComposerContentTransferFailure(String str, int i, Bundle bundle);

    void onComposerContentTransferSuccess(String str, Bundle bundle);
}
