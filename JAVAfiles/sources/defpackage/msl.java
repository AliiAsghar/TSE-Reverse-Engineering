package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class msl implements armf {
    private final /* synthetic */ int a;

    public /* synthetic */ msl(int i) {
        this.a = i;
    }

    @Override // defpackage.armf, defpackage.arme
    public final Object b() {
        switch (this.a) {
            case 0:
                return a.by();
            case 1:
                return a.by();
            case 2:
                return Optional.empty();
            case 3:
                rko a = rkq.a();
                a.s();
                a.n(new agpk("$V", new Object[]{rkq.e.c}), "backup_id");
                a.n(new agpk("$V{J:bugle_conversation_participants}", new Object[]{sld.e.c}), "bugle_id");
                rko rkoVar = (rko) ((rko) a.j(rpt.b())).j(rpt.c());
                sla a2 = sld.a();
                a2.s();
                agog a3 = agoh.a(a2.b());
                sfy sfyVar = new sfy();
                sfyVar.W(new agpk("$V{J:bugle_conversation_participants} = $V{J:convo_id_map}", new Object[]{sld.e.d, sfz.d.f}));
                sfyVar.W(new agpk("$V{J:bugle_conversation_participants} = $V{J:participant_id_map}", new Object[]{sld.e.e, sfz.d.f}));
                a3.e = new agpw(sfyVar);
                a3.f = "bugle_conversation_participants";
                return aqjn.B((rko) rkoVar.j(a3), rpt.a());
            case 4:
                rko a4 = rkq.a();
                a4.s();
                a4.n(new agpk("$V", new Object[]{rkq.e.c}), "backup_id");
                a4.n(new agpk("$V", new Object[]{-1}), "bugle_id");
                rko rkoVar2 = (rko) ((rko) a4.j(rpt.b())).j(rpt.c());
                smm smmVar = new smm(smp.a);
                smmVar.s();
                agog a5 = agoh.a(smmVar.b());
                sfy sfyVar2 = new sfy();
                sfyVar2.W(new agpk("$V{J:bugle_conversation_to_participants} = $V{J:convo_id_map}", new Object[]{smp.d.a, sfz.d.f}));
                sfyVar2.W(new agpk("$V{J:bugle_conversation_to_participants} = $V{J:participant_id_map}", new Object[]{smp.d.c, sfz.d.f}));
                a5.e = new agpw(sfyVar2);
                a5.f = "bugle_conversation_to_participants";
                return aqjn.B((rko) rkoVar2.j(a5), rpt.a());
            case 5:
                rkx rkxVar = new rkx(rkz.a);
                rkxVar.s();
                rkxVar.n(new agpk("$V", new Object[]{rkz.e.a}), "backup_id");
                rkxVar.n(new agpk("$V{J:bugle_conversation_pin}", new Object[]{slm.d.b}), "bugle_id");
                rkx rkxVar2 = (rkx) rkxVar.j(vom.w((agmh) rkz.e.c, rpk.a, "convo_id_map", false, 16));
                slk slkVar = new slk(slm.a);
                slkVar.s();
                agog a6 = agoh.a(slkVar.b());
                sfy sfyVar3 = new sfy();
                sfyVar3.W(new agpk("$V{J:bugle_conversation_pin} = $V{J:convo_id_map}", new Object[]{slm.d.d, sfz.d.f}));
                a6.e = new agpw(sfyVar3);
                a6.f = "bugle_conversation_pin";
                return aqjn.y((rkx) rkxVar2.j(a6));
            case 6:
                agpj agpjVar = rpy.a;
                rli a7 = rlk.a();
                a7.s();
                a7.n(new agpk("$V", new Object[]{rlk.e.u}), "backup_id");
                a7.n(new agpk("$V{J:bugle_conversations}", new Object[]{sni.c.a}), "bugle_id");
                a7.c((rld) rlk.e.u);
                snf e = sni.e();
                e.s();
                agog b = agoh.b(e.b(), sni.c.aa, (agmh) rlk.e.d);
                b.f = "bugle_conversations";
                rli a8 = rlk.a();
                a8.s();
                a8.n(new agpk("$V", new Object[]{rlk.e.u}), "backup_id");
                a8.n(new agpk("$V{J:bugle_conversations}", new Object[]{sni.c.a}), "bugle_id");
                snf e2 = sni.e();
                e2.s();
                agog b2 = agoh.b(e2.b(), sni.c.Z, (agmh) rlk.e.i);
                b2.f = "bugle_conversations";
                return aqjn.B((rli) a7.j(b), (rli) a8.j(b2));
            case 7:
                rlt rltVar = new rlt(rlv.a);
                rltVar.s();
                rltVar.n(new agpk("$V", new Object[]{rlv.d.c}), "backup_id");
                rltVar.n(new agpk("$V{J:bugle_link_preview}", new Object[]{sss.d.a}), "bugle_id");
                rlt rltVar2 = (rlt) rltVar.j(vom.w((agmh) rlv.d.e, rpk.b, "message_link_preview_id_map", false, 16));
                ssp c = sss.c();
                c.s();
                agog a9 = agoh.a(c.b());
                sfy sfyVar4 = new sfy();
                sfyVar4.W(new agpk("$V{J:bugle_link_preview} = $V{J:message_link_preview_id_map}", new Object[]{sss.d.b, sfz.d.f}));
                a9.e = new agpw(sfyVar4);
                a9.f = "bugle_link_preview";
                return aqjn.y((rlt) rltVar2.j(a9));
            case 8:
                rmf rmfVar = new rmf(rmh.a);
                rmfVar.s();
                rmfVar.c(new rqa(8));
                rmfVar.n(new agpk("$V", new Object[]{rmh.e.c}), "backup_id");
                rmfVar.n(new agpk("$V{J:bugle_message_reaction}", new Object[]{svq.d.d}), "bugle_id");
                agmh agmhVar = (agmh) rmh.e.b;
                rmf rmfVar2 = new rmf(rmh.a);
                rmfVar2.s();
                rmfVar2.c(new rqa(9));
                rmfVar2.n(new agpk("$V", new Object[]{rmh.e.c}), "backup_id");
                rmfVar2.n(new agpk("$V{J:bugle_message_reaction}", new Object[]{svq.d.d}), "bugle_id");
                return aqjn.B((rmf) ((rmf) rmfVar.j(vom.w(agmhVar, rpk.b, "message_id_map", false, 16))).j(rqk.a()), (rmf) ((rmf) rmfVar2.j(vom.w((agmh) rmh.e.b, rpk.b, "message_id_map", false, 16))).j(rqk.a()));
            case 9:
                rmo rmoVar = new rmo(rmq.a);
                rmoVar.s();
                rmoVar.n(new agpk("$V", new Object[]{rmq.e.a}), "backup_id");
                rmoVar.n(new agpk("$V{J:bugle_message_replies}", new Object[]{svz.d.a}), "bugle_id");
                rmo rmoVar2 = (rmo) rmoVar.j(vom.w((agmh) rmq.e.a, rpk.b, "messages_id_map", false, 16));
                svx svxVar = new svx(svz.a);
                svxVar.s();
                agog a10 = agoh.a(svxVar.b());
                sfy sfyVar5 = new sfy();
                sfyVar5.W(new agpk("$V{J:bugle_message_replies} = $V{J:messages_id_map}", new Object[]{svz.d.a, sfz.d.f}));
                a10.e = new agpw(sfyVar5);
                a10.f = "bugle_message_replies";
                return aqjn.y((rmo) rmoVar2.j(a10));
            case 10:
                rmx rmxVar = new rmx(rmz.a);
                rmxVar.s();
                rmxVar.n(new agpk("$V", new Object[]{rmz.e.b}), "backup_id");
                rmxVar.n(new agpk("$V{J:bugle_message_star}", new Object[]{sxc.d.b}), "bugle_id");
                rmx rmxVar2 = (rmx) rmxVar.j(vom.w((agmh) rmz.e.a, rpk.b, "message_star_id_map", false, 16));
                sxb sxbVar = new sxb(sxc.a);
                sxbVar.s();
                agog a11 = agoh.a(sxbVar.b());
                sfy sfyVar6 = new sfy();
                sfyVar6.W(new agpk("$V{J:bugle_message_star} = $V{J:message_star_id_map}", new Object[]{sxc.d.a, sfz.d.f}));
                a11.e = new agpw(sfyVar6);
                a11.f = "bugle_message_star";
                return aqjn.y((rmx) rmxVar2.j(a11));
            case 11:
                roz a12 = rpb.a();
                a12.s();
                a12.n(new agpk("$V", new Object[]{rpb.e.j}), "backup_id");
                a12.n(new agpk("$V{J:bugle_participants}", new Object[]{ParticipantsTable.c.a}), "bugle_id");
                taz e3 = ParticipantsTable.e();
                e3.s();
                tay b3 = e3.b();
                tas tasVar = ParticipantsTable.c.f;
                Object obj = rpb.e.g;
                tbd tbdVar = new tbd();
                tbdVar.W(rqw.b);
                agog q = b3.q(tasVar, (agmh) obj, new tbc(tbdVar));
                q.f = "bugle_participants";
                roz a13 = rpb.a();
                a13.s();
                a13.n(new agpk("$V", new Object[]{rpb.e.j}), "backup_id");
                a13.n(new agpk("$V{J:bugle_participants}", new Object[]{ParticipantsTable.c.a}), "bugle_id");
                taz e4 = ParticipantsTable.e();
                e4.s();
                agog b4 = agoh.b(e4.b(), ParticipantsTable.c.E, (agmh) rpb.e.e);
                b4.f = "bugle_participants";
                roz a14 = rpb.a();
                a14.s();
                a14.n(new agpk("$V", new Object[]{rpb.e.j}), "backup_id");
                a14.n(new agpk("$V{J:bugle_participants}", new Object[]{ParticipantsTable.c.a}), "bugle_id");
                taz e5 = ParticipantsTable.e();
                e5.s();
                agog a15 = agoh.a(e5.b());
                tbd tbdVar2 = new tbd();
                tbdVar2.W(rqw.c);
                tbdVar2.W(rqw.b);
                a15.e = new tbc(tbdVar2);
                a15.f = "bugle_participants";
                a14.A(a15.a());
                return aqjn.B((roz) a12.j(q), (roz) a13.j(b4), a14);
            case 12:
                return new abcf();
            case 13:
                return alfd.a;
            case 14:
                return Optional.empty();
            case 15:
                return new ahnb(null);
            case 16:
                return new ahoc(null);
            case 17:
                return new ahnv(null);
            case 18:
                ahok c2 = ahol.c();
                c2.b(false);
                return c2.a();
            case 19:
                return new ahox(2, TimeUnit.MINUTES.toMillis(5L) + TimeUnit.SECONDS.toMillis(20L), altg.a);
            default:
                return ahqj.c().e();
        }
    }
}
