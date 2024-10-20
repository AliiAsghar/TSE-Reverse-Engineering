package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.armj;
import defpackage.arnb;
import defpackage.arqg;
import defpackage.arqr;
import defpackage.arqv;
import defpackage.arrp;
import defpackage.bwj;
import defpackage.bwk;
import defpackage.bwx;
import defpackage.bxh;
import defpackage.bxi;
import defpackage.bxj;
import defpackage.bxl;
import defpackage.byn;
import defpackage.byu;
import defpackage.bzc;
import defpackage.bzd;
import defpackage.bzf;
import defpackage.bzh;
import defpackage.bzz;
import defpackage.cat;
import defpackage.cav;
import defpackage.cdk;
import defpackage.cee;
import defpackage.cef;
import defpackage.ceg;
import defpackage.dai;
import defpackage.dbi;
import defpackage.dbk;
import defpackage.dbl;
import defpackage.dbn;
import defpackage.dbo;
import defpackage.dbx;
import defpackage.dch;
import defpackage.dcl;
import defpackage.dcn;
import defpackage.dco;
import defpackage.dcp;
import defpackage.dfu;
import defpackage.dfx;
import defpackage.dgk;
import defpackage.enm;
import defpackage.epa;
import defpackage.gjy;
import defpackage.gjz;
import defpackage.iba;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {
    public static final bzc a = new bxj(cav.a, AnonymousClass1.a);
    public static final bzc b = new cat(AnonymousClass2.a);
    public static final bzc c = new cat(AnonymousClass3.a);
    public static final bzc d = new cat(AnonymousClass4.a);
    public static final bzc e = new cat(AnonymousClass5.a);
    public static final bzc f = new cat(AnonymousClass6.a);

    /* compiled from: PG */
    /* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<Configuration> {
        public static final AnonymousClass1 a = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            AndroidCompositionLocals_androidKt.b("LocalConfiguration");
            throw new armj();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$10, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass10 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ dai a;
        final /* synthetic */ arqv b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(dai daiVar, arqv arqvVar, int i) {
            super(2);
            this.a = daiVar;
            this.b = arqvVar;
            this.c = i;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            int a = bzh.a(this.c | 1);
            AndroidCompositionLocals_androidKt.a(this.a, this.b, (bwj) obj, a);
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqg<Context> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            AndroidCompositionLocals_androidKt.b("LocalContext");
            throw new armj();
        }
    }

    /* compiled from: PG */
    /* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqg<dfu> {
        public static final AnonymousClass3 a = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
            throw new armj();
        }
    }

    /* compiled from: PG */
    /* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$4, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass4 extends arrp implements arqg<dfx> {
        public static final AnonymousClass4 a = new AnonymousClass4();

        public AnonymousClass4() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
            throw new armj();
        }
    }

    /* compiled from: PG */
    /* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$5, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass5 extends arrp implements arqg<gjz> {
        public static final AnonymousClass5 a = new AnonymousClass5();

        public AnonymousClass5() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            AndroidCompositionLocals_androidKt.b("LocalSavedStateRegistryOwner");
            throw new armj();
        }
    }

    /* compiled from: PG */
    /* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$6, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass6 extends arrp implements arqg<View> {
        public static final AnonymousClass6 a = new AnonymousClass6();

        public AnonymousClass6() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            AndroidCompositionLocals_androidKt.b("LocalView");
            throw new armj();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$7, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass7 extends arrp implements arqr<Configuration, arnb> {
        final /* synthetic */ byn a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(byn bynVar) {
            super(1);
            this.a = bynVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            Configuration configuration = new Configuration((Configuration) obj);
            bzc bzcVar = AndroidCompositionLocals_androidKt.a;
            this.a.h(configuration);
            return arnb.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$8, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass8 extends arrp implements arqr<bxi, bxh> {
        final /* synthetic */ dcl a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(dcl dclVar) {
            super(1);
            this.a = dclVar;
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return new dbi(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$9, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass9 extends arrp implements arqv<bwj, Integer, arnb> {
        final /* synthetic */ dai a;
        final /* synthetic */ dbx b;
        final /* synthetic */ arqv c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(dai daiVar, dbx dbxVar, arqv arqvVar) {
            super(2);
            this.a = daiVar;
            this.b = dbxVar;
            this.c = arqvVar;
        }

        @Override // defpackage.arqv
        public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
            bwj bwjVar = (bwj) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && bwjVar.L()) {
                bwjVar.v();
            } else {
                dch.a(this.a, this.b, this.c, bwjVar, 0);
            }
            return arnb.a;
        }
    }

    public static final void a(dai daiVar, arqv arqvVar, bwj bwjVar, int i) {
        int i2;
        boolean z;
        dgk dgkVar;
        String str;
        LinkedHashMap linkedHashMap;
        boolean z2;
        int i3;
        int i4;
        int i5 = i & 6;
        bwj c2 = bwjVar.c(1396852028);
        if (i5 == 0) {
            if (true != c2.I(daiVar)) {
                i4 = 2;
            } else {
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (true != c2.I(arqvVar)) {
                i3 = 16;
            } else {
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c2.L()) {
            c2.v();
        } else {
            Context context = daiVar.getContext();
            bwk bwkVar = (bwk) c2;
            Object T = bwkVar.T();
            if (T == bwj.a.a) {
                byu byuVar = new byu(new Configuration(context.getResources().getConfiguration()), cav.a);
                bwkVar.ad(byuVar);
                T = byuVar;
            }
            byn bynVar = (byn) T;
            Object T2 = bwkVar.T();
            if (T2 == bwj.a.a) {
                T2 = new AnonymousClass7(bynVar);
                bwkVar.ad(T2);
            }
            daiVar.p = (arqr) T2;
            Object T3 = bwkVar.T();
            if (T3 == bwj.a.a) {
                T3 = new dbx();
                bwkVar.ad(T3);
            }
            dbx dbxVar = (dbx) T3;
            dai.b C = daiVar.C();
            if (C != null) {
                Object T4 = bwkVar.T();
                if (T4 == bwj.a.a) {
                    gjz gjzVar = C.b;
                    int i6 = dcp.a;
                    Object parent = daiVar.getParent();
                    parent.getClass();
                    View view = (View) parent;
                    Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                    if (tag instanceof String) {
                        str = (String) tag;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = String.valueOf(view.getId());
                    }
                    String str2 = cee.class.getSimpleName() + ':' + str;
                    iba aK = gjzVar.aK();
                    Bundle b2 = aK.b(str2);
                    if (b2 != null) {
                        linkedHashMap = new LinkedHashMap();
                        for (String str3 : b2.keySet()) {
                            ArrayList parcelableArrayList = b2.getParcelableArrayList(str3);
                            parcelableArrayList.getClass();
                            linkedHashMap.put(str3, parcelableArrayList);
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    final cef cefVar = new cef(linkedHashMap, dco.a);
                    try {
                        aK.c(str2, new gjy() { // from class: dcm
                            @Override // defpackage.gjy
                            public final Bundle a() {
                                ArrayList<? extends Parcelable> arrayList;
                                int i7 = dcp.a;
                                Map d2 = cee.this.d();
                                Bundle bundle = new Bundle();
                                for (Map.Entry entry : d2.entrySet()) {
                                    String str4 = (String) entry.getKey();
                                    List list = (List) entry.getValue();
                                    if (list instanceof ArrayList) {
                                        arrayList = (ArrayList) list;
                                    } else {
                                        arrayList = new ArrayList<>(list);
                                    }
                                    bundle.putParcelableArrayList(str4, arrayList);
                                }
                                return bundle;
                            }
                        });
                        z2 = true;
                    } catch (IllegalArgumentException unused) {
                        z2 = false;
                    }
                    dcl dclVar = new dcl(cefVar, new dcn(z2, aK, str2));
                    bwkVar.ad(dclVar);
                    T4 = dclVar;
                }
                dcl dclVar2 = (dcl) T4;
                arnb arnbVar = arnb.a;
                boolean I = c2.I(dclVar2);
                Object T5 = bwkVar.T();
                if (I || T5 == bwj.a.a) {
                    T5 = new AnonymousClass8(dclVar2);
                    bwkVar.ad(T5);
                }
                bxl.c(arnbVar, (arqr) T5, c2);
                Configuration c3 = c(bynVar);
                Object T6 = bwkVar.T();
                if (T6 == bwj.a.a) {
                    T6 = new dfu();
                    bwkVar.ad(T6);
                }
                dfu dfuVar = (dfu) T6;
                Object T7 = bwkVar.T();
                Object obj = T7;
                if (T7 == bwj.a.a) {
                    Configuration configuration = new Configuration();
                    if (c3 != null) {
                        configuration.setTo(c3);
                    }
                    bwkVar.ad(configuration);
                    obj = configuration;
                }
                Configuration configuration2 = (Configuration) obj;
                Object T8 = bwkVar.T();
                if (T8 == bwj.a.a) {
                    T8 = new dbl(configuration2, dfuVar);
                    bwkVar.ad(T8);
                }
                dbl dblVar = (dbl) T8;
                boolean I2 = c2.I(context);
                Object T9 = bwkVar.T();
                if (I2 || T9 == bwj.a.a) {
                    T9 = new dbk(context, dblVar);
                    bwkVar.ad(T9);
                }
                bxl.c(dfuVar, (arqr) T9, c2);
                Object T10 = bwkVar.T();
                if (T10 == bwj.a.a) {
                    T10 = new dfx();
                    bwkVar.ad(T10);
                }
                dfx dfxVar = (dfx) T10;
                Object T11 = bwkVar.T();
                if (T11 == bwj.a.a) {
                    T11 = new dbo(dfxVar);
                    bwkVar.ad(T11);
                }
                dbo dboVar = (dbo) T11;
                boolean I3 = c2.I(context);
                Object T12 = bwkVar.T();
                if (I3 || T12 == bwj.a.a) {
                    T12 = new dbn(context, dboVar);
                    bwkVar.ad(T12);
                }
                bxl.c(dfxVar, (arqr) T12, c2);
                boolean booleanValue = ((Boolean) c2.g(dch.p)).booleanValue();
                if (Build.VERSION.SDK_INT >= 31 && (dgkVar = daiVar.N) != null) {
                    z = ((Boolean) dgkVar.a.a()).booleanValue();
                } else {
                    z = false;
                }
                bwx.b(new bzd[]{a.c(c(bynVar)), b.c(context), epa.a.c(C.a), e.c(C.b), ceg.a.c(dclVar2), f.c(daiVar), c.c(dfuVar), d.c(dfxVar), dch.p.c(Boolean.valueOf(booleanValue | z))}, cdk.e(1471621628, new AnonymousClass9(daiVar, dbxVar, arqvVar), c2), c2, 56);
            } else {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
        }
        bzz e2 = c2.e();
        if (e2 != null) {
            ((bzf) e2).d = new AnonymousClass10(daiVar, arqvVar, i);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(a.bW(str, "CompositionLocal ", " not present"));
    }

    private static final Configuration c(byn bynVar) {
        return (Configuration) bynVar.a();
    }

    public static final bzc<enm> getLocalLifecycleOwner() {
        return epa.a;
    }
}
