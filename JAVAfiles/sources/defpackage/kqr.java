package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import com.google.android.apps.messaging.audio.attachment.AudioAttachmentView;
import com.google.android.apps.messaging.conversation.badges.BadgesRecyclerView;
import com.google.android.apps.messaging.shared.ui.attachment.MessageAttachmentContainer;
import com.google.android.apps.messaging.ui.attachment.AttachmentsContainer;
import com.google.android.apps.messaging.ui.attachment.video.VideoAttachmentView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kqr implements ibu, ihx, ihy, iia, iib, ijb, ijc, ith, iti, iyd, iye, jau, jav, jax, jay, kud, kue, kug, kuh, kxz, kya, ldp, ldq, xut, zkk, zkl, zkz, zla, zoq, zor, zpk, zpl, zrl, zrm, aacf, aacg, aagl, aagm, aajx, aajy, aayt, aayu, akvy, apxp {
    public final View a;
    public final krv b;
    public apya c;
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
    public final kqh p;
    public final kql q;
    private apya r;
    private apya s;
    private apya t;
    private apya u;
    private apya v;
    private apya w;
    private apya x;
    private final kqp y;
    private final kqr z;

    public kqr() {
        throw null;
    }

    private final aabr R() {
        return new aabr();
    }

    @Override // defpackage.aajx
    public final aajw A() {
        return new aajw(zfk.o(this.a));
    }

    @Override // defpackage.aayt
    public final aays B() {
        return new aays(zfk.p(this.a), this.b.yJ, this.q.cn);
    }

    @Override // defpackage.xut
    public final void C(MessageAttachmentContainer messageAttachmentContainer) {
        messageAttachmentContainer.e = (xum) this.y.ap.b();
        messageAttachmentContainer.g = new kor(Optional.empty(), Optional.empty());
        messageAttachmentContainer.f = this.b.a.ez;
    }

    @Override // defpackage.akvy
    public final aohs Q() {
        return (aohs) this.p.c.b();
    }

    @Override // defpackage.ibu
    public final void a(AudioAttachmentView audioAttachmentView) {
        audioAttachmentView.f = (zpt) this.b.ef.b();
        audioAttachmentView.n = (apuv) this.b.a.ew.b();
        audioAttachmentView.g = this.q.aG;
        audioAttachmentView.h = this.r;
        audioAttachmentView.i = this.s;
        audioAttachmentView.j = this.y.d;
        audioAttachmentView.k = this.p.c;
        audioAttachmentView.l = this.b.yF;
    }

    @Override // defpackage.ihx
    public final ihw b() {
        return new ihw(ifc.d(this.a));
    }

    @Override // defpackage.iia
    public final ihz d() {
        return new ihz(ifc.e(this.a), (zpt) this.b.ef.b());
    }

    @Override // defpackage.ijb
    public final ija f() {
        BadgesRecyclerView f = ifc.f(this.a);
        alor alorVar = altc.a;
        aksr aksrVar = (aksr) this.y.d.b();
        iiu iiuVar = new iiu((Context) this.b.n.b(), (wfh) this.b.ec.b());
        R();
        return new ija(f, alorVar, aksrVar, iiuVar, (wfh) this.b.ec.b());
    }

    @Override // defpackage.ith
    public final itf h() {
        return new itf();
    }

    @Override // defpackage.iyd
    public final iyc j() {
        apya apyaVar = this.t;
        R();
        return new iyc(apyaVar);
    }

    @Override // defpackage.jau
    public final jat l() {
        return new jat((xwr) this.b.pR.b(), (aohs) this.p.c.b(), ifc.k(this.a), (msk) this.b.dd.b());
    }

    @Override // defpackage.jax
    public final jaw n() {
        kql kqlVar = this.q;
        return new jaw((Optional) ((apxx) kqlVar.bs).a, new jas((ahmn) kqlVar.aG.b()), ifc.l(this.a));
    }

    @Override // defpackage.kud
    public final kuc p() {
        return new kuc(jsz.g(this.a));
    }

    @Override // defpackage.kug
    public final kuf q() {
        return new kuf(jsz.h(this.a), this.b.fd);
    }

    @Override // defpackage.kxz
    public final kxy r() {
        return new kxy(jsz.i(this.a), this.q.h(), this.b.a.ex);
    }

    @Override // defpackage.ldp
    public final ldo s() {
        return new ldo(jsz.j(this.a));
    }

    @Override // defpackage.zkk
    public final zki t() {
        return new zki(this.u);
    }

    @Override // defpackage.zkz
    public final zky u() {
        krv krvVar = this.b;
        return new zky(zfk.g(this.a), this.p.e, krvVar.bV, krvVar.yJ, krvVar.av, krvVar.dt, krvVar.gb, this.y.ag, krvVar.dM, krvVar.a.eA, krvVar.hk, krvVar.hp, krvVar.hq, krvVar.xe);
    }

    @Override // defpackage.zoq
    public final zop v() {
        AttachmentsContainer h = zfk.h(this.a);
        krv krvVar = this.b;
        apya apyaVar = krvVar.gD;
        apya apyaVar2 = krvVar.eh;
        apya apyaVar3 = krvVar.DD;
        apya apyaVar4 = krvVar.au;
        kql kqlVar = this.q;
        apya apyaVar5 = kqlVar.c;
        apya apyaVar6 = krvVar.je;
        apya apyaVar7 = krvVar.yJ;
        apya apyaVar8 = kqlVar.aF;
        kqp kqpVar = this.y;
        return new zop(h, apyaVar, apyaVar2, apyaVar3, apyaVar4, apyaVar5, apyaVar6, apyaVar7, apyaVar8, kqpVar.ap, kqpVar.d, kqlVar.eg, kqlVar.ei);
    }

    @Override // defpackage.zpk
    public final zpj w() {
        View view = this.a;
        VideoAttachmentView i = zfk.i(view);
        TypedArray C = aktp.C(view);
        kqh kqhVar = this.p;
        krv krvVar = this.b;
        return new zpj(i, C, krvVar.DD, krvVar.a.eB, kqhVar.m, this.q.aB, krvVar.cp);
    }

    @Override // defpackage.zrl
    public final zrb x() {
        return new zrb(this.b.pH, this.v);
    }

    @Override // defpackage.aacf
    public final aacd y() {
        return new aacd(zfk.m(this.a));
    }

    @Override // defpackage.aagl
    public final aagk z() {
        kql kqlVar = this.q;
        krv krvVar = this.b;
        return new aagk(this.w, this.x, this.y.d, krvVar.oB, krvVar.dO, krvVar.a.cX, kqlVar.bf);
    }

    public kqr(krv krvVar, kqp kqpVar, kqh kqhVar, kql kqlVar, View view) {
        this.z = this;
        this.b = krvVar;
        this.y = kqpVar;
        this.p = kqhVar;
        this.q = kqlVar;
        this.a = view;
        this.r = ksg.b;
        apya apyaVar = ksg.b;
        this.s = apyaVar;
        this.t = new kry(krvVar, kqpVar, kqhVar, kqlVar, this, 0);
        this.u = new kry(krvVar, kqpVar, kqhVar, kqlVar, this, 1);
        this.c = new kry(krvVar, kqpVar, kqhVar, kqlVar, this, 3);
        this.d = apyaVar;
        this.e = new kry(krvVar, kqpVar, kqhVar, kqlVar, this, 4);
        this.f = new kry(krvVar, kqpVar, kqhVar, kqlVar, this, 6);
        this.g = new kry(krvVar, kqpVar, kqhVar, kqlVar, this, 7);
        this.h = new kry(krvVar, kqpVar, kqhVar, kqlVar, this, 5);
        this.i = new kry(krvVar, kqpVar, kqhVar, kqlVar, this, 9);
        this.j = new kry(krvVar, kqpVar, kqhVar, kqlVar, this, 8);
        this.k = new kry(krvVar, kqpVar, kqhVar, kqlVar, this, 10);
        this.l = apyaVar;
        this.m = new kry(krvVar, kqpVar, kqhVar, kqlVar, this, 11);
        this.n = new kry(krvVar, kqpVar, kqhVar, kqlVar, this, 12);
        this.o = apyaVar;
        this.v = new kry(krvVar, kqpVar, kqhVar, kqlVar, this, 2);
        this.w = new kry(krvVar, kqpVar, kqhVar, kqlVar, this, 13);
        this.x = new kry(krvVar, kqpVar, kqhVar, kqlVar, this, 14);
    }

    @Override // defpackage.zor
    public final void D() {
    }

    @Override // defpackage.aacg
    public final void E() {
    }

    @Override // defpackage.zrm
    public final void F() {
    }

    @Override // defpackage.kya
    public final void G() {
    }

    @Override // defpackage.aajy
    public final void H() {
    }

    @Override // defpackage.kue
    public final void I() {
    }

    @Override // defpackage.kuh
    public final void J() {
    }

    @Override // defpackage.zkl
    public final void K() {
    }

    @Override // defpackage.zla
    public final void L() {
    }

    @Override // defpackage.aayu
    public final void M() {
    }

    @Override // defpackage.ldq
    public final void N() {
    }

    @Override // defpackage.aagm
    public final void O() {
    }

    @Override // defpackage.zpl
    public final void P() {
    }

    @Override // defpackage.ihy
    public final void c() {
    }

    @Override // defpackage.iib
    public final void e() {
    }

    @Override // defpackage.ijc
    public final void g() {
    }

    @Override // defpackage.iti
    public final void i() {
    }

    @Override // defpackage.iye
    public final void k() {
    }

    @Override // defpackage.jav
    public final void m() {
    }

    @Override // defpackage.jay
    public final void o() {
    }
}
