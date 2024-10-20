package defpackage;

import defpackage.ajt;
import defpackage.cnr;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bij extends biz {
    public final ve a;

    /* compiled from: PG */
    /* renamed from: bij$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arpw implements arqv<arwe, arpe<? super arnb>, Object> {
        int a;
        final /* synthetic */ bio b;
        final /* synthetic */ bij c;
        final /* synthetic */ ajt.b d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(bio bioVar, bij bijVar, ajt.b bVar, arpe arpeVar) {
            super(2, arpeVar);
            this.b = bioVar;
            this.c = bijVar;
            this.d = bVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            return ((AnonymousClass1) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            arpl arplVar = arpl.a;
            try {
                if (this.a != 0) {
                    aqil.P(obj);
                } else {
                    aqil.P(obj);
                    bio bioVar = this.b;
                    this.a = 1;
                    if (bioVar.a(this) == arplVar) {
                        return arplVar;
                    }
                }
                bij bijVar = this.c;
                bijVar.a.g(this.d);
                cwy.a(this.c);
                return arnb.a;
            } catch (Throwable th) {
                bij bijVar2 = this.c;
                bijVar2.a.g(this.d);
                cwy.a(this.c);
                throw th;
            }
        }

        @Override // defpackage.arpq
        public final arpe c(Object obj, arpe arpeVar) {
            return new AnonymousClass1(this.b, this.c, this.d, arpeVar);
        }
    }

    public bij(ajq ajqVar, boolean z, float f, ckx ckxVar, arqg arqgVar) {
        super(ajqVar, z, f, ckxVar, arqgVar);
        this.a = new ve((byte[]) null);
    }

    @Override // defpackage.biz
    public final void a(ajt.b bVar, long j, float f) {
        cjn cjnVar;
        int i;
        ve veVar = this.a;
        Object[] objArr = veVar.b;
        Object[] objArr2 = veVar.c;
        long[] jArr = veVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j2) < 128) {
                            int i5 = (i2 << 3) + i4;
                            ((bio) objArr2[i5]).b();
                        }
                        j2 >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        boolean z = ((biz) this).c;
        if (z) {
            cjnVar = new cjn(bVar.a);
        } else {
            cjnVar = null;
        }
        bio bioVar = new bio(cjnVar, f, z);
        this.a.j(bVar, bioVar);
        arrn.J(B(), null, null, new AnonymousClass1(bioVar, this, bVar, null), 3);
        cwy.a(this);
    }

    @Override // defpackage.biz
    public final void d(cny cnyVar) {
        float f;
        long[] jArr;
        Object[] objArr;
        Object[] objArr2;
        int i;
        float f2;
        long[] jArr2;
        Object[] objArr3;
        Object[] objArr4;
        long f3;
        float floatValue;
        long f4;
        float f5 = ((bin) this.d.a()).d;
        if (f5 != brg.a) {
            ve veVar = this.a;
            Object[] objArr5 = veVar.b;
            Object[] objArr6 = veVar.c;
            long[] jArr3 = veVar.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr3[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = (~(i2 - length)) >>> 31;
                        int i4 = 0;
                        while (true) {
                            i = 8 - i3;
                            if (i4 >= i) {
                                break;
                            }
                            if ((255 & j) < 128) {
                                int i5 = (i2 << 3) + i4;
                                Object obj = objArr5[i5];
                                bio bioVar = (bio) objArr6[i5];
                                f3 = ckw.f(cku.d(r14), cku.c(r14), cku.b(r14), f5, cku.f(h()));
                                if (bioVar.d == null) {
                                    long o = cnyVar.o();
                                    bioVar.d = Float.valueOf(Math.max(cjt.c(o), cjt.a(o)) * 0.3f);
                                }
                                if (bioVar.a == null) {
                                    f2 = f5;
                                    bioVar.a = new cjn(cnyVar.a());
                                } else {
                                    f2 = f5;
                                }
                                if (bioVar.e == null) {
                                    bioVar.e = new cjn(a.z(cjt.c(cnyVar.o()) / 2.0f, cjt.a(cnyVar.o()) / 2.0f));
                                }
                                if (((Boolean) bioVar.j.a()).booleanValue() && !((Boolean) bioVar.i.a()).booleanValue()) {
                                    floatValue = 1.0f;
                                } else {
                                    floatValue = ((Number) bioVar.f.d()).floatValue();
                                }
                                Float f6 = bioVar.d;
                                f6.getClass();
                                jArr2 = jArr3;
                                float b = drv.b(f6.floatValue(), bioVar.b, ((Number) bioVar.g.d()).floatValue());
                                cjn cjnVar = bioVar.a;
                                cjnVar.getClass();
                                float b2 = cjn.b(cjnVar.a);
                                cjn cjnVar2 = bioVar.e;
                                cjnVar2.getClass();
                                objArr3 = objArr5;
                                float b3 = drv.b(b2, cjn.b(cjnVar2.a), ((Number) bioVar.h.d()).floatValue());
                                cjn cjnVar3 = bioVar.a;
                                cjnVar3.getClass();
                                float c = cjn.c(cjnVar3.a);
                                cjn cjnVar4 = bioVar.e;
                                cjnVar4.getClass();
                                objArr4 = objArr6;
                                float b4 = drv.b(c, cjn.c(cjnVar4.a), ((Number) bioVar.h.d()).floatValue());
                                float a = cku.a(f3);
                                long z = a.z(b3, b4);
                                f4 = ckw.f(cku.d(f3), cku.c(f3), cku.b(f3), a * floatValue, cku.f(f3));
                                if (bioVar.c) {
                                    float c2 = cjt.c(cnyVar.o());
                                    float a2 = cjt.a(cnyVar.o());
                                    cnu q = cnyVar.q();
                                    long a3 = q.a();
                                    q.b().l();
                                    try {
                                        ((cnr.AnonymousClass1) q).a.b(brg.a, brg.a, c2, a2, 1);
                                        cnw.g(cnyVar, f4, b, z, null, 120);
                                    } finally {
                                        q.b().j();
                                        q.h(a3);
                                    }
                                } else {
                                    cnw.g(cnyVar, f4, b, z, null, 120);
                                }
                            } else {
                                f2 = f5;
                                jArr2 = jArr3;
                                objArr3 = objArr5;
                                objArr4 = objArr6;
                            }
                            j >>= 8;
                            i4++;
                            f5 = f2;
                            objArr5 = objArr3;
                            jArr3 = jArr2;
                            objArr6 = objArr4;
                        }
                        f = f5;
                        jArr = jArr3;
                        objArr2 = objArr6;
                        objArr = objArr5;
                        if (i != 8) {
                            return;
                        }
                    } else {
                        f = f5;
                        jArr = jArr3;
                        objArr = objArr5;
                        objArr2 = objArr6;
                    }
                    if (i2 != length) {
                        i2++;
                        f5 = f;
                        objArr5 = objArr;
                        jArr3 = jArr;
                        objArr6 = objArr2;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.biz
    public final void e(ajt.b bVar) {
        bio bioVar = (bio) this.a.a(bVar);
        if (bioVar != null) {
            bioVar.b();
        }
    }

    @Override // cga.c
    public final void s() {
        this.a.i();
    }
}
