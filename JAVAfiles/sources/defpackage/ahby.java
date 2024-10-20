package defpackage;

import android.os.Parcelable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ahby implements Parcelable {
    public static final int ERROR_CANNOT_START_SESSION = 13;
    public static final int ERROR_CANNOT_TERMINATE_SESSION = 16;
    public static final int ERROR_CONNECTION_OFFLINE = 4;
    public static final int ERROR_DEFAULT_DIALER_NOT_ENRICHED_CALLING_ENABLED = 26;
    public static final int ERROR_FILE_NOT_FOUND = 8;
    public static final int ERROR_HTTP_FILE_TRANSFER_FAILURE = 15;
    public static final int ERROR_IMS_CONNECTION_FAILED = 30;
    public static final int ERROR_INVALID_AUDIO_DURATION = 18;
    public static final int ERROR_INVALID_DESTINATION = 11;
    public static final int ERROR_MESSAGE_ID_NOT_EXIST = 23;
    public static final int ERROR_MSISDN_TO_SESSION_ID_MAP_NOT_EXIST = 24;
    public static final int ERROR_MSRP_SESSION_FAILED = 17;
    public static final int ERROR_NETWORK_FAILURE = 3;
    public static final int ERROR_NOTIFICATION_TYPE_NOT_EXIST = 22;
    public static final int ERROR_NOT_INITIALIZED = 2;
    public static final int ERROR_NOT_SUPPORTED = 12;
    public static final int ERROR_OPERATION_NOT_ALLOWED = 31;
    public static final int ERROR_OTHER_PARTY_DOES_NOT_EXIST = 6;
    public static final int ERROR_OTHER_PARTY_OFFLINE = 5;
    public static final int ERROR_OTHER_PARTY_TEMPORARILY_NOT_REACHABLE = 7;
    public static final int ERROR_PARSING_MESSAGE = 27;
    public static final int ERROR_POST_CALL_NOTE_SESSION_CANNOT_SEND = 20;
    public static final int ERROR_POST_CALL_NOTE_SESSION_CANNOT_START = 21;
    public static final int ERROR_POST_CALL_NOTE_TRANSFER_FAILED = 19;
    public static final int ERROR_SESSION_NOT_FOUND = 9;
    public static final int ERROR_SESSION_STOPPED = 10;
    public static final int ERROR_SESSION_TIMEOUT = 14;
    public static final int ERROR_SIM_NOT_FOUND = 28;
    public static final int ERROR_UNKNOWN = 1;
    public static final int ERROR_UPLOAD_CALL_COMPOSER_IMAGE_FAILED = 25;
    public static final int ERROR_VENDOR_IMS_NOT_FOUND = 29;
    public static final int SUCCESS = 0;
    protected int code = 0;
    protected String description = null;

    public static String codeToString(int i) {
        switch (i) {
            case 1:
                return "Unknown";
            case 2:
                return "API call is not initialized";
            case 3:
                return "Network failure";
            case 4:
                return "IMS/RCS connection is offline";
            case 5:
                return "Remote user offline offline";
            case 6:
                return "Remote user unknown";
            case 7:
                return "Remote user temporarily unreachable";
            case 8:
                return "Local file not found";
            case 9:
                return "Unable to find session";
            case 10:
                return "The transfer session has stoped";
            case 11:
                return "The destination is not valid";
            case 12:
                return "Operation is not supported";
            case 13:
                return "Error starting session";
            case 14:
                return "Timeout starting session";
            case 15:
                return "Http file transfer failed";
            case 16:
                return "Cannot terminate session";
            case 17:
                return "MSRP session failed";
            case 18:
                return "Invalid audio duration";
            case 19:
                return "Post call note transfer failed";
            case 20:
                return "Post call note session cannot be sent";
            case 21:
                return "Post call note session cannot be started";
            case 22:
                return "Notification type does not exist";
            case 23:
                return "Message id does not exist";
            case 24:
                return "Session id map does not exist";
            case 25:
                return "Upload call composer image failed";
            case 26:
                return "Default dialer does not have enriched calling";
            case 27:
                return "Error parsing message";
            case 28:
                return "Sim not found";
            case ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                return "Vendor IMS not found";
            case 30:
                return "Vendor IMS connection failed.";
            case 31:
                return "Operation is not allowed.";
            default:
                return Integer.toString(i);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean succeeded() {
        if (this.code == 0) {
            return true;
        }
        return false;
    }

    public int toCsClientLibResultCode() {
        int i = this.code;
        if (i != 0) {
            switch (i) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    return 3;
                case 8:
                    return 4;
                case 9:
                case 10:
                case 13:
                case 14:
                case 16:
                case 17:
                    return 5;
                case 11:
                    return 9;
                case 12:
                    return 8;
                case 15:
                    return 7;
                case 18:
                    return 2;
                case 19:
                case 20:
                case 21:
                    return 6;
                default:
                    return 1;
            }
        }
        return 0;
    }

    public String toString() {
        if (this.code == 0) {
            return "OK";
        }
        StringBuilder sb = new StringBuilder("Error: (");
        sb.append(codeToString(this.code));
        sb.append(")");
        if (!Objects.isNull(this.description)) {
            sb.append(", description: (");
            sb.append(this.description);
            sb.append(")");
        }
        return sb.toString();
    }
}
