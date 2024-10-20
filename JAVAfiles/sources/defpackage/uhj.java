package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uhj {
    public final Context b;
    public final agnq c;
    public final armf d;
    public final armf e;
    public final ahiy f;
    private final Optional h;
    private final anen i;
    private final anen j;
    private static final alvi g = alvi.m("com/google/android/apps/messaging/shared/datamodel/provider/DataChangeNotifier");
    public static final alhr a = uuh.w("use_blocking_for_ui_observers");

    public uhj(Context context, agnq agnqVar, ahiy ahiyVar, Optional optional, armf armfVar, armf armfVar2, anen anenVar, anen anenVar2) {
        this.b = context;
        this.c = agnqVar;
        this.f = ahiyVar;
        this.h = optional;
        this.d = armfVar;
        this.e = armfVar2;
        this.i = anenVar;
        this.j = anenVar2;
    }

    public final void a() {
        akrh e = aktp.e("DataChangeNotifier#notifyAllMessagesChanged");
        try {
            this.c.f(upb.o(this.b));
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b() {
        akrh e = aktp.e("DataChangeNotifier#notifyAllParticipantsChanged");
        try {
            this.c.f(upb.p(this.b));
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c() {
        akrh e = aktp.e("DataChangeNotifier#notifyConversationListChanged");
        try {
            this.c.f(upb.q(this.b));
            this.c.h(new rxa(7), "UpdateUnreadCounterFromConversationList", akto.j(new rui(this, 15)));
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void d(ConversationIdType conversationIdType) {
        akrh e = aktp.e("DataChangeNotifier#notifyConversationMetadataChanged");
        try {
            e(conversationIdType, false);
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void e(ConversationIdType conversationIdType, boolean z) {
        akrh e = aktp.e("DataChangeNotifier#notifyConversationMetadataChanged");
        try {
            Uri l = upb.l(this.b, conversationIdType);
            if (z) {
                Uri.Builder buildUpon = l.buildUpon();
                buildUpon.appendQueryParameter("sendPush", "true");
                l = buildUpon.build();
            }
            this.c.f(l);
            c();
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void f(String str) {
        akrh e = aktp.e("DataChangeNotifier#notifyEverythingChanged");
        try {
            this.c.g(Uri.parse(upb.s(this.b)), str);
            this.h.ifPresent(new uhb(2));
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void g(ConversationIdType conversationIdType) {
        Uri parse = Uri.parse(upb.s(this.b).concat("latest_message_annotations"));
        if (!conversationIdType.b()) {
            parse = upb.n(parse.buildUpon(), conversationIdType);
        }
        this.c.f(parse);
    }

    public final void h(ConversationIdType conversationIdType, MessageIdType messageIdType) {
        anen anenVar;
        akrh e = aktp.e("DataChangeNotifier#notifyMessagesChangedImmediatelyInBackground");
        try {
            rvz rvzVar = new rvz(this, conversationIdType, messageIdType, 14, (boolean[]) null);
            if (((Boolean) ((utz) a.get()).e()).booleanValue()) {
                anenVar = this.i;
            } else {
                anenVar = this.j;
            }
            akul ah = aktp.ah(rvzVar, anenVar);
            e.b(ah);
            qiu.h(ah);
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void i(ConversationIdType conversationIdType) {
        akrh e = aktp.e("DataChangeNotifier#notifyMessagesChanged");
        try {
            j(conversationIdType, rvc.a, new String[0]);
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void j(ConversationIdType conversationIdType, MessageIdType messageIdType, String... strArr) {
        akrh e = aktp.e("DataChangeNotifier#notifyMessagesChanged");
        try {
            this.c.f(upb.j(this.b, conversationIdType, messageIdType, strArr));
            c();
            g(conversationIdType);
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void k(ConversationIdType conversationIdType, Iterable iterable, String... strArr) {
        akrh e = aktp.e("DataChangeNotifier#notifyMessagesChanged2");
        try {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                this.c.f(upb.j(this.b, conversationIdType, (MessageIdType) it.next(), strArr));
            }
            e.close();
            c();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void l(ConversationIdType conversationIdType) {
        akrh e = aktp.e("DataChangeNotifier#notifyParticipantsChanged");
        try {
            Uri.Builder buildUpon = upb.p(this.b).buildUpon();
            buildUpon.appendPath(conversationIdType.a());
            this.c.f(buildUpon.build());
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void m(ConversationIdType conversationIdType) {
        akrh e = aktp.e("DataChangeNotifier#notifySuggestionsChanged");
        try {
            this.c.f(upb.n(Uri.parse(upb.s(this.b).concat("suggestions")).buildUpon(), conversationIdType));
            alvw f = g.f();
            f.X(alwp.a, "Bugle");
            ((alvg) ((alvg) f).h("com/google/android/apps/messaging/shared/datamodel/provider/DataChangeNotifier", "notifySuggestionsChanged", BasePaymentResult.ERROR_REQUEST_TIMEOUT, "DataChangeNotifier.java")).t("DataChangeNotifier.notifySuggestionsChanged conversationId=%s", conversationIdType);
            e.close();
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
