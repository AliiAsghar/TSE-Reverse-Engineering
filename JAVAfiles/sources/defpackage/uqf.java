package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uqf implements unz {
    public final arwl a;
    public dtq b;
    public final akul c = akul.g(d.m(new uqe(this, 0)));
    private final arwe d;

    public uqf(arwl arwlVar, arwe arweVar) {
        this.a = arwlVar;
        this.d = arweVar;
    }

    @Override // defpackage.unz
    public final akul a() {
        return this.c;
    }

    @Override // defpackage.unz
    public final akul b() {
        akul c;
        c = qjh.c(this.d, arpj.a, arwf.a, new lfn(this, (arpe) null, 10));
        return c;
    }

    public final dtq c() {
        dtq dtqVar = this.b;
        if (dtqVar != null) {
            return dtqVar;
        }
        arro.b("completerForFirstAttempt");
        return null;
    }
}
