package defpackage;

import android.app.NotificationChannel;
import android.content.Context;
import android.database.Cursor;
import android.media.AudioAttributes;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoContentProvider;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.events.Event;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wfh {
    public final Object a;

    public wfh(Object obj) {
        this.a = obj;
    }

    public static /* synthetic */ amfq u(int i) {
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfqVar.getClass();
        aozy createBuilder = ameo.a.createBuilder();
        createBuilder.getClass();
        alzz.t(xyp.a, createBuilder);
        alzz.j(alzz.s(createBuilder), amfqVar);
        alzz.n(amfp.BUGLE_WEAR_CONVERSATION_SYNC_EVENT, amfqVar);
        aozy createBuilder2 = amuh.a.createBuilder();
        createBuilder2.getClass();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        amuh amuhVar = (amuh) apagVar;
        amuhVar.c = 1;
        amuhVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar2 = createBuilder2.b;
        amuh amuhVar2 = (amuh) apagVar2;
        amuhVar2.e = 1;
        amuhVar2.b |= 8;
        if (!apagVar2.isMutable()) {
            createBuilder2.u();
        }
        amuh amuhVar3 = (amuh) createBuilder2.b;
        amuhVar3.d = i - 1;
        amuhVar3.b |= 2;
        apag s = createBuilder2.s();
        s.getClass();
        amuh amuhVar4 = (amuh) s;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.bi = amuhVar4;
        amfrVar.g |= 16;
        aozy builder = alzz.h(amfqVar).toBuilder();
        builder.getClass();
        return (amfq) builder;
    }

    public static String x(String str) {
        return ebz.a().b(str);
    }

    public static String y(String str) {
        return ebz.a().c(str, ecc.a);
    }

    public final boolean A() {
        if (((Context) this.a).getResources().getConfiguration().getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public final String B(String str, TextPaint textPaint, int i, int i2) {
        CharSequence listEllipsize;
        Object obj = this.a;
        String z = z(str);
        listEllipsize = TextUtils.listEllipsize((Context) this.a, alzz.an(anna.h(", ").i().c(str)), ((Context) obj).getResources().getString(R.string.enumeration_comma), textPaint, i, i2);
        String charSequence = listEllipsize.toString();
        if (TextUtils.isEmpty(charSequence)) {
            return z;
        }
        return charSequence;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yjj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [yjj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [yjj, java.lang.Object] */
    public final void C() {
        this.a.b();
        this.a.c();
        this.a.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yjj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [yjj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [yjj, java.lang.Object] */
    public final void D() {
        this.a.b();
        this.a.d();
        this.a.a();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [armf, java.lang.Object] */
    public final void E(final List list, final MessageIdType messageIdType, final boolean z, final long j) {
        akrh e = aktp.e("ConversationSuggestionDatabaseOperations#addConversationSuggestions");
        try {
            xyl.h();
            if (list != null && !adom.o(list)) {
                ((agnq) this.a.b()).e("ConversationSuggestionDatabaseOperations#addConversationSuggestions", new Runnable() { // from class: yit
                    @Override // java.lang.Runnable
                    public final void run() {
                        agnw d;
                        agnw d2;
                        Object apply;
                        List<ConversationSuggestion> list2 = list;
                        rve a = rve.a(((ConversationSuggestion) list2.get(0)).getTargetRcsMessageId());
                        if (rve.l(a)) {
                            slt sltVar = new slt();
                            sltVar.f("deleteConversationSuggestionsByRcsMessage");
                            apply = new yec(a, 7).apply(new slx());
                            sltVar.a = new agpw((slx) apply);
                            sltVar.d();
                        }
                        for (ConversationSuggestion conversationSuggestion : list2) {
                            boolean z2 = z;
                            long j2 = j;
                            MessageIdType messageIdType2 = messageIdType;
                            String[] strArr = sly.a;
                            int i = ske.a;
                            slo sloVar = new slo();
                            sloVar.i(messageIdType2);
                            sloVar.b(conversationSuggestion.getSuggestionType());
                            sloVar.e(conversationSuggestion.serializeProperties());
                            sloVar.c(conversationSuggestion.getPostBackData());
                            sloVar.d(conversationSuggestion.getPostBackEncoding());
                            sloVar.f(rve.a(conversationSuggestion.getRcsMessageId()));
                            sloVar.j(rve.a(conversationSuggestion.getTargetRcsMessageId()));
                            sloVar.h(j2);
                            sloVar.g(z2);
                            sln a2 = sloVar.a();
                            d = agnc.d("$primary");
                            d2 = agnc.d("$primary");
                            agnc.a(d2, "conversation_suggestions", a2, new skt(d, 3), new rug(a2, 20));
                        }
                    }
                });
            }
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void F(int i) {
        asjy asjyVar = aska.a;
        try {
            asjy asjyVar2 = aska.a;
            Object obj = this.a;
            if (asjyVar2 == null && !aska.a((Context) obj)) {
                throw new asjz("No default launcher available");
            }
            try {
                aska.a.b((Context) obj, aska.b, i);
            } catch (Exception e) {
                throw new asjz(e);
            }
        } catch (asjz e2) {
            if (Log.isLoggable("ShortcutBadger", 3)) {
                Log.d("ShortcutBadger", "Unable to execute badge", e2);
            }
        }
    }

    public final boolean G() {
        if (((Boolean) vio.a.e()).booleanValue()) {
            return false;
        }
        return aska.b((Context) this.a);
    }

    public final void H(boolean z) {
        bl$$ExternalSyntheticApiModelOutline0.m(this.a).enableLights(z);
    }

    public final void I(boolean z) {
        bl$$ExternalSyntheticApiModelOutline0.m(this.a).enableVibration(z);
    }

    public final void J(String str) {
        bl$$ExternalSyntheticApiModelOutline0.m(this.a).setGroup(str);
    }

    public final void K(Uri uri, AudioAttributes audioAttributes) {
        bl$$ExternalSyntheticApiModelOutline0.m(this.a).setSound(uri, audioAttributes);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final boolean L() {
        return ((Boolean) this.a.b()).booleanValue();
    }

    public final akul M() {
        return Q(new yeb(7));
    }

    public final akul N(long j) {
        return R(new mdq(j, 16));
    }

    public final akul O(long j) {
        return R(new mdq(j, 18));
    }

    public final akul P(long j) {
        return R(new mdq(j, 17));
    }

    public final akul Q(algk algkVar) {
        return akul.g(((aiwu) this.a).a()).h(algkVar, andi.a);
    }

    public final akul R(algk algkVar) {
        return akul.g(((aiwu) this.a).b(algkVar, andi.a));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xyt, java.lang.Object] */
    public final boolean S() {
        if (!((yaq) this.a.a()).o()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    public final boolean T(rru rruVar) {
        String str;
        boolean z;
        String r = rruVar.r();
        String str2 = (String) rruVar.n().map(new xos(20)).orElse(null);
        if (true == TextUtils.isEmpty(r)) {
            r = str2;
        }
        if (!TextUtils.isEmpty(((wfh) this.a.b()).z(albo.ag(r))) && rruVar.x()) {
            if (((okf) rruVar.e.b()).a()) {
                sac sacVar = rruVar.d;
                sacVar.ao(18, "participant_lookup_key");
                str = sacVar.s;
            } else {
                san sanVar = rruVar.c;
                sanVar.ao(18, "participant_lookup_key");
                str = sanVar.s;
            }
            if (!TextUtils.isEmpty(str)) {
                if (((okf) rruVar.e.b()).a()) {
                    sac sacVar2 = rruVar.d;
                    sacVar2.ao(32, "IS_ENTERPRISE");
                    z = sacVar2.G;
                } else {
                    san sanVar2 = rruVar.c;
                    sanVar2.ao(32, "IS_ENTERPRISE");
                    z = sanVar2.G;
                }
                if (!z && !rruVar.R() && rruVar.M() == tqc.UNARCHIVED) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean U(Context context) {
        if (((abqb) this.a).h(context, 12200000) == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r8 == 1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        if (r8 != 4) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0022, code lost:
    
        if (r8 == 2) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r8 == 2) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
    
        r8 = 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean V(defpackage.atal r7, int r8) {
        /*
            r6 = this;
            int r0 = r7.a
            r1 = 1
            if (r0 == 0) goto L25
            if (r0 != r8) goto L8
            goto L25
        L8:
            r2 = 0
            r3 = 2
            if (r0 != r1) goto L12
            if (r8 != r3) goto L10
        Le:
            r8 = r3
            goto L25
        L10:
            r1 = r2
            goto L25
        L12:
            if (r0 != r3) goto L17
            if (r8 != r1) goto L10
            goto L25
        L17:
            r4 = 3
            r5 = 4
            if (r0 != r4) goto L20
            if (r8 == r3) goto L25
            if (r8 != r5) goto L10
            goto L25
        L20:
            if (r0 != r5) goto L10
            if (r8 != r3) goto L10
            goto Le
        L25:
            if (r1 == 0) goto L32
            java.lang.Object r0 = r6.a
            java.lang.Object r7 = r7.b
            java.lang.String r7 = (java.lang.String) r7
            ykw r0 = (defpackage.ykw) r0
            r0.j(r7, r8)
        L32:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wfh.V(atal, int):boolean");
    }

    public final void W(atal atalVar) {
        V(atalVar, 4);
    }

    public final atal X() {
        return new atal(((ykw) this.a).d("spam_protection_feature_consent", 0), (byte[]) null, (char[]) null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    public final yyt Y(yfx yfxVar) {
        return new yyt((anen) this.a.b(), yfxVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void a(wfg wfgVar, uta utaVar) {
        ((uof) this.a.b()).a(upk.b("mark_rcs_messages_in_telephony", wfgVar, utaVar));
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [armf, java.lang.Object] */
    public final qei b(wbk wbkVar, wcz wczVar) {
        wcx wcxVar;
        wed wedVar;
        int i = wczVar.b;
        int k = wch.k(i);
        if (k != 0) {
            int i2 = k - 1;
            if (i2 != 0) {
                if (i2 == 1) {
                    if (i == 2) {
                        wedVar = (wed) wczVar.c;
                    } else {
                        wedVar = wed.a;
                    }
                    String str = wedVar.c;
                    int i3 = wbkVar.c;
                    int Y = a.Y(i3);
                    if (Y != 0 && Y == 3) {
                        return ((psq) this.a.b()).a(str, true);
                    }
                    int Y2 = a.Y(i3);
                    if (Y2 != 0 && Y2 == 4) {
                        if (str.startsWith("sip:")) {
                            str = str.substring(4);
                        }
                        int indexOf = str.indexOf(59);
                        if (indexOf >= 0) {
                            str = str.substring(0, indexOf);
                        }
                        return ((psq) this.a.b()).b(str);
                    }
                    throw new IllegalArgumentException("Conversation type not supported");
                }
                throw new IllegalArgumentException("No valid destination set");
            }
            psq psqVar = (psq) this.a.b();
            if (wczVar.b == 1) {
                wcxVar = (wcx) wczVar.c;
            } else {
                wcxVar = wcx.a;
            }
            return psqVar.a(wcxVar.c, false);
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void c(wbd wbdVar, uta utaVar) {
        ((uof) this.a.b()).b(upk.b("rcs_engine_get_single_message", wbdVar, utaVar));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public final synchronized void d(Event event) {
        Set set = (Set) this.a.get(Integer.valueOf(event.g));
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((ajoe) it.next()).b(event);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void e(wng wngVar) {
        Collection.EL.forEach((Set) this.a.b(), new vwq(wngVar, 19));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void f(wng wngVar, boolean z) {
        Collection.EL.forEach((Set) this.a.b(), new ive(wngVar, z, 4));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [msk, java.lang.Object] */
    public final msh g(Cursor cursor) {
        int i = cursor.getInt(1);
        String string = cursor.getString(0);
        if (string != null) {
            String a = wyi.a(wyi.b(string, 4), i);
            ?? r0 = this.a;
            return r0.v(r0.h(r0.n(a), a));
        }
        throw new wyd();
    }

    public final /* synthetic */ wxb h() {
        apag s = ((aozy) this.a).s();
        s.getClass();
        return (wxb) s;
    }

    public final void i(amyb amybVar) {
        mar a = ((mbb) this.a).a();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfqVar.getClass();
        alzz.n(amfp.SATELLITE_EVENT, amfqVar);
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.bC = amybVar;
        amfrVar.h |= 65536;
        a.a((amfq) alzz.h(amfqVar).toBuilder(), mbt.LOG_SPEC_SATELLITE_EVENTS);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void j(qgf qgfVar, uta utaVar) {
        ((uof) this.a.b()).a(upk.b("tachygram_send_message", qgfVar, utaVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0088, code lost:
    
        if (r2 == false) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.Collection, java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005e -> B:13:0x0087). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0074 -> B:10:0x0078). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData r8, defpackage.xcv r9, int r10, defpackage.arpe r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.xdb
            if (r0 == 0) goto L13
            r0 = r11
            xdb r0 = (defpackage.xdb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            xdb r0 = new xdb
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.c
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r8 = r0.b
            int r9 = r0.f
            ixs r10 = r0.e
            java.lang.Object r2 = r0.a
            defpackage.aqil.P(r11)
            goto L78
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            defpackage.aqil.P(r11)
            java.lang.Object r11 = r7.a
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L45
        L43:
            r3 = r4
            goto L8a
        L45:
            java.util.Iterator r11 = r11.iterator()
            r6 = r9
            r9 = r8
            r8 = r11
            r11 = r10
            r10 = r6
        L4e:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r8.next()
            xdc r2 = (defpackage.xdc) r2
            boolean r5 = r2.a(r9)
            if (r5 == 0) goto L87
            r0.a = r9
            r5 = r10
            ixs r5 = (defpackage.ixs) r5
            r0.e = r5
            r0.f = r11
            r0.b = r8
            r0.d = r4
            java.lang.Object r2 = r2.b(r9, r0)
            if (r2 != r1) goto L74
            return r1
        L74:
            r6 = r2
            r2 = r9
            r9 = r11
            r11 = r6
        L78:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L83
            r11 = r9
            r9 = r2
            goto L87
        L83:
            r11 = r9
            r9 = r2
            r2 = r3
            goto L88
        L87:
            r2 = r4
        L88:
            if (r2 != 0) goto L4e
        L8a:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wfh.k(com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData, xcv, int, arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [apwt, java.lang.Object] */
    public final boolean l(boolean z, int i, int i2) {
        if (!z) {
            return false;
        }
        xbe a = ((xbf) this.a.b()).a(i);
        if (!TextUtils.isEmpty(a.j())) {
            int a2 = a.a();
            if (a2 < 0 || i2 <= a2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final long m() {
        return ((ykw) this.a).e("last_sync_time_millis", -1L);
    }

    public final boolean n() {
        return ((ykw) this.a).q("bugle_full_sync_in_progress", false);
    }

    public final BusinessInfoData o(String str) {
        Context context = (Context) this.a;
        Uri buildBusinessInfoUri = BusinessInfoContentProvider.BusinessInfoContentProviderInternal.buildBusinessInfoUri(str, context);
        Uri buildBusinessInfoPropertiesUri = BusinessInfoContentProvider.BusinessInfoContentProviderInternal.buildBusinessInfoPropertiesUri(str, context);
        Cursor e = vcp.e(context.getContentResolver(), buildBusinessInfoUri, BusinessInfoDatabaseConstants.BusinessInfoAndVerifierInfoViewConstants.DEFAULT_PROJECTION, null, null, null);
        try {
            Cursor e2 = vcp.e(((Context) this.a).getContentResolver(), buildBusinessInfoPropertiesUri, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.DEFAULT_PROJECTION, null, null, null);
            try {
                BusinessInfoData createFromCursors = BusinessInfoData.createFromCursors(e, e2);
                if (e2 != null) {
                    e2.close();
                }
                if (e != null) {
                    e.close();
                }
                return createFromCursors;
            } finally {
            }
        } catch (Throwable th) {
            if (e != null) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final /* synthetic */ ywp p() {
        apag s = ((aozy) this.a).s();
        s.getClass();
        return (ywp) s;
    }

    public final void q(int i) {
        aozy aozyVar = (aozy) this.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ywp ywpVar = (ywp) aozyVar.b;
        ywp ywpVar2 = ywp.a;
        ywpVar.d = a.aq(i);
    }

    public final /* synthetic */ ywl r() {
        apag s = ((aozy) this.a).s();
        s.getClass();
        return (ywl) s;
    }

    public final /* synthetic */ apdk s() {
        List unmodifiableList = DesugarCollections.unmodifiableList(((ywl) ((aozy) this.a).b).b);
        unmodifiableList.getClass();
        return new apdk(unmodifiableList);
    }

    public final /* synthetic */ void t(apdk apdkVar, Iterable iterable) {
        apdkVar.getClass();
        iterable.getClass();
        aozy aozyVar = (aozy) this.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        ywl ywlVar = (ywl) aozyVar.b;
        ywl ywlVar2 = ywl.a;
        apax apaxVar = ywlVar.b;
        if (!apaxVar.c()) {
            ywlVar.b = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(iterable, ywlVar.b);
    }

    public final void v() {
        w(3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void w(int i) {
        mar a = ((mbb) this.a.b()).a();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfqVar.getClass();
        alzz.n(amfp.MEET_CALLING_EVENT, amfqVar);
        aozy createBuilder = amwb.a.createBuilder();
        createBuilder.getClass();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        amwb amwbVar = (amwb) createBuilder.b;
        amwbVar.c = i - 1;
        amwbVar.b |= 1;
        apag s = createBuilder.s();
        s.getClass();
        amwb amwbVar2 = (amwb) s;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.bv = amwbVar2;
        amfrVar.h |= 8;
        a.b((amfq) alzz.h(amfqVar).toBuilder(), mbt.LOG_SPEC_MEET_CALLING_EVENTS);
    }

    public final String z(String str) {
        atkn atknVar = ecc.a;
        if (A() && !TextUtils.isEmpty(str)) {
            String string = ((Context) this.a).getResources().getString(R.string.comma_list_separator);
            ebz a = ebz.a();
            if (str.contains(", ")) {
                String[] split = str.split(", ");
                for (int i = 0; i < split.length; i++) {
                    split[i] = a.c(split[i], atknVar);
                }
                return new algs(string).e(split);
            }
            return a.c(str, atknVar);
        }
        return str;
    }

    public wfh(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public wfh(aogy aogyVar) {
        aogyVar.getClass();
        this.a = aogyVar;
    }

    public wfh(armf armfVar, byte[] bArr, byte[] bArr2, byte[] bArr3, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public wfh(yjy yjyVar) {
        yjyVar.getClass();
        this.a = yjyVar;
    }

    public wfh() {
        this.a = new ConcurrentHashMap();
    }

    public wfh(apwt apwtVar) {
        apwtVar.getClass();
        this.a = apwtVar;
    }

    public wfh(armf armfVar, byte[] bArr, int[] iArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public wfh(armf armfVar, armf armfVar2, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
    }

    public wfh(Set set) {
        set.getClass();
        this.a = set;
    }

    public wfh(mbb mbbVar) {
        mbbVar.getClass();
        this.a = mbbVar;
    }

    public wfh(armf armfVar, byte[] bArr, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bc, code lost:
    
        if (r2.length() != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00bf, code lost:
    
        r2 = java.lang.Integer.parseInt(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public wfh(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wfh.<init>(java.lang.String):void");
    }

    public wfh(armf armfVar, armf armfVar2) {
        armfVar.getClass();
        armfVar2.getClass();
        this.a = armfVar;
    }

    public wfh(armf armfVar, float[] fArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public wfh(xyt xytVar) {
        xytVar.getClass();
        this.a = xytVar;
    }

    public wfh(String str, String str2, int i) {
        this.a = new NotificationChannel(str, str2, i);
    }
}
