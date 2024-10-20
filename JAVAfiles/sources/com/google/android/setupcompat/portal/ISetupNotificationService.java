package com.google.android.setupcompat.portal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.UserHandle;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.setupcompat.portal.IPortalRegisterResultListener;
import defpackage.ajux;
import defpackage.ajuy;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface ISetupNotificationService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static abstract class Stub extends BaseStub implements ISetupNotificationService {
        static final int TRANSACTION_isPortalAvailable = 5;
        static final int TRANSACTION_isProgressServiceAlive = 4;
        static final int TRANSACTION_registerNotification = 1;
        static final int TRANSACTION_registerProgressService = 3;
        static final int TRANSACTION_unregisterNotification = 2;

        /* compiled from: PG */
        /* loaded from: classes4.dex */
        public static class Proxy extends BaseProxy implements ISetupNotificationService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.setupcompat.portal.ISetupNotificationService");
            }

            @Override // com.google.android.setupcompat.portal.ISetupNotificationService
            public boolean isPortalAvailable() {
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.setupcompat.portal.ISetupNotificationService
            public boolean isProgressServiceAlive(ajuy ajuyVar, UserHandle userHandle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, ajuyVar);
                iax.d(obtainAndWriteInterfaceToken, userHandle);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.setupcompat.portal.ISetupNotificationService
            public boolean registerNotification(ajux ajuxVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, ajuxVar);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.setupcompat.portal.ISetupNotificationService
            public void registerProgressService(ajuy ajuyVar, UserHandle userHandle, IPortalRegisterResultListener iPortalRegisterResultListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, ajuyVar);
                iax.d(obtainAndWriteInterfaceToken, userHandle);
                iax.f(obtainAndWriteInterfaceToken, iPortalRegisterResultListener);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.setupcompat.portal.ISetupNotificationService
            public void unregisterNotification(ajux ajuxVar) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, ajuxVar);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.setupcompat.portal.ISetupNotificationService");
        }

        public static ISetupNotificationService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.setupcompat.portal.ISetupNotificationService");
            if (queryLocalInterface instanceof ISetupNotificationService) {
                return (ISetupNotificationService) queryLocalInterface;
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
                            boolean isPortalAvailable = isPortalAvailable();
                            parcel2.writeNoException();
                            int i3 = iax.a;
                            parcel2.writeInt(isPortalAvailable ? 1 : 0);
                        } else {
                            ajuy ajuyVar = (ajuy) iax.a(parcel, ajuy.CREATOR);
                            UserHandle userHandle = (UserHandle) iax.a(parcel, UserHandle.CREATOR);
                            enforceNoDataAvail(parcel);
                            boolean isProgressServiceAlive = isProgressServiceAlive(ajuyVar, userHandle);
                            parcel2.writeNoException();
                            parcel2.writeInt(isProgressServiceAlive ? 1 : 0);
                        }
                    } else {
                        ajuy ajuyVar2 = (ajuy) iax.a(parcel, ajuy.CREATOR);
                        UserHandle userHandle2 = (UserHandle) iax.a(parcel, UserHandle.CREATOR);
                        IPortalRegisterResultListener asInterface = IPortalRegisterResultListener.Stub.asInterface(parcel.readStrongBinder());
                        enforceNoDataAvail(parcel);
                        registerProgressService(ajuyVar2, userHandle2, asInterface);
                        parcel2.writeNoException();
                    }
                } else {
                    ajux ajuxVar = (ajux) iax.a(parcel, ajux.CREATOR);
                    enforceNoDataAvail(parcel);
                    unregisterNotification(ajuxVar);
                    parcel2.writeNoException();
                }
            } else {
                ajux ajuxVar2 = (ajux) iax.a(parcel, ajux.CREATOR);
                enforceNoDataAvail(parcel);
                boolean registerNotification = registerNotification(ajuxVar2);
                parcel2.writeNoException();
                parcel2.writeInt(registerNotification ? 1 : 0);
            }
            return true;
        }
    }

    boolean isPortalAvailable();

    boolean isProgressServiceAlive(ajuy ajuyVar, UserHandle userHandle);

    boolean registerNotification(ajux ajuxVar);

    void registerProgressService(ajuy ajuyVar, UserHandle userHandle, IPortalRegisterResultListener iPortalRegisterResultListener);

    void unregisterNotification(ajux ajuxVar);
}
