package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yma implements yly {
    public final arwe a;
    public final Context b;
    private final armf f;
    private static final alpt d = alpt.r("com.google.android.apps.messaging.ui.conversationlist.SHARE_TARGET_CATEGORY", "com.google.android.apps.messaging.ui.conversationlist.VIDEO_SHARE_TARGET_CATEGORY");
    private static final xze e = xze.g("Bugle", "ShortcutManagerWrapperImpl");
    public static final asgm c = new asgm();

    public yma(arwe arweVar, Context context, armf armfVar, armf armfVar2) {
        arweVar.getClass();
        context.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.a = arweVar;
        this.b = context;
        this.f = armfVar2;
        int i = eae.a;
        ead$$ExternalSyntheticApiModelOutline0.m343m(context.getSystemService(ead$$ExternalSyntheticApiModelOutline0.m())).getMaxShortcutCountPerActivity();
    }

    @Override // defpackage.yly
    public final String a(ConversationIdType conversationIdType) {
        conversationIdType.getClass();
        String a = conversationIdType.a();
        a.getClass();
        return a;
    }

    @Override // defpackage.yly
    public final boolean b(String str) {
        int i;
        try {
            if (true != yhx.d) {
                i = 7;
            } else {
                i = 15;
            }
            return Collection.EL.stream(eae.b(this.b, i)).map(new yec(xih.g, 11)).anyMatch(new xdm(new ynn(str, 1), 16));
        } catch (RuntimeException e2) {
            e.r("Failed to get shortcuts: ", e2);
            return false;
        }
    }

    @Override // defpackage.yly
    public final ead c(Context context, ConversationId conversationId, String str, IconCompat iconCompat, String str2, int i, boolean z) {
        context.getClass();
        conversationId.getClass();
        str.getClass();
        str2.getClass();
        Integer valueOf = Integer.valueOf(i);
        Intent w = ((qoq) this.f.b()).w(context, conversationId, null, false, z);
        w.getClass();
        w.setFlags(0);
        w.setAction("android.intent.action.MAIN");
        w.putExtra("via_shortcut", true);
        dzx dzxVar = new dzx(context);
        dzxVar.d(w);
        PersistableBundle persistableBundle = new PersistableBundle(1);
        if (TextUtils.isEmpty(str)) {
            str = context.getString(R.string.unknown_shortcut_label);
        }
        ead eadVar = new ead();
        eadVar.a = context;
        eadVar.b = str2;
        eadVar.e = str;
        eadVar.c = dzxVar.b();
        eadVar.g = context.getText(R.string.shortcut_disabled_text);
        eadVar.m = 2147483646;
        eadVar.n = persistableBundle;
        valueOf.getClass();
        if (i != 2147483646) {
            valueOf.getClass();
            eadVar.m = i;
            alpt alptVar = d;
            to toVar = new to();
            toVar.addAll(alptVar);
            eadVar.j = toVar;
        }
        if (iconCompat != null) {
            eadVar.h = iconCompat;
        }
        if (yhx.d) {
            eadVar.l = true;
        }
        dym.d(eadVar, null, null);
        return eadVar;
    }
}
