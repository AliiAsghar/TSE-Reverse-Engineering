package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cov {
    public static final b a = new b();
    public static int b;
    public final String c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final cpd h;
    public final long i;
    public final int j;
    public final boolean k;
    public final int l;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        private final String a;
        private final float b;
        private final float c;
        private final float d;
        private final float e;
        private final long f;
        private final int g;
        private final boolean h;
        private final ArrayList i;
        private final C0042a j;
        private boolean k;

        /* compiled from: PG */
        /* renamed from: cov$a$a */
        /* loaded from: classes.dex */
        public final class C0042a {
            public String a;
            public float b;
            public float c;
            public float d;
            public float e;
            public float f;
            public float g;
            public float h;
            public List i;
            public List j;

            public C0042a() {
                this(null, brg.a, brg.a, brg.a, brg.a, brg.a, brg.a, brg.a, null, 1023);
            }

            public /* synthetic */ C0042a(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, int i) {
                List list2 = (i & 256) != 0 ? cpe.a : list;
                int i2 = i & 128;
                int i3 = i & 64;
                int i4 = i & 32;
                int i5 = i & 16;
                int i6 = i & 8;
                int i7 = i & 4;
                int i8 = i & 2;
                int i9 = i & 1;
                float f8 = brg.a;
                float f9 = i2 != 0 ? 0.0f : f7;
                float f10 = i3 != 0 ? 0.0f : f6;
                float f11 = i4 != 0 ? 1.0f : f5;
                float f12 = i5 == 0 ? f4 : 1.0f;
                float f13 = i6 != 0 ? 0.0f : f3;
                float f14 = i7 != 0 ? 0.0f : f2;
                f8 = i8 == 0 ? f : f8;
                String str2 = 1 == i9 ? "" : str;
                ArrayList arrayList = new ArrayList();
                this.a = str2;
                this.b = f8;
                this.c = f14;
                this.d = f13;
                this.e = f12;
                this.f = f11;
                this.g = f10;
                this.h = f9;
                this.i = list2;
                this.j = arrayList;
            }
        }

        public /* synthetic */ a(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
            long j2;
            int i3;
            String str2;
            if ((i2 & 32) != 0) {
                j2 = cku.h;
            } else {
                j2 = j;
            }
            if ((i2 & 64) != 0) {
                i3 = 5;
            } else {
                i3 = i;
            }
            if (1 == (i2 & 1)) {
                str2 = "";
            } else {
                str2 = str;
            }
            boolean z2 = (i2 & 128) == 0;
            this.a = str2;
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
            this.f = j2;
            this.g = i3;
            this.h = z2 & z;
            ArrayList arrayList = new ArrayList();
            this.i = arrayList;
            C0042a c0042a = new C0042a(null, brg.a, brg.a, brg.a, brg.a, brg.a, brg.a, brg.a, null, 1023);
            this.j = c0042a;
            arrayList.add(c0042a);
        }

        public static /* synthetic */ void e(a aVar, List list, cko ckoVar) {
            aVar.c(list, 0, "", ckoVar, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, brg.a, 1.0f, brg.a);
        }

        private final C0042a f() {
            return (C0042a) this.i.get(r0.size() - 1);
        }

        private final void g() {
            if (!this.k) {
                return;
            }
            csg.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }

        private static final cpd h(C0042a c0042a) {
            return new cpd(c0042a.a, c0042a.b, c0042a.c, c0042a.d, c0042a.e, c0042a.f, c0042a.g, c0042a.h, c0042a.i, c0042a.j);
        }

        public final cov a() {
            int i;
            g();
            while (this.i.size() > 1) {
                d();
            }
            String str = this.a;
            float f = this.b;
            float f2 = this.c;
            float f3 = this.d;
            float f4 = this.e;
            C0042a c0042a = this.j;
            long j = this.f;
            int i2 = this.g;
            boolean z = this.h;
            cpd h = h(c0042a);
            synchronized (cov.a) {
                i = cov.b;
                cov.b = i + 1;
            }
            cov covVar = new cov(str, f, f2, f3, f4, h, j, i2, z, i);
            this.k = true;
            return covVar;
        }

        public final void b(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list) {
            g();
            this.i.add(new C0042a(str, f, f2, f3, f4, f5, f6, f7, list, 512));
        }

        public final void c(List list, int i, String str, cko ckoVar, float f, cko ckoVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
            g();
            f().j.add(new cpi(str, list, i, ckoVar, f, ckoVar2, f2, f3, i2, i3, f4, f5, f6, f7));
        }

        public final void d() {
            g();
            f().j.add(h((C0042a) this.i.remove(r0.size() - 1)));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class b {
    }

    public cov(String str, float f, float f2, float f3, float f4, cpd cpdVar, long j, int i, boolean z, int i2) {
        this.c = str;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = cpdVar;
        this.i = j;
        this.j = i;
        this.k = z;
        this.l = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cov)) {
            return false;
        }
        cov covVar = (cov) obj;
        if (d.F(this.c, covVar.c) && dqy.b(this.d, covVar.d) && dqy.b(this.e, covVar.e) && this.f == covVar.f && this.g == covVar.g && d.F(this.h, covVar.h) && defpackage.a.bB(this.i, covVar.i) && defpackage.a.bA(this.j, covVar.j) && this.k == covVar.k) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((this.c.hashCode() * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g)) * 31) + this.h.hashCode()) * 31) + defpackage.a.A(this.i)) * 31) + this.j) * 31) + defpackage.a.v(this.k);
    }
}
