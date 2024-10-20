package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxx extends fxb {
    public final fxv e;
    public volatile long f;
    private final fxw g;
    private final ewl h;
    private long i;
    private boolean j;

    public fxx(Context context, eqn eqnVar, fxh fxhVar, eyy eyyVar, List list, esi esiVar, fvl fvlVar, fwy fwyVar, etm etmVar, fwr fwrVar, eqg eqgVar, boolean z) {
        super(eqnVar, fwyVar);
        eqd eqdVar;
        eqd eqdVar2;
        fxp fxpVar;
        this.f = -9223372036854775807L;
        this.i = -9223372036854775807L;
        eqd eqdVar3 = eqnVar.C;
        dzg.g(eqdVar3);
        if (eqdVar3.e == 2) {
            if (Objects.equals(eqnVar.o, "image/jpeg_r")) {
                eqdVar = new eqd(6, 1, 7, null, -1, -1);
            } else {
                eqdVar = eqd.a;
            }
        } else {
            eqdVar = eqdVar3;
        }
        eqm eqmVar = new eqm(eqnVar);
        eqmVar.A = eqdVar;
        fxv fxvVar = new fxv(fvlVar, new eqn(eqmVar), fwyVar.b(2), fxhVar, fwrVar);
        this.e = fxvVar;
        this.h = new ewl(0);
        if (fxvVar.g == 2 && eqd.i(eqdVar3)) {
            eqdVar2 = eqd.a;
        } else {
            eqdVar2 = eqdVar;
        }
        try {
            if (z) {
                fxpVar = new fxp(esiVar, 1);
            } else {
                fxpVar = new fxp(esiVar, 0);
            }
            fxw fxwVar = new fxw(this, context, fxpVar, eqdVar2, etmVar, eqgVar, eyyVar, list);
            this.g = fxwVar;
            fxwVar.e();
        } catch (esh e) {
            throw new fwo("Video frame processing error", e, 5001);
        }
    }

    @Override // defpackage.fxb
    public final void d() {
        this.g.f();
        fxv fxvVar = this.e;
        if (fxvVar.k != null) {
            fxvVar.k.g();
        }
        fxvVar.j = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fxb
    public final eqn p() {
        fxv fxvVar = this.e;
        if (fxvVar.k == null) {
            return null;
        }
        eqn b = fxvVar.k.b();
        if (b != null && fxvVar.i != 0) {
            eqm eqmVar = new eqm(b);
            eqmVar.w = fxvVar.i;
            return new eqn(eqmVar);
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fxb
    public final ewl q() {
        ByteBuffer byteBuffer;
        fxv fxvVar = this.e;
        MediaCodec.BufferInfo bufferInfo = null;
        if (fxvVar.k != null) {
            byteBuffer = fxvVar.k.e();
        } else {
            byteBuffer = null;
        }
        ewl ewlVar = this.h;
        ewlVar.d = byteBuffer;
        if (ewlVar.d == null) {
            return null;
        }
        fxv fxvVar2 = this.e;
        if (fxvVar2.k != null) {
            bufferInfo = fxvVar2.k.a();
        }
        dzg.g(bufferInfo);
        if (bufferInfo.presentationTimeUs == 0 && this.g.h() == this.j && this.f != -9223372036854775807L && bufferInfo.size > 0) {
            bufferInfo.presentationTimeUs = this.f;
        }
        this.h.f = bufferInfo.presentationTimeUs;
        this.h.a = bufferInfo.flags;
        this.i = bufferInfo.presentationTimeUs;
        return this.h;
    }

    @Override // defpackage.fxb
    public final fwt r(fvz fvzVar, eqn eqnVar, int i) {
        try {
            return this.g.c(i);
        } catch (esh e) {
            throw new fwo("Video frame processing error", e, 5001);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fxb
    public final void s() {
        if (this.i == 0) {
            this.j = true;
        }
        fxv fxvVar = this.e;
        if (fxvVar.k != null) {
            fxvVar.k.k();
        }
        boolean z = this.g.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fxb
    public final boolean t() {
        fxv fxvVar = this.e;
        if (fxvVar.k != null && fxvVar.k.i()) {
            return true;
        }
        return false;
    }
}
