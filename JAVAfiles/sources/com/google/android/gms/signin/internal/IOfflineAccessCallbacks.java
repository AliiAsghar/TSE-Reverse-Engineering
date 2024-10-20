package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.ISignInService;
import defpackage.iax;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IOfflineAccessCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IOfflineAccessCallbacks {
        static final int TRANSACTION_checkServerAuthorization = 2;
        static final int TRANSACTION_uploadServerAuthCode = 3;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IOfflineAccessCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
            }

            @Override // com.google.android.gms.signin.internal.IOfflineAccessCallbacks
            public void checkServerAuthorization(String str, List<Scope> list, ISignInService iSignInService) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeTypedList(list);
                iax.f(obtainAndWriteInterfaceToken, iSignInService);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.signin.internal.IOfflineAccessCallbacks
            public void uploadServerAuthCode(String str, String str2, ISignInService iSignInService) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                iax.f(obtainAndWriteInterfaceToken, iSignInService);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
        }

        public static IOfflineAccessCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.IOfflineAccessCallbacks");
            if (queryLocalInterface instanceof IOfflineAccessCallbacks) {
                return (IOfflineAccessCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                ISignInService asInterface = ISignInService.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                uploadServerAuthCode(readString, readString2, asInterface);
            } else {
                String readString3 = parcel.readString();
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Scope.CREATOR);
                ISignInService asInterface2 = ISignInService.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                checkServerAuthorization(readString3, createTypedArrayList, asInterface2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void checkServerAuthorization(String str, List<Scope> list, ISignInService iSignInService);

    void uploadServerAuthCode(String str, String str2, ISignInService iSignInService);
}
