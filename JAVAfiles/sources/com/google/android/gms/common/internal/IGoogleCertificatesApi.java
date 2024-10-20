package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.GoogleCertificatesLookupQuery;
import com.google.android.gms.common.GoogleCertificatesLookupResponse;
import com.google.android.gms.common.GoogleCertificatesQuery;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IGoogleCertificatesApi extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IGoogleCertificatesApi {
        static final int TRANSACTION_getGoogleCertificates = 1;
        static final int TRANSACTION_getGoogleReleaseCertificates = 2;
        static final int TRANSACTION_isFineGrainedPackageVerificationAvailable = 9;
        static final int TRANSACTION_isGoogleOrPlatformSigned = 5;
        static final int TRANSACTION_isGoogleReleaseSigned = 3;
        static final int TRANSACTION_isGoogleSigned = 4;
        static final int TRANSACTION_isPackageGoogleOrPlatformSigned = 6;
        static final int TRANSACTION_isPackageGoogleOrPlatformSignedAvailable = 7;
        static final int TRANSACTION_queryPackageSigned = 8;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IGoogleCertificatesApi {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
            }

            @Override // com.google.android.gms.common.internal.IGoogleCertificatesApi
            public IObjectWrapper getGoogleCertificates() {
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.common.internal.IGoogleCertificatesApi
            public IObjectWrapper getGoogleReleaseCertificates() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.common.internal.IGoogleCertificatesApi
            public boolean isFineGrainedPackageVerificationAvailable() {
                Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.common.internal.IGoogleCertificatesApi
            public boolean isGoogleOrPlatformSigned(GoogleCertificatesQuery googleCertificatesQuery, IObjectWrapper iObjectWrapper) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, googleCertificatesQuery);
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.common.internal.IGoogleCertificatesApi
            public boolean isGoogleReleaseSigned(String str, IObjectWrapper iObjectWrapper) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.common.internal.IGoogleCertificatesApi
            public boolean isGoogleSigned(String str, IObjectWrapper iObjectWrapper) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.common.internal.IGoogleCertificatesApi
            public GoogleCertificatesLookupResponse isPackageGoogleOrPlatformSigned(GoogleCertificatesLookupQuery googleCertificatesLookupQuery) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, googleCertificatesLookupQuery);
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken);
                GoogleCertificatesLookupResponse googleCertificatesLookupResponse = (GoogleCertificatesLookupResponse) iax.a(transactAndReadException, GoogleCertificatesLookupResponse.CREATOR);
                transactAndReadException.recycle();
                return googleCertificatesLookupResponse;
            }

            @Override // com.google.android.gms.common.internal.IGoogleCertificatesApi
            public boolean isPackageGoogleOrPlatformSignedAvailable() {
                Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.common.internal.IGoogleCertificatesApi
            public GoogleCertificatesLookupResponse queryPackageSigned(GoogleCertificatesLookupQuery googleCertificatesLookupQuery) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, googleCertificatesLookupQuery);
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
                GoogleCertificatesLookupResponse googleCertificatesLookupResponse = (GoogleCertificatesLookupResponse) iax.a(transactAndReadException, GoogleCertificatesLookupResponse.CREATOR);
                transactAndReadException.recycle();
                return googleCertificatesLookupResponse;
            }
        }

        public Stub() {
            super("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        }

        public static IGoogleCertificatesApi asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
            if (queryLocalInterface instanceof IGoogleCertificatesApi) {
                return (IGoogleCertificatesApi) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IObjectWrapper googleCertificates = getGoogleCertificates();
                    parcel2.writeNoException();
                    iax.f(parcel2, googleCertificates);
                    return true;
                case 2:
                    IObjectWrapper googleReleaseCertificates = getGoogleReleaseCertificates();
                    parcel2.writeNoException();
                    iax.f(parcel2, googleReleaseCertificates);
                    return true;
                case 3:
                    String readString = parcel.readString();
                    IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean isGoogleReleaseSigned = isGoogleReleaseSigned(readString, asInterface);
                    parcel2.writeNoException();
                    int i3 = iax.a;
                    parcel2.writeInt(isGoogleReleaseSigned ? 1 : 0);
                    return true;
                case 4:
                    String readString2 = parcel.readString();
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean isGoogleSigned = isGoogleSigned(readString2, asInterface2);
                    parcel2.writeNoException();
                    int i4 = iax.a;
                    parcel2.writeInt(isGoogleSigned ? 1 : 0);
                    return true;
                case 5:
                    GoogleCertificatesQuery googleCertificatesQuery = (GoogleCertificatesQuery) iax.a(parcel, GoogleCertificatesQuery.CREATOR);
                    IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean isGoogleOrPlatformSigned = isGoogleOrPlatformSigned(googleCertificatesQuery, asInterface3);
                    parcel2.writeNoException();
                    parcel2.writeInt(isGoogleOrPlatformSigned ? 1 : 0);
                    return true;
                case 6:
                    GoogleCertificatesLookupQuery googleCertificatesLookupQuery = (GoogleCertificatesLookupQuery) iax.a(parcel, GoogleCertificatesLookupQuery.CREATOR);
                    enforceNoDataAvail(parcel);
                    GoogleCertificatesLookupResponse isPackageGoogleOrPlatformSigned = isPackageGoogleOrPlatformSigned(googleCertificatesLookupQuery);
                    parcel2.writeNoException();
                    iax.e(parcel2, isPackageGoogleOrPlatformSigned);
                    return true;
                case 7:
                    boolean isPackageGoogleOrPlatformSignedAvailable = isPackageGoogleOrPlatformSignedAvailable();
                    parcel2.writeNoException();
                    int i5 = iax.a;
                    parcel2.writeInt(isPackageGoogleOrPlatformSignedAvailable ? 1 : 0);
                    return true;
                case 8:
                    GoogleCertificatesLookupQuery googleCertificatesLookupQuery2 = (GoogleCertificatesLookupQuery) iax.a(parcel, GoogleCertificatesLookupQuery.CREATOR);
                    enforceNoDataAvail(parcel);
                    GoogleCertificatesLookupResponse queryPackageSigned = queryPackageSigned(googleCertificatesLookupQuery2);
                    parcel2.writeNoException();
                    iax.e(parcel2, queryPackageSigned);
                    return true;
                case 9:
                    boolean isFineGrainedPackageVerificationAvailable = isFineGrainedPackageVerificationAvailable();
                    parcel2.writeNoException();
                    int i6 = iax.a;
                    parcel2.writeInt(isFineGrainedPackageVerificationAvailable ? 1 : 0);
                    return true;
                default:
                    return false;
            }
        }
    }

    IObjectWrapper getGoogleCertificates();

    IObjectWrapper getGoogleReleaseCertificates();

    boolean isFineGrainedPackageVerificationAvailable();

    boolean isGoogleOrPlatformSigned(GoogleCertificatesQuery googleCertificatesQuery, IObjectWrapper iObjectWrapper);

    boolean isGoogleReleaseSigned(String str, IObjectWrapper iObjectWrapper);

    boolean isGoogleSigned(String str, IObjectWrapper iObjectWrapper);

    GoogleCertificatesLookupResponse isPackageGoogleOrPlatformSigned(GoogleCertificatesLookupQuery googleCertificatesLookupQuery);

    boolean isPackageGoogleOrPlatformSignedAvailable();

    GoogleCertificatesLookupResponse queryPackageSigned(GoogleCertificatesLookupQuery googleCertificatesLookupQuery);
}
