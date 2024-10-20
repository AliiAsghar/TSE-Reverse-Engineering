package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eso {
    private final alog b;
    private final List c = new ArrayList();
    private ByteBuffer[] d = new ByteBuffer[0];
    public esp a = esp.a;
    private esp e = esp.a;
    private boolean f = false;

    public eso(alog alogVar) {
        this.b = alogVar;
    }

    private final int i() {
        return this.d.length - 1;
    }

    private final void j(ByteBuffer byteBuffer) {
        boolean z;
        ByteBuffer byteBuffer2;
        do {
            z = false;
            for (int i = 0; i <= i(); i++) {
                if (!this.d[i].hasRemaining()) {
                    esr esrVar = (esr) this.c.get(i);
                    if (esrVar.i()) {
                        if (!this.d[i].hasRemaining() && i < i()) {
                            ((esr) this.c.get(i + 1)).e();
                        }
                    } else {
                        if (i > 0) {
                            byteBuffer2 = this.d[i - 1];
                        } else if (byteBuffer.hasRemaining()) {
                            byteBuffer2 = byteBuffer;
                        } else {
                            byteBuffer2 = esr.a;
                        }
                        long remaining = byteBuffer2.remaining();
                        esrVar.f(byteBuffer2);
                        this.d[i] = esrVar.c();
                        long remaining2 = remaining - byteBuffer2.remaining();
                        boolean z2 = true;
                        if (remaining2 <= 0 && !this.d[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    }
                }
            }
        } while (z);
    }

    public final esp a(esp espVar) {
        if (!espVar.equals(esp.a)) {
            for (int i = 0; i < this.b.size(); i++) {
                esr esrVar = (esr) this.b.get(i);
                esp b = esrVar.b(espVar);
                if (esrVar.h()) {
                    dzg.d(!b.equals(esp.a));
                    espVar = b;
                }
            }
            this.e = espVar;
            return espVar;
        }
        throw new esq(espVar);
    }

    public final ByteBuffer b() {
        if (!h()) {
            return esr.a;
        }
        ByteBuffer byteBuffer = this.d[i()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        j(esr.a);
        return this.d[i()];
    }

    public final void c() {
        this.c.clear();
        this.a = this.e;
        this.f = false;
        for (int i = 0; i < this.b.size(); i++) {
            esr esrVar = (esr) this.b.get(i);
            esrVar.d();
            if (esrVar.h()) {
                this.c.add(esrVar);
            }
        }
        this.d = new ByteBuffer[this.c.size()];
        for (int i2 = 0; i2 <= i(); i2++) {
            this.d[i2] = ((esr) this.c.get(i2)).c();
        }
    }

    public final void d() {
        if (h() && !this.f) {
            this.f = true;
            ((esr) this.c.get(0)).e();
        }
    }

    public final void e(ByteBuffer byteBuffer) {
        if (h() && !this.f) {
            j(byteBuffer);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eso)) {
            return false;
        }
        eso esoVar = (eso) obj;
        if (this.b.size() != esoVar.b.size()) {
            return false;
        }
        for (int i = 0; i < this.b.size(); i++) {
            if (this.b.get(i) != esoVar.b.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final void f() {
        for (int i = 0; i < this.b.size(); i++) {
            esr esrVar = (esr) this.b.get(i);
            esrVar.d();
            esrVar.g();
        }
        this.d = new ByteBuffer[0];
        this.a = esp.a;
        this.e = esp.a;
        this.f = false;
    }

    public final boolean g() {
        if (this.f && ((esr) this.c.get(i())).i() && !this.d[i()].hasRemaining()) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if (!this.c.isEmpty()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
