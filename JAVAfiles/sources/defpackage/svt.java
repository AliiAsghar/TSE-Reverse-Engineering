package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class svt implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ svt(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "replied_to_rcs_message_id:".concat(String.valueOf(((svu) this.a).getString(3)));
            case 1:
                return "replied_to_message_id_null_reason:".concat(String.valueOf(((svu) this.a).getString(2)));
            case 2:
                return "_id:".concat(String.valueOf(((swg) this.a).getString(0)));
            case 3:
                return "current_sim_carrier_country:".concat(String.valueOf(((swg) this.a).getString(7)));
            case 4:
                return "settings_country:".concat(String.valueOf(((swg) this.a).getString(8)));
            case 5:
                return "default_sms_sim_country:".concat(String.valueOf(((swg) this.a).getString(9)));
            case 6:
                return "locale_country:".concat(String.valueOf(((swg) this.a).getString(10)));
            case 7:
                return "default_sms_sim_network_country:".concat(String.valueOf(((swg) this.a).getString(11)));
            case 8:
                return "default_sms_sim_carrier_country:".concat(String.valueOf(((swg) this.a).getString(12)));
            case 9:
                return "message_id:".concat(String.valueOf(((swg) this.a).getString(1)));
            case 10:
                return "timestamp:".concat(String.valueOf(((swg) this.a).getString(2)));
            case 11:
                return "message_sending_attempt:".concat(String.valueOf(((swg) this.a).getString(3)));
            case 12:
                return "message_protocol:".concat(String.valueOf(((swg) this.a).getString(4)));
            case 13:
                return "current_sim_network_country:".concat(String.valueOf(((swg) this.a).getString(5)));
            case 14:
                return "current_sim_country:".concat(String.valueOf(((swg) this.a).getString(6)));
            case 15:
                return "_id:".concat(String.valueOf(((swq) this.a).getString(0)));
            case 16:
                return "classification_timestamp:".concat(String.valueOf(((swq) this.a).getString(7)));
            case 17:
                return "trigger:".concat(String.valueOf(((swq) this.a).getString(8)));
            case 18:
                return "action_type:".concat(String.valueOf(((swq) this.a).getString(9)));
            case 19:
                return "action_contributors:".concat(String.valueOf(((swq) this.a).getString(10)));
            default:
                return "error_code:".concat(String.valueOf(((swq) this.a).getString(11)));
        }
    }
}
