package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.diagnostics.DumpDatabaseAction;
import defpackage.cfq;
import defpackage.cga;
import defpackage.cwl;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaoc {
    public final Object a;
    public final Object b;
    public final Object c;

    public aaoc(Context context, anen anenVar, armf armfVar) {
        context.getClass();
        anenVar.getClass();
        armfVar.getClass();
        this.a = context;
        this.b = anenVar;
        this.c = armfVar;
    }

    public static final /* synthetic */ void d(aaoc aaocVar, cga cgaVar, boolean z, String str, String str2, arqg arqgVar, bwj bwjVar, int i) {
        cga cgaVar2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i & 112;
        int i7 = i | 6;
        bwj c = bwjVar.c(865086422);
        if (i6 == 0) {
            if (true != c.H(z)) {
                i5 = 16;
            } else {
                i5 = 32;
            }
            i7 |= i5;
        }
        if ((i & 896) == 0) {
            if (true != c.G(str)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i7 |= i4;
        }
        if ((i & 7168) == 0) {
            if (true != c.G(str2)) {
                i3 = 1024;
            } else {
                i3 = 2048;
            }
            i7 |= i3;
        }
        if ((57344 & i) == 0) {
            if (true != c.I(arqgVar)) {
                i2 = 8192;
            } else {
                i2 = 16384;
            }
            i7 |= i2;
        }
        if ((46811 & i7) == 9362 && c.L()) {
            c.v();
            cgaVar2 = cgaVar;
        } else {
            cga.a aVar = cga.e;
            bqv.c(amh.e(aVar, 8.0f, 4.0f), null, bmp.a(c).a, 0L, brg.a, brg.a, null, cdk.e(-1494242255, new aany(str, arqgVar, z, str2), c), c, 122);
            cgaVar2 = aVar;
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aanz(aaocVar, cgaVar2, z, str, str2, arqgVar, i, 0);
        }
    }

    public static final /* synthetic */ void e(aaoc aaocVar, bwj bwjVar, int i) {
        boolean booleanValue;
        bwj c = bwjVar.c(1448283308);
        cga.a aVar = cga.e;
        cas a = cak.a(aaocVar.i().e, c);
        gqg a2 = gei.a(aaocVar.i().f, null, c, 1);
        int i2 = cfq.a;
        cue a3 = akc.a(cfq.a.a, false);
        int a4 = bwg.a(c);
        bwk bwkVar = (bwk) c;
        byx P = bwkVar.P();
        cga b = cfv.b(c, aVar);
        int i3 = cwl.a;
        arqg arqgVar = cwl.a.a;
        c.A();
        if (bwkVar.y) {
            c.l(arqgVar);
        } else {
            c.C();
        }
        caw.b(c, a3, cwl.a.e);
        caw.b(c, P, cwl.a.d);
        arqv arqvVar = cwl.a.f;
        if (bwkVar.y || !d.F(bwkVar.T(), Integer.valueOf(a4))) {
            Integer valueOf = Integer.valueOf(a4);
            bwkVar.ad(valueOf);
            c.j(valueOf, arqvVar);
        }
        caw.b(c, b, cwl.a.c);
        akf akfVar = akf.a;
        anp.a(amh.d(cga.e, 4.0f), null, null, false, null, null, null, false, new aaoa((Object) a2, (Object) aaocVar, (Object) a, 0, (short[]) null), c, 6, 254);
        c.y(-554450895);
        booleanValue = ((Boolean) a.a()).booleanValue();
        if (booleanValue) {
            ahji.A(akfVar.a(cga.e, cfq.a.e), bmp.a(c).f, brg.a, bmp.a(c).r, 0, brg.a, c, 0, 52);
        }
        bwkVar.Y();
        c.p();
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aaob(aaocVar, i, 0);
        }
    }

    public static final void h(Context context, Uri uri, boolean z) {
        fcp fcpVar = new fcp(context, (byte[]) null);
        fcpVar.g("Share Messages db");
        fcpVar.h("application/sql");
        fcpVar.f(uri);
        Intent e = fcpVar.e();
        e.getClass();
        e.setFlags(1);
        if (z) {
            e.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        }
        akto.n(context, e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, arml] */
    private final aanw i() {
        return (aanw) this.c.a();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    private final void j(Context context, DumpDatabaseAction dumpDatabaseAction) {
        qiu.i(akul.g(dumpDatabaseAction.t()), new aakw(context, 16), this.b);
    }

    public final void a(cga cgaVar, bwj bwjVar, int i) {
        bwj c = bwjVar.c(-1170585426);
        bqv.c(cgaVar, null, bmp.a(c).p, 0L, brg.a, brg.a, null, cdk.e(1980449929, new zny(this, 14), c), c, 122);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zcj(this, cgaVar, i, 8);
        }
    }

    public final void b(bwj bwjVar, int i) {
        int i2 = i & 1;
        bwj c = bwjVar.c(-479562167);
        if (i2 == 0 && c.L()) {
            c.v();
        } else {
            ahji.e("This is the overview tab", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, c, 6, 0, 131070);
        }
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new zyu(this, i, 20);
        }
    }

    public final void c(bwj bwjVar, int i) {
        bwj c = bwjVar.c(-1502958748);
        ahfn.a(aanq.a, null, cdk.e(1994526122, new zny(this, 15), c), null, brg.a, null, null, null, c, 390, 250);
        bzz e = c.e();
        if (e != null) {
            ((bzf) e).d = new aaob(this, i, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void f(Context context, kmz kmzVar) {
        kmzVar.getClass();
        kmy kmyVar = (kmy) this.c.b();
        Context context2 = (Context) kmyVar.a.b();
        context2.getClass();
        armf armfVar = kmyVar.b;
        Map map = (Map) kmyVar.c.b();
        map.getClass();
        j(context, new DumpDatabaseAction(context2, armfVar, map, kmzVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void g(Context context, boolean z) {
        j(context, ((kmy) this.c.b()).b(z));
    }

    public aaoc(aanx aanxVar) {
        this.a = aanxVar;
        this.b = aqjn.B("Overview", "Tools");
        arml b = armd.b(3, new zzq(new zzq(aanxVar, 18), 19));
        int i = arsc.a;
        this.c = new eot(new arrh(aanw.class), new zzq(b, 20), new zwj(aanxVar, b, 14, null), new abcv(b, 1));
    }

    public aaoc(Uri uri, Set set) {
        this.a = uri;
        this.c = "rcs_migration";
        this.b = alpt.o(set);
    }

    public aaoc(String str, abqt abqtVar, abmt abmtVar) {
        d.aC(abqtVar, "Cannot construct an Api with a null ClientBuilder");
        d.aC(abmtVar, "Cannot construct an Api with a null ClientKey");
        this.c = str;
        this.a = abqtVar;
        this.b = abmtVar;
    }
}
