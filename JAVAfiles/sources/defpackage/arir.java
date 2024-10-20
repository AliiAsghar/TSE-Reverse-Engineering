package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arir implements arki {
    private static final Logger d = Logger.getLogger(arjh.class.getName());
    public final ariq a;
    public final arki b;
    public final asmb c = new asmb(Level.FINE, arjh.class);

    public arir(ariq ariqVar, arki arkiVar) {
        this.a = ariqVar;
        this.b = arkiVar;
    }

    @Override // defpackage.arki
    public final void a() {
        throw null;
    }

    @Override // defpackage.arki
    public final void b(boolean z, int i, asqu asquVar, int i2) {
        throw null;
    }

    @Override // defpackage.arki
    public final void c() {
        try {
            this.b.c();
        } catch (IOException e) {
            this.a.a(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Level level;
        try {
            this.b.close();
        } catch (IOException e) {
            Class<?> cls = e.getClass();
            Logger logger = d;
            if (cls.equals(IOException.class)) {
                level = Level.FINE;
            } else {
                level = Level.INFO;
            }
            logger.logp(level, "io.grpc.okhttp.ExceptionHandlingFrameWriter", "close", "Failed closing connection", (Throwable) e);
        }
    }

    @Override // defpackage.arki
    public final void d(boolean z, int i, int i2) {
        long j = i << 32;
        long j2 = i2 & 4294967295L;
        if (z) {
            asmb asmbVar = this.c;
            if (asmbVar.b()) {
                long j3 = j | j2;
                Object obj = asmbVar.b;
                Logger logger = (Logger) obj;
                logger.logp((Level) asmbVar.a, "io.grpc.okhttp.OkHttpFrameLogger", "logPingAck", aqaw.h(2) + " PING: ack=true bytes=" + j3);
            }
        } else {
            this.c.e(2, j | j2);
        }
        try {
            arki arkiVar = this.b;
            if (z) {
                ((aris) arkiVar).b.h++;
            }
            ((aris) arkiVar).a.d(z, i, i2);
        } catch (IOException e) {
            this.a.a(e);
        }
    }

    @Override // defpackage.arki
    public final void e(int i, arkh arkhVar) {
        this.c.f(2, i, arkhVar);
        try {
            arki arkiVar = this.b;
            ((aris) arkiVar).b.h++;
            ((aris) arkiVar).a.e(i, arkhVar);
        } catch (IOException e) {
            this.a.a(e);
        }
    }

    @Override // defpackage.arki
    public final void f(int i, long j) {
        this.c.g(2, i, j);
        try {
            ((aris) this.b).a.f(i, j);
        } catch (IOException e) {
            this.a.a(e);
        }
    }

    @Override // defpackage.arki
    public final void g(arkh arkhVar, byte[] bArr) {
        this.c.d(2, 0, arkhVar, asqx.f(bArr));
        try {
            ((aris) this.b).a.g(arkhVar, bArr);
            this.b.c();
        } catch (IOException e) {
            this.a.a(e);
        }
    }

    @Override // defpackage.arki
    public final void h(boolean z, int i, List list) {
        throw null;
    }

    @Override // defpackage.arki
    public final void i(asnn asnnVar) {
        throw null;
    }

    @Override // defpackage.arki
    public final void j(asnn asnnVar) {
        throw null;
    }
}
