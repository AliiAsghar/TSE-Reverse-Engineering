package defpackage;

import defpackage.ara;

/* compiled from: PG */
/* loaded from: classes.dex */
final class apl implements apk {
    public final api a;
    private final aqr b;
    private final arv c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: apl$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i) {
            super(2);
            this.b = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                apl aplVar = apl.this;
                int i = this.b;
                ara.a a = aplVar.a.b.a(i);
                ((aph) a.c).b.a(apq.a, Integer.valueOf(i - a.a), bwjVar, 6);
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: apl$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ int b;
        final /* synthetic */ Object c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i, Object obj, int i2) {
            super(2);
            this.b = i;
            this.c = obj;
            this.d = i2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.d | 1);
            apl.this.h(this.b, this.c, (bwj) obj, a);
            return arnb.a;
        }
    }

    public apl(aqr aqrVar, api apiVar, arv arvVar) {
        this.b = aqrVar;
        this.a = apiVar;
        this.c = arvVar;
    }

    @Override // defpackage.apk
    public final tv a() {
        return tw.a;
    }

    @Override // defpackage.apk
    public final aqq b() {
        return this.a.a;
    }

    @Override // defpackage.apk
    public final arv c() {
        return this.c;
    }

    @Override // defpackage.ars
    public final int d(Object obj) {
        return this.c.a(obj);
    }

    @Override // defpackage.ars
    public final int e() {
        return this.a.d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apl)) {
            return false;
        }
        return d.F(this.a, ((apl) obj).a);
    }

    @Override // defpackage.ars
    public final Object f(int i) {
        return this.a.e(i);
    }

    @Override // defpackage.ars
    public final Object g(int i) {
        Object b = this.c.b(i);
        if (b == null) {
            return this.a.f(i);
        }
        return b;
    }

    @Override // defpackage.ars
    public final void h(int i, Object obj, bwj bwjVar, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i2 & 6;
        bwj c = bwjVar.c(1493551140);
        if (i7 == 0) {
            if (true != c.E(i)) {
                i6 = 2;
            } else {
                i6 = 4;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (true != c.I(obj)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            if (true != c.G(this)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i3 |= i4;
        }
        if ((i3 & 147) == 146 && c.L()) {
            c.v();
        } else {
            ask.a(obj, i, this.b.m, cdk.e(726189336, new AnonymousClass1(i), c), c, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass2(i, obj, i2);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
