package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IDynamiteLoader extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IDynamiteLoader {
        static final int TRANSACTION_createModuleContext = 2;
        static final int TRANSACTION_createModuleContext3NoCrashUtils = 8;
        static final int TRANSACTION_createModuleContextNoCrashUtils = 4;
        static final int TRANSACTION_getIDynamiteLoaderVersion = 6;
        static final int TRANSACTION_getModuleVersion = 1;
        static final int TRANSACTION_getModuleVersion2 = 3;
        static final int TRANSACTION_getModuleVersion2NoCrashUtils = 5;
        static final int TRANSACTION_queryForDynamiteModuleNoCrashUtils = 7;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IDynamiteLoader {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
            }

            @Override // com.google.android.gms.dynamite.IDynamiteLoader
            public IObjectWrapper createModuleContext(IObjectWrapper iObjectWrapper, String str, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.dynamite.IDynamiteLoader
            public IObjectWrapper createModuleContext3NoCrashUtils(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper2);
                Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.dynamite.IDynamiteLoader
            public IObjectWrapper createModuleContextNoCrashUtils(IObjectWrapper iObjectWrapper, String str, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(i);
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.dynamite.IDynamiteLoader
            public int getIDynamiteLoaderVersion() {
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.dynamite.IDynamiteLoader
            public int getModuleVersion(IObjectWrapper iObjectWrapper, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.dynamite.IDynamiteLoader
            public int getModuleVersion2(IObjectWrapper iObjectWrapper, String str, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.dynamite.IDynamiteLoader
            public int getModuleVersion2NoCrashUtils(IObjectWrapper iObjectWrapper, String str, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.dynamite.IDynamiteLoader
            public IObjectWrapper queryForDynamiteModuleNoCrashUtils(IObjectWrapper iObjectWrapper, String str, boolean z, long j) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                obtainAndWriteInterfaceToken.writeLong(j);
                Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken);
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }
        }

        public Stub() {
            super("com.google.android.gms.dynamite.IDynamiteLoader");
        }

        public static IDynamiteLoader asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
            if (queryLocalInterface instanceof IDynamiteLoader) {
                return (IDynamiteLoader) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    String readString = parcel.readString();
                    enforceNoDataAvail(parcel);
                    int moduleVersion = getModuleVersion(asInterface, readString);
                    parcel2.writeNoException();
                    parcel2.writeInt(moduleVersion);
                    return true;
                case 2:
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    String readString2 = parcel.readString();
                    int readInt = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper createModuleContext = createModuleContext(asInterface2, readString2, readInt);
                    parcel2.writeNoException();
                    iax.f(parcel2, createModuleContext);
                    return true;
                case 3:
                    IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    String readString3 = parcel.readString();
                    boolean g = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    int moduleVersion2 = getModuleVersion2(asInterface3, readString3, g);
                    parcel2.writeNoException();
                    parcel2.writeInt(moduleVersion2);
                    return true;
                case 4:
                    IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    String readString4 = parcel.readString();
                    int readInt2 = parcel.readInt();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper createModuleContextNoCrashUtils = createModuleContextNoCrashUtils(asInterface4, readString4, readInt2);
                    parcel2.writeNoException();
                    iax.f(parcel2, createModuleContextNoCrashUtils);
                    return true;
                case 5:
                    IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    String readString5 = parcel.readString();
                    boolean g2 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    int moduleVersion2NoCrashUtils = getModuleVersion2NoCrashUtils(asInterface5, readString5, g2);
                    parcel2.writeNoException();
                    parcel2.writeInt(moduleVersion2NoCrashUtils);
                    return true;
                case 6:
                    int iDynamiteLoaderVersion = getIDynamiteLoaderVersion();
                    parcel2.writeNoException();
                    parcel2.writeInt(iDynamiteLoaderVersion);
                    return true;
                case 7:
                    IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    String readString6 = parcel.readString();
                    boolean g3 = iax.g(parcel);
                    long readLong = parcel.readLong();
                    enforceNoDataAvail(parcel);
                    IObjectWrapper queryForDynamiteModuleNoCrashUtils = queryForDynamiteModuleNoCrashUtils(asInterface6, readString6, g3, readLong);
                    parcel2.writeNoException();
                    iax.f(parcel2, queryForDynamiteModuleNoCrashUtils);
                    return true;
                case 8:
                    IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    String readString7 = parcel.readString();
                    int readInt3 = parcel.readInt();
                    IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    IObjectWrapper createModuleContext3NoCrashUtils = createModuleContext3NoCrashUtils(asInterface7, readString7, readInt3, asInterface8);
                    parcel2.writeNoException();
                    iax.f(parcel2, createModuleContext3NoCrashUtils);
                    return true;
                default:
                    return false;
            }
        }
    }

    IObjectWrapper createModuleContext(IObjectWrapper iObjectWrapper, String str, int i);

    IObjectWrapper createModuleContext3NoCrashUtils(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2);

    IObjectWrapper createModuleContextNoCrashUtils(IObjectWrapper iObjectWrapper, String str, int i);

    int getIDynamiteLoaderVersion();

    int getModuleVersion(IObjectWrapper iObjectWrapper, String str);

    int getModuleVersion2(IObjectWrapper iObjectWrapper, String str, boolean z);

    int getModuleVersion2NoCrashUtils(IObjectWrapper iObjectWrapper, String str, boolean z);

    IObjectWrapper queryForDynamiteModuleNoCrashUtils(IObjectWrapper iObjectWrapper, String str, boolean z, long j);
}
