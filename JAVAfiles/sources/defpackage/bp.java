package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bp extends arrp implements arqg {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(gvd gvdVar, String str, kkc kkcVar, int i) {
        super(0);
        this.d = i;
        this.c = gvdVar;
        this.a = str;
        this.b = kkcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v100, types: [java.lang.Object, java.util.function.Supplier] */
    /* JADX WARN: Type inference failed for: r1v107, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v136, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r3v40, types: [miu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v14, types: [miu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, lrc] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        Object obj;
        ConversationId conversationId;
        ResolvedRecipient resolvedRecipient = null;
        switch (this.d) {
            case 0:
                List list = ((bq) this.b).a;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!((br) it.next()).a.d) {
                            if (da.Y(2)) {
                                Log.v("FragmentManager", "Completing animating immediately");
                            }
                            du duVar = ((br) ((bq) this.b).a.get(0)).a;
                            throw null;
                        }
                    }
                }
                if (da.Y(2)) {
                    Log.v("FragmentManager", "Animating to start");
                }
                ((bq) this.b).b.getClass();
                throw null;
            case 1:
                throw null;
            case 2:
                Object obj2 = this.c;
                gvd gvdVar = (gvd) obj2;
                gzs.a(new gup(gvdVar, (String) this.a, gso.KEEP, aqjn.y(this.b)));
                return arnb.a;
            case 3:
                Object obj3 = this.a;
                Object obj4 = this.c;
                bp bpVar = new bp(this.b, obj4, obj3, 2, null);
                gyt A = ((gvd) obj4).e.A();
                List e = A.e((String) this.a);
                if (e.size() <= 1) {
                    gyq gyqVar = (gyq) aqjn.Z(e);
                    if (gyqVar == null) {
                        bpVar.a();
                    } else {
                        gys b = A.b(gyqVar.a);
                        if (b != null) {
                            if (b.f()) {
                                if (gyqVar.b == gtk.CANCELLED) {
                                    A.f(gyqVar.a);
                                    bpVar.a();
                                } else {
                                    final gys g = gys.g((gys) ((kkc) this.b).b, gyqVar.a, null, null, null, 0, 0L, 0, 0, 0L, 0, 16777214);
                                    gvd gvdVar2 = (gvd) this.c;
                                    gud gudVar = gvdVar2.g;
                                    gudVar.getClass();
                                    final WorkDatabase workDatabase = gvdVar2.e;
                                    workDatabase.getClass();
                                    gsb gsbVar = gvdVar2.d;
                                    gsbVar.getClass();
                                    final List list2 = gvdVar2.f;
                                    list2.getClass();
                                    Object obj5 = this.b;
                                    final String str = g.c;
                                    final gys b2 = workDatabase.A().b(str);
                                    if (b2 != null) {
                                        if (!b2.d.a()) {
                                            if (!(b2.f() ^ g.f())) {
                                                final boolean c = gudVar.c(str);
                                                if (!c) {
                                                    Iterator it2 = list2.iterator();
                                                    while (it2.hasNext()) {
                                                        ((guf) it2.next()).b(str);
                                                    }
                                                }
                                                final ?? r6 = ((kkc) obj5).c;
                                                workDatabase.n(new Runnable() { // from class: gvi
                                                    /* JADX WARN: Finally extract failed */
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        gys gysVar = g;
                                                        gys gysVar2 = b2;
                                                        int i = gysVar2.v;
                                                        WorkDatabase workDatabase2 = WorkDatabase.this;
                                                        gyt A2 = workDatabase2.A();
                                                        gzo B = workDatabase2.B();
                                                        gys g2 = gys.g(gysVar, null, gysVar2.d, null, null, gysVar2.m, gysVar2.p, gysVar2.u, i + 1, gysVar2.w, gysVar2.x, 12835837);
                                                        if (gysVar.x == 1) {
                                                            g2.w = gysVar.w;
                                                            g2.x++;
                                                        }
                                                        gys s = gvf.s(list2, g2);
                                                        gzn gznVar = (gzn) A2;
                                                        gznVar.a.k();
                                                        gznVar.a.l();
                                                        try {
                                                            gho ghoVar = ((gzn) A2).c;
                                                            gkp d = ghoVar.d();
                                                            try {
                                                                d.g(1, s.c);
                                                                d.e(2, gvf.z(s.d));
                                                                d.g(3, s.e);
                                                                d.g(4, s.f);
                                                                d.c(5, gvf.av(s.g));
                                                                d.c(6, gvf.av(s.h));
                                                                d.e(7, s.i);
                                                                d.e(8, s.j);
                                                                d.e(9, s.k);
                                                                d.e(10, s.m);
                                                                d.e(11, gvf.x(s.n));
                                                                d.e(12, s.o);
                                                                d.e(13, s.p);
                                                                d.e(14, s.q);
                                                                d.e(15, s.r);
                                                                d.e(16, s.s ? 1L : 0L);
                                                                d.e(17, gvf.y(s.t));
                                                                d.e(18, s.u);
                                                                d.e(19, s.v);
                                                                d.e(20, s.w);
                                                                d.e(21, s.x);
                                                                d.e(22, s.y);
                                                                String str2 = s.z;
                                                                if (str2 == null) {
                                                                    d.f(23);
                                                                } else {
                                                                    d.g(23, str2);
                                                                }
                                                                gsf gsfVar = s.l;
                                                                d.e(24, gvf.H(gsfVar.j));
                                                                d.c(25, gvf.F(gsfVar.b));
                                                                d.e(26, gsfVar.c ? 1L : 0L);
                                                                d.e(27, gsfVar.d ? 1L : 0L);
                                                                d.e(28, gsfVar.e ? 1L : 0L);
                                                                d.e(29, gsfVar.f ? 1L : 0L);
                                                                d.e(30, gsfVar.g);
                                                                d.e(31, gsfVar.h);
                                                                d.c(32, gvf.G(gsfVar.i));
                                                                d.g(33, s.c);
                                                                d.a();
                                                                ghoVar.f(d);
                                                                ((gzn) A2).a.o();
                                                                String str3 = str;
                                                                gznVar.a.m();
                                                                gzr gzrVar = (gzr) B;
                                                                gzrVar.a.k();
                                                                gkp d2 = gzrVar.c.d();
                                                                d2.g(1, str3);
                                                                try {
                                                                    ((gzr) B).a.l();
                                                                    try {
                                                                        d2.a();
                                                                        ((gzr) B).a.o();
                                                                        boolean z = c;
                                                                        Set set = r6;
                                                                        gzrVar.c.f(d2);
                                                                        B.b(str3, set);
                                                                        if (!z) {
                                                                            A2.l(str3, -1L);
                                                                            workDatabase2.z().a(str3);
                                                                        }
                                                                    } finally {
                                                                        ((gzr) B).a.m();
                                                                    }
                                                                } catch (Throwable th) {
                                                                    gzrVar.c.f(d2);
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th2) {
                                                                ghoVar.f(d);
                                                                throw th2;
                                                            }
                                                        } catch (Throwable th3) {
                                                            gznVar.a.m();
                                                            throw th3;
                                                        }
                                                    }
                                                });
                                                if (!c) {
                                                    guh.a(gsbVar, workDatabase, list2);
                                                }
                                            } else {
                                                gvj gvjVar = gvj.a;
                                                throw new UnsupportedOperationException("Can't update " + ((String) gvjVar.a(b2)) + " Worker to " + ((String) gvjVar.a(g)) + " Worker. Update operation must preserve worker's type.");
                                            }
                                        }
                                    } else {
                                        throw new IllegalArgumentException(a.bW(str, "Worker with ", " doesn't exist"));
                                    }
                                }
                            } else {
                                throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                            }
                        } else {
                            throw new IllegalStateException("WorkSpec with " + gyqVar.a + ", that matches a name \"" + ((String) this.a) + "\", wasn't found");
                        }
                    }
                    return arnb.a;
                }
                throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
            case 4:
                ((iee) this.b).b.a();
                ief iefVar = (ief) this.c;
                if (iefVar.h) {
                    ((ien) this.a).b(iefVar);
                }
                return arnb.a;
            case 5:
                ((iee) this.b).b.a();
                ief iefVar2 = (ief) this.c;
                if (iefVar2.h) {
                    ((ien) this.a).b(iefVar2);
                }
                return arnb.a;
            case 6:
                ift iftVar = (ift) this.c;
                String str2 = iftVar.a;
                str2.getClass();
                iftVar.d.a(str2, new ifi((bhv) this.b, (String) this.a, null));
                return arnb.a;
            case 7:
                iha ihaVar = (iha) this.c;
                ResolvedRecipient resolvedRecipient2 = ihaVar.a;
                resolvedRecipient2.getClass();
                xxk bq = yyb.bq((xxn) this.a, amfe.CONVERSATION_FROM_UNBLOCK_ACTION, ihaVar.f);
                igl iglVar = (igl) this.b;
                qjh.l(iglVar.a, iglVar.b, new gvr(iglVar, bq, resolvedRecipient2, (arpe) null, 4), 2);
                return arnb.a;
            case 8:
                ?? r9 = this.a;
                Object obj6 = this.c;
                igl iglVar2 = (igl) this.b;
                qjh.l(iglVar2.a, null, new ign(iglVar2, (iha) obj6, (lrc) r9, (arpe) null, 1), 3);
                return arnb.a;
            case 9:
                igl iglVar3 = (igl) this.b;
                iglVar3.d = aesh.a(iglVar3.d, null, null, null, !r3.d, null, 247);
                ResolvedRecipient resolvedRecipient3 = ((iha) this.c).a;
                igl iglVar4 = (igl) this.b;
                aeqa aeqaVar = iglVar4.e;
                resolvedRecipient3.getClass();
                iglVar4.e = aeqa.b(aeqaVar, null, iglVar4.b(resolvedRecipient3.E().A()), null, null, null, null, 125);
                this.a.b(((igl) this.b).e);
                return arnb.a;
            case 10:
                xxk bq2 = yyb.bq((xxn) this.a, amfe.CONVERSATION_FROM_UNSPAM_ACTION, ((iha) this.c).f);
                igm igmVar = (igm) this.b;
                qjh.l(igmVar.a, igmVar.b, new gbv(igmVar, bq2, (arpe) null, 12), 2);
                return arnb.a;
            case 11:
                iha ihaVar2 = (iha) this.c;
                ResolvedRecipient resolvedRecipient4 = ihaVar2.a;
                resolvedRecipient4.getClass();
                xxk bq3 = yyb.bq((xxn) this.a, amfe.CONVERSATION_FROM_UNBLOCK_ACTION, ihaVar2.f);
                igo igoVar = (igo) this.b;
                qjh.l(igoVar.a, igoVar.b, new gvr(igoVar, bq3, resolvedRecipient4, (arpe) null, 5), 2);
                return arnb.a;
            case 12:
                ?? r92 = this.a;
                Object obj7 = this.c;
                igo igoVar2 = (igo) this.b;
                qjh.l(igoVar2.a, null, new ign(igoVar2, (iha) obj7, (lrc) r92, (arpe) null, 0), 3);
                return arnb.a;
            case 13:
                igo igoVar3 = (igo) this.b;
                igoVar3.d = aesh.a(igoVar3.d, null, null, null, !r3.d, null, 247);
                iha ihaVar3 = (iha) this.c;
                ResolvedRecipient resolvedRecipient5 = ihaVar3.a;
                aeqa aeqaVar2 = igoVar3.e;
                resolvedRecipient5.getClass();
                List c2 = igoVar3.c(resolvedRecipient5.t());
                ?? r3 = this.a;
                igoVar3.e = aeqa.b(aeqaVar2, null, c2, null, igoVar3.b(r3, ihaVar3), null, null, 109);
                r3.b(igoVar3.e);
                return arnb.a;
            case 14:
                Intent intent = new Intent((Context) this.b, (Class<?>) ((Optional) this.c).get());
                obj = this.a.get();
                intent.putExtra("message_type", ((Number) ((ioa) obj).a.a(true)).intValue());
                return intent;
            case 15:
                Object ag = aqjn.ag(this.a);
                ag.getClass();
                ((jcz) this.b).c.b(new loh((ResolvedRecipient) ag, (jxo) this.c));
                return arnb.a;
            case 16:
                ?? r93 = this.a;
                ?? r8 = this.c;
                jdw jdwVar = (jdw) this.b;
                qjh.l(jdwVar.e, null, new gvr(jdwVar, (List) r8, (arqg) r93, (arpe) null, 7), 3);
                return arnb.a;
            case 17:
                Object obj8 = this.a;
                ?? r82 = this.c;
                jeg jegVar = (jeg) this.b;
                qjh.l(jegVar.b, null, new gvr(jegVar, (miu) r82, (alog) obj8, (arpe) null, 8), 3);
                return arnb.a;
            case 18:
                ((mho) ((jep) this.b).b.b()).aN(2, amho.BIZINFO_SOURCE_CONVERSATION_OVERFLOW_MENU, (String) this.a);
                ((lkd) this.c).b(new lmr((RbmConversationId) ((jep) this.b).a, (String) this.a));
                return arnb.a;
            case 19:
                jes jesVar = (jes) this.b;
                boolean a = ((pix) jesVar.b.b()).a();
                ?? r32 = this.c;
                if (a) {
                    conversationId = r32.c();
                } else {
                    ConversationId c3 = r32.c();
                    c3.getClass();
                    conversationId = (BugleConversationId) c3;
                }
                lkd lkdVar = jesVar.d;
                String h = r32.h();
                h.getClass();
                tqc g2 = r32.g();
                conversationId.getClass();
                if (r32.b() != mit.GROUP) {
                    resolvedRecipient = (ResolvedRecipient) aqjn.X(this.a);
                }
                lkdVar.b(new lnd(conversationId, h, resolvedRecipient, g2));
                return arnb.a;
            default:
                ?? r94 = this.c;
                Object obj9 = this.a;
                jat jatVar = (jat) this.b;
                qjh.l(jatVar.b, null, new gvr(jatVar, (alog) obj9, (ConversationId) r94, (arpe) null, 9), 3);
                return arnb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(ift iftVar, bhv bhvVar, String str, int i) {
        super(0);
        this.d = i;
        this.c = iftVar;
        this.b = bhvVar;
        this.a = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        super(0);
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }
}
