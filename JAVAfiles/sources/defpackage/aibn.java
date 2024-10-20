package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aibn {
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public final aibj a() {
        Object obj = this.a;
        if (obj != null) {
            if (this.b == null && this.c == null) {
                aiau aiauVar = (aiau) obj;
                int i = aiauVar.c;
                if (i > 0) {
                    this.b = Integer.valueOf(i);
                }
                int i2 = aiauVar.b;
                if (i2 > 0) {
                    this.c = Integer.valueOf(i2);
                }
            }
            Object obj2 = this.a;
            if (obj2 != null) {
                Object obj3 = this.b;
                return new aibj((Integer) obj3, (Integer) this.c, (aiau) obj2, (adae) this.d);
            }
            throw new IllegalStateException("Missing required properties: photoMetadata");
        }
        throw new IllegalStateException("Property \"photoMetadata\" has not been set");
    }

    public final void b(aiav aiavVar) {
        if (aiavVar != null) {
            this.d = aiavVar;
            return;
        }
        throw new NullPointerException("Null acceptsCashOnly");
    }

    public final void c(aiav aiavVar) {
        if (aiavVar != null) {
            this.a = aiavVar;
            return;
        }
        throw new NullPointerException("Null acceptsCreditCards");
    }

    public final void d(aiav aiavVar) {
        if (aiavVar != null) {
            this.c = aiavVar;
            return;
        }
        throw new NullPointerException("Null acceptsDebitCards");
    }

    public final void e(aiav aiavVar) {
        if (aiavVar != null) {
            this.b = aiavVar;
            return;
        }
        throw new NullPointerException("Null acceptsNfc");
    }

    public final aiao f() {
        aiao g = g();
        Iterator it = g.d.iterator();
        while (it.hasNext()) {
            d.t(!TextUtils.isEmpty((String) it.next()), "WeekdayText must not contain null or empty values.");
        }
        h(alog.n(g.b));
        j(alog.n(g.d));
        i(alog.n(g.c));
        return g();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    public final aiao g() {
        ?? r1;
        ?? r2;
        ?? r0 = this.c;
        if (r0 != 0 && (r1 = this.b) != 0 && (r2 = this.a) != 0) {
            return new ahzl((aian) this.d, r0, r1, r2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" periods");
        }
        if (this.b == null) {
            sb.append(" specialDays");
        }
        if (this.a == null) {
            sb.append(" weekdayText");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void h(List list) {
        if (list != null) {
            this.c = list;
            return;
        }
        throw new NullPointerException("Null periods");
    }

    public final void i(List list) {
        if (list != null) {
            this.b = list;
            return;
        }
        throw new NullPointerException("Null specialDays");
    }

    public final void j(List list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null weekdayText");
    }

    public final void k(aiav aiavVar) {
        if (aiavVar != null) {
            this.d = aiavVar;
            return;
        }
        throw new NullPointerException("Null wheelchairAccessibleEntrance");
    }

    public final void l(aiav aiavVar) {
        if (aiavVar != null) {
            this.c = aiavVar;
            return;
        }
        throw new NullPointerException("Null wheelchairAccessibleParking");
    }

    public final void m(aiav aiavVar) {
        if (aiavVar != null) {
            this.b = aiavVar;
            return;
        }
        throw new NullPointerException("Null wheelchairAccessibleRestroom");
    }

    public final void n(aiav aiavVar) {
        if (aiavVar != null) {
            this.a = aiavVar;
            return;
        }
        throw new NullPointerException("Null wheelchairAccessibleSeating");
    }
}
