package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gys {
    public static final String a = gsy.b("WorkSpec");
    public static final tb b = new tb() { // from class: gyp
        @Override // defpackage.tb
        public final Object a(Object obj) {
            gsi gsiVar;
            boolean z;
            Iterator it;
            int i;
            gsf gsfVar;
            gtj gtjVar;
            long j;
            boolean z2;
            List list = (List) obj;
            String str = gys.a;
            if (list != null) {
                ArrayList arrayList = new ArrayList(aqjn.J(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    gyr gyrVar = (gyr) it2.next();
                    if (!gyrVar.q.isEmpty()) {
                        gsiVar = (gsi) gyrVar.q.get(0);
                    } else {
                        gsiVar = gsi.a;
                    }
                    gsi gsiVar2 = gsiVar;
                    UUID fromString = UUID.fromString(gyrVar.a);
                    fromString.getClass();
                    gtk gtkVar = gyrVar.b;
                    HashSet hashSet = new HashSet(gyrVar.p);
                    gsi gsiVar3 = gyrVar.c;
                    int i2 = gyrVar.h;
                    int i3 = gyrVar.m;
                    gsf gsfVar2 = gyrVar.g;
                    ArrayList arrayList2 = arrayList;
                    long j2 = gyrVar.d;
                    long j3 = gyrVar.e;
                    if (j3 != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (j3 != 0) {
                        i = i3;
                        gsfVar = gsfVar2;
                        it = it2;
                        gtjVar = new gtj(j3, gyrVar.f);
                    } else {
                        it = it2;
                        i = i3;
                        gsfVar = gsfVar2;
                        gtjVar = null;
                    }
                    gtk gtkVar2 = gyrVar.b;
                    gtk gtkVar3 = gtk.ENQUEUED;
                    if (gtkVar2 == gtkVar3) {
                        if (gtkVar2 == gtkVar3 && i2 > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        j = gvf.K(z2, i2, gyrVar.i, gyrVar.j, gyrVar.k, gyrVar.l, !z, j2, gyrVar.f, j3, gyrVar.n);
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    arrayList2.add(new gtl(fromString, gtkVar, hashSet, gsiVar3, gsiVar2, i2, i, gsfVar, j2, gtjVar, j, gyrVar.o));
                    arrayList = arrayList2;
                    it2 = it;
                }
                return arrayList;
            }
            return null;
        }
    };
    public final String c;
    public gtk d;
    public String e;
    public String f;
    public gsi g;
    public gsi h;
    public long i;
    public long j;
    public long k;
    public gsf l;
    public int m;
    public gry n;
    public long o;
    public long p;
    public long q;
    public long r;
    public boolean s;
    public gtf t;
    public int u;
    public final int v;
    public long w;
    public int x;
    public final int y;
    public String z;

    public gys(String str, gtk gtkVar, String str2, String str3, gsi gsiVar, gsi gsiVar2, long j, long j2, long j3, gsf gsfVar, int i, gry gryVar, long j4, long j5, long j6, long j7, boolean z, gtf gtfVar, int i2, int i3, long j8, int i4, int i5, String str4) {
        str.getClass();
        gtkVar.getClass();
        str2.getClass();
        str3.getClass();
        gsiVar.getClass();
        gsiVar2.getClass();
        gsfVar.getClass();
        gryVar.getClass();
        gtfVar.getClass();
        this.c = str;
        this.d = gtkVar;
        this.e = str2;
        this.f = str3;
        this.g = gsiVar;
        this.h = gsiVar2;
        this.i = j;
        this.j = j2;
        this.k = j3;
        this.l = gsfVar;
        this.m = i;
        this.n = gryVar;
        this.o = j4;
        this.p = j5;
        this.q = j6;
        this.r = j7;
        this.s = z;
        this.t = gtfVar;
        this.u = i2;
        this.v = i3;
        this.w = j8;
        this.x = i4;
        this.y = i5;
        this.z = str4;
    }

    public static /* synthetic */ gys g(gys gysVar, String str, gtk gtkVar, String str2, gsi gsiVar, int i, long j, int i2, int i3, long j2, int i4, int i5) {
        String str3;
        gtk gtkVar2;
        String str4;
        String str5;
        gsi gsiVar2;
        gsi gsiVar3;
        long j3;
        long j4;
        long j5;
        gsf gsfVar;
        int i6;
        gry gryVar;
        long j6;
        long j7;
        long j8;
        long j9;
        boolean z;
        int i7;
        int i8;
        long j10;
        int i9;
        if ((i5 & 1) != 0) {
            str3 = gysVar.c;
        } else {
            str3 = str;
        }
        if ((i5 & 2) != 0) {
            gtkVar2 = gysVar.d;
        } else {
            gtkVar2 = gtkVar;
        }
        if ((i5 & 4) != 0) {
            str4 = gysVar.e;
        } else {
            str4 = str2;
        }
        gtf gtfVar = null;
        if ((i5 & 8) != 0) {
            str5 = gysVar.f;
        } else {
            str5 = null;
        }
        if ((i5 & 16) != 0) {
            gsiVar2 = gysVar.g;
        } else {
            gsiVar2 = gsiVar;
        }
        if ((i5 & 32) != 0) {
            gsiVar3 = gysVar.h;
        } else {
            gsiVar3 = null;
        }
        if ((i5 & 64) != 0) {
            j3 = gysVar.i;
        } else {
            j3 = 0;
        }
        if ((i5 & 128) != 0) {
            j4 = gysVar.j;
        } else {
            j4 = 0;
        }
        if ((i5 & 256) != 0) {
            j5 = gysVar.k;
        } else {
            j5 = 0;
        }
        if ((i5 & 512) != 0) {
            gsfVar = gysVar.l;
        } else {
            gsfVar = null;
        }
        if ((i5 & 1024) != 0) {
            i6 = gysVar.m;
        } else {
            i6 = i;
        }
        if ((i5 & 2048) != 0) {
            gryVar = gysVar.n;
        } else {
            gryVar = null;
        }
        if ((i5 & 4096) != 0) {
            j6 = gysVar.o;
        } else {
            j6 = 0;
        }
        if ((i5 & 8192) != 0) {
            j7 = gysVar.p;
        } else {
            j7 = j;
        }
        if ((i5 & 16384) != 0) {
            j8 = gysVar.q;
        } else {
            j8 = 0;
        }
        if ((32768 & i5) != 0) {
            j9 = gysVar.r;
        } else {
            j9 = 0;
        }
        if ((65536 & i5) != 0) {
            z = gysVar.s;
        } else {
            z = false;
        }
        boolean z2 = z;
        if ((131072 & i5) != 0) {
            gtfVar = gysVar.t;
        }
        gtf gtfVar2 = gtfVar;
        if ((262144 & i5) != 0) {
            i7 = gysVar.u;
        } else {
            i7 = i2;
        }
        if ((524288 & i5) != 0) {
            i8 = gysVar.v;
        } else {
            i8 = i3;
        }
        if ((1048576 & i5) != 0) {
            j10 = gysVar.w;
        } else {
            j10 = j2;
        }
        if ((i5 & 2097152) != 0) {
            i9 = gysVar.x;
        } else {
            i9 = i4;
        }
        int i10 = gysVar.y;
        String str6 = gysVar.z;
        str3.getClass();
        gtkVar2.getClass();
        str4.getClass();
        str5.getClass();
        gsiVar2.getClass();
        gsiVar3.getClass();
        gsfVar.getClass();
        gryVar.getClass();
        gtfVar2.getClass();
        return new gys(str3, gtkVar2, str4, str5, gsiVar2, gsiVar3, j3, j4, j5, gsfVar, i6, gryVar, j6, j7, j8, j9, z2, gtfVar2, i7, i8, j10, i9, i10, str6);
    }

    public final long a() {
        return gvf.K(e(), this.m, this.n, this.o, this.p, this.u, f(), this.i, this.k, this.j, this.w);
    }

    public final void b(long j) {
        if (j < 900000) {
            gsy.a();
            Log.w(a, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        c(arrn.v(j, 900000L), arrn.v(j, 900000L));
    }

    public final void c(long j, long j2) {
        if (j < 900000) {
            gsy.a();
            Log.w(a, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.j = arrn.v(j, 900000L);
        if (j2 < 300000) {
            gsy.a();
            Log.w(a, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j2 > this.j) {
            gsy.a();
            Log.w(a, a.ck(j, "Flex duration greater than interval duration; Changed to "));
        }
        this.k = arrn.x(j2, 300000L, this.j);
    }

    public final boolean d() {
        if (!d.F(gsf.a, this.l)) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.d == gtk.ENQUEUED && this.m > 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gys)) {
            return false;
        }
        gys gysVar = (gys) obj;
        if (d.F(this.c, gysVar.c) && this.d == gysVar.d && d.F(this.e, gysVar.e) && d.F(this.f, gysVar.f) && d.F(this.g, gysVar.g) && d.F(this.h, gysVar.h) && this.i == gysVar.i && this.j == gysVar.j && this.k == gysVar.k && d.F(this.l, gysVar.l) && this.m == gysVar.m && this.n == gysVar.n && this.o == gysVar.o && this.p == gysVar.p && this.q == gysVar.q && this.r == gysVar.r && this.s == gysVar.s && this.t == gysVar.t && this.u == gysVar.u && this.v == gysVar.v && this.w == gysVar.w && this.x == gysVar.x && this.y == gysVar.y && d.F(this.z, gysVar.z)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (this.j != 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
        int A = a.A(this.i);
        int A2 = a.A(this.j);
        int A3 = (((((((((((hashCode2 * 31) + A) * 31) + A2) * 31) + a.A(this.k)) * 31) + this.l.hashCode()) * 31) + this.m) * 31) + this.n.hashCode();
        int A4 = a.A(this.o);
        int A5 = a.A(this.p);
        int A6 = a.A(this.q);
        int A7 = a.A(this.r);
        int v = (((((((((((((A3 * 31) + A4) * 31) + A5) * 31) + A6) * 31) + A7) * 31) + a.v(this.s)) * 31) + this.t.hashCode()) * 31) + this.u;
        int A8 = (((((v * 31) + this.v) * 31) + a.A(this.w)) * 31) + this.x;
        String str = this.z;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (((A8 * 31) + this.y) * 31) + hashCode;
    }

    public final String toString() {
        return "{WorkSpec: " + this.c + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ gys(java.lang.String r36, defpackage.gtk r37, java.lang.String r38, java.lang.String r39, defpackage.gsi r40, defpackage.gsi r41, long r42, long r44, long r46, defpackage.gsf r48, int r49, defpackage.gry r50, long r51, long r53, long r55, long r57, boolean r59, defpackage.gtf r60, int r61, long r62, int r64, int r65, java.lang.String r66, int r67) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gys.<init>(java.lang.String, gtk, java.lang.String, java.lang.String, gsi, gsi, long, long, long, gsf, int, gry, long, long, long, long, boolean, gtf, int, long, int, int, java.lang.String, int):void");
    }
}
