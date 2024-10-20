package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wkr extends unp {
    public static final xze a = xze.g("Bugle", "UnregisterGoogleRcsCallWorkItemHandler");
    private final anen b;
    private final armf c;
    private final vbu d;

    public wkr(anen anenVar, armf armfVar, vbu vbuVar) {
        this.b = anenVar;
        this.c = armfVar;
        this.d = vbuVar;
    }

    @Override // defpackage.unp, defpackage.unx
    public final unf a() {
        une a2 = unf.a();
        a2.c(unv.WAKELOCK);
        a2.d(5);
        a2.h(5000L);
        a2.g(gry.EXPONENTIAL);
        return a2.a();
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("UnregisterGoogleRcsCallWorkItemHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        wkq wkqVar = (wkq) apbtVar;
        if (wkqVar.c != 0 && !wkqVar.d.isEmpty()) {
            String l = this.d.l(wkqVar.c);
            if (TextUtils.isEmpty(l)) {
                xyo e = a.e();
                e.H("[SR]: Failed to get phoneNumber for subId, will retry.");
                e.l(wkqVar.c);
                e.q();
                return aktp.ag(upm.e());
            }
            xyo a2 = a.a();
            a2.H("[SR]: Calling UnregisterGoogleRcsRPC.");
            a2.j(l);
            a2.q();
            return ((vcc) this.c.b()).a(new vfm(l)).h(new whg(l, 15), this.b).e(Throwable.class, new whg(l, 16), this.b);
        }
        a.q("[SR]: Bad call to UnregisterGoogleRcsCall, ignoring.");
        return aktp.ag(upm.d());
    }

    @Override // defpackage.unx
    public final apca e() {
        return wkq.a.getParserForType();
    }
}
