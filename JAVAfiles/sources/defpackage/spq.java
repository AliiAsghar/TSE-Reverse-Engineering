package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class spq implements alhr {
    public final /* synthetic */ agmp a;
    private final /* synthetic */ int b;

    public /* synthetic */ spq(agmp agmpVar, int i) {
        this.b = i;
        this.a = agmpVar;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "rcs_message_id:".concat(String.valueOf(((spr) this.a).getString(0)));
            case 1:
                return "is_encrypted:".concat(String.valueOf(((spd) this.a).getString(6)));
            case 2:
                return "preview_version:".concat(String.valueOf(((spr) this.a).getString(3)));
            case 3:
                return "attachment_etouffee:".concat(String.valueOf(((spr) this.a).getString(4)));
            case 4:
                return "attachment_summary:".concat(String.valueOf(((spr) this.a).getString(5)));
            case 5:
                return "attachment_version:".concat(String.valueOf(((spr) this.a).getString(6)));
            case 6:
                return "creation_timestamp:".concat(String.valueOf(((spr) this.a).getString(7)));
            case 7:
                return "attachment_uri:".concat(String.valueOf(((spr) this.a).getString(8)));
            case 8:
                return "custom_delivery_receipt_mime_type:".concat(String.valueOf(((spr) this.a).getString(9)));
            case 9:
                return "custom_delivery_receipt_content:".concat(String.valueOf(((spr) this.a).getString(10)));
            case 10:
                return "file_uploaded_xml_from_content_server:".concat(String.valueOf(((spr) this.a).getString(11)));
            case 11:
                return "file_uploaded_fallback_uri:".concat(String.valueOf(((spr) this.a).getString(12)));
            case 12:
                return "file_uploaded_expiry:".concat(String.valueOf(((spr) this.a).getString(13)));
            case 13:
                return "plaintext_attachment_name:".concat(String.valueOf(((spr) this.a).getString(14)));
            case 14:
                return "plaintext_attachment_content_type:".concat(String.valueOf(((spr) this.a).getString(15)));
            case 15:
                return "plaintext_thumbnail_content_type:".concat(String.valueOf(((spr) this.a).getString(16)));
            case 16:
                return "preview_etouffee:".concat(String.valueOf(((spr) this.a).getString(1)));
            case 17:
                return "preview_summary:".concat(String.valueOf(((spr) this.a).getString(2)));
            case 18:
                return "_id:".concat(String.valueOf(((spy) this.a).getString(0)));
            case 19:
                return "timestamp:".concat(String.valueOf(((spy) this.a).getString(1)));
            default:
                return "event:".concat(String.valueOf(((spy) this.a).getString(2)));
        }
    }
}
