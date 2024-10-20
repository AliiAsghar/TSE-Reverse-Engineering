package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ujx {
    public static final alpt a = alpt.v(Integer.valueOf(BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED), 229, 204, 221, 231, Integer.valueOf(BasePaymentResult.ERROR_REQUEST_FAILED), 225, 226, 218, 220, 230, 243, 244, 245);
    private final armf b;
    private final armf c;

    public ujx(armf armfVar, armf armfVar2) {
        this.b = armfVar;
        this.c = armfVar2;
    }

    public static String a(Context context) {
        return context.getResources().getString(R.string.this_chat_is_no_longer_encrypted_v2);
    }

    public static String b(Context context) {
        return context.getResources().getString(R.string.this_chat_is_encrypted_v2);
    }

    public static String c(Context context, boolean z) {
        if (z) {
            return context.getResources().getString(R.string.tombstone_show_link_previews);
        }
        return context.getResources().getString(R.string.tombstone_show_link_previews_disabled);
    }

    public static boolean e(int i) {
        if (i != 209 && i != 208) {
            return false;
        }
        return true;
    }

    public static boolean f(int i) {
        if (i != 211 && i != 217 && i != 239 && i != 249 && i != 248 && i != 247 && i != 246 && i != 250 && i != 240 && i != 245) {
            return false;
        }
        return true;
    }

    private static boolean g(List list, armf armfVar) {
        if (!((Boolean) ((utz) yig.Z.get()).e()).booleanValue() || !((Optional) ((apxx) armfVar).a).isPresent() || list.size() != 1 || !((rtv) list.get(0)).c()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:19:0x0056. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String d(java.util.List r17, int r18, boolean r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, android.content.Context r24) {
        /*
            Method dump skipped, instructions count: 1450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ujx.d(java.util.List, int, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.content.Context):java.lang.String");
    }
}
