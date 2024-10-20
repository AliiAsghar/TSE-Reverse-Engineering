package defpackage;

import android.content.Context;
import android.content.Intent;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.ui.appsettings.SpamSettingsActivity;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zni extends arrp implements arqg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zni(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, arml] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, arml] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, arml] */
    /* JADX WARN: Type inference failed for: r0v67, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, arml] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r1v6, types: [armf, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        Class cls;
        enb enbVar = null;
        switch (this.b) {
            case 0:
                return ((zni) this.a).a;
            case 1:
                return this.a;
            case 2:
                return dyt.d(this.a).aL();
            case 3:
                eoz d = dyt.d(this.a);
                if (d instanceof enb) {
                    enbVar = (enb) d;
                }
                if (enbVar != null) {
                    return enbVar.Q();
                }
                return epb.a;
            case 4:
                ((ztz) this.a).c();
                return arnb.a;
            case 5:
                ((ztz) this.a).d();
                return arnb.a;
            case 6:
                ((ztz) this.a).c();
                return arnb.a;
            case 7:
                ((ztz) this.a).d();
                return arnb.a;
            case 8:
                ((ztz) this.a).c();
                return arnb.a;
            case 9:
                ascd a = ascy.a(null);
                Object obj = this.a;
                return akec.a(a, ((zuq) obj).b, new ifp(obj, 14, (char[][][]) null));
            case 10:
                zlc zlcVar = (zlc) ((zwc) this.a).b.b();
                qjh.l(zlcVar.c, null, new yhj(zlcVar, ((zwc) this.a).c, (arpe) null, 15), 3);
                return arnb.a;
            case 11:
                zwc zwcVar = (zwc) this.a;
                zlc zlcVar2 = (zlc) zwcVar.b.b();
                if (((Optional) ((apxx) zlcVar2.a).a).isPresent()) {
                    cls = ((znv) ((Optional) ((apxx) zlcVar2.a).a).get()).a();
                } else {
                    cls = SpamSettingsActivity.class;
                }
                Context context = zwcVar.a;
                Intent addFlags = new Intent(context, (Class<?>) cls).addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                addFlags.getClass();
                akto.n(context, addFlags);
                return arnb.a;
            case 12:
                zwm zwmVar = (zwm) this.a;
                ConversationId conversationId = zwmVar.d;
                zap zapVar = zwmVar.e;
                qjh.l(zapVar.c, null, new yhj(zapVar, conversationId, (arpe) null, 16), 3);
                return arnb.a;
            case 13:
                return this.a;
            case 14:
                return ((zni) this.a).a;
            case 15:
                return dyt.d(this.a).aL();
            case 16:
                eoz d2 = dyt.d(this.a);
                if (d2 instanceof enb) {
                    enbVar = (enb) d2;
                }
                if (enbVar != null) {
                    return enbVar.Q();
                }
                return epb.a;
            case 17:
                ((aehz) this.a).j.a();
                return arnb.a;
            case 18:
                Object obj2 = this.a;
                if (obj2 != null) {
                    ((aehz) obj2).j.a();
                }
                return arnb.a;
            case 19:
                aair aairVar = (aair) this.a;
                if (((opy) aairVar.g.b()).a()) {
                    zoh zohVar = (zoh) aairVar.c.b();
                    zohVar.b.f(zzu.b);
                    zohVar.a.f(false);
                }
                return arnb.a;
            default:
                ((zze) this.a).b.a();
                return arnb.a;
        }
    }
}
