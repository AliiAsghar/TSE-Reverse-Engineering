package defpackage;

import com.google.android.rcs.client.messaging.RcsMessagingService;
import java.util.function.BiFunction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vyk implements vyo {
    public static final xze a = xze.g("BugleRcs", "GetMessagesMethod");
    public final anen b;
    public final vza c;
    public final qco d;
    public final zap e;
    private final anen f;
    private final anen g;
    private final ylg h;
    private final BiFunction i;
    private final vyi j;

    public vyk(anen anenVar, anen anenVar2, anen anenVar3, qco qcoVar, zap zapVar, ylg ylgVar, BiFunction biFunction, vyi vyiVar, vza vzaVar) {
        this.f = anenVar;
        this.g = anenVar2;
        this.d = qcoVar;
        this.e = zapVar;
        this.b = anenVar3;
        this.h = ylgVar;
        this.i = biFunction;
        this.j = vyiVar;
        this.c = vzaVar;
    }

    @Override // defpackage.vyo
    public final akul a(qgr qgrVar) {
        return this.j.a(this.h.a(this.i, RcsMessagingService.class).h(new vsw(15), this.g).i(new vek(this, 16), this.f), "GetMessages");
    }

    @Override // defpackage.vyo
    public final /* synthetic */ void b() {
    }
}
