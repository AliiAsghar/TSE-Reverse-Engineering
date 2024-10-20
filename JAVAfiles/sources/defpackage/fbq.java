package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fbq implements etv {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fbq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.etv
    public final void a(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    yho yhoVar = (yho) obj;
                    fxj fxjVar = (fxj) this.a;
                    hka hkaVar = fxjVar.i;
                    dzg.g(hkaVar);
                    arvo arvoVar = yhoVar.a;
                    yhp yhpVar = yhoVar.b;
                    long j = yhoVar.c;
                    fwq a = fxjVar.e.a();
                    akrh e = aktp.e("Transformer.onCompleted");
                    try {
                        arvoVar.e(true, xih.e);
                        alvw g = yhp.a.g();
                        g.X(alwp.a, "BugleTranscoding");
                        ((alvg) g.h("com/google/android/apps/messaging/shared/util/media/video/transformer/TranscoderImpl$transcodeAsync$2$transformerListener$1", "onCompleted", 167, "TranscoderImpl.kt")).r("transformer composition hdrMode: %s", hkaVar.a);
                        alvw g2 = yhp.a.g();
                        g2.X(alwp.a, "BugleTranscoding");
                        ((alvg) g2.h("com/google/android/apps/messaging/shared/util/media/video/transformer/TranscoderImpl$transcodeAsync$2$transformerListener$1", "onCompleted", 170, "TranscoderImpl.kt")).L("transformer succeeded in %s ms, durationMs: %s, width: %s, height: %s, bytes: %s.", Long.valueOf(yhpVar.d.a() - j), Long.valueOf(a.a), Integer.valueOf(a.k), Integer.valueOf(a.j), Long.valueOf(a.b));
                        yhpVar.f.s(1);
                        yhpVar.f.o(yhpVar.a(j));
                        yhpVar.f.k();
                        armd.i(e, null);
                    } finally {
                    }
                }
            } else {
                fbw fbwVar = (fbw) obj;
                apuv apuvVar = fbwVar.s;
                Object obj2 = this.a;
                if (apuvVar != null) {
                    eqn eqnVar = (eqn) apuvVar.b;
                    if (eqnVar.w == -1) {
                        eqm eqmVar = new eqm(eqnVar);
                        esn esnVar = (esn) obj2;
                        eqmVar.t = esnVar.b;
                        eqmVar.u = esnVar.c;
                        fbwVar.s = new apuv(new eqn(eqmVar), (String) apuvVar.c);
                    }
                }
                esn esnVar2 = (esn) obj2;
                int i2 = esnVar2.b;
                int i3 = esnVar2.c;
                float f = esnVar2.d;
            }
        }
    }
}
