package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbc extends arpw implements arqw {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbc(agmq agmqVar, arpe arpeVar, int i) {
        super(3, arpeVar);
        this.b = i;
        this.a = agmqVar;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, arxm] */
    /* JADX WARN: Type inference failed for: r4v9, types: [agmq, java.lang.Object] */
    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return new gbc((agmq) this.a, (arpe) obj3, 3).b(arnb.a);
                }
                return new gbc((kfs) this.a, (arpe) obj3, 2).b(arnb.a);
            }
            return new gbc((arxm) this.a, (arpe) obj3, 1).b(arnb.a);
        }
        new gbc((kkc) this.a, (arpe) obj3, 0);
        return a.I(arnb.a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, arxm] */
    /* JADX WARN: Type inference failed for: r3v8, types: [agmq, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    aqil.P(obj);
                    this.a.close();
                    return arnb.a;
                }
                aqil.P(obj);
                kfy kfyVar = ((kfs) this.a).g;
                if (kfyVar != null) {
                    kfyVar.close();
                }
                return arnb.a;
            }
            aqil.P(obj);
            this.a.v(null);
            return arnb.a;
        }
        return a.I(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbc(arxm arxmVar, arpe arpeVar, int i) {
        super(3, arpeVar);
        this.b = i;
        this.a = arxmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbc(kfs kfsVar, arpe arpeVar, int i) {
        super(3, arpeVar);
        this.b = i;
        this.a = kfsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbc(kkc kkcVar, arpe arpeVar, int i) {
        super(3, arpeVar);
        this.b = i;
        this.a = kkcVar;
    }
}
