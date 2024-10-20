package com.google.android.gms.maps.model.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.maps.model.internal.IOnFeatureClickListener;
import com.google.android.gms.maps.model.internal.IStyleFactory;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IFeatureLayerDelegate extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IFeatureLayerDelegate {
        static final int TRANSACTION_addOnFeatureClickListener = 4;
        static final int TRANSACTION_getDatasetId = 6;
        static final int TRANSACTION_getFeatureType = 1;
        static final int TRANSACTION_isAvailable = 2;
        static final int TRANSACTION_removeOnFeatureClickListener = 5;
        static final int TRANSACTION_setFeatureStyle = 3;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IFeatureLayerDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.model.internal.IFeatureLayerDelegate");
            }

            @Override // com.google.android.gms.maps.model.internal.IFeatureLayerDelegate
            public void addOnFeatureClickListener(IOnFeatureClickListener iOnFeatureClickListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnFeatureClickListener);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IFeatureLayerDelegate
            public String getDatasetId() {
                Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
                String readString = transactAndReadException.readString();
                transactAndReadException.recycle();
                return readString;
            }

            @Override // com.google.android.gms.maps.model.internal.IFeatureLayerDelegate
            public String getFeatureType() {
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                String readString = transactAndReadException.readString();
                transactAndReadException.recycle();
                return readString;
            }

            @Override // com.google.android.gms.maps.model.internal.IFeatureLayerDelegate
            public boolean isAvailable() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.model.internal.IFeatureLayerDelegate
            public void removeOnFeatureClickListener(IOnFeatureClickListener iOnFeatureClickListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnFeatureClickListener);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.model.internal.IFeatureLayerDelegate
            public void setFeatureStyle(IStyleFactory iStyleFactory) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStyleFactory);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.model.internal.IFeatureLayerDelegate");
        }

        public static IFeatureLayerDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IFeatureLayerDelegate");
            if (queryLocalInterface instanceof IFeatureLayerDelegate) {
                return (IFeatureLayerDelegate) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    String featureType = getFeatureType();
                    parcel2.writeNoException();
                    parcel2.writeString(featureType);
                    return true;
                case 2:
                    boolean isAvailable = isAvailable();
                    parcel2.writeNoException();
                    int i3 = iax.a;
                    parcel2.writeInt(isAvailable ? 1 : 0);
                    return true;
                case 3:
                    IStyleFactory asInterface = IStyleFactory.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    setFeatureStyle(asInterface);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    IOnFeatureClickListener asInterface2 = IOnFeatureClickListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    addOnFeatureClickListener(asInterface2);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    IOnFeatureClickListener asInterface3 = IOnFeatureClickListener.Stub.asInterface(parcel.readStrongBinder());
                    enforceNoDataAvail(parcel);
                    removeOnFeatureClickListener(asInterface3);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    String datasetId = getDatasetId();
                    parcel2.writeNoException();
                    parcel2.writeString(datasetId);
                    return true;
                default:
                    return false;
            }
        }
    }

    void addOnFeatureClickListener(IOnFeatureClickListener iOnFeatureClickListener);

    String getDatasetId();

    String getFeatureType();

    boolean isAvailable();

    void removeOnFeatureClickListener(IOnFeatureClickListener iOnFeatureClickListener);

    void setFeatureStyle(IStyleFactory iStyleFactory);
}
