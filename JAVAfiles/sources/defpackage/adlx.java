package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.ims.provisioning.config.Configuration;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adlx {
    public final boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public adlx(aday adayVar, adtl adtlVar, adnv adnvVar, adnk adnkVar, vau vauVar, boolean z) {
        this.b = adayVar;
        this.c = adnvVar;
        this.d = adnkVar;
        this.e = adtlVar;
        this.f = vauVar;
        this.a = z;
    }

    static final int e(int i) {
        int am = a.am(i);
        if (am != 2) {
            if (am == 3) {
                return 2;
            }
            if (am == 4) {
                return 3;
            }
            return 0;
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, vau] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, vau] */
    public final adnw a(Context context, String str, String str2) {
        String str3;
        String str4;
        String c = c(str, str2);
        if (aczv.x() && aczv.W()) {
            str3 = this.f.c(str2).A;
        } else {
            str3 = (String) acpq.E().u().a();
        }
        if (aczv.x() && aczv.W()) {
            str4 = this.f.c(str2).B;
        } else {
            str4 = (String) acpq.E().w().a();
        }
        String e = adww.e(context, adww.a(context), 1);
        String b = b(context, str2);
        if (((Boolean) aczv.s().a.ax.a()).booleanValue()) {
            adnw adnwVar = new adnw(str3, str4, e);
            adnwVar.f = c;
            adnwVar.g = b;
            adnwVar.h = adww.b(context);
            return adnwVar;
        }
        adnw adnwVar2 = new adnw(str3, str4, e);
        adnwVar2.f = c;
        adnwVar2.g = b;
        return adnwVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r1v11, types: [adtm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, vau] */
    public final String b(Context context, String str) {
        String str2;
        int intValue;
        adwt f;
        String imei;
        try {
            f = adwt.g(context).f(((adtl) this.e).b());
        } catch (adwk unused) {
            advr.g("No permissions to get device id", new Object[0]);
        }
        if (f != null) {
            try {
                imei = f.a.getImei(((adtl) this.e).a.g());
                str2 = albo.ag(imei);
                if (!aczv.x() && aczv.W()) {
                    int T = a.T(this.f.c(str).D);
                    if (T == 0) {
                        T = 1;
                    }
                    intValue = e(T);
                } else {
                    intValue = ((Integer) acpq.E().r().a()).intValue();
                }
                if (intValue == 2 && intValue != 3) {
                    return "";
                }
                return str2;
            } catch (SecurityException e) {
                throw new adwk("READ_PRIVILEGED_PHONE_STATE permission is missing.", e);
            }
        }
        str2 = "";
        if (!aczv.x()) {
        }
        intValue = ((Integer) acpq.E().r().a()).intValue();
        if (intValue == 2) {
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, vau] */
    public final String c(String str, String str2) {
        int intValue;
        if (aczv.x() && aczv.W()) {
            int T = a.T(this.f.c(str2).E);
            if (T == 0) {
                T = 1;
            }
            intValue = e(T);
        } else {
            intValue = ((Integer) acpq.E().s().a()).intValue();
        }
        if (intValue != 1) {
            if (intValue != 2 && intValue != 3) {
                return "";
            }
        } else if (!TextUtils.isEmpty(str)) {
            return String.format(Locale.US, "%-15s", str.substring(0, Math.min(str.length(), 6))).replace(' ', '0');
        }
        return str;
    }

    public final void d(Context context, String str, Configuration configuration, String str2, String str3, int i, String str4, String str5, admw admwVar) {
        adnw a;
        if (str4 == null) {
            a = a(context, c(((adtl) this.e).e(), str5), str5);
        } else {
            a = a(context, str4, str5);
        }
        adnw adnwVar = a;
        ((aday) this.b).f(str, configuration, str2, str3, i, adnwVar, Optional.of(admwVar));
    }

    public final sxx f(mts mtsVar) {
        sxx g = g();
        sxy d = MessagesTable.d();
        d.w("countItemsBeforeKeyQuery");
        d.s();
        d.n(new agpl("COUNT(*)"), "cpt");
        d.g(new ivj(this, mtsVar, 20, null));
        sxx b = ((akip) this.b).b(d).b();
        sxy d2 = MessagesTable.d();
        d2.w("+countItemsBeforeKeyAndTotalQuery");
        d2.s();
        d2.n(h(g), "total");
        d2.n(h(b), "subtotal");
        d2.u(1);
        return d2.b();
    }

    public final sxx g() {
        sxy d = MessagesTable.d();
        d.w("totalCountQuery");
        d.s();
        d.n(new agpl("COUNT(*)"), "cpt");
        d.g(new mtl(this, 3));
        return ((akip) this.b).b(d).b();
    }

    public final agpj h(sxx sxxVar) {
        if (this.a) {
            return new agpk("SELECT cpt FROM $V", new Object[]{sxxVar});
        }
        return sxxVar;
    }

    public adlx(BugleConversationId bugleConversationId, mtn mtnVar, boolean z) {
        this.f = bugleConversationId;
        this.d = mtnVar;
        this.a = z;
        this.b = new akip(z);
        this.e = alvi.m("com/google/android/apps/messaging/shared/api/messaging/message/BuglePlaceholdersCountQueries");
        this.c = new mtt();
    }
}
