package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nbp implements mzy {
    private final nat a;

    public nbp(nat natVar) {
        natVar.getClass();
        this.a = natVar;
    }

    @Override // defpackage.mzy
    public final sxy a(sxy sxyVar) {
        tex b = tfa.b();
        b.w("+loadReadReports");
        b.c(new nas(16));
        sxyVar.D(agoh.b(b.b(), (agmh) tfa.d.a, MessagesTable.c.a).a());
        return sxyVar;
    }

    @Override // defpackage.mzy
    public final mzm c() {
        return this.a;
    }

    @Override // defpackage.mzy
    public final void e(mzw mzwVar, MessagesTable.BindData bindData, ifs ifsVar, alor alorVar) {
        bindData.getClass();
        ifsVar.getClass();
        alorVar.getClass();
        if (bindData.k() == 3) {
            String[] strArr = tfa.a;
            tes[] tesVarArr = (tes[]) bindData.au("read_reports", new tes[0]);
            tesVarArr.getClass();
            List p = aqil.p(tesVarArr);
            ArrayList arrayList = new ArrayList();
            for (Object obj : p) {
                if (((tes) obj).k() > 0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(aqjn.J(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(ifsVar.b(String.valueOf(((tes) it.next()).h())));
            }
            mzwVar.d(alzz.aZ(aqjn.an(arrayList2)));
            List p2 = aqil.p(tesVarArr);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : p2) {
                if (((tes) obj2).n().isPresent()) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(aqjn.J(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(ifsVar.b(String.valueOf(((tes) it2.next()).h())));
            }
            mzwVar.c(alzz.aZ(aqjn.an(arrayList4)));
        }
    }

    @Override // defpackage.mzy
    public final void b() {
    }

    @Override // defpackage.mzy
    public final /* synthetic */ void d() {
    }
}
