package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.IGmsCallbacks;
import defpackage.abhg;
import defpackage.abum;
import defpackage.ahby;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IGmsServiceBroker extends IInterface {
    void getService(IGmsCallbacks iGmsCallbacks, GetServiceRequest getServiceRequest);

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends Binder implements IGmsServiceBroker {
        public static final int TRANSACTION_GET_ACCOUNT_DATA_SERVICE = 17;
        public static final int TRANSACTION_GET_ADDRESS_SERVICE = 24;
        public static final int TRANSACTION_GET_ADMOB_SERVICE = 12;
        public static final int TRANSACTION_GET_APP_DATA_SEARCH_SERVICE = 3;
        public static final int TRANSACTION_GET_APP_STATE_SERVICE = 10;
        public static final int TRANSACTION_GET_AUTH_SERVICE_DEPRECATED = 28;
        public static final int TRANSACTION_GET_AUTO_BACKUP_SERVICE = 23;
        public static final int TRANSACTION_GET_CAR_SERVICE = 25;
        public static final int TRANSACTION_GET_CAST_MIRRORING_SERVICE = 15;
        public static final int TRANSACTION_GET_CAST_SERVICE = 19;
        public static final int TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE = 41;
        public static final int TRANSACTION_GET_CLOUD_SAVE_SERVICE = 33;
        public static final int TRANSACTION_GET_COMMON_SERVICE = 40;
        public static final int TRANSACTION_GET_DEVICE_CONNECTION_SERVICE = 44;
        public static final int TRANSACTION_GET_DEVICE_MANAGER_SERVICE = 36;
        public static final int TRANSACTION_GET_DRIVE_SERVICE = 20;
        public static final int TRANSACTION_GET_DROID_GUARD_SERVICE = 13;
        public static final int TRANSACTION_GET_FEEDBACK_SERVICE = 18;
        public static final int TRANSACTION_GET_FITNESS_SERVICE = 30;
        public static final int TRANSACTION_GET_GAMES_SERVICE = 9;
        public static final int TRANSACTION_GET_GLOBAL_SEARCH_ADMIN_SERVICE = 32;
        public static final int TRANSACTION_GET_GOOGLE_LOCATION_MANAGER_SERVICE = 8;
        public static final int TRANSACTION_GET_IDENTITY_SERVICE = 27;
        public static final int TRANSACTION_GET_KIDS_SERVICE = 45;
        public static final int TRANSACTION_GET_LIGHTWEIGHT_APP_DATA_SEARCH_SERVICE = 21;
        public static final int TRANSACTION_GET_LOCATION_SERVICE = 7;
        public static final int TRANSACTION_GET_LOCKBOX_SERVICE = 14;
        public static final int TRANSACTION_GET_NETWORK_QUALITY_SERVICE = 16;
        public static final int TRANSACTION_GET_PANORAMA_SERVICE = 2;
        public static final int TRANSACTION_GET_PEOPLE_SERVICE = 5;
        public static final int TRANSACTION_GET_PLAY_LOG_SERVICE = 11;
        public static final int TRANSACTION_GET_PLUS_SERVICE = 1;
        public static final int TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE = 37;
        public static final int TRANSACTION_GET_REMINDERS_SERVICE = 38;
        public static final int TRANSACTION_GET_REPORTING_SERVICE = 6;
        public static final int TRANSACTION_GET_SEARCH_ADMINISTRATION_SERVICE = 22;
        public static final int TRANSACTION_GET_SEARCH_CORPORA_SERVICE = 35;
        public static final int TRANSACTION_GET_SEARCH_QUERIES_SERVICE = 31;
        public static final int TRANSACTION_GET_SERVICE = 46;
        public static final int TRANSACTION_GET_UDC_SERVICE = 34;
        public static final int TRANSACTION_GET_USAGE_REPORTING_SERVICE = 43;
        public static final int TRANSACTION_GET_WALLET_SERVICE = 4;
        public static final int TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE = 42;
        public static final int TRANSACTION_GET_WEARABLE_SERVICE = 26;
        public static final int TRANSACTION_VALIDATE_ACCOUNT = 47;

        public Stub() {
            attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
        }

        public static IGmsServiceBroker asInterface(IBinder iBinder) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IGmsServiceBroker)) {
                return (IGmsServiceBroker) queryLocalInterface;
            }
            return new abum(iBinder);
        }

        protected void getLegacyService(int i, IGmsCallbacks iGmsCallbacks, int i2, String str, String str2, String[] strArr, Bundle bundle, IBinder iBinder, String str3, String str4) {
            throw new UnsupportedOperationException();
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str;
            String[] createStringArray;
            String readString;
            String str2;
            Bundle bundle;
            IBinder iBinder;
            String str3;
            String[] strArr;
            if (i > 0 && i <= 16777215) {
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                IGmsCallbacks asInterface = IGmsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                ValidateAccountRequest validateAccountRequest = null;
                GetServiceRequest getServiceRequest = null;
                if (i == 46) {
                    if (parcel.readInt() != 0) {
                        getServiceRequest = GetServiceRequest.CREATOR.createFromParcel(parcel);
                    }
                    getService(asInterface, getServiceRequest);
                } else if (i == 47) {
                    if (parcel.readInt() != 0) {
                        validateAccountRequest = ValidateAccountRequest.CREATOR.createFromParcel(parcel);
                    }
                    validateAccount(asInterface, validateAccountRequest);
                } else {
                    int readInt = parcel.readInt();
                    if (i != 4) {
                        str = parcel.readString();
                    } else {
                        str = null;
                    }
                    switch (i) {
                        case 1:
                            String readString2 = parcel.readString();
                            createStringArray = parcel.createStringArray();
                            readString = parcel.readString();
                            if (parcel.readInt() != 0) {
                                bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                                str2 = readString2;
                                iBinder = null;
                            } else {
                                str2 = readString2;
                                bundle = null;
                                iBinder = null;
                            }
                            str3 = iBinder;
                            strArr = createStringArray;
                            break;
                        case 2:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 23:
                        case 25:
                        case 27:
                        case TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                        case TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                        case TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                        case TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                            if (parcel.readInt() != 0) {
                                bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                                readString = null;
                                strArr = null;
                                iBinder = null;
                                str2 = iBinder;
                                str3 = str2;
                                break;
                            }
                        case 3:
                        case 4:
                        case 21:
                        case 22:
                        case 24:
                        case 26:
                        case 28:
                        case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                        case 31:
                        case 32:
                        case TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                        case TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                        case TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                        case 39:
                        case TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                        case TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                        case TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                        case TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                        default:
                            readString = null;
                            strArr = null;
                            bundle = strArr;
                            iBinder = bundle;
                            str2 = iBinder;
                            str3 = str2;
                            break;
                        case 9:
                            String readString3 = parcel.readString();
                            createStringArray = parcel.createStringArray();
                            String readString4 = parcel.readString();
                            IBinder readStrongBinder = parcel.readStrongBinder();
                            String readString5 = parcel.readString();
                            if (parcel.readInt() != 0) {
                                str2 = readString4;
                                iBinder = readStrongBinder;
                                str3 = readString5;
                                bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                                readString = readString3;
                            } else {
                                str2 = readString4;
                                iBinder = readStrongBinder;
                                str3 = readString5;
                                readString = readString3;
                                bundle = null;
                            }
                            strArr = createStringArray;
                            break;
                        case 10:
                            String readString6 = parcel.readString();
                            strArr = parcel.createStringArray();
                            readString = readString6;
                            bundle = null;
                            iBinder = bundle;
                            str2 = iBinder;
                            str3 = str2;
                            break;
                        case 19:
                            IBinder readStrongBinder2 = parcel.readStrongBinder();
                            if (parcel.readInt() != 0) {
                                bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                                iBinder = readStrongBinder2;
                                readString = null;
                                strArr = null;
                                str2 = null;
                            } else {
                                iBinder = readStrongBinder2;
                                readString = null;
                                strArr = null;
                                bundle = null;
                                str2 = null;
                            }
                            str3 = str2;
                            break;
                        case 20:
                        case 30:
                            String[] createStringArray2 = parcel.createStringArray();
                            String readString7 = parcel.readString();
                            if (parcel.readInt() != 0) {
                                bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                                strArr = createStringArray2;
                                iBinder = null;
                            } else {
                                strArr = createStringArray2;
                                bundle = null;
                                iBinder = null;
                            }
                            str2 = iBinder;
                            str3 = str2;
                            readString = readString7;
                            break;
                        case TRANSACTION_GET_UDC_SERVICE /* 34 */:
                            readString = parcel.readString();
                            strArr = null;
                            bundle = strArr;
                            iBinder = bundle;
                            str2 = iBinder;
                            str3 = str2;
                            break;
                    }
                    getLegacyService(i, asInterface, readInt, str, readString, strArr, bundle, iBinder, str2, str3);
                }
                abhg.m(parcel2);
                parcel2.writeNoException();
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        protected void validateAccount(IGmsCallbacks iGmsCallbacks, ValidateAccountRequest validateAccountRequest) {
            throw new UnsupportedOperationException();
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
