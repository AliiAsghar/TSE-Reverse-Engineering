package com.google.android.gms.kids.internal;

import android.database.CursorWindow;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.kids.GetParentVerificationIntentRequest;
import com.google.android.gms.kids.internal.IGetParentVerificationIntentCallback;
import com.google.android.gms.kids.internal.IKidsCallbacks;
import com.google.android.gms.kids.internal.IScreentimeRestrictionCallback;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IKidsService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IKidsService {
        static final int TRANSACTION_getAppliedTimeLimit = 3001;
        static final int TRANSACTION_getAppliedTimeLimitAsync = 3002;
        static final int TRANSACTION_getParentVerificationIntent = 3005;
        static final int TRANSACTION_registerScreentimeRestrictionCallback = 3008;
        static final int TRANSACTION_unregisterScreentimeRestrictionCallback = 3009;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IKidsService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.kids.internal.IKidsService");
            }

            @Override // com.google.android.gms.kids.internal.IKidsService
            public CursorWindow getAppliedTimeLimit() {
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_getAppliedTimeLimit, obtainAndWriteInterfaceToken());
                CursorWindow cursorWindow = (CursorWindow) iax.a(transactAndReadException, CursorWindow.CREATOR);
                transactAndReadException.recycle();
                return cursorWindow;
            }

            @Override // com.google.android.gms.kids.internal.IKidsService
            public void getAppliedTimeLimitAsync(IKidsCallbacks iKidsCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iKidsCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getAppliedTimeLimitAsync, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IKidsService
            public void getParentVerificationIntent(GetParentVerificationIntentRequest getParentVerificationIntentRequest, IGetParentVerificationIntentCallback iGetParentVerificationIntentCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, getParentVerificationIntentRequest);
                iax.f(obtainAndWriteInterfaceToken, iGetParentVerificationIntentCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getParentVerificationIntent, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IKidsService
            public void registerScreentimeRestrictionCallback(IScreentimeRestrictionCallback iScreentimeRestrictionCallback, IKidsCallbacks iKidsCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iScreentimeRestrictionCallback);
                iax.f(obtainAndWriteInterfaceToken, iKidsCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_registerScreentimeRestrictionCallback, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IKidsService
            public void unregisterScreentimeRestrictionCallback(IScreentimeRestrictionCallback iScreentimeRestrictionCallback, IKidsCallbacks iKidsCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iScreentimeRestrictionCallback);
                iax.f(obtainAndWriteInterfaceToken, iKidsCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_unregisterScreentimeRestrictionCallback, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.kids.internal.IKidsService");
        }

        public static IKidsService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.kids.internal.IKidsService");
            if (queryLocalInterface instanceof IKidsService) {
                return (IKidsService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != TRANSACTION_getAppliedTimeLimit) {
                if (i != TRANSACTION_getAppliedTimeLimitAsync) {
                    if (i != TRANSACTION_getParentVerificationIntent) {
                        if (i != TRANSACTION_registerScreentimeRestrictionCallback) {
                            if (i != TRANSACTION_unregisterScreentimeRestrictionCallback) {
                                return false;
                            }
                            IScreentimeRestrictionCallback asInterface = IScreentimeRestrictionCallback.Stub.asInterface(parcel.readStrongBinder());
                            IKidsCallbacks asInterface2 = IKidsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                            enforceNoDataAvail(parcel);
                            unregisterScreentimeRestrictionCallback(asInterface, asInterface2);
                            parcel2.writeNoException();
                            return true;
                        }
                        IScreentimeRestrictionCallback asInterface3 = IScreentimeRestrictionCallback.Stub.asInterface(parcel.readStrongBinder());
                        IKidsCallbacks asInterface4 = IKidsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                        enforceNoDataAvail(parcel);
                        registerScreentimeRestrictionCallback(asInterface3, asInterface4);
                        parcel2.writeNoException();
                        return true;
                    }
                    GetParentVerificationIntentRequest getParentVerificationIntentRequest = (GetParentVerificationIntentRequest) iax.a(parcel, GetParentVerificationIntentRequest.CREATOR);
                    IGetParentVerificationIntentCallback asInterface5 = IGetParentVerificationIntentCallback.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getParentVerificationIntent(getParentVerificationIntentRequest, asInterface5);
                    parcel2.writeNoException();
                    return true;
                }
                IKidsCallbacks asInterface6 = IKidsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                getAppliedTimeLimitAsync(asInterface6);
                parcel2.writeNoException();
                return true;
            }
            CursorWindow appliedTimeLimit = getAppliedTimeLimit();
            parcel2.writeNoException();
            iax.e(parcel2, appliedTimeLimit);
            return true;
        }
    }

    @Deprecated
    CursorWindow getAppliedTimeLimit();

    void getAppliedTimeLimitAsync(IKidsCallbacks iKidsCallbacks);

    void getParentVerificationIntent(GetParentVerificationIntentRequest getParentVerificationIntentRequest, IGetParentVerificationIntentCallback iGetParentVerificationIntentCallback);

    void registerScreentimeRestrictionCallback(IScreentimeRestrictionCallback iScreentimeRestrictionCallback, IKidsCallbacks iKidsCallbacks);

    void unregisterScreentimeRestrictionCallback(IScreentimeRestrictionCallback iScreentimeRestrictionCallback, IKidsCallbacks iKidsCallbacks);
}
