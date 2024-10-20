package defpackage;

import android.media.MediaPlayer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aawp implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aawp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                ((aggk) this.a).b.f(true);
                return;
            }
            Object obj = this.a;
            nhm nhmVar = (nhm) obj;
            nhmVar.h = true;
            if (!obj.equals(((nhh) nhmVar.k.a).f)) {
                nhmVar.d();
            }
            if (!nhmVar.j.isZero()) {
                nhmVar.e(nhmVar.j);
            }
            if (nhmVar.i) {
                nhmVar.f();
                return;
            }
            return;
        }
        aawt aawtVar = (aawt) this.a;
        if (aawtVar.b) {
            mediaPlayer.seekTo(0);
            mediaPlayer.start();
            aawtVar.d();
        }
        aawtVar.f.set(mediaPlayer.getVideoWidth(), mediaPlayer.getVideoHeight());
        aawtVar.e();
    }
}
