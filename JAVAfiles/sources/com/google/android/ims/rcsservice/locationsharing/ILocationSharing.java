package com.google.android.ims.rcsservice.locationsharing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ILocationSharing extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static abstract class Stub extends BaseStub implements ILocationSharing {
        static final int TRANSACTION_pushLocation = 1;
        static final int TRANSACTION_pushLocationToGroup = 2;

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public static class Proxy extends BaseProxy implements ILocationSharing {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcsservice.locationsharing.ILocationSharing");
            }

            @Override // com.google.android.ims.rcsservice.locationsharing.ILocationSharing
            public LocationSharingResult pushLocation(String str, LocationInformation locationInformation, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                iax.d(obtainAndWriteInterfaceToken, locationInformation);
                obtainAndWriteInterfaceToken.writeString(str2);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                LocationSharingResult locationSharingResult = (LocationSharingResult) iax.a(transactAndReadException, LocationSharingResult.CREATOR);
                transactAndReadException.recycle();
                return locationSharingResult;
            }

            @Override // com.google.android.ims.rcsservice.locationsharing.ILocationSharing
            public LocationSharingResult[] pushLocationToGroup(long j, LocationInformation locationInformation, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                iax.d(obtainAndWriteInterfaceToken, locationInformation);
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                LocationSharingResult[] locationSharingResultArr = (LocationSharingResult[]) transactAndReadException.createTypedArray(LocationSharingResult.CREATOR);
                transactAndReadException.recycle();
                return locationSharingResultArr;
            }
        }

        public Stub() {
            super("com.google.android.ims.rcsservice.locationsharing.ILocationSharing");
        }

        public static ILocationSharing asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcsservice.locationsharing.ILocationSharing");
            if (queryLocalInterface instanceof ILocationSharing) {
                return (ILocationSharing) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                long readLong = parcel.readLong();
                LocationInformation locationInformation = (LocationInformation) iax.a(parcel, LocationInformation.CREATOR);
                String readString = parcel.readString();
                enforceNoDataAvail(parcel);
                LocationSharingResult[] pushLocationToGroup = pushLocationToGroup(readLong, locationInformation, readString);
                parcel2.writeNoException();
                parcel2.writeTypedArray(pushLocationToGroup, 1);
            } else {
                String readString2 = parcel.readString();
                LocationInformation locationInformation2 = (LocationInformation) iax.a(parcel, LocationInformation.CREATOR);
                String readString3 = parcel.readString();
                enforceNoDataAvail(parcel);
                LocationSharingResult pushLocation = pushLocation(readString2, locationInformation2, readString3);
                parcel2.writeNoException();
                iax.e(parcel2, pushLocation);
            }
            return true;
        }
    }

    LocationSharingResult pushLocation(String str, LocationInformation locationInformation, String str2);

    LocationSharingResult[] pushLocationToGroup(long j, LocationInformation locationInformation, String str);
}
