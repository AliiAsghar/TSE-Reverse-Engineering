package defpackage;

import android.graphics.Bitmap;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewv extends eyw {
    public final Queue a;
    public eyn b;
    public eqq c;
    public int d;
    public boolean e;
    private final eqp f;
    private boolean g;

    public ewv(eqp eqpVar, ezc ezcVar) {
        super(ezcVar);
        this.f = eqpVar;
        this.a = new LinkedBlockingQueue();
    }

    @Override // defpackage.eyw
    public final int a() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eyw
    public final void b() {
        this.a.clear();
        this.g = false;
        this.e = false;
        this.d = 0;
        eqq eqqVar = this.c;
        if (eqqVar != null) {
            try {
                eqqVar.a();
                this.c = null;
            } catch (ets e) {
                throw esh.a(e);
            }
        }
        super.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0108, code lost:
    
        if (r6 != r9.getGenerationId()) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ewv.c():void");
    }

    @Override // defpackage.eyw, defpackage.exu
    public final void d() {
        this.l.d(new ewt(this, 1));
    }

    @Override // defpackage.eyw
    public final void e() {
        this.l.d(new ewt(this, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eyw
    public final void f(exw exwVar) {
        dzg.d(true);
        this.d = 0;
        this.b = exwVar;
    }

    @Override // defpackage.eyw
    public final void g() {
        this.l.d(new ewt(this, 0));
    }

    @Override // defpackage.eyw
    public final void h(final Bitmap bitmap, final eqo eqoVar, final etl etlVar) {
        this.l.d(new ezb() { // from class: ewu
            @Override // defpackage.ezb
            public final void a() {
                etl etlVar2 = etlVar;
                d.t(etlVar2.a(), "Bitmap queued but no timestamps provided.");
                kkc kkcVar = new kkc(bitmap, eqoVar, etlVar2, (char[]) null);
                ewv ewvVar = ewv.this;
                ewvVar.a.add(kkcVar);
                ewvVar.c();
                ewvVar.e = false;
            }
        });
    }
}
