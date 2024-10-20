package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gup extends gti {
    private static final String i = gsy.b("WorkContinuationImpl");
    public final gvd a;
    public final String b;
    public final gso c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public boolean h;
    private gtd j;

    public gup(gvd gvdVar, String str, gso gsoVar, List list) {
        this(gvdVar, str, gsoVar, list, null);
    }

    public static Set d(gup gupVar) {
        HashSet hashSet = new HashSet();
        List list = gupVar.g;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((gup) it.next()).e);
            }
        }
        return hashSet;
    }

    public static boolean e(gup gupVar, Set set) {
        set.addAll(gupVar.e);
        Set d = d(gupVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (d.contains((String) it.next())) {
                return true;
            }
        }
        List list = gupVar.g;
        if (list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (e((gup) it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(gupVar.e);
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.gti
    public final gtd a() {
        if (!this.h) {
            this.j = gvf.bI(this.a.d.m, "EnqueueRunnable_".concat(String.valueOf(this.c.name())), this.a.l.b, new gvc(this, 1));
        } else {
            gsy.a();
            Log.w(i, "Already enqueued work ids (" + TextUtils.join(", ", this.e) + ")");
        }
        return this.j;
    }

    @Override // defpackage.gti
    public final gti b(List list) {
        if (list.isEmpty()) {
            return this;
        }
        return new gup(this.a, this.b, gso.KEEP, list, Collections.singletonList(this));
    }

    public gup(gvd gvdVar, String str, gso gsoVar, List list, List list2) {
        this.a = gvdVar;
        this.b = str;
        this.c = gsoVar;
        this.d = list;
        this.g = list2;
        this.e = new ArrayList(list.size());
        this.f = new ArrayList();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.f.addAll(((gup) it.next()).f);
            }
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (gsoVar == gso.REPLACE && ((gys) ((kkc) list.get(i2)).b).w != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String e = ((kkc) list.get(i2)).e();
            this.e.add(e);
            this.f.add(e);
        }
    }

    public gup(gvd gvdVar, List list) {
        this(gvdVar, null, gso.KEEP, list, null);
    }
}
