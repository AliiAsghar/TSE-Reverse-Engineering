package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnz extends fnv {
    @Override // defpackage.fnv
    protected final erk b(fnu fnuVar, ByteBuffer byteBuffer) {
        euf eufVar = new euf(byteBuffer.array(), byteBuffer.limit());
        String w = eufVar.w();
        dzg.g(w);
        String w2 = eufVar.w();
        dzg.g(w2);
        return new erk(new fny(w, w2, eufVar.q(), eufVar.q(), Arrays.copyOfRange(eufVar.a, eufVar.b, eufVar.c)));
    }
}
