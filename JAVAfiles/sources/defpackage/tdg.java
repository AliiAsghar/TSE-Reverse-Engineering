package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tdg implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ tdg(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "has_shared_access_token_with_user:".concat(String.valueOf(((tdh) this.a).getString(15)));
            case 1:
                return "is_self_profile_shareable:".concat(String.valueOf(((tdh) this.a).getString(14)));
            case 2:
                return "name_timestamp:".concat(String.valueOf(((tdh) this.a).getString(16)));
            case 3:
                return "photo_timestamp:".concat(String.valueOf(((tdh) this.a).getString(17)));
            case 4:
                return "belongs_to_self_gaia:".concat(String.valueOf(((tdh) this.a).getString(18)));
            case 5:
                return "_id:".concat(String.valueOf(((tdq) this.a).getString(0)));
            case 6:
                return "rbm_bot_id:".concat(String.valueOf(((tdq) this.a).getString(1)));
            case 7:
                return "type:".concat(String.valueOf(((tdq) this.a).getString(2)));
            case 8:
                return "header:".concat(String.valueOf(((tdq) this.a).getString(3)));
            case 9:
                return "subheader:".concat(String.valueOf(((tdq) this.a).getString(4)));
            case 10:
                return "property_value:".concat(String.valueOf(((tdq) this.a).getString(5)));
            case 11:
                return "rbm_bot_id:".concat(String.valueOf(((teb) this.a).getString(0)));
            case 12:
                return "verifier_id:".concat(String.valueOf(((teb) this.a).getString(8)));
            case 13:
                return "version:".concat(String.valueOf(((teb) this.a).getString(9)));
            case 14:
                return "expiry_milliseconds:".concat(String.valueOf(((teb) this.a).getString(10)));
            case 15:
                return "agent_use_case_category:".concat(String.valueOf(((teb) this.a).getString(11)));
            case 16:
                return "display_name:".concat(String.valueOf(((teb) this.a).getString(1)));
            case 17:
                return "logo_image_remote_url:".concat(String.valueOf(((teb) this.a).getString(2)));
            case 18:
                return "logo_image_local_uri:".concat(String.valueOf(((teb) this.a).getString(3)));
            case 19:
                return "description:".concat(String.valueOf(((teb) this.a).getString(4)));
            default:
                return "color:".concat(String.valueOf(((teb) this.a).getString(5)));
        }
    }
}
