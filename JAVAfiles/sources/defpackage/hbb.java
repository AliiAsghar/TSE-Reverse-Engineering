package defpackage;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbb {
    public Map a;
    public Map b;
    public Map c;
    public List d;
    public vm e;
    public uj f;
    public List g;
    public Rect h;
    public float i;
    public float j;
    public float k;
    public boolean l;
    public final gvf n = new gvf(null, null);
    private final HashSet o = new HashSet();
    public int m = 0;

    public final float a() {
        return (b() / this.k) * 1000.0f;
    }

    public final float b() {
        return this.j - this.i;
    }

    public final hfz c(long j) {
        return (hfz) this.f.d(j);
    }

    public final void d(String str) {
        hhw.a(str);
        this.o.add(str);
    }

    public final void e(int i) {
        this.m += i;
    }

    public final void f() {
        this.l = true;
    }

    public final her g() {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            her herVar = (her) this.d.get(i);
            if (!herVar.a.equalsIgnoreCase("rest")) {
                if (herVar.a.endsWith("\r")) {
                    if (!herVar.a.substring(0, r4.length() - 1).equalsIgnoreCase("rest")) {
                    }
                }
            }
            return herVar;
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            sb.append(((hfz) it.next()).a("\t"));
        }
        return sb.toString();
    }
}
