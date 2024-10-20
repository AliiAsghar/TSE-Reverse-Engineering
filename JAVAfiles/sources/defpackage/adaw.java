package defpackage;

import com.google.android.rcs.client.messaging.data.Conversation;
import j$.util.Optional;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adaw {
    public final Object a;

    public adaw(Object obj) {
        this.a = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final adav a(Conversation conversation, adqu adquVar, adrc adrcVar) {
        addj addjVar = (addj) this.a.b();
        conversation.getClass();
        adrcVar.getClass();
        return new adav(addjVar, conversation, adquVar, adrcVar);
    }

    public final synchronized String b() {
        String uuid;
        uuid = UUID.randomUUID().toString();
        ((abja) ((adef) this.a).a).e(uuid);
        return uuid;
    }

    public final boolean c() {
        if (!((advd) this.a).a.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [armf, java.lang.Object] */
    public final String d(String str, String str2) {
        try {
            aodz o = ((anhn) this.a.b()).o(str, str2);
            if (!((anhn) this.a.b()).k(o)) {
                return null;
            }
            return ((anhn) this.a.b()).e(o, anhl.E164);
        } catch (anhk unused) {
            advr.q("Phone number formatting to E164 failed", new Object[0]);
            return null;
        }
    }

    public final String e(String str) {
        if (str.startsWith("\"")) {
            str = str.substring(str.indexOf(34, 1) + 2);
        }
        if (str.startsWith("<")) {
            str = str.substring(1, str.length() - 1);
        }
        if (!str.startsWith("sip:") && !str.startsWith("tel:")) {
            if (str.startsWith("sips:")) {
                str = str.substring(5);
            }
        } else {
            str = str.substring(4);
        }
        int indexOf = str.indexOf(64);
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        if (adwf.w(str) && !aczf.w()) {
            return ((yjr) this.a).q(str);
        }
        return str;
    }

    public final Optional f(amno amnoVar) {
        Object obj = this.a;
        if (obj == null) {
            return Optional.empty();
        }
        return Optional.of(((abnr) obj).g(amnoVar));
    }

    public adaw() {
        this.a = new advd();
    }
}
