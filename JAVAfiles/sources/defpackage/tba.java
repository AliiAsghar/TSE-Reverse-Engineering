package defpackage;

import android.content.ContentValues;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tba extends agpr {
    public tba(String str, ContentValues contentValues, Map map, alog alogVar, agpu agpuVar) {
        super(str, contentValues, map, alogVar, agpuVar);
    }

    public final alog a() {
        agnw d;
        d = agnc.d("$primary");
        return (alog) d.s("updateAndReturnUpdatedRowsAfterUpdate-txn-participants", new tbj(this, 1));
    }

    @Override // defpackage.agpr
    public final alog b() {
        agnw d;
        d = agnc.d("$primary");
        return (alog) d.s("participants.updateAndReturnUpdatedRows-txn", new ndb(this, 0, 20, null));
    }

    public final String c() {
        return this.a.getAsString("normalized_destination");
    }

    public final String d() {
        return this.a.getAsString("send_destination");
    }
}
