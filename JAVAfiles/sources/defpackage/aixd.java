package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class aixd implements aixl {
    final /* synthetic */ aixe d;

    public aixd(aixe aixeVar) {
        this.d = aixeVar;
    }

    @Override // defpackage.aixl
    public final void c() {
        Log.v("ASQLDB", agrk.t(this.d.a.rawQuery("EXPLAIN QUERY PLAN ".concat(b()), null)));
    }
}
