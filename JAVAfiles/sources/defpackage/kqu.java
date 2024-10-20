package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.apwz;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kqu implements apwz.a, apxp {
    private final kqu A;
    public final eog a;
    public final apwu b;
    public final krv c;
    public apya d;
    public apya e;
    public apya f;
    public apya g;
    public apya h;
    public apya i;
    public apya j;
    public apya k;
    public apya l;
    public apya m;
    public apya n;
    public apya o;
    private apya p;
    private apya q;
    private apya r;
    private apya s;
    private apya t;
    private apya u;
    private apya v;
    private apya w;
    private apya x;
    private apya y;
    private apya z;

    public kqu() {
        throw null;
    }

    @Override // apwz.a
    public final Map a() {
        return altc.a;
    }

    @Override // apwz.a
    public final Map b() {
        alok h = alor.h(11);
        h.h("ajxm$a", this.p);
        h.h("ifd", this.q);
        h.h("iks", this.r);
        h.h("jbo", this.s);
        h.h(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LAT, this.t);
        h.h("ajyv", this.u);
        h.h("aanw", this.v);
        h.h("akbs", this.w);
        h.h("lez", this.x);
        h.h("akgl", this.y);
        h.h("znz", this.z);
        return new apxy(h.b());
    }

    public final iew c() {
        return new iew(d(), (byte[]) null);
    }

    public final gpx d() {
        return new gpx((arwe) this.c.dO.b(), (arpi) this.c.dN.b(), (ansy) this.c.ct.b(), (ahiy) this.c.aC.b());
    }

    public kqu(krv krvVar, eog eogVar, apwu apwuVar) {
        this.A = this;
        this.c = krvVar;
        this.a = eogVar;
        this.b = apwuVar;
        this.d = ksg.a;
        this.p = new ksd(krvVar, this, 0);
        this.e = new ksd(krvVar, this, 3);
        this.f = new ksd(krvVar, this, 4);
        this.g = apxv.c(new ksd(krvVar, this, 5));
        this.h = new ksd(krvVar, this, 2);
        this.q = new ksd(krvVar, this, 1);
        this.i = new ksd(krvVar, this, 7);
        this.j = new ksd(krvVar, this, 8);
        this.k = new ksd(krvVar, this, 9);
        this.l = new ksd(krvVar, this, 10);
        this.r = new ksd(krvVar, this, 6);
        this.m = new ksd(krvVar, this, 12);
        this.s = new ksd(krvVar, this, 11);
        this.t = new ksd(krvVar, this, 13);
        this.u = new ksd(krvVar, this, 14);
        this.n = apye.a(new ksd(krvVar, this, 17));
        this.o = apxv.c(new ksd(krvVar, this, 16));
        this.v = new ksd(krvVar, this, 15);
        this.w = new ksd(krvVar, this, 18);
        this.x = new ksd(krvVar, this, 19);
        this.y = new ksd(krvVar, this, 20);
        this.z = new ksd(krvVar, this, 21);
    }
}
