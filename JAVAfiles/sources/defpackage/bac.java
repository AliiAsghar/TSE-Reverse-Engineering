package defpackage;

import androidx.compose.foundation.HoverableElement;
import androidx.compose.ui.input.pointer.PointerHoverIconModifierElement;
import defpackage.bwj;
import defpackage.cqx;
import defpackage.dhv;
import defpackage.dhz;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bac {
    public final byn a = new byu(null, cav.a);
    public dhv b;
    public final cez c;
    private final dhv d;

    /* compiled from: PG */
    /* renamed from: bac$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<dhv.c<? extends dhv.a>, List<? extends dhv.c<? extends dhv.a>>> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            dhv.c cVar = (dhv.c) obj;
            Object obj2 = cVar.a;
            if (obj2 instanceof dhz) {
                obj2.getClass();
            }
            return aqjn.A(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bac$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqr<dho, arnb> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            dhn dhnVar = dhh.a;
            ((dho) obj).c(dhh.w, arnb.a);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bac$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqg<arnb> {
        final /* synthetic */ dhv.c a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(dhv.c cVar) {
            super(0);
            this.a = cVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            dhz dhzVar = (dhz) this.a.a;
            if (!(dhzVar instanceof dhz.b)) {
                if (dhzVar instanceof dhz.a) {
                    dhzVar.b();
                }
            } else {
                dhzVar.b();
                try {
                    throw null;
                } catch (IllegalArgumentException unused) {
                }
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: bac$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(int i) {
            super(2);
            this.b = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.b | 1);
            bac.this.b((bwj) obj, a);
            return arnb.a;
        }
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public bac(dhv dhvVar) {
        dhv.c a;
        this.d = dhvVar;
        AnonymousClass1 anonymousClass1 = AnonymousClass1.a;
        dhv.b bVar = new dhv.b(dhvVar);
        List list = bVar.c;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a = ((dhv.b.a) list.get(i)).a(Integer.MIN_VALUE);
            ?? a2 = anonymousClass1.a(a);
            ArrayList arrayList2 = new ArrayList(a2.size());
            int size2 = a2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList2.add(dhv.b.a.C0046a.a((dhv.c) a2.get(i2)));
            }
            aqjn.S(arrayList, arrayList2);
        }
        bVar.c.clear();
        bVar.c.addAll(arrayList);
        this.b = bVar.b();
        this.c = new cez();
    }

    public final diy a() {
        return (diy) this.a.a();
    }

    public final void b(bwj bwjVar, int i) {
        int i2;
        diy a;
        clr n;
        float f;
        int i3;
        cga cgaVar;
        cga c;
        cga a2;
        cga a3;
        int i4;
        int i5 = i & 6;
        bwj c2 = bwjVar.c(1154651354);
        if (i5 == 0) {
            if (true != c2.I(this)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c2.L()) {
            c2.v();
        } else {
            def defVar = (def) c2.g(dch.l);
            dhv dhvVar = this.b;
            List e = dhvVar.e(dhvVar.a());
            int size = e.size();
            int i6 = 0;
            while (i6 < size) {
                dhv.c cVar = (dhv.c) e.get(i6);
                bad badVar = null;
                if (!new bae(this).a().booleanValue() || (a = a()) == null) {
                    i3 = i6;
                    n = null;
                } else {
                    n = a.n(cVar.b, cVar.c);
                    cjp l = a.l(cVar.b);
                    int i7 = cVar.c - 1;
                    int i8 = cVar.b;
                    cjp l2 = a.l(i7);
                    if (a.g(i8) == a.g(cVar.c)) {
                        f = Math.min(l2.b, l.b);
                    } else {
                        f = brg.a;
                    }
                    float f2 = l.c;
                    long floatToRawIntBits = Float.floatToRawIntBits(f);
                    int floatToRawIntBits2 = Float.floatToRawIntBits(f2);
                    i3 = i6;
                    n.n(((floatToRawIntBits2 & 4294967295L) | (floatToRawIntBits << 32)) ^ (-9223372034707292160L));
                }
                if (n != null) {
                    badVar = new bad(n);
                }
                if (badVar == null || (cgaVar = chk.a(cga.e, badVar)) == null) {
                    cgaVar = cga.e;
                }
                bwk bwkVar = (bwk) c2;
                Object T = bwkVar.T();
                if (T == bwj.a.a) {
                    T = new ajs();
                    bwkVar.ad(T);
                }
                ajr ajrVar = (ajr) T;
                c = dhb.c(cgaVar, false, AnonymousClass2.a);
                a2 = c.a(new bak(new bab(this, cVar.b, cVar.c))).a(new HoverableElement(ajrVar));
                int i9 = cqx.b;
                a3 = a2.a(new PointerHoverIconModifierElement(cqx.a.b));
                boolean I = c2.I(this) | c2.G(cVar) | c2.I(defVar);
                Object T2 = bwkVar.T();
                if (I || T2 == bwj.a.a) {
                    T2 = new AnonymousClass3(cVar);
                    bwkVar.ad(T2);
                }
                akc.b(adw.e(a3, ajrVar, null, false, null, null, null, (arqg) T2, 508), c2, 0);
                c2.y(680162897);
                ((dhz) cVar.a).a();
                bwkVar.Y();
                i6 = i3 + 1;
            }
        }
        bzz e2 = c2.e();
        if (e2 != null) {
            ((bzf) e2).d = new AnonymousClass4(i);
        }
    }
}
