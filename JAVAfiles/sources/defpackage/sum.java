package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class sum implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ sum(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "edited_at_timestamp_ms:".concat(String.valueOf(((sun) this.a).getString(3)));
            case 1:
                return "original_rcs_message_id:".concat(String.valueOf(((sun) this.a).getString(2)));
            case 2:
                return "received_at_timestamp_ms:".concat(String.valueOf(((sun) this.a).getString(4)));
            case 3:
                return "_id:".concat(String.valueOf(((suv) this.a).getString(0)));
            case 4:
                return "message_id:".concat(String.valueOf(((suv) this.a).getString(1)));
            case 5:
                return "label:".concat(String.valueOf(((suv) this.a).getString(2)));
            case 6:
                return "confidence:".concat(String.valueOf(((suv) this.a).getString(3)));
            case 7:
                return "source:".concat(String.valueOf(((suv) this.a).getString(4)));
            case 8:
                return "intent:".concat(String.valueOf(((suv) this.a).getString(5)));
            case 9:
                return "model_id:".concat(String.valueOf(((suv) this.a).getString(6)));
            case 10:
                return "message_id:".concat(String.valueOf(((svf) this.a).getString(0)));
            case 11:
                return "sharing_state:".concat(String.valueOf(((svf) this.a).getString(1)));
            case 12:
                return "_id:".concat(String.valueOf(((svl) this.a).getString(0)));
            case 13:
                return "message_id:".concat(String.valueOf(((svl) this.a).getString(1)));
            case 14:
                return "reactions_data:".concat(String.valueOf(((svl) this.a).getString(2)));
            case 15:
                return "reacted_message_id:".concat(String.valueOf(((svl) this.a).getString(3)));
            case 16:
                return "reaction:".concat(String.valueOf(((svl) this.a).getString(4)));
            case 17:
                return "applied_reaction:".concat(String.valueOf(((svl) this.a).getString(5)));
            case 18:
                return "animation_effect:".concat(String.valueOf(((svl) this.a).getString(6)));
            case 19:
                return "message_id:".concat(String.valueOf(((svu) this.a).getString(0)));
            default:
                return "replied_to_message_id:".concat(String.valueOf(((svu) this.a).getString(1)));
        }
    }
}
