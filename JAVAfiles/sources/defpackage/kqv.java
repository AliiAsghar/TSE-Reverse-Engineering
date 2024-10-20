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
public final class kqv implements ibu, ihx, ihy, iia, iib, ijb, ijc, ith, iti, iyd, iye, jau, jav, jax, jay, kud, kue, kug, kuh, kxz, kya, ldp, ldq, xut, zkk, zkl, zkz, zla, zoq, zor, zpk, zpl, zrl, zrm, aacf, aacg, aagl, aagm, aajx, aajy, aayt, aayu, akvy, apxp {
    private apya A;
    private apya B;
    private final kqm C;
    private final kqv D;
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
    public apya p;
    public apya q;
    public apya r;
    public apya s;
    public final kqj t;
    private apya u;
    private apya v;
    private apya w;
    private apya x;
    private apya y;
    private apya z;

    public kqv() {
        throw null;
    }

    @Override // defpackage.aajx
    public final aajw A() {
        return new aajw(zfk.o(this.a));
    }

    @Override // defpackage.aayt
    public final aays B() {
        return new aays(zfk.p(this.a), this.b.yJ, this.C.ag);
    }

    @Override // defpackage.xut
    public final void C(MessageAttachmentContainer messageAttachmentContainer) {
        messageAttachmentContainer.e = (xum) this.b.a.gT.b();
        messageAttachmentContainer.g = new kor(Optional.empty(), Optional.empty());
        messageAttachmentContainer.f = this.b.a.ez;
    }

    @Override // defpackage.akvy
    public final aohs Q() {
        return (aohs) this.t.aG.b();
    }

    @Override // defpackage.ibu
    public final void a(AudioAttachmentView audioAttachmentView) {
        audioAttachmentView.f = (zpt) this.b.ef.b();
        audioAttachmentView.n = (apuv) this.b.a.ew.b();
        kqj kqjVar = this.t;
        audioAttachmentView.g = kqjVar.aJ;
        audioAttachmentView.h = this.u;
        audioAttachmentView.i = this.v;
        krv krvVar = this.b;
        audioAttachmentView.j = krvVar.at;
        audioAttachmentView.k = kqjVar.aG;
        audioAttachmentView.l = krvVar.yF;
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
        aksr aksrVar = (aksr) this.b.at.b();
        iiu iiuVar = new iiu((Context) this.b.n.b(), (wfh) this.b.ec.b());
        this.C.v();
        return new ija(f, alorVar, aksrVar, iiuVar, (wfh) this.b.ec.b());
    }

    @Override // defpackage.ith
    public final itf h() {
        return new itf();
    }

    @Override // defpackage.iyd
    public final iyc j() {
        apya apyaVar = this.w;
        this.C.v();
        return new iyc(apyaVar);
    }

    @Override // defpackage.jau
    public final jat l() {
        return new jat((xwr) this.b.pR.b(), (aohs) this.t.aG.b(), ifc.k(this.a), (msk) this.b.dd.b());
    }

    @Override // defpackage.jax
    public final jaw n() {
        return new jaw((Optional) ((apxx) this.x).a, new jas((ahmn) this.t.aJ.b()), ifc.l(this.a));
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
        return new kxy(jsz.i(this.a), this.t.z(), this.b.a.ex);
    }

    @Override // defpackage.ldp
    public final ldo s() {
        return new ldo(jsz.j(this.a));
    }

    @Override // defpackage.zkk
    public final zki t() {
        return new zki(this.y);
    }

    @Override // defpackage.zkz
    public final zky u() {
        krv krvVar = this.b;
        krx krxVar = krvVar.a;
        return new zky(zfk.g(this.a), this.t.c, krvVar.bV, krvVar.yJ, krvVar.av, krvVar.dt, krvVar.gb, krxVar.fP, krvVar.dM, krxVar.eA, krvVar.hk, krvVar.hp, krvVar.hq, krvVar.xe);
    }

