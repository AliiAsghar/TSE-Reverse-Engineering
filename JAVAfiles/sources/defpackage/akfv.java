package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akfv implements andy {
    final /* synthetic */ Object a;
    final /* synthetic */ akfy b;
    final /* synthetic */ algw c;
    final /* synthetic */ ahiy d;

    public akfv(ahiy ahiyVar, Object obj, akfy akfyVar, algw algwVar) {
        this.a = obj;
        this.b = akfyVar;
        this.c = algwVar;
        this.d = ahiyVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.andy
    public final void b(Object obj) {
        alpt i;
        Object obj2 = this.a;
        obj2.getClass();
        ahiy ahiyVar = this.d;
        synchronized (ahiyVar.b) {
            alpi alpiVar = new alpi();
            if (obj2 instanceof akfs) {
                alpl alplVar = (alpl) ahiyVar.a.get(obj2);
                if (alplVar != null) {
                    alpiVar.b(alplVar);
                }
            } else if (obj2 instanceof akfd) {
                aluq listIterator = ((akfd) obj2).b().listIterator();
                while (listIterator.hasNext()) {
                    alpl alplVar2 = (alpl) ahiyVar.a.get(listIterator.next());
                    if (alplVar2 != null) {
                        alpiVar.b(alplVar2);
                    }
                }
            } else {
                alpl alplVar3 = (alpl) ahiyVar.a.get(obj2);
                if (alplVar3 != null) {
                    alpiVar.b(alplVar3);
                }
            }
            i = alpiVar.a().i();
        }
        aluq listIterator2 = ((alqh) i).listIterator();
        while (listIterator2.hasNext()) {
            algw algwVar = this.c;
            akfz akfzVar = (akfz) listIterator2.next();
            if (algwVar.e() != akfzVar) {
                akfzVar.a(this.b);
            }
        }
    }

    @Override // defpackage.andy
    public final void a(Throwable th) {
    }
}
