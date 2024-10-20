package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ihv implements uvn {
    public final anen a;
    public final oau b;
    public final oav c;
    public final nyf d;
    public final nzn e;
    public final armf f;
    private final qif g;
    private final anen h;
    private final uqg i;
    private final uqg j;

    public ihv(qif qifVar, anen anenVar, anen anenVar2, uqg uqgVar, uqg uqgVar2, oau oauVar, oav oavVar, nyf nyfVar, nzn nznVar, armf armfVar) {
        this.g = qifVar;
        this.a = anenVar;
        this.h = anenVar2;
        this.j = uqgVar;
        this.i = uqgVar2;
        this.c = oavVar;
        this.b = oauVar;
        this.d = nyfVar;
        this.e = nznVar;
        this.f = armfVar;
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7, types: [arwe, java.lang.Object] */
    public final akul a(boolean z) {
        akul c;
        StringWriter stringWriter = new StringWriter();
        if (z) {
            uqg uqgVar = this.j;
            c = qjh.c(uqgVar.c, arpj.a, arwf.a, new tyi(uqgVar, new PrintWriter(stringWriter), null, 4, null, null));
        } else {
            uqg uqgVar2 = this.i;
            c = qjh.c(uqgVar2.d, arpj.a, arwf.a, new tyi(uqgVar2, new PrintWriter(stringWriter), (arpe) null, 6, (byte[]) null));
        }
        return c.h(new icj(stringWriter, 9), this.a);
    }

    @Override // defpackage.uvn
    public final /* synthetic */ akul b() {
        return uvl.b();
    }

    @Override // defpackage.uvn
    public final akul c() {
        return aktp.aj(new ikm(this, 1), this.h);
    }

    @Override // defpackage.uvn
    public final akul d() {
        return this.g.d().h(new icj(this, 8), this.a).i(new ici(this, 5), this.a).h(new ezr(13), this.a);
    }
}
