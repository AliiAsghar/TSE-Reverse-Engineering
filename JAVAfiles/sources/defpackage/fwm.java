package defpackage;

import android.content.Context;
import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwm implements fvd {
    public final ExoPlayer a;
    public int b;
    private final fvz c;
    private final fvi d;

    public fwm(Context context, fvz fvzVar, fgu fguVar, fvk fvkVar, int i, Looper looper, fvc fvcVar, eti etiVar) {
        long j;
        this.c = fvzVar;
        fvi fviVar = new fvi(fvkVar);
        this.d = fviVar;
        fjd fjdVar = new fjd(context);
        fiu fiuVar = new fiu(context);
        fiuVar.q = true;
        fiuVar.x = false;
        fjdVar.j(new fiv(fiuVar));
        dzg.d(true);
        ezk.b(250, 0, "bufferForPlaybackMs", "0");
        ezk.b(500, 0, "bufferForPlaybackAfterRebufferMs", "0");
        ezk.b(50000, 250, "minBufferMs", "bufferForPlaybackMs");
        ezk.b(50000, 500, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        ezk.b(50000, 50000, "maxBufferMs", "minBufferMs");
        dzg.d(true);
        ezk ezkVar = new ezk(new fjl(), 250, 500);
        boolean z = fvzVar.b;
        boolean z2 = fvzVar.c;
        boolean z3 = fvzVar.d;
        ezs ezsVar = new ezs(context, new ezp(new fwl(z, fviVar, i, fvcVar), 4), new ezp(context, 5));
        dzg.d(!ezsVar.u);
        ezsVar.d = new ezp(fguVar, 9);
        dzg.d(!ezsVar.u);
        ezsVar.e = new ezp(fjdVar, 8);
        dzg.d(!ezsVar.u);
        ezsVar.f = new ezp(ezkVar, 0);
        dzg.d(!ezsVar.u);
        dzg.g(looper);
        ezsVar.i = looper;
        dzg.d(!ezsVar.u);
        ezsVar.t = false;
        if (true != eul.Z()) {
            j = 500;
        } else {
            j = 5000;
        }
        dzg.d(!ezsVar.u);
        ezsVar.r = j;
        dzg.d(!ezsVar.u);
        if (etiVar != eti.a) {
            dzg.d(!ezsVar.u);
            ezsVar.b = etiVar;
        }
        ExoPlayer a = ezsVar.a();
        this.a = a;
        a.K(new fwk(this, fvcVar));
        this.b = 0;
    }

    @Override // defpackage.fvd
    public final alor e() {
        alok alokVar = new alok();
        String str = this.d.b;
        if (str != null) {
            alokVar.h(1, str);
        }
        String str2 = this.d.c;
        if (str2 != null) {
            alokVar.h(2, str2);
        }
        return alokVar.b();
    }

    @Override // defpackage.fvd
    public final void f() {
        this.a.a();
        this.b = 0;
    }

    @Override // defpackage.fvd
    public final void g() {
        alog r = alog.r(this.c.a);
        fad fadVar = (fad) this.a;
        fadVar.ag();
        List W = fadVar.W(r);
        fadVar.ag();
        fadVar.ab(W, -1, -9223372036854775807L, true);
        this.a.L();
        this.b = 1;
    }

    @Override // defpackage.fvd
    public final int h(arjs arjsVar) {
        if (this.b == 2) {
            ExoPlayer exoPlayer = this.a;
            arjsVar.a = Math.min((int) ((exoPlayer.A() * 100) / exoPlayer.B()), 99);
        }
        return this.b;
    }
}
