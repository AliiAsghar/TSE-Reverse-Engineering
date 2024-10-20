package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gid {
    public volatile gkd a;
    public arwe b;
    public arpi c;
    public Executor d;
    public Executor e;
    public ghv f;
    public boolean g;
    public ktk j;
    public final ico i = new ico((byte[]) null, (char[]) null);
    private final ThreadLocal k = new ThreadLocal();
    public final Map h = new LinkedHashMap();

    public abstract ghv a();

    public final ghv b() {
        ghv ghvVar = this.f;
        if (ghvVar == null) {
            arro.b("internalTracker");
            return null;
        }
        return ghvVar;
    }

    @armg
    public gkg c(ghm ghmVar) {
        throw new armn((byte[]) null);
    }

    public final gkg d() {
        ktk ktkVar = this.j;
        if (ktkVar == null) {
            arro.b("connectionManager");
            ktkVar = null;
        }
        gkg g = ktkVar.g();
        if (g != null) {
            return g;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public final Object e(Callable callable) {
        l();
        try {
            Object call = callable.call();
            o();
            return call;
        } finally {
            m();
        }
    }

    public Map f() {
        return arnw.a;
    }

    @armg
    public Set g() {
        return arnx.a;
    }

    public final arpi h() {
        arwe arweVar = this.b;
        if (arweVar == null) {
            arro.b("coroutineScope");
            arweVar = null;
        }
        return ((asep) arweVar).a;
    }

    public final arwe i() {
        arwe arweVar = this.b;
        if (arweVar == null) {
            arro.b("coroutineScope");
            return null;
        }
        return arweVar;
    }

    public final void j() {
        if (this.g || !a.y()) {
        } else {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void k() {
        if (!q() && this.k.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @armg
    public final void l() {
        j();
        j();
        gkd b = d().b();
        if (!b.i()) {
            arrn.G(arpj.a, new eie(b(), (arpe) null, 8, (char[]) null));
        }
        if (((gkj) b).d.isWriteAheadLoggingEnabled()) {
            b.e();
        } else {
            b.d();
        }
    }

    public final void m() {
        d().b().f();
        if (!q()) {
            ghv b = b();
            b.c.g(b.f, b.g);
        }
    }

    public final void n(Runnable runnable) {
        l();
        try {
            runnable.run();
            o();
        } finally {
            m();
        }
    }

    @armg
    public final void o() {
        d().b().h();
    }

    public final boolean p() {
        ktk ktkVar = this.j;
        if (ktkVar == null) {
            arro.b("connectionManager");
            ktkVar = null;
        }
        if (ktkVar.g() != null) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        return d().b().i();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [gkd, java.lang.Object] */
    public final boolean r() {
        ktk ktkVar = this.j;
        if (ktkVar == null) {
            arro.b("connectionManager");
            ktkVar = null;
        }
        ?? r0 = ktkVar.c;
        if (r0 != 0) {
            return r0.j();
        }
        return false;
    }

    @armg
    public List s() {
        return arnv.a;
    }

    public final Object t(arqv arqvVar, arpe arpeVar) {
        ktk ktkVar = this.j;
        if (ktkVar == null) {
            arro.b("connectionManager");
            ktkVar = null;
        }
        return arqvVar.a((gjf) ((gjc) ktkVar.b).a.a(), arpeVar);
    }
}
