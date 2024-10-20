package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ugq extends agmc {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ ugu a;

    public ugq(ugu uguVar) {
        this.a = uguVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agmc
    public final /* synthetic */ void b(agoz agozVar, aglo agloVar) {
        akrh e = aktp.e("ConversationChangeListener::onChangeInTransaction");
        try {
            agpr r = agloVar.r();
            if (r != null) {
                akrh e2 = aktp.e("ConversationChangeListener::onChangeInTransaction::update");
                try {
                    snf e3 = sni.e();
                    e3.w("ConversationChangeListener#onChangeInTransaction");
                    alur it = r.e.iterator();
                    while (it.hasNext()) {
                        e3.k((agpw) it.next());
                    }
                    ugp a = this.a.a(2);
                    try {
                        e3.d();
                        sna snaVar = (sna) e3.b().n();
                        while (snaVar.moveToNext()) {
                            try {
                                a.b(2, snaVar.C().a());
                            } finally {
                            }
                        }
                        snaVar.close();
                        a.a();
                        e2.close();
                    } finally {
                    }
                } finally {
                }
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.agmc
    public final /* synthetic */ void c(agoz agozVar, aglo agloVar) {
        akrh e = aktp.e("ConversationChangeListener::preChangeInTransaction");
        try {
            agpw s = agloVar.s();
            if (s != null) {
                akrh e2 = aktp.e("ConversationChangeListener::preChangeInTransaction::delete");
                try {
                    snf e3 = sni.e();
                    e3.w("ConversationChangeListener#preChangeInTransaction");
                    e3.d();
                    e3.f(new ugo(4));
                    e3.k(s);
                    sne b2 = e3.b();
                    ugp a = this.a.a(2);
                    try {
                        sna snaVar = (sna) b2.n();
                        while (snaVar.moveToNext()) {
                            try {
                                a.b(3, snaVar.C().a());
                            } finally {
                            }
                        }
                        snaVar.close();
                        a.a();
                        e2.close();
                    } finally {
                    }
                } finally {
                }
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
