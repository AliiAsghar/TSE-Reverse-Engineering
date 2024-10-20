package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anst extends anss {
    private final long[] d;

    anst() {
        super(new long[10], new long[10], new long[10]);
        this.d = new long[10];
    }

    @Override // defpackage.anss
    public final void b(long[] jArr, long[] jArr2) {
        ansz.b(jArr, jArr2, this.d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anst(ansy ansyVar) {
        super(new long[10], new long[10], new long[10]);
        long[] jArr = new long[10];
        this.d = jArr;
        long[] jArr2 = this.a;
        asqe asqeVar = (asqe) ansyVar.a;
        ansz.j(jArr2, (long[]) asqeVar.b, (long[]) asqeVar.a);
        long[] jArr3 = this.b;
        asqe asqeVar2 = (asqe) ansyVar.a;
        ansz.i(jArr3, (long[]) asqeVar2.b, (long[]) asqeVar2.a);
        System.arraycopy(((asqe) ansyVar.a).c, 0, jArr, 0, 10);
        ansz.b(this.c, (long[]) ansyVar.b, ansv.b);
    }
}
