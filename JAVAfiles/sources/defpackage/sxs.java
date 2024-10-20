package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class sxs implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ sxs(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "can_revoke_before_delivered_with_rcs:".concat(String.valueOf(((sxt) this.a).getString(58)));
            case 1:
                return "auto_retry_counter:".concat(String.valueOf(((sxt) this.a).getString(57)));
            case 2:
                return "trace_id:".concat(String.valueOf(((sxt) this.a).getString(59)));
            case 3:
                return "receiving_network_country:".concat(String.valueOf(((sxt) this.a).getString(5)));
            case 4:
                return "outgoing_delivery_report_status:".concat(String.valueOf(((sxt) this.a).getString(60)));
            case 5:
                return "outgoing_read_report_status:".concat(String.valueOf(((sxt) this.a).getString(61)));
            case 6:
                return "xms_transport:".concat(String.valueOf(((sxt) this.a).getString(62)));
            case 7:
                return "message_original_protocol:".concat(String.valueOf(((sxt) this.a).getString(63)));
            case 8:
                return "sms_message_uri:".concat(String.valueOf(((sxt) this.a).getString(14)));
            case 9:
                return "satellite_datagram_id:".concat(String.valueOf(((sxt) this.a).getString(64)));
            case 10:
                return "encryption_protocol:".concat(String.valueOf(((sxt) this.a).getString(65)));
            case 11:
                return "message_persistence_id:".concat(String.valueOf(((sxt) this.a).getString(66)));
            case 12:
                return "sent_timestamp:".concat(String.valueOf(((sxt) this.a).getString(6)));
            case 13:
                return "queue_insert_timestamp:".concat(String.valueOf(((sxt) this.a).getString(7)));
            case 14:
                return "received_timestamp:".concat(String.valueOf(((sxt) this.a).getString(8)));
            case 15:
                return "message_protocol:".concat(String.valueOf(((sxt) this.a).getString(9)));
            case 16:
                return "sms_priority:".concat(String.valueOf(((sxt) this.a).getString(15)));
            case 17:
                return "sms_message_size:".concat(String.valueOf(((sxt) this.a).getString(16)));
            case 18:
                return "mms_subject:".concat(String.valueOf(((sxt) this.a).getString(17)));
            case 19:
                return "mms_transaction_id:".concat(String.valueOf(((sxt) this.a).getString(18)));
            default:
                return "_id:".concat(String.valueOf(((syg) this.a).getString(0)));
        }
    }
}
