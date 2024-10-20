package defpackage;

import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class akhp implements Closeable, akfz {
    public final akfd a;
    final /* synthetic */ akhq b;
    private final Executor c;
    private final akgr d;
    private final AtomicBoolean e = new AtomicBoolean(false);
    private boolean f = false;

    public akhp(akhq akhqVar, akgr akgrVar, Executor executor) {
        this.b = akhqVar;
        this.d = akgrVar;
        this.c = executor;
        this.a = akgrVar.a();
    }

    @Override // defpackage.akfz
    public final void a(akfy akfyVar) {
        if (akfyVar.c.ordinal() == 0) {
            boolean andSet = this.e.getAndSet(true);
            if (aiut.g()) {
                b();
            } else if (!andSet) {
                this.c.execute(akto.j(new akhg(this, 6)));
            }
        }
    }

    public final void b() {
        aiut.c();
        if (!this.f && this.e.get()) {
            akhq akhqVar = this.b;
            if (akhqVar.f != null && akhqVar.c) {
                boolean z = false;
                this.e.set(false);
                akhq akhqVar2 = this.b;
                akgr akgrVar = this.d;
                akec akecVar = akhqVar2.f;
                aiut.c();
                akgw akgwVar = (akgw) akecVar;
                akgz akgzVar = akgwVar.b;
                if (akgzVar.b != null) {
                    if (!akgzVar.a.N().a().equals(eng.STARTED) && !akgwVar.b.a.N().a().equals(eng.RESUMED)) {
                        throw new akgx();
                    }
                    akhj akhjVar = akgwVar.b.b;
                    akgs akgsVar = akgwVar.a;
                    aiut.c();
                    aodz aodzVar = (aodz) akhjVar.b.get(akgsVar);
                    if (aodzVar != null) {
                        z = true;
                    }
                    albo.U(z, "This callback object reference wasn't registered. Callback instances must be registered before LifecycleOwner reaches CREATED.");
                    aiut.c();
                    Object obj = aodzVar.a;
                    obj.getClass();
                    akhk akhkVar = (akhk) obj;
                    aodzVar.a = new akhk(algw.i(akgrVar), akhkVar.b, akhkVar.c, akhkVar.d);
                    aiut.c();
                    akhjVar.d.execute(akto.j(new ajnt(akhjVar, aodzVar, 14, (byte[]) null)));
                    return;
                }
                throw new akgy();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aiut.c();
        this.f = true;
    }
}
