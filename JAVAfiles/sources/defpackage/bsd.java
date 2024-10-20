package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsd {
    public static final ceh a = cdx.a(AnonymousClass1.a, AnonymousClass2.a);
    public float b;
    private final byj c;
    private final byj d;

    /* compiled from: PG */
    /* renamed from: bsd$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqv<cek, bsd, List<? extends Float>> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            bsd bsdVar = (bsd) obj2;
            return aqjn.B(Float.valueOf(bsdVar.b), Float.valueOf(bsdVar.c()), Float.valueOf(bsdVar.b()));
        }
    }

    /* compiled from: PG */
    /* renamed from: bsd$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<List<? extends Float>, bsd> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            List list = (List) obj;
            return new bsd(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
        }
    }

    public bsd(float f, float f2, float f3) {
        this.b = f;
        this.c = new byr(f3);
        this.d = new byr(f2);
    }

    public final float a() {
        if (this.b == brg.a) {
            return brg.a;
        }
        return c() / this.b;
    }

    public final float b() {
        return this.c.b();
    }

    public final float c() {
        return this.d.b();
    }

    public final void d(float f) {
        this.c.d(f);
    }

    public final void e(float f) {
        this.d.d(arrn.q(f, this.b, brg.a));
    }
}
