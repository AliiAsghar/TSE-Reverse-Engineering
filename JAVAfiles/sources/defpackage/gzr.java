package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzr implements gzo {
    public final gid a;
    public final ghp b;
    public final gil c;

    public gzr(gid gidVar) {
        this.a = gidVar;
        this.b = new gzp(gidVar);
        this.c = new gzq(gidVar);
    }

    @Override // defpackage.gzo
    public final List a(String str) {
        gih a = gih.a("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
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

    @Override // defpackage.gzo
    public final /* synthetic */ void b(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ico icoVar = new ico((String) it.next(), str);
            this.a.k();
            this.a.l();
            try {
                this.b.a(icoVar);
                this.a.o();
            } finally {
                this.a.m();
            }
        }
    }
}
