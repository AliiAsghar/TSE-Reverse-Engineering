package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdo implements bzs {
    public final List a;
    public vh b;
    private final Set c;
    private final List d;
    private final List e;
    private final List f;
    private final List g;
    private final tv h;
    private final tv i;

    public cdo(Set set) {
        this.c = set;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = arrayList;
        this.f = new ArrayList();
        this.a = new ArrayList();
        this.g = new ArrayList();
        this.h = new tv((byte[]) null);
        this.i = new tv((byte[]) null);
    }

    private final void e(int i) {
        if (!this.g.isEmpty()) {
            int i2 = 0;
            int i3 = 0;
            List list = null;
            tv tvVar = null;
            tv tvVar2 = null;
            while (true) {
                tv tvVar3 = this.i;
                if (i3 >= tvVar3.b) {
                    break;
                }
                if (i <= tvVar3.a(i3)) {
                    Object remove = this.g.remove(i3);
                    int c = this.i.c(i3);
                    int c2 = this.h.c(i3);
                    if (list == null) {
                        list = aqjn.D(remove);
                        tvVar2 = new tv((byte[]) null);
                        tvVar2.e(c);
                        tvVar = new tv((byte[]) null);
                        tvVar.e(c2);
                    } else {
                        tvVar.getClass();
                        tvVar2.getClass();
                        list.add(remove);
                        tvVar2.e(c);
                        tvVar.e(c2);
                    }
                } else {
                    i3++;
                }
            }
            if (list != null) {
                tvVar.getClass();
                tvVar2.getClass();
                int size = list.size() - 1;
                while (i2 < size) {
                    int i4 = i2 + 1;
                    int size2 = list.size();
                    for (int i5 = i4; i5 < size2; i5++) {
                        int a = tvVar2.a(i2);
                        int a2 = tvVar2.a(i5);
                        if (a < a2 || (a2 == a && tvVar.a(i2) < tvVar.a(i5))) {
                            Object obj = list.get(i2);
                            list.set(i2, list.get(i5));
                            list.set(i5, obj);
                            cdp.a(tvVar, i2, i5);
                            cdp.a(tvVar2, i2, i5);
                        }
                    }
                    i2 = i4;
                }
                this.f.addAll(list);
            }
        }
    }

    @Override // defpackage.bzs
    public final void a(bzt bztVar) {
        this.e.add(bztVar);
    }

    public final void b() {
        if (!this.c.isEmpty()) {
            Trace.beginSection("Compose:abandons");
            try {
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    bzt bztVar = (bzt) it.next();
                    it.remove();
                    bztVar.g();
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void c() {
        e(Integer.MIN_VALUE);
        if (!this.f.isEmpty()) {
            Trace.beginSection("Compose:onForgotten");
            try {
                vh vhVar = this.b;
                int size = this.f.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Object obj = this.f.get(size);
                    if (obj instanceof bzt) {
                        this.c.remove(obj);
                        ((bzt) obj).h();
                    }
                    if (obj instanceof bwh) {
                        if (vhVar != null && vhVar.a(obj)) {
                            ((bwh) obj).c();
                        } else {
                            ((bwh) obj).b();
                        }
                    }
                }
            } finally {
            }
        }
        if (!this.d.isEmpty()) {
            Trace.beginSection("Compose:onRemembered");
            try {
                List list = this.d;
                int size2 = list.size();
                for (int i = 0; i < size2; i++) {
                    bzt bztVar = (bzt) list.get(i);
                    this.c.remove(bztVar);
                    bztVar.i();
                }
            } finally {
            }
        }
    }

    public final void d(Object obj, int i, int i2, int i3) {
        e(i);
        if (i3 >= 0 && i3 < i) {
            this.g.add(obj);
            this.h.e(i2);
            this.i.e(i3);
            return;
        }
        this.f.add(obj);
    }
}
