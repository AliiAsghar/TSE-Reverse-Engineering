package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxz implements gxx {
    public final gid a;

    public gxz(gid gidVar) {
        this.a = gidVar;
    }

    public final void a(HashMap hashMap) {
        Set keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() <= 999) {
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
            int size = keySet.size();
            gvf.bv(sb, size);
            sb.append(")");
            gih a = gih.a(sb.toString(), size);
            Iterator it = keySet.iterator();
            int i = 1;
            while (it.hasNext()) {
                a.g(i, (String) it.next());
                i++;
            }
            Cursor bC = gvf.bC(this.a, a, false);
            try {
                int bD = gvf.bD(bC, "work_spec_id");
                if (bD != -1) {
                    while (bC.moveToNext()) {
                        ArrayList arrayList = (ArrayList) hashMap.get(bC.getString(bD));
                        if (arrayList != null) {
                            arrayList.add(gsi.c(bC.getBlob(0)));
                        }
                    }
                }
                return;
            } finally {
                bC.close();
            }
        }
        gvf.by(hashMap, new gxy(this, 0));
    }

    public final void b(HashMap hashMap) {
        Set keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() <= 999) {
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
            int size = keySet.size();
            gvf.bv(sb, size);
            sb.append(")");
            gih a = gih.a(sb.toString(), size);
            Iterator it = keySet.iterator();
            int i = 1;
            while (it.hasNext()) {
                a.g(i, (String) it.next());
                i++;
            }
            Cursor bC = gvf.bC(this.a, a, false);
            try {
                int bD = gvf.bD(bC, "work_spec_id");
                if (bD != -1) {
                    while (bC.moveToNext()) {
                        ArrayList arrayList = (ArrayList) hashMap.get(bC.getString(bD));
                        if (arrayList != null) {
                            arrayList.add(bC.getString(0));
                        }
                    }
                }
                return;
            } finally {
                bC.close();
            }
        }
        gvf.by(hashMap, new gxy(this, 1));
    }
}
