package defpackage;

import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import com.android.vcard.VCardConfig;
import defpackage.bca;
import defpackage.bwj;
import defpackage.cwl;
import defpackage.dli;
import defpackage.dqs;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awp {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awp$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ String a;
        final /* synthetic */ cga b;
        final /* synthetic */ dje c;
        final /* synthetic */ arqr d;
        final /* synthetic */ int e;
        final /* synthetic */ boolean f;
        final /* synthetic */ int g;
        final /* synthetic */ int h;
        final /* synthetic */ ckx i;
        final /* synthetic */ int j;
        final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, cga cgaVar, dje djeVar, arqr arqrVar, int i, boolean z, int i2, int i3, ckx ckxVar, int i4, int i5) {
            super(2);
            this.a = str;
            this.b = cgaVar;
            this.c = djeVar;
            this.d = arqrVar;
            this.e = i;
            this.f = z;
            this.g = i2;
            this.h = i3;
            this.i = ckxVar;
            this.j = i4;
            this.k = i5;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            awp.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (bwj) obj, bzh.a(this.j | 1), this.k);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awp$10, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass10 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ cga a;
        final /* synthetic */ dhv b;
        final /* synthetic */ arqr c;
        final /* synthetic */ boolean d;
        final /* synthetic */ Map e;
        final /* synthetic */ dje f;
        final /* synthetic */ int g;
        final /* synthetic */ boolean h;
        final /* synthetic */ int i;
        final /* synthetic */ int j;
        final /* synthetic */ dli.a k;
        final /* synthetic */ bbw l;
        final /* synthetic */ arqr m;
        final /* synthetic */ int n;
        final /* synthetic */ int o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(cga cgaVar, dhv dhvVar, arqr arqrVar, boolean z, Map map, dje djeVar, int i, boolean z2, int i2, int i3, dli.a aVar, bbw bbwVar, arqr arqrVar2, int i4, int i5) {
            super(2);
            this.a = cgaVar;
            this.b = dhvVar;
            this.c = arqrVar;
            this.d = z;
            this.e = map;
            this.f = djeVar;
            this.g = i;
            this.h = z2;
            this.i = i2;
            this.j = i3;
            this.k = aVar;
            this.l = bbwVar;
            this.m = arqrVar2;
            this.n = i4;
            this.o = i5;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int i = this.n;
            int i2 = this.o;
            int a = bzh.a(i | 1);
            int a2 = bzh.a(i2);
            awp.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (bwj) obj, a, a2);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awp$11, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass11 extends arrp implements arqr<List<? extends cjp>, arnb> {
        final /* synthetic */ byn a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(byn bynVar) {
            super(1);
            this.a = bynVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            byn bynVar = this.a;
            List list = (List) obj;
            if (bynVar != null) {
                bynVar.h(list);
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awp$12, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass12 extends arrp implements arqg<dhv> {
        final /* synthetic */ bac a;
        final /* synthetic */ dhv b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass12(bac bacVar, dhv dhvVar) {
            super(0);
            this.a = bacVar;
            this.b = dhvVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            dhv dhvVar;
            bac bacVar = this.a;
            if (bacVar != null) {
                if (bacVar.c.isEmpty()) {
                    dhvVar = bacVar.b;
                } else {
                    ayo ayoVar = new ayo(bacVar.b);
                    cez cezVar = bacVar.c;
                    int a = cezVar.a();
                    for (int i = 0; i < a; i++) {
                        ((arqr) cezVar.get(i)).a(ayoVar);
                    }
                    dhvVar = ayoVar.b;
                }
                bacVar.b = dhvVar;
                if (dhvVar != null) {
                    return dhvVar;
                }
            }
            return this.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awp$13, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass13 extends arrp implements arqg<dhv> {
        final /* synthetic */ dhv a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass13(dhv dhvVar) {
            super(0);
            this.a = dhvVar;
        }

        @Override // defpackage.arqg
        public final /* synthetic */ Object a() {
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awp$14, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass14 extends arrp implements arqv<cek, Long, Long> {
        final /* synthetic */ bes a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass14(bes besVar) {
            super(2);
            this.a = besVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            long longValue = ((Number) obj2).longValue();
            if (bev.a(this.a, longValue)) {
                return Long.valueOf(longValue);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awp$15, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass15 extends arrp implements arqr<Long, Long> {
        public static final AnonymousClass15 a = new AnonymousClass15();

        public AnonymousClass15() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            return Long.valueOf(((Number) obj).longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awp$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends arrp implements arqr<bca.a, arnb> {
        final /* synthetic */ byn a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(byn bynVar) {
            super(1);
            this.a = bynVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            dhv dhvVar;
            bca.a aVar = (bca.a) obj;
            if (aVar.c) {
                dhvVar = aVar.b;
            } else {
                dhvVar = aVar.a;
            }
            this.a.h(dhvVar);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awp$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ dhv a;
        final /* synthetic */ cga b;
        final /* synthetic */ dje c;
        final /* synthetic */ arqr d;
        final /* synthetic */ int e;
        final /* synthetic */ boolean f;
        final /* synthetic */ int g;
        final /* synthetic */ int h;
        final /* synthetic */ Map i;
        final /* synthetic */ int j;
        final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(dhv dhvVar, cga cgaVar, dje djeVar, arqr arqrVar, int i, boolean z, int i2, int i3, Map map, int i4, int i5) {
            super(2);
            this.a = dhvVar;
            this.b = cgaVar;
            this.c = djeVar;
            this.d = arqrVar;
            this.e = i;
            this.f = z;
            this.g = i2;
            this.h = i3;
            this.i = map;
            this.j = i4;
            this.k = i5;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            awp.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (bwj) obj, bzh.a(this.j | 1), this.k);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awp$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends arrp implements arqg<Long> {
        final /* synthetic */ bes a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(bes besVar) {
            super(0);
            this.a = besVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return Long.valueOf(this.a.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awp$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends arrp implements arqg<Long> {
        final /* synthetic */ bes a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(bes besVar) {
            super(0);
            this.a = besVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return Long.valueOf(this.a.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awp$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass6 extends arrp implements arqr<diy, arnb> {
        final /* synthetic */ bac a;
        final /* synthetic */ arqr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(bac bacVar, arqr arqrVar) {
            super(1);
            this.a = bacVar;
            this.b = arqrVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            bac bacVar = this.a;
            diy diyVar = (diy) obj;
            if (bacVar != null) {
                bacVar.a.h(diyVar);
            }
            arqr arqrVar = this.b;
            if (arqrVar != null) {
                arqrVar.a(diyVar);
            }
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awp$7, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass7 extends arrp implements arqg<Boolean> {
        final /* synthetic */ bac a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(bac bacVar) {
            super(0);
            this.a = bacVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            boolean z;
            bac bacVar = this.a;
            if (bacVar != null) {
                z = new bae(bacVar).a().booleanValue();
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awp$8, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass8 extends arrp implements arqg<Boolean> {
        final /* synthetic */ bac a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(bac bacVar) {
            super(0);
            this.a = bacVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            boolean z;
            bac bacVar = this.a;
            if (bacVar != null) {
                z = new bae(bacVar).a().booleanValue();
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: awp$9, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass9 extends arrp implements arqg<List<? extends cjp>> {
        final /* synthetic */ byn a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(byn bynVar) {
            super(0);
            this.a = bynVar;
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            byn bynVar = this.a;
            if (bynVar != null) {
                return (List) bynVar.a();
            }
            return null;
        }
    }

    public static final List a(List list, arqg arqgVar) {
        baj bajVar;
        if (((Boolean) arqgVar.a()).booleanValue()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                cuc cucVar = (cuc) list.get(i);
                Object f = cucVar.f();
                f.getClass();
                bab babVar = (bab) ((bak) f).a;
                diy a = babVar.a.a();
                if (a == null) {
                    bajVar = new baj(0, 0, bag.a);
                } else {
                    drg b = drh.b(a.n(babVar.b, babVar.c).b());
                    bajVar = new baj(b.b(), b.a(), new baf(b));
                }
                int i2 = bajVar.b;
                int i3 = bajVar.a;
                arrayList.add(new armo(cucVar.e(dqs.a.b(i3, i3, i2, i2)), bajVar.c));
            }
            return arrayList;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0198, code lost:
    
        if (r1 == bwj.a.a) goto L138;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r34, defpackage.cga r35, defpackage.dje r36, defpackage.arqr r37, int r38, boolean r39, int r40, int r41, defpackage.ckx r42, defpackage.bwj r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awp.b(java.lang.String, cga, dje, arqr, int, boolean, int, int, ckx, bwj, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0247 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(defpackage.dhv r40, defpackage.cga r41, defpackage.dje r42, defpackage.arqr r43, int r44, boolean r45, int r46, int r47, java.util.Map r48, defpackage.bwj r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 919
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awp.c(dhv, cga, dje, arqr, int, boolean, int, int, java.util.Map, bwj, int, int):void");
    }

    public static final void d(cga cgaVar, dhv dhvVar, arqr arqrVar, boolean z, Map map, dje djeVar, int i, boolean z2, int i2, int i3, dli.a aVar, bbw bbwVar, arqr arqrVar2, bwj bwjVar, int i4, int i5) {
        int i6;
        int i7;
        boolean z3;
        bac bacVar;
        arqg arqgVar;
        armo armoVar;
        arqr arqrVar3;
        byn bynVar;
        Object bahVar;
        int i8 = i4 & 6;
        bwj c = bwjVar.c(645129368);
        if (i8 == 0) {
            i6 = (true != c.G(cgaVar) ? 2 : 4) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= true != c.G(dhvVar) ? 16 : 32;
        }
        if ((i4 & 384) == 0) {
            i6 |= true != c.I(arqrVar) ? 128 : 256;
        }
        if ((i4 & 3072) == 0) {
            i6 |= true != c.H(z) ? 1024 : 2048;
        }
        if ((i4 & 24576) == 0) {
            i6 |= true != c.I(map) ? 8192 : 16384;
        }
        if ((196608 & i4) == 0) {
            i6 |= true != c.G(djeVar) ? 65536 : 131072;
        }
        if ((1572864 & i4) == 0) {
            i6 |= true != c.E(i) ? 524288 : 1048576;
        }
        if ((12582912 & i4) == 0) {
            i6 |= true != c.H(z2) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i4) == 0) {
            i6 |= true != c.E(i2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i4) == 0) {
            i6 |= true != c.E(i3) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if ((i5 & 6) == 0) {
            i7 = (true != c.I(aVar) ? 2 : 4) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= true != c.I(bbwVar) ? 16 : 32;
        }
        if ((i5 & 384) == 0) {
            z3 = true;
            i7 |= true != c.I(null) ? 128 : 256;
        } else {
            z3 = true;
        }
        if ((i5 & 3072) == 0) {
            i7 |= z3 == c.I(arqrVar2) ? 2048 : 1024;
        }
        if ((306783379 & i6) == 306783378 && (i7 & 1171) == 1170 && c.L()) {
            c.v();
        } else {
            int i9 = i6 & 112;
            c.y(-297056792);
            if (bcb.a(dhvVar)) {
                bwk bwkVar = (bwk) c;
                Object T = bwkVar.T();
                if (i9 == 32 || T == bwj.a.a) {
                    T = new bac(dhvVar);
                    bwkVar.ad(T);
                }
                bacVar = (bac) T;
            } else {
                bacVar = null;
            }
            bwk bwkVar2 = (bwk) c;
            bwkVar2.Y();
            if (bcb.a(dhvVar)) {
                c.y(-618542215);
                boolean G = (i9 == 32) | c.G(bacVar);
                Object T2 = bwkVar2.T();
                if (G || T2 == bwj.a.a) {
                    T2 = new AnonymousClass12(bacVar, dhvVar);
                    bwkVar2.ad(T2);
                }
                arqgVar = (arqg) T2;
                bwkVar2.Y();
            } else {
                c.y(-618444937);
                Object T3 = bwkVar2.T();
                if (i9 == 32 || T3 == bwj.a.a) {
                    T3 = new AnonymousClass13(dhvVar);
                    bwkVar2.ad(T3);
                }
                arqgVar = (arqg) T3;
                bwkVar2.Y();
            }
            if (z) {
                armoVar = awm.a;
            } else {
                armoVar = new armo(null, null);
            }
            Object obj = armoVar.b;
            List list = (List) armoVar.a;
            List list2 = (List) obj;
            c.y(-297034976);
            if (z) {
                Object T4 = bwkVar2.T();
                if (T4 == bwj.a.a) {
                    arqrVar3 = null;
                    byu byuVar = new byu(null, cav.a);
                    bwkVar2.ad(byuVar);
                    T4 = byuVar;
                } else {
                    arqrVar3 = null;
                }
                bynVar = (byn) T4;
            } else {
                arqrVar3 = null;
                bynVar = null;
            }
            bwkVar2.Y();
            c.y(-297029137);
            if (z) {
                boolean G2 = c.G(bynVar);
                Object T5 = bwkVar2.T();
                if (G2 || T5 == bwj.a.a) {
                    T5 = new AnonymousClass11(bynVar);
                    bwkVar2.ad(T5);
                }
                arqrVar3 = (arqr) T5;
            }
            arqr arqrVar4 = arqrVar3;
            bwkVar2.Y();
            dhv dhvVar2 = (dhv) arqgVar.a();
            boolean I = c.I(bacVar) | ((i6 & 896) == 256);
            Object T6 = bwkVar2.T();
            if (I || T6 == bwj.a.a) {
                T6 = new AnonymousClass6(bacVar, arqrVar);
                bwkVar2.ad(T6);
            }
            cga f = f(cgaVar, dhvVar2, djeVar, (arqr) T6, i, z2, i2, i3, aVar, list, arqrVar4, bbwVar, null, arqrVar2);
            if (!z) {
                c.y(-616776083);
                boolean I2 = c.I(bacVar);
                Object T7 = bwkVar2.T();
                if (I2 || T7 == bwj.a.a) {
                    T7 = new AnonymousClass7(bacVar);
                    bwkVar2.ad(T7);
                }
                bahVar = new aye((arqg) T7);
                bwkVar2.Y();
            } else {
                c.y(-616599352);
                boolean I3 = c.I(bacVar);
                Object T8 = bwkVar2.T();
                if (I3 || T8 == bwj.a.a) {
                    T8 = new AnonymousClass8(bacVar);
                    bwkVar2.ad(T8);
                }
                arqg arqgVar2 = (arqg) T8;
                boolean G3 = c.G(bynVar);
                Object T9 = bwkVar2.T();
                if (G3 || T9 == bwj.a.a) {
                    T9 = new AnonymousClass9(bynVar);
                    bwkVar2.ad(T9);
                }
                bahVar = new bah(arqgVar2, (arqg) T9);
                bwkVar2.Y();
            }
            int a = bwg.a(c);
            byx P = bwkVar2.P();
            cga b = cfv.b(c, f);
            int i10 = cwl.a;
            arqg arqgVar3 = cwl.a.a;
            c.A();
            if (bwkVar2.y) {
                c.l(arqgVar3);
            } else {
                c.C();
            }
            caw.b(c, bahVar, cwl.a.e);
            caw.b(c, P, cwl.a.d);
            arqv arqvVar = cwl.a.f;
            if (bwkVar2.y || !d.F(bwkVar2.T(), Integer.valueOf(a))) {
                Object valueOf = Integer.valueOf(a);
                bwkVar2.ad(valueOf);
                c.j(valueOf, arqvVar);
            }
            caw.b(c, b, cwl.a.c);
            c.y(537579196);
            if (bacVar != null) {
                bacVar.b(c, 0);
            }
            bwkVar2.Y();
            c.y(537580834);
            if (list2 != null) {
                awm.a(dhvVar, list2, c, (i6 >> 3) & 14);
            }
            bwkVar2.Y();
            c.p();
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new AnonymousClass10(cgaVar, dhvVar, arqrVar, z, map, djeVar, i, z2, i2, i3, aVar, bbwVar, arqrVar2, i4, i5);
        }
    }

    private static final ceh e(bes besVar) {
        return new cej(new AnonymousClass14(besVar), AnonymousClass15.a);
    }

    private static final cga f(cga cgaVar, dhv dhvVar, dje djeVar, arqr arqrVar, int i, boolean z, int i2, int i3, dli.a aVar, List list, arqr arqrVar2, bbw bbwVar, ckx ckxVar, arqr arqrVar3) {
        if (bbwVar == null) {
            return cgaVar.a(cga.e).a(new TextAnnotatedStringElement(dhvVar, djeVar, aVar, arqrVar, i, z, i2, i3, list, arqrVar2, ckxVar, arqrVar3));
        }
        return cgaVar.a(bbwVar.f).a(new SelectableTextAnnotatedStringElement(dhvVar, djeVar, aVar, arqrVar, i, z, i2, i3, list, arqrVar2, bbwVar, ckxVar));
    }
}
