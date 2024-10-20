package defpackage;

import android.app.assist.AssistContent;
import android.os.Bundle;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ixp implements ixo {
    private final ixn a;
    private final apwt b;
    private final ajwt c;
    private final armf d;

    public ixp(ajwt ajwtVar, ixn ixnVar, apwt apwtVar, armf armfVar) {
        this.c = ajwtVar;
        this.a = ixnVar;
        this.b = apwtVar;
        this.d = armfVar;
    }

    @Override // defpackage.ixo
    public final cg a(dk dkVar, ConversationId conversationId, SuperSortLabel superSortLabel, MessageCoreData messageCoreData) {
        int i;
        aozy createBuilder = iuy.a.createBuilder();
        String b = conversationId.b();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        iuy iuyVar = (iuy) createBuilder.b;
        b.getClass();
        iuyVar.b = b;
        aozb w = aozb.w(conversationId.c());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((iuy) createBuilder.b).d = w;
        if (superSortLabel == null) {
            i = SuperSortLabel.UNKNOWN.i;
        } else {
            i = superSortLabel.i;
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((iuy) createBuilder.b).c = i;
        iuy iuyVar2 = (iuy) createBuilder.s();
        ajwt ajwtVar = this.c;
        iuz iuzVar = new iuz();
        apxh.e(iuzVar);
        aklw.b(iuzVar, ajwtVar);
        aklt.a(iuzVar, iuyVar2);
        Bundle bundle = iuzVar.m;
        if (bundle != null) {
            bundle.putString("conversation_id", iuyVar2.b);
        }
        dkVar.r(R.id.conversation_fragment_container, iuzVar, "conversation");
        return iuzVar;
    }

    @Override // defpackage.ixo
    public final cg b() {
        cg e = this.a.G().e("conversation");
        if (e instanceof iuz) {
            return (iuz) e;
        }
        return null;
    }

    @Override // defpackage.ixo
    public final da c() {
        return this.a.G();
    }

    @Override // defpackage.ixo
    public final ijf d() {
        cg e = this.a.G().e("contactpicker");
        if (e != null) {
            return new jcq(e, 1);
        }
        return null;
    }

    @Override // defpackage.ixo
    public final ajwt e() {
        return this.c;
    }

    @Override // defpackage.ixo
    public final boolean g() {
        return false;
    }

    @Override // defpackage.ixo
    public final void h(dk dkVar) {
        aiuc k = ipq.k();
        dkVar.r(R.id.conversation_placeholder_container, k, ipq.l());
    }

    @Override // defpackage.ixo
    public final void i(dk dkVar, int i) {
        dkVar.r(R.id.contact_picker_fragment_container, yyb.c(this.c, i, (yyu) this.d.b()), "contactpicker");
    }

    @Override // defpackage.ixo
    public final /* synthetic */ void f(AssistContent assistContent) {
    }
}
