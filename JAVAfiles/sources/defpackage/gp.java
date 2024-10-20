package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gp {
    public static final alvi a = alvi.m("android/support/v7/mms/pdu/PduHeaders");
    public static final alog b = alog.C(new go(128, "MESSAGE_TYPE_SEND_REQ"), new go(129, "MESSAGE_TYPE_SEND_CONF"), new go(130, "MESSAGE_TYPE_NOTIFICATION_IND"), new go(131, "MESSAGE_TYPE_NOTIFYRESP_IND"), new go(132, "MESSAGE_TYPE_RETRIEVE_CONF"), new go(133, "MESSAGE_TYPE_ACKNOWLEDGE_IND"), new go(134, "MESSAGE_TYPE_DELIVERY_IND"), new go(135, "MESSAGE_TYPE_READ_REC_IND"), new go(136, "MESSAGE_TYPE_READ_ORIG_IND"), new go(137, "MESSAGE_TYPE_FORWARD_REQ"), new go(138, "MESSAGE_TYPE_FORWARD_CONF"), new go(139, "MESSAGE_TYPE_MBOX_STORE_REQ"), new go(140, "MESSAGE_TYPE_MBOX_STORE_CONF"), new go(141, "MESSAGE_TYPE_MBOX_VIEW_REQ"), new go(142, "MESSAGE_TYPE_MBOX_VIEW_CONF"), new go(143, "MESSAGE_TYPE_MBOX_UPLOAD_REQ"), new go(144, "MESSAGE_TYPE_MBOX_UPLOAD_CONF"), new go(145, "MESSAGE_TYPE_MBOX_DELETE_REQ"), new go(146, "MESSAGE_TYPE_MBOX_DELETE_CONF"), new go(147, "MESSAGE_TYPE_MBOX_DESCR"), new go(148, "MESSAGE_TYPE_DELETE_REQ"), new go(149, "MESSAGE_TYPE_DELETE_CONF"), new go(150, "MESSAGE_TYPE_CANCEL_REQ"), new go(151, "MESSAGE_TYPE_CANCEL_CONF"));
    public static final alog c = alog.s(new go(128, "VALUE_YES"), new go(129, "VALUE_NO"));
    public static final alog d = alog.s(new go(128, "VALUE_ABSOLUTE_TOKEN"), new go(129, "VALUE_RELATIVE_TOKEN"));
    public static final alog e = alog.u(new go(19, "MMS_VERSION_1_3"), new go(18, "MMS_VERSION_1_2"), new go(17, "MMS_VERSION_1_1"), new go(16, "MMS_VERSION_1_0"));
    public static final alog f = alog.y(new go(128, "STATUS_EXPIRED"), new go(129, "STATUS_RETRIEVED"), new go(130, "STATUS_REJECTED"), new go(131, "STATUS_DEFERRED"), new go(132, "STATUS_UNRECOGNIZED"), new go(133, "STATUS_INDETERMINATE"), new go(134, "STATUS_FORWARDED"), new go(135, "STATUS_UNREACHABLE"));
    public static final alog g = alog.t(new go(128, "PRIORITY_LOW"), new go(129, "PRIORITY_NORMAL"), new go(130, "PRIORITY_HIGH"));
    public static final alog h = alog.C(new go(128, "RESPONSE_STATUS_OK"), new go(129, "RESPONSE_STATUS_ERROR_UNSPECIFIED"), new go(130, "RESPONSE_STATUS_ERROR_SERVICE_DENIED"), new go(131, "RESPONSE_STATUS_ERROR_MESSAGE_FORMAT_CORRUPT"), new go(132, "RESPONSE_STATUS_ERROR_SENDING_ADDRESS_UNRESOLVED"), new go(133, "RESPONSE_STATUS_ERROR_MESSAGE_NOT_FOUND"), new go(134, "RESPONSE_STATUS_ERROR_NETWORK_PROBLEM"), new go(135, "RESPONSE_STATUS_ERROR_CONTENT_NOT_ACCEPTED"), new go(136, "RESPONSE_STATUS_ERROR_UNSUPPORTED_MESSAGE"), new go(192, "RESPONSE_STATUS_ERROR_TRANSIENT_FAILURE"), new go(193, "RESPONSE_STATUS_ERROR_TRANSIENT_SENDNG_ADDRESS_UNRESOLVED"), new go(194, "RESPONSE_STATUS_ERROR_TRANSIENT_MESSAGE_NOT_FOUND"), new go(195, "RESPONSE_STATUS_ERROR_TRANSIENT_NETWORK_PROBLEM"), new go(196, "create(RESPONSE_STATUS_ERROR_TRANSIENT_PARTIAL_SUCCESS)"), new go(224, "RESPONSE_STATUS_ERROR_PERMANENT_FAILURE"), new go(225, "RESPONSE_STATUS_ERROR_PERMANENT_SERVICE_DENIED"), new go(226, "RESPONSE_STATUS_ERROR_PERMANENT_MESSAGE_FORMAT_CORRUPT"), new go(227, "RESPONSE_STATUS_ERROR_PERMANENT_SENDING_ADDRESS_UNRESOLVED"), new go(228, "RESPONSE_STATUS_ERROR_PERMANENT_MESSAGE_NOT_FOUND"), new go(229, "RESPONSE_STATUS_ERROR_PERMANENT_CONTENT_NOT_ACCEPTED"), new go(230, "RESPONSE_STATUS_ERROR_PERMANENT_REPLY_CHARGING_LIMITATIONS_NOT_MET"), new go(232, "RESPONSE_STATUS_ERROR_PERMANENT_REPLY_CHARGING_FORWARDING_DENIED"), new go(233, "RESPONSE_STATUS_ERROR_PERMANENT_REPLY_CHARGING_NOT_SUPPORTED"), new go(234, "RESPONSE_STATUS_ERROR_PERMANENT_ADDRESS_HIDING_NOT_SUPPORTED"), new go(235, "RESPONSE_STATUS_ERROR_PERMANENT_LACK_OF_PREPAID"), new go(255, "RESPONSE_STATUS_ERROR_PERMANENT_END"));
    public static final alog i = alog.z(new go(128, "RETRIEVE_STATUS_OK"), new go(192, "RETRIEVE_STATUS_ERROR_TRANSIENT_FAILURE"), new go(193, "RETRIEVE_STATUS_ERROR_TRANSIENT_MESSAGE_NOT_FOUND"), new go(194, "RETRIEVE_STATUS_ERROR_TRANSIENT_NETWORK_PROBLEM"), new go(224, "RETRIEVE_STATUS_ERROR_PERMANENT_FAILURE"), new go(225, "RETRIEVE_STATUS_ERROR_PERMANENT_SERVICE_DENIED"), new go(226, "RETRIEVE_STATUS_ERROR_PERMANENT_MESSAGE_NOT_FOUND"), new go(227, "RETRIEVE_STATUS_ERROR_PERMANENT_CONTENT_UNSUPPORTED"), new go(255, "RETRIEVE_STATUS_ERROR_END"));
    public static final alog j = alog.s(new go(128, "SENDER_VISIBILITY_HIDE"), new go(129, "SENDER_VISIBILITY_SHOW"));
    public static final alog k = alog.s(new go(129, "READ_STATUS__DELETED_WITHOUT_BEING_READ"), new go(128, "READ_STATUS_READ"));
    public static final alog l = alog.s(new go(129, "CANCEL_STATUS_REQUEST_CORRUPTED"), new go(128, "CANCEL_STATUS_REQUEST_SUCCESSFULLY_RECEIVED"));
    public static final alog m = alog.u(new go(128, "REPLY_CHARGING_REQUESTED"), new go(129, "REPLY_CHARGING_REQUESTED_TEXT_ONLY"), new go(130, "REPLY_CHARGING_ACCEPTED"), new go(131, "REPLY_CHARGING_ACCEPTED_TEXT_ONLY"));
    public static final alog n = alog.v(new go(128, "MM_STATE_DRAFT"), new go(129, "MM_STATE_SENT"), new go(130, "MM_STATE_NEW"), new go(131, "MM_STATE_RETRIEVED"), new go(132, "MM_STATE_FORWARDED"));
    public static final alog o = alog.y(new go(128, "CONTENT_CLASS_TEXT"), new go(129, "CONTENT_CLASS_IMAGE_BASIC"), new go(130, "CONTENT_CLASS_IMAGE_RICH"), new go(131, "CONTENT_CLASS_VIDEO_BASIC"), new go(132, "CONTENT_CLASS_VIDEO_RICH"), new go(133, "CONTENT_CLASS_MEGAPIXEL"), new go(134, "CONTENT_CLASS_CONTENT_BASIC"), new go(135, "CONTENT_CLASS_CONTENT_RICH"));
    public static final alog p = alog.y(new go(128, "STORE_STATUS_SUCCESS"), new go(192, "STORE_STATUS_ERROR_TRANSIENT_FAILURE"), new go(193, "STORE_STATUS_ERROR_TRANSIENT_NETWORK_PROBLEM"), new go(224, "STORE_STATUS_ERROR_PERMANENT_FAILURE"), new go(225, "STORE_STATUS_ERROR_PERMANENT_SERVICE_DENIED"), new go(226, "STORE_STATUS_ERROR_PERMANENT_MESSAGE_FORMAT_CORRUPT"), new go(227, "STORE_STATUS_ERROR_PERMANENT_MESSAGE_NOT_FOUND"), new go(255, "STORE_STATUS_ERROR_END"));
    public static final String[] q = {"BCC (Bcc)", "CC (Cc)", "CONTENT_LOCATION (X-Mms-ContentLocation)", "CONTENT_TYPE (Content-Type)", "DATE (Date)", "DELIVERY_REPORT (X-Mms-DeliveryReport)", "DELIVERY_TIME (X-Mms-Delivery-Time)", "EXPIRY (X-Mms-Expiry)", "FROM (From)", "MESSAGE_CLASS (X-Mms-Message-Class)", "MESSAGE_ID (Message-ID)", "MESSAGE_TYPE (X-Mms-Message-Type)", "MMS_VERSION (X-Mms-MMS-Version)", "MESSAGE_SIZE (X-Mms-Message-Size)", "PRIORITY (X-Mms-Priority)", "READ_REPORT (X-Mms-Read-Report)", "REPORT_ALLOWED (X-Mms-Report-Allowed)", "RESPONSE_STATUS (X-Mms-Response-Status)", "RESPONSE_TEXT (X-Mms-Response-Text)", "SENDER_VISIBILITY (X-Mms-SenderVisibility)", "STATUS (X-Mms-Status)", "SUBJECT (Subject)", "TO (To)", "TRANSACTION_ID (X-Mms-Transaction-ID)", "RETRIEVE_STATUS (X-Mms-Retrieve-Status)", "RETRIEVE_TEXT (X-Mms-Retrieve-Text)", "READ_STATUS (X-Mms-Read-Status)", "REPLY_CHARGING (X-Mms-ReplyCharging)", "REPLY_CHARGING_DEADLINE (X-Mms-ReplyCharging-Deadline)", "REPLY_CHARGING_ID (X-Mms-ReplyCharging-ID)", "REPLY_CHARGING_SIZE (X-Mms-ReplyCharging-Size)", "PREVIOUSLY_SENT_BY (X-Mms-Previously-Sent-By)", "PREVIOUSLY_SENT_DATE (X-Mms-Previously-Sent-Date)", "STORE (X-Mms-Store)", "MM_STATE (X-Mms-MM-State)", "MM_FLAGS (X-Mms-MM-Flags)", "STORE_STATUS (X-Mms-Store-Status)", "STORE_STATUS_TEXT (X-Mms-Store-Status-Text)", "STORED (X-Mms-Stored)", "ATTRIBUTES (X-Mms-Attributes)", "TOTALS (X-Mms-Totals)", "MBOX_TOTALS (X-Mms-Mbox-Totals)", "QUOTAS (X-Mms-Quotas)", "MBOX_QUOTAS (X-Mms-Mbox-Quotas)", "MESSAGE_COUNT (X-Mms-Message-Count)", "CONTENT (Content)", "START (X-Mms-Start)", "ADDITIONAL_HEADERS (Additional-headers)", "DISTRIBUTION_INDICATOR (X-Mms-Distribution-Indicator)", "ELEMENT_DESCRIPTOR (X-Mms-Element-Descriptor)", "LIMIT (X-Mms-Limit)", "RECOMMENDED_RETRIEVAL_MODE (X-Mms-Recommended-Retrieval-Mode)", "RECOMMENDED_RETRIEVAL_MODE_TEXT (X-Mms-Recommended-Retrieval-Mode-Text)", "STATUS_TEXT (X-Mms-Status-Text)", "APPLIC_ID (X-Mms-Applic-ID)", "REPLY_APPLIC_ID (X-Mms-Reply-Applic-ID)", "AUX_APPLIC_ID (X-Mms-Aux-Applic-Id / X-Mms-Aux-Applic-Info)", "CONTENT_CLASS (X-Mms-Content-Class)", "DRM_CONTENT (X-Mms-DRM-Content)", "ADAPTATION_ALLOWED (X-Mms-Adaptation-Allowed)", "REPLACE_ID (X-Mms-Replace-ID)", "CANCEL_ID (X-Mms-Cancel-ID)", "CANCEL_STATUS (X-Mms-Cancel-Status)"};
    private final vl r = new vl();

    public static String e(int i2, Object obj) {
        Object valueOf;
        int i3 = i2 - 129;
        if (i3 >= 0) {
            valueOf = q[i3];
        } else {
            valueOf = Integer.valueOf(i2);
        }
        return "Unknown value for field " + String.valueOf(valueOf) + ": " + obj.toString();
    }

    public final int a(int i2) {
        Integer num = (Integer) this.r.get(Integer.valueOf(i2));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final long b(int i2) {
        Long l2 = (Long) this.r.get(Integer.valueOf(i2));
        if (l2 == null) {
            return -1L;
        }
        return l2.longValue();
    }

    public final gi c(int i2) {
        return (gi) this.r.get(Integer.valueOf(i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String d(int i2, alog alogVar) {
        int a2 = a(i2);
        if (a2 != 0) {
            int i3 = ((alsx) alogVar).c;
            int i4 = 0;
            while (i4 < i3) {
                go goVar = (go) alogVar.get(i4);
                i4++;
                if (a2 == goVar.a) {
                    return goVar.b;
                }
            }
            return e(i2, Integer.valueOf(a2));
        }
        return "PDU header value not present";
    }

    public final void f(gi giVar, int i2) {
        if (i2 != 129 && i2 != 130 && i2 != 151) {
            throw new RuntimeException("Invalid header field!");
        }
        vl vlVar = this.r;
        Integer valueOf = Integer.valueOf(i2);
        ArrayList arrayList = (ArrayList) vlVar.get(valueOf);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        arrayList.add(giVar);
        this.r.put(valueOf, arrayList);
    }

    public final void g(gi giVar, int i2) {
        giVar.getClass();
        if (i2 != 137 && i2 != 147 && i2 != 150 && i2 != 154 && i2 != 160 && i2 != 164 && i2 != 166 && i2 != 181 && i2 != 182) {
            throw new RuntimeException("Invalid header field!");
        }
        this.r.put(Integer.valueOf(i2), giVar);
    }

    public final void h(long j2, int i2) {
        if (i2 != 133 && i2 != 142 && i2 != 157 && i2 != 159 && i2 != 161 && i2 != 173 && i2 != 175 && i2 != 179 && i2 != 135 && i2 != 136) {
            throw new RuntimeException("Invalid header field!");
        }
        this.r.put(Integer.valueOf(i2), Long.valueOf(j2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0103, code lost:
    
        if (r9 <= 255) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x010b, code lost:
    
        if (r9 < 192) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x010d, code lost:
    
        if (r9 > 255) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x011d, code lost:
    
        if (r9 <= 255) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0125, code lost:
    
        if (r9 < 192) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0127, code lost:
    
        if (r9 > 255) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0078, code lost:
    
        if (r9 <= 255) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0080, code lost:
    
        if (r9 < 192) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0082, code lost:
    
        if (r9 > 255) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00d0, code lost:
    
        if (r9 <= 19) goto L138;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:35:0x0051. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x0054. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gp.i(int, int):void");
    }

    public final void j(byte[] bArr, int i2) {
        bArr.getClass();
        if (i2 != 131 && i2 != 132 && i2 != 138 && i2 != 139 && i2 != 152 && i2 != 158 && i2 != 189 && i2 != 190) {
            switch (i2) {
                case 183:
                case 184:
                case 185:
                    break;
                default:
                    throw new RuntimeException("Invalid header field!");
            }
        }
        this.r.put(Integer.valueOf(i2), bArr);
    }

    public final byte[] k(int i2) {
        return (byte[]) this.r.get(Integer.valueOf(i2));
    }

    public final gi[] l(int i2) {
        ArrayList arrayList = (ArrayList) this.r.get(Integer.valueOf(i2));
        if (arrayList == null) {
            return null;
        }
        return (gi[]) arrayList.toArray(new gi[arrayList.size()]);
    }

    public final boolean m() {
        return this.r.containsKey(153);
    }

    public final void n(gi[] giVarArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, giVarArr);
        this.r.put(151, arrayList);
    }
}
