package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdj implements cdi {
    public final boolean a;
    public Object b;
    public bze c;
    public List d;
    private final int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cdj$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class AnonymousClass1 extends arrd implements arqv<bwj, Integer, arnb> {
        public AnonymousClass1(Object obj) {
            super(2, obj, cdj.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            int intValue = ((Number) obj2).intValue();
            ((cdj) this.b).b((bwj) obj, intValue);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cdj$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ Object b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Object obj, int i) {
            super(2);
            this.b = obj;
            this.c = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.c) | 1;
            cdj.this.c(this.b, (bwj) obj, a);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cdj$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ Object b;
        final /* synthetic */ Object c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Object obj, Object obj2, int i) {
            super(2);
            this.b = obj;
            this.c = obj2;
            this.d = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.d) | 1;
            cdj.this.d(this.b, this.c, (bwj) obj, a);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cdj$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ Object b;
        final /* synthetic */ Object c;
        final /* synthetic */ Object d;
        final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Object obj, Object obj2, Object obj3, int i) {
            super(2);
            this.b = obj;
            this.c = obj2;
            this.d = obj3;
            this.e = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            cdj.this.e(this.b, this.c, this.d, (bwj) obj, bzh.a(this.e) | 1);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cdj$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ Object b;
        final /* synthetic */ Object c;
        final /* synthetic */ Object d;
        final /* synthetic */ Object e;
        final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Object obj, Object obj2, Object obj3, Object obj4, int i) {
            super(2);
            this.b = obj;
            this.c = obj2;
            this.d = obj3;
            this.e = obj4;
            this.f = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            cdj.this.g(this.b, this.c, this.d, this.e, (bwj) obj, bzh.a(this.f) | 1);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: cdj$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ Object b;
        final /* synthetic */ Object c;
        final /* synthetic */ Object d;
        final /* synthetic */ Object e;
        final /* synthetic */ Object f;
        final /* synthetic */ int g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
            super(2);
            this.b = obj;
            this.c = obj2;
            this.d = obj3;
            this.e = obj4;
            this.f = obj5;
            this.g = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            cdj.this.h(this.b, this.c, this.d, this.e, this.f, (bwj) obj, bzh.a(this.g) | 1);
            return arnb.a;
        }
    }

    public cdj(int i, boolean z, Object obj) {
        this.e = i;
        this.a = z;
        this.b = obj;
    }

    private final void j(bwj bwjVar) {
        bzf R;
        if (this.a && (R = ((bwk) bwjVar).R()) != null) {
            R.o();
            if (cdk.d(this.c, R)) {
                this.c = R;
                return;
            }
            List list = this.d;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.d = arrayList;
                arrayList.add(R);
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (cdk.d((bze) list.get(i), R)) {
                    list.set(i, R);
                    return;
                }
            }
            list.add(R);
        }
    }

    @Override // defpackage.arqv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return b((bwj) obj, ((Number) obj2).intValue());
    }

    public final Object b(bwj bwjVar, int i) {
        int c;
        bwj c2 = bwjVar.c(this.e);
        j(c2);
        if (c2.G(this)) {
            c = cdk.b(0);
        } else {
            c = cdk.c(0);
        }
        int i2 = i | c;
        Object obj = this.b;
        obj.getClass();
        arsd.g(obj, 2);
        Object a = ((arqv) obj).a(c2, Integer.valueOf(i2));
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass1(this);
        }
        return a;
    }

    public final Object c(Object obj, bwj bwjVar, int i) {
        int c;
        bwj c2 = bwjVar.c(this.e);
        j(c2);
        if (c2.G(this)) {
            c = cdk.b(1);
        } else {
            c = cdk.c(1);
        }
        Object obj2 = this.b;
        obj2.getClass();
        arsd.g(obj2, 3);
        Object a = ((arqw) obj2).a(obj, c2, Integer.valueOf(c | i));
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass2(obj, i);
        }
        return a;
    }

    public final Object d(Object obj, Object obj2, bwj bwjVar, int i) {
        int c;
        bwj c2 = bwjVar.c(this.e);
        j(c2);
        if (c2.G(this)) {
            c = cdk.b(2);
        } else {
            c = cdk.c(2);
        }
        Object obj3 = this.b;
        obj3.getClass();
        arsd.g(obj3, 4);
        Object a = ((arqx) obj3).a(obj, obj2, c2, Integer.valueOf(c | i));
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass3(obj, obj2, i);
        }
        return a;
    }

    public final Object e(Object obj, Object obj2, Object obj3, bwj bwjVar, int i) {
        int c;
        bwj c2 = bwjVar.c(this.e);
        j(c2);
        if (c2.G(this)) {
            c = cdk.b(3);
        } else {
            c = cdk.c(3);
        }
        Object obj4 = this.b;
        obj4.getClass();
        arsd.g(obj4, 5);
        Object f = ((arqy) obj4).f(obj, obj2, obj3, c2, Integer.valueOf(c | i));
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass4(obj, obj2, obj3, i);
        }
        return f;
    }

    @Override // defpackage.arqy
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return e(obj, obj2, obj3, (bwj) obj4, ((Number) obj5).intValue());
    }

    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, bwj bwjVar, int i) {
        int c;
        bwj c2 = bwjVar.c(this.e);
        j(c2);
        if (c2.G(this)) {
            c = cdk.b(4);
        } else {
            c = cdk.c(4);
        }
        Object obj5 = this.b;
        obj5.getClass();
        arsd.g(obj5, 6);
        Object a = ((arqz) obj5).a(obj, obj2, obj3, obj4, c2, Integer.valueOf(c | i));
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass5(obj, obj2, obj3, obj4, i);
        }
        return a;
    }

    public final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, bwj bwjVar, int i) {
        int c;
        bwj c2 = bwjVar.c(this.e);
        j(c2);
        if (c2.G(this)) {
            c = cdk.b(5);
        } else {
            c = cdk.c(5);
        }
        Object obj6 = this.b;
        obj6.getClass();
        arsd.g(obj6, 7);
        Object i2 = ((arra) obj6).i(obj, obj2, obj3, obj4, obj5, c2, Integer.valueOf(i | c));
        bzz e = c2.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass6(obj, obj2, obj3, obj4, obj5, i);
        }
        return i2;
    }

    @Override // defpackage.arra
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return h(obj, obj2, obj3, obj4, obj5, (bwj) obj6, ((Number) obj7).intValue());
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return c(obj, (bwj) obj2, ((Number) obj3).intValue());
    }

    @Override // defpackage.arqx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        return d(obj, obj2, (bwj) obj3, ((Number) obj4).intValue());
    }

    @Override // defpackage.arqz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return g(obj, obj2, obj3, obj4, (bwj) obj5, ((Number) obj6).intValue());
    }
}
