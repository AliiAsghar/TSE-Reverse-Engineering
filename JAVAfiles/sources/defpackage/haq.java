package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class haq {
    public static final String a = gsy.b("DiagnosticsWrkr");

    public static final String a(gyh gyhVar, gzo gzoVar, gyb gybVar, List list) {
        Integer num;
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gys gysVar = (gys) it.next();
            gya n = gvf.n(gybVar, gvf.J(gysVar));
            if (n != null) {
                num = Integer.valueOf(n.c);
            } else {
                num = null;
            }
            String str = gysVar.c;
            gih a2 = gih.a("SELECT name FROM workname WHERE work_spec_id=?", 1);
            a2.g(1, str);
            gyj gyjVar = (gyj) gyhVar;
            gyjVar.a.k();
            Cursor bC = gvf.bC(gyjVar.a, a2, false);
            try {
                ArrayList arrayList = new ArrayList(bC.getCount());
                while (bC.moveToNext()) {
                    arrayList.add(bC.getString(0));
                }
                bC.close();
                a2.j();
                sb.append("\n" + gysVar.c + "\t " + gysVar.e + "\t " + num + "\t " + gysVar.d.name() + "\t " + aqjn.aK(arrayList, ",", null, null, null, 62) + "\t " + aqjn.aK(gzoVar.a(gysVar.c), ",", null, null, null, 62) + '\t');
            } catch (Throwable th) {
                bC.close();
                a2.j();
                throw th;
            }
        }
        return sb.toString();
    }
}
