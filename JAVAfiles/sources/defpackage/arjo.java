package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arjo implements arhw {
    private final /* synthetic */ int a;

    public arjo(int i) {
        this.a = i;
    }

    @Override // defpackage.arhw
    public final arhv a(int i) {
        if (this.a != 0) {
            return new aqzc(ByteBuffer.allocateDirect(Math.min(1048576, i)));
        }
        return new arjn(new asqu(), Math.min(1048576, Math.max(4096, i)));
    }
}
