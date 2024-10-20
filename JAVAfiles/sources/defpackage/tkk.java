package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tkk implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ tkk(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "_id:".concat(String.valueOf(((tkl) this.a).getString(0)));
            case 1:
                return "help_state:".concat(String.valueOf(((tkc) this.a).getString(1)));
            case 2:
                return "phone_number:".concat(String.valueOf(((tkl) this.a).getString(1)));
            case 3:
                return "sim_serial_number:".concat(String.valueOf(((tkl) this.a).getString(2)));
            case 4:
                return "sim_slot_index:".concat(String.valueOf(((tkl) this.a).getString(3)));
            case 5:
                return "sub_id:".concat(String.valueOf(((tkl) this.a).getString(4)));
            case 6:
                return "subscription_name:".concat(String.valueOf(((tkl) this.a).getString(5)));
            case 7:
                return "subscription_color:".concat(String.valueOf(((tkl) this.a).getString(6)));
            case 8:
                return "participant_id:".concat(String.valueOf(((tkl) this.a).getString(7)));
            case 9:
                return "smsc:".concat(String.valueOf(((tkl) this.a).getString(8)));
            case 10:
                return "_id:".concat(String.valueOf(((tkv) this.a).getString(0)));
            case 11:
                return "my_identity_token:".concat(String.valueOf(((tkv) this.a).getString(1)));
            case 12:
                return "limited_profile_display_name:".concat(String.valueOf(((tkv) this.a).getString(2)));
            case 13:
                return "photo_uri:".concat(String.valueOf(((tkv) this.a).getString(3)));
            case 14:
                return "is_self_profile_shareable:".concat(String.valueOf(((tkv) this.a).getString(4)));
            case 15:
                return "belongs_to_self_gaia:".concat(String.valueOf(((tkv) this.a).getString(5)));
            case 16:
                return "update_timestamp:".concat(String.valueOf(((tkv) this.a).getString(6)));
            case 17:
                return "_id:".concat(String.valueOf(((tld) this.a).getString(0)));
            case 18:
                return "key:".concat(String.valueOf(((tld) this.a).getString(1)));
            case 19:
                return "sub_key:".concat(String.valueOf(((tld) this.a).getString(2)));
            default:
                return "data:".concat(String.valueOf(((tld) this.a).getString(3)));
        }
    }
}
