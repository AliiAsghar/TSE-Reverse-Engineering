package defpackage;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class agpw {
    final List a;

    public agpw(agpx agpxVar) {
        this.a = new ArrayList(agpxVar.a);
    }

    public final String a(agpo agpoVar) {
        List list = this.a;
        int size = list.size();
        int size2 = list.size();
        if (size2 != 0) {
            if (size2 != 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("(");
                ((agpy) this.a.get(0)).b(agpoVar, sb);
                for (int i = 1; i < size; i++) {
                    sb.append(" AND ");
                    ((agpy) this.a.get(i)).b(agpoVar, sb);
                }
                sb.append(")");
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            ((agpy) this.a.get(0)).b(agpoVar, sb2);
            return sb2.toString();
        }
        return "1";
    }

    public final String b(agpo agpoVar, List list) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int size = this.a.size();
        if (size != 0) {
            if (size != 1) {
                sb.append("(");
                ((agpy) this.a.get(0)).a(agpoVar, sb, arrayList);
                for (int i = 1; i < size; i++) {
                    sb.append(" AND ");
                    ((agpy) this.a.get(i)).a(agpoVar, sb, arrayList);
                }
                sb.append(")");
            } else {
                ((agpy) this.a.get(0)).a(agpoVar, sb, arrayList);
            }
        } else {
            sb.append("1");
        }
        if (list != null) {
            list.addAll(arrayList);
        }
        return sb.toString();
    }

    public final boolean c(String str, ContentValues contentValues) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((agpy) it.next()).c(str, contentValues)) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(agpv agpvVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (agpvVar.a((agpy) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean e(agxw agxwVar, agpy agpyVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((agpy) it.next()).d(agxwVar, agpyVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof agpw)) {
            return a(agpo.b()).equals(((agpw) obj).a(agpo.b()));
        }
        return false;
    }

    public final void f(adwp adwpVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((agpy) it.next()).e(adwpVar);
        }
    }

    public final int hashCode() {
        return a(agpo.b()).hashCode();
    }
}
