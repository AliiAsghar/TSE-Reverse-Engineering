package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fnv implements fnt {
    @Override // defpackage.fnt
    public final erk a(fnu fnuVar) {
        ByteBuffer byteBuffer = fnuVar.d;
        dzg.g(byteBuffer);
        boolean z = false;
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        }
        d.s(z);
        return b(fnuVar, byteBuffer);
    }

    protected abstract erk b(fnu fnuVar, ByteBuffer byteBuffer);
}
