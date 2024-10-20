package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class wfz implements akbp<apdj<wfy>, Void> {
    final /* synthetic */ xze a;

    public wfz(xze xzeVar) {
        this.a = xzeVar;
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void a(Object obj, Throwable th) {
        apdj apdjVar = (apdj) obj;
        int Z = a.Z(((wfy) apdjVar.a(wfy.a, aozs.a())).c);
        if (Z == 0) {
            Z = 1;
        }
        Integer valueOf = Integer.valueOf(a.ak(Z));
        int af = a.af(((wfy) apdjVar.a(wfy.a, aozs.a())).d);
        if (af == 0) {
            af = 1;
        }
        this.a.q(String.format("Error while trying to store PhoneNumberInputUIEvent, Source: %s, EventType: %s, Failure: %s", valueOf, Integer.valueOf(a.aq(af)), th.getMessage()));
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void c(Object obj, Object obj2) {
        apdj apdjVar = (apdj) obj;
        wfx b = wfx.b(((wfy) apdjVar.a(wfy.a, aozs.a())).h);
        if (b == null) {
            b = wfx.UNRECOGNIZED;
        }
        Integer valueOf = Integer.valueOf(b.a());
        int Z = a.Z(((wfy) apdjVar.a(wfy.a, aozs.a())).c);
        if (Z == 0) {
            Z = 1;
        }
        Integer valueOf2 = Integer.valueOf(a.ak(Z));
        int af = a.af(((wfy) apdjVar.a(wfy.a, aozs.a())).d);
        if (af == 0) {
            af = 1;
        }
        this.a.l(String.format("Successfully stored PhoneNumberInputUIEvent, UiVariant: %s, Source: %s, EventType: %s", valueOf, valueOf2, Integer.valueOf(a.aq(af))));
    }

    @Override // defpackage.akbp
    public final /* synthetic */ void b(Object obj) {
    }
}
