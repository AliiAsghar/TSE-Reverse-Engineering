package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rrt extends rqz implements epi {
    public static final xze a = xze.g("BugleDataModel", "ConversationListData");
    protected rrs b;
    public final uye c;
    public final Optional d;
    public epj e;
    public Bundle f;
    private final armf g;
    private final Context h;
    private final Optional i;
    private final armf j;
    private final armf k;
    private final armf l;
    private final uac m;

    public rrt(armf armfVar, armf armfVar2, uac uacVar, armf armfVar3, armf armfVar4, Context context, rrs rrsVar, uye uyeVar, Optional optional, Optional optional2) {
        this.j = armfVar;
        this.g = armfVar2;
        this.m = uacVar;
        this.k = armfVar3;
        this.b = rrsVar;
        this.h = context;
        this.l = armfVar4;
        this.i = optional;
        this.c = uyeVar;
        this.d = optional2;
    }

    @Override // defpackage.epi
    public final epr a(int i, Bundle bundle) {
        qxd A;
        xze xzeVar = a;
        xyo a2 = xzeVar.a();
        a2.H("onCreateLoader.");
        a2.x("id", i);
        a2.q();
        String string = bundle.getString("bindingId");
        if (i(string)) {
            if (i != 1) {
                if (i != 3) {
                    xyl.c("Unknown loader id");
                    return null;
                }
                xyl.c("Should be handled by annotationsLoaderCallbacks");
                return null;
            }
            akrh e = aktp.e("ConversationListData#onCreateLoader_dsdrGroupsFlag");
            try {
                if (((okf) this.l.b()).a()) {
                    uac uacVar = this.m;
                    Context context = this.h;
                    A = uacVar.A(string, context, upb.q(context), new eel(this, 2));
                } else {
                    uac uacVar2 = this.m;
                    Context context2 = this.h;
                    A = uacVar2.A(string, context2, upb.q(context2), new eel(this, 3));
                }
                e.close();
                return A;
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        xzeVar.q("Creating loader after unbinding list.");
        return null;
    }

    @Override // defpackage.epi
    public final /* synthetic */ void b(epr eprVar, Object obj) {
        int i;
        Cursor cursor = (Cursor) obj;
        if (i(((qxd) eprVar).j)) {
            int i2 = eprVar.b;
            xyo a2 = a.a();
            a2.H("onLoadFinished.");
            a2.x("id", i2);
            if (cursor != null) {
                i = cursor.getCount();
            } else {
                i = 0;
            }
            a2.x("dataSize", i);
            a2.q();
            if (i2 != 1) {
                if (i2 != 3) {
                    xyl.c("Unknown loader id");
                    return;
                } else {
                    xyl.c("Should be handled by annotationsLoaderCallbacks");
                    return;
                }
            }
            if (cursor instanceof agmp) {
                ((agmp) cursor).da();
            }
            this.b.q(this, cursor);
            return;
        }
        a.q("Loader finished after unbinding list.");
    }

    @Override // defpackage.epi
    public final void c(epr eprVar) {
        int i = eprVar.b;
        if (i(((qxd) eprVar).j)) {
            xyo a2 = a.a();
            a2.H("onLoaderReset.");
            a2.x("id", i);
            a2.q();
            if (i != 1) {
                if (i != 3) {
                    xyl.c("Unknown loader id");
                    return;
                } else {
                    xyl.c("Should be handled by annotationsLoaderCallbacks");
                    return;
                }
            }
            this.b.q(this, null);
            return;
        }
        a.q("Loader reset after unbinding list.");
    }

    public final void d(boolean z) {
        if (((ubl) this.g.b()).m.getAndSet(z) != z) {
            ubl.a.p("scrolledToNewest=" + z);
        }
        if (z) {
            alvi alviVar = xzb.a;
            ((vjs) this.j.b()).i(vjm.a);
            if (uyh.a() && ((Boolean) ((utz) uyh.e.get()).e()).booleanValue() && ((Optional) ((apxx) this.k).a).isPresent()) {
                qiu.h(((uyy) ((Optional) ((apxx) this.k).a).get()).a());
            }
        }
    }

    @Override // defpackage.rqz
    protected final void g() {
        this.b = null;
        epj epjVar = this.e;
        if (epjVar != null) {
            epjVar.b(1);
            this.e.b(3);
            this.e = null;
        }
    }

    public final boolean j() {
        this.i.isPresent();
        if (((Boolean) this.i.get()).booleanValue()) {
            return true;
        }
        return false;
    }
}