    @Override // defpackage.zoq
    public final zop v() {
        AttachmentsContainer h = zfk.h(this.a);
        krv krvVar = this.b;
        apya apyaVar = krvVar.gD;
        apya apyaVar2 = krvVar.eh;
        apya apyaVar3 = krvVar.DD;
        apya apyaVar4 = krvVar.au;
        krx krxVar = krvVar.a;
        apya apyaVar5 = krxVar.cq;
        apya apyaVar6 = krvVar.je;
        apya apyaVar7 = krvVar.yJ;
        apya apyaVar8 = krxVar.dp;
        apya apyaVar9 = krxVar.gT;
        apya apyaVar10 = krvVar.at;
        kqm kqmVar = this.C;
        return new zop(h, apyaVar, apyaVar2, apyaVar3, apyaVar4, apyaVar5, apyaVar6, apyaVar7, apyaVar8, apyaVar9, apyaVar10, kqmVar.bg, kqmVar.v);
    }

    @Override // defpackage.zpk
    public final zpj w() {
        View view = this.a;
        VideoAttachmentView i = zfk.i(view);
        TypedArray C = aktp.C(view);
        kqj kqjVar = this.t;
        krv krvVar = this.b;
        return new zpj(i, C, krvVar.DD, krvVar.a.eB, kqjVar.p, kqjVar.au, krvVar.cp);
    }

    @Override // defpackage.zrl
    public final zrb x() {
        return new zrb(this.b.pH, this.z);
    }

    @Override // defpackage.aacf
    public final aacd y() {
        return new aacd(zfk.m(this.a));
    }

    @Override // defpackage.aagl
    public final aagk z() {
        krv krvVar = this.b;
        krx krxVar = krvVar.a;
        return new aagk(this.A, this.B, krvVar.at, krvVar.oB, krvVar.dO, krxVar.cX, krxVar.cS);
    }

    public kqv(krv krvVar, kqj kqjVar, kqm kqmVar, View view) {
        this.D = this;
        this.b = krvVar;
        this.t = kqjVar;
        this.C = kqmVar;
        this.a = view;
        this.u = ksg.b;
        apya apyaVar = ksg.b;
        this.v = apyaVar;
        this.w = new ksf(krvVar, kqjVar, kqmVar, this, 0);
        this.x = apyaVar;
        this.y = new ksf(krvVar, kqjVar, kqmVar, this, 1);
        this.c = new ksf(krvVar, kqjVar, kqmVar, this, 3);
        this.d = apyaVar;
        this.e = new ksf(krvVar, kqjVar, kqmVar, this, 4);
        this.f = new ksf(krvVar, kqjVar, kqmVar, this, 6);
        this.g = new ksf(krvVar, kqjVar, kqmVar, this, 7);
        this.h = new ksf(krvVar, kqjVar, kqmVar, this, 5);
        this.i = new ksf(krvVar, kqjVar, kqmVar, this, 9);
        this.j = new ksf(krvVar, kqjVar, kqmVar, this, 8);
        this.k = new ksf(krvVar, kqjVar, kqmVar, this, 10);
        this.l = apyaVar;
        this.m = new ksf(krvVar, kqjVar, kqmVar, this, 11);
        this.n = new ksf(krvVar, kqjVar, kqmVar, this, 12);
        this.o = new ksf(krvVar, kqjVar, kqmVar, this, 13);
        this.p = new ksf(krvVar, kqjVar, kqmVar, this, 14);
        this.q = apyaVar;
        this.r = new ksf(krvVar, kqjVar, kqmVar, this, 15);
        this.s = apyaVar;
        this.z = new ksf(krvVar, kqjVar, kqmVar, this, 2);
        this.A = new ksf(krvVar, kqjVar, kqmVar, this, 16);
        this.B = new ksf(krvVar, kqjVar, kqmVar, this, 17);
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
