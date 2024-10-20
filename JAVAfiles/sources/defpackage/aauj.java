package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aauj {
    private final amqj a;

    public aauj() {
    }

    public static aauj a(amqh amqhVar, amqi amqiVar) {
        aozy createBuilder = amqj.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amqj amqjVar = (amqj) apagVar;
        amqjVar.c = amqhVar.v;
        amqjVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        amqj amqjVar2 = (amqj) createBuilder.b;
        amqjVar2.d = amqiVar.e;
        amqjVar2.b |= 2;
        return new aauj((amqj) createBuilder.s());
    }

    public final void b(aozy aozyVar) {
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        amqj amqjVar = this.a;
        amoq amoqVar = (amoq) aozyVar.b;
        amoq amoqVar2 = amoq.a;
        amoqVar.d = amqjVar;
        amoqVar.c = 101;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aauj) {
            return this.a.equals(((aauj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "AttachmentScreenOrigin{screen=" + this.a.toString() + "}";
    }

    public aauj(amqj amqjVar) {
        this();
        if (amqjVar == null) {
            throw new NullPointerException("Null screen");
        }
        this.a = amqjVar;
    }
}
