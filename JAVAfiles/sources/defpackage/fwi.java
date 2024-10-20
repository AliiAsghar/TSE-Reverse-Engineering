package defpackage;

import android.media.MediaCodec;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fwi extends fwh {
    private final fvk n;
    private final int o;
    private final List p;
    private int q;

    public fwi(fvk fvkVar, int i, fxo fxoVar, fvc fvcVar) {
        super(2, fxoVar, fvcVar);
        this.n = fvkVar;
        this.o = i;
        this.p = new ArrayList();
        this.q = -1;
    }

    @Override // defpackage.fbd, defpackage.fbf
    public final String R() {
        return "ExoAssetLoaderVideoRenderer";
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
    
        if (defpackage.eul.d.startsWith("SM-F936") != false) goto L35;
     */
    @Override // defpackage.fwh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void W(defpackage.eqn r12) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fwi.W(eqn):void");
    }

    @Override // defpackage.fwh
    protected final boolean X() {
        if (this.m.i()) {
            this.k.f();
            this.l = true;
            return false;
        }
        MediaCodec.BufferInfo a = this.m.a();
        if (a != null) {
            long j = a.presentationTimeUs - this.j;
            if (j >= 0) {
                long j2 = a.presentationTimeUs;
                int size = this.p.size();
                for (int i = 0; i < size; i++) {
                    if (((Long) this.p.get(i)).longValue() == j2) {
                        this.p.remove(i);
                    }
                }
                if (((fxe) this.k).a.a() != this.q && ((fxe) this.k).a.i()) {
                    this.m.h(true, j);
                    return true;
                }
            }
            this.m.k();
            return true;
        }
        return false;
    }

    @Override // defpackage.fwh
    protected final boolean Y(ewl ewlVar) {
        if (!ewlVar.eR()) {
            dzg.g(ewlVar.d);
            if (this.m == null) {
                ewlVar.f -= this.j;
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.fwh
    protected final eqn Z(eqn eqnVar) {
        if (this.o == 3 && eqd.i(eqnVar.C)) {
            eqm eqmVar = new eqm(eqnVar);
            eqmVar.A = eqd.a;
            return new eqn(eqmVar);
        }
        return eqnVar;
    }

    @Override // defpackage.fwh
    protected final eqn aa(eqn eqnVar) {
        eqd i = dyf.i(eqnVar.C);
        boolean z = true;
        if (this.o != 1) {
            z = false;
        }
        eqd h = dyf.h(i, z);
        eqm eqmVar = new eqm(eqnVar);
        eqmVar.A = h;
        return new eqn(eqmVar);
    }

    @Override // defpackage.fwh
    protected final void ab(ewl ewlVar) {
        long j = ewlVar.f;
        if (j < this.f) {
            this.p.add(Long.valueOf(j));
        }
    }
}
