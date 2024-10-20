package defpackage;

import defpackage.coy;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpa {
    public static final void a(List list, clr clrVar) {
        coy coyVar;
        int i;
        coy coyVar2;
        float f;
        int i2;
        coy coyVar3;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        List list2 = list;
        clr clrVar2 = clrVar;
        int a = clrVar.a();
        clrVar.l();
        clrVar2.m(a);
        if (list.isEmpty()) {
            coyVar = coy.b.a;
        } else {
            coyVar = (coy) list2.get(0);
        }
        int size = list.size();
        float f14 = brg.a;
        int i3 = 0;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        while (i3 < size) {
            coy coyVar4 = (coy) list2.get(i3);
            if (coyVar4 instanceof coy.b) {
                clrVar.c();
                i = size;
                coyVar3 = coyVar4;
                f = f14;
                i2 = i3;
                f15 = f19;
                f18 = f15;
                f16 = f20;
            } else {
                if (coyVar4 instanceof coy.n) {
                    coy.n nVar = (coy.n) coyVar4;
                    float f21 = nVar.a;
                    f17 += f21;
                    float f22 = nVar.b;
                    f18 += f22;
                    ((cke) clrVar2).a.rMoveTo(f21, f22);
                    i = size;
                    f20 = f17;
                    f19 = f18;
                } else {
                    if (coyVar4 instanceof coy.f) {
                        coy.f fVar = (coy.f) coyVar4;
                        float f23 = fVar.a;
                        float f24 = fVar.b;
                        clrVar2.f(f23, f24);
                        f18 = f24;
                        f19 = f18;
                        f17 = f23;
                        f20 = f17;
                    } else {
                        if (coyVar4 instanceof coy.m) {
                            coy.m mVar = (coy.m) coyVar4;
                            clrVar2.i(mVar.a, mVar.b);
                            f17 += mVar.a;
                            f13 = mVar.b;
                        } else if (coyVar4 instanceof coy.e) {
                            coy.e eVar = (coy.e) coyVar4;
                            clrVar2.e(eVar.a, eVar.b);
                            float f25 = eVar.a;
                            f18 = eVar.b;
                            f17 = f25;
                        } else if (coyVar4 instanceof coy.l) {
                            coy.l lVar = (coy.l) coyVar4;
                            clrVar2.i(lVar.a, f14);
                            f17 += lVar.a;
                        } else if (coyVar4 instanceof coy.d) {
                            coy.d dVar = (coy.d) coyVar4;
                            clrVar2.e(dVar.a, f18);
                            f17 = dVar.a;
                        } else if (coyVar4 instanceof coy.r) {
                            coy.r rVar = (coy.r) coyVar4;
                            clrVar2.i(f14, rVar.a);
                            f13 = rVar.a;
                        } else if (coyVar4 instanceof coy.s) {
                            coy.s sVar = (coy.s) coyVar4;
                            clrVar2.e(f17, sVar.a);
                            f18 = sVar.a;
                        } else {
                            if (coyVar4 instanceof coy.k) {
                                coy.k kVar = (coy.k) coyVar4;
                                clrVar.h(kVar.a, kVar.b, kVar.c, kVar.d, kVar.e, kVar.f);
                                f11 = kVar.c + f17;
                                f15 = kVar.d + f18;
                                f17 += kVar.e;
                                f12 = kVar.f;
                            } else {
                                if (coyVar4 instanceof coy.c) {
                                    coy.c cVar = (coy.c) coyVar4;
                                    clrVar.d(cVar.a, cVar.b, cVar.c, cVar.d, cVar.e, cVar.f);
                                    f6 = cVar.c;
                                    f15 = cVar.d;
                                    f7 = cVar.e;
                                    f8 = cVar.f;
                                } else if (coyVar4 instanceof coy.p) {
                                    if (coyVar.h) {
                                        float f26 = f18 - f15;
                                        f9 = f17 - f16;
                                        f10 = f26;
                                    } else {
                                        f9 = f14;
                                        f10 = f9;
                                    }
                                    coy.p pVar = (coy.p) coyVar4;
                                    clrVar.h(f9, f10, pVar.a, pVar.b, pVar.c, pVar.d);
                                    f11 = pVar.a + f17;
                                    f15 = pVar.b + f18;
                                    f17 += pVar.c;
                                    f12 = pVar.d;
                                } else if (coyVar4 instanceof coy.h) {
                                    if (coyVar.h) {
                                        f18 = (f18 + f18) - f15;
                                        f17 = (f17 + f17) - f16;
                                    }
                                    coy.h hVar = (coy.h) coyVar4;
                                    clrVar.d(f17, f18, hVar.a, hVar.b, hVar.c, hVar.d);
                                    f6 = hVar.a;
                                    f15 = hVar.b;
                                    f7 = hVar.c;
                                    f8 = hVar.d;
                                } else {
                                    if (coyVar4 instanceof coy.o) {
                                        coy.o oVar = (coy.o) coyVar4;
                                        clrVar2.j(oVar.a, oVar.b, oVar.c, oVar.d);
                                        f4 = oVar.a + f17;
                                        f5 = oVar.b + f18;
                                        f17 += oVar.c;
                                        f18 += oVar.d;
                                    } else if (coyVar4 instanceof coy.g) {
                                        coy.g gVar = (coy.g) coyVar4;
                                        clrVar2.g(gVar.a, gVar.b, gVar.c, gVar.d);
                                        f4 = gVar.a;
                                        f5 = gVar.b;
                                        float f27 = gVar.c;
                                        f18 = gVar.d;
                                        f17 = f27;
                                    } else {
                                        if (coyVar4 instanceof coy.q) {
                                            if (coyVar.i) {
                                                f2 = f18 - f15;
                                                f3 = f17 - f16;
                                            } else {
                                                f2 = f14;
                                                f3 = f2;
                                            }
                                            coy.q qVar = (coy.q) coyVar4;
                                            clrVar2.j(f3, f2, qVar.a, qVar.b);
                                            float f28 = f3 + f17;
                                            float f29 = f2 + f18;
                                            f17 += qVar.a;
                                            f18 += qVar.b;
                                            f16 = f28;
                                            i = size;
                                            coyVar3 = coyVar4;
                                            f = f14;
                                            i2 = i3;
                                            f15 = f29;
                                        } else if (coyVar4 instanceof coy.i) {
                                            if (coyVar.i) {
                                                f18 = (f18 + f18) - f15;
                                                f17 = (f17 + f17) - f16;
                                            }
                                            coy.i iVar = (coy.i) coyVar4;
                                            clrVar2.g(f17, f18, iVar.a, iVar.b);
                                            i = size;
                                            f16 = f17;
                                            coyVar3 = coyVar4;
                                            f = f14;
                                            i2 = i3;
                                            f17 = iVar.a;
                                            f15 = f18;
                                            f18 = iVar.b;
                                        } else {
                                            if (coyVar4 instanceof coy.j) {
                                                double d = f17;
                                                coy.j jVar = (coy.j) coyVar4;
                                                float f30 = jVar.f + f17;
                                                float f31 = jVar.g + f18;
                                                double d2 = jVar.a;
                                                double d3 = jVar.b;
                                                coyVar2 = coyVar4;
                                                double d4 = jVar.c;
                                                i2 = i3;
                                                f = brg.a;
                                                i = size;
                                                b(clrVar, d, f18, f30, f31, d2, d3, d4, jVar.d, jVar.e);
                                                f16 = f30;
                                                f17 = f16;
                                                f15 = f31;
                                                f18 = f15;
                                            } else {
                                                i = size;
                                                coyVar2 = coyVar4;
                                                f = f14;
                                                i2 = i3;
                                                if (coyVar2 instanceof coy.a) {
                                                    coy.a aVar = (coy.a) coyVar2;
                                                    coyVar3 = coyVar2;
                                                    b(clrVar, f17, f18, aVar.f, aVar.g, aVar.a, aVar.b, aVar.c, aVar.d, aVar.e);
                                                    float f32 = aVar.f;
                                                    f15 = aVar.g;
                                                    f18 = f15;
                                                    f16 = f32;
                                                }
                                            }
                                            coyVar3 = coyVar2;
                                        }
                                        i3 = i2 + 1;
                                        list2 = list;
                                        clrVar2 = clrVar;
                                        f14 = f;
                                        coyVar = coyVar3;
                                        size = i;
                                    }
                                    i = size;
                                    coyVar3 = coyVar4;
                                    f = f14;
                                    i2 = i3;
                                    float f33 = f5;
                                    f16 = f4;
                                    f15 = f33;
                                    i3 = i2 + 1;
                                    list2 = list;
                                    clrVar2 = clrVar;
                                    f14 = f;
                                    coyVar = coyVar3;
                                    size = i;
                                }
                                f17 = f7;
                                f18 = f8;
                                i = size;
                                coyVar3 = coyVar4;
                                f = f14;
                                i2 = i3;
                                f16 = f6;
                                i3 = i2 + 1;
                                list2 = list;
                                clrVar2 = clrVar;
                                f14 = f;
                                coyVar = coyVar3;
                                size = i;
                            }
                            f18 += f12;
                            f16 = f11;
                        }
                        f18 += f13;
                    }
                    i = size;
                }
                coyVar3 = coyVar4;
                f = f14;
                i2 = i3;
                i3 = i2 + 1;
                list2 = list;
                clrVar2 = clrVar;
                f14 = f;
                coyVar = coyVar3;
                size = i;
            }
            f17 = f16;
            i3 = i2 + 1;
            list2 = list;
            clrVar2 = clrVar;
            f14 = f;
            coyVar = coyVar3;
            size = i;
        }
    }

    private static final void b(clr clrVar, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        boolean z3;
        double d10;
        double d11 = d5;
        double d12 = (d7 / 180.0d) * 3.141592653589793d;
        double cos = Math.cos(d12);
        double sin = Math.sin(d12);
        double d13 = (((-d) * sin) + (d2 * cos)) / d6;
        double d14 = (((-d3) * sin) + (d4 * cos)) / d6;
        double d15 = d13 - d14;
        double d16 = ((d * cos) + (d2 * sin)) / d11;
        double d17 = ((d3 * cos) + (d4 * sin)) / d11;
        double d18 = d16 - d17;
        double d19 = (d18 * d18) + (d15 * d15);
        if (d19 != 0.0d) {
            double d20 = (1.0d / d19) - 0.25d;
            if (d20 < 0.0d) {
                double sqrt = (float) (Math.sqrt(d19) / 1.99999d);
                b(clrVar, d, d2, d3, d4, d11 * sqrt, d6 * sqrt, d7, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d20);
            double d21 = (d13 + d14) / 2.0d;
            double d22 = d18 * sqrt2;
            double d23 = (d16 + d17) / 2.0d;
            double d24 = sqrt2 * d15;
            if (z == z2) {
                d8 = d23 - d24;
                d9 = d21 + d22;
            } else {
                d8 = d23 + d24;
                d9 = d21 - d22;
            }
            double atan2 = Math.atan2(d13 - d9, d16 - d8);
            double atan22 = Math.atan2(d14 - d9, d17 - d8) - atan2;
            if (atan22 < 0.0d) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z2 != z3) {
                if (atan22 > 0.0d) {
                    d10 = -6.283185307179586d;
                } else {
                    d10 = 6.283185307179586d;
                }
                atan22 += d10;
            }
            double d25 = d8 * d11;
            double d26 = d9 * d6;
            double d27 = d25 * cos;
            double d28 = d26 * sin;
            double d29 = d25 * sin;
            double d30 = d26 * cos;
            int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
            double cos2 = Math.cos(d12);
            double sin2 = Math.sin(d12);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d31 = -d11;
            double d32 = d31 * cos2;
            double d33 = d32 * sin3;
            double d34 = d6 * sin2;
            double d35 = d34 * cos3;
            double d36 = d31 * sin2;
            double d37 = d6 * cos2;
            double d38 = (sin3 * d36) + (cos3 * d37);
            double d39 = d2;
            double d40 = d33 - d35;
            double d41 = d38;
            double d42 = atan2;
            int i = 0;
            while (i < ceil) {
                int i2 = i;
                double d43 = d42 + (atan22 / ceil);
                double sin4 = Math.sin(d43);
                double cos4 = Math.cos(d43);
                double d44 = d43 - d42;
                double tan = Math.tan(d44 / 2.0d);
                double sin5 = (Math.sin(d44) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                int i3 = ceil;
                double d45 = d39 + (d41 * sin5);
                double d46 = d29 + d30 + (d11 * sin2 * cos4) + (d37 * sin4);
                double d47 = ((d27 - d28) + ((d11 * cos2) * cos4)) - (d34 * sin4);
                d41 = (sin4 * d36) + (cos4 * d37);
                d40 = (d32 * sin4) - (d34 * cos4);
                clrVar.d((float) (d + (d40 * sin5)), (float) d45, (float) (d47 - (sin5 * d40)), (float) (d46 - (sin5 * d41)), (float) d47, (float) d46);
                i = i2 + 1;
                ceil = i3;
                d42 = d43;
                atan22 = atan22;
                d36 = d36;
                d39 = d46;
                d = d47;
                d30 = d30;
                d11 = d5;
                cos2 = cos2;
            }
        }
    }
}
