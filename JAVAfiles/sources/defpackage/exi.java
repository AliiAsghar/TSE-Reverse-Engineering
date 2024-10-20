package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exi implements esk {
    public static final /* synthetic */ int m = 0;
    public final eqp a;
    public final EGLDisplay b;
    public final eyb c;
    public final ezc d;
    public final esj e;
    public final boolean f;
    public final exo g;
    public volatile boolean j;
    public final aqws k;
    public apuv l;
    private final Context n;
    private boolean o;
    private final eqd q;
    private volatile eqo r;
    private final List p = new ArrayList();
    public final Object i = new Object();
    public final List h = new ArrayList();

    static {
        erf.b("media3.effect");
    }

    public exi(Context context, eqp eqpVar, EGLDisplay eGLDisplay, eyb eybVar, ezc ezcVar, esj esjVar, exo exoVar, boolean z, eqd eqdVar) {
        this.n = context;
        this.a = eqpVar;
        this.b = eGLDisplay;
        this.c = eybVar;
        this.d = ezcVar;
        this.e = esjVar;
        this.f = z;
        this.q = eqdVar;
        this.g = exoVar;
        aqws aqwsVar = new aqws((char[]) null);
        this.k = aqwsVar;
        aqwsVar.h();
        gop gopVar = new gop(this, esjVar, ezcVar);
        exoVar.f.g();
        exoVar.s = gopVar;
    }

    public static Pair i(eqp eqpVar, EGLDisplay eGLDisplay, int i, int[] iArr) {
        EGLContext a = eqpVar.a(eGLDisplay, i, iArr);
        return Pair.create(a, eqpVar.c(a, eGLDisplay));
    }

    @Override // defpackage.esk
    public final int a() {
        eyb eybVar = this.c;
        if (eybVar.b()) {
            return eybVar.a().a();
        }
        return 0;
    }

    @Override // defpackage.esk
    public final Surface b() {
        eyb eybVar = this.c;
        dzg.d(eul.S(eybVar.f, 1));
        return ((eya) eybVar.f.get(1)).a.i();
    }

    @Override // defpackage.esk
    public final void c(int i, List list, eqo eqoVar) {
        eqo eqoVar2;
        int i2 = 2;
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new IllegalArgumentException(String.valueOf(i));
        }
        int i3 = ewx.a;
        float f = eqoVar.d;
        if (f > 1.0f) {
            eqoVar2 = new eqo(eqoVar.a, (int) (eqoVar.b * f), eqoVar.c, 1.0f, eqoVar.e);
        } else if (f < 1.0f) {
            eqoVar2 = new eqo(eqoVar.a, eqoVar.b, (int) (eqoVar.c / f), 1.0f, eqoVar.e);
        } else {
            eqoVar2 = eqoVar;
        }
        this.r = eqoVar2;
        try {
            this.k.e();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            new ewq(this, e, i2).run();
        }
        synchronized (this.i) {
            apuv apuvVar = new apuv(i, list, eqoVar);
            if (!this.o) {
                this.o = true;
                this.k.i();
                this.d.d(new exd(this, apuvVar, 0));
            } else {
                this.l = apuvVar;
                this.k.i();
                this.c.a().g();
            }
        }
    }

    @Override // defpackage.esk
    public final void d() {
        try {
            this.d.c(new ewt(this, 9));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.esk
    public final void e(erv ervVar) {
        exo exoVar = this.g;
        try {
            exoVar.f.b(new exd(exoVar, ervVar, 4));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            new ewq(exoVar, e, 5).run();
        }
    }

    @Override // defpackage.esk
    public final void f() {
        int i = ewx.a;
        dzg.d(!this.j);
        this.j = true;
        eyw eywVar = this.c.h;
        dzg.g(eywVar);
        eywVar.g();
    }

    @Override // defpackage.esk
    public final boolean g() {
        dzg.d(!this.j);
        dzg.i(this.r, "registerInputStream must be called before registering input frames");
        if (!this.k.g()) {
            return false;
        }
        this.c.a().m(this.r);
        return true;
    }

    @Override // defpackage.esk
    public final boolean h(Bitmap bitmap, etl etlVar) {
        boolean hasGainmap;
        dzg.d(!this.j);
        boolean z = false;
        if (!this.k.g()) {
            return false;
        }
        if (eqd.i(this.q)) {
            if (eul.a >= 34) {
                hasGainmap = bitmap.hasGainmap();
                if (hasGainmap) {
                    z = true;
                }
            }
            d.t(z, "VideoFrameProcessor configured for HDR output, but either received SDR input, or is on an API level that doesn't support gainmaps. SDR to HDR tonemapping is not supported.");
        }
        eqo eqoVar = this.r;
        dzg.g(eqoVar);
        eyb eybVar = this.c;
        long j = eqoVar.e;
        float f = eqoVar.d;
        eybVar.a().h(bitmap, new eqo(eqoVar.a, eqoVar.b, eqoVar.c, f, j), etlVar);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0335  */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.util.List, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(defpackage.apuv r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 939
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.exi.j(apuv, boolean):void");
    }
}
