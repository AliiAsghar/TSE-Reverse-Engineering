package defpackage;

import android.content.ClipData;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzg extends arrp implements arqg {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(aeom aeomVar, aeoj aeojVar, arqg arqgVar, int i) {
        super(0);
        this.d = i;
        this.b = aeomVar;
        this.a = aeojVar;
        this.c = arqgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [cpm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r0v39, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [dcf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [cpm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [dcf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        akul akulVar;
        int i = 8;
        int i2 = 0;
        switch (this.d) {
            case 0:
                this.a.a(0);
                ?? r0 = this.c;
                ClipData newPlainText = ClipData.newPlainText(r0, r0);
                newPlainText.getClass();
                this.b.b(new dce(newPlainText));
                return arnb.a;
            case 1:
                Object obj = this.c;
                akrc b = ((aksr) ((aaya) obj).k).b("GroupMembersUiAdapterImpl: Remove user from group");
                ?? r4 = this.b;
                Object obj2 = this.a;
                try {
                    ((izc) ((aaya) obj).b.b()).b();
                    ifs ifsVar = (ifs) ((aaya) obj).e.b();
                    ConversationIdType conversationIdType = ((BugleConversationId) obj2).a;
                    ndq z = r4.z();
                    vti vtiVar = (vti) ifsVar.a.b();
                    qgr a = vtiVar.a();
                    vti.n(vtiVar, 18, 0, null, a, null, null, 50);
                    aozy createBuilder = vwz.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    vwz vwzVar = (vwz) createBuilder.b;
                    vwzVar.f = a;
                    vwzVar.b |= 2;
                    String a2 = conversationIdType.a();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    a2.getClass();
                    ((vwz) apagVar).c = a2;
                    String str = z.a;
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    vwz vwzVar2 = (vwz) createBuilder.b;
                    str.getClass();
                    vwzVar2.e = str;
                    if (((okf) ifsVar.c.b()).a()) {
                        akulVar = ((vpk) ifsVar.b.b()).c(conversationIdType).h(new itk(createBuilder, 4), ifsVar.d);
                    } else {
                        akulVar = aktp.ag((vwz) createBuilder.s());
                    }
                    akulVar.i(new ikd(ifsVar, conversationIdType, i), ifsVar.d).i(new jab(i2), ifsVar.d).h(new its(9), ifsVar.d);
                    armd.i(b, null);
                    return arnb.a;
                } finally {
                }
            case 2:
                String str2 = ((zzf) this.c).c;
                if (str2 != null) {
                    ?? r2 = this.a;
                    ?? r3 = this.b;
                    r2.a(0);
                    ClipData newPlainText2 = ClipData.newPlainText(str2, str2);
                    newPlainText2.getClass();
                    r3.b(new dce(newPlainText2));
                }
                return arnb.a;
            case 3:
                ?? r02 = this.a;
                r02.getClass();
                if (((nek) this.b).c == vox.PROFILE_CONTACT_SOURCE) {
                    yyz yyzVar = (yyz) this.c;
                    ((lkd) yyzVar.f).b(new loh(r02));
                    ((zoh) yyzVar.e).a();
                }
                return arnb.a;
            case 4:
                arrn.J(this.c, null, null, new aely((bpq) this.a, (arpe) null, 1, (byte[]) null), 3).s(new aeju(this.b, 7));
                return arnb.a;
            case 5:
                arrn.J(this.c, null, null, new aely((bpq) this.a, (arpe) null, 0), 3).s(new aeju(this.b, 8));
                return arnb.a;
            case 6:
                ((aeom) this.b).c.a(this.a);
                this.c.a();
                return arnb.a;
            default:
                this.c.h(Boolean.valueOf(true));
                adom.W(this.a, true);
                this.b.h(Boolean.valueOf(true));
                return arnb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(cpm cpmVar, dcf dcfVar, String str, int i) {
        super(0);
        this.d = i;
        this.a = cpmVar;
        this.b = dcfVar;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }
}
