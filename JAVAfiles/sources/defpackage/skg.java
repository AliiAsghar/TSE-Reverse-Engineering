package defpackage;

import j$.util.Collection;
import j$.util.stream.Collectors;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class skg implements alhr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ skg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.alhr
    public final Object get() {
        switch (this.b) {
            case 0:
                return "message_status:".concat(String.valueOf(((skh) this.a).getString(7)));
            case 1:
                return "preview_content_type:".concat(String.valueOf(((skh) this.a).getString(6)));
            case 2:
                return "_id:".concat(String.valueOf(((sko) this.a).getString(0)));
            case 3:
                return "operation_datetime:".concat(String.valueOf(((sko) this.a).getString(1)));
            case 4:
                return "operation_type:".concat(String.valueOf(((sko) this.a).getString(2)));
            case 5:
                return "conversation_participants_id:".concat(String.valueOf(((sko) this.a).getString(3)));
            case 6:
                return "conversation_id:".concat(String.valueOf(((sko) this.a).getString(4)));
            case 7:
                return "participant_id:".concat(String.valueOf(((sko) this.a).getString(5)));
            case 8:
                return "is_normalized:".concat(String.valueOf(((sko) this.a).getString(6)));
            case 9:
                return "rcs_group_join_status:".concat(String.valueOf(((sko) this.a).getString(7)));
            case 10:
                return "last_modified_by_key:".concat(String.valueOf(((sko) this.a).getString(8)));
            case 11:
                return "_id:".concat(String.valueOf(((skx) this.a).getString(0)));
            case 12:
                return "conversation_id:".concat(String.valueOf(((skx) this.a).getString(1)));
            case 13:
                return "participant_id:".concat(String.valueOf(((skx) this.a).getString(2)));
            case 14:
                return "is_normalized:".concat(String.valueOf(((skx) this.a).getString(3)));
            case 15:
                return "rcs_group_join_status:".concat(String.valueOf(((skx) this.a).getString(4)));
            case 16:
                return "last_modified_by_key:".concat(String.valueOf(((skx) this.a).getString(5)));
            case 17:
                sla a = sld.a();
                a.w("updateAndReturnUpdatedRowsAfterUpdate-pre-conversation_participants");
                a.s();
                a.n(new agpk("ROWID", new Object[0]), "_rowid");
                agpr agprVar = (agpr) this.a;
                alog alogVar = agprVar.e;
                int i = ((alsx) alogVar).c;
                for (int i2 = 0; i2 < i; i2++) {
                    a.k((agpw) alogVar.get(i2));
                }
                if (agprVar.d.b) {
                    slc slcVar = new slc();
                    slcVar.W(agprVar.f());
                    a.e(slcVar);
                }
                alob alobVar = new alob();
                skx skxVar = (skx) a.b().n();
                while (skxVar.moveToNext()) {
                    try {
                        alobVar.h(skxVar.cX("_rowid"));
                    } catch (Throwable th) {
                        try {
                            skxVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                skxVar.close();
                String str = (String) Collection.EL.stream(alobVar.g()).collect(Collectors.joining(","));
                agprVar.e();
                sla a2 = sld.a();
                a2.w("updateAndReturnUpdatedRowsAfterUpdate-post-conversation_participants");
                slc slcVar2 = new slc();
                slcVar2.W(new agpk("ROWID IN ($R)", new Object[]{str}));
                a2.e(slcVar2);
                return ((skx) a2.b().n()).cR();
            case 18:
                return "_id:".concat(String.valueOf(((slh) this.a).getString(0)));
            case 19:
                return "conversation_id:".concat(String.valueOf(((slh) this.a).getString(1)));
            default:
                return "pin_status:".concat(String.valueOf(((slh) this.a).getString(2)));
        }
    }
}
