package defpackage;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class exq implements exu {
    public final eqp a;
    public final exw b;
    private final ezc c;
    private final Queue d = new ArrayDeque();
    private int e;

    public exq(eqp eqpVar, exw exwVar, ezc ezcVar) {
        this.a = eqpVar;
        this.b = exwVar;
        this.c = ezcVar;
    }

    public final synchronized int a() {
        return this.d.size();
    }

    public final synchronized void b(final eqq eqqVar, final long j) {
        if (this.e > 0) {
            this.c.d(new ezb() { // from class: exp
                @Override // defpackage.ezb
                public final void a() {
                    exq exqVar = exq.this;
                    exqVar.b.d(exqVar.a, eqqVar, j);
                }
            });
            this.e--;
        } else {
            this.d.add(Pair.create(eqqVar, Long.valueOf(j)));
        }
    }

    @Override // defpackage.exu
    public final synchronized void d() {
        Pair pair = (Pair) this.d.poll();
        if (pair == null) {
            this.e++;
            return;
        }
        this.c.d(new exd(this, pair, 5));
        Pair pair2 = (Pair) this.d.peek();
        if (pair2 != null && ((Long) pair2.second).longValue() == Long.MIN_VALUE) {
            ezc ezcVar = this.c;
            exw exwVar = this.b;
            exwVar.getClass();
            ezcVar.d(new ewt(exwVar, 17));
            this.d.remove();
        }
    }

    public final synchronized void f() {
        if (!this.d.isEmpty()) {
            this.d.add(Pair.create(eqq.a, Long.MIN_VALUE));
            return;
        }
        ezc ezcVar = this.c;
        exw exwVar = this.b;
        exwVar.getClass();
        ezcVar.d(new ewt(exwVar, 17));
    }

    @Override // defpackage.exu
    public final synchronized void u() {
        this.e = 0;
        this.d.clear();
    }

    @Override // defpackage.exu
    public final /* synthetic */ void v(eqq eqqVar) {
    }
}
