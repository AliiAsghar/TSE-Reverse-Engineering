package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.aglz;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lcj extends aglz {
    private String a;
    private int c;
    private sva d;
    private svb e;
    private MessageIdType b = rvc.a;
    private String f = "";
    private String g = "";
    private ConversationIdType h = ruy.a;
    private long i = 0;

    @Override // defpackage.aglz
    public final String a() {
        return String.format(Locale.US, "MessageLabelsFullQuery [message_labels.message_labels__id: %s,\n  message_labels.message_labels_message_id: %s,\n  message_labels.message_labels_label: %s,\n  message_labels.message_labels_confidence: %s,\n  message_labels.message_labels_source: %s,\n  message_labels.message_labels_intent: %s,\n  message_labels.message_labels_model_id: %s,\n  messages.messages_conversation_id: %s,\n  messages.messages_received_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i));
    }

    @Override // defpackage.aglz
    public final void b(ContentValues contentValues) {
        Integer valueOf;
        valueOf = Integer.valueOf(d.P().W().c());
        valueOf.intValue();
    }

    @Override // defpackage.aglz
    public final /* bridge */ /* synthetic */ void c(agmq agmqVar) {
        lbz lbzVar = (lbz) agmqVar;
        aq();
        this.cJ = lbzVar.dx();
        if (lbzVar.db(0)) {
            this.a = lbzVar.getString(lbzVar.cI(0, lco.a));
            fE(0);
        }
        if (lbzVar.db(1)) {
            this.b = new MessageIdType(lbzVar.getLong(lbzVar.cI(1, lco.a)));
            fE(1);
        }
        if (lbzVar.db(2)) {
            this.c = lbzVar.getInt(lbzVar.cI(2, lco.a));
            fE(2);
        }
        if (lbzVar.db(3)) {
            sva[] values = sva.values();
            int i = lbzVar.getInt(lbzVar.cI(3, lco.a));
            if (i < values.length) {
                this.d = values[i];
                fE(3);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (lbzVar.db(4)) {
            svb[] values2 = svb.values();
            int i2 = lbzVar.getInt(lbzVar.cI(4, lco.a));
            if (i2 < values2.length) {
                this.e = values2[i2];
                fE(4);
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (lbzVar.db(5)) {
            if (!lbzVar.isNull(lbzVar.cI(5, lco.a))) {
                this.f = lbzVar.getString(lbzVar.cI(5, lco.a));
                fE(5);
            } else {
                throw new IllegalStateException("found null in cursor for column intent");
            }
        }
        if (lbzVar.db(6)) {
            if (!lbzVar.isNull(lbzVar.cI(6, lco.a))) {
                this.g = lbzVar.getString(lbzVar.cI(6, lco.a));
                fE(6);
            } else {
                throw new IllegalStateException("found null in cursor for column model_id");
            }
        }
        if (lbzVar.db(7)) {
            this.h = new ConversationIdType(lbzVar.getLong(lbzVar.cI(7, lco.a)));
            fE(7);
        }
        if (lbzVar.db(8)) {
            this.i = lbzVar.getLong(lbzVar.cI(8, lco.a));
            fE(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lcj)) {
            return false;
        }
        lcj lcjVar = (lcj) obj;
        if (super.aC(lcjVar.cJ) && Objects.equals(this.a, lcjVar.a) && Objects.equals(this.b, lcjVar.b) && this.c == lcjVar.c && this.d == lcjVar.d && this.e == lcjVar.e && Objects.equals(this.f, lcjVar.f) && Objects.equals(this.g, lcjVar.g) && Objects.equals(this.h, lcjVar.h) && this.i == lcjVar.i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        aday adayVar;
        int ordinal;
        int ordinal2;
        aday adayVar2 = this.cJ;
        if (adayVar2 != null && !adayVar2.Y()) {
            adayVar = this.cJ;
        } else {
            adayVar = null;
        }
        String str = this.a;
        MessageIdType messageIdType = this.b;
        Integer valueOf = Integer.valueOf(this.c);
        sva svaVar = this.d;
        if (svaVar == null) {
            ordinal = 0;
        } else {
            ordinal = svaVar.ordinal();
        }
        Integer valueOf2 = Integer.valueOf(ordinal);
        svb svbVar = this.e;
        if (svbVar == null) {
            ordinal2 = 0;
        } else {
            ordinal2 = svbVar.ordinal();
        }
        return Objects.hash(adayVar, str, messageIdType, valueOf, valueOf2, Integer.valueOf(ordinal2), this.f, this.g, this.h, Long.valueOf(this.i), null);
    }

    public final String toString() {
        if (((aglz.a) akec.w(agnc.b, aglz.a.class)).QY().a()) {
            return String.format(Locale.US, "%s", "MessageLabelsFullQuery -- REDACTED");
        }
        return a();
    }
}
