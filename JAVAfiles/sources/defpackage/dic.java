package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dic implements dih {
    public final dhv a;
    public final List b;
    public final List d;
    public final arml c = armd.b(3, new AnonymousClass2());
    private final arml e = armd.b(3, new AnonymousClass1());

    /* compiled from: PG */
    /* renamed from: dic$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<Float> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            Object obj;
            float f;
            List list = dic.this.d;
            if (list.isEmpty()) {
                obj = null;
            } else {
                Object obj2 = list.get(0);
                float a = ((dig) obj2).a.a();
                int z = aqjn.z(list);
                if (z > 0) {
                    int i = 1;
                    while (true) {
                        Object obj3 = list.get(i);
                        float a2 = ((dig) obj3).a.a();
                        int compare = Float.compare(a, a2);
                        if (compare < 0) {
                            a = a2;
                        }
                        if (compare < 0) {
                            obj2 = obj3;
                        }
                        if (i == z) {
                            break;
                        }
                        i++;
                    }
                }
                obj = obj2;
            }
            dig digVar = (dig) obj;
            if (digVar != null) {
                f = digVar.a.a();
            } else {
                f = brg.a;
            }
            return Float.valueOf(f);
        }
    }

    /* compiled from: PG */
    /* renamed from: dic$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqg<Float> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            Object obj;
            float f;
            List list = dic.this.d;
            if (list.isEmpty()) {
                obj = null;
            } else {
                Object obj2 = list.get(0);
                float b = ((dig) obj2).a.b();
                int z = aqjn.z(list);
                if (z > 0) {
                    int i = 1;
                    while (true) {
                        Object obj3 = list.get(i);
                        float b2 = ((dig) obj3).a.b();
                        int compare = Float.compare(b, b2);
                        if (compare < 0) {
                            b = b2;
                        }
                        if (compare < 0) {
                            obj2 = obj3;
                        }
                        if (i == z) {
                            break;
                        }
                        i++;
                    }
                }
                obj = obj2;
            }
            dig digVar = (dig) obj;
            if (digVar != null) {
                f = digVar.a.b();
            } else {
                f = brg.a;
            }
            return Float.valueOf(f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public dic(defpackage.dhv r32, defpackage.dje r33, java.util.List r34, defpackage.dqv r35, dli.a r36) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dic.<init>(dhv, dje, java.util.List, dqv, dli$a):void");
    }

    @Override // defpackage.dih
    public final float a() {
        return ((Number) this.e.a()).floatValue();
    }

    @Override // defpackage.dih
    public final float b() {
        throw null;
    }

    @Override // defpackage.dih
    public final boolean c() {
        List list = this.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((dig) list.get(i)).a.c()) {
                return true;
            }
        }
        return false;
    }
}
