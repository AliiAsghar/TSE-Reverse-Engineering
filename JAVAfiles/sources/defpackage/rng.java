package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rng implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ rng(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "self_participant_id:".concat(String.valueOf(((rnh) this.a).getString(10)));
            case 1:
                return "cms_life_cycle:".concat(String.valueOf(((rnh) this.a).getString(27)));
            case 2:
                return "cms_correlation_id:".concat(String.valueOf(((rnh) this.a).getString(28)));
            case 3:
                return "cms_last_mod_seq:".concat(String.valueOf(((rnh) this.a).getString(29)));
            case 4:
                return "my_identity:".concat(String.valueOf(((rnh) this.a).getString(2)));
            case 5:
                return "message_status:".concat(String.valueOf(((rnh) this.a).getString(3)));
            case 6:
                return "seen:".concat(String.valueOf(((rnh) this.a).getString(4)));
            case 7:
                return "read:".concat(String.valueOf(((rnh) this.a).getString(5)));
            case 8:
                return "conversation_id:".concat(String.valueOf(((rnh) this.a).getString(6)));
            case 9:
                return "sender_participant_id:".concat(String.valueOf(((rnh) this.a).getString(7)));
            case 10:
                return "sender_send_destination:".concat(String.valueOf(((rnh) this.a).getString(8)));
            case 11:
                return "msisdn_receiving_rcs_message:".concat(String.valueOf(((rnh) this.a).getString(9)));
            case 12:
                return "mms_subject:".concat(String.valueOf(((rnh) this.a).getString(11)));
            case 13:
                return "received_timestamp:".concat(String.valueOf(((rnh) this.a).getString(12)));
            case 14:
                return "sent_timestamp:".concat(String.valueOf(((rnh) this.a).getString(13)));
            case 15:
                return "protocol:".concat(String.valueOf(((rnh) this.a).getString(14)));
            case 16:
                return "message_priority:".concat(String.valueOf(((rnh) this.a).getString(15)));
            case 17:
                return "rcs_encryption_status:".concat(String.valueOf(((rnh) this.a).getString(16)));
            case 18:
                return "cloud_sync_id:".concat(String.valueOf(((rnh) this.a).getString(17)));
            case 19:
                return "correlation_id:".concat(String.valueOf(((rnh) this.a).getString(18)));
            default:
                return "_id:".concat(String.valueOf(((rns) this.a).getString(0)));
        }
    }
}
