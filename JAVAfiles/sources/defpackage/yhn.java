package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yhn implements Runnable {
    final /* synthetic */ yhp a;
    final /* synthetic */ fvz b;
    final /* synthetic */ yhd c;
    final /* synthetic */ arvo d;
    final /* synthetic */ long e;
    final /* synthetic */ wfh f;

    public yhn(yhp yhpVar, fvz fvzVar, wfh wfhVar, yhd yhdVar, arvo arvoVar, long j) {
        this.a = yhpVar;
        this.b = fvzVar;
        this.f = wfhVar;
        this.c = yhdVar;
        this.d = arvoVar;
        this.e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((ansy) ((npw) this.a.e).a.b()).e("bugle.enable_sdr_tone_mapping_in_transformer")) {
                fvz fvzVar = this.b;
                ghw ghwVar = new ghw(new fvz[0]);
                ((alob) ghwVar.a).h(fvzVar);
                ((alob) ghwVar.a).i(new fvz[0]);
                fvm fvmVar = new fvm(new atkn(ghwVar), new atkn[0]);
                fvmVar.b = 2;
                hka a = fvmVar.a();
                wfh wfhVar = this.f;
                String path = this.c.b.getPath();
                path.getClass();
                ((fxj) wfhVar.a).d(a, path);
                return;
            }
            wfh wfhVar2 = this.f;
            fvz fvzVar2 = this.b;
            String path2 = this.c.b.getPath();
            path2.getClass();
            ((fxj) wfhVar2.a).d(new fvm(new atkn(new ghw(fvzVar2)), new atkn[0]).a(), path2);
        } catch (IllegalStateException e) {
            this.d.e(false, xih.d);
            alvw h = yhp.a.h();
            h.X(alwp.a, "BugleTranscoding");
            ((alvg) ((alvg) h).g(e).h("com/google/android/apps/messaging/shared/util/media/video/transformer/TranscoderImpl$transcodeAsync$2$2", "run", 245, "TranscoderImpl.kt")).s("transformer failed in %d ms.", this.a.d.a() - this.e);
            this.a.f.s(2);
            this.a.f.u(13);
            yhp yhpVar = this.a;
            yhpVar.f.o(yhpVar.a(this.e));
            this.a.f.k();
        }
    }
}
