package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rvu implements rwf {
    public static final utz a = uuh.i(uuh.b, "bug_204470084_enable_message_list_data_decoration_latency_timer", true);
    private static final ahka c = new ahka("MessageListDataDecorationLatency");
    public final Set b;
    private final ahqr d;

    public rvu(Set set, ahqr ahqrVar) {
        set.getClass();
        ahqrVar.getClass();
        this.b = set;
        this.d = ahqrVar;
    }

    @Override // defpackage.rwf
    public final void a(rry rryVar) {
        rryVar.getClass();
        ahka ahkaVar = c;
        ahkaVar.getClass();
        quz quzVar = new quz(this, rryVar, 6, null);
        if (!((Boolean) a.e()).booleanValue()) {
            quzVar.a();
            return;
        }
        ahqr ahqrVar = this.d;
        ahqq d = ahqrVar.d();
        ahqp ahqpVar = ahqp.SUCCESS;
        try {
            try {
                quzVar.a();
            } catch (Exception e) {
                ahqpVar = ahqp.ERROR;
                throw e;
            }
        } finally {
            ahqrVar.f(d, ahkaVar, null, ahqpVar);
        }
    }
}
