package com.google.android.gms.constellation.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.constellation.GetIidTokenResponse;
import com.google.android.gms.constellation.PhoneNumberInfo;
import com.google.android.gms.constellation.VerifyPhoneNumberResponse;
import defpackage.iax;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IConstellationCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IConstellationCallbacks {
        static final int TRANSACTION_onIidTokenGenerated = 3;
        static final int TRANSACTION_onPhoneNumberVerificationsCompleted = 2;
        static final int TRANSACTION_onPhoneNumberVerified = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IConstellationCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.constellation.internal.IConstellationCallbacks");
            }

            @Override // com.google.android.gms.constellation.internal.IConstellationCallbacks
            public void onIidTokenGenerated(Status status, GetIidTokenResponse getIidTokenResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, getIidTokenResponse);
                transactOneway(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.constellation.internal.IConstellationCallbacks
            public void onPhoneNumberVerificationsCompleted(Status status, VerifyPhoneNumberResponse verifyPhoneNumberResponse) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, verifyPhoneNumberResponse);
                transactOneway(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.constellation.internal.IConstellationCallbacks
            public void onPhoneNumberVerified(Status status, List<PhoneNumberInfo> list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.constellation.internal.IConstellationCallbacks");
        }

        public static IConstellationCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.constellation.internal.IConstellationCallbacks");
            if (queryLocalInterface instanceof IConstellationCallbacks) {
                return (IConstellationCallbacks) queryLocalInterface;
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
                    Status status = (Status) iax.a(parcel, Status.CREATOR);
                    GetIidTokenResponse getIidTokenResponse = (GetIidTokenResponse) iax.a(parcel, GetIidTokenResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onIidTokenGenerated(status, getIidTokenResponse);
                } else {
                    Status status2 = (Status) iax.a(parcel, Status.CREATOR);
                    VerifyPhoneNumberResponse verifyPhoneNumberResponse = (VerifyPhoneNumberResponse) iax.a(parcel, VerifyPhoneNumberResponse.CREATOR);
                    enforceNoDataAvail(parcel);
                    onPhoneNumberVerificationsCompleted(status2, verifyPhoneNumberResponse);
                }
            } else {
                Status status3 = (Status) iax.a(parcel, Status.CREATOR);
                ArrayList createTypedArrayList = parcel.createTypedArrayList(PhoneNumberInfo.CREATOR);
                enforceNoDataAvail(parcel);
                onPhoneNumberVerified(status3, createTypedArrayList);
            }
            return true;
        }
    }

    void onIidTokenGenerated(Status status, GetIidTokenResponse getIidTokenResponse);

    void onPhoneNumberVerificationsCompleted(Status status, VerifyPhoneNumberResponse verifyPhoneNumberResponse);

    void onPhoneNumberVerified(Status status, List<PhoneNumberInfo> list);
}
