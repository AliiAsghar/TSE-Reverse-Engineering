package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ugs extends agmc {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ ugu a;

    public ugs(ugu uguVar) {
        this.a = uguVar;
    }

    @Override // defpackage.agmc
    public final /* synthetic */ void b(agoz agozVar, aglo agloVar) {
        akrh e = aktp.e("MessageChangeListener::onChangeInTransaction");
        try {
            MessagesTable.BindData bindData = (MessagesTable.BindData) agloVar.p();
            if (bindData != null) {
                akrh e2 = aktp.e("MessageChangeListener::insert");
                try {
                    ugp a = this.a.a(1);
                    try {
                        a.b(1, bindData.A().a());
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agmc
    public final /* synthetic */ void c(agoz agozVar, aglo agloVar) {
        akrh e;
        ugp a;
        sxt sxtVar;
        akrh e2 = aktp.e("MessageChangeListener::preChangeInTransaction");
        try {
            agpw s = agloVar.s();
            if (s != null) {
                e = aktp.e("MessageChangeListener::preChangeInTransaction::delete");
                try {
                    sxy d = MessagesTable.d();
                    d.w("TableChangeObserver#preChangeInTransaction-messages1");
                    d.e(new ugo(7));
                    d.k((syb) s);
                    sxx b2 = d.b();
                    a = this.a.a(1);
                    try {
                        sxtVar = (sxt) b2.n();
                        while (sxtVar.moveToNext()) {
                            try {
                                a.b(3, sxtVar.E().a());
                            } finally {
                            }
                        }
                        sxtVar.close();
                        a.a();
                        e.close();
                    } finally {
                    }
                } finally {
                }
            } else {
                agpr r = agloVar.r();
                if (r != null) {
                    e = aktp.e("MessageChangeListener::preChangeInTransaction::update");
                    try {
                        sxy d2 = MessagesTable.d();
                        d2.w("TableChangeObserver#preChangeInTransaction-messages2");
                        d2.e(new ugo(8));
                        alur it = r.e.iterator();
                        while (it.hasNext()) {
                            d2.k((syb) ((agpw) it.next()));
                        }
                        a = this.a.a(1);
                        try {
                            sxtVar = (sxt) d2.b().n();
                            while (sxtVar.moveToNext()) {
                                try {
                                    a.b(2, sxtVar.E().a());
                                } finally {
                                    try {
                                        sxtVar.close();
                                    } catch (Throwable th) {
                                        th.addSuppressed(th);
                                    }
                                }
                            }
                            sxtVar.close();
                            a.a();
                            e.close();
                        } finally {
                            try {
                                a.a();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                    } finally {
                    }
                }
            }
            e2.close();
        } catch (Throwable th3) {
            try {
                e2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
