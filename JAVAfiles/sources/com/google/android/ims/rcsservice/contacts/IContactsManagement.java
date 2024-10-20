package com.google.android.ims.rcsservice.contacts;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface IContactsManagement extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public static abstract class Stub extends BaseStub implements IContactsManagement {
        static final int TRANSACTION_forceRefreshCapabilities = 3;
        static final int TRANSACTION_getCachedCapabilities = 2;
        static final int TRANSACTION_refreshCapabilities = 1;

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public static class Proxy extends BaseProxy implements IContactsManagement {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.ims.rcsservice.contacts.IContactsManagement");
            }

            @Override // com.google.android.ims.rcsservice.contacts.IContactsManagement
            public ContactsServiceResult forceRefreshCapabilities(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken);
                ContactsServiceResult contactsServiceResult = (ContactsServiceResult) iax.a(transactAndReadException, ContactsServiceResult.CREATOR);
                transactAndReadException.recycle();
                return contactsServiceResult;
            }

            @Override // com.google.android.ims.rcsservice.contacts.IContactsManagement
            public ImsCapabilities getCachedCapabilities(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken);
                ImsCapabilities imsCapabilities = (ImsCapabilities) iax.a(transactAndReadException, ImsCapabilities.CREATOR);
                transactAndReadException.recycle();
                return imsCapabilities;
            }

            @Override // com.google.android.ims.rcsservice.contacts.IContactsManagement
            public ContactsServiceResult refreshCapabilities(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                ContactsServiceResult contactsServiceResult = (ContactsServiceResult) iax.a(transactAndReadException, ContactsServiceResult.CREATOR);
                transactAndReadException.recycle();
                return contactsServiceResult;
            }
        }

        public Stub() {
            super("com.google.android.ims.rcsservice.contacts.IContactsManagement");
        }

        public static IContactsManagement asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.ims.rcsservice.contacts.IContactsManagement");
            if (queryLocalInterface instanceof IContactsManagement) {
                return (IContactsManagement) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    String readString = parcel.readString();
                    enforceNoDataAvail(parcel);
                    ContactsServiceResult forceRefreshCapabilities = forceRefreshCapabilities(readString);
                    parcel2.writeNoException();
                    iax.e(parcel2, forceRefreshCapabilities);
                } else {
                    String readString2 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    ImsCapabilities cachedCapabilities = getCachedCapabilities(readString2);
                    parcel2.writeNoException();
                    iax.e(parcel2, cachedCapabilities);
                }
            } else {
                String readString3 = parcel.readString();
                enforceNoDataAvail(parcel);
                ContactsServiceResult refreshCapabilities = refreshCapabilities(readString3);
                parcel2.writeNoException();
                iax.e(parcel2, refreshCapabilities);
            }
            return true;
        }
    }

    ContactsServiceResult forceRefreshCapabilities(String str);

    ImsCapabilities getCachedCapabilities(String str);

    ContactsServiceResult refreshCapabilities(String str);
}
