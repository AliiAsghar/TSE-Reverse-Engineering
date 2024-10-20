package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arpn extends arps {
    final /* synthetic */ arqv a;
    final /* synthetic */ Object b;
    private int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arpn(arpe arpeVar, arpi arpiVar, arqv arqvVar, Object obj) {
        super(arpeVar, arpiVar);
        this.a = arqvVar;
        this.b = obj;
    }

    @Override // defpackage.arpq
    protected final Object b(Object obj) {
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                this.c = 2;
                aqil.P(obj);
                return obj;
            }
            throw new IllegalStateException("This coroutine had already completed");
        }
        this.c = 1;
        aqil.P(obj);
        arqv arqvVar = this.a;
        arsd.g(arqvVar, 2);
        return arqvVar.a(this.b, this);
    }
}
