package defpackage;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tbv implements Supplier {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public tbv(aglz aglzVar, int i) {
        this.b = i;
        this.a = aglzVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int version;
        switch (this.b) {
            case 0:
                rve rveVar = ((tbw) this.a).a;
                if (rveVar == null || rveVar.equals(rve.a)) {
                    return null;
                }
                return rve.d(((tbw) this.a).a);
            case 1:
                ConversationIdType conversationIdType = ((PartsTable.BindData) this.a).o;
                if (conversationIdType == null || conversationIdType.equals(ruy.a)) {
                    return null;
                }
                return Long.valueOf(ruy.a(((PartsTable.BindData) this.a).o));
            case 2:
                MessageIdType messageIdType = ((tes) this.a).b;
                if (messageIdType == null || messageIdType.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((tes) this.a).b));
            case 3:
                rve rveVar2 = ((tfb) this.a).a;
                if (rveVar2 == null || rveVar2.equals(rve.a)) {
                    return null;
                }
                return rve.d(((tfb) this.a).a);
            case 4:
                MessageIdType messageIdType2 = ((tgj) this.a).b;
                if (messageIdType2 == null || messageIdType2.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((tgj) this.a).b));
            case 5:
                ConversationIdType conversationIdType2 = ((tgj) this.a).c;
                if (conversationIdType2 == null || conversationIdType2.equals(ruy.a)) {
                    return null;
                }
                return Long.valueOf(ruy.a(((tgj) this.a).c));
            case 6:
                MessageIdType messageIdType3 = ((tka) this.a).a;
                if (messageIdType3 == null || messageIdType3.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((tka) this.a).a));
            case 7:
                qwe qweVar = ((tks) this.a).b;
                if (qweVar == null || qweVar.equals(null)) {
                    return null;
                }
                return riw.n(((tks) this.a).b);
            case 8:
                MessageIdType messageIdType4 = ((tod) this.a).b;
                if (messageIdType4 == null || messageIdType4.equals(rvc.a)) {
                    return null;
                }
                return Long.valueOf(rvc.a(((tod) this.a).b));
            case 9:
                SQLiteDatabase k = ((uci) this.a).k();
                if (k == null) {
                    version = Integer.MAX_VALUE;
                } else {
                    version = k.getVersion();
                }
                return Integer.valueOf(version);
            case 10:
                return ((ueb) this.a).d();
            case 11:
                return ((ueb) this.a).p();
            case 12:
                return ((ueb) this.a).u();
            case 13:
                return ((ueb) this.a).a();
            case 14:
                return ((ueb) this.a).s();
            case 15:
                return ((ueb) this.a).b();
            case 16:
                return ((ueb) this.a).i();
            case 17:
                return ((ueb) this.a).f();
            case 18:
                return ((ueb) this.a).e();
            case 19:
                return ((ueb) this.a).E();
            default:
                return ((ueb) this.a).c();
        }
    }

    public /* synthetic */ tbv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
