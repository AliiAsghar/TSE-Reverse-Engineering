package defpackage;

import defpackage.bwj;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ceb implements cea {
    public static final ceh a = new cej(AnonymousClass1.a, AnonymousClass2.a);
    public final Map b;
    public cee c;
    public final ve d;

    /* compiled from: PG */
    /* renamed from: ceb$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqv<cek, ceb, Map<Object, Map<String, ? extends List<? extends Object>>>> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* synthetic */ Object a(Object obj, Object obj2) {
            int i;
            ceb cebVar = (ceb) obj2;
            Map s = aqjn.s(cebVar.b);
            ve veVar = cebVar.d;
            Object[] objArr = veVar.c;
            long[] jArr = veVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = i2 - length;
                        int i4 = 0;
                        while (true) {
                            i = 8 - ((~i3) >>> 31);
                            if (i4 >= i) {
                                break;
                            }
                            if ((255 & j) < 128) {
                                ((a) objArr[(i2 << 3) + i4]).a(s);
                            }
                            j >>= 8;
                            i4++;
                        }
                        if (i != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            if (s.isEmpty()) {
                return null;
            }
            return s;
        }
    }

    /* compiled from: PG */
    /* renamed from: ceb$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<Map<Object, Map<String, ? extends List<? extends Object>>>, ceb> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            return new ceb((Map) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ceb$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqr<bxi, bxh> {
        final /* synthetic */ Object b;
        final /* synthetic */ a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Object obj, a aVar) {
            super(1);
            this.b = obj;
            this.c = aVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            boolean e = ve.e(ceb.this.d, this.b);
            Object obj2 = this.b;
            if (!e) {
                ceb.this.b.remove(obj2);
                ceb cebVar = ceb.this;
                cebVar.d.j(this.b, this.c);
                return new cec(this.c, ceb.this, this.b);
            }
            throw new IllegalArgumentException(defpackage.a.cc(obj2, "Key ", " was used multiple times "));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: ceb$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ Object b;
        final /* synthetic */ arqv c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Object obj, arqv arqvVar, int i) {
            super(2);
            this.b = obj;
            this.c = arqvVar;
            this.d = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.d | 1);
            ceb.this.e(this.b, this.c, (bwj) obj, a);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public boolean a = true;
        public final cee b;
        private final Object d;

        /* compiled from: PG */
        /* renamed from: ceb$a$1, reason: invalid class name */
        /* loaded from: classes.dex */
        static final class AnonymousClass1 extends arrp implements arqr<Object, Boolean> {
            final /* synthetic */ ceb a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ceb cebVar) {
                super(1);
                this.a = cebVar;
            }

            @Override // defpackage.arqr
            public final /* bridge */ /* synthetic */ Object a(Object obj) {
                boolean z;
                cee ceeVar = this.a.c;
                if (ceeVar != null) {
                    z = ceeVar.g(obj);
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }

        public a(Object obj) {
            this.d = obj;
            this.b = new cef((Map) ceb.this.b.get(obj), new AnonymousClass1(ceb.this));
        }

        public final void a(Map map) {
            if (this.a) {
                Map d = this.b.d();
                if (d.isEmpty()) {
                    map.remove(this.d);
                } else {
                    map.put(this.d, d);
                }
            }
        }
    }

    public ceb() {
        this((byte[]) null);
    }

    @Override // defpackage.cea
    public final void e(Object obj, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 6;
        bwj c = bwjVar.c(-1198538093);
        if (i6 == 0) {
            if (true != c.I(obj)) {
                i5 = 2;
            } else {
                i5 = 4;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c.I(arqvVar)) {
                i4 = 16;
            } else {
                i4 = 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (true != c.I(this)) {
                i3 = 128;
            } else {
                i3 = 256;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c.L()) {
            c.v();
        } else {
            c.M(obj);
            bwk bwkVar = (bwk) c;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                cee ceeVar = this.c;
                if (ceeVar != null && !ceeVar.g(obj)) {
                    throw new IllegalArgumentException(defpackage.a.cc(obj, "Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle."));
                }
                T = new a(obj);
                bwkVar.ad(T);
            }
            a aVar = (a) T;
            bwx.a(ceg.a.c(aVar.b), arqvVar, c, (i2 & 112) | 8);
            arnb arnbVar = arnb.a;
            boolean I = c.I(this) | c.I(obj) | c.I(aVar);
            Object T2 = bwkVar.T();
            if (I || T2 == bwj.a.a) {
                T2 = new AnonymousClass3(obj, aVar);
                bwkVar.ad(T2);
            }
            bxl.c(arnbVar, (arqr) T2, c);
            c.s();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass4(obj, arqvVar, i);
        }
    }

    @Override // defpackage.cea
    public final void f(Object obj) {
        a aVar = (a) this.d.a(obj);
        if (aVar != null) {
            aVar.a = false;
        } else {
            this.b.remove(obj);
        }
    }

    public ceb(Map map) {
        this.b = map;
        this.d = new ve((byte[]) null);
    }

    public /* synthetic */ ceb(byte[] bArr) {
        this(new LinkedHashMap());
    }
}
