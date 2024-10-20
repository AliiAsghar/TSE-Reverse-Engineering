package com.google.android.gms.feedback.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IFeedbackCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IFeedbackCallbacks {
        static final int TRANSACTION_onCompleted = 3;
        static final int TRANSACTION_onCujSelected = 1;
        static final int TRANSACTION_onIntentSelected = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IFeedbackCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.feedback.internal.IFeedbackCallbacks");
            }

            @Override // com.google.android.gms.feedback.internal.IFeedbackCallbacks
            public void onCompleted() {
                transactOneway(3, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.feedback.internal.IFeedbackCallbacks
            public void onCujSelected(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.feedback.internal.IFeedbackCallbacks
            public void onIntentSelected(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.feedback.internal.IFeedbackCallbacks");
        }

        public static IFeedbackCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackCallbacks");
            if (queryLocalInterface instanceof IFeedbackCallbacks) {
                return (IFeedbackCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    onCompleted();
                } else {
                    String readString = parcel.readString();
                    enforceNoDataAvail(parcel);
                    onIntentSelected(readString);
                }
            } else {
                String readString2 = parcel.readString();
                enforceNoDataAvail(parcel);
                onCujSelected(readString2);
            }
            return true;
        }
    }

    void onCompleted();

    void onCujSelected(String str);

    void onIntentSelected(String str);
}
