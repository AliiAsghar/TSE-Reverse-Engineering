package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yqn {
    public static final xze a = xze.g("Bugle", "MoiraiApiInitializationManager");
    public static final utz b = uuh.i(uuh.b, "record_moirai_initialization_memory", false);
    public static final Object c = new Object();
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf i;
    public final anen l;
    private akbj m;
    public boolean g = false;
    public final AtomicBoolean h = new AtomicBoolean(false);
    public int j = 0;
    public long k = 0;

    public yqn(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, anen anenVar) {
        this.d = armfVar;
        this.f = armfVar4;
        this.i = armfVar2;
        this.e = armfVar3;
        this.l = anenVar;
    }

    public final akul a() {
        synchronized (c) {
            if (this.g) {
                return aktp.ag(null);
            }
            if (this.m == null) {
                this.m = new akbj(new vbo(this, 17), this.l);
            }
            if (this.m.e()) {
                return akul.g(this.m.c());
            }
            if (this.j >= ((Integer) yqo.c.e()).intValue()) {
                a.q("Retry limit to initialize MoiraiApi reached.");
                return aktp.af(new IllegalStateException("Retry limit to initialize MoiraiApi reached."));
            }
            if (((xnv) this.i.b()).f().toEpochMilli() < this.k) {
                a.q("The allowed time for initializing MoiraiApi wasn't reached.");
                return aktp.af(new IllegalStateException("The allowed time for initializing MoiraiApi wasn't reached."));
            }
            this.j++;
            akrh e = aktp.e("MoiraiApiInitializationManager#getInitializationResultFuture");
            try {
                akul g = akul.g(this.m.c());
                e.b(g);
                e.close();
                return g;
            } finally {
            }
        }
    }
}
