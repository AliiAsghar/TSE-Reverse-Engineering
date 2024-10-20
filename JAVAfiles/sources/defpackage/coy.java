package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class coy {
    public final boolean h;
    public final boolean i;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a extends coy {
        public final float a;
        public final float b;
        public final float c;
        public final boolean d;
        public final boolean e;
        public final float f;
        public final float g;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(float r3, float r4, float r5, boolean r6, boolean r7, float r8, float r9) {
            /*
                r2 = this;
                r0 = 0
                r1 = 3
                r2.<init>(r0, r0, r1)
                r2.a = r3
                r2.b = r4
                r2.c = r5
                r2.d = r6
                r2.e = r7
                r2.f = r8
                r2.g = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: coy.a.<init>(float, float, float, boolean, boolean, float, float):void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && Float.compare(this.c, aVar.c) == 0 && this.d == aVar.d && this.e == aVar.e && Float.compare(this.f, aVar.f) == 0 && Float.compare(this.g, aVar.g) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int floatToIntBits = (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
            float f = this.f;
            return (((((((floatToIntBits * 31) + defpackage.a.v(this.d)) * 31) + defpackage.a.v(this.e)) * 31) + Float.floatToIntBits(f)) * 31) + Float.floatToIntBits(this.g);
        }

        public final String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.a + ", verticalEllipseRadius=" + this.b + ", theta=" + this.c + ", isMoreThanHalf=" + this.d + ", isPositiveArc=" + this.e + ", arcStartX=" + this.f + ", arcStartY=" + this.g + ')';
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class b extends coy {
        public static final b a = new b();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private b() {
            /*
                r2 = this;
                r0 = 0
                r1 = 3
                r2.<init>(r0, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: coy.b.<init>():void");
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class c extends coy {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        public c(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2);
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = f5;
            this.f = f6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (Float.compare(this.a, cVar.a) == 0 && Float.compare(this.b, cVar.b) == 0 && Float.compare(this.c, cVar.c) == 0 && Float.compare(this.d, cVar.d) == 0 && Float.compare(this.e, cVar.e) == 0 && Float.compare(this.f, cVar.f) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (((((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f);
        }

        public final String toString() {
            return "CurveTo(x1=" + this.a + ", y1=" + this.b + ", x2=" + this.c + ", y2=" + this.d + ", x3=" + this.e + ", y3=" + this.f + ')';
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class d extends coy {
        public final float a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public d(float r3) {
            /*
                r2 = this;
                r0 = 0
                r1 = 3
                r2.<init>(r0, r0, r1)
                r2.a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: coy.d.<init>(float):void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && Float.compare(this.a, ((d) obj).a) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.a);
        }

        public final String toString() {
            return "HorizontalTo(x=" + this.a + ')';
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class e extends coy {
        public final float a;
        public final float b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public e(float r3, float r4) {
            /*
                r2 = this;
                r0 = 0
                r1 = 3
                r2.<init>(r0, r0, r1)
                r2.a = r3
                r2.b = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: coy.e.<init>(float, float):void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (Float.compare(this.a, eVar.a) == 0 && Float.compare(this.b, eVar.b) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
        }

        public final String toString() {
            return "LineTo(x=" + this.a + ", y=" + this.b + ')';
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class f extends coy {
        public final float a;
        public final float b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public f(float r3, float r4) {
            /*
                r2 = this;
                r0 = 0
                r1 = 3
                r2.<init>(r0, r0, r1)
                r2.a = r3
                r2.b = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: coy.f.<init>(float, float):void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (Float.compare(this.a, fVar.a) == 0 && Float.compare(this.b, fVar.b) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
        }

        public final String toString() {
            return "MoveTo(x=" + this.a + ", y=" + this.b + ')';
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class g extends coy {
        public final float a;
        public final float b;
        public final float c;
        public final float d;

        public g(float f, float f2, float f3, float f4) {
            super(false, true, true ? 1 : 0);
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (Float.compare(this.a, gVar.a) == 0 && Float.compare(this.b, gVar.b) == 0 && Float.compare(this.c, gVar.c) == 0 && Float.compare(this.d, gVar.d) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
        }

        public final String toString() {
            return "QuadTo(x1=" + this.a + ", y1=" + this.b + ", x2=" + this.c + ", y2=" + this.d + ')';
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class h extends coy {
        public final float a;
        public final float b;
        public final float c;
        public final float d;

        public h(float f, float f2, float f3, float f4) {
            super(true, false, 2);
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (Float.compare(this.a, hVar.a) == 0 && Float.compare(this.b, hVar.b) == 0 && Float.compare(this.c, hVar.c) == 0 && Float.compare(this.d, hVar.d) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
        }

        public final String toString() {
            return "ReflectiveCurveTo(x1=" + this.a + ", y1=" + this.b + ", x2=" + this.c + ", y2=" + this.d + ')';
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class i extends coy {
        public final float a;
        public final float b;

        public i(float f, float f2) {
            super(false, true, true ? 1 : 0);
            this.a = f;
            this.b = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (Float.compare(this.a, iVar.a) == 0 && Float.compare(this.b, iVar.b) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
        }

        public final String toString() {
            return "ReflectiveQuadTo(x=" + this.a + ", y=" + this.b + ')';
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class j extends coy {
        public final float a;
        public final float b;
        public final float c;
        public final boolean d;
        public final boolean e;
        public final float f;
        public final float g;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public j(float r3, float r4, float r5, boolean r6, boolean r7, float r8, float r9) {
            /*
                r2 = this;
                r0 = 0
                r1 = 3
                r2.<init>(r0, r0, r1)
                r2.a = r3
                r2.b = r4
                r2.c = r5
                r2.d = r6
                r2.e = r7
                r2.f = r8
                r2.g = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: coy.j.<init>(float, float, float, boolean, boolean, float, float):void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            if (Float.compare(this.a, jVar.a) == 0 && Float.compare(this.b, jVar.b) == 0 && Float.compare(this.c, jVar.c) == 0 && this.d == jVar.d && this.e == jVar.e && Float.compare(this.f, jVar.f) == 0 && Float.compare(this.g, jVar.g) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int floatToIntBits = (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
            float f = this.f;
            return (((((((floatToIntBits * 31) + defpackage.a.v(this.d)) * 31) + defpackage.a.v(this.e)) * 31) + Float.floatToIntBits(f)) * 31) + Float.floatToIntBits(this.g);
        }

        public final String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.a + ", verticalEllipseRadius=" + this.b + ", theta=" + this.c + ", isMoreThanHalf=" + this.d + ", isPositiveArc=" + this.e + ", arcStartDx=" + this.f + ", arcStartDy=" + this.g + ')';
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class k extends coy {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final float f;

        public k(float f, float f2, float f3, float f4, float f5, float f6) {
            super(true, false, 2);
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = f5;
            this.f = f6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (Float.compare(this.a, kVar.a) == 0 && Float.compare(this.b, kVar.b) == 0 && Float.compare(this.c, kVar.c) == 0 && Float.compare(this.d, kVar.d) == 0 && Float.compare(this.e, kVar.e) == 0 && Float.compare(this.f, kVar.f) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (((((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f);
        }

        public final String toString() {
            return "RelativeCurveTo(dx1=" + this.a + ", dy1=" + this.b + ", dx2=" + this.c + ", dy2=" + this.d + ", dx3=" + this.e + ", dy3=" + this.f + ')';
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class l extends coy {
        public final float a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public l(float r3) {
            /*
                r2 = this;
                r0 = 0
                r1 = 3
                r2.<init>(r0, r0, r1)
                r2.a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: coy.l.<init>(float):void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof l) && Float.compare(this.a, ((l) obj).a) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.a);
        }

        public final String toString() {
            return "RelativeHorizontalTo(dx=" + this.a + ')';
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class m extends coy {
        public final float a;
        public final float b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public m(float r3, float r4) {
            /*
                r2 = this;
                r0 = 0
                r1 = 3
                r2.<init>(r0, r0, r1)
                r2.a = r3
                r2.b = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: coy.m.<init>(float, float):void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            if (Float.compare(this.a, mVar.a) == 0 && Float.compare(this.b, mVar.b) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
        }

        public final String toString() {
            return "RelativeLineTo(dx=" + this.a + ", dy=" + this.b + ')';
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class n extends coy {
        public final float a;
        public final float b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public n(float r3, float r4) {
            /*
                r2 = this;
                r0 = 0
                r1 = 3
                r2.<init>(r0, r0, r1)
                r2.a = r3
                r2.b = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: coy.n.<init>(float, float):void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            if (Float.compare(this.a, nVar.a) == 0 && Float.compare(this.b, nVar.b) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
        }

        public final String toString() {
            return "RelativeMoveTo(dx=" + this.a + ", dy=" + this.b + ')';
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class o extends coy {
        public final float a;
        public final float b;
        public final float c;
        public final float d;

        public o(float f, float f2, float f3, float f4) {
            super(false, true, true ? 1 : 0);
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            if (Float.compare(this.a, oVar.a) == 0 && Float.compare(this.b, oVar.b) == 0 && Float.compare(this.c, oVar.c) == 0 && Float.compare(this.d, oVar.d) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
        }

        public final String toString() {
            return "RelativeQuadTo(dx1=" + this.a + ", dy1=" + this.b + ", dx2=" + this.c + ", dy2=" + this.d + ')';
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class p extends coy {
        public final float a;
        public final float b;
        public final float c;
        public final float d;

        public p(float f, float f2, float f3, float f4) {
            super(true, false, 2);
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            if (Float.compare(this.a, pVar.a) == 0 && Float.compare(this.b, pVar.b) == 0 && Float.compare(this.c, pVar.c) == 0 && Float.compare(this.d, pVar.d) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
        }

        public final String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.a + ", dy1=" + this.b + ", dx2=" + this.c + ", dy2=" + this.d + ')';
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class q extends coy {
        public final float a;
        public final float b;

        public q(float f, float f2) {
            super(false, true, true ? 1 : 0);
            this.a = f;
            this.b = f2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            if (Float.compare(this.a, qVar.a) == 0 && Float.compare(this.b, qVar.b) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
        }

        public final String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.a + ", dy=" + this.b + ')';
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class r extends coy {
        public final float a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public r(float r3) {
            /*
                r2 = this;
                r0 = 0
                r1 = 3
                r2.<init>(r0, r0, r1)
                r2.a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: coy.r.<init>(float):void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof r) && Float.compare(this.a, ((r) obj).a) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.a);
        }

        public final String toString() {
            return "RelativeVerticalTo(dy=" + this.a + ')';
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class s extends coy {
        public final float a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public s(float r3) {
            /*
                r2 = this;
                r0 = 0
                r1 = 3
                r2.<init>(r0, r0, r1)
                r2.a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: coy.s.<init>(float):void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof s) && Float.compare(this.a, ((s) obj).a) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.a);
        }

        public final String toString() {
            return "VerticalTo(y=" + this.a + ')';
        }
    }

    public /* synthetic */ coy(boolean z, boolean z2, int i2) {
        boolean z3;
        if (1 != ((z ? 1 : 0) & ((i2 & 1) ^ 1))) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.h = z3;
        this.i = ((i2 & 2) == 0) & z2;
    }
}
