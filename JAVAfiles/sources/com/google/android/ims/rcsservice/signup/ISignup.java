package com.google.android.ims.rcsservice.signup;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.ims.rcsservice.signup.IAuthListener;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ISignup extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static abstract class Stub extends BaseStub implements ISignup {
        static final int TRANSACTION_getConsentSkipped = 9;
        static final int TRANSACTION_getRcsAvailability = 8;
        static final int TRANSACTION_getRcsEligibility = 10;
        static final int TRANSACTION_isSeamlessAuthorizedProvisioningAllowed = 6;
        static final int TRANSACTION_isSignedUp = 5;
        static final int TRANSACTION_requestResignup = 2;
        static final int TRANSACTION_requestSignup = 1;
        static final int TRANSACTION_requestSignupWithMsisdn = 3;
        static final int TRANSACTION_requestSignupWithOtp = 4;

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public static class Proxy extends BaseProxy implements ISignup {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcsservice.signup.ISignup");
            }

            @Override // com.google.android.ims.rcsservice.signup.ISignup
            public boolean getConsentSkipped(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.ims.rcsservice.signup.ISignup
            public int getRcsAvailability(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.ims.rcsservice.signup.ISignup
            public int getRcsEligibility(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.ims.rcsservice.signup.ISignup
            public boolean isSeamlessAuthorizedProvisioningAllowed() {
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.ims.rcsservice.signup.ISignup
            public boolean isSignedUp() {
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.ims.rcsservice.signup.ISignup
            public void requestResignup(int i, IAuthListener iAuthListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.f(obtainAndWriteInterfaceToken, iAuthListener);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.rcsservice.signup.ISignup
            public void requestSignup(int i, IAuthListener iAuthListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.f(obtainAndWriteInterfaceToken, iAuthListener);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.ims.rcsservice.signup.ISignup
            public int requestSignupWithMsisdn(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.ims.rcsservice.signup.ISignup
            public int requestSignupWithOtp(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }
        }

        public Stub() {
            super("com.google.android.ims.rcsservice.signup.ISignup");
        }

        public static ISignup asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcsservice.signup.ISignup");
            if (queryLocalInterface instanceof ISignup) {
                return (ISignup) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    int readInt = parcel.readInt();
                    IAuthListener asInterface = IAuthListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    requestSignup(readInt, asInterface);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    int readInt2 = parcel.readInt();
                    IAuthListener asInterface2 = IAuthListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    requestResignup(readInt2, asInterface2);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    String readString = parcel.readString();
                    enforceNoDataAvail(parcel);
                    int requestSignupWithMsisdn = requestSignupWithMsisdn(readString);
                    parcel2.writeNoException();
                    parcel2.writeInt(requestSignupWithMsisdn);
                    return true;
                case 4:
                    String readString2 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    int requestSignupWithOtp = requestSignupWithOtp(readString2);
                    parcel2.writeNoException();
                    parcel2.writeInt(requestSignupWithOtp);
                    return true;
                case 5:
                    boolean isSignedUp = isSignedUp();
                    parcel2.writeNoException();
                    int i3 = iax.a;
                    parcel2.writeInt(isSignedUp ? 1 : 0);
                    return true;
                case 6:
                    boolean isSeamlessAuthorizedProvisioningAllowed = isSeamlessAuthorizedProvisioningAllowed();
                    parcel2.writeNoException();
                    int i4 = iax.a;
                    parcel2.writeInt(isSeamlessAuthorizedProvisioningAllowed ? 1 : 0);
                    return true;
                case 7:
                default:
                    return false;
                case 8:
                    String readString3 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    int rcsAvailability = getRcsAvailability(readString3);
                    parcel2.writeNoException();
                    parcel2.writeInt(rcsAvailability);
                    return true;
                case 9:
                    String readString4 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    boolean consentSkipped = getConsentSkipped(readString4);
                    parcel2.writeNoException();
                    int i5 = iax.a;
                    parcel2.writeInt(consentSkipped ? 1 : 0);
                    return true;
                case 10:
                    String readString5 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    int rcsEligibility = getRcsEligibility(readString5);
                    parcel2.writeNoException();
                    parcel2.writeInt(rcsEligibility);
                    return true;
            }
        }
    }

    boolean getConsentSkipped(String str);

    int getRcsAvailability(String str);

    int getRcsEligibility(String str);

    boolean isSeamlessAuthorizedProvisioningAllowed();

    boolean isSignedUp();

    void requestResignup(int i, IAuthListener iAuthListener);

    void requestSignup(int i, IAuthListener iAuthListener);

    int requestSignupWithMsisdn(String str);

    int requestSignupWithOtp(String str);
}
