package defpackage;

import com.google.android.gms.common.internal.IGmsServiceBroker;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aglq {
    public static final /* synthetic */ int a = 0;

    static {
        int[] a2 = apep.a();
        int i = 0;
        for (int i2 = 0; i2 < 82; i2++) {
            int i3 = a2[i2];
            int i4 = i3 - 1;
            if (i3 != 0) {
                i = Math.max(i, i4);
            } else {
                throw null;
            }
        }
        aqwr[] aqwrVarArr = new aqwr[i + 1];
        int[] a3 = apep.a();
        for (int i5 = 0; i5 < 82; i5++) {
            int i6 = a3[i5];
            int i7 = i6 - 1;
            if (i6 != 0) {
                if (i7 != 17 && i7 != 27 && i7 != 78 && i7 != 82) {
                    switch (i7) {
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            break;
                        default:
                            switch (i7) {
                                case 19:
                                case 20:
                                case 21:
                                    break;
                                default:
                                    switch (i7) {
                                        case 31:
                                        case 32:
                                        case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                                        case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                                        case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                                        case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                                        case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                                        case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                                        case 39:
                                        case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                                        case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                                        case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                                        case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                                        case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                                        case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                                        case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                                        case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                                        case 48:
                                        case 49:
                                            break;
                                        default:
                                            switch (i7) {
                                                case 56:
                                                case 57:
                                                case 58:
                                                case 59:
                                                case 60:
                                                case 61:
                                                case 62:
                                                case 63:
                                                case 64:
                                                case 65:
                                                case 66:
                                                case 67:
                                                case 68:
                                                case 69:
                                                case 70:
                                                case 71:
                                                case 72:
                                                case 73:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                    }
                            }
                    }
                }
                aqwr aqwrVar = new aqwr();
                aqwrVarArr[i7] = aqwrVar;
                int i8 = alog.d;
                aqwrVar.a = alsx.a;
            } else {
                throw null;
            }
        }
    }
}
