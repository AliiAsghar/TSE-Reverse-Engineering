package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arap implements arar {
    private final /* synthetic */ int a;

    public arap(int i) {
        this.a = i;
    }

    @Override // defpackage.aras
    public final /* synthetic */ int a(arfh arfhVar, int i, Object obj, int i2) {
        int i3 = this.a;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    ByteBuffer byteBuffer = (ByteBuffer) obj;
                    int limit = byteBuffer.limit();
                    byteBuffer.limit(byteBuffer.position() + i);
                    arfhVar.i(byteBuffer);
                    byteBuffer.limit(limit);
                    return 0;
                }
                arfhVar.k((byte[]) obj, i2, i);
                return i2 + i;
            }
            return arfhVar.e();
        }
        arfhVar.l(i);
        return 0;
    }
}
