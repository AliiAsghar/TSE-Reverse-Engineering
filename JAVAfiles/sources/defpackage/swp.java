package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class swp implements alhr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ swp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "message_id:".concat(String.valueOf(((swq) this.a).getString(1)));
            case 1:
                return "reclassification_index:".concat(String.valueOf(((swq) this.a).getString(12)));
            case 2:
                return "conversation_id:".concat(String.valueOf(((swq) this.a).getString(2)));
            case 3:
                return "source:".concat(String.valueOf(((swq) this.a).getString(3)));
            case 4:
                return "score:".concat(String.valueOf(((swq) this.a).getString(4)));
            case 5:
                return "outcome:".concat(String.valueOf(((swq) this.a).getString(5)));
            case 6:
                return "ares_initiated_by:".concat(String.valueOf(((swq) this.a).getString(6)));
            case 7:
                return "_id:".concat(String.valueOf(((swz) this.a).getString(0)));
            case 8:
                return "message_id:".concat(String.valueOf(((swz) this.a).getString(1)));
            case 9:
                return "_id:".concat(String.valueOf(((sxg) this.a).getString(0)));
            case 10:
                return "message_id:".concat(String.valueOf(((sxg) this.a).getString(1)));
            case 11:
                return "timestamp:".concat(String.valueOf(((sxg) this.a).getString(2)));
            case 12:
                return "status:".concat(String.valueOf(((sxg) this.a).getString(3)));
            case 13:
                return "custom_status:".concat(String.valueOf(((sxg) this.a).getString(4)));
            case 14:
                return "data:".concat(String.valueOf(((sxg) this.a).getString(5)));
            case 15:
                Object obj = this.a;
                sxy d = MessagesTable.d();
                agpw agpwVar = (agpw) obj;
                d.k(agpwVar);
                d.w("messages-deleteAndReturnDeletedRows-query");
                alog t = d.b().t();
                sxu sxuVar = new sxu();
                sxuVar.a = agpwVar;
                sxuVar.f("messages-deleteAndReturnDeletedRows-delete");
                sxuVar.a().V();
                return t;
            case 16:
                return "_id:".concat(String.valueOf(((sxt) this.a).getString(0)));
            case 17:
                return "mms_content_location:".concat(String.valueOf(((sxt) this.a).getString(19)));
            case 18:
                return "conversation_id:".concat(String.valueOf(((sxt) this.a).getString(1)));
            case 19:
                return "mms_expiry:".concat(String.valueOf(((sxt) this.a).getString(20)));
            default:
                return "rcs_expiry:".concat(String.valueOf(((sxt) this.a).getString(21)));
        }
    }
}
