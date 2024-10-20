package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.aglz;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class sjw extends aglz {
    private ConversationIdType a = ruy.a;
    private long b = 0;
    private int c = 0;
    private Uri d;
    private String e;
    private Uri f;
    private String g;
    private String h;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "ConversationImagePartsView [messages.messages_conversation_id: %s,\n  messages.messages_received_timestamp: %s,\n  messages.messages_message_status: %s,\n  parts.parts_uri: %s,\n  parts.parts_content_type: %s,\n  parts.parts_original_uri: %s,\n  participants.participants_display_destination: %s,\n  participants.participants_full_name: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(d.P().W().c());
        valueOf.intValue();
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        Uri parse;
        sea seaVar = (sea) agmqVar;
        aq();
        this.cJ = seaVar.dx();
        if (seaVar.db(0)) {
            this.a = new ConversationIdType(seaVar.getLong(seaVar.cI(0, skb.a)));
            fE(0);
        }
        if (seaVar.db(1)) {
            this.b = seaVar.getLong(seaVar.cI(1, skb.a));
            fE(1);
        }
        if (seaVar.db(2)) {
            this.c = seaVar.getInt(seaVar.cI(2, skb.a));
            fE(2);
        }
        Uri uri = null;
        if (seaVar.db(3)) {
            String string = seaVar.getString(seaVar.cI(3, skb.a));
            if (string == null) {
                parse = null;
            } else {
                parse = Uri.parse(string);
            }
            this.d = parse;
            fE(3);
        }
        if (seaVar.db(4)) {
            this.e = seaVar.getString(seaVar.cI(4, skb.a));
            fE(4);
        }
        if (seaVar.db(5)) {
            String string2 = seaVar.getString(seaVar.cI(5, skb.a));
            if (string2 != null) {
                uri = Uri.parse(string2);
            }
            this.f = uri;
            fE(5);
        }
        if (seaVar.db(6)) {
            this.g = aabr.bb(seaVar.getString(seaVar.cI(6, skb.a)));
            fE(6);
        }
        if (seaVar.db(7)) {
            this.h = yta.a(seaVar.getString(seaVar.cI(7, skb.a)));
            fE(7);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sjw)) {
            return false;
        }
        sjw sjwVar = (sjw) obj;
        if (super.aC(sjwVar.cJ) && Objects.equals(this.a, sjwVar.a) && this.b == sjwVar.b && this.c == sjwVar.c && Objects.equals(this.d, sjwVar.d) && Objects.equals(this.e, sjwVar.e) && Objects.equals(this.f, sjwVar.f) && Objects.equals(this.g, sjwVar.g) && Objects.equals(this.h, sjwVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, this.a, Long.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, null);
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "ConversationImagePartsView -- REDACTED");
        }
        return a();
    }
}
