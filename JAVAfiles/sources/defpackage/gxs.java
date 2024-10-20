package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxs implements gxq {
    public final gid a;
    public final ghp b;

    public gxs(gid gidVar) {
        this.a = gidVar;
        this.b = new gxr(gidVar);
    }

    @Override // defpackage.gxq
    public final List a(String str) {
        gih a = gih.a("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        a.g(1, str);
        this.a.k();
        Cursor bC = gvf.bC(this.a, a, false);
        try {
            ArrayList arrayList = new ArrayList(bC.getCount());
            while (bC.moveToNext()) {
                arrayList.add(bC.getString(0));
            }
            return arrayList;
        } finally {
            bC.close();
            a.j();
        }
    }
}
