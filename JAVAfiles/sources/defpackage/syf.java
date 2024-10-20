package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class syf implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ syf(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "stack_trace_hash:".concat(String.valueOf(((syg) this.a).getString(2)));
            case 1:
                return "am_version_code:".concat(String.valueOf(((syg) this.a).getString(1)));
            case 2:
                return "source:".concat(String.valueOf(((syg) this.a).getString(3)));
            case 3:
                return "tiktok_trace:".concat(String.valueOf(((syg) this.a).getString(4)));
            case 4:
                return "stack_trace:".concat(String.valueOf(((syg) this.a).getString(5)));
            case 5:
                return "feature_id:".concat(String.valueOf(((syo) this.a).getString(0)));
            case 6:
                return "date:".concat(String.valueOf(((syo) this.a).getString(1)));
            case 7:
                return "feature_value:".concat(String.valueOf(((syo) this.a).getString(2)));
            case 8:
                return "feature_id:".concat(String.valueOf(((syu) this.a).getString(0)));
            case 9:
                return "feature:".concat(String.valueOf(((syu) this.a).getString(1)));
            case 10:
                return "start_date:".concat(String.valueOf(((syu) this.a).getString(2)));
            case 11:
                return "date:".concat(String.valueOf(((sza) this.a).getString(0)));
            case 12:
                return "features:".concat(String.valueOf(((sza) this.a).getString(1)));
            case 13:
                return "id:".concat(String.valueOf(((szi) this.a).getString(0)));
            case 14:
                return "click_index:".concat(String.valueOf(((szi) this.a).getString(8)));
            case 15:
                return "impression_id:".concat(String.valueOf(((szi) this.a).getString(9)));
            case 16:
                return "suggestion_types:".concat(String.valueOf(((szi) this.a).getString(10)));
            case 17:
                return "model_output_label:".concat(String.valueOf(((szi) this.a).getString(11)));
            case 18:
                return "message_id:".concat(String.valueOf(((szi) this.a).getString(1)));
            case 19:
                return "timestamp:".concat(String.valueOf(((szi) this.a).getString(2)));
            default:
                return "event_type:".concat(String.valueOf(((szi) this.a).getString(3)));
        }
    }
}
