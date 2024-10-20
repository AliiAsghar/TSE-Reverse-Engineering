package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asq {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: asq$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arps {
        int a;
        int b;
        int c;
        float d;
        float e;
        float f;
        /* synthetic */ Object g;
        int h;
        arrx i;
        arsb j;
        arrz k;
        aou l;

        public AnonymousClass1(arpe arpeVar) {
            super(arpeVar);
        }

        @Override // defpackage.arpq
        public final Object b(Object obj) {
            this.g = obj;
            this.h |= Integer.MIN_VALUE;
            return asq.b(null, 0, 0, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: asq$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqr<zq<Float, zv>, arnb> {
        final /* synthetic */ asp a;
        final /* synthetic */ int b;
        final /* synthetic */ float c;
        final /* synthetic */ arry d;
        final /* synthetic */ arrx e;
        final /* synthetic */ boolean f;
        final /* synthetic */ float g;
        final /* synthetic */ arrz h;
        final /* synthetic */ int i;
        final /* synthetic */ arsb j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(asp aspVar, int i, float f, arry arryVar, arrx arrxVar, boolean z, float f2, arrz arrzVar, int i2, arsb arsbVar) {
            super(1);
            this.a = aspVar;
            this.b = i;
            this.c = f;
            this.d = arryVar;
            this.e = arrxVar;
            this.f = z;
            this.g = f2;
            this.h = arrzVar;
            this.i = i2;
            this.j = arsbVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            int e;
            float o;
            zq zqVar = (zq) obj;
            if (!asq.a(this.a, this.b)) {
                if (this.c > brg.a) {
                    o = arrn.p(((Number) zqVar.a()).floatValue(), this.c);
                } else {
                    o = arrn.o(((Number) zqVar.a()).floatValue(), this.c);
                }
                float f = o - this.d.a;
                asp aspVar = this.a;
                int i = this.b;
                float a = aspVar.a(f);
                if (!asq.a(aspVar, i) && !asq.c(this.f, this.a, this.b)) {
                    if (f == a) {
                        this.d.a += f;
                        if (this.f) {
                            if (((Number) zqVar.a()).floatValue() > this.g) {
                                zqVar.c();
                            }
                        } else if (((Number) zqVar.a()).floatValue() < (-this.g)) {
                            zqVar.c();
                        }
                        if (this.f) {
                            if (this.h.a >= 2) {
                                int d = this.b - this.a.d();
                                int i2 = this.i;
                                if (d > i2) {
                                    this.a.f(this.b - i2);
                                }
                            }
                        } else if (this.h.a >= 2) {
                            asp aspVar2 = this.a;
                            int i3 = this.b;
                            int b = aspVar2.b() - i3;
                            int i4 = this.i;
                            if (b > i4) {
                                this.a.f(i3 + i4);
                            }
                        }
                    } else {
                        zqVar.c();
                        this.e.a = false;
                        return arnb.a;
                    }
                }
            }
            if (asq.c(this.f, this.a, this.b)) {
                this.a.f(this.b);
                this.e.a = false;
                zqVar.c();
            } else if (asq.a(this.a, this.b)) {
                asp aspVar3 = this.a;
                int i5 = this.b;
                arsb arsbVar = this.j;
                e = aspVar3.e(i5);
                throw new arc(e, (zt) arsbVar.a);
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: asq$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqr<zq<Float, zv>, arnb> {
        final /* synthetic */ float a;
        final /* synthetic */ arry b;
        final /* synthetic */ asp c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(float f, arry arryVar, asp aspVar) {
            super(1);
            this.a = f;
            this.b = arryVar;
            this.c = aspVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            float f = this.a;
            float f2 = brg.a;
            zq zqVar = (zq) obj;
            if (f > brg.a) {
                f2 = arrn.p(((Number) zqVar.a()).floatValue(), this.a);
            } else if (f < brg.a) {
                f2 = arrn.o(((Number) zqVar.a()).floatValue(), this.a);
            }
            float f3 = f2 - this.b.a;
            if (f3 != this.c.a(f3) || f2 != ((Number) zqVar.a()).floatValue()) {
                zqVar.c();
            }
            this.b.a += f3;
            return arnb.a;
        }
    }

    public static final boolean a(asp aspVar, int i) {
        int b = aspVar.b();
        if (i <= aspVar.d() && b <= i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8 A[Catch: arc -> 0x0196, TryCatch #6 {arc -> 0x0196, blocks: (B:28:0x00c4, B:30:0x00c8, B:32:0x00d7), top: B:27:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e4 A[Catch: arc -> 0x0193, TryCatch #8 {arc -> 0x0193, blocks: (B:34:0x00db, B:36:0x00e4, B:39:0x00f6, B:42:0x0125), top: B:33:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0176 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0208 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x006f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0174 -> B:21:0x0177). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.asp r31, int r32, int r33, defpackage.dqv r34, defpackage.arpe r35) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asq.b(asp, int, int, dqv, arpe):java.lang.Object");
    }

    public static final boolean c(boolean z, asp aspVar, int i) {
        if (z) {
            if (aspVar.b() <= i) {
                if (aspVar.b() != i || aspVar.c() <= 0) {
                    return false;
                }
                return true;
            }
        } else if (aspVar.b() >= i) {
            if (aspVar.b() != i || aspVar.c() >= 0) {
                return false;
            }
            return true;
        }
        return true;
    }
}
