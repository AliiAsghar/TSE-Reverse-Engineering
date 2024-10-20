package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aqyl extends apzj {
    public final AtomicReference d;
    private final ConcurrentLinkedQueue e;

    public aqyl() {
        super(null);
        this.e = new ConcurrentLinkedQueue();
        this.d = new AtomicReference(null);
    }

    @Override // defpackage.apzj
    public final void a() {
        this.e.offer(new aqyi(3));
        m();
    }

    @Override // defpackage.apzj
    public final void b() {
        this.e.offer(new aqyi(0));
        m();
    }

    @Override // defpackage.apzj
    public final void c() {
        this.e.offer(new aqyi(1));
        m();
    }

    @Override // defpackage.apzj
    public final void d(final Object obj) {
        this.e.offer(new aqyk() { // from class: aqyj
            @Override // defpackage.aqyk
            public final void a(apzj apzjVar) {
                apzjVar.d(obj);
            }
        });
        m();
    }

    @Override // defpackage.apzj
    public final void e() {
        this.e.offer(new aqyi(2));
        m();
    }

    public final void m() {
        apzj apzjVar = (apzj) this.d.get();
        if (apzjVar == null) {
            return;
        }
        synchronized (this) {
            while (true) {
                aqyk aqykVar = (aqyk) this.e.poll();
                if (aqykVar != null) {
                    aqykVar.a(apzjVar);
                }
            }
        }
    }
}
