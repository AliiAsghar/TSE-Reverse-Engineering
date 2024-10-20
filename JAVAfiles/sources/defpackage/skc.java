package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.aglz;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class skc extends aglz implements agma {
    public long a;
    public int c;
    public String e;
    public Uri f;
    public String g;
    public ConversationIdType b = ruy.a;
    public MessageIdType d = rvc.a;
    public int h = 0;
    public boolean i = false;
    public long j = 0;
    public int k = 0;
    public int l = 0;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "ConversationLabelsTable [_id: %s,\n  conversation_id: %s,\n  label: %s,\n  message_id: %s,\n  snippet_text: %s,\n  preview_uri: %s,\n  preview_content_type: %s,\n  message_status: %s,\n  read: %s,\n  received_timestamp: %s,\n  message_protocol: %s,\n  raw_telephony_status: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        ConversationIdType conversationIdType = this.b;
        if (conversationIdType != null && !conversationIdType.equals(ruy.a)) {
            contentValues.put("conversation_id", Long.valueOf(ruy.a(this.b)));
        } else {
            contentValues.putNull("conversation_id");
        }
        if (intValue >= 53020) {
            contentValues.put(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, Integer.valueOf(this.c));
        }
        MessageIdType messageIdType = this.d;
        if (messageIdType != null && !messageIdType.equals(rvc.a)) {
            contentValues.put("message_id", Long.valueOf(rvc.a(this.d)));
        } else {
            contentValues.putNull("message_id");
        }
        if (intValue >= 53010) {
            agnc.r(contentValues, "snippet_text", this.e);
        }
        if (intValue >= 55040) {
            Uri uri = this.f;
            if (uri == null) {
                contentValues.putNull("preview_uri");
            } else {
                contentValues.put("preview_uri", uri.toString());
            }
        }
        if (intValue >= 55040) {
            agnc.r(contentValues, "preview_content_type", this.g);
        }
        if (intValue >= 57050) {
            contentValues.put("message_status", Integer.valueOf(this.h));
        }
        if (intValue >= 57050) {
            contentValues.put("read", Boolean.valueOf(this.i));
        }
        if (intValue >= 57050) {
            contentValues.put("received_timestamp", Long.valueOf(this.j));
        }
        if (intValue >= 57050) {
            contentValues.put("message_protocol", Integer.valueOf(this.k));
        }
        if (intValue >= 57050) {
            contentValues.put("raw_telephony_status", Integer.valueOf(this.l));
        }
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        skh skhVar = (skh) agmqVar;
        aq();
        this.cJ = skhVar.dx();
        if (skhVar.db(0)) {
            this.a = skhVar.h();
            fE(0);
        }
        if (skhVar.db(1)) {
            this.b = skhVar.k();
            fE(1);
        }
        if (skhVar.db(2)) {
            this.c = skhVar.c();
            fE(2);
        }
        if (skhVar.db(3)) {
            this.d = skhVar.l();
            fE(3);
        }
        if (skhVar.db(4)) {
            this.e = skhVar.n();
            fE(4);
        }
        if (skhVar.db(5)) {
            this.f = skhVar.j();
            fE(5);
        }
        if (skhVar.db(6)) {
            this.g = skhVar.m();
            fE(6);
        }
        if (skhVar.db(7)) {
            this.h = skhVar.g();
            fE(7);
        }
        if (skhVar.db(8)) {
            this.i = skhVar.o();
            fE(8);
        }
        if (skhVar.db(9)) {
            this.j = skhVar.i();
            fE(9);
        }
        if (skhVar.db(10)) {
            this.k = skhVar.e();
            fE(10);
        }
        if (skhVar.db(11)) {
            this.l = skhVar.f();
            fE(11);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof skc)) {
            return false;
        }
        skc skcVar = (skc) obj;
        if (super.aC(skcVar.cJ) && this.a == skcVar.a && Objects.equals(this.b, skcVar.b) && this.c == skcVar.c && Objects.equals(this.d, skcVar.d) && Objects.equals(this.e, skcVar.e) && Objects.equals(this.f, skcVar.f) && Objects.equals(this.g, skcVar.g) && this.h == skcVar.h && this.i == skcVar.i && this.j == skcVar.j && this.k == skcVar.k && this.l == skcVar.l) {
            return true;
        }
        return false;
    }

    @Override // defpackage.agma
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_labels", agnc.j(new String[]{"conversation_id", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, "message_id", "snippet_text", "preview_uri", "preview_content_type", "message_status", "read", "received_timestamp", "message_protocol", "raw_telephony_status"}));
    }

    @Override // defpackage.agma
    public final String g() {
        return "_id";
    }

    public final int hashCode() {
        aday adayVar;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        return Objects.hash(adayVar, Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, this.e, this.f, this.g, Integer.valueOf(this.h), Boolean.valueOf(this.i), Long.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l), null);
    }

    @Override // defpackage.agma
    public final String i() {
        return "conversation_labels";
    }

    @Override // defpackage.agma
    public final void j(StringBuilder sb, List list) {
        String uri;
        Object obj = new rnb((aglz) this, 12).get();
        Integer valueOf = Integer.valueOf(this.c);
        Object obj2 = new rnb((aglz) this, 13).get();
        String str = this.e;
        Uri uri2 = this.f;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        Object[] objArr = {obj, valueOf, obj2, str, uri, this.g, Integer.valueOf(this.h), Integer.valueOf(this.i ? 1 : 0), Long.valueOf(this.j), Integer.valueOf(this.k), Integer.valueOf(this.l)};
        sb.append('(');
        for (int i = 0; i < 11; i++) {
            Object obj3 = objArr[i];
            if (obj3 instanceof Number) {
                sb.append(String.valueOf(obj3));
            } else {
                if (obj3 instanceof String) {
                    String str2 = (String) obj3;
                    if (str2.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str2));
                    }
                }
                list.add(obj3);
                sb.append('?');
                sb.append(',');
            }
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append(')');
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "ConversationLabelsTable -- REDACTED");
        }
        return a();
    }
}
