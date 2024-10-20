package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class klc {
    static final utz a = uuh.i(uuh.b, "disable_logging_data_donation_event_logger", false);
    public final armf b;
    public final armf c;
    private final anen d;

    public klc(armf armfVar, armf armfVar2, anen anenVar) {
        this.b = armfVar;
        this.c = armfVar2;
        this.d = anenVar;
    }

    public final void a(int i) {
        aozy createBuilder = amjq.a.createBuilder();
        aozy createBuilder2 = amjm.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amjm amjmVar = (amjm) createBuilder2.b;
        amjmVar.c = i - 1;
        amjmVar.b |= 1;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amjq amjqVar = (amjq) createBuilder.b;
        amjm amjmVar2 = (amjm) createBuilder2.s();
        amjmVar2.getClass();
        amjqVar.c = amjmVar2;
        amjqVar.b = 3;
        c(createBuilder);
    }

    public final void b(int i) {
        aozy createBuilder = amjq.a.createBuilder();
        aozy createBuilder2 = amjn.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        amjn amjnVar = (amjn) createBuilder2.b;
        amjnVar.c = i - 1;
        amjnVar.b |= 1;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amjq amjqVar = (amjq) createBuilder.b;
        amjn amjnVar2 = (amjn) createBuilder2.s();
        amjnVar2.getClass();
        amjqVar.c = amjnVar2;
        amjqVar.b = 2;
        c(createBuilder);
    }

    public final void c(aozy aozyVar) {
        if (((Boolean) a.e()).booleanValue()) {
            return;
        }
        qiu.h(aktp.ah(new irs(this, aozyVar, 9, null), this.d));
    }
}
