package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ugr extends agmc {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ ugu a;

    public ugr(ugu uguVar) {
        this.a = uguVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agmc
    public final /* synthetic */ void b(agoz agozVar, aglo agloVar) {
        akrh e = aktp.e("MessageAnnotationChangeListener::onChangeInTransaction");
        try {
            stc stcVar = (stc) agloVar.p();
            if (stcVar != null) {
                akrh e2 = aktp.e("MessageAnnotationChangeListener::onChangeInTransaction::insert");
                try {
                    ugp a = this.a.a(4);
                    try {
                        stcVar.ao(0, "_id");
                        a.b(1, stcVar.a);
                        a.a();
                        e2.close();
                        e.close();
                        return;
                    } finally {
                    }
                } finally {
                }
            }
            e.close();
            agpr r = agloVar.r();
            if (r != null) {
                e = aktp.e("MessageAnnotationChangeListener::onChangeInTransaction::update");
                try {
                    stj a2 = stl.a();
                    a2.w("MessageAnnotationChangeListener#onChangeInTransaction");
                    a2.d(new ugo(6));
                    alur it = r.e.iterator();
                    while (it.hasNext()) {
                        a2.k((agpw) it.next());
                    }
                    ugp a3 = this.a.a(4);
                    try {
                        stf stfVar = (stf) a2.b().n();
                        while (stfVar.moveToNext()) {
                            try {
                                a3.b(2, stfVar.h());
                            } finally {
                            }
                        }
                        stfVar.close();
                        a3.a();
                        e.close();
                    } finally {
                    }
                } finally {
                }
            }
        } finally {
        }
    }

    @Override // defpackage.agmc
    public final /* synthetic */ void c(agoz agozVar, aglo agloVar) {
        akrh e = aktp.e("MessageAnnotationChangeListener::preChangeInTransaction");
        try {
            agpw s = agloVar.s();
            if (s != null) {
                akrh e2 = aktp.e("MessageAnnotationChangeListener::preChangeInTransaction::delete");
                try {
                    stj a = stl.a();
                    a.w("MessageAnnotationChangeListener#preChangeInTransaction");
                    a.d(new ugo(5));
                    a.k(s);
                    sti b2 = a.b();
                    ugp a2 = this.a.a(4);
                    try {
                        stf stfVar = (stf) b2.n();
                        while (stfVar.moveToNext()) {
                            try {
                                a2.b(3, stfVar.h());
                            } finally {
                            }
                        }
                        stfVar.close();
                        a2.a();
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
