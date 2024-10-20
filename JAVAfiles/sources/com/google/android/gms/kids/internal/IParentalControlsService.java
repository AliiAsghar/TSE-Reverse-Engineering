package com.google.android.gms.kids.internal;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.kids.TrustedContactsRequest;
import com.google.android.gms.kids.internal.IKidsCallbacks;
import com.google.android.gms.kids.internal.IParentalControlsCacheCallback;
import com.google.android.gms.kids.internal.IParentalControlsListener;
import defpackage.iax;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IParentalControlsService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IParentalControlsService {
        static final int TRANSACTION_areAllowed = 7;
        static final int TRANSACTION_getNotAllowedDialogPendingIntent = 5;
        static final int TRANSACTION_registerCacheCallback = 10;
        static final int TRANSACTION_registerParentalControlsListener = 8;
        static final int TRANSACTION_requestTrustedContactsPendingIntent = 6;
        static final int TRANSACTION_unregisterCacheCallback = 11;
        static final int TRANSACTION_unregisterParentalControlsListener = 9;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IParentalControlsService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.kids.internal.IParentalControlsService");
            }

            @Override // com.google.android.gms.kids.internal.IParentalControlsService
            public void areAllowed(List<Uri> list, IKidsCallbacks iKidsCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeTypedList(list);
                iax.f(obtainAndWriteInterfaceToken, iKidsCallbacks);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IParentalControlsService
            public void getNotAllowedDialogPendingIntent(Uri uri, IKidsCallbacks iKidsCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, uri);
                iax.f(obtainAndWriteInterfaceToken, iKidsCallbacks);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IParentalControlsService
            public void registerCacheCallback(IParentalControlsCacheCallback iParentalControlsCacheCallback, IKidsCallbacks iKidsCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iParentalControlsCacheCallback);
                iax.f(obtainAndWriteInterfaceToken, iKidsCallbacks);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IParentalControlsService
            public void registerParentalControlsListener(IParentalControlsListener iParentalControlsListener, IKidsCallbacks iKidsCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iParentalControlsListener);
                iax.f(obtainAndWriteInterfaceToken, iKidsCallbacks);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IParentalControlsService
            public void requestTrustedContactsPendingIntent(TrustedContactsRequest trustedContactsRequest, IKidsCallbacks iKidsCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, trustedContactsRequest);
                iax.f(obtainAndWriteInterfaceToken, iKidsCallbacks);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IParentalControlsService
            public void unregisterCacheCallback(IParentalControlsCacheCallback iParentalControlsCacheCallback, IKidsCallbacks iKidsCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iParentalControlsCacheCallback);
                iax.f(obtainAndWriteInterfaceToken, iKidsCallbacks);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.kids.internal.IParentalControlsService
            public void unregisterParentalControlsListener(IParentalControlsListener iParentalControlsListener, IKidsCallbacks iKidsCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iParentalControlsListener);
                iax.f(obtainAndWriteInterfaceToken, iKidsCallbacks);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.kids.internal.IParentalControlsService");
        }

        public static IParentalControlsService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.kids.internal.IParentalControlsService");
            if (queryLocalInterface instanceof IParentalControlsService) {
                return (IParentalControlsService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 5:
                    Uri uri = (Uri) iax.a(parcel, Uri.CREATOR);
                    IKidsCallbacks asInterface = IKidsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    getNotAllowedDialogPendingIntent(uri, asInterface);
                    break;
                case 6:
                    TrustedContactsRequest trustedContactsRequest = (TrustedContactsRequest) iax.a(parcel, TrustedContactsRequest.CREATOR);
                    IKidsCallbacks asInterface2 = IKidsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    requestTrustedContactsPendingIntent(trustedContactsRequest, asInterface2);
                    break;
                case 7:
                    ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                    IKidsCallbacks asInterface3 = IKidsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    areAllowed(createTypedArrayList, asInterface3);
                    break;
                case 8:
                    IParentalControlsListener asInterface4 = IParentalControlsListener.Stub.asInterface(parcel.readStrongBinder());
                    IKidsCallbacks asInterface5 = IKidsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    registerParentalControlsListener(asInterface4, asInterface5);
                    break;
                case 9:
                    IParentalControlsListener asInterface6 = IParentalControlsListener.Stub.asInterface(parcel.readStrongBinder());
                    IKidsCallbacks asInterface7 = IKidsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    unregisterParentalControlsListener(asInterface6, asInterface7);
                    break;
                case 10:
                    IParentalControlsCacheCallback asInterface8 = IParentalControlsCacheCallback.Stub.asInterface(parcel.readStrongBinder());
                    IKidsCallbacks asInterface9 = IKidsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    registerCacheCallback(asInterface8, asInterface9);
                    break;
                case 11:
                    IParentalControlsCacheCallback asInterface10 = IParentalControlsCacheCallback.Stub.asInterface(parcel.readStrongBinder());
                    IKidsCallbacks asInterface11 = IKidsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    unregisterCacheCallback(asInterface10, asInterface11);
                    break;
                default:
                    return false;
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void areAllowed(List<Uri> list, IKidsCallbacks iKidsCallbacks);

    void getNotAllowedDialogPendingIntent(Uri uri, IKidsCallbacks iKidsCallbacks);

    void registerCacheCallback(IParentalControlsCacheCallback iParentalControlsCacheCallback, IKidsCallbacks iKidsCallbacks);

    void registerParentalControlsListener(IParentalControlsListener iParentalControlsListener, IKidsCallbacks iKidsCallbacks);

    void requestTrustedContactsPendingIntent(TrustedContactsRequest trustedContactsRequest, IKidsCallbacks iKidsCallbacks);

    void unregisterCacheCallback(IParentalControlsCacheCallback iParentalControlsCacheCallback, IKidsCallbacks iKidsCallbacks);

    void unregisterParentalControlsListener(IParentalControlsListener iParentalControlsListener, IKidsCallbacks iKidsCallbacks);
}
