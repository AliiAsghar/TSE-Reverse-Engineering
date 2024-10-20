package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zvf implements zsq {
    public final zsl a;
    public final ConversationIdType b;
    public ResolvedRecipient c;
    private final Context d;
    private final enh e;
    private final armf f;
    private final armf g;
    private ztr h;
    private final zlc i;
    private final aair j;
    private final aohs k;

    public zvf(Context context, enh enhVar, aohs aohsVar, armf armfVar, armf armfVar2, zlc zlcVar, aair aairVar, zsl zslVar, ConversationIdType conversationIdType) {
        this.d = context;
        this.e = enhVar;
        this.k = aohsVar;
        this.f = armfVar;
        this.g = armfVar2;
        this.i = zlcVar;
        this.j = aairVar;
        this.a = zslVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.zsq
    public final zsm a() {
        utz utzVar = zvi.a;
        Object e = ((utz) zvi.c.get()).e();
        e.getClass();
        return new zsm("RoamingShortCodeBanner", ((Boolean) e).booleanValue());
    }

    @Override // defpackage.zsq
    public final void e() {
        ztr ztrVar = this.h;
        if (ztrVar != null) {
            ztrVar.o();
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.zsq
    public final void g() {
        ConversationIdType conversationIdType = this.b;
        if (!conversationIdType.b()) {
            enh enhVar = this.e;
            final aair aairVar = this.j;
            ncq d = ((ndi) aairVar.d).d(new BugleConversationId(conversationIdType));
            Objects.toString(conversationIdType);
            this.k.C(ansy.j(((uac) aairVar.e).e(d, "ROAMING_SHORT_CODE_BANNER_STATE_KEY:".concat(conversationIdType.toString()), enhVar), new akfk((ansy) aairVar.h, new izd(aairVar, conversationIdType, 13, null), a.cc(conversationIdType, "ROAMING_SHORT_CODE_BANNER_STATE_KEY:", "*"), 2), new akay() { // from class: zvj
                /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
                
                    if (r8 != false) goto L19;
                 */
                /* JADX WARN: Type inference failed for: r8v8, types: [armf, java.lang.Object] */
                @Override // defpackage.akay
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object a(java.lang.Object r7, java.lang.Object r8) {
                    /*
                        r6 = this;
                        alog r7 = (defpackage.alog) r7
                        rto r8 = (defpackage.rto) r8
                        r7.getClass()
                        zvk r0 = new zvk
                        r1 = 0
                        if (r8 == 0) goto L15
                        int r8 = r8.H()
                        java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                        goto L16
                    L15:
                        r8 = r1
                    L16:
                        r2 = 0
                        if (r8 == 0) goto L65
                        int r3 = r7.size()
                        r4 = 1
                        if (r3 != r4) goto L65
                        aair r3 = defpackage.aair.this
                        int r8 = r8.intValue()
                        java.lang.Object r5 = r3.b
                        yjy r5 = (defpackage.yjy) r5
                        ykb r8 = r5.h(r8)
                        boolean r8 = r8.F()
                        if (r8 == 0) goto L65
                        java.lang.Object r8 = r3.g
                        java.lang.Object r8 = r8.b()
                        r8.getClass()
                        java.lang.Boolean r8 = (java.lang.Boolean) r8
                        boolean r8 = r8.booleanValue()
                        if (r8 == 0) goto L54
                        java.lang.Object r8 = r7.get(r2)
                        com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r8 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r8
                        msh r8 = r8.f()
                        boolean r8 = r8.s()
                        goto L62
                    L54:
                        java.lang.Object r8 = r7.get(r2)
                        com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r8 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r8
                        msh r8 = r8.f()
                        boolean r8 = r8.C()
                    L62:
                        if (r8 == 0) goto L65
                        goto L66
                    L65:
                        r4 = r2
                    L66:
                        boolean r8 = r7.isEmpty()
                        if (r8 != 0) goto L73
                        java.lang.Object r7 = r7.get(r2)
                        r1 = r7
                        com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r1 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r1
                    L73:
                        r0.<init>(r4, r1)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.zvj.a(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, aairVar.c), new akgh<zvk>() { // from class: zvf.1
                @Override // defpackage.akgh
                public final void a(Throwable th) {
                    zvf zvfVar = zvf.this;
                    zvfVar.a.a(zvfVar, false);
                    ConversationIdType conversationIdType2 = zvf.this.b;
                    Objects.toString(conversationIdType2);
                    throw new IllegalStateException("Error getting roaming short code loaded data for conversationId ".concat(conversationIdType2.toString()), th);
                }

                @Override // defpackage.akgh
                public final /* bridge */ /* synthetic */ void c(Object obj) {
                    zvk zvkVar = (zvk) obj;
                    zvkVar.getClass();
                    zvf zvfVar = zvf.this;
                    zvfVar.c = zvkVar.b;
                    boolean z = false;
                    if (zvkVar.a && zvfVar.c != null) {
                        z = true;
                    }
                    zvfVar.a.a(zvfVar, z);
                }

                @Override // defpackage.akgh
                public final /* synthetic */ void b() {
                }
            });
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // defpackage.zsq
    public final aabr h() {
        ztr a = this.i.a(this.d);
        this.h = a;
        a.p();
        a.h(R.drawable.quantum_ic_info_outline_black_24, this.d.getColor(R.color.conversation_action_icon_color_m2));
        utz utzVar = zvi.a;
        a.d(aabr.ac(this.d, this.f, this.g, R.string.conversation_roaming_short_code_paragraph, zvi.a, zvi.b));
        a.i(new ztv(this, 6));
        a.y = new ztw(this, 4);
        return this.h;
    }

    @Override // defpackage.zsq
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.zsq
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.zsq
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.zsq
    public final void f() {
    }
}
