package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.text.format.Formatter;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.ui.conversation.message.MessageDetails;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yzk {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;

    public yzk(Context context, armf armfVar, armf armfVar2, wfh wfhVar, yjy yjyVar, uac uacVar, yck yckVar, znj znjVar, armf armfVar3, zof zofVar, msk mskVar, apwt apwtVar, vbu vbuVar, armf armfVar4, armf armfVar5) {
        this.j = context;
        this.g = armfVar;
        this.f = armfVar2;
        this.l = wfhVar;
        this.e = yjyVar;
        this.i = uacVar;
        this.h = yckVar;
        this.d = znjVar;
        this.a = armfVar3;
        this.m = zofVar;
        this.c = mskVar;
        this.b = apwtVar;
        this.k = vbuVar;
        this.o = armfVar4;
        this.n = armfVar5;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [msk, java.lang.Object] */
    private final List d(rsa rsaVar, String str, boolean z, SelfIdentityId selfIdentityId) {
        ArrayList arrayList = new ArrayList();
        Iterator<ParticipantsTable.BindData> it = rsaVar.iterator();
        while (it.hasNext()) {
            ParticipantsTable.BindData next = it.next();
            if (!TextUtils.equals(next.M(), str) && (!ryg.l(next) || (next.M().equals(lga.Y(selfIdentityId)) && z))) {
                String o = this.c.q(next).o(true);
                if (!TextUtils.isEmpty(o)) {
                    arrayList.add(o);
                }
            }
        }
        return arrayList;
    }

    private static alog e(alog alogVar) {
        Stream map = Collection.EL.stream(alogVar).filter(new ilu(7)).map(new koa(10));
        int i = alog.d;
        return (alog) map.collect(alls.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v22, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v27, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v31, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v26, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v31, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v45, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v55, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [msk, java.lang.Object] */
    private final void f(zxy zxyVar, rry rryVar, rsa rsaVar, long j, qwm qwmVar) {
        String str;
        wye wyeVar;
        String P;
        List list;
        aiut.b();
        zxyVar.d("\n\n");
        zxyVar.d("DEBUG");
        zxyVar.b('\n');
        zxyVar.d("Message id: ");
        zxyVar.d(rryVar.u().a());
        zxyVar.b('\n');
        zxyVar.d("Rcs Message id: ");
        zxyVar.d(rryVar.v().b);
        zxyVar.b('\n');
        zxyVar.d("Xms Transport: ");
        zxyVar.d(rryVar.b.I().toString());
        zxyVar.b('\n');
        zxyVar.d("Web id: ");
        zxyVar.d(rryVar.S());
        zxyVar.b('\n');
        zxyVar.d("Cms id: ");
        zxyVar.d(rryVar.b.L());
        zxyVar.b('\n');
        zxyVar.d("CMS lifecycle: ");
        zxyVar.d(rryVar.b.J().toString());
        for (MessagePartCoreData messagePartCoreData : rryVar.e) {
            zxyVar.b('\n');
            zxyVar.d("CMS Full size blob ID: ");
            zxyVar.d(messagePartCoreData.R());
            zxyVar.b('\n');
            zxyVar.d("CMS Compressed blob ID: ");
            zxyVar.d(messagePartCoreData.Q());
        }
        zxyVar.b('\n');
        zxyVar.d("Status: ");
        zxyVar.d(qkv.a(rryVar.f()));
        zxyVar.d(" (");
        zxyVar.c(rryVar.f());
        zxyVar.d(")");
        zxyVar.b('\n');
        zxyVar.d("Result code: ");
        zxyVar.c(rryVar.b.n());
        zxyVar.b('\n');
        zxyVar.d("Error code: ");
        zxyVar.c(rryVar.e());
        zxyVar.b('\n');
        zxyVar.d("Content type: ");
        zxyVar.d((String) Collection.EL.stream(rryVar.e).map(new zkf(17)).collect(Collectors.joining(",")));
        int d = rryVar.d();
        zxyVar.b('\n');
        zxyVar.d("Status code: ");
        zxyVar.c(d);
        String D = rryVar.D();
        if (!TextUtils.isEmpty(D)) {
            zxyVar.b('\n');
            zxyVar.d("Error: ");
            zxyVar.d(D);
        }
        String P2 = rryVar.P();
        zxyVar.b('\n');
        zxyVar.d("Telephony uri: ");
        zxyVar.d(P2);
        ConversationIdType t = rryVar.t();
        if (!t.b()) {
            zxyVar.b('\n');
            zxyVar.d("Conversation id: ");
            zxyVar.d(t.a());
            zxyVar.b('\n');
            zxyVar.d("Conversation participants: [");
            Iterator<ParticipantsTable.BindData> it = rsaVar.iterator();
            while (it.hasNext()) {
                ParticipantsTable.BindData next = it.next();
                if (!ryg.l(next)) {
                    zxyVar.b(' ');
                    zxyVar.d(this.c.s(next).o(true));
                }
            }
            zxyVar.d(" ]");
            zxyVar.b('\n');
            zxyVar.d("RCS Session id: ");
            zxyVar.c(j);
            zxyVar.b('\n');
            zxyVar.b('\n');
            zxyVar.d("RCS Msisdn: ");
            zxyVar.d(((vbu) this.k).k());
            zxyVar.b('\n');
            zxyVar.b('\n');
            zxyVar.d("RCS Group Id: ");
            zxyVar.d(albo.ag(rryVar.H()));
            zxyVar.b('\n');
            zxyVar.b('\n');
            zxyVar.d("Self participant number: ");
            taz e = ParticipantsTable.e();
            e.g(new rpf(rryVar, 11));
            tav tavVar = (tav) e.b().m(ParticipantsTable.c.g);
            try {
                alob alobVar = new alob();
                while (tavVar.moveToNext()) {
                    if (tavVar.P() != null) {
                        alobVar.h(tavVar.P());
                    }
                }
                alog g = alobVar.g();
                tavVar.close();
                String str2 = "";
                if (((alsx) g).c != 1) {
                    str = "";
                } else {
                    str = (String) g.get(0);
                }
                zxyVar.d(str);
                zxyVar.b('\n');
                xhv a = ((ugy) this.g.b()).a(t);
                zxyVar.b('\n');
                zxyVar.d("BCM: ".concat(String.valueOf(String.valueOf(qpf.a.e()))));
                zxyVar.b('\n');
                zxyVar.d("Conversation telephony thread id: ");
                zxyVar.d(a.toString());
                if (rryVar.av()) {
                    if (P2 != null && (wyeVar = ((wzs) this.f.b()).s(Uri.parse(P2))) != null) {
                        long j2 = wyeVar.i;
                        zxyVar.b('\n');
                        zxyVar.d("Telephony thread id: ");
                        zxyVar.c(j2);
                        String str3 = wyeVar.n;
                        zxyVar.b('\n');
                        zxyVar.d("Content location URL: ");
                        zxyVar.d(str3);
                    } else {
                        return;
                    }
                } else {
                    wyeVar = null;
                }
                String G = ((wzs) this.f.b()).G(a);
                if (G != null) {
                    zxyVar.b('\n');
                    zxyVar.d("Thread recipient ids: ");
                    zxyVar.d(G);
                    zxyVar.b('\n');
                    zxyVar.d("Group canonical address: ");
                    if (rryVar.H() != null) {
                        str2 = albo.ag(((yst) this.o.b()).c(albo.ag(((wzs) this.f.b()).C(Long.parseLong(G)))));
                    }
                    zxyVar.d(str2);
                }
                if (wyeVar != null) {
                    P = wyeVar.a;
                } else {
                    P = rryVar.P();
                }
                if (P != null) {
                    xaz x = ((wzs) this.f.b()).x(wxr.a, a, P);
                    zxyVar.b('\n');
                    zxyVar.d("Thread recipients: ");
                    zxyVar.d(x.b.toString());
                    if (wyeVar != null) {
                        String D2 = ((wzs) this.f.b()).D(x, P);
                        if (true == TextUtils.isEmpty(D2)) {
                            D2 = "ʼUNKNOWN_SENDER!ʼ";
                        }
                        zxyVar.b('\n');
                        zxyVar.d("Sender: ");
                        zxyVar.e(D2);
                    }
                    zxyVar.b('\n');
                    zxyVar.d("Logging id: ");
                    zxyVar.c(rryVar.n());
                }
                if (rryVar.au()) {
                    Map b = ((rwj) this.n.b()).b(rryVar.u());
                    if (!b.keySet().isEmpty()) {
                        zxyVar.b('\n');
                        zxyVar.b('\n');
                        zxyVar.d("-- Received Message Info --");
                        zxyVar.b('\n');
                    }
                    for (tqk tqkVar : tqk.values()) {
                        if (b.containsKey(tqkVar) && (list = (List) b.get(tqkVar)) != null && !list.isEmpty() && !((String) list.get(0)).isEmpty()) {
                            zxyVar.d(tqkVar.name());
                            zxyVar.d(": ");
                            zxyVar.d(d.I(list));
                            zxyVar.b('\n');
                        }
                    }
                    alog a2 = ((rwj) this.n.b()).a(rryVar.u());
                    if (!a2.isEmpty()) {
                        rwh rwhVar = (rwh) a2.get(0);
                        zxyVar.d("TRANSPORT_PROTOCOL: ");
                        zxyVar.d(rwhVar.a.name());
                        zxyVar.b('\n');
                        String u = ((yjy) this.e).h(qwmVar.e()).u();
                        aluq listIterator = rwhVar.b.keySet().listIterator();
                        while (listIterator.hasNext()) {
                            String str4 = (String) listIterator.next();
                            String str5 = (String) rwhVar.b.get(str4);
                            if (str5 != null && !str5.isEmpty() && !albo.ar(u, str5) && !albo.ar("auto", str5)) {
                                zxyVar.d(String.valueOf(str4).concat(": "));
                                zxyVar.d((String) rwhVar.b.get(str4));
                                zxyVar.b('\n');
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                try {
                    tavVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e2, code lost:
    
        if (r5 != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0030 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v1, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g(android.content.res.Resources r18, defpackage.zxy r19, defpackage.rry r20, defpackage.rsa r21) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yzk.g(android.content.res.Resources, zxy, rry, rsa):void");
    }

    private final void h(Resources resources, qwm qwmVar, zxy zxyVar) {
        if (((yjy) this.e).a() < 2) {
            return;
        }
        zxyVar.b('\n');
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getString(R.string.sim_label));
        String h = qwmVar.h();
        if (TextUtils.isEmpty(h)) {
            sb.append(resources.getString(R.string.sim_slot_identifier, Integer.valueOf(qwmVar.c())));
        } else {
            sb.append(h);
        }
        Object obj = this.l;
        String sb2 = sb.toString();
        atkn atknVar = ecc.b;
        if (((wfh) obj).A() && !TextUtils.isEmpty(sb2)) {
            ebz a = ebz.a();
            if (sb2.contains(":")) {
                String[] split = sb2.split(":");
                for (int i = 0; i < split.length; i++) {
                    split[i] = a.c(split[i], atknVar);
                }
                sb2 = new algs(":").e(split);
            } else {
                sb2 = a.c(sb2, atknVar);
            }
        }
        zxyVar.d(sb2);
    }

    private final void i(Resources resources, zxy zxyVar, int i, long j) {
        if (j != 0) {
            zxyVar.b('\n');
            zxyVar.d(resources.getString(i));
            zxyVar.d(((znj) this.d).x(j).toString());
        }
    }

    /* JADX WARN: Type inference failed for: r1v20, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v21, types: [msh, java.lang.Object] */
    public final MessageDetails a(rry rryVar, rsa rsaVar, qwm qwmVar, long j) {
        zxy e;
        String string;
        String str;
        int i = 0;
        if (rryVar.aQ()) {
            Object obj = this.j;
            Object obj2 = this.m;
            Resources resources = ((Context) obj).getResources();
            e = ((zof) obj2).e(rryVar.u());
            e.d(resources.getString(R.string.message_type_label));
            e.d(resources.getString(R.string.text_message));
            if (rryVar.au()) {
                str = rryVar.r().o(true);
            } else if (qwmVar.b().isPresent()) {
                str = qwmVar.b().get().F().a;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                e.b('\n');
                e.d(resources.getString(R.string.from_label));
                e.e(str);
            }
            List d = d(rsaVar, rryVar.F(), rryVar.au(), rryVar.s());
            if (!d.isEmpty()) {
                e.b('\n');
                e.d(resources.getString(R.string.to_address_label));
                while (i < d.size()) {
                    if (i > 0) {
                        e.d(", ");
                    }
                    e.e((String) d.get(i));
                    i++;
                }
            }
            h(resources, qwmVar, e);
            g(resources, e, rryVar, rsaVar);
            if (((yck) this.h).q()) {
                f(e, rryVar, rsaVar, -1L, qwmVar);
            }
        } else {
            Object obj3 = this.j;
            Object obj4 = this.m;
            Context context = (Context) obj3;
            Resources resources2 = context.getResources();
            e = ((zof) obj4).e(rryVar.u());
            e.d(resources2.getString(R.string.message_type_label));
            if (rryVar.aF()) {
                Object obj5 = this.i;
                boolean aq = rryVar.aq();
                String string2 = resources2.getString(R.string.rcs_message);
                if (aq && ttd.f()) {
                    string2 = ((Context) ((uac) obj5).a).getString(R.string.encrypted_rcs_message);
                }
                e.d(string2);
            } else {
                e.d(resources2.getString(R.string.multimedia_message));
            }
            String o = rryVar.r().o(true);
            e.b('\n');
            e.d(resources2.getString(R.string.from_label));
            if (!TextUtils.isEmpty(o)) {
                e.e(o);
            } else {
                e.d(resources2.getString(R.string.hidden_sender_address));
            }
            List d2 = d(rsaVar, rryVar.F(), rryVar.au(), rryVar.s());
            if (!d2.isEmpty()) {
                e.b('\n');
                e.d(resources2.getString(R.string.to_address_label));
                while (i < d2.size()) {
                    if (i > 0) {
                        e.d(", ");
                    }
                    e.e((String) d2.get(i));
                    i++;
                }
            }
            if (rryVar.av()) {
                e.b('\n');
                e.d(resources2.getString(R.string.subject_label));
                if (!TextUtils.isEmpty(((xca) this.b.b()).d(resources2, rryVar.E()))) {
                    e.d(rryVar.E());
                }
            }
            e.b('\n');
            e.d(resources2.getString(R.string.priority_label));
            int p = rryVar.b.p();
            if (p != 128) {
                if (p != 130) {
                    string = resources2.getString(R.string.priority_normal);
                } else {
                    string = resources2.getString(R.string.priority_high);
                }
            } else {
                string = resources2.getString(R.string.priority_low);
            }
            e.d(string);
            if (rryVar.l() > 0 && !rryVar.az()) {
                e.b('\n');
                e.d(resources2.getString(R.string.message_size_label));
                e.d(Formatter.formatFileSize(context, rryVar.l()));
            }
            h(resources2, qwmVar, e);
            g(resources2, e, rryVar, rsaVar);
            if (((yck) this.h).q() || ((Boolean) aaci.b.e()).booleanValue()) {
                f(e, rryVar, rsaVar, j, qwmVar);
            }
        }
        return new MessageDetails((MessageIdType) e.a, ((StringBuilder) e.c).toString(), e.b);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [armf, java.lang.Object] */
    public final vbq b(vgm vgmVar) {
        anen anenVar = (anen) this.k.b();
        anenVar.getClass();
        aneo aneoVar = (aneo) this.c.b();
        aneoVar.getClass();
        veo veoVar = (veo) this.h.b();
        veoVar.getClass();
        wpp wppVar = (wpp) this.o.b();
        wppVar.getClass();
        xnv xnvVar = (xnv) this.f.b();
        xnvVar.getClass();
        Optional optional = (Optional) this.e.b();
        optional.getClass();
        rtb rtbVar = (rtb) this.b.b();
        rtbVar.getClass();
        ahmv ahmvVar = (ahmv) this.m.b();
        ahmvVar.getClass();
        vcs vcsVar = (vcs) this.g.b();
        vcsVar.getClass();
        yjy yjyVar = (yjy) this.l.b();
        yjyVar.getClass();
        yjr yjrVar = (yjr) this.j.b();
        yjrVar.getClass();
        aneo aneoVar2 = (aneo) this.d.b();
        aneoVar2.getClass();
        return new vbq(anenVar, aneoVar, veoVar, wppVar, xnvVar, optional, rtbVar, ahmvVar, vcsVar, this.a, yjyVar, yjrVar, this.i, this.n, aneoVar2, vgmVar);
    }

    public final alog c() {
        return alog.A(this.h, this.g, this.f, this.m, this.j, this.b, this.c, this.i, this.e, this.d);
    }

    public yzk(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, armf armfVar16) {
        armfVar.getClass();
        this.d = armfVar;
        armfVar2.getClass();
        this.k = armfVar2;
        armfVar3.getClass();
        this.j = armfVar3;
        armfVar4.getClass();
        this.g = armfVar4;
        armfVar5.getClass();
        this.h = armfVar5;
        armfVar6.getClass();
        this.c = armfVar6;
        armfVar7.getClass();
        this.i = armfVar7;
        armfVar8.getClass();
        this.e = armfVar8;
        armfVar9.getClass();
        this.b = armfVar9;
        armfVar10.getClass();
        armfVar11.getClass();
        this.l = armfVar11;
        armfVar12.getClass();
        this.a = armfVar12;
        armfVar13.getClass();
        this.o = armfVar13;
        this.n = armfVar14;
        this.f = armfVar15;
        armfVar16.getClass();
        this.m = armfVar16;
    }

    /* JADX WARN: Type inference failed for: r3v15, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v16, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [armf, java.lang.Object] */
    public yzk(izc izcVar, izc izcVar2, izc izcVar3, izc izcVar4, ghw ghwVar, izc izcVar5, ghw ghwVar2, izc izcVar6, ghw ghwVar3, ghw ghwVar4, ksv ksvVar, kst kstVar, armf armfVar, ksv ksvVar2, kss kssVar) {
        Optional empty;
        Optional empty2;
        Optional empty3;
        Optional of = Optional.of(ksvVar);
        this.a = of;
        Optional of2 = Optional.of(kstVar);
        this.n = of2;
        if (((Boolean) ktf.b.e()).booleanValue()) {
            empty = Optional.of((ksr) armfVar.b());
        } else {
            empty = Optional.empty();
        }
        this.l = empty;
        if (((Boolean) xzk.a.e()).booleanValue()) {
            empty2 = Optional.of(ksvVar2);
        } else {
            empty2 = Optional.empty();
        }
        this.k = empty2;
        if (((Boolean) ktf.c.e()).booleanValue()) {
            empty3 = Optional.of(kssVar);
        } else {
            empty3 = Optional.empty();
        }
        this.o = empty3;
        int i = alog.d;
        alog alogVar = alsx.a;
        Context context = (Context) izcVar.a.b();
        context.getClass();
        alogVar.getClass();
        this.d = new kte(context, alogVar, 1);
        alog e = e(alog.v(of, of2, empty, empty2, empty3));
        Context context2 = (Context) izcVar2.a.b();
        context2.getClass();
        e.getClass();
        this.h = new kte(context2, e, 4);
        alog e2 = e(alog.v(of, of2, empty, empty2, empty3));
        Context context3 = (Context) izcVar3.a.b();
        context3.getClass();
        e2.getClass();
        this.g = new kte(context3, e2, 3);
        alog e3 = e(alog.v(of, of2, empty, empty2, empty3));
        Context context4 = (Context) izcVar4.a.b();
        context4.getClass();
        e3.getClass();
        this.f = new kte(context4, e3, 2);
        alog e4 = e(alog.v(of, of2, empty, empty2, empty3));
        Context context5 = (Context) ghwVar.a.b();
        context5.getClass();
        e4.getClass();
        this.m = new kte(context5, e4, 8);
        alog e5 = e(alog.u(of, of2, empty2, empty3));
        Context context6 = (Context) izcVar5.a.b();
        context6.getClass();
        e5.getClass();
        this.j = new kte(context6, e5, 0);
        alog e6 = e(alog.u(of, of2, empty2, empty3));
        Context context7 = (Context) ghwVar2.a.b();
        context7.getClass();
        e6.getClass();
        this.b = new kte(context7, e6, 7);
        alog e7 = e(alog.u(of, of2, empty2, empty3));
        Context context8 = (Context) izcVar6.a.b();
        context8.getClass();
        e7.getClass();
        this.c = new kte(context8, e7, 5);
        alog alogVar2 = alsx.a;
        Context context9 = (Context) ghwVar3.a.b();
        context9.getClass();
        alogVar2.getClass();
        this.i = new kte(context9, alogVar2, 6);
        alog e8 = e(alog.t(of2, empty2, empty3));
        Context context10 = (Context) ghwVar4.a.b();
        context10.getClass();
        e8.getClass();
        this.e = new kte(context10, e8, 9);
    }

    public yzk(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15) {
        armfVar.getClass();
        this.n = armfVar;
        armfVar2.getClass();
        this.f = armfVar2;
        armfVar3.getClass();
        this.a = armfVar3;
        armfVar4.getClass();
        this.o = armfVar4;
        armfVar5.getClass();
        this.m = armfVar5;
        armfVar6.getClass();
        this.k = armfVar6;
        armfVar7.getClass();
        this.d = armfVar7;
        armfVar8.getClass();
        this.j = armfVar8;
        armfVar9.getClass();
        this.i = armfVar9;
        armfVar10.getClass();
        this.l = armfVar10;
        armfVar11.getClass();
        this.c = armfVar11;
        armfVar12.getClass();
        this.b = armfVar12;
        armfVar13.getClass();
        this.e = armfVar13;
        armfVar14.getClass();
        this.h = armfVar14;
        armfVar15.getClass();
        this.g = armfVar15;
    }

    public yzk() {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "parts_backup._id";
        a.c = new wsy();
        rnq rnqVar = new rnq(a.a());
        this.n = rnqVar;
        agmi a2 = agmk.a();
        a2.d = 1;
        a2.c(true);
        a2.d(true);
        a2.b = new rlm(17);
        a2.a = "parts_backup.message_id";
        a2.c = new wsy();
        rnq rnqVar2 = new rnq(a2.a());
        this.e = rnqVar2;
        agmi a3 = agmk.a();
        a3.d = 4;
        a3.a = "parts_backup.content_type";
        a3.c = new wsy();
        rnq rnqVar3 = new rnq(a3.a());
        this.h = rnqVar3;
        agmi a4 = agmk.a();
        a4.d = 1;
        a4.a = "parts_backup.source";
        a4.c = new wsy();
        rnq rnqVar4 = new rnq(a4.a());
        this.l = rnqVar4;
        agmi a5 = agmk.a();
        a5.d = 4;
        a5.a = "parts_backup.text";
        a5.c = new wsy();
        rnq rnqVar5 = new rnq(a5.a());
        this.a = rnqVar5;
        agmi a6 = agmk.a();
        a6.d = 1;
        a6.a = "parts_backup.width";
        a6.c = new wsy();
        rnq rnqVar6 = new rnq(a6.a());
        this.o = rnqVar6;
        agmi a7 = agmk.a();
        a7.d = 1;
        a7.a = "parts_backup.height";
        a7.c = new wsy();
        rnq rnqVar7 = new rnq(a7.a());
        this.i = rnqVar7;
        agmi a8 = agmk.a();
        a8.d = 3;
        a8.a = "parts_backup.longitude";
        a8.c = new wsy();
        rnq rnqVar8 = new rnq(a8.a());
        this.m = rnqVar8;
        agmi a9 = agmk.a();
        a9.d = 3;
        a9.a = "parts_backup.latitude";
        a9.c = new wsy();
        rnq rnqVar9 = new rnq(a9.a());
        this.b = rnqVar9;
        agmi a10 = agmk.a();
        a10.d = 4;
        a10.a = "parts_backup.cms_full_size_blob_id";
        a10.c = new wsy();
        rnq rnqVar10 = new rnq(a10.a());
        this.f = rnqVar10;
        agmi a11 = agmk.a();
        a11.d = 5;
        a11.a = "parts_backup.cms_media_encryption_key";
        a11.c = new wsy();
        rnq rnqVar11 = new rnq(a11.a());
        this.g = rnqVar11;
        agmi a12 = agmk.a();
        a12.d = 5;
        a12.a = "parts_backup.cms_compressed_media_encryption_key";
        a12.c = new wsy();
        rnq rnqVar12 = new rnq(a12.a());
        this.j = rnqVar12;
        agmi a13 = agmk.a();
        a13.d = 4;
        a13.a = "parts_backup.cms_compressed_blob_id";
        a13.c = new wsy();
        rnq rnqVar13 = new rnq(a13.a());
        this.d = rnqVar13;
        agmi a14 = agmk.a();
        a14.d = 4;
        a14.a = "parts_backup.file_name";
        a14.c = new wsy();
        rnq rnqVar14 = new rnq(a14.a());
        this.c = rnqVar14;
        this.k = new rnq[]{rnqVar, rnqVar2, rnqVar3, rnqVar4, rnqVar5, rnqVar6, rnqVar7, rnqVar8, rnqVar9, rnqVar10, rnqVar11, rnqVar12, rnqVar13, rnqVar14};
    }

    public yzk(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, armf armfVar16, armf armfVar17, armf armfVar18) {
        armfVar.getClass();
        this.k = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.h = armfVar3;
        armfVar4.getClass();
        this.o = armfVar4;
        armfVar5.getClass();
        this.f = armfVar5;
        armfVar6.getClass();
        this.e = armfVar6;
        this.b = armfVar7;
        this.m = armfVar8;
        armfVar9.getClass();
        this.g = armfVar9;
        armfVar10.getClass();
        this.a = armfVar10;
        armfVar11.getClass();
        this.l = armfVar11;
        armfVar12.getClass();
        this.j = armfVar12;
        armfVar13.getClass();
        this.i = armfVar13;
        armfVar14.getClass();
        this.n = armfVar14;
        armfVar15.getClass();
        this.d = armfVar15;
        armfVar16.getClass();
        armfVar17.getClass();
        armfVar18.getClass();
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [asai, java.lang.Object] */
    public yzk(arwe arweVar, zas zasVar, znj znjVar, zlc zlcVar, Optional optional, znj znjVar2, zcu zcuVar, zen zenVar, zal zalVar, zai zaiVar, zbk zbkVar, armf armfVar, armf armfVar2) {
        arweVar.getClass();
        zasVar.getClass();
        zlcVar.getClass();
        znjVar2.getClass();
        zcuVar.getClass();
        zenVar.getClass();
        zalVar.getClass();
        zaiVar.getClass();
        zbkVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.a = arweVar;
        this.h = zasVar;
        this.i = znjVar;
        this.j = zlcVar;
        this.b = optional;
        this.c = znjVar2;
        this.l = zcuVar;
        this.m = zenVar;
        this.d = zalVar;
        this.k = zaiVar;
        this.e = zbkVar;
        this.n = armfVar;
        this.o = armfVar2;
        Object e = yyv.e.e();
        e.getClass();
        int intValue = ((Number) e).intValue();
        Object e2 = yyv.d.e();
        e2.getClass();
        int intValue2 = ((Number) e2).intValue();
        Object e3 = yyv.f.e();
        e3.getClass();
        this.f = new jdn(dyg.f(new ghw(new gcn(intValue, ((Number) e3).intValue(), false, intValue2, 0, 0, 52), new yyy(this, 5)).a, arweVar), zenVar.e, new igb(this, (arpe) null, 16), 17, null);
        qkk qkkVar = new qkk(zenVar.e, this, 6);
        int i = ascp.a;
        this.g = arrn.T(qkkVar, arweVar, asco.a(0L, 3), new yzr(null, 7));
    }
}
