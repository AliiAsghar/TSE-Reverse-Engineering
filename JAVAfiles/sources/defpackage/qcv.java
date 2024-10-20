package defpackage;

import com.google.android.rcs.client.messaging.data.IsComposingMessage;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qcv {
    public static final xze a = xze.g("BugleDataModel", "IncomingIsComposingProcessor");
    public static final Duration b = Duration.ofMinutes(2);
    public final vsh c;
    public final xnv d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final jat i;
    public final usk j;
    private final anen k;
    private final anen l;

    public qcv(vsh vshVar, jat jatVar, usk uskVar, xnv xnvVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, anen anenVar, anen anenVar2) {
        this.c = vshVar;
        this.i = jatVar;
        this.j = uskVar;
        this.d = xnvVar;
        this.e = armfVar;
        this.f = armfVar2;
        this.g = armfVar3;
        this.h = armfVar4;
        this.k = anenVar;
        this.l = anenVar2;
    }

    public final akul a(IsComposingMessage isComposingMessage, qfo qfoVar) {
        return aktp.ai(new qpk(this, qfoVar, 1), this.l).i(new qbt((Object) this, (Object) qfoVar, (Object) isComposingMessage, 5, (byte[]) null), this.k);
    }
}
