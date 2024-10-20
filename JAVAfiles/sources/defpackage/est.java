package defpackage;

import android.util.SparseArray;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class est extends ess {
    private final SparseArray e = new SparseArray();

    @Override // defpackage.esr
    public final void f(ByteBuffer byteBuffer) {
        esu esuVar = (esu) this.e.get(this.b.c);
        dzg.h(esuVar);
        int remaining = byteBuffer.remaining() / this.b.e;
        ByteBuffer k = k(this.c.e * remaining);
        dzf.e(byteBuffer, this.b, k, this.c, esuVar, remaining, false);
        k.flip();
    }

    @Override // defpackage.ess
    protected final esp j(esp espVar) {
        if (espVar.d == 2) {
            esu esuVar = (esu) this.e.get(espVar.c);
            if (esuVar != null) {
                if (esuVar.d) {
                    return esp.a;
                }
                return new esp(espVar.b, esuVar.b, 2);
            }
            throw new esq("No mixing matrix for input channel count", espVar);
        }
        throw new esq(espVar);
    }

    public final void o(esu esuVar) {
        this.e.put(esuVar.a, esuVar);
    }
}
