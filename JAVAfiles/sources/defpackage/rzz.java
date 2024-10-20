package defpackage;

import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rzz extends agmc implements yfx {
    private final xny a;
    private final agoz b;
    private final yyt c;

    public rzz(wfh wfhVar, agoz agozVar, Consumer consumer, String str) {
        super(consumer);
        this.b = agozVar;
        this.c = wfhVar.Y(this);
        this.a = new xnx(str);
    }

    @Override // defpackage.agmc
    public final void a(agoz agozVar) {
        akrh a = this.a.a();
        try {
            this.c.x(null, a);
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final yga f(yfv yfvVar, String str, String str2, String str3) {
        return this.c.w(yfvVar, str, str2, str3);
    }

    @Override // defpackage.yfx
    public final void fs() {
        this.b.E(this);
    }

    @Override // defpackage.yfx
    public final void ft() {
        this.b.G(this);
    }
}
