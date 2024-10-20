package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ukl implements ukn {
    public static final alwo a = alwo.o("BugleNotifications");
    public static final xze b = xze.g("BugleAnnotation", "AnnotationWorker");
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    private final armf g;
    private final armf h;
    private final anen i;

    public ukl(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, anen anenVar, armf armfVar5, armf armfVar6) {
        this.g = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.h = armfVar4;
        this.i = anenVar;
        this.e = armfVar5;
        this.f = armfVar6;
    }

    @Override // defpackage.ukn
    public final akul a(srd srdVar) {
        akul ag;
        akul h;
        akul i;
        d.s(b(srdVar));
        String p = srdVar.p();
        p.getClass();
        xze xzeVar = b;
        xyo d = xzeVar.d();
        d.H("Processing workitem: ");
        d.H(srdVar.o());
        d.q();
        final MessageCoreData q = ((rwd) this.h.b()).q(rvc.b(p));
        if (q == null) {
            xzeVar.p("Message deleted, no action needed.");
            return aktp.ag(true);
        }
        if (xxw.x.contains(q.P())) {
            xzeVar.p("Message is restored from CMS, no action needed.");
            return aktp.ag(true);
        }
        final xwj xwjVar = (xwj) this.g.b();
        final ArrayList arrayList = new ArrayList();
        final String am = q.am();
        if (d.z(q.j())) {
            xyo d2 = xwj.a.d();
            d2.c(q.B());
            d2.H("is a tombstone, skipping.");
            d2.q();
            i = aktp.ag(arrayList);
        } else {
            if (xwjVar.e()) {
                xyo d3 = xwj.a.d();
                d3.H("Running otp annotator on");
                d3.c(q.B());
                d3.q();
                aqby a2 = ((xwl) xwjVar.c.b()).a(q);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            xyo d4 = xwj.a.d();
            d4.H("Running url annotator on");
            d4.c(q.B());
            d4.q();
            yyb yybVar = xwjVar.j;
            ArrayList arrayList2 = new ArrayList();
            String au = q.au();
            if (!TextUtils.isEmpty(au)) {
                List<uzb> d5 = uzc.d(au);
                xyl.l(d5);
                for (uzb uzbVar : d5) {
                    aozy createBuilder = aqby.a.createBuilder();
                    int i2 = uzbVar.b;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ((aqby) createBuilder.b).g = i2;
                    int i3 = uzbVar.c;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ((aqby) createBuilder.b).h = i3;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    ((aqby) createBuilder.b).d = aqas.f(4);
                    aozy createBuilder2 = aqbw.a.createBuilder();
                    String str = uzbVar.a;
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    aqbw aqbwVar = (aqbw) createBuilder2.b;
                    str.getClass();
                    aqbwVar.b = str;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    aqby aqbyVar = (aqby) createBuilder.b;
                    aqbw aqbwVar2 = (aqbw) createBuilder2.s();
                    aqbwVar2.getClass();
                    aqbyVar.c = aqbwVar2;
                    aqbyVar.b = 8;
                    arrayList2.add((aqby) createBuilder.s());
                }
            }
            arrayList.addAll(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            if ((xwj.f() || xwj.h()) && !TextUtils.isEmpty(q.au())) {
                if (xwj.h()) {
                    xyo d6 = xwj.a.d();
                    d6.H("Running TextClassifierLib annotator on");
                    d6.c(q.B());
                    d6.q();
                    yyb yybVar2 = xwjVar.i;
                    ag = yyb.aH();
                } else {
                    int i4 = alog.d;
                    ag = aktp.ag(alsx.a);
                }
                h = ag.h(new xqi(arrayList3, 13), xwjVar.f).i(new xfn(q, 11), xwjVar.f).h(new xqi(arrayList3, 13), xwjVar.f).h(new xqi(arrayList3, 14), xwjVar.f);
            } else {
                h = aktp.ag(arrayList3);
            }
            i = h.i(new ancs() { // from class: xwh
                @Override // defpackage.ancs
                public final ListenableFuture a(Object obj) {
                    List c;
                    akul h2;
                    alog g;
                    alog g2;
                    alog g3;
                    alog g4;
                    ArrayList arrayList4 = arrayList;
                    arrayList4.addAll((ArrayList) obj);
                    ArrayList arrayList5 = new ArrayList();
                    boolean booleanValue = ((Boolean) yhr.a.e()).booleanValue();
                    String str2 = am;
                    xwj xwjVar2 = xwj.this;
                    MessageCoreData messageCoreData = q;
                    if (booleanValue && !TextUtils.isEmpty(str2)) {
                        xyo d7 = xwj.a.d();
                        d7.H("Running money annotator on");
                        d7.c(messageCoreData.B());
                        d7.q();
                        akrh e = aktp.e("MessageAnnotationUtils#MoneyAnnotator");
                        try {
                            Pattern pattern = alds.a;
                            if (albo.ah(str2)) {
                                int i5 = alog.d;
                                g4 = alsx.a;
                            } else {
                                alob alobVar = new alob();
                                HashMap hashMap = new HashMap();
                                StringBuilder sb = new StringBuilder(str2);
                                Matcher matcher = alds.a.matcher(str2);
                                char c2 = 0;
                                int i6 = 0;
                                while (matcher.find()) {
                                    Locale locale = Locale.US;
                                    Object[] objArr = new Object[1];
                                    objArr[c2] = Integer.valueOf(hashMap.size());
                                    String format = String.format(locale, "<MONEY_%d>", objArr);
                                    sb.replace(matcher.start() + i6, matcher.end() + i6, format);
                                    int length = (format.length() - matcher.end()) + matcher.start();
                                    hashMap.put(format, new aspl(i6, length, matcher.group()));
                                    i6 += length;
                                    c2 = 0;
                                }
                                if (hashMap.isEmpty()) {
                                    g4 = alobVar.g();
                                } else {
                                    String sb2 = sb.toString();
                                    alds.a(alobVar, alds.b.matcher(sb2), hashMap, 2, 1);
                                    alds.a(alobVar, alds.c.matcher(sb2), hashMap, 1, 2);
                                    g4 = alobVar.g();
                                }
                            }
                            e.close();
                            if (!g4.isEmpty()) {
                                arrayList5.addAll(g4);
                                ((mho) xwjVar2.h.b()).D(messageCoreData, xwjVar2.i(messageCoreData, "MONEY", 11));
                            }
                        } finally {
                        }
                    }
                    if (((Boolean) yhr.a.e()).booleanValue() && !TextUtils.isEmpty(str2)) {
                        xyo d8 = xwj.a.d();
                        d8.H("Running account number annotator on");
                        d8.c(messageCoreData.B());
                        d8.q();
                        Pattern pattern2 = aldq.a;
                        if (albo.ah(str2)) {
                            int i7 = alog.d;
                            g3 = alsx.a;
                        } else {
                            alob alobVar2 = new alob();
                            List a3 = aldq.a(aldq.a, str2, 4);
                            alobVar2.j(a3);
                            if (a3.isEmpty()) {
                                alobVar2.j(aldq.a(aldq.b, str2, 1));
                            }
                            g3 = alobVar2.g();
                        }
                        if (!g3.isEmpty()) {
                            arrayList5.addAll(g3);
                            ((mho) xwjVar2.h.b()).D(messageCoreData, xwjVar2.i(messageCoreData, "ACCOUNT_NUMBER", 10));
                        }
                    }
                    if (((Boolean) yhr.a.e()).booleanValue() && !TextUtils.isEmpty(str2)) {
                        xyo d9 = xwj.a.d();
                        d9.H("Running coupon annotator on");
                        d9.c(messageCoreData.B());
                        d9.q();
                        Pattern pattern3 = aldr.a;
                        if (albo.ah(str2)) {
                            int i8 = alog.d;
                            g2 = alsx.a;
                        } else {
                            Matcher matcher2 = aldr.a.matcher(str2);
                            alob alobVar3 = new alob();
                            while (matcher2.find()) {
                                if (matcher2.groupCount() >= 2) {
                                    aozy createBuilder3 = aqby.a.createBuilder();
                                    int start = matcher2.start(2);
                                    if (!createBuilder3.b.isMutable()) {
                                        createBuilder3.u();
                                    }
                                    ((aqby) createBuilder3.b).g = start;
                                    int end = matcher2.end(2);
                                    if (!createBuilder3.b.isMutable()) {
                                        createBuilder3.u();
                                    }
                                    ((aqby) createBuilder3.b).h = end;
                                    if (!createBuilder3.b.isMutable()) {
                                        createBuilder3.u();
                                    }
                                    ((aqby) createBuilder3.b).d = aqas.f(10);
                                    if (!createBuilder3.b.isMutable()) {
                                        createBuilder3.u();
                                    }
                                    ((aqby) createBuilder3.b).e = "COUPON";
                                    aozy createBuilder4 = aqcv.a.createBuilder();
                                    String group = matcher2.group(2);
                                    if (!createBuilder4.b.isMutable()) {
                                        createBuilder4.u();
                                    }
                                    aqcv aqcvVar = (aqcv) createBuilder4.b;
                                    group.getClass();
                                    aqcvVar.b = group;
                                    aqcv aqcvVar2 = (aqcv) createBuilder4.s();
                                    if (!createBuilder3.b.isMutable()) {
                                        createBuilder3.u();
                                    }
                                    aqby aqbyVar2 = (aqby) createBuilder3.b;
                                    aqcvVar2.getClass();
                                    aqbyVar2.c = aqcvVar2;
                                    aqbyVar2.b = 13;
                                    alobVar3.h((aqby) createBuilder3.s());
                                }
                            }
                            g2 = alobVar3.g();
                        }
                        if (!g2.isEmpty()) {
                            arrayList5.addAll(g2);
                            ((mho) xwjVar2.h.b()).D(messageCoreData, xwjVar2.i(messageCoreData, "COUPON", 10));
                        }
                    }
                    if (((Boolean) yhr.a.e()).booleanValue() && !TextUtils.isEmpty(str2)) {
                        xyo d10 = xwj.a.d();
                        d10.H("Running percentage annotator on");
                        d10.c(messageCoreData.B());
                        d10.q();
                        Pattern pattern4 = aldt.a;
                        if (albo.ah(str2)) {
                            int i9 = alog.d;
                            g = alsx.a;
                        } else {
                            Matcher matcher3 = aldt.a.matcher(str2);
                            alob alobVar4 = new alob();
                            while (matcher3.find()) {
                                aozy createBuilder5 = aqby.a.createBuilder();
                                int start2 = matcher3.start();
                                if (!createBuilder5.b.isMutable()) {
                                    createBuilder5.u();
                                }
                                ((aqby) createBuilder5.b).g = start2;
                                int end2 = matcher3.end();
                                if (!createBuilder5.b.isMutable()) {
                                    createBuilder5.u();
                                }
                                ((aqby) createBuilder5.b).h = end2;
                                if (!createBuilder5.b.isMutable()) {
                                    createBuilder5.u();
                                }
                                ((aqby) createBuilder5.b).d = aqas.f(10);
                                if (!createBuilder5.b.isMutable()) {
                                    createBuilder5.u();
                                }
                                ((aqby) createBuilder5.b).e = "PERCENTAGE";
                                aozy createBuilder6 = aqcv.a.createBuilder();
                                String group2 = matcher3.group();
                                if (!createBuilder6.b.isMutable()) {
                                    createBuilder6.u();
                                }
                                aqcv aqcvVar3 = (aqcv) createBuilder6.b;
                                group2.getClass();
                                aqcvVar3.b = group2;
                                aqcv aqcvVar4 = (aqcv) createBuilder6.s();
                                if (!createBuilder5.b.isMutable()) {
                                    createBuilder5.u();
                                }
                                aqby aqbyVar3 = (aqby) createBuilder5.b;
                                aqcvVar4.getClass();
                                aqbyVar3.c = aqcvVar4;
                                aqbyVar3.b = 13;
                                alobVar4.h((aqby) createBuilder5.s());
                            }
                            g = alobVar4.g();
                        }
                        if (!g.isEmpty()) {
                            arrayList5.addAll(g);
                            ((mho) xwjVar2.h.b()).D(messageCoreData, xwjVar2.i(messageCoreData, "PERCENTAGE", 10));
                        }
                    }
                    arrayList4.addAll(arrayList5);
                    if (!xwj.d(arrayList4)) {
                        return aktp.ag(arrayList4);
                    }
                    String am2 = messageCoreData.am();
                    if (am2 == null) {
                        c = new ArrayList();
                    } else {
                        c = anna.e('\n').c(am2);
                    }
                    List list = c;
                    int size = list.size();
                    if (size != 3 && size != 4 && size != 5) {
                        return aktp.ag(arrayList4);
                    }
                    String str3 = (String) alzz.aO(list);
                    boolean a4 = yte.a(str3);
                    if (!a4) {
                        if (!TextUtils.isEmpty(str3)) {
                            Iterator it = ytd.d((String) yig.E.e()).iterator();
                            while (it.hasNext()) {
                                if (str3.contains((String) it.next())) {
                                }
                            }
                        }
                        return aktp.ag(arrayList4);
                    }
                    int size2 = list.size();
                    if (a4 && !((String) list.get(size2 - 2)).trim().isEmpty()) {
                        return aktp.ag(arrayList4);
                    }
                    if (!xwj.g()) {
                        h2 = aktp.ag(null);
                    } else {
                        h2 = yyb.aH().h(new xqp(16), xwjVar2.g);
                    }
                    return h2.h(new puq(list, arrayList4, a4, str3, 5), xwjVar2.g);
                }
            }, xwjVar.f);
        }
        return i.i(new ukk((Object) this, (Object) p, (Object) q, 0), this.i);
    }

    @Override // defpackage.ukn
    public final boolean b(srd srdVar) {
        if ((srdVar.m() & 2) != 0 && srdVar.k() == 1) {
            return true;
        }
        return false;
    }
}
