package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class few extends ewl {
    public long h;
    public int i;
    private int j;

    public few() {
        super(2);
        this.j = 32;
    }

    @Override // defpackage.ewl, defpackage.ewf
    public final void eO() {
        super.eO();
        this.i = 0;
    }

    public final void k(int i) {
        d.s(true);
        this.j = i;
    }

    public final boolean l(ewl ewlVar) {
        ByteBuffer byteBuffer;
        d.s(!ewlVar.j());
        d.s(!ewlVar.d());
        d.s(!ewlVar.eR());
        if (m()) {
            if (this.i < this.j) {
                ByteBuffer byteBuffer2 = ewlVar.d;
                if (byteBuffer2 != null && (byteBuffer = this.d) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                    return false;
                }
            } else {
                return false;
            }
        }
        int i = this.i;
        this.i = i + 1;
        if (i == 0) {
            this.f = ewlVar.f;
            if (ewlVar.f()) {
                this.a = 1;
            }
        }
        ByteBuffer byteBuffer3 = ewlVar.d;
        if (byteBuffer3 != null) {
            h(byteBuffer3.remaining());
            this.d.put(byteBuffer3);
        }
        this.h = ewlVar.f;
        return true;
    }

    public final boolean m() {
        if (this.i > 0) {
            return true;
        }
        return false;
    }
}
