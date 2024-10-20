package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteConstraintException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ydx {
    private static final xze d = xze.g("BugleDataModel", "GifDatabaseOperations");
    public final Context a;
    public final xnv b;
    public final agnq c;

    public ydx(Context context, xnv xnvVar, agnq agnqVar) {
        this.a = context;
        this.b = xnvVar;
        this.c = agnqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object a(tfr tfrVar, ukb ukbVar) {
        agnw d2;
        agnw d3;
        try {
            d2 = agnc.d("$primary");
            d3 = agnc.d("$primary");
            agnc.a(d3, "recent_gifs", tfrVar, new tbe(d2, 14), new swb(8));
        } catch (SQLiteConstraintException e) {
            d.n("Invalid SQLite constraint while attempting to insert a recent gif item.", e);
            ukbVar.a(new Object());
        }
        return new Object();
    }
}
