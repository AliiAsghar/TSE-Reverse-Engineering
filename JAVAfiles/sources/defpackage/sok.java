package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class sok implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ sok(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "client_info:".concat(String.valueOf(((sol) this.a).getString(7)));
            case 1:
                return "force_refresh:".concat(String.valueOf(((sol) this.a).getString(6)));
            case 2:
                return "browser_type:".concat(String.valueOf(((sol) this.a).getString(10)));
            case 3:
                return "operating_system:".concat(String.valueOf(((sol) this.a).getString(8)));
            case 4:
                return "operating_system_version:".concat(String.valueOf(((sol) this.a).getString(9)));
            case 5:
                return "encryption_key:".concat(String.valueOf(((sol) this.a).getString(11)));
            case 6:
                return "hmac_key:".concat(String.valueOf(((sol) this.a).getString(12)));
            case 7:
                return "backend_type:".concat(String.valueOf(((sol) this.a).getString(13)));
            case 8:
                return "is_active:".concat(String.valueOf(((sol) this.a).getString(14)));
            case 9:
                return "request_id:".concat(String.valueOf(((sol) this.a).getString(15)));
            case 10:
                return "is_persistent:".concat(String.valueOf(((sol) this.a).getString(16)));
            case 11:
                return "desktop_type:".concat(String.valueOf(((sol) this.a).getString(17)));
            case 12:
                return "pairing_type:".concat(String.valueOf(((sol) this.a).getString(18)));
            case 13:
                return "lookup_key:".concat(String.valueOf(((sou) this.a).getString(0)));
            case 14:
                return "normalized_destination:".concat(String.valueOf(((sou) this.a).getString(1)));
            case 15:
                return "conversation_id:".concat(String.valueOf(((spd) this.a).getString(0)));
            case 16:
                return "text:".concat(String.valueOf(((spd) this.a).getString(1)));
            case 17:
                return "attachments:".concat(String.valueOf(((spd) this.a).getString(2)));
            case 18:
                return "subject:".concat(String.valueOf(((spd) this.a).getString(3)));
            case 19:
                return "is_urgent:".concat(String.valueOf(((spd) this.a).getString(4)));
            default:
                return "replied_to_message_id:".concat(String.valueOf(((spd) this.a).getString(5)));
        }
    }
}
