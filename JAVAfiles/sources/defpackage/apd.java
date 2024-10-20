package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class apd implements aqp {
    private final arqv a;
    private long b = dqt.l(0, 0, 15);
    private float c;
    private aqo d;

    public apd(arqv arqvVar) {
        this.a = arqvVar;
    }

    @Override // defpackage.aqp
    public final aqo a(dqv dqvVar, long j) {
        if (this.d != null && a.bB(this.b, j) && this.c == dqvVar.ec()) {
            aqo aqoVar = this.d;
            aqoVar.getClass();
            return aqoVar;
        }
        this.b = j;
        this.c = dqvVar.ec();
        aqo aqoVar2 = (aqo) this.a.a(dqvVar, new dqs(j));
        this.d = aqoVar2;
        return aqoVar2;
    }
}
