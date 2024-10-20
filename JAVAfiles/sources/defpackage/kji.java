package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kji extends arsm {
    final /* synthetic */ kjj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kji(Object obj, kjj kjjVar) {
        super(obj);
        this.a = kjjVar;
    }

    @Override // defpackage.arsm
    protected final void a(artm artmVar, Object obj, Object obj2) {
        ahqp ahqpVar;
        kjg kjgVar = (kjg) obj2;
        kjg kjgVar2 = (kjg) obj;
        if (kjgVar2 != kjgVar) {
            kjg kjgVar3 = kjg.a;
            if (kjgVar == kjgVar3) {
                kjj kjjVar = this.a;
                kjjVar.g.g(abaw.a, kjjVar.e.incrementAndGet());
            } else if (kjgVar2 == kjgVar3) {
                kjj kjjVar2 = this.a;
                ahka ahkaVar = abaw.a;
                int i = kjjVar2.e.get();
                if (kjgVar == kjg.c) {
                    ahqpVar = ahqp.CANCEL;
                } else {
                    ahqpVar = ahqp.SUCCESS;
                }
                kjjVar2.g.k(ahkaVar, i, null, ahqpVar);
            }
        }
    }
}
