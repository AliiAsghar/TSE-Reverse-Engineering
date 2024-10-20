package defpackage;

import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfz {
    public final List a;
    public final hbb b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;
    public final List g;
    public final hfd h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final hfc p;
    public final heu q;
    public final List r;
    public final boolean s;
    public final int t;
    public final int u;
    public final hgi v;
    public final ifq w;
    public final gpx x;

    public hfz(List list, hbb hbbVar, String str, long j, int i, long j2, String str2, List list2, hfd hfdVar, int i2, int i3, int i4, float f, float f2, float f3, float f4, hfc hfcVar, gpx gpxVar, List list3, int i5, heu heuVar, boolean z, hgi hgiVar, ifq ifqVar) {
        this.a = list;
        this.b = hbbVar;
        this.c = str;
        this.d = j;
        this.t = i;
        this.e = j2;
        this.f = str2;
        this.g = list2;
        this.h = hfdVar;
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.l = f;
        this.m = f2;
        this.n = f3;
        this.o = f4;
        this.p = hfcVar;
        this.x = gpxVar;
        this.r = list3;
        this.u = i5;
        this.q = heuVar;
        this.s = z;
        this.v = hgiVar;
        this.w = ifqVar;
    }

    public final String a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.c);
        sb.append("\n");
        hfz c = this.b.c(this.e);
        if (c != null) {
            sb.append("\t\tParents: ");
            sb.append(c.c);
            hfz c2 = this.b.c(c.e);
            while (c2 != null) {
                sb.append("->");
                sb.append(c2.c);
                c2 = this.b.c(c2.e);
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!this.g.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(this.g.size());
            sb.append("\n");
        }
        if (this.i != 0 && this.j != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(this.i), Integer.valueOf(this.j), Integer.valueOf(this.k)));
        }
        if (!this.a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (Object obj : this.a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(obj);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return a("");
    }
}
