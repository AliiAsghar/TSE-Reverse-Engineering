package defpackage;

import com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class irs implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ irs(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v69, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v75, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r3v53, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.Map, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        alog n;
        String str;
        boolean z;
        int i = 5;
        switch (this.c) {
            case 0:
                ((irw) this.a).e.remove(this.b);
                return;
            case 1:
                ?? r1 = this.a;
                if (r1.isEmpty()) {
                    int i2 = alog.d;
                    n = alsx.a;
                } else {
                    n = alog.n(r1);
                }
                ((ioy) this.b).c = n;
                return;
            case 2:
                ((irw) this.a).e.remove(this.b);
                return;
            case 3:
                ((irw) this.a).f.remove(this.b);
                return;
            case 4:
                ((irw) this.a).g.remove(this.b);
                return;
            case 5:
                itm itmVar = (itm) this.b;
                itmVar.f.e();
                int i3 = 0;
                while (true) {
                    hk hkVar = itmVar.f;
                    if (i3 < hkVar.g) {
                        rry rryVar = (rry) hkVar.d(i3);
                        alpr alprVar = new alpr();
                        String F = rryVar.F();
                        if (F != null) {
                            alprVar.c(F);
                        }
                        RepliedToDataAdapter repliedToDataAdapter = rryVar.r;
                        if (repliedToDataAdapter != null) {
                            str = repliedToDataAdapter.a();
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            alprVar.c(str);
                        }
                        aluq listIterator = alprVar.g().listIterator();
                        boolean z2 = false;
                        while (listIterator.hasNext()) {
                            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) this.a.get((String) listIterator.next());
                            if (bindData != null) {
                                if (Objects.equals(rryVar.b.P(), bindData.M()) && !rryVar.c.equals(bindData)) {
                                    rryVar.i.e(bindData);
                                    rryVar.c = bindData;
                                    z = true;
                                } else {
                                    z = false;
                                }
                                RepliedToDataAdapter repliedToDataAdapter2 = rryVar.r;
                                if (repliedToDataAdapter2 != null && Objects.equals(repliedToDataAdapter2.a(), bindData.M())) {
                                    RepliedToDataAdapter repliedToDataAdapter3 = rryVar.r;
                                    ltq ltqVar = repliedToDataAdapter3.a.d;
                                    if (ltqVar == null) {
                                        ltqVar = ltq.a;
                                    }
                                    ltr ltrVar = ltqVar.c;
                                    if (ltrVar == null) {
                                        ltrVar = ltr.a;
                                    }
                                    if (ltrVar.b == 3) {
                                        if (d.F(repliedToDataAdapter3.a(), bindData.M())) {
                                            aozy builder = repliedToDataAdapter3.a.toBuilder();
                                            builder.getClass();
                                            ltq ltqVar2 = ((ltu) builder.b).d;
                                            if (ltqVar2 == null) {
                                                ltqVar2 = ltq.a;
                                            }
                                            ltqVar2.getClass();
                                            aozy builder2 = ltqVar2.toBuilder();
                                            builder2.getClass();
                                            ltr ltrVar2 = (ltr) new ltk(bindData).i.a();
                                            ltrVar2.getClass();
                                            if (!builder2.b.isMutable()) {
                                                builder2.u();
                                            }
                                            ltq ltqVar3 = (ltq) builder2.b;
                                            ltqVar3.c = ltrVar2;
                                            ltqVar3.b |= 1;
                                            apag s = builder2.s();
                                            s.getClass();
                                            ltq ltqVar4 = (ltq) s;
                                            if (!builder.b.isMutable()) {
                                                builder.u();
                                            }
                                            ltu ltuVar = (ltu) builder.b;
                                            ltuVar.d = ltqVar4;
                                            ltuVar.b |= 1;
                                            apag s2 = builder.s();
                                            s2.getClass();
                                            RepliedToDataAdapter repliedToDataAdapter4 = new RepliedToDataAdapter((ltu) s2);
                                            if (!repliedToDataAdapter4.equals(rryVar.r)) {
                                                rryVar.r = repliedToDataAdapter4;
                                                z = true;
                                            }
                                        } else {
                                            throw new IllegalArgumentException("copyForHeaderUpdate with mismatching participant");
                                        }
                                    } else {
                                        throw new IllegalArgumentException("copyForHeaderUpdate when the header is not a ParticipantName");
                                    }
                                }
                                z2 |= z;
                            }
                        }
                        if (z2) {
                            itmVar.f.i(i3, rryVar);
                        }
                        i3++;
                    } else {
                        hkVar.f();
                        return;
                    }
                }
                break;
            case 6:
                abdf abdfVar = (abdf) this.a;
                ((ixd) this.b).M.startActivityForResult(abdg.a(abdfVar.d(), abdfVar.c(), abdfVar.b(), abdfVar.a()), 501);
                return;
            case 7:
                ((jaw) this.b).b.setVisibility(8);
                ?? r12 = this.a;
                if (r12 != 0) {
                    r12.run();
                    return;
                }
                return;
            case 8:
                ((jaw) this.b).b.setVisibility(8);
                ?? r13 = this.a;
                if (r13 != 0) {
                    r13.run();
                    return;
                }
                return;
            case 9:
                klc klcVar = (klc) this.b;
                if (!((yep) klcVar.c.b()).i("bugle_enable_analytics", true)) {
                    return;
                }
                amfq amfqVar = (amfq) amfr.a.createBuilder();
                amfp amfpVar = amfp.DATA_DONATION_EVENT;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar = (amfr) amfqVar.b;
                amfrVar.i = amfpVar.dg;
                amfrVar.b |= 1;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                Object obj = this.a;
                amfr amfrVar2 = (amfr) amfqVar.b;
                amjq amjqVar = (amjq) ((aozy) obj).s();
                amjqVar.getClass();
                amfrVar2.ap = amjqVar;
                amfrVar2.d |= 2097152;
                ((maq) klcVar.b.b()).j(amfqVar);
                return;
            case 10:
                ((kot) this.a).c.aQ(5, ((knc) this.b).a());
                kot.a.l("Successfully uploaded the bug report");
                return;
            case 11:
                kto ktoVar = (kto) this.b;
                ((kor) ktoVar.p.b()).d(5, Optional.of(ktoVar.n), Optional.of(ktoVar.c.b()), Optional.of(this.a), Optional.of(ktoVar.o.a));
                return;
            case 12:
                kto ktoVar2 = (kto) this.b;
                ((kor) ktoVar2.p.b()).d(6, Optional.of(ktoVar2.n), Optional.of(ktoVar2.c.b()), Optional.of(this.a), Optional.of(ktoVar2.o.a));
                return;
            case 13:
                Map map = (Map) Collection.EL.stream(this.a).collect(Collectors.groupingBy(new rxo(11)));
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (!((ConversationIdType) entry.getKey()).b()) {
                        ryi ryiVar = new ryi();
                        ryiVar.c((List) entry.getValue());
                        hashMap.put((ConversationIdType) entry.getKey(), ryiVar);
                    } else {
                        xyo e = ryi.a.e();
                        e.F(((List) entry.getValue()).size());
                        e.H("annotations with null conversationId");
                        e.q();
                    }
                }
                kxx kxxVar = (kxx) this.b;
                kxxVar.y = hashMap;
                if (kxxVar.r != null) {
                    xyo c = kxx.a.c();
                    c.H("Invalidate data source after setAnnotations");
                    c.z("loadingStatus", kxxVar.u);
                    c.q();
                    kxxVar.r.b();
                    return;
                }
                return;
            case 14:
                laj lajVar = (laj) this.b;
                if (((mho) lajVar.h.b()).al()) {
                    aozy createBuilder = amlc.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    Object obj2 = this.a;
                    amlc amlcVar = (amlc) createBuilder.b;
                    obj2.getClass();
                    amlcVar.c = (amld) obj2;
                    amlcVar.b |= 1;
                    long epochMilli = lajVar.m.f().toEpochMilli();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amlc amlcVar2 = (amlc) createBuilder.b;
                    amlcVar2.b |= 2;
                    amlcVar2.d = epochMilli;
                    amlc amlcVar3 = (amlc) createBuilder.s();
                    amfq amfqVar2 = (amfq) amfr.a.createBuilder();
                    amfp amfpVar2 = amfp.HOME_SCREEN;
                    if (!amfqVar2.b.isMutable()) {
                        amfqVar2.u();
                    }
                    amfr amfrVar3 = (amfr) amfqVar2.b;
                    amfrVar3.i = amfpVar2.dg;
                    amfrVar3.b |= 1;
                    if (!amfqVar2.b.isMutable()) {
                        amfqVar2.u();
                    }
                    amfr amfrVar4 = (amfr) amfqVar2.b;
                    amlcVar3.getClass();
                    amfrVar4.ai = amlcVar3;
                    amfrVar4.d |= 512;
                    ((maq) lajVar.i.b()).j(amfqVar2);
                    return;
                }
                laj.e.l("Clearcut loggings are disabled.");
                return;
            case 15:
                tim a = tip.a();
                a.w("RestoreWorkflowSettingsService#addAttachmentFileMetadata");
                Object obj3 = this.a;
                a.c(new lut(obj3, i));
                tie tieVar = (tie) ((tij) a.b().n()).cO();
                if (tieVar != null) {
                    if (luz.q(tieVar)) {
                        Object obj4 = this.b;
                        tlb b = tiy.b();
                        b.j(tieVar.h());
                        b.g((lwq) obj4);
                        b.h(tja.b);
                        b.i(tiz.a);
                        b.f();
                        return;
                    }
                    throw new IllegalStateException(a.cc(obj3, "restore execution [", "] already is not active"));
                }
                throw new IllegalArgumentException(a.cc(obj3, "restore execution with sessionId [", "] does not exist"));
            case 16:
                alwo alwoVar = mat.a;
                this.a.run();
                ((aboj) this.b).f();
                return;
            case 17:
                mgn mgnVar = (mgn) this.b;
                amxb amxbVar = (amxb) mgnVar.f.orElse(null);
                ((mic) this.a).bv(mgnVar.a, mgnVar.b, mgnVar.c, mgnVar.d, mgnVar.e, 6, amxbVar, mgnVar.k, mgnVar.g, Optional.empty(), mgnVar.h, mgnVar.i, mgnVar.j);
                return;
            case 18:
                ((umh) ((mic) this.b).G.b()).j((umi) this.a);
                return;
            case 19:
                qiu.h(((ncv) ((mlb) this.b).b.b()).a(this.a, amfd.SEND_MESSAGE_FAILED));
                return;
            default:
                mok mokVar = (mok) this.b;
                ums.j((rtz) mokVar.a.b(), (uhj) mokVar.b.b(), this.a, true);
                return;
        }
    }

    public /* synthetic */ irs(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
