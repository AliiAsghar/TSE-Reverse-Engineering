package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akrv implements aksb {
    private final /* synthetic */ int a;

    public akrv(int i) {
        this.a = i;
    }

    @Override // defpackage.aksb
    public final akry a() {
        if (this.a != 0) {
            akru b = akqj.b();
            akry akryVar = b.c;
            if (akryVar == null) {
                if (akqu.k(b).b) {
                    return new akra(b);
                }
                return akrf.a;
            }
            return akryVar;
        }
        return akqj.e();
    }
}
