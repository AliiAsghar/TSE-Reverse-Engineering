package defpackage;

import com.google.android.gms.common.internal.IGmsServiceBroker;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahcs {
    public final ahcu a;

    public ahcs(ahcu ahcuVar) {
        this.a = ahcuVar;
    }

    public final String toString() {
        String str;
        String obj = super.toString();
        ahcu ahcuVar = this.a;
        int at = aktp.at(ahcuVar.c);
        if (at != 0) {
            switch (at) {
                case 1:
                    break;
                case 2:
                    str = "AUTOMATED";
                    break;
                case 3:
                    str = "USER";
                    break;
                case 4:
                    str = "GENERIC_CLICK";
                    break;
                case 5:
                    str = "TAP";
                    break;
                case 6:
                    str = "KEYBOARD_ENTER";
                    break;
                case 7:
                    str = "MOUSE_CLICK";
                    break;
                case 8:
                    str = "LEFT_CLICK";
                    break;
                case 9:
                    str = "RIGHT_CLICK";
                    break;
                case 10:
                    str = "HOVER";
                    break;
                case 11:
                    str = "INTO_BOUNDING_BOX";
                    break;
                case 12:
                    str = "OUT_OF_BOUNDING_BOX";
                    break;
                case 13:
                    str = "PINCH";
                    break;
                case 14:
                    str = "PINCH_OPEN";
                    break;
                case 15:
                    str = "PINCH_CLOSED";
                    break;
                case 16:
                    str = "INPUT_TEXT";
                    break;
                case 17:
                    str = "INPUT_KEYBOARD";
                    break;
                case 18:
                    str = "INPUT_VOICE";
                    break;
                case 19:
                    str = "RESIZE_BROWSER";
                    break;
                case 20:
                    str = "ROTATE_SCREEN";
                    break;
                case 21:
                    str = "DIRECTIONAL_MOVEMENT";
                    break;
                case 22:
                    str = "SWIPE";
                    break;
                case 23:
                    str = "SCROLL_BAR";
                    break;
                case 24:
                    str = "MOUSE_WHEEL";
                    break;
                case 25:
                    str = "ARROW_KEYS";
                    break;
                case 26:
                    str = "NAVIGATE";
                    break;
                case 27:
                    str = "BACK_BUTTON";
                    break;
                case 28:
                    str = "UNKNOWN_ACTION";
                    break;
                case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                    str = "HEAD_MOVEMENT";
                    break;
                case 30:
                    str = "SHAKE";
                    break;
                case 31:
                    str = "DRAG";
                    break;
                case 32:
                    str = "LONG_PRESS";
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                    str = "KEY_PRESS";
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                    str = "ACTION_BY_TIMER";
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                    str = "DOUBLE_CLICK";
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                    str = "DOUBLE_TAP";
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                    str = "ROLL";
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                    str = "DROP";
                    break;
                case 39:
                    str = "FORCE_TOUCH";
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                    str = "MULTI_KEY_PRESS";
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                    str = "TWO_FINGER_DRAG";
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                    str = "ENTER_PROXIMITY";
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                default:
                    str = "null";
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                    str = "CAUSAL_USER_ACTION";
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                    str = "CAUSAL_AUTOMATED";
                    break;
                case 48:
                    str = "INPUT_STYLUS";
                    break;
                case 49:
                    str = "TWO_FINGER_DRAG_UP";
                    break;
                case 50:
                    str = "TWO_FINGER_DRAG_DOWN";
                    break;
                case 51:
                    str = "BROWSER_ACTION";
                    break;
            }
            return obj + " " + str + " " + String.valueOf(ahcuVar);
        }
        str = "UNASSIGNED_USER_ACTION_ID";
        return obj + " " + str + " " + String.valueOf(ahcuVar);
    }
}
