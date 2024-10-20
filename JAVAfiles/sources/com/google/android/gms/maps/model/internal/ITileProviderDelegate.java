package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.model.Tile;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ITileProviderDelegate extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ITileProviderDelegate {
        static final int TRANSACTION_getTile = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ITileProviderDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
            }

            @Override // com.google.android.gms.maps.model.internal.ITileProviderDelegate
            public Tile getTile(int i, int i2, int i3) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                obtainAndWriteInterfaceToken.writeInt(i3);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                Tile tile = (Tile) iax.a(transactAndReadException, Tile.CREATOR);
                transactAndReadException.recycle();
                return tile;
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        }

        public static ITileProviderDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
            if (queryLocalInterface instanceof ITileProviderDelegate) {
                return (ITileProviderDelegate) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                enforceNoDataAvail(parcel);
                Tile tile = getTile(readInt, readInt2, readInt3);
                parcel2.writeNoException();
                iax.e(parcel2, tile);
                return true;
            }
            return false;
        }
    }

    Tile getTile(int i, int i2, int i3);
}
