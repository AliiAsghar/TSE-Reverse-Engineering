package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.LruCache;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rxn {
    private static final alvi c = alvi.m("com/google/android/apps/messaging/shared/datamodel/data/participant/ParticipantData");
    private static final LruCache d = new LruCache(1000);
    public static final uuf a = uuh.q(177593234);
    public static final xze b = xze.g("BugleDataModel", "ParticipantData");

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        Context B();

        armf LN();

        armf LS();

        armf LT();

        armf LU();

        armf LW();

        armf Ma();

        mbl ab();

        rrh df();

        xbf fx();

        xca fy();

        yjr gk();

        yjy i();
    }

    public static ParticipantsTable.BindData a(String str, String str2, String str3) {
        return f(str, str2, str3).a();
    }

    public static ParticipantsTable.BindData b(String str) {
        return g(str).a();
    }

    public static ParticipantsTable.BindData c(msh mshVar, int i) {
        return j(mshVar, null, i).a();
    }

    public static ParticipantsTable.BindData d(int i) {
        boolean z;
        if (i != -2) {
            z = true;
        } else {
            z = false;
        }
        xyl.k(z);
        tap c2 = ParticipantsTable.c();
        v(c2);
        c2.S(i);
        c2.R(-1);
        c2.Q(null);
        c2.H(null);
        c2.q(null);
        c2.u(null);
        c2.t(null);
        c2.M(null);
        c2.l(-1L);
        c2.C(null);
        c2.e(false);
        c2.T(0);
        c2.U(null);
        return c2.a();
    }

    public static ParticipantsTable.BindData e(Context context, ParticipantsTable.BindData bindData, String str) {
        akrh e = aktp.e("ParticipantData.lookupCequint");
        try {
            rrh df = ((a) yyb.aL(a.class)).df();
            if (bindData != null && bindData.s() != -1 && bindData.s() != -2 && bindData.s() != -3 && (bindData.s() != -4 || !TextUtils.isEmpty(bindData.L()))) {
                if (bindData.s() == -1) {
                    b.l("lookupCequint skipped because participant is PARTICIPANT_CONTACT_ID_NOT_RESOLVED");
                } else if (bindData.s() == -1) {
                    b.l("lookupCequint skipped because participant is PARTICIPANT_CONTACT_ID_NOT_RESOLVED");
                } else if (bindData.s() == -2) {
                    b.l("lookupCequint skipped because participant is PARTICIPANT_CONTACT_ID_NOT_FOUND");
                } else if (bindData.s() == -4) {
                    b.l("lookupCequint skipped because participant is PARTICIPANT_CEQUINT_ID and name not null");
                }
                bindData = null;
                e.close();
                return bindData;
            }
            if (df.b(context)) {
                rrg a2 = df.a(context, str);
                if (a2 != null && bindData != null) {
                    if (a2.d) {
                        tap z = bindData.z();
                        z.l(-3L);
                        bindData = z.a();
                    } else if (!TextUtils.isEmpty(a2.a)) {
                        tap z2 = bindData.z();
                        z2.M(a2.b);
                        z2.l(-4L);
                        z2.u(a2.a);
                        z2.t(a2.a);
                        bindData = z2.a();
                    }
                }
                e.close();
                return bindData;
            }
            bindData = null;
            e.close();
            return bindData;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static tap f(String str, String str2, String str3) {
        xze xzeVar = xca.a;
        xyl.k(msx.g(str));
        if (TextUtils.isEmpty(str2)) {
            a aVar = (a) yyb.aL(a.class);
            String R = ((yyt) aVar.LU().b()).R();
            alvw i = c.i();
            i.X(alwp.a, "Bugle");
            ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/datamodel/data/participant/ParticipantData", "buildFromBotInfo", 475, "ParticipantData.java")).t("Participant data was populated with default business name. Bot id: %s", yyb.bh(str));
            psi psiVar = (psi) aVar.LT().b();
            aozy createBuilder = amhq.a.createBuilder();
            if (str != null) {
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amhq amhqVar = (amhq) createBuilder.b;
                amhqVar.b |= 1;
                amhqVar.c = str;
            }
            aozy createBuilder2 = amhp.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            apag apagVar = createBuilder2.b;
            amhp amhpVar = (amhp) apagVar;
            amhpVar.h = 2;
            amhpVar.b |= 32;
            if (!apagVar.isMutable()) {
                createBuilder2.u();
            }
            amhp amhpVar2 = (amhp) createBuilder2.b;
            amhq amhqVar2 = (amhq) createBuilder.s();
            amhqVar2.getClass();
            amhpVar2.c = amhqVar2;
            amhpVar2.b |= 1;
            amhp amhpVar3 = (amhp) createBuilder2.s();
            amfq amfqVar = (amfq) amfr.a.createBuilder();
            amfp amfpVar = amfp.BUGLE_RBM_BUSINESS_INFO;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar = (amfr) amfqVar.b;
            amfrVar.i = amfpVar.dg;
            amfrVar.b |= 1;
            if (!amfqVar.b.isMutable()) {
                amfqVar.u();
            }
            amfr amfrVar2 = (amfr) amfqVar.b;
            amhpVar3.getClass();
            amfrVar2.x = amhpVar3;
            amfrVar2.b |= 131072;
            ((maq) psiVar.b.b()).j(amfqVar);
            str2 = R;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = uvl.k();
        }
        tap i2 = i(str);
        i2.H(str);
        i2.q(str2);
        i2.I(1);
        lru.j(i2, ParticipantColor.b(str3));
        return i2;
    }

    public static tap g(String str) {
        String l;
        String x;
        msk mskVar = (msk) ((a) yyb.aL(a.class)).LS().b();
        tap i = i(str);
        String str2 = i.g;
        xze xzeVar = xca.a;
        boolean g = msx.g(str2);
        msh n = mskVar.n(i.g);
        uuf uufVar = msw.a;
        boolean a2 = orf.a();
        if (g) {
            l = i.g;
        } else {
            l = mskVar.k(n).l(a2);
        }
        i.H(l);
        if (g) {
            x = i.f;
        } else {
            x = x(mskVar.c(i.f, new rxm(0)), mskVar);
        }
        i.q(x);
        y(i, -1);
        return i;
    }

    public static tap h(int i, msh mshVar) {
        String o;
        wyj b2;
        xbd xbdVar = ((a) yyb.aL(a.class)).fx().a(i).c;
        if (xbdVar != null && (b2 = xbdVar.b(mshVar)) != null) {
            tap tapVar = (tap) ((Optional) b2.b).filter(new rsi(12)).map(new rbe(b2, i, 3)).or(new rnb(b2, 8)).orElse(null);
            if (tapVar != null) {
                return tapVar;
            }
            b.q("Invalid hidden contacts entry");
        }
        if (((Boolean) new mst(7).get()).booleanValue()) {
            String m = mshVar.m();
            m.getClass();
            tap i2 = i(m);
            String k = mshVar.k();
            k.getClass();
            i2.H(k);
            String str = mshVar.F().a;
            str.getClass();
            i2.q(str);
            y(i2, -1);
            return i2;
        }
        boolean a2 = ((opa) ((a) yyb.aL(a.class)).LW().b()).a();
        String i3 = mshVar.i();
        if (a2) {
            o = mshVar.l(((Boolean) msk.a.e()).booleanValue());
        } else {
            o = mshVar.o(((Boolean) msk.a.e()).booleanValue());
        }
        i3.getClass();
        o.getClass();
        tap i4 = i(i3);
        i4.H(o);
        i4.q(albo.ag(mshVar.F().a));
        y(i4, -1);
        return i4;
    }

    public static tap i(String str) {
        rxt.c(str, 1);
        tap c2 = ParticipantsTable.c();
        v(c2);
        c2.S(-2);
        c2.R(-1);
        c2.Q(d.ap(str));
        c2.u(null);
        c2.t(null);
        c2.M(null);
        c2.l(-1L);
        c2.C(null);
        c2.e(false);
        c2.T(0);
        c2.U(null);
        return c2;
    }

    public static tap j(msh mshVar, String str, int i) {
        String o;
        String m;
        String j;
        String str2;
        String str3;
        a aVar = (a) yyb.aL(a.class);
        yjy i2 = aVar.i();
        yjr gk = aVar.gk();
        boolean a2 = ((opa) aVar.LW().b()).a();
        if (a2) {
            ((Boolean) new mst(15).get()).booleanValue();
            o = mshVar.j(false);
        } else {
            ((Boolean) new mst(15).get()).booleanValue();
            o = mshVar.o(false);
        }
        tap i3 = i(o);
        String str4 = i3.g;
        xze xzeVar = xca.a;
        boolean g = msx.g(str4);
        msh h = i2.h(i).h(i3.g);
        if (a2) {
            str2 = mshVar.k();
            str3 = mshVar.F().a;
        } else {
            if (g) {
                m = i3.g;
            } else {
                m = h.m();
            }
            if (g) {
                j = m;
            } else if (((Boolean) new mst(17).get()).booleanValue()) {
                j = h.F().a;
            } else {
                j = gk.j(m);
            }
            String str5 = j;
            str2 = m;
            str3 = str5;
        }
        if (true == TextUtils.isEmpty(str)) {
            str = str3;
        }
        rxt.c(str2, 2);
        rxt.c(str, 3);
        if (true != a2) {
            str3 = str;
        }
        i3.H(str2);
        i3.q(str3);
        i3.u(str);
        y(i3, i);
        return i3;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.CharSequence, java.lang.Object] */
    public static tap k(int i, String str) {
        wyj b2;
        a aVar = (a) yyb.aL(a.class);
        xbf fx = aVar.fx();
        msk mskVar = (msk) aVar.LS().b();
        xbe a2 = fx.a(i);
        xbd xbdVar = a2.c;
        int i2 = a2.a;
        if (xbdVar != null && (b2 = xbdVar.b(aVar.i().h(i2).h(str))) != null) {
            String str2 = (String) ((Optional) b2.b).map(new rxo(1)).orElse(null);
            boolean isEmpty = TextUtils.isEmpty(str2);
            ?? r1 = b2.c;
            if (!isEmpty) {
                tap j = j(mskVar.n(str2), (String) r1, i);
                t(j, str2, 1, aVar);
                return j;
            }
            if (!TextUtils.isEmpty(r1)) {
                String str3 = (String) r1;
                tap h = vcp.h(str3);
                t(h, str3, 2, aVar);
                return h;
            }
            xyl.c("Invalid hidden contacts entry");
        }
        tap j2 = j(mskVar.n(str), null, i);
        t(j2, str, 3, aVar);
        return j2;
    }

    public static String l(ParticipantsTable.BindData bindData) {
        if (!vcp.j(bindData) && bindData.O() != null) {
            return bindData.O();
        }
        return null;
    }

    public static String m(ParticipantsTable.BindData bindData) {
        msk mskVar = (msk) ((a) yyb.aL(a.class)).LS().b();
        String x = x(mskVar.s(bindData), mskVar);
        String F = bindData.F();
        if (TextUtils.isEmpty(F)) {
            return x;
        }
        return String.format("%s (%s)", x, F);
    }

    public static Collection n(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((ParticipantsTable.BindData) it.next()).P());
        }
        return arrayList;
    }

    static boolean o(tap tapVar, boolean z) {
        String str;
        if (true != z) {
            str = "EMERGENCY+SERVICE+PROVIDER";
        } else {
            str = "EMERGENCY+SERVICE+PROVIDER+DEMO";
        }
        return TextUtils.equals(tapVar.g, str);
    }

    public static boolean p(ParticipantsTable.BindData bindData) {
        return q(bindData.P());
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00de, code lost:
    
        if (r3.m(r9) == false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean q(java.lang.String r9) {
        /*
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            android.util.LruCache r1 = defpackage.rxn.d
            java.lang.Object r1 = r1.get(r9)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 != 0) goto Lf3
            java.lang.Class<rxn$a> r1 = rxn.a.class
            java.lang.Object r1 = defpackage.yyb.aL(r1)
            rxn$a r1 = (rxn.a) r1
            xbf r2 = r1.fx()
            xca r3 = r1.fy()
            armf r1 = r1.LN()
            java.lang.Object r1 = r1.b()
            orj r1 = (defpackage.orj) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto L3c
            boolean r1 = defpackage.lgc.C(r9)
            if (r1 != 0) goto Le9
            boolean r1 = defpackage.lgc.D(r9)
            if (r1 == 0) goto L3c
            goto Le9
        L3c:
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 != 0) goto Le9
            java.lang.String r1 = "ʼUNKNOWN_SENDER!ʼ"
            boolean r1 = android.text.TextUtils.equals(r9, r1)
            r4 = 1
            if (r1 != 0) goto Le8
            java.lang.String r1 = "ʼWAP_PUSH_SI!ʼ"
            boolean r1 = android.text.TextUtils.equals(r9, r1)
            if (r1 != 0) goto Le8
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 == 0) goto L5b
            goto Lda
        L5b:
            xbg r1 = r2.d
            znj r2 = r1.i
            boolean r2 = r2.W()
            if (r2 == 0) goto L68
            r1.b()
        L68:
            java.util.concurrent.locks.Lock r2 = r1.b
            r2.lock()
            android.util.SparseArray r2 = r1.d     // Catch: java.lang.Throwable -> Le1
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Le1
            r5 = r0
        L74:
            if (r5 >= r2) goto Ld5
            android.util.SparseArray r6 = r1.d     // Catch: java.lang.Throwable -> Le1
            java.lang.Object r6 = r6.valueAt(r5)     // Catch: java.lang.Throwable -> Le1
            xbe r6 = (defpackage.xbe) r6     // Catch: java.lang.Throwable -> Le1
            xbd r6 = r6.c     // Catch: java.lang.Throwable -> Le1
            if (r6 == 0) goto Ld2
            boolean r7 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> Le1
            if (r7 == 0) goto L89
            goto Ld2
        L89:
            java.util.List r6 = r6.a     // Catch: java.lang.Throwable -> Le1
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> Le1
        L8f:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> Le1
            if (r7 == 0) goto Ld2
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> Le1
            wyj r7 = (defpackage.wyj) r7     // Catch: java.lang.Throwable -> Le1
            java.lang.Object r8 = r7.c     // Catch: java.lang.Throwable -> Le1
            boolean r8 = r9.equals(r8)     // Catch: java.lang.Throwable -> Le1
            if (r8 == 0) goto L8f
            java.lang.Object r8 = r7.b     // Catch: java.lang.Throwable -> Le1
            j$.util.Optional r8 = (j$.util.Optional) r8     // Catch: java.lang.Throwable -> Le1
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Throwable -> Le1
            if (r8 != 0) goto Lcc
            java.lang.Object r7 = r7.b     // Catch: java.lang.Throwable -> Le1
            j$.util.Optional r7 = (j$.util.Optional) r7     // Catch: java.lang.Throwable -> Le1
            java.lang.Object r7 = r7.get()     // Catch: java.lang.Throwable -> Le1
            msh r7 = (defpackage.msh) r7     // Catch: java.lang.Throwable -> Le1
            mss r8 = new mss     // Catch: java.lang.Throwable -> Le1
            r8.<init>(r4)     // Catch: java.lang.Throwable -> Le1
            java.lang.Object r8 = r8.get()     // Catch: java.lang.Throwable -> Le1
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> Le1
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> Le1
            boolean r7 = r7.x(r8)     // Catch: java.lang.Throwable -> Le1
            if (r7 == 0) goto L8f
        Lcc:
            java.util.concurrent.locks.Lock r0 = r1.b
            r0.unlock()
            goto Le8
        Ld2:
            int r5 = r5 + 1
            goto L74
        Ld5:
            java.util.concurrent.locks.Lock r1 = r1.b
            r1.unlock()
        Lda:
            boolean r1 = r3.m(r9)
            if (r1 != 0) goto Le9
            goto Le8
        Le1:
            r9 = move-exception
            java.util.concurrent.locks.Lock r0 = r1.b
            r0.unlock()
            throw r9
        Le8:
            r0 = r4
        Le9:
            android.util.LruCache r1 = defpackage.rxn.d
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r1.put(r9, r2)
            return r0
        Lf3:
            boolean r9 = r1.booleanValue()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rxn.q(java.lang.String):boolean");
    }

    public static boolean r(ParticipantsTable.BindData bindData) {
        tqr A;
        if (TextUtils.isEmpty(bindData.N()) && !vcp.k(bindData) && !ryg.l(bindData) && (A = bindData.A()) != tqr.VERIFICATION_IN_PROGRESS && A != tqr.VERIFICATION_VERIFIED) {
            return false;
        }
        return true;
    }

    public static boolean s(ParticipantsTable.BindData bindData) {
        return TextUtils.equals(bindData.P(), "ʼUNKNOWN_SENDER!ʼ");
    }

    public static void t(tap tapVar, String str, int i, a aVar) {
        String str2;
        if (((Boolean) a.e()).booleanValue() && !d.ao(str) && d.ao(tapVar.g)) {
            xyo e = b.e();
            e.H("buildFromRawPhoneBySimCountryWithHiddenContacts encountered empty/whitespace send destination and non-empty/whitespace input destination.");
            if (i != 1) {
                if (i != 2) {
                    str2 = "VISIBLE_CONTACT";
                } else {
                    str2 = "HIDDEN_CONTACT_WITH_DISPLAY_NAME";
                }
            } else {
                str2 = "HIDDEN_CONTACT_WITH_RETURN_NUMBER";
            }
            e.z("emptyDestinationSource", str2);
            e.q();
            aVar.ab().e("Bugle.Datamodel.ParticipantData.BuildFromRawPhoneBySimCountryWithHiddenContacts.EmptySendDestination", i);
        }
    }

    public static int u(ParticipantsTable.BindData bindData) {
        xca fy = ((a) yyb.aL(a.class)).fy();
        String P = bindData.P();
        if (msx.i(P)) {
            return 2;
        }
        if (fy.l(P)) {
            return 3;
        }
        return 4;
    }

    public static void v(tap tapVar) {
        tapVar.v(null);
    }

    public static String w(Collection collection) {
        return TextUtils.join(" ", n(collection));
    }

    private static String x(msh mshVar, msk mskVar) {
        uuf uufVar = msw.a;
        boolean a2 = orf.a();
        return mskVar.i(mshVar, !a2).G(a2).toString();
    }

    private static void y(tap tapVar, int i) {
        a aVar = (a) yyb.aL(a.class);
        Resources resources = aVar.B().getResources();
        armf LN = aVar.LN();
        if (!TextUtils.equals(tapVar.g, "ʼUNKNOWN_SENDER!ʼ")) {
            if (!TextUtils.equals(tapVar.g, "ʼWAP_PUSH_SI!ʼ")) {
                if (TextUtils.equals(tapVar.g, ((a) yyb.aL(a.class)).fx().a(i).k())) {
                    tapVar.q(resources.getString(R.string.spam_reporting_from));
                    tapVar.u(tapVar.h);
                    tapVar.l(-2L);
                    return;
                }
                if (((orj) LN.b()).a() && o(tapVar, false)) {
                    tapVar.q(resources.getString(R.string.recipient_title_satellite));
                    tapVar.u(tapVar.h);
                    tapVar.l(-2L);
                    return;
                }
                if (((orj) LN.b()).a() && o(tapVar, true)) {
                    tapVar.q(resources.getString(R.string.recipient_title_satellite_demo));
                    tapVar.u(tapVar.h);
                    tapVar.l(-2L);
                    return;
                } else {
                    if (((Boolean) ((utz) yig.Q.get()).e()).booleanValue()) {
                        Optional optional = (Optional) ((apxx) ((a) yyb.aL(a.class)).Ma()).a;
                        if (optional.isPresent() && ((vni) optional.get()).m().equals(tapVar.g)) {
                            vni vniVar = (vni) ((Optional) ((apxx) aVar.Ma()).a).get();
                            tapVar.q(vniVar.n());
                            tapVar.u(vniVar.n());
                            tapVar.M(vniVar.e());
                            tapVar.I(3);
                            tapVar.l(-2L);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            tapVar.q(resources.getString(R.string.wap_push_from));
            tapVar.u(tapVar.h);
            tapVar.l(-2L);
            return;
        }
        tapVar.q(resources.getString(R.string.unknown_sender));
        tapVar.u(tapVar.h);
        tapVar.l(-2L);
    }
}
