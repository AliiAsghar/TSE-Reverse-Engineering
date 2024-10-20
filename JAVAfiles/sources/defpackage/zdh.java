package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.startchat.chip.ChipData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zdh extends arrp implements arqg {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdh(Object obj, Object obj2, int i) {
        super(0);
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [java.lang.Object, arml] */
    /* JADX WARN: Type inference failed for: r0v110, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v136, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v141, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v144, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v146, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r0v40, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, zdy] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        Object obj;
        ?? r1;
        Object c;
        eov P;
        enb enbVar = null;
        switch (this.c) {
            case 0:
                ahqq ahqqVar = ((zdq) this.a).d;
                if (ahqqVar != null) {
                    ((ahqr) ((zdi) this.b).c.b()).f(ahqqVar, yci.d, null, ahqp.SUCCESS);
                }
                if (!((osb) ((zdi) this.b).f.b()).a()) {
                    ((zdi) this.b).d.f(false);
                }
                return arnb.a;
            case 1:
                ((zcc) this.a).l.b((ChipData) this.b);
                return arnb.a;
            case 2:
                alvw g = zcr.a.g();
                g.X(alwp.a, "BugleContacts");
                ((alvg) g.h("com/google/android/apps/messaging/startchat/starter/ChatStarterImpl", "openChat", 86, "ChatStarterImpl.kt")).q("Opening the conversation");
                zcr zcrVar = (zcr) ((ahmv) this.a).h;
                ((ahqr) zcrVar.d.b()).e(mgv.t);
                if (((osb) zcrVar.g.b()).a()) {
                    ((ahqr) zcrVar.d.b()).e(yci.o);
                }
                zcrVar.e(this.b);
                zbk zbkVar = (zbk) ((ahmv) this.a).i;
                ijp.e((ijp) zbkVar.b, 17, 0, zbkVar.a, 10);
                zbkVar.g(true);
                return arnb.a;
            case 3:
                if (!((pnw) ((ahmv) this.b).d.b()).a() || !((abul) ((ahmv) this.b).b.b()).e(100L)) {
                    this.a.a();
                }
                return arnb.a;
            case 4:
                if (((obe) ((zdt) this.b).i.b()).a()) {
                    return ((msk) ((zdt) this.b).d.b()).p((String) this.a);
                }
                return ((msk) ((zdt) this.b).d.b()).n((String) this.a);
            case 5:
                if (((String) ((ahmv) this.b).e.a().a()).length() == 0 && !((zem) this.a).e.isEmpty()) {
                    ((zen) ((ahmv) this.b).f).b((ChipData) aqjn.ac(((zem) this.a).e));
                }
                return arnb.a;
            case 6:
                ((zen) ((ahmv) this.a).f).b((ChipData) this.b);
                return arnb.a;
            case 7:
                break;
            case 8:
                ((zeh) this.a).c.e();
                if (((lkd) this.b).g(llg.a)) {
                    ((zeh) this.a).c.a();
                }
                return arnb.a;
            case 9:
                akto.o((Context) this.b, ((zie) this.a).c, null);
                return arnb.a;
            case 10:
                akto.o((Context) this.b, (Intent) this.a, null);
                return arnb.a;
            case 11:
                eoz d = dyt.d(this.a);
                if (d instanceof enb) {
                    enbVar = (enb) d;
                }
                if (enbVar != null && (P = enbVar.P()) != null) {
                    return P;
                }
                return ((cg) this.b).P();
            case 12:
                ztz ztzVar = (ztz) this.a;
                ztzVar.e(this.b, ztzVar.c);
                return arnb.a;
            case 13:
                ?? r0 = this.b;
                ztz ztzVar2 = (ztz) this.a;
                qjh.l(ztzVar2.b, null, new zez(ztzVar2, (ResolvedRecipient) r0, (arpe) null, 4), 3);
                if (!((Boolean) zub.b.e()).booleanValue()) {
                    ((mho) ztzVar2.e.b()).aB(4);
                }
                ztzVar2.i.a("add_contact", iel.b);
                return arnb.a;
            case 14:
                ztz ztzVar3 = (ztz) this.a;
                ztzVar3.e(this.b, ztzVar3.c);
                return arnb.a;
            case 15:
                ResolvedRecipient resolvedRecipient = ((zuy) this.a).b;
                zuv zuvVar = (zuv) this.b;
                qjh.l(zuvVar.d, null, new yhj(resolvedRecipient, zuvVar, (arpe) null, 11), 3);
                return arnb.a;
            case 16:
                ResolvedRecipient resolvedRecipient2 = ((zuy) this.a).b;
                zuv zuvVar2 = (zuv) this.b;
                qjh.l(zuvVar2.d, null, new whw(resolvedRecipient2, zuvVar2, (arpe) null, 9), 3);
                return arnb.a;
            case 17:
                ?? r02 = ((atkn) this.a).b;
                zvb zvbVar = (zvb) this.b;
                qjh.l(zvbVar.d, null, new yhj((ResolvedRecipient) r02, zvbVar, (arpe) null, 13), 3);
                return arnb.a;
            case 18:
                ?? r03 = ((atkn) this.a).b;
                zvb zvbVar2 = (zvb) this.b;
                qjh.l(zvbVar2.d, null, new whw((ResolvedRecipient) r03, zvbVar2, (arpe) null, 10), 3);
                return arnb.a;
            case 19:
                ((zvt) this.a).c(this.b, 3);
                return arnb.a;
            default:
                ((zvt) this.a).c(this.b, 4);
                return arnb.a;
        }
        do {
            obj = this.b;
            r1 = this.a;
            c = r1.c();
        } while (!r1.g(c, obj));
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdh(Object obj, Object obj2, int i, byte[] bArr) {
        super(0);
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
