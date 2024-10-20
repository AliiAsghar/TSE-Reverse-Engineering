package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zwm implements ieb {
    public final Context a;
    public final arpi b;
    public final arwe c;
    public final ConversationId d;
    public final zap e;
    public final jxv f;
    private final xze g;

    public zwm(Context context, arpi arpiVar, arwe arweVar, ConversationId conversationId, zap zapVar, jxv jxvVar) {
        context.getClass();
        arpiVar.getClass();
        arweVar.getClass();
        conversationId.getClass();
        jxvVar.getClass();
        this.a = context;
        this.b = arpiVar;
        this.c = arweVar;
        this.d = conversationId;
        this.e = zapVar;
        this.f = jxvVar;
        this.g = xze.g("Bugle", "UnblockUnspamBanner2");
    }

    @Override // defpackage.ieb
    public final ascv a() {
        zap zapVar = this.e;
        return akec.a(armd.n(new jdn(zapVar.d, zapVar.b, new zzd(zapVar, (arpe) null, 1), 17, null), this.b), this.c, new ifp(this, 18, (float[][][]) null));
    }

    @Override // defpackage.ieb
    public final boolean b() {
        return true;
    }

    public final ief c(boolean z, ResolvedRecipient resolvedRecipient) {
        String string;
        String string2;
        if (z) {
            Context context = this.a;
            string = context.getString(R.string.unspam_banner_title_v2);
            string2 = context.getString(R.string.unspam_banner_body_v3);
        } else {
            Context context2 = this.a;
            string = context2.getString(R.string.unspam_detected_title_v2);
            string2 = context2.getString(R.string.unspam_detected_body_v2);
        }
        String str = string2;
        ieh iehVar = new ieh();
        String string3 = this.a.getString(R.string.unspam_banner_end_button);
        string3.getClass();
        return new ief("unblock_unspam_banner", string, str, iehVar, new iee(string3, new zwj(this, resolvedRecipient, 1)), null, null, null, 1568);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r0v2, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r18, defpackage.arpe r19) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zwm.d(com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, arpe):java.lang.Object");
    }
}
