package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversation;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Instant;
import j$.time.MonthDay;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fgh implements alhr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ fgh(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [evf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v104, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v116, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v122, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [evf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [evf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v75, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v79, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v95, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v99, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v57, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [evf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v74, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v26, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [armf, java.lang.Object] */
    @Override // defpackage.alhr
    public final Object get() {
        Object apply;
        int i = 15;
        int i2 = 13;
        int i3 = 16;
        int i4 = 12;
        int i5 = 1;
        boolean z = true;
        int i6 = 0;
        switch (this.c) {
            case 0:
                return fgj.a((Class) this.a, this.b);
            case 1:
                return fgj.a((Class) this.a, this.b);
            case 2:
                return fgj.a((Class) this.a, this.b);
            case 3:
                return new fho(this.b, ((fgi) this.a).a);
            case 4:
                tav tavVar = (tav) hwr.r((ConversationIdType) this.a).n();
                Object obj = this.b;
                try {
                    if (tavVar.moveToFirst()) {
                        String P = tavVar.P();
                        xze xzeVar = xca.a;
                        if (!msx.g(P) && tavVar.h() != 1) {
                            Optional ofNullable = Optional.ofNullable(tavVar.M());
                            msk mskVar = (msk) ((iki) obj).q.b();
                            mskVar.getClass();
                            Optional map = ofNullable.map(new ijs(mskVar, i4));
                            tavVar.close();
                            return map;
                        }
                    }
                    tavVar.close();
                    return Optional.empty();
                } finally {
                }
            case 5:
                ?? r0 = this.a;
                r0.getClass();
                alpr alprVar = new alpr();
                alpr alprVar2 = new alpr();
                for (Map.Entry entry : r0.entrySet()) {
                    Object obj2 = this.b;
                    long longValue = ((Number) entry.getKey()).longValue();
                    MonthDay monthDay = (MonthDay) entry.getValue();
                    alpr alprVar3 = new alpr();
                    alpr alprVar4 = new alpr();
                    snf e = sni.e();
                    e.w("insertBirthdaysInternal");
                    e.q();
                    e.h(new lcw(10));
                    agmh[] agmhVarArr = new agmh[i5];
                    agmhVarArr[i6] = sni.c.a;
                    e.t(agmhVarArr);
                    nei neiVar = (nei) obj2;
                    if (((okf) neiVar.e.b()).a()) {
                        smm smmVar = new smm(smp.a);
                        smmVar.w("BirthdaySyncDataStorage#withContact");
                        taz e2 = ParticipantsTable.e();
                        e2.g(new ilg(longValue, 5));
                        agog b = agoh.b(e2.b(), ParticipantsTable.c.a, (agmh) smp.d.c);
                        b.f = "participants";
                        agog b2 = agoh.b(((smm) smmVar.j(b)).b(), (agmh) smp.d.a, sni.c.a);
                        b2.f = "conversationParticipants";
                        e.A(b2.a());
                    } else {
                        sla a = sld.a();
                        a.w("BirthdaySyncDataStorage#withContact");
                        taz e3 = ParticipantsTable.e();
                        e3.g(new ilg(longValue, 6));
                        agog b3 = agoh.b(e3.b(), ParticipantsTable.c.a, (agmh) sld.e.e);
                        b3.f = "participants";
                        agog b4 = agoh.b(((sla) a.j(b3)).b(), (agmh) sld.e.d, sni.c.a);
                        b4.f = "conversationParticipants";
                        e.A(b4.a());
                    }
                    Instant f = ((xnv) neiVar.c).f();
                    Object e4 = ((utz) ier.d.get()).e();
                    e4.getClass();
                    long epochMilli = f.minusSeconds(((Number) e4).longValue()).toEpochMilli();
                    sxy d = MessagesTable.d();
                    d.w("recentOutgoingMessageExistsExpression");
                    d.g(new ilg(epochMilli, 4));
                    agov agovVar = new agov(d.b());
                    snh snhVar = new snh();
                    snhVar.W(agovVar);
                    e.g(snhVar);
                    e.b().w().forEach(new leq(new jze(alprVar4, neiVar, monthDay, alprVar3, 5), 7));
                    alpt g = alprVar3.g();
                    g.getClass();
                    alpt g2 = alprVar4.g();
                    g2.getClass();
                    lpq lpqVar = new lpq(g, g2);
                    alprVar.j(lpqVar.a);
                    alprVar2.j(lpqVar.b);
                    i5 = 1;
                    i6 = 0;
                }
                alpt g3 = alprVar2.g();
                g3.getClass();
                sjq sjqVar = new sjq();
                sjqVar.f("deleteBirthdaysNotIn");
                apply = new ldg(g3, 15).apply(new sju());
                sjqVar.a = new agpw((sju) apply);
                sjqVar.d();
                return alprVar.g();
            case 6:
                if (((osh) this.b.b()).a()) {
                    int i7 = 17;
                    return (alor) amdg.b(((mcd) this.a.b()).b).c(new ilu(i7)).d(new lvo(i7)).e(new lvo(i3)).f(new asqc(new mcb(i6), null));
                }
                return altc.a;
            case 7:
                if (((osh) this.b.b()).a()) {
                    return (alor) amdg.b(((mcd) this.a.b()).b).c(new ilu(i3)).d(new lvo(i)).e(new lvo(i3)).f(new asqc(new mcb(i5), null));
                }
                return altc.a;
            case 8:
                anen anenVar = (anen) ((lpg) this.b).a.b();
                anenVar.getClass();
                return new mjx(anenVar, (ifq) this.a);
            case 9:
                sng sngVar = new sng();
                sngVar.Q(false);
                sngVar.a.putNull("draft_snippet_text");
                sngVar.a.putNull("draft_subject_text");
                sngVar.a.putNull("draft_preview_content_type");
                sngVar.p();
                mmg mmgVar = (mmg) this.b;
                rtz rtzVar = (rtz) mmgVar.c.b();
                Object obj3 = this.a;
                sngVar.T(((Long) rtzVar.G((ConversationIdType) obj3).orElse(Long.valueOf(mmgVar.i.f().toEpochMilli()))).longValue());
                sngVar.X(new mjz(obj3, i2));
                if (sngVar.a().e() <= 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                alob alobVar = new alob();
                ?? r2 = this.a;
                int size = r2.size();
                while (i6 < size) {
                    Object obj4 = this.b;
                    ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) r2.get(i6);
                    ((rxq) ((mmw) obj4).g.b()).g(bindData);
                    alobVar.h(bindData);
                    i6++;
                }
                return alobVar.g();
            case 11:
                BugleConversation bugleConversation = ((RbmConversation) this.b).b;
                Object obj5 = this.a;
                mjg b5 = bugleConversation.b();
                lfl lflVar = (lfl) obj5;
                arwe arweVar = (arwe) lflVar.c.b();
                arweVar.getClass();
                arwe arweVar2 = (arwe) lflVar.b.b();
                arweVar2.getClass();
                ydk ydkVar = (ydk) lflVar.a.b();
                ydkVar.getClass();
                b5.getClass();
                return new nay(arweVar, arweVar2, lflVar.d, ydkVar, b5);
            case 12:
                uuf uufVar = mrk.a;
                if (((msy) this.b.get()).equals(msy.EMAIL)) {
                    return Optional.empty();
                }
                return this.a.get();
            case 13:
                return ((msx) ((mrk) this.b).e.b()).d((String) this.a);
            case 14:
                return Optional.of(((psq) ((mrk) this.b).f.b()).a((String) this.a, false));
            case 15:
                return ((Optional) this.a.get()).map(new moh(this.b, i2));
            case 16:
                String ag = albo.ag(this.a.m());
                mrk mrkVar = (mrk) this.b;
                apwt apwtVar = mrkVar.g;
                String ap = d.ap(ag);
                String q = ((yjr) apwtVar.b()).q(((msx) mrkVar.e.b()).d(ap));
                if (msx.g(ap)) {
                    return ap;
                }
                return q;
            case 17:
                uuf uufVar2 = mrk.a;
                return (String) ((Optional) this.b.get()).orElseGet(new ijm(this.a, i4));
            case 18:
                return ((yjr) ((mrk) this.b).g.b()).a((String) this.a.get());
            case 19:
                uuf uufVar3 = mrk.a;
                Optional optional = (Optional) this.b.get();
                Object obj6 = this.a;
                obj6.getClass();
                return (String) optional.orElseGet(new ijm(obj6, i4));
            default:
                uuf uufVar4 = mrk.a;
                return ((yjr) this.b).a((String) this.a.get());
        }
    }

    public /* synthetic */ fgh(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
