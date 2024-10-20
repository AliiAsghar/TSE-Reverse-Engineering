package defpackage;

import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agdc implements err {
    final /* synthetic */ agde a;
    final /* synthetic */ ExoPlayer b;

    public agdc(agde agdeVar, ExoPlayer exoPlayer) {
        this.a = agdeVar;
        this.b = exoPlayer;
    }

    @Override // defpackage.err
    public final void eB(boolean z) {
        alvg alvgVar = (alvg) agde.a.g().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer$createExoPlayer$1$1", "onIsPlayingChanged", 82, "HugoVideoPlayer.kt");
        Boolean valueOf = Boolean.valueOf(z);
        alvgVar.t("HugoVideoPlayer::onIsPlayingChanged: %b", valueOf);
        this.a.d.f(valueOf);
        if (z) {
            agde agdeVar = this.a;
            arxm arxmVar = agdeVar.h;
            if (arxmVar != null) {
                arxmVar.v(null);
            }
            agdeVar.h = arrn.J(agdeVar.b, null, null, new afmg(agdeVar, (arpe) null, 17), 3);
            return;
        }
        this.a.b();
    }

    @Override // defpackage.err
    public final void eC(int i) {
        ((alvg) agde.a.g().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer$createExoPlayer$1$1", "onPlaybackStateChanged", 93, "HugoVideoPlayer.kt")).r("HugoVideoPlayer::onPlaybackStateChanged: %d", i);
        if (i == 3) {
            this.a.e = this.b.B();
            this.a.g = true;
        }
    }

    @Override // defpackage.err
    public final void eD(ern ernVar) {
        ernVar.getClass();
        ((alvg) agde.a.i().h("com/google/android/libraries/compose/ui/projector/renderers/video/HugoVideoPlayer$createExoPlayer$1$1", "onPlayerError", 101, "HugoVideoPlayer.kt")).t("HugoVideoPlayer::onPlayerError: %s", ernVar);
    }

    @Override // defpackage.err
    public final /* synthetic */ void eF() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void eJ() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void l() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void m() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void o() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void p() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void q() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void r() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void s() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void u() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void v() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void w() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void x() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void z() {
    }

    @Override // defpackage.err
    public final /* synthetic */ void a(eta etaVar) {
    }

    @Override // defpackage.err
    public final /* synthetic */ void eE(ern ernVar) {
    }

    @Override // defpackage.err
    public final /* synthetic */ void eG(esg esgVar) {
    }

    @Override // defpackage.err
    public final /* synthetic */ void eH(esn esnVar) {
    }

    @Override // defpackage.err
    public final /* synthetic */ void eI(erq erqVar) {
    }

    @Override // defpackage.err
    public final /* synthetic */ void t(int i) {
    }

    @Override // defpackage.err
    public final /* synthetic */ void y(erz erzVar) {
    }
}
