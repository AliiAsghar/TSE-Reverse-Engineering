package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rqn implements rpi {
    private final /* synthetic */ rpm a = new rpm(rpp.g, rpr.g, rqm.a, rqo.b, null, rqo.a, 1, 16);

    @Override // defpackage.rpi
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.rpi
    public final void b(agpc agpcVar) {
        this.a.b(null);
    }

    @Override // defpackage.rpi
    public final void c() {
        this.a.c();
    }

    @Override // defpackage.rpi
    public final void d() {
        this.a.d();
    }

    @Override // defpackage.rpi
    public final void f() {
        this.a.f();
    }

    @Override // defpackage.rpi
    public final void g(int i, agpj agpjVar) {
        sfw sfwVar = new sfw(sfz.a);
        usk uskVar = sfz.d;
        sfwVar.c((sfs) uskVar.e, (sfs) uskVar.b);
        sfwVar.d(new rqa(10));
        rmo rmoVar = new rmo(rmq.a);
        rmoVar.s();
        sfw sfwVar2 = new sfw(sfz.a);
        sfwVar2.s();
        sfwVar2.d(new rqa(11));
        agog b = agoh.b(sfwVar2.b(), (agmh) sfz.d.e, (agmh) rmq.e.a);
        b.f = "message_id_map";
        rmo rmoVar2 = (rmo) rmoVar.j(b);
        sfw sfwVar3 = new sfw(sfz.a);
        sfwVar3.s();
        sfwVar3.d(new rqa(12));
        agog b2 = agoh.b(sfwVar3.b(), (agmh) sfz.d.e, (agmh) rmq.e.b);
        b2.f = "replied_to_message_id_map";
        agog b3 = agoh.b(((rmo) rmoVar2.j(b2)).b(), (agmh) rmq.e.a, (agmh) sfz.d.e);
        b3.f = "message_replies_map";
        sfw sfwVar4 = (sfw) sfwVar.j(b3);
        sfwVar4.n(new agpk("$V{J:message_id_map}", new Object[]{sfz.d.f}), "bugle_id");
        vom.u(sfwVar4, rpk.j, 1L, 5);
    }

    @Override // defpackage.rpi
    public final void e() {
    }
}
