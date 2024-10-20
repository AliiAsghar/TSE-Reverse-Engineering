package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qxd extends epp {
    private static final xze k = xze.g("BugleDataModel", "BoundTypedCursorLoader");
    public final String j;
    private final ecj l;
    private final Uri m;
    private final aksr n;
    private final ContentObserver o;
    private agmq p;
    private final ahmn q;

    public qxd(aksr aksrVar, ahmn ahmnVar, String str, Context context, Uri uri, ecj ecjVar) {
        super(context);
        k.p("onCreate: ".concat(String.valueOf(String.valueOf(uri))));
        this.j = str;
        this.l = ecjVar;
        this.m = uri;
        this.n = aksrVar;
        this.q = ahmnVar;
        this.o = new epq(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.epp
    public final /* bridge */ /* synthetic */ Object b() {
        akrc b = this.n.b("BoundTypedCursorLoader#onLoadInBackground");
        try {
            agmq a = a();
            b.close();
            return a;
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.epp
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        agmq agmqVar = (agmq) obj;
        if (agmqVar != null && !agmqVar.isClosed()) {
            agmqVar.close();
        }
    }

    @Override // defpackage.epr
    public final void k() {
        g();
        agmq agmqVar = this.p;
        if (agmqVar != null && !agmqVar.isClosed()) {
            this.p.close();
        }
        this.p = null;
    }

    @Override // defpackage.epr
    public final void l() {
        agmq agmqVar = this.p;
        if (agmqVar != null) {
            i(agmqVar);
        }
        boolean z = this.g;
        this.g = false;
        this.h |= z;
        if (!z && this.p != null) {
            return;
        }
        f();
    }

    @Override // defpackage.epr
    public final void m() {
        g();
    }

    @Override // defpackage.epp
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final agmq a() {
        try {
            agoz agozVar = (agoz) this.l.a();
            agmq n = agozVar.n();
            n.a().setNotificationUri(this.c.getContentResolver(), this.m);
            n.a().registerContentObserver(this.o);
            xyo a = k.a();
            a.H("Load query in background:");
            a.H(agozVar);
            a.q();
            return n;
        } catch (SecurityException e) {
            xyo b = k.b();
            b.H("Failed to load cursor for");
            b.H(this.m);
            b.r(e);
            return null;
        }
    }

    @Override // defpackage.epr
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void i(agmq agmqVar) {
        aksa m = this.q.m("BoundTypedCursorLoader#deliverResult");
        try {
            if (this.f) {
                k.o("Loader is reset, not delivering result");
                if (agmqVar != null) {
                    agmqVar.close();
                }
            } else {
                agmq agmqVar2 = this.p;
                this.p = agmqVar;
                if (this.d) {
                    super.i(this.p);
                } else {
                    k.o("Loader is not started, not delivering result");
                }
                if (agmqVar2 != null && agmqVar2 != agmqVar && !agmqVar2.isClosed()) {
                    agmqVar2.close();
                }
            }
            m.close();
        } catch (Throwable th) {
            try {
                m.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
