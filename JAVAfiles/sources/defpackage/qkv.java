package defpackage;

import com.android.vcard.VCardConstants;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qkv {
    public static final alog a = alog.B(206, 207, 213, 214, 215, 216, 219, 238, 237, 235, 236);
    public static final alpt b = alpt.r(3, 16);
    public static final alpt c = alpt.u(1, 2, 11, 15, 14);
    public static final alpt d = alpt.t(5, 6, 105, 103);
    private static final alog g = alog.s("address", "charset");
    public static final alog e = alog.t("address", "charset", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
    public static final alog f = alog.r("address");

    public static String a(int i) {
        if (i != 240) {
            if (i != 252) {
                if (i != 253) {
                    switch (i) {
                        case 1:
                            return "MESSAGE_STATUS_OUTGOING_COMPLETE";
                        case 2:
                            return "MESSAGE_STATUS_OUTGOING_DELIVERED";
                        case 3:
                            return "MESSAGE_STATUS_OUTGOING_DRAFT";
                        case 4:
                            return "MESSAGE_STATUS_OUTGOING_YET_TO_SEND";
                        case 5:
                            return "MESSAGE_STATUS_OUTGOING_SENDING";
                        case 6:
                            return "MESSAGE_STATUS_OUTGOING_RESENDING";
                        case 7:
                            return "MESSAGE_STATUS_OUTGOING_AWAITING_RETRY";
                        case 8:
                            return "MESSAGE_STATUS_OUTGOING_FAILED";
                        case 9:
                            return "MESSAGE_STATUS_OUTGOING_FAILED_EMERGENCY_NUMBER";
                        case 10:
                            return "MESSAGE_STATUS_OUTGOING_SEND_AFTER_PROCESSING";
                        case 11:
                            return "MESSAGE_STATUS_OUTGOING_DISPLAYED";
                        case 12:
                            return "MESSAGE_STATUS_OUTGOING_CANCELED";
                        case 13:
                            return "MESSAGE_STATUS_OUTGOING_FAILED_TOO_LARGE";
                        case 14:
                            return "MESSAGE_STATUS_OUTGOING_NOT_DELIVERED_YET";
                        case 15:
                            return "MESSAGE_STATUS_OUTGOING_REVOCATION_PENDING";
                        case 16:
                            return "MESSAGE_STATUS_OUTGOING_SCHEDULED";
                        case 17:
                            return "MESSAGE_STATUS_OUTGOING_FAILED_RECIPIENT_LOST_RCS";
                        case 18:
                            return "MESSAGE_STATUS_OUTGOING_FAILED_NO_RETRY_NO_FALLBACK";
                        case 19:
                            return "MESSAGE_STATUS_OUTGOING_FAILED_RECIPIENT_DID_NOT_DECRYPT";
                        case 20:
                            return "MESSAGE_STATUS_OUTGOING_VALIDATING";
                        case 21:
                            return "MESSAGE_STATUS_OUTGOING_FAILED_RECIPIENT_LOST_ENCRYPTION";
                        case 22:
                            return "MESSAGE_STATUS_OUTGOING_FAILED_RECIPIENT_DID_NOT_DECRYPT_NO_MORE_RETRY";
                        default:
                            switch (i) {
                                case VCardConstants.DEFAULT_PREF /* 100 */:
                                    return "MESSAGE_STATUS_INCOMING_COMPLETE";
                                case 101:
                                    return "MESSAGE_STATUS_INCOMING_YET_TO_MANUAL_DOWNLOAD";
                                case 102:
                                    return "MESSAGE_STATUS_INCOMING_RETRYING_MANUAL_DOWNLOAD";
                                case 103:
                                    return "MESSAGE_STATUS_INCOMING_MANUAL_DOWNLOADING";
                                case 104:
                                    return "MESSAGE_STATUS_INCOMING_RETRYING_AUTO_DOWNLOAD";
                                case 105:
                                    return "MESSAGE_STATUS_INCOMING_AUTO_DOWNLOADING";
                                case 106:
                                    return "MESSAGE_STATUS_INCOMING_DOWNLOAD_FAILED";
                                case 107:
                                    return "MESSAGE_STATUS_INCOMING_EXPIRED_OR_NOT_AVAILABLE";
                                case 108:
                                    return "MESSAGE_STATUS_INCOMING_DELIVERED";
                                case 109:
                                    return "MESSAGE_STATUS_INCOMING_DISPLAYED";
                                case 110:
                                    return "MESSAGE_STATUS_INCOMING_DOWNLOAD_CANCELED";
                                case 111:
                                    return "MESSAGE_STATUS_INCOMING_DOWNLOAD_FAILED_TOO_LARGE";
                                case 112:
                                    return "MESSAGE_STATUS_INCOMING_DOWNLOAD_FAILED_SIM_HAS_NO_DATA";
                                case 113:
                                case 114:
                                    break;
                                case 115:
                                    return "MESSAGE_STATUS_INCOMING_AWAITING_AUTO_DOWNLOAD";
                                default:
                                    switch (i) {
                                        case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
                                            return "MESSAGE_STATUS_TOMBSTONE_PARTICIPANT_JOINED";
                                        case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                                            return "MESSAGE_STATUS_TOMBSTONE_PARTICIPANT_LEFT";
                                        case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                                            return "MESSAGE_STATUS_TOMBSTONE_SELF_LEFT";
                                        case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
                                            return "MESSAGE_STATUS_TOMBSTONE_RCS_GROUP_CREATED";
                                        case 204:
                                            return "MESSAGE_STATUS_TOMBSTONE_MMS_GROUP_CREATED";
                                        case 205:
                                            return "MESSAGE_STATUS_TOMBSTONE_SMS_BROADCAST_CREATED";
                                        case 206:
                                            return "MESSAGE_STATUS_TOMBSTONE_ONE_ON_ONE_SMS_CREATED";
                                        case 207:
                                            return "MESSAGE_STATUS_TOMBSTONE_ONE_ON_ONE_RCS_CREATED";
                                        case 208:
                                            return "MESSAGE_STATUS_TOMBSTONE_SWITCH_TO_GROUP_MMS";
                                        case 209:
                                            return "MESSAGE_STATUS_TOMBSTONE_SWITCH_TO_BROADCAST_SMS";
                                        case 210:
                                            return "MESSAGE_STATUS_TOMBSTONE_SHOW_LINK_PREVIEWS";
                                        case 211:
                                            return "MESSAGE_STATUS_TOMBSTONE_GROUP_RENAMED_LOCAL";
                                        case 212:
                                            return "MESSAGE_STATUS_TOMBSTONE_VERIFIED_SMS_APPLICABLE";
                                        case 213:
                                        case 216:
                                        case 219:
                                            break;
                                        case 214:
                                            return "MESSAGE_STATUS_TOMBSTONE_PROTOCOL_SWITCH_TO_TEXT";
                                        case 215:
                                            return "MESSAGE_STATUS_TOMBSTONE_PROTOCOL_SWITCH_TO_RCS";
                                        case 217:
                                            return "MESSAGE_STATUS_TOMBSTONE_GROUP_RENAMED_GLOBAL";
                                        case 218:
                                            return "MESSAGE_STATUS_TOMBSTONE_GROUP_NAME_CLEARED_GLOBAL";
                                        case 220:
                                            return "MESSAGE_STATUS_TOMBSTONE_SELF_REMOVED_FROM_GROUP";
                                        case 221:
                                            return "MESSAGE_STATUS_TOMBSTONE_PARTICIPANT_REMOVED_FROM_GROUP";
                                        default:
                                            switch (i) {
                                                case 225:
                                                    return "MESSAGE_STATUS_TOMBSTONE_ENCRYPTED_GROUP_PARTICIPANT_JOINED";
                                                case 226:
                                                    return "MESSAGE_STATUS_TOMBSTONE_ENCRYPTED_GROUP_PARTICIPANT_JOINED_INFO";
                                                case 227:
                                                    return "MESSAGE_STATUS_TOMBSTONE_ENCRYPTED_GROUP_PARTICIPANT_LEFT";
                                                case 228:
                                                    return "MESSAGE_STATUS_TOMBSTONE_ENCRYPTED_GROUP_SELF_LEFT";
                                                case 229:
                                                    return "MESSAGE_STATUS_TOMBSTONE_ENCRYPTED_GROUP_CREATED";
                                                case 230:
                                                    return "MESSAGE_STATUS_TOMBSTONE_SELF_REMOVED_FROM_ENCRYPTED_GROUP";
                                                case 231:
                                                    return "MESSAGE_STATUS_TOMBSTONE_PARTICIPANT_REMOVED_FROM_ENCRYPTED_GROUP";
                                                default:
                                                    switch (i) {
                                                        case 233:
                                                            return "MESSAGE_STATUS_TOMBSTONE_GROUP_PROTOCOL_SWITCH_RCS_TO_E2EE";
                                                        case 234:
                                                            return "MESSAGE_STATUS_TOMBSTONE_GROUP_PROTOCOL_SWITCH_E2EE_TO_RCS";
                                                        case 235:
                                                            return "MESSAGE_STATUS_TOMBSTONE_PROTOCOL_SWITCH_TEXT_TO_E2EE";
                                                        case 236:
                                                            return "MESSAGE_STATUS_TOMBSTONE_PROTOCOL_SWITCH_E2EE_TO_TEXT";
                                                        case 237:
                                                            return "MESSAGE_STATUS_TOMBSTONE_PROTOCOL_SWITCH_RCS_TO_E2EE";
                                                        case 238:
                                                            return "MESSAGE_STATUS_TOMBSTONE_PROTOCOL_SWITCH_E2EE_TO_RCS";
                                                        default:
                                                            switch (i) {
                                                                case 246:
                                                                    return "MESSAGE_STATUS_TOMBSTONE_SATELLITE_END_OF_EMERGENCY_SUCCESS_HELP_STILL_NEEDED";
                                                                case 247:
                                                                    return "MESSAGE_STATUS_TOMBSTONE_SATELLITE_END_OF_EMERGENCY_SUCCESS_HELP_NO_LONGER_NEEDED";
                                                                case 248:
                                                                    return "MESSAGE_STATUS_TOMBSTONE_SATELLITE_END_OF_EMERGENCY_FAILURE_HELP_STILL_NEEDED";
                                                                case 249:
                                                                    return "MESSAGE_STATUS_TOMBSTONE_SATELLITE_END_OF_EMERGENCY_FAILURE_HELP_NO_LONGER_NEEDED";
                                                                case 250:
                                                                    return "MESSAGE_STATUS_TOMBSTONE_SATELLITE_END_OF_EMERGENCY_UNEXPECTED_END";
                                                                default:
                                                                    return a.cb(i, "MESSAGE_STATUS_UNKNOWN (", ")");
                                                            }
                                                    }
                                            }
                                    }
                            }
                            return a.cb(i, "MESSAGE_STATUS (", ")");
                    }
                }
                return "MESSAGE_STATUS_TOMBSTONE_PENPAL_PROACTIVE_MESSAGE_NOTICE";
            }
            return "MESSAGE_STATUS_TOMBSTONE_GROUP_PROTOCOL_SWITCH_E2EE_TO_MMS";
        }
        return "MESSAGE_STATUS_TOMBSTONE_RBM_SIM_SWITCH";
    }

    public static String[] b() {
        alog alogVar = g;
        return (String[]) alogVar.toArray(new String[((alsx) alogVar).c]);
    }
}
