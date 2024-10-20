package defpackage;

import android.content.ContentValues;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sxz extends agpr {
    public sxz(String str, ContentValues contentValues, Map map, alog alogVar, agpu agpuVar) {
        super(str, contentValues, map, alogVar, agpuVar);
    }

    public final int a() {
        return this.a.getAsInteger("message_status").intValue();
    }

    @Override // defpackage.agpr
    public final alog b() {
        agnw d;
        d = agnc.d("$primary");
        return (alog) d.s("messages.updateAndReturnUpdatedRows-txn", new ndb(this, 0, 19, null));
    }
}
