package defpackage;

import android.database.sqlite.SQLiteException;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xis implements xir {
    final /* synthetic */ xiu a;
    public sxt b;

    public xis(xiu xiuVar, String str) {
        this.a = xiuVar;
        try {
            xyo d = xiu.a.d();
            d.H("Querying for local messages.");
            d.z("selection", str);
            d.q();
            sxy d2 = MessagesTable.d();
            d2.w("+SyncCursorPair#LocalCursorIterator");
            int i = 12;
            d2.g(new xgt(str, i));
            d2.h(new atkn((Object) MessagesTable.c.i, false));
            sxo sxoVar = MessagesTable.c;
            d2.c(sxoVar.a, sxoVar.i, sxoVar.o, sxoVar.j, sxoVar.b, sxoVar.x, sxoVar.s);
            tbs d3 = PartsTable.d();
            d3.e(new xgv(i));
            tbu tbuVar = new tbu();
            tbuVar.m();
            tbuVar.U(new agme("parts.message_id", 1, MessagesTable.c.a));
            d3.f(tbuVar);
            d3.u(1);
            d2.n(d3.b(), "parts_expression");
            this.b = (sxt) d2.b().n();
        } catch (SQLiteException e) {
            xyo b = xiu.a.b();
            b.H("failed to query local sms/mms");
            b.r(e);
            throw e;
        }
    }
}
