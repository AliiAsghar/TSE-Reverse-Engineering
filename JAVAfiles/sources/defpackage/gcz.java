package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gcz {
    private final ghw a;
    public final arpi b;
    public gcf c;
    public final CopyOnWriteArrayList d;
    public volatile boolean e;
    public volatile int f;
    public final ascd g;
    public final ascv h;
    public final ascc i;
    public ghw j;
    public final kkc k;
    public qdq l;

    /* JADX WARN: Type inference failed for: r0v3, types: [ascv, java.lang.Object] */
    public gcz(arpi arpiVar, gpx gpxVar) {
        gbg gbgVar;
        gcf gcfVar;
        gbg j;
        arpiVar.getClass();
        this.b = arpiVar;
        gcf gcfVar2 = gcf.a;
        byte[] bArr = null;
        if (gpxVar != null) {
            gbgVar = gpxVar.j();
        } else {
            gbgVar = null;
        }
        if (gbgVar != null) {
            gcfVar = new gcf(gbgVar);
        } else {
            gcfVar = gcf.a;
            gcfVar.getClass();
        }
        this.c = gcfVar;
        kkc kkcVar = new kkc((byte[]) null, (byte[]) null);
        if (gpxVar != null && (j = gpxVar.j()) != null) {
            kkcVar.o(j.f);
        }
        this.k = kkcVar;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.d = copyOnWriteArrayList;
        this.a = new ghw(bArr, bArr, bArr);
        this.g = ascy.a(false);
        this.h = kkcVar.a;
        this.i = asck.d(0, 64, 2);
        copyOnWriteArrayList.add(new rd(this, 14));
    }

    public abstract Object a(dyh dyhVar, arpe arpeVar);

    public final gaq b() {
        gcf gcfVar = this.c;
        int i = gcfVar.d;
        int i2 = gcfVar.e;
        List list = gcfVar.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aqjn.S(arrayList, ((gec) it.next()).c);
        }
        return new gaq(i, i2, arrayList);
    }

    public final Object c(int i) {
        ascd ascdVar;
        Object c;
        Object c2;
        do {
            ascdVar = this.g;
            c = ascdVar.c();
            ((Boolean) c).booleanValue();
        } while (!ascdVar.g(c, true));
        this.e = true;
        this.f = i;
        if (dyi.e(2)) {
            dyi.f(2, "Accessing item index[" + i + ']');
        }
        ghw ghwVar = this.j;
        if (ghwVar != null) {
            ghwVar.h(this.c.g(i));
        }
        gcf gcfVar = this.c;
        if (i >= 0 && i < gcfVar.f()) {
            int i2 = i - gcfVar.d;
            Object obj = null;
            if (i2 >= 0 && i2 < gcfVar.c) {
                obj = gcfVar.h(i2);
            }
            ascd ascdVar2 = this.g;
            do {
                c2 = ascdVar2.c();
                ((Boolean) c2).booleanValue();
            } while (!ascdVar2.g(c2, false));
            return obj;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + gcfVar.f());
    }

    public final Object e(gpx gpxVar, arpe arpeVar) {
        Object d = this.a.d(new ikv(this, gpxVar, (arpe) null, 1), arpeVar);
        if (d == arpl.a) {
            return d;
        }
        return arnb.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(java.util.List r6, int r7, int r8, boolean r9, defpackage.gba r10, defpackage.ghw r11, defpackage.arpe r12) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gcz.f(java.util.List, int, int, boolean, gba, ghw, arpe):java.lang.Object");
    }
}
