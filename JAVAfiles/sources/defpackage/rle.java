package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class rle implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ rle(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "rcs_group_self_msisdn:".concat(String.valueOf(((rlf) this.a).getString(9)));
            case 1:
                return "has_rbm_participant:".concat(String.valueOf(((rlf) this.a).getString(8)));
            case 2:
                return "rcs_group_id:".concat(String.valueOf(((rlf) this.a).getString(10)));
            case 3:
                return "rcs_conference_uri:".concat(String.valueOf(((rlf) this.a).getString(11)));
            case 4:
                return "rcs_group_capabilities:".concat(String.valueOf(((rlf) this.a).getString(12)));
            case 5:
                return "error_state:".concat(String.valueOf(((rlf) this.a).getString(13)));
            case 6:
                return "rcs_subject_change_timestamp_ms:".concat(String.valueOf(((rlf) this.a).getString(14)));
            case 7:
                return "join_state:".concat(String.valueOf(((rlf) this.a).getString(15)));
            case 8:
                return "conversation_type:".concat(String.valueOf(((rlf) this.a).getString(16)));
            case 9:
                return "send_mode:".concat(String.valueOf(((rlf) this.a).getString(17)));
            case 10:
                return "cms_id:".concat(String.valueOf(((rlf) this.a).getString(18)));
            case 11:
                return "_id:".concat(String.valueOf(((rlq) this.a).getString(0)));
            case 12:
                return "message_id:".concat(String.valueOf(((rlq) this.a).getString(1)));
            case 13:
                return "trigger_url:".concat(String.valueOf(((rlq) this.a).getString(2)));
            case 14:
                return "expiration_time_millis:".concat(String.valueOf(((rlq) this.a).getString(3)));
            case 15:
                return "link_title:".concat(String.valueOf(((rlq) this.a).getString(4)));
            case 16:
                return "link_description:".concat(String.valueOf(((rlq) this.a).getString(5)));
            case 17:
                return "link_image_url:".concat(String.valueOf(((rlq) this.a).getString(6)));
            case 18:
                return "link_domain:".concat(String.valueOf(((rlq) this.a).getString(7)));
            case 19:
                return "link_canonical_url:".concat(String.valueOf(((rlq) this.a).getString(8)));
            default:
                return "_id:".concat(String.valueOf(((rmb) this.a).getString(0)));
        }
    }
}
