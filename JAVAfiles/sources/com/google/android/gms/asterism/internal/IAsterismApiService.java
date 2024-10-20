package com.google.android.gms.asterism.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.asterism.GetAsterismConsentRequest;
import com.google.android.gms.asterism.SetAsterismConsentRequest;
import com.google.android.gms.asterism.internal.IAsterismCallbacks;
import com.google.android.gms.common.api.ApiMetadata;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IAsterismApiService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IAsterismApiService {
        static final int TRANSACTION_getAsterismConsent = 1;
        static final int TRANSACTION_setAsterismConsent = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IAsterismApiService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.asterism.internal.IAsterismApiService");
            }

            @Override // com.google.android.gms.asterism.internal.IAsterismApiService
            public void getAsterismConsent(IAsterismCallbacks iAsterismCallbacks, GetAsterismConsentRequest getAsterismConsentRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iAsterismCallbacks);
                iax.d(obtainAndWriteInterfaceToken, getAsterismConsentRequest);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.asterism.internal.IAsterismApiService
            public void setAsterismConsent(IAsterismCallbacks iAsterismCallbacks, SetAsterismConsentRequest setAsterismConsentRequest, ApiMetadata apiMetadata) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iAsterismCallbacks);
                iax.d(obtainAndWriteInterfaceToken, setAsterismConsentRequest);
                iax.d(obtainAndWriteInterfaceToken, apiMetadata);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.asterism.internal.IAsterismApiService");
        }

        public static IAsterismApiService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.asterism.internal.IAsterismApiService");
            if (queryLocalInterface instanceof IAsterismApiService) {
                return (IAsterismApiService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                IAsterismCallbacks asInterface = IAsterismCallbacks.Stub.asInterface(parcel.readStrongBinder());
                SetAsterismConsentRequest setAsterismConsentRequest = (SetAsterismConsentRequest) iax.a(parcel, SetAsterismConsentRequest.CREATOR);
                ApiMetadata apiMetadata = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                setAsterismConsent(asInterface, setAsterismConsentRequest, apiMetadata);
            } else {
                IAsterismCallbacks asInterface2 = IAsterismCallbacks.Stub.asInterface(parcel.readStrongBinder());
                GetAsterismConsentRequest getAsterismConsentRequest = (GetAsterismConsentRequest) iax.a(parcel, GetAsterismConsentRequest.CREATOR);
                ApiMetadata apiMetadata2 = (ApiMetadata) iax.a(parcel, ApiMetadata.CREATOR);
                enforceNoDataAvail(parcel);
                getAsterismConsent(asInterface2, getAsterismConsentRequest, apiMetadata2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void getAsterismConsent(IAsterismCallbacks iAsterismCallbacks, GetAsterismConsentRequest getAsterismConsentRequest, ApiMetadata apiMetadata);

    void setAsterismConsent(IAsterismCallbacks iAsterismCallbacks, SetAsterismConsentRequest setAsterismConsentRequest, ApiMetadata apiMetadata);
}
