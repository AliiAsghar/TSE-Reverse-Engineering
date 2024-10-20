package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.telecom.PhoneAccount;
import com.android.vcard.VCardConfig;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yvu {
    public static final xze a = xze.g("Bugle", "VilteVideoCalling");
    public final Context b;
    public final armf c;
    private final anen d;

    public yvu(Context context, armf armfVar, anen anenVar) {
        this.b = context;
        this.c = armfVar;
        this.d = anenVar;
    }

    public final akul a(List list) {
        return aktp.ai(new xfb(this, list, 19, null), this.d);
    }

    public final boolean b() {
        PhoneAccount a2 = ((yvn) this.c.b()).a();
        if (a2 == null) {
            return false;
        }
        boolean hasCapabilities = a2.hasCapabilities(1024);
        boolean hasCapabilities2 = a2.hasCapabilities(8);
        xyo a3 = a.a();
        a3.H("Phone account has CAPABILITY_SUPPORTS_VIDEO_CALLING: ");
        a3.I(hasCapabilities);
        a3.H(" has CAPABILITY_VIDEO_CALLING: ");
        a3.I(hasCapabilities2);
        a3.q();
        if (!hasCapabilities || !hasCapabilities2) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(msh mshVar) {
        String o = mshVar.o(((Boolean) new mss(7).get()).booleanValue());
        if (o == null) {
            a.q("Fail to get destination from messageIdentity.");
            return false;
        }
        Intent intent = new Intent("android.intent.action.CALL", Uri.fromParts("tel", o, null));
        intent.putExtra("android.telecom.extra.START_CALL_WITH_VIDEO_STATE", 3);
        intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        try {
            this.b.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }
}
