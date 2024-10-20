package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aikh {
    public aiom a;
    public final String c;
    public final aikm d;
    private aikg h;
    public aiom b = null;
    public long e = System.currentTimeMillis();
    private boolean g = false;
    public long f = 60000;

    public aikh(String str, aiom aiomVar, aikm aikmVar) {
        this.a = null;
        this.c = str;
        this.a = aiomVar;
        this.d = aikmVar;
    }

    public static String j(ainh ainhVar) {
        ailt ailtVar = ainhVar.g;
        if (ailtVar == null) {
            return null;
        }
        return ainhVar.v(ailtVar.e(), 2);
    }

    public final int a() {
        aioo aiooVar;
        if (g() && (aiooVar = (aioo) this.b) != null) {
            return aiooVar.y();
        }
        return -1;
    }

    public final aioo b() {
        if (g()) {
            return (aioo) this.b;
        }
        return null;
    }

    public final String c() {
        aioo b = b();
        if (b != null) {
            return b.A();
        }
        aikg aikgVar = this.h;
        if (aikgVar == null) {
            return null;
        }
        return aikgVar.c;
    }

    public final void d(aikg aikgVar) {
        synchronized (this) {
            this.g = true;
            this.h = aikgVar;
            notifyAll();
        }
        aikm aikmVar = this.d;
        if (aikmVar != null) {
            aikmVar.a(this);
        }
    }

    public final void e(aiom aiomVar) {
        synchronized (this) {
            if (this.g) {
                return;
            }
            this.b = aiomVar;
            notify();
            aikm aikmVar = this.d;
            if (aikmVar != null) {
                aikmVar.b(this);
            }
        }
    }

    public final boolean f() {
        aiom aiomVar = this.b;
        if (aiomVar == null || !((aion) aiomVar).z().equals("ACK")) {
            return false;
        }
        return true;
    }

    public final boolean g() {
        aiom aiomVar = this.b;
        if (aiomVar != null) {
            return aiomVar.x();
        }
        return false;
    }

    public final int h(int i) {
        return i(0, i);
    }

    public final int i(int i, int i2) {
        if (i <= 0) {
            i = i2;
        }
        this.f = i * 1000;
        try {
            if (this.b != null) {
                return 1;
            }
            synchronized (this) {
                if (this.g) {
                    this.b = null;
                    return 3;
                }
                wait(this.f);
                if (this.g) {
                    this.b = null;
                    return 3;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.e > this.f) {
                    return 1;
                }
                this.e = currentTimeMillis;
                return i(0, i2);
            }
        } catch (InterruptedException unused) {
            this.b = null;
            return 2;
        }
    }
}
