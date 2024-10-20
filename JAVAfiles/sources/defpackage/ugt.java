package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ugt extends agmc {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ ugu a;

    public ugt(ugu uguVar) {
        this.a = uguVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agmc
    public final /* synthetic */ void b(agoz agozVar, aglo agloVar) {
        akrh e;
        ugp a;
        akrh e2 = aktp.e("ParticipantChangeListener::onChangeInTransaction");
        try {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) agloVar.p();
            if (bindData != null) {
                e = aktp.e("ParticipantChangeListener::onChangeInTransaction::insert");
                try {
                    a = this.a.a(3);
                    try {
                        a.b(1, bindData.M());
                        a.a();
                        e.close();
                    } finally {
                    }
                } finally {
                }
            } else {
                agpr r = agloVar.r();
                if (r != null) {
                    e = aktp.e("ParticipantChangeListener::onChangeInTransaction::update");
                    try {
                        taz e3 = ParticipantsTable.e();
                        e3.w("ParticipantChangeListener#onChangeInTransaction");
                        e3.e(new ugo(9));
                        alur it = r.e.iterator();
                        while (it.hasNext()) {
                            e3.k((tbc) ((agpw) it.next()));
                        }
                        a = this.a.a(3);
                        try {
                            tav tavVar = (tav) e3.b().n();
                            while (tavVar.moveToNext()) {
                                try {
                                    a.b(2, tavVar.K());
                                } finally {
                                }
                            }
                            tavVar.close();
                            a.a();
                            e.close();
                        } finally {
                            try {
                                a.a();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                    } finally {
                    }
                }
            }
            e2.close();
        } catch (Throwable th2) {
            try {
                e2.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // defpackage.agmc
    public final /* synthetic */ void c(agoz agozVar, aglo agloVar) {
        akrh e = aktp.e("ParticipantChangeListener::preChangeInTransaction");
        try {
            agpw s = agloVar.s();
            if (s != null) {
                akrh e2 = aktp.e("ParticipantChangeListener::preChangeInTransaction::delete");
                try {
                    taz e3 = ParticipantsTable.e();
                    e3.w("ParticipantChangeListener#preChangeInTransaction");
                    e3.e(new ugo(10));
                    e3.k((tbc) s);
                    tay b2 = e3.b();
                    ugp a = this.a.a(3);
                    try {
                        tav tavVar = (tav) b2.n();
                        while (tavVar.moveToNext()) {
                            try {
                                a.b(3, tavVar.K());
                            } finally {
                            }
                        }
                        tavVar.close();
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
