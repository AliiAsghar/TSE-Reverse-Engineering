package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tai implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ tai(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "name_source:".concat(String.valueOf(((taj) this.a).getString(44)));
            case 1:
                return "last_modified_by_key:".concat(String.valueOf(((taj) this.a).getString(43)));
            case 2:
                return "photo_source:".concat(String.valueOf(((taj) this.a).getString(45)));
            case 3:
                return "country_code:".concat(String.valueOf(((taj) this.a).getString(12)));
            case 4:
                return "profile_photo_user_preference:".concat(String.valueOf(((taj) this.a).getString(46)));
            case 5:
                return "contact_metadata:".concat(String.valueOf(((taj) this.a).getString(47)));
            case 6:
                return "my_identity_token:".concat(String.valueOf(((taj) this.a).getString(4)));
            case 7:
                return "my_identity_token_foreign_key:".concat(String.valueOf(((taj) this.a).getString(5)));
            case 8:
                return "sub_id:".concat(String.valueOf(((taj) this.a).getString(6)));
            case 9:
                return "sim_slot_id:".concat(String.valueOf(((taj) this.a).getString(7)));
            case 10:
                return "normalized_destination:".concat(String.valueOf(((taj) this.a).getString(8)));
            case 11:
                return "send_destination:".concat(String.valueOf(((taj) this.a).getString(9)));
            case 12:
                return "recipient_id:".concat(String.valueOf(((taj) this.a).getString(13)));
            case 13:
                return "recipient_canonical_address:".concat(String.valueOf(((taj) this.a).getString(14)));
            case 14:
                return "full_name:".concat(String.valueOf(((taj) this.a).getString(15)));
            case 15:
                return "first_name:".concat(String.valueOf(((taj) this.a).getString(16)));
            case 16:
                return "profile_photo_uri:".concat(String.valueOf(((taj) this.a).getString(17)));
            case 17:
                return "contact_photo_uri:".concat(String.valueOf(((taj) this.a).getString(18)));
            case 18:
                return "_id:".concat(String.valueOf(((tav) this.a).getString(0)));
            case 19:
                return "color_type:".concat(String.valueOf(((tav) this.a).getString(19)));
            default:
                return "my_identity_token:".concat(String.valueOf(((tav) this.a).getString(1)));
        }
    }
}
