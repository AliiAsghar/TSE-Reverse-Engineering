package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tcj implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ tcj(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "test_phone_number:".concat(String.valueOf(((tck) this.a).getString(1)));
            case 1:
                return "guesser_id:".concat(String.valueOf(((tck) this.a).getString(0)));
            case 2:
                return "_id:".concat(String.valueOf(((tcu) this.a).getString(0)));
            case 3:
                return "timestamp:".concat(String.valueOf(((tcu) this.a).getString(1)));
            case 4:
                return "hash_value:".concat(String.valueOf(((tcu) this.a).getString(2)));
            case 5:
                return "hash_key:".concat(String.valueOf(((tcu) this.a).getString(3)));
            case 6:
                return "_id:".concat(String.valueOf(((tdh) this.a).getString(0)));
            case 7:
                return "gaia_update_timestamp:".concat(String.valueOf(((tdh) this.a).getString(19)));
            case 8:
                return "participant_id:".concat(String.valueOf(((tdh) this.a).getString(1)));
            case 9:
                return "person_id:".concat(String.valueOf(((tdh) this.a).getString(2)));
            case 10:
                return "profile_access_token:".concat(String.valueOf(((tdh) this.a).getString(3)));
            case 11:
                return "sending_self_profile_interaction_state:".concat(String.valueOf(((tdh) this.a).getString(4)));
            case 12:
                return "self_profile_sharing_metadata:".concat(String.valueOf(((tdh) this.a).getString(5)));
            case 13:
                return "first_name:".concat(String.valueOf(((tdh) this.a).getString(6)));
            case 14:
                return "last_name:".concat(String.valueOf(((tdh) this.a).getString(7)));
            case 15:
                return "display_name:".concat(String.valueOf(((tdh) this.a).getString(8)));
            case 16:
                return "photo_uri:".concat(String.valueOf(((tdh) this.a).getString(9)));
            case 17:
                return "sender_last_updated_time:".concat(String.valueOf(((tdh) this.a).getString(10)));
            case 18:
                return "sender_last_updated_time_from_rcs:".concat(String.valueOf(((tdh) this.a).getString(11)));
            case 19:
                return "contact_lookup_key:".concat(String.valueOf(((tdh) this.a).getString(12)));
            default:
                return "phone_number:".concat(String.valueOf(((tdh) this.a).getString(13)));
        }
    }
}
