package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ess implements esr {
    protected esp b;
    protected esp c;
    public ByteBuffer d;
    private esp e;
    private esp f;
    private ByteBuffer g;
    private boolean h;

    public ess() {
        ByteBuffer byteBuffer = a;
        this.g = byteBuffer;
        this.d = byteBuffer;
        this.e = esp.a;
        esp espVar = esp.a;
        this.f = espVar;
        this.b = espVar;
        this.c = espVar;
    }

    @Override // defpackage.esr
    public final esp b(esp espVar) {
        this.e = espVar;
        this.f = j(espVar);
        if (h()) {
            return this.f;
        }
        return esp.a;
    }

    @Override // defpackage.esr
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.d;
        this.d = a;
        return byteBuffer;
    }

    @Override // defpackage.esr
    public final void d() {
        this.d = a;
        this.h = false;
        this.b = this.e;
        this.c = this.f;
        l();
    }

    @Override // defpackage.esr
    public final void e() {
        this.h = true;
        m();
    }

    @Override // defpackage.esr
    public final void g() {
        d();
        this.g = a;
        this.e = esp.a;
        esp espVar = esp.a;
        this.f = espVar;
        this.b = espVar;
        this.c = espVar;
        n();
    }

    @Override // defpackage.esr
    public boolean h() {
        if (this.f != esp.a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.esr
    public boolean i() {
        if (this.h && this.d == a) {
            return true;
        }
        return false;
    }

    protected esp j(esp espVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ByteBuffer k(int i) {
        if (this.g.capacity() < i) {
            this.g = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.g.clear();
        }
        ByteBuffer byteBuffer = this.g;
        this.d = byteBuffer;
        return byteBuffer;
    }

    protected void l() {
    }

    protected void m() {
    }

    protected void n() {
    }

    @Override // defpackage.esr
    public /* synthetic */ long a(long j) {
        return j;
    }
}
