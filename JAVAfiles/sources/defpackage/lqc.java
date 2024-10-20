package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lqc implements kzy {
    private final Context a;
    private TextView b;
    private xvy c;
    private final vco d;
    private final vyv e;

    public lqc(Context context, vyv vyvVar, vco vcoVar, yyb yybVar) {
        context.getClass();
        yybVar.getClass();
        this.a = context;
        this.e = vyvVar;
        this.d = vcoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void f(defpackage.kzw r12, defpackage.kzd r13) {
        /*
            r11 = this;
            boolean r0 = defpackage.yig.e()
            r1 = 0
            if (r0 == 0) goto L89
            long r2 = r13.L
            int r0 = r13.M
            aqcw r13 = r13.S
            r4 = 1
            if (r13 == 0) goto L48
            vyv r13 = r11.e
            java.lang.Object r13 = r13.a
            xnv r13 = (defpackage.xnv) r13
            j$.time.Instant r13 = r13.f()
            long r5 = r13.toEpochMilli()
            utz r13 = defpackage.yig.J
            java.lang.Object r13 = r13.e()
            r13.getClass()
            java.lang.Number r13 = (java.lang.Number) r13
            long r7 = r13.longValue()
            long r7 = r7 + r2
            utz r13 = defpackage.yig.K
            java.lang.Object r13 = r13.e()
            r13.getClass()
            java.lang.Number r13 = (java.lang.Number) r13
            long r9 = r13.longValue()
            long r9 = r9 + r7
            int r13 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r13 > 0) goto L48
            int r13 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r13 > 0) goto L48
            r13 = r4
            goto L49
        L48:
            r13 = r1
        L49:
            r12.c(r13)
            if (r13 == 0) goto L88
            boolean r13 = defpackage.d.y(r0)
            vco r0 = r11.d
            java.lang.Object r5 = r0.a
            xnv r5 = (defpackage.xnv) r5
            j$.time.Instant r5 = r5.f()
            long r5 = r5.toEpochMilli()
            j$.time.ZoneId r7 = j$.time.ZoneId.systemDefault()
            long r2 = defpackage.yyb.aV(r5, r2, r7)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r5 = "days_ago"
            r3[r1] = r5
            r3[r4] = r2
            if (r4 == r13) goto L7b
            r13 = 2132020073(0x7f140b69, float:1.9678499E38)
            goto L7e
        L7b:
            r13 = 2132020072(0x7f140b68, float:1.9678497E38)
        L7e:
            java.lang.Object r0 = r0.b
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r13 = defpackage.gvf.P(r0, r13, r3)
            r12.w = r13
        L88:
            return
        L89:
            r12.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lqc.f(kzw, kzd):void");
    }

    @Override // defpackage.kzy
    public final kzx a(kzx kzxVar) {
        kzw kzwVar = new kzw(kzxVar);
        kzd kzdVar = kzxVar.a;
        kzdVar.getClass();
        f(kzwVar, kzdVar);
        return kzwVar.a();
    }

    @Override // defpackage.kzy
    public final void b(kzx kzxVar, boolean z) {
        if (!kzxVar.w) {
            String str = kzxVar.J;
            if (str == null || str.length() == 0) {
                if (!ier.a() || !kzxVar.S) {
                    xvy xvyVar = null;
                    if (!kzxVar.C) {
                        xvy xvyVar2 = this.c;
                        if (xvyVar2 == null) {
                            arro.b("nudgeTextViewStubber");
                        } else {
                            xvyVar = xvyVar2;
                        }
                        xvyVar.g(8);
                        return;
                    }
                    xvy xvyVar3 = this.c;
                    if (xvyVar3 == null) {
                        arro.b("nudgeTextViewStubber");
                        xvyVar3 = null;
                    }
                    xvyVar3.g(0);
                    xvy xvyVar4 = this.c;
                    if (xvyVar4 == null) {
                        arro.b("nudgeTextViewStubber");
                    } else {
                        xvyVar = xvyVar4;
                    }
                    TextView textView = (TextView) xvyVar.b();
                    this.b = textView;
                    if (textView != null) {
                        String str2 = kzxVar.D;
                        if (str2 != null) {
                            textView.setText(str2);
                        } else {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    int f = ahnz.f(this.a, R.attr.colorPrimaryBrandNonIcon, "NudgeViewPart");
                    TextView textView2 = this.b;
                    if (textView2 != null) {
                        textView2.setTextColor(f);
                    }
                    kzd kzdVar = kzxVar.a;
                    MessageIdType messageIdType = kzdVar.o;
                    if (!messageIdType.b()) {
                        ConversationIdType conversationIdType = kzdVar.l;
                        if (!conversationIdType.b() && kzdVar.S != null) {
                            messageIdType.getClass();
                            conversationIdType.getClass();
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.kzy
    public final void c(View view) {
        this.c = new xvy(view, R.id.additional_text, R.id.additional_text, R.layout.additional_text_view);
    }

    @Override // defpackage.kzy
    public final boolean d(kzx kzxVar, kzx kzxVar2) {
        kzxVar.getClass();
        kzxVar2.getClass();
        if (kzxVar.C == kzxVar2.C && d.F(kzxVar.D, kzxVar2.D)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.kzy
    public final void e(kzw kzwVar, kzd kzdVar) {
        f(kzwVar, kzdVar);
    }
}
