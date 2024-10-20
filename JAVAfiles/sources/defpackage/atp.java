package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atp extends avc {
    public static final ceh a = cdx.a(AnonymousClass1.a, AnonymousClass2.a);
    public final byn b;

    /* compiled from: PG */
    /* renamed from: atp$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqv<cek, atp, List<? extends Object>> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            atp atpVar = (atp) obj2;
            return aqjn.B(Integer.valueOf(atpVar.j()), Float.valueOf(arrn.q(atpVar.c(), -0.5f, 0.5f)), Integer.valueOf(atpVar.b()));
        }
    }

    /* compiled from: PG */
    /* renamed from: atp$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<List, atp> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            List list = (List) obj;
            Object obj2 = list.get(0);
            obj2.getClass();
            int intValue = ((Integer) obj2).intValue();
            Object obj3 = list.get(1);
            obj3.getClass();
            return new atp(intValue, ((Float) obj3).floatValue(), new atq(list));
        }
    }

    public atp(int i, float f, arqg arqgVar) {
        super(i, f);
        this.b = new byu(arqgVar, cav.a);
    }

    @Override // defpackage.avc
    public final int b() {
        return ((Number) ((arqg) this.b.a()).a()).intValue();
    }
}
