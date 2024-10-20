package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uzv extends unp {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/message/delete/DeleteMessageHandler");
    public final Context b;
    public final anen c;
    public final anen d;
    public final armf e;
    public final mbl f;
    public final qik g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final armf l;
    public final armf m;
    public final armf n;
    public final tzn o;
    public final twk p;
    private final xoa q;

    public uzv(Context context, anen anenVar, anen anenVar2, armf armfVar, tzn tznVar, mbl mblVar, qik qikVar, armf armfVar2, armf armfVar3, armf armfVar4, xoa xoaVar, twk twkVar, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8) {
        this.b = context;
        this.c = anenVar;
        this.d = anenVar2;
        this.e = armfVar;
        this.o = tznVar;
        this.f = mblVar;
        this.g = qikVar;
        this.h = armfVar3;
        this.i = armfVar2;
        this.j = armfVar4;
        this.q = xoaVar;
        this.p = twkVar;
        this.k = armfVar5;
        this.l = armfVar6;
        this.m = armfVar7;
        this.n = armfVar8;
    }

    @Override // defpackage.unx
    public final akrh c() {
        return aktp.e("DeleteMessageHandler");
    }

    @Override // defpackage.unp
    protected final /* bridge */ /* synthetic */ akul d(uns unsVar, apbt apbtVar) {
        ahka ahkaVar;
        uzw uzwVar = (uzw) apbtVar;
        if (uzwVar.c.size() == 1) {
            ahkaVar = mgv.k;
        } else {
            ahkaVar = mgv.l;
        }
        return aktp.ah(new ung(this, ahkaVar, 6), this.c).i(new twe(this, uzwVar, 16), this.c).h(new uvz(this, ahkaVar, 5), this.c).f(Exception.class, new twe(this, ahkaVar, 17), this.c);
    }

    @Override // defpackage.unx
    public final apca e() {
        return uzw.a.getParserForType();
    }

    public final akul j(alog alogVar) {
        xoa xoaVar = this.q;
        return aktp.ai(new xfb(xoaVar, alogVar, 4, null), xoaVar.b).i(new xfn(xoaVar, 5), xoaVar.b).h(new uzs(alogVar, 0), this.c);
    }
}
