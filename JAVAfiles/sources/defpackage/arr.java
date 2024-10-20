package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arr {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: arr$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ ars a;
        final /* synthetic */ int b;
        final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ars arsVar, int i, Object obj) {
            super(2);
            this.a = arsVar;
            this.b = i;
            this.c = obj;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                this.a.h(this.b, this.c, bwjVar, 0);
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: arr$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ ars a;
        final /* synthetic */ Object b;
        final /* synthetic */ int c;
        final /* synthetic */ Object d;
        final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ars arsVar, Object obj, int i, Object obj2, int i2) {
            super(2);
            this.a = arsVar;
            this.b = obj;
            this.c = i;
            this.d = obj2;
            this.e = i2;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            ars arsVar = this.a;
            Object obj3 = this.b;
            int i = this.c;
            arr.a(arsVar, obj3, i, this.d, (bwj) obj, bzh.a(this.e | 1));
            return arnb.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ars arsVar, Object obj, int i, Object obj2, bwj bwjVar, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i2 & 6;
        bwj c = bwjVar.c(1439843069);
        if (i8 == 0) {
            if (true != c.G(arsVar)) {
                i7 = 2;
            } else {
                i7 = 4;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (true != c.G(obj)) {
                i6 = 16;
            } else {
                i6 = 32;
            }
            i3 |= i6;
        }
        if ((i2 & 384) == 0) {
            if (true != c.E(i)) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (true != c.G(obj2)) {
                i4 = 1024;
            } else {
                i4 = 2048;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) == 1170 && c.L()) {
            c.v();
        } else {
            obj.e(obj2, cdk.e(980966366, new AnonymousClass1(arsVar, i, obj2), c), c, 48);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass2(arsVar, obj, i, obj2, i2);
        }
    }
}
