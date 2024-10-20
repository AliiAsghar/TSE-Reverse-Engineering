package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdu extends arpw implements arqw {
    /* synthetic */ boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdu(izz izzVar, arpe arpeVar, int i) {
        super(3, arpeVar);
        this.d = i;
        this.c = izzVar;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, khg] */
    @Override // defpackage.arqw
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        switch (this.d) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                jdu jduVar = new jdu((jdw) this.c, (arpe) obj3, 0);
                jduVar.a = booleanValue;
                jduVar.b = (khd) obj2;
                return jduVar.b(arnb.a);
            case 1:
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                jdu jduVar2 = new jdu((jdp) this.c, (arpe) obj3, 1);
                jduVar2.b = (miu) obj;
                jduVar2.a = booleanValue2;
                return jduVar2.b(arnb.a);
            case 2:
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                jdu jduVar3 = new jdu((jed) this.c, (arpe) obj3, 2);
                jduVar3.b = (khd) obj;
                jduVar3.a = booleanValue3;
                return jduVar3.b(arnb.a);
            case 3:
                boolean booleanValue4 = ((Boolean) obj2).booleanValue();
                jdu jduVar4 = new jdu((jfd) this.c, (arpe) obj3, 3);
                jduVar4.b = (khd) obj;
                jduVar4.a = booleanValue4;
                return jduVar4.b(arnb.a);
            case 4:
                boolean booleanValue5 = ((Boolean) obj2).booleanValue();
                jdu jduVar5 = new jdu((jsy) this.c, (arpe) obj3, 4);
                jduVar5.b = (aeon) obj;
                jduVar5.a = booleanValue5;
                return jduVar5.b(arnb.a);
            case 5:
                boolean booleanValue6 = ((Boolean) obj).booleanValue();
                jdu jduVar6 = new jdu((jvo) this.c, (arpe) obj3, 5);
                jduVar6.a = booleanValue6;
                jduVar6.b = (Integer) obj2;
                return jduVar6.b(arnb.a);
            case 6:
                boolean booleanValue7 = ((Boolean) obj).booleanValue();
                jdu jduVar7 = new jdu((jwy) this.c, (arpe) obj3, 6);
                jduVar7.a = booleanValue7;
                jduVar7.b = (jxb) obj2;
                return jduVar7.b(arnb.a);
            case 7:
                boolean booleanValue8 = ((Boolean) obj2).booleanValue();
                jdu jduVar8 = new jdu((khg) this.c, (arpe) obj3, 7);
                jduVar8.b = (alog) obj;
                jduVar8.a = booleanValue8;
                return jduVar8.b(arnb.a);
            default:
                boolean booleanValue9 = ((Boolean) obj).booleanValue();
                jdu jduVar9 = new jdu((izz) this.c, (arpe) obj3, 8);
                jduVar9.a = booleanValue9;
                jduVar9.b = (List) obj2;
                return jduVar9.b(arnb.a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [miu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object, khg] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        boolean z;
        List list;
        boolean z2 = false;
        Integer num = null;
        switch (this.d) {
            case 0:
                aqil.P(obj);
                armf armfVar = ((jdw) this.c).c;
                boolean z3 = this.a;
                Object obj2 = this.b;
                if (!z3) {
                    jdw jdwVar = (jdw) this.c;
                    if (!(jdwVar.b instanceof PenpalBotConversationId)) {
                        String string = jdwVar.a.getString(R.string.delete_message_action);
                        string.getClass();
                        return new aehz(string, aerb.aw, false, false, false, false, null, null, new jdr(this.c, obj2, 3), 1020);
                    }
                }
                return null;
            case 1:
                aqil.P(obj);
                ?? r1 = this.b;
                boolean z4 = this.a;
                ConversationId c = r1.c();
                if (r1.q()) {
                    return null;
                }
                Object obj3 = this.c;
                c.getClass();
                jdp jdpVar = (jdp) obj3;
                String string2 = jdpVar.a.getString(R.string.action_delete);
                string2.getClass();
                return new aehz(string2, null, false, true, true, false, null, null, new kbx(jdpVar, z4, c, 1), 998);
            case 2:
                aqil.P(obj);
                Object obj4 = this.b;
                List list2 = ((khd) obj4).a;
                boolean z5 = this.a;
                if (list2.size() != 1 || z5) {
                    return null;
                }
                String string3 = ((jed) this.c).a.getString(R.string.message_context_menu_view_details);
                string3.getClass();
                return new aehz(string3, null, false, true, true, false, null, null, new jdr(this.c, obj4, 5), 998);
            case 3:
                aqil.P(obj);
                Object obj5 = this.b;
                khd khdVar = (khd) obj5;
                List list3 = khdVar.a;
                boolean z6 = this.a;
                if (list3.size() == 1) {
                    mym e = ((miz) aqjn.ag(khdVar.a)).e();
                    if (((e instanceof myr) || (!(e instanceof myk) ? (e instanceof mxf) : hlc.R((myk) e))) && !z6) {
                        miz mizVar = (miz) aqjn.ag(khdVar.a);
                        mizVar.getClass();
                        String Q = hlc.Q(mizVar);
                        if (Q != null && !arsd.M(Q)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String P = hlc.P(mizVar);
                        if (P != null && !arsd.M(P)) {
                            z2 = true;
                        }
                        boolean z7 = mizVar.e() instanceof mxf;
                        boolean z8 = mizVar.e() instanceof myp;
                        if (z || z2 || z7 || z8) {
                            String string4 = ((jfd) this.c).a.getString(R.string.action_share);
                            string4.getClass();
                            return new aehz(string4, null, false, true, false, false, null, null, new jdr(this.c, obj5, 14), 1014);
                        }
                    }
                }
                return null;
            case 4:
                aqil.P(obj);
                Object obj6 = this.b;
                boolean z9 = this.a;
                if (obj6 == null) {
                    if (!z9) {
                        return null;
                    }
                    return ((jsy) this.c).b(null, false);
                }
                return obj6;
            case 5:
                aqil.P(obj);
                boolean z10 = this.a;
                Object obj7 = this.b;
                if (z10) {
                    Object e2 = nhr.c.e();
                    e2.getClass();
                    return albo.cd(((Number) e2).intValue());
                }
                if (((Boolean) nhr.a.e()).booleanValue()) {
                    Object e3 = nhr.b.e();
                    e3.getClass();
                    return albo.cd(((Number) e3).intValue());
                }
                if (obj7 == null) {
                    return null;
                }
                Duration cd = albo.cd((((Number) obj7).intValue() * 8) / ((jvo) this.c).b);
                if (cd.compareTo(albo.cb(1)) >= 0) {
                    Duration a = jvo.a(cd, albo.cb(1));
                    a.getClass();
                    return a;
                }
                Duration a2 = jvo.a(cd, albo.cd(10));
                a2.getClass();
                return a2;
            case 6:
                aqil.P(obj);
                boolean z11 = this.a;
                Object obj8 = this.b;
                alvg alvgVar = (alvg) jwy.a.g().h("com/google/android/apps/messaging/conversation2/customthemes/SelectedThemeTracker$tonalPaletteProviderFlow$1", "invokeSuspend", 102, "SelectedThemeTracker.kt");
                if (obj8 != null) {
                    num = new Integer(((jxb) obj8).a);
                }
                alvgVar.H("RichThemeEnabled: %b, selectedThemeId: %s", z11, num);
                if (z11 && obj8 != null) {
                    ((jwy) this.c).e.a(false);
                    return new gck(((jxb) obj8).b, 13);
                }
                ((jwy) this.c).e.a(true);
                return afac.a;
            case 7:
                aqil.P(obj);
                ?? r12 = this.b;
                if (this.a) {
                    list = arnv.a;
                } else {
                    ?? r2 = this.c;
                    ArrayList arrayList = new ArrayList();
                    for (mqz mqzVar : r12) {
                        mqzVar.getClass();
                        r2.a(mqzVar);
                    }
                    list = arrayList;
                }
                return new aeyr(list);
            default:
                aqil.P(obj);
                izz izzVar = (izz) this.c;
                return new lgh(this.a, this.b, ((ghw) izzVar.a).s(), (afaw) izzVar.d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdu(jdp jdpVar, arpe arpeVar, int i) {
        super(3, arpeVar);
        this.d = i;
        this.c = jdpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdu(jdw jdwVar, arpe arpeVar, int i) {
        super(3, arpeVar);
        this.d = i;
        this.c = jdwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdu(jed jedVar, arpe arpeVar, int i) {
        super(3, arpeVar);
        this.d = i;
        this.c = jedVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdu(jfd jfdVar, arpe arpeVar, int i) {
        super(3, arpeVar);
        this.d = i;
        this.c = jfdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdu(jsy jsyVar, arpe arpeVar, int i) {
        super(3, arpeVar);
        this.d = i;
        this.c = jsyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdu(jvo jvoVar, arpe arpeVar, int i) {
        super(3, arpeVar);
        this.d = i;
        this.c = jvoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdu(jwy jwyVar, arpe arpeVar, int i) {
        super(3, arpeVar);
        this.d = i;
        this.c = jwyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdu(khg khgVar, arpe arpeVar, int i) {
        super(3, arpeVar);
        this.d = i;
        this.c = khgVar;
    }
}
