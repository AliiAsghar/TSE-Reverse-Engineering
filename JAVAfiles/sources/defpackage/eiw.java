package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eiw extends arrp implements arqr {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eiw(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v111, types: [enm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v128, types: [wvc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v143, types: [enm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, arzj] */
    /* JADX WARN: Type inference failed for: r0v45, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64, types: [dqv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, arzj] */
    /* JADX WARN: Type inference failed for: r10v8, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, arqv] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, agff] */
    /* JADX WARN: Type inference failed for: r2v19, types: [ascv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [enm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v49, types: [enm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v61, types: [java.lang.Object, nfw] */
    /* JADX WARN: Type inference failed for: r2v74, types: [java.lang.Object, apbt] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r2v80, types: [enm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v83, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v84, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r3v51, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r3v57, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r4v29, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        arnb arnbVar;
        Object agflVar;
        aenw aenwVar;
        int ba;
        jpn jpnVar;
        jgz jgzVar;
        int i = 14;
        int i2 = 2;
        String str = null;
        byte b = 0;
        byte b2 = 0;
        switch (this.d) {
            case 0:
                Throwable th = (Throwable) obj;
                this.a.a(th);
                ((fvq) this.b).a.e(th);
                do {
                    Object a = arzn.a(((fvq) this.b).a.m());
                    if (a != null) {
                        this.c.a(a, th);
                        arnbVar = arnb.a;
                    } else {
                        arnbVar = null;
                    }
                } while (arnbVar != null);
                return arnb.a;
            case 1:
                ((rm) this.b).b(this.c, (rg) this.a);
                return new kbe(this.a, 1);
            case 2:
                ((lrc) obj).getClass();
                Object obj2 = this.b;
                obj2.getClass();
                Object obj3 = this.a;
                jfj jfjVar = (jfj) obj3;
                String bt = yyb.bt(jfjVar.b.getString(R.string.rbm_verification_dialog_learn_more));
                bt.getClass();
                Object obj4 = this.c;
                String string = jfjVar.b.getString(R.string.rbm_verification_dialog_verified_message_generalized, obj4, bt);
                string.getClass();
                aeqe aeqeVar = new aeqe((Uri) obj2);
                String string2 = jfjVar.b.getString(R.string.rbm_platform_generalized_verifier_title, obj4);
                string2.getClass();
                List y = aqjn.y(new aeie(aein.h, string.length() - bt.length(), string.length(), bt, new ipk(obj3, 8)));
                String string3 = jfjVar.b.getString(R.string.rbm_verification_dialog_close_button_text_m2);
                string3.getClass();
                return new aeqf(aeqeVar, string2, string, y, new aewr(string3, ipf.p), null, aepz.d);
            case 3:
                aenw aenwVar2 = (aenw) obj;
                aenwVar2.getClass();
                if (aenwVar2.ordinal() != 3) {
                    ((alvg) jkd.a.i().h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/DirectSendInputsUiAdapter$createUiDataFlow$1$2", "invoke", 53, "DirectSendInputsUiAdapter.kt")).q("Non-emotive input clicked in direct send compose row.");
                } else {
                    Object obj5 = this.b;
                    ?? r2 = this.c;
                    if (this.a instanceof agfl) {
                        agflVar = agfg.a;
                    } else {
                        agflVar = new agfl(aqjn.y(new agfh(agek.b, ((jkd) obj5).d, i2)), b2 == true ? 1 : 0, b == true ? 1 : 0, i);
                    }
                    r2.f(agflVar);
                }
                return arnb.a;
            case 4:
                agfn agfnVar = (agfn) obj;
                agfnVar.getClass();
                boolean z = agfnVar instanceof agfl;
                aenw aenwVar3 = aenw.d;
                if (true != z) {
                    aenwVar = null;
                } else {
                    aenwVar = aenwVar3;
                }
                new aeoa(aenwVar, null, null, null, null, false, null, new eiw(this.b, this.c, agfnVar, 3), 254);
                return new jkm(new afyo(agfnVar, ((jkd) this.b).c, (agff) this.a, 24));
            case 5:
                aftr aftrVar = (aftr) obj;
                aftrVar.getClass();
                qjh.l(this.a, null, new gvr((jkk) this.b, (ascv) this.c, aftrVar, (arpe) null, 14), 3);
                return arnb.a;
            case 6:
                lrc lrcVar = (lrc) obj;
                lrcVar.getClass();
                String string4 = ((jwd) this.b).c.getString(R.string.sim_dialog_picker_title);
                string4.getClass();
                ?? r3 = this.a;
                ArrayList arrayList = new ArrayList(aqjn.J(r3, 10));
                Iterator it = r3.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        aqjn.G();
                    }
                    Object obj6 = this.b;
                    nfw nfwVar = (nfw) next;
                    char h = arro.h(i4);
                    if (nfwVar.a() == 0) {
                        ba = ((jwd) obj6).c.getColor(R.color.sim_icon_text_color);
                    } else {
                        ba = adom.ba(((jwd) obj6).c, nfwVar.a());
                    }
                    ?? r15 = this.c;
                    jwd jwdVar = (jwd) obj6;
                    Iterator it2 = it;
                    String string5 = jwdVar.c.getString(R.string.sim_dialog_picker_row_text, nfwVar.k(), Integer.valueOf(i4));
                    string5.getClass();
                    arrayList.add(new aesz(h, ba, string5, nfwVar.j(), new jda(lrcVar, jwdVar, nfwVar, (arqr) r15, 3)));
                    it = it2;
                    i3 = i4;
                }
                return new aeqa(string4, arrayList, null, null, null, null, null, 124);
            case 7:
                aeoj aeojVar = (aeoj) obj;
                aeojVar.getClass();
                int indexOf = this.c.indexOf(aeojVar);
                if (indexOf >= 0) {
                    nfw nfwVar2 = (nfw) ((alog) this.a).get(indexOf);
                    Object obj7 = this.b;
                    nfwVar2.getClass();
                    ((jwi) obj7).b(nfwVar2);
                    return arnb.a;
                }
                throw new IllegalStateException("Could not find self identity for ui SIM");
            case 8:
                aqm aqmVar = (aqm) obj;
                aqmVar.getClass();
                aql.a(aqmVar, this.a.size() + 1, null, new cdj(1809742367, true, new aaab((List) this.a, (jxb) this.b, (arqr) this.c, 1)), 14);
                return arnb.a;
            case 9:
                lrc lrcVar2 = (lrc) obj;
                lrcVar2.getClass();
                Object obj8 = this.b;
                String str2 = (String) ((rae) obj8).d;
                int length = str2.length();
                ?? r7 = this.c;
                List y2 = aqjn.y(new aeif("https://support.google.com/messages/?p=premium_sms", arsd.T(r7, str2, 0, 6), arsd.T(r7, str2, 0, 6) + length, new kbt(obj8, 3), 24));
                Object obj9 = this.b;
                return new kil(new kav(obj9, 16), (String) this.c, y2, new kbp(obj9, lrcVar2, 18), new jfq(obj9, lrcVar2, this.a, 17, (short[]) null));
            case 10:
                cti ctiVar = (cti) obj;
                ctiVar.getClass();
                cjp c = ctj.c(ctiVar);
                ((khy) this.c).i.a(Integer.valueOf((int) c.b), Integer.valueOf((int) c.c), Integer.valueOf((int) c.d), Integer.valueOf((int) c.e));
                this.b.h(new dqy(this.a.eh((int) (ctiVar.g() & 4294967295L))));
                return arnb.a;
            case 11:
                ((bxi) obj).getClass();
                ((rm) this.b).b(this.a, (rg) this.c);
                return new kbe(this.c, 2);
            case 12:
                spb spbVar = (spb) obj;
                spbVar.getClass();
                spbVar.h(((jhc) this.b).a);
                aozy createBuilder = jpo.a.createBuilder();
                createBuilder.getClass();
                DesugarCollections.unmodifiableList(((jpo) createBuilder.b).c).getClass();
                ArrayList<jgz> arrayList2 = new ArrayList();
                Object obj10 = this.a;
                for (jha jhaVar : ((jhc) this.b).b) {
                    if (jhaVar instanceof jgz) {
                        jgzVar = (jgz) jhaVar;
                    } else {
                        jgzVar = null;
                    }
                    if (jgzVar != null) {
                        arrayList2.add(jgzVar);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (jgz jgzVar2 : arrayList2) {
                    try {
                        aozy createBuilder2 = jpn.a.createBuilder();
                        createBuilder2.getClass();
                        hwr.aj(((lgr) obj10).d.c(jgzVar2.a), createBuilder2);
                        Uri uri = jgzVar2.b.a;
                        if (uri != null) {
                            hwr.ai(uri.toString(), createBuilder2);
                        }
                        jpnVar = hwr.ah(createBuilder2);
                    } catch (afeh e) {
                        Object obj11 = this.c;
                        alvw h2 = lgr.a.h();
                        h2.X(alwp.a, "BugleMultiShare");
                        alvg alvgVar = (alvg) ((alvg) h2).g(e);
                        alvgVar.X(ydl.q, obj11);
                        ((alvg) alvgVar.h("com/google/android/apps/messaging/multishare/editmessage/bottomcontent/composerow/draft/DraftPersistenceImpl", "trySerialize", 153, "DraftPersistenceImpl.kt")).t("Failed to serialize %s", jgzVar2);
                        jpnVar = null;
                    }
                    if (jpnVar != null) {
                        arrayList3.add(jpnVar);
                    }
                }
                hwr.af(arrayList3, createBuilder);
                spbVar.b(hwr.ae(createBuilder));
                spbVar.g(((jhc) this.b).c);
                spbVar.e(((jhc) this.b).d);
                MessageId messageId = ((jhc) this.b).e;
                if (messageId != null) {
                    str = messageId.a();
                }
                spbVar.f(str);
                spbVar.d(((jhc) this.b).h);
                return arnb.a;
            case 13:
                aos aosVar = (aos) obj;
                aosVar.getClass();
                ?? r8 = this.c;
                aor.b(aosVar, r8.size(), new kju(r8, 14), new cdj(946923329, true, new jle(r8, 5)), 4);
                lhw lhwVar = ((lib) this.a).a;
                if (lhwVar != null) {
                    aor.a(aosVar, "load_text", new cdj(-860812791, true, new jjs(lhwVar, 17)), 2);
                }
                Object obj12 = this.b;
                aor.b(aosVar, ((gqg) obj12).b(), new geg(lgk.h, obj12, 0), new cdj(121343658, true, new jle(obj12, 6)), 4);
                return arnb.a;
            case 14:
                ((bxi) obj).getClass();
                aehz aehzVar = (aehz) this.c;
                ljr ljrVar = new ljr(aehzVar, aehzVar.f);
                ((rm) this.b).b(this.a, ljrVar);
                return new kbe(ljrVar, 3);
            case 15:
                lxe lxeVar = (lxe) obj;
                lxeVar.getClass();
                ?? r22 = this.c;
                qei qeiVar = (qei) r22.i().flatMap(new lcw(12)).orElseThrow();
                String str3 = this.a.z().a;
                int d = ((yjy) lxeVar.b.b()).h(r22.b()).d() + 1;
                aozy createBuilder3 = lrr.a.createBuilder();
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                lrr lrrVar = (lrr) createBuilder3.b;
                lrrVar.b |= 1;
                lrrVar.c = d;
                int a2 = r22.a();
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                lrr lrrVar2 = (lrr) createBuilder3.b;
                lrrVar2.b |= 2;
                lrrVar2.d = a2;
                String l = r22.l();
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                lrr lrrVar3 = (lrr) createBuilder3.b;
                lrrVar3.b |= 4;
                lrrVar3.e = l;
                lrr lrrVar4 = (lrr) createBuilder3.s();
                aozy createBuilder4 = lrn.a.createBuilder();
                if (!createBuilder4.b.isMutable()) {
                    createBuilder4.u();
                }
                apag apagVar = createBuilder4.b;
                lrn lrnVar = (lrn) apagVar;
                str3.getClass();
                lrnVar.b = 2 | lrnVar.b;
                lrnVar.d = str3;
                if (!apagVar.isMutable()) {
                    createBuilder4.u();
                }
                apag apagVar2 = createBuilder4.b;
                lrn lrnVar2 = (lrn) apagVar2;
                qeiVar.getClass();
                lrnVar2.c = qeiVar;
                lrnVar2.b |= 1;
                if (!apagVar2.isMutable()) {
                    createBuilder4.u();
                }
                Object obj13 = this.b;
                lrn lrnVar3 = (lrn) createBuilder4.b;
                lrrVar4.getClass();
                lrnVar3.e = lrrVar4;
                lrnVar3.b |= 4;
                lrn lrnVar4 = (lrn) createBuilder4.s();
                Context context = ((llq) obj13).a;
                akto.n(context, lxeVar.a(context, lrnVar4));
                return arnb.a;
            case 16:
                arsb arsbVar = (arsb) this.a;
                if (arsbVar.a == null) {
                    arsbVar.a = qjh.l(this.c, null, new qka((arqr) this.b, obj, arsbVar, (arpe) null, 1), 3);
                }
                return arnb.a;
            case 17:
                apbt apbtVar = (apbt) obj;
                if (((wva) this.b).u(apbtVar)) {
                    if (((wva) this.b).u(this.c)) {
                        return ((wva) this.b).g;
                    }
                    wva.a.m().t("Migrating data. key = %s", ((wva) this.b).e);
                    this.a.c();
                    return this.c;
                }
                return apbtVar;
            case 18:
                ((bxi) obj).getClass();
                ((rm) this.a).b(this.c, (rg) this.b);
                return new kbe(this.b, 4);
            case 19:
                lrc lrcVar3 = (lrc) obj;
                lrcVar3.getClass();
                Object obj14 = this.a;
                ?? r12 = this.c;
                ahmv ahmvVar = (ahmv) this.b;
                qjh.l(ahmvVar.d, null, new wju((ascd) r12, lrcVar3, ahmvVar, (alog) obj14, (arpe) null, 6), 3);
                return ((ahmv) this.b).e((alog) this.a, (nfw) this.c.c(), lrcVar3, this.c);
            default:
                ((bxi) obj).getClass();
                aehz aehzVar2 = (aehz) this.c;
                zek zekVar = new zek(aehzVar2, aehzVar2.f);
                ((rm) this.b).b(this.a, zekVar);
                return new kbe(zekVar, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eiw(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        super(1);
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eiw(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        super(1);
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eiw(Object obj, Object obj2, Object obj3, int i, int[] iArr) {
        super(1);
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eiw(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        super(1);
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eiw(List list, lib libVar, gqg gqgVar, int i) {
        super(1);
        this.d = i;
        this.c = list;
        this.a = libVar;
        this.b = gqgVar;
    }
}
