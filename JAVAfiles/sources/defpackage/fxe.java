package defpackage;

import android.graphics.Bitmap;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxe implements fxa {
    public final fxa a;
    public long b;
    public final /* synthetic */ fxf c;
    private final int d;

    public fxe(fxf fxfVar, fxa fxaVar, int i) {
        this.c = fxfVar;
        this.a = fxaVar;
        this.d = i;
    }

    @Override // defpackage.fxa
    public final int a() {
        throw null;
    }

    @Override // defpackage.fxa
    public final Surface b() {
        throw null;
    }

    @Override // defpackage.fxa
    public final ewl c() {
        return this.a.c();
    }

    public final void d() {
        this.c.c.b(new fhg(this, 18));
    }

    @Override // defpackage.fxa
    public final void f() {
        this.c.f.decrementAndGet();
        fxf fxfVar = this.c;
        if (fxfVar.h != ((alsx) fxfVar.a).c - 1) {
            if (fxfVar.f.get() == 0) {
                d();
                return;
            }
            return;
        }
        this.a.f();
    }

    @Override // defpackage.fxa
    public final int h(Bitmap bitmap, etl etlVar) {
        throw null;
    }

    @Override // defpackage.fxa
    public final boolean i() {
        throw null;
    }

    @Override // defpackage.fxa
    public final void j() {
        ewl c = this.a.c();
        dzg.h(c);
        if (c.eR()) {
            this.c.f.decrementAndGet();
            fxf fxfVar = this.c;
            if (fxfVar.h < ((alsx) fxfVar.a).c - 1) {
                if (this.d == 1 && fxfVar.j) {
                    this.a.j();
                    dzg.d(true);
                } else {
                    c.eO();
                    c.f = 0L;
                }
                if (this.c.f.get() == 0) {
                    d();
                    return;
                }
                return;
            }
        }
        this.a.j();
        dzg.d(true);
    }
}
