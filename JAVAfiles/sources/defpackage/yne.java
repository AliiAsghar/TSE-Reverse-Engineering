package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yne extends arrp implements arqr {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yne(int i, int i2, int i3) {
        super(1);
        this.c = i3;
        this.b = i;
        this.a = i2;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        if (this.c != 0) {
            ahlp ahlpVar = (ahlp) obj;
            ahlpVar.getClass();
            aozy createBuilder = amqo.a.createBuilder();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            int i = this.b;
            apag apagVar = createBuilder.b;
            amqo amqoVar = (amqo) apagVar;
            amqoVar.c = i - 1;
            amqoVar.b = 1 | amqoVar.b;
            int i2 = this.a;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            amqo amqoVar2 = (amqo) createBuilder.b;
            amqoVar2.d = i2 - 1;
            amqoVar2.b |= 2;
            amqo amqoVar3 = (amqo) createBuilder.s();
            amqoVar3.getClass();
            Object obj2 = ahlpVar.a;
            aozy aozyVar = (aozy) obj2;
            if (!aozyVar.b.isMutable()) {
                aozyVar.u();
            }
            amqn amqnVar = (amqn) ((amqm) obj2).b;
            amqn amqnVar2 = amqn.a;
            amqnVar.c = amqoVar3;
            amqnVar.b = 4;
            return arnb.a;
        }
        ahmn ahmnVar = (ahmn) obj;
        ahmnVar.getClass();
        aozy createBuilder2 = amzd.a.createBuilder();
        createBuilder2.getClass();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        int i3 = this.a;
        int i4 = this.b;
        amzd amzdVar = (amzd) createBuilder2.b;
        amzdVar.c = i4 - 1;
        amzdVar.b |= 1;
        Object e = ynf.a.e();
        e.getClass();
        long min = Math.min(i3, ((Number) e).longValue());
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amzd amzdVar2 = (amzd) createBuilder2.b;
        amzdVar2.b |= 2;
        amzdVar2.d = min;
        apag s = createBuilder2.s();
        s.getClass();
        Object obj3 = ahmnVar.a;
        amzd amzdVar3 = (amzd) s;
        aozy aozyVar2 = (aozy) obj3;
        if (!aozyVar2.b.isMutable()) {
            aozyVar2.u();
        }
        amzc amzcVar = (amzc) ((amzb) obj3).b;
        amzc amzcVar2 = amzc.a;
        amzcVar.c = amzdVar3;
        amzcVar.b = 1;
        return arnb.a;
    }
}
