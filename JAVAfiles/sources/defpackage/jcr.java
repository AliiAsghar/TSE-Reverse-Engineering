package defpackage;

import android.app.assist.AssistContent;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jcr implements ixo {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/Conversation2MainActivityAdapterFragmentPeer");
    private final jcp b;
    private final ajwt c;
    private final apwt d;
    private final apwt e;
    private final apwt f;

    public jcr(jcp jcpVar, ajwt ajwtVar, apwt apwtVar, apwt apwtVar2, apwt apwtVar3) {
        ajwtVar.getClass();
        apwtVar.getClass();
        apwtVar2.getClass();
        apwtVar3.getClass();
        this.b = jcpVar;
        this.c = ajwtVar;
        this.d = apwtVar;
        this.e = apwtVar2;
        this.f = apwtVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x022c, code lost:
    
        if (r5.equals(r14.e) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0252, code lost:
    
        if (r5.equals(r14.d) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x026e, code lost:
    
        if (r1.equals(r14.j) == true) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02d5  */
    @Override // defpackage.ixo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.cg a(defpackage.dk r30, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r31, com.google.android.apps.messaging.label.data.classification.SuperSortLabel r32, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r33) {
        /*
            Method dump skipped, instructions count: 819
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jcr.a(dk, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId, com.google.android.apps.messaging.label.data.classification.SuperSortLabel, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData):cg");
    }

    @Override // defpackage.ixo
    public final cg b() {
        return this.b.G().e("Conversation2Fragment");
    }

    @Override // defpackage.ixo
    public final da c() {
        da G = this.b.G();
        G.getClass();
        return G;
    }

    @Override // defpackage.ixo
    public final ijf d() {
        cg e = this.b.G().e("start_chat_fragment_tag");
        if (e == null) {
            return null;
        }
        return new jcq(e, 0);
    }

    @Override // defpackage.ixo
    public final ajwt e() {
        return this.c;
    }

    @Override // defpackage.ixo
    public final void f(AssistContent assistContent) {
        akkh akkhVar;
        Object obj;
        eoz b = b();
        jco jcoVar = null;
        if (b instanceof akkh) {
            akkhVar = (akkh) b;
        } else {
            akkhVar = null;
        }
        if (akkhVar != null) {
            obj = akkhVar.E();
        } else {
            obj = null;
        }
        if (obj instanceof jco) {
            jcoVar = (jco) obj;
        }
        if (jcoVar != null) {
            ((Optional) jcoVar.a().k.b()).ifPresent(new ixj(new kju(assistContent, 5), 13));
        }
    }

    @Override // defpackage.ixo
    public final boolean g() {
        return true;
    }

    @Override // defpackage.ixo
    public final void h(dk dkVar) {
        aiuc k = ipq.k();
        dkVar.v(R.id.fragment_container, k, ipq.l());
    }

    @Override // defpackage.ixo
    public final void i(dk dkVar, int i) {
        dkVar.v(R.id.fragment_container, yyb.c(this.c, i, (yyu) this.d.b()), "start_chat_fragment_tag");
    }
}
