package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class feg extends ewo implements fei {
    public feg() {
        super(new ewl[1], new fel[1]);
    }

    @Override // defpackage.ewo, defpackage.ewi
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }

    @Override // defpackage.ewo, defpackage.ewi
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        throw null;
    }

    @Override // defpackage.ewo
    protected final /* synthetic */ ewj g(Throwable th) {
        return new fej("Unexpected decode error", th);
    }

    @Override // defpackage.ewo
    protected final /* bridge */ /* synthetic */ ewj h(ewl ewlVar, ewm ewmVar, boolean z) {
        boolean z2;
        fel felVar = (fel) ewmVar;
        try {
            ByteBuffer byteBuffer = ewlVar.d;
            dzg.g(byteBuffer);
            dzg.d(byteBuffer.hasArray());
            if (byteBuffer.arrayOffset() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            d.s(z2);
            byte[] array = byteBuffer.array();
            int remaining = byteBuffer.remaining();
            try {
                felVar.e = dzl.f(array, remaining, null, -1);
                felVar.b = ewlVar.f;
                return null;
            } catch (erm e) {
                throw new fej("Could not decode image data with BitmapFactory. (data.length = " + array.length + ", input length = " + remaining + ")", e);
            } catch (IOException e2) {
                throw new fej(e2);
            }
        } catch (fej e3) {
            return e3;
        }
    }

    @Override // defpackage.ewo
    protected final ewl i() {
        return new ewl(1);
    }

    @Override // defpackage.ewo
    protected final /* synthetic */ ewm k() {
        return new fel(this);
    }

    @Override // defpackage.fei
    public final /* bridge */ /* synthetic */ fel p() {
        return (fel) super.b();
    }
}
