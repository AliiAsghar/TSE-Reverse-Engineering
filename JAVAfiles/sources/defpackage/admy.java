package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class admy {
    public apkn a;
    public String b;
    public String c;
    public int d;
    public aozy e;
    public apag f;

    public final admz a() {
        int i;
        String str;
        String str2;
        aozy aozyVar = this.e;
        if (aozyVar != null) {
            this.f = (apih) aozyVar.s();
        } else if (this.f == null) {
            this.f = (apih) apih.a.createBuilder().s();
        }
        apkn apknVar = this.a;
        if (apknVar != null && (i = this.d) != 0 && (str = this.b) != null && (str2 = this.c) != null) {
            return new admz(apknVar, i, str, str2, (apih) this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" requestState");
        }
        if (this.d == 0) {
            sb.append(" provisioningEngineWorker");
        }
        if (this.b == null) {
            sb.append(" requestId");
        }
        if (this.c == null) {
            sb.append(" provisioningSessionId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null provisioningSessionId");
    }

    public final void c(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new NullPointerException("Null requestId");
    }

    public final void d(apkn apknVar) {
        if (apknVar != null) {
            this.a = apknVar;
            return;
        }
        throw new NullPointerException("Null requestState");
    }

    public final aozy e() {
        if (this.e == null) {
            this.e = apih.a.createBuilder();
        }
        return this.e;
    }

    public final void f(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new NullPointerException("Null provisioningSessionId");
    }

    public final void g(apkn apknVar) {
        if (apknVar != null) {
            this.a = apknVar;
            return;
        }
        throw new NullPointerException("Null requestState");
    }
}
