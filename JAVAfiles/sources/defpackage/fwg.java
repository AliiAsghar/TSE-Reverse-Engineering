package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fwg extends fwh {
    private final fvk n;
    private boolean o;

    public fwg(fvk fvkVar, fxo fxoVar, fvc fvcVar) {
        super(1, fxoVar, fvcVar);
        this.n = fvkVar;
    }

    @Override // defpackage.fbd, defpackage.fbf
    public final String R() {
        return "ExoAssetLoaderAudioRenderer";
    }

    @Override // defpackage.fwh
    protected final void W(eqn eqnVar) {
        fvk fvkVar = this.n;
        fvi fviVar = (fvi) fvkVar;
        fvp a = ((fvr) fviVar.a).a(dzh.g(eqnVar), eqnVar, null, false);
        fviVar.b = a.d();
        this.m = a;
    }

    @Override // defpackage.fwh
    protected final boolean X() {
        ewl c = this.k.c();
        if (c != null) {
            if (!this.o) {
                if (this.m.i()) {
                    ByteBuffer byteBuffer = c.d;
                    dzg.g(byteBuffer);
                    byteBuffer.limit(0);
                    c.eP(4);
                    this.k.j();
                    this.l = true;
                    return false;
                }
                ByteBuffer e = this.m.e();
                if (e != null) {
                    c.h(e.limit());
                    c.d.put(e).flip();
                    MediaCodec.BufferInfo a = this.m.a();
                    dzg.g(a);
                    c.f = a.presentationTimeUs;
                    c.a = a.flags;
                    this.m.k();
                    this.o = true;
                }
            }
            this.k.j();
            this.o = false;
            return true;
        }
        return false;
    }

    @Override // defpackage.fwh
    protected final boolean Y(ewl ewlVar) {
        if (!ewlVar.eR()) {
            long j = ewlVar.f - this.j;
            ewlVar.f = j;
            if (this.m != null && j < 0) {
                ewlVar.eO();
                return true;
            }
            return false;
        }
        return false;
    }
}
