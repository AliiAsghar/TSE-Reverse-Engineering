package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvr implements hvq {
    public static final hvr a = new hvr(0);
    private final /* synthetic */ int b;

    public hvr(int i) {
        this.b = i;
    }

    @Override // defpackage.hvq
    public final hpt a(hpt hptVar, hnj hnjVar) {
        byte[] bArr;
        if (this.b != 0) {
            ByteBuffer b = ((hvf) hptVar.c()).b();
            int i = hyi.a;
            hyh hyhVar = null;
            if (!b.isReadOnly() && b.hasArray()) {
                hyhVar = new hyh(b.array(), b.arrayOffset(), b.limit());
            }
            if (hyhVar != null && hyhVar.a == 0 && hyhVar.b == ((byte[]) hyhVar.c).length) {
                bArr = b.array();
            } else {
                ByteBuffer asReadOnlyBuffer = b.asReadOnlyBuffer();
                byte[] bArr2 = new byte[asReadOnlyBuffer.limit()];
                hyi.b(asReadOnlyBuffer);
                asReadOnlyBuffer.get(bArr2);
                bArr = bArr2;
            }
            return new huw(bArr, 0);
        }
        return hptVar;
    }
}
