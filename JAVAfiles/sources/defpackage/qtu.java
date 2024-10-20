package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class qtu implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ qtu(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "group_token:".concat(String.valueOf(((qtv) this.a).getString(0)));
            case 1:
                return "address_type:".concat(String.valueOf(((qsv) this.a).getString(2)));
            case 2:
                return "destination_token:".concat(String.valueOf(((qtv) this.a).getString(1)));
            case 3:
                return "token:".concat(String.valueOf(((qud) this.a).getString(0)));
            case 4:
                return "group_type:".concat(String.valueOf(((qud) this.a).getString(1)));
            case 5:
                return "rcs_conference_uri:".concat(String.valueOf(((qud) this.a).getString(2)));
            case 6:
                return "name:".concat(String.valueOf(((qud) this.a).getString(3)));
            case 7:
                return "rcs_icon_url:".concat(String.valueOf(((qud) this.a).getString(4)));
            case 8:
                return "rcs_group_state:".concat(String.valueOf(((qud) this.a).getString(5)));
            case 9:
                return "tachygram_group_routing_token:".concat(String.valueOf(((qud) this.a).getString(6)));
            case 10:
                return "rcs_group_capabilities:".concat(String.valueOf(((qud) this.a).getString(7)));
            case 11:
                return "rcs_group_last_sync_timestamp:".concat(String.valueOf(((qud) this.a).getString(8)));
            case 12:
                return "sim_serial_number:".concat(String.valueOf(((quk) this.a).getString(0)));
            case 13:
                return "active_sub_id:".concat(String.valueOf(((quk) this.a).getString(1)));
            case 14:
                return "sim_slot_index:".concat(String.valueOf(((quk) this.a).getString(2)));
            case 15:
                return "token:".concat(String.valueOf(((qvf) this.a).getString(0)));
            case 16:
                return "provisioning_id:".concat(String.valueOf(((qvf) this.a).getString(1)));
            case 17:
                return "is_verified:".concat(String.valueOf(((qvf) this.a).getString(2)));
            case 18:
                return "address_type:".concat(String.valueOf(((qvf) this.a).getString(3)));
            case 19:
                return "phone_number:".concat(String.valueOf(((qvf) this.a).getString(4)));
            default:
                return "display_name:".concat(String.valueOf(((qvf) this.a).getString(5)));
        }
    }
}
