package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class sic implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ sic(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "cms_last_mod_seq:".concat(String.valueOf(((sid) this.a).getString(1)));
            case 1:
                return "cms_id:".concat(String.valueOf(((sid) this.a).getString(0)));
            case 2:
                return "cms_correlation_id:".concat(String.valueOf(((sid) this.a).getString(2)));
            case 3:
                return "from_address:".concat(String.valueOf(((sid) this.a).getString(3)));
            case 4:
                return "to_address:".concat(String.valueOf(((sid) this.a).getString(4)));
            case 5:
                return "correlation_text:".concat(String.valueOf(((sid) this.a).getString(5)));
            case 6:
                return "modified_at_timestamp:".concat(String.valueOf(((sid) this.a).getString(6)));
            case 7:
                return "message_received_timestamp:".concat(String.valueOf(((sid) this.a).getString(7)));
            case 8:
                return "_id:".concat(String.valueOf(((sij) this.a).getString(0)));
            case 9:
                return "dependent_id:".concat(String.valueOf(((sij) this.a).getString(1)));
            case 10:
                return "dependent_cms_id:".concat(String.valueOf(((sij) this.a).getString(2)));
            case 11:
                return "dependency_cms_id:".concat(String.valueOf(((sij) this.a).getString(3)));
            case 12:
                return "cms_data_provider_type:".concat(String.valueOf(((sij) this.a).getString(4)));
            case 13:
                return "payload:".concat(String.valueOf(((sij) this.a).getString(5)));
            case 14:
                return "inserted_at_timestamp:".concat(String.valueOf(((sij) this.a).getString(6)));
            case 15:
                return "_id:".concat(String.valueOf(((sir) this.a).getString(0)));
            case 16:
                return "table_type:".concat(String.valueOf(((sir) this.a).getString(1)));
            case 17:
                return "item_id:".concat(String.valueOf(((sir) this.a).getString(2)));
            case 18:
                return "cms_id:".concat(String.valueOf(((sir) this.a).getString(3)));
            case 19:
                return "timestamp:".concat(String.valueOf(((sir) this.a).getString(4)));
            default:
                return "event_type:".concat(String.valueOf(((sir) this.a).getString(5)));
        }
    }
}
