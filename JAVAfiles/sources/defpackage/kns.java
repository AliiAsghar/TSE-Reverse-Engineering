package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kns implements knm {
    public final knz a;
    public final jxv b;
    private final Context c;
    private final wyj d;
    private final armf e;

    public kns(Context context, wyj wyjVar, armf armfVar, jxv jxvVar, knz knzVar) {
        this.c = context;
        this.d = wyjVar;
        this.e = armfVar;
        this.b = jxvVar;
        this.a = knzVar;
    }

    @Override // defpackage.knm
    public final boolean a() {
        throw null;
    }

    public final wyh b(Optional optional) {
        if (optional.isEmpty()) {
            this.b.j("localMessage is not present");
            return null;
        }
        Uri t = ((MessageCoreData) optional.get()).t();
        if (t == null) {
            this.b.i("messageUri is null");
            return null;
        }
        Cursor query = this.c.getContentResolver().query(t, wyh.g((wzs) this.e.b()), null, null, null);
        if (query != null && query.moveToFirst()) {
            wyh a = this.d.a();
            a.f(query, -1);
            return a;
        }
        knl g = this.b.g();
        g.H("failed to find message");
        g.z("messageUri", t);
        g.q();
        return null;
    }
}
