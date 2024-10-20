package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fxi implements etv {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ fxi(fbk fbkVar, fgr fgrVar, int i) {
        this.c = i;
        this.b = fbkVar;
        this.a = fgrVar;
    }

    @Override // defpackage.etv
    public final void a(Object obj) {
        if (this.c != 0) {
            fbk fbkVar = (fbk) this.b;
            fbw fbwVar = (fbw) obj;
            if (fbkVar.d != null) {
                fgr fgrVar = (fgr) this.a;
                eqn eqnVar = fgrVar.b;
                dzg.g(eqnVar);
                fbx fbxVar = fbwVar.b;
                erz erzVar = fbkVar.b;
                fgv fgvVar = fbkVar.d;
                dzg.g(fgvVar);
                apuv apuvVar = new apuv(eqnVar, fbxVar.d(erzVar, fgvVar));
                int i = fgrVar.a;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                return;
                            }
                            fbwVar.u = apuvVar;
                            return;
                        }
                    } else {
                        fbwVar.t = apuvVar;
                        return;
                    }
                }
                fbwVar.s = apuvVar;
                return;
            }
            return;
        }
        yho yhoVar = (yho) obj;
        fxj fxjVar = (fxj) this.a;
        hka hkaVar = fxjVar.i;
        dzg.g(hkaVar);
        fxjVar.e.a();
        arvo arvoVar = yhoVar.a;
        yhp yhpVar = yhoVar.b;
        long j = yhoVar.c;
        Object obj2 = this.b;
        akrh e = aktp.e("Transformer.onError");
        try {
            arvoVar.e(false, xih.f);
            alvw h = yhp.a.h();
            h.X(alwp.a, "BugleTranscoding");
            ((alvg) h.h("com/google/android/apps/messaging/shared/util/media/video/transformer/TranscoderImpl$transcodeAsync$2$transformerListener$1", "onError", 197, "TranscoderImpl.kt")).C("transformer onError(%s) in %d ms.", ((fwo) obj2).getMessage(), yhpVar.d.a() - j);
            alvw g = yhp.a.g();
            g.X(alwp.a, "BugleTranscoding");
            ((alvg) g.h("com/google/android/apps/messaging/shared/util/media/video/transformer/TranscoderImpl$transcodeAsync$2$transformerListener$1", "onError", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "TranscoderImpl.kt")).r("transformer composition hdrMode: %s", hkaVar.a);
            yhpVar.f.s(2);
            yhpVar.f.u(12);
            yhpVar.f.o(yhpVar.a(j));
            yhpVar.f.k();
            armd.i(e, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                armd.i(e, th);
                throw th2;
            }
        }
    }

    public /* synthetic */ fxi(fxj fxjVar, fwo fwoVar, int i) {
        this.c = i;
        this.a = fxjVar;
        this.b = fwoVar;
    }
}
