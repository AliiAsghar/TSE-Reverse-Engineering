package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class amaz implements ambk {
    @Override // defpackage.ambk
    public final ambj a(ByteBuffer byteBuffer) {
        ambl d = d(byteBuffer.remaining());
        d.f(byteBuffer);
        return d.q();
    }

    @Override // defpackage.ambk
    public final ambj b(byte[] bArr) {
        return e(bArr, bArr.length);
    }

    @Override // defpackage.ambk
    public final ambj c(CharSequence charSequence, Charset charset) {
        return f().k(charSequence, charset).q();
    }

    public ambl d(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        albo.L(z, "expectedInputSize must be >= 0 but was %s", i);
        return f();
    }

    public ambj e(byte[] bArr, int i) {
        albo.S(0, i, bArr.length);
        ambl d = d(i);
        d.g(bArr, i);
        return d.q();
    }
}
