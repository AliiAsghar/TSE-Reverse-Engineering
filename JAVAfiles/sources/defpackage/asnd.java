package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asnd {
    public final asnl a;
    public final aslb b;
    public final asnh c;
    public asnn d;
    public asno e;
    public int f;
    public int g;
    public int h;
    public asmq i;

    public asnd(asnl asnlVar, aslb aslbVar, asnh asnhVar) {
        this.a = asnlVar;
        this.b = aslbVar;
        this.c = asnhVar;
    }

    public final void a(IOException iOException) {
        iOException.getClass();
        this.i = null;
        if ((iOException instanceof aspq) && ((aspq) iOException).a == 8) {
            this.f++;
        } else if (iOException instanceof asoh) {
            this.g++;
        } else {
            this.h++;
        }
    }

    public final boolean b(aslx aslxVar) {
        aslx aslxVar2 = this.b.h;
        if (aslxVar.d == aslxVar2.d && d.F(aslxVar.c, aslxVar2.c)) {
            return true;
        }
        return false;
    }
}
