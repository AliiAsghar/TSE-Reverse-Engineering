package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Collection;
import j$.util.stream.Collectors;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class tbm implements alhr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ tbm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "longitude:".concat(String.valueOf(((tbn) this.a).getString(18)));
            case 1:
                return "media_modified_timestamp:".concat(String.valueOf(((tbn) this.a).getString(17)));
            case 2:
                tbs d = PartsTable.d();
                d.w("updateAndReturnUpdatedRowsAfterUpdate-pre-parts");
                d.s();
                d.n(new agpk("ROWID", new Object[0]), "_rowid");
                agpr agprVar = (agpr) this.a;
                alog alogVar = agprVar.e;
                int i = ((alsx) alogVar).c;
                for (int i2 = 0; i2 < i; i2++) {
                    d.k((agpw) alogVar.get(i2));
                }
                if (agprVar.d.b) {
                    tbu tbuVar = new tbu();
                    tbuVar.W(agprVar.f());
                    d.f(tbuVar);
                }
                alob alobVar = new alob();
                tbn tbnVar = (tbn) d.b().n();
                while (tbnVar.moveToNext()) {
                    try {
                        alobVar.h(tbnVar.cX("_rowid"));
                    } catch (Throwable th) {
                        try {
                            tbnVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                tbnVar.close();
                String str = (String) Collection.EL.stream(alobVar.g()).collect(Collectors.joining(","));
                agprVar.e();
                tbs d2 = PartsTable.d();
                d2.w("updateAndReturnUpdatedRowsAfterUpdate-post-parts");
                tbu tbuVar2 = new tbu();
                tbuVar2.W(new agpk("ROWID IN ($R)", new Object[]{str}));
                d2.f(tbuVar2);
                return ((tbn) d2.b().n()).cR();
            case 3:
                return "rcs_message_id:".concat(String.valueOf(((tca) this.a).getString(0)));
            case 4:
                return "self_identity:".concat(String.valueOf(((tca) this.a).getString(2)));
            case 5:
                return "raw_text:".concat(String.valueOf(((tca) this.a).getString(3)));
            case 6:
                return "content_type:".concat(String.valueOf(((tca) this.a).getString(4)));
            case 7:
                return "remote_instance:".concat(String.valueOf(((tca) this.a).getString(5)));
            case 8:
                return "sent_timestamp:".concat(String.valueOf(((tca) this.a).getString(6)));
            case 9:
                return "received_timestamp:".concat(String.valueOf(((tca) this.a).getString(7)));
            case 10:
                return "sip_alias:".concat(String.valueOf(((tca) this.a).getString(8)));
            case 11:
                return "spam_verdict:".concat(String.valueOf(((tca) this.a).getString(9)));
            case 12:
                return "session_id:".concat(String.valueOf(((tca) this.a).getString(10)));
            case 13:
                return "message_status:".concat(String.valueOf(((tca) this.a).getString(11)));
            case 14:
                return "custom_headers:".concat(String.valueOf(((tca) this.a).getString(12)));
            case 15:
                return "is_group:".concat(String.valueOf(((tca) this.a).getString(13)));
            case 16:
                return "conversation_id:".concat(String.valueOf(((tca) this.a).getString(14)));
            case 17:
                return "conference_uri:".concat(String.valueOf(((tca) this.a).getString(15)));
            case 18:
                return "is_delivery_report_requested:".concat(String.valueOf(((tca) this.a).getString(16)));
            case 19:
                return "is_display_report_requested:".concat(String.valueOf(((tca) this.a).getString(17)));
            default:
                return "remote_user_id:".concat(String.valueOf(((tca) this.a).getString(1)));
        }
    }
}
