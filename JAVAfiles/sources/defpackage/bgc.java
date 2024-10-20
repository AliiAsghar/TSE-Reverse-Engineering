package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bgc extends arrp implements arqg<bin> {
    final /* synthetic */ bgd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgc(bgd bgdVar) {
        super(0);
        this.a = bgdVar;
    }

    @Override // defpackage.arqg
    public final /* bridge */ /* synthetic */ Object a() {
        long j = ((cku) cwn.a(this.a, bfy.a)).i;
        if (((bfs) cwn.a(this.a, bft.a)).m()) {
            if (ckw.a(j) > 0.5d) {
                return bgx.b;
            }
            return bgx.c;
        }
        return bgx.d;
    }
}
