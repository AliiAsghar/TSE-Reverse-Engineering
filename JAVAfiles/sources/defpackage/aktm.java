package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aktm implements algk {
    final /* synthetic */ akry a;
    final /* synthetic */ algk b;

    public aktm(akry akryVar, algk algkVar) {
        this.a = akryVar;
        this.b = algkVar;
    }

    @Override // defpackage.algk
    public final Object apply(Object obj) {
        akry h = akqj.h(akqj.b(), this.a);
        try {
            return this.b.apply(obj);
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}
