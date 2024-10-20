package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IIndoorBuildingDelegate extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IIndoorBuildingDelegate {
        static final int TRANSACTION_equalsRemote = 5;
        static final int TRANSACTION_getActiveLevelIndex = 1;
        static final int TRANSACTION_getDefaultLevelIndex = 2;
        static final int TRANSACTION_getLevels = 3;
        static final int TRANSACTION_hashCodeRemote = 6;
        static final int TRANSACTION_isUnderground = 4;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IIndoorBuildingDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
            }

            @Override // com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate
            public boolean equalsRemote(IIndoorBuildingDelegate iIndoorBuildingDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iIndoorBuildingDelegate);
                Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate
            public int getActiveLevelIndex() {
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate
            public int getDefaultLevelIndex() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate
            public List<IBinder> getLevels() {
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                ArrayList<IBinder> createBinderArrayList = transactAndReadException.createBinderArrayList();
                transactAndReadException.recycle();
                return createBinderArrayList;
            }

            @Override // com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate
            public int hashCodeRemote() {
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate
            public boolean isUnderground() {
                Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
        }

        public static IIndoorBuildingDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
            if (queryLocalInterface instanceof IIndoorBuildingDelegate) {
                return (IIndoorBuildingDelegate) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    int activeLevelIndex = getActiveLevelIndex();
                    parcel2.writeNoException();
                    parcel2.writeInt(activeLevelIndex);
                    return true;
                case 2:
                    int defaultLevelIndex = getDefaultLevelIndex();
                    parcel2.writeNoException();
                    parcel2.writeInt(defaultLevelIndex);
                    return true;
                case 3:
                    List<IBinder> levels = getLevels();
                    parcel2.writeNoException();
                    parcel2.writeBinderList(levels);
                    return true;
                case 4:
                    boolean isUnderground = isUnderground();
                    parcel2.writeNoException();
                    int i3 = iax.a;
                    parcel2.writeInt(isUnderground ? 1 : 0);
                    return true;
                case 5:
                    IIndoorBuildingDelegate asInterface = asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    boolean equalsRemote = equalsRemote(asInterface);
                    parcel2.writeNoException();
                    int i4 = iax.a;
                    parcel2.writeInt(equalsRemote ? 1 : 0);
                    return true;
                case 6:
                    int hashCodeRemote = hashCodeRemote();
                    parcel2.writeNoException();
                    parcel2.writeInt(hashCodeRemote);
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean equalsRemote(IIndoorBuildingDelegate iIndoorBuildingDelegate);

    int getActiveLevelIndex();

    int getDefaultLevelIndex();

    List<IBinder> getLevels();

    int hashCodeRemote();

    boolean isUnderground();
}
