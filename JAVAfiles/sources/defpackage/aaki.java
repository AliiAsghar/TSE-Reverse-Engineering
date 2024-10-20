package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent;
import com.google.android.ims.rcsservice.chatsession.ChatSessionReportEvent;
import com.google.android.ims.util.common.RcsIntents;
import j$.util.Optional;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aaki implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aaki(aalt aaltVar, int i) {
        this.c = i;
        this.a = aaltVar;
        this.b = "com.google.android.apps.messaging.ui.debug.DebugReceiver";
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, android.content.DialogInterface] */
    /* JADX WARN: Type inference failed for: r0v98, types: [java.lang.Object, android.content.DialogInterface] */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.lang.Object, aals] */
    @Override // java.lang.Runnable
    public final void run() {
        ConversationIdType g;
        rve rveVar;
        int i;
        String str;
        switch (this.c) {
            case 0:
                ((aalt) this.a).y.sendBroadcast(new Intent((String) this.b));
                return;
            case 1:
                ((aaco) this.b).a.onClick((View) this.a);
                return;
            case 2:
                ((yck) ((aalt) this.b).V.b()).c();
                aalt.q((Activity) this.a);
                return;
            case 3:
                aalt.q((Activity) this.a);
                this.b.cancel();
                return;
            case 4:
                ((yck) ((aalt) this.b).V.b()).n();
                aalt.q((Activity) this.a);
                return;
            case 5:
                ((yck) ((aalt) this.b).V.b()).i(!((yck) r0.V.b()).n);
                aalt.q((Activity) this.a);
                return;
            case 6:
                xze xzeVar = aalt.c;
                Object obj = this.b;
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream((File) this.a));
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream((File) obj));
                        try {
                            ajki.w(bufferedInputStream, bufferedOutputStream);
                            bufferedOutputStream.close();
                            bufferedInputStream.close();
                            return;
                        } finally {
                        }
                    } finally {
                    }
                } catch (IOException e) {
                    xzb.i("Bugle", e, "error getting wm database");
                    return;
                }
            case 7:
                zof zofVar = (zof) this.b;
                if (((Optional) zofVar.a).isPresent()) {
                    g = ((rrl) ((Optional) zofVar.a).get()).c;
                } else {
                    g = aalt.g();
                }
                Object obj2 = this.a;
                if (!g.b()) {
                    sxy d = MessagesTable.d();
                    d.w("getLastReceivedRcsMessageId");
                    d.e(new aakq(12));
                    d.g(new aaky(g, 2));
                    d.h(new atkn((Object) MessagesTable.c.g, false));
                    d.u(1);
                    sxt sxtVar = (sxt) d.b().n();
                    try {
                        if (sxtVar.moveToFirst()) {
                            rveVar = sxtVar.H();
                            sxtVar.close();
                        } else {
                            sxtVar.close();
                            rveVar = null;
                        }
                        if (rve.j(rveVar)) {
                            ((abbu) ((aalt) obj2).Z.b()).l("Failed to find received rcs in conversation ".concat(g.toString()));
                            return;
                        }
                        ChatSessionReportEvent chatSessionReportEvent = new ChatSessionReportEvent(50071, rve.e(rveVar), rve.e(rveVar), 3);
                        Intent intent = new Intent(RcsIntents.ACTION_NEW_EVENT);
                        intent.putExtra(RcsIntents.EXTRA_EVENT, chatSessionReportEvent);
                        adtw.c((Context) zofVar.b, intent);
                        intent.setPackage("com.google.android.apps.messaging");
                        ((Activity) zofVar.b).sendBroadcast(intent);
                        ((abbu) ((aalt) obj2).Z.b()).l("Failed delivery report for Rcs Message " + rve.c(rveVar) + " in conversation " + g.toString());
                        return;
                    } finally {
                    }
                } else {
                    ((abbu) ((aalt) obj2).Z.b()).l("Failed to find 1:1 rcs conversation");
                    return;
                }
            case 8:
                zof zofVar2 = (zof) this.b;
                rrl rrlVar = (rrl) ((Optional) zofVar2.a).get();
                ConversationIdType conversationIdType = rrlVar.c;
                Object obj3 = this.a;
                if (!conversationIdType.b()) {
                    ParticipantsTable.BindData a = rrlVar.e.a();
                    a.getClass();
                    String O = a.O();
                    long j = rrlVar.b.l;
                    aalt aaltVar = (aalt) obj3;
                    MessageCoreData f = aaltVar.f(conversationIdType);
                    if (f == null) {
                        ((abbu) aaltVar.Z.b()).l("Failed to find undelivered message in conversation ".concat(conversationIdType.toString()));
                        return;
                    }
                    rve E = f.E();
                    if (E.i()) {
                        ((abbu) aaltVar.Z.b()).l("Failed to find undelivered rcs in conversation ".concat(conversationIdType.toString()));
                        return;
                    }
                    if (true != f.cJ()) {
                        i = 50044;
                    } else {
                        i = 50045;
                    }
                    ChatSessionMessageEvent chatSessionMessageEvent = new ChatSessionMessageEvent(j, E.b, 0L, i, O, false);
                    Intent intent2 = new Intent(RcsIntents.ACTION_NEW_EVENT);
                    intent2.putExtra(RcsIntents.EXTRA_EVENT, chatSessionMessageEvent);
                    adtw.c((Context) zofVar2.b, intent2);
                    intent2.setPackage("com.google.android.apps.messaging");
                    ((Activity) zofVar2.b).sendBroadcast(intent2);
                    ((abbu) aaltVar.Z.b()).l("Report network-side fallback for Rcs Message " + rve.c(E) + " in conversation " + conversationIdType.toString());
                    return;
                }
                ((abbu) ((aalt) obj3).Z.b()).l("Failed to find 1:1 RCS conversation");
                return;
            case 9:
                ((yck) ((aalt) this.b).V.b()).g(!((yck) r0.V.b()).k);
                aalt.q((Activity) this.a);
                return;
            case 10:
                ((yck) ((aalt) this.b).V.b()).o();
                aalt.q((Activity) this.a);
                return;
            case 11:
                ((yck) ((aalt) this.b).V.b()).d();
                aalt.q((Activity) this.a);
                return;
            case 12:
                aalt.q((Activity) this.a);
                this.b.cancel();
                return;
            case 13:
                ((yck) ((aalt) this.b).V.b()).h(!((yck) r0.V.b()).j);
                aalt.q((Activity) this.a);
                return;
            case 14:
                ((whj) ((aalt) this.b).aO.b()).k(((wxb) this.a).c, who.RCS_SUCCESS_NOTIFICATION_STATE_SUCCESS_AWAITING_NOTIFY);
                return;
            case 15:
                ((yck) ((aalt) this.b).V.b()).j(!((yck) r0.V.b()).i);
                aalt.q((Activity) this.a);
                return;
            case 16:
                ((yck) ((aalt) this.b).V.b()).f(!((yck) r0.V.b()).o);
                aalt.q((Activity) this.a);
                return;
            case 17:
                ((abbu) ((aalt) this.a).Z.b()).l((String) this.b);
                return;
            case 18:
                abbu abbuVar = (abbu) ((aalt) this.b).Z.b();
                if (true != ((iug) this.a).c) {
                    str = "";
                } else {
                    str = "  EXISTING REACTTIONS IGNORED";
                }
                abbuVar.l("Promo is reset.".concat(str));
                return;
            case 19:
                xze xzeVar2 = aalt.c;
                boolean booleanValue = ((Boolean) this.b).booleanValue();
                ?? r2 = this.a;
                if (booleanValue) {
                    r2.b();
                    return;
                } else {
                    r2.a();
                    return;
                }
            default:
                ((abbu) ((aalk) this.a).b.Z.b()).l("No pending verification. Skipped.".concat(String.valueOf(this.b)));
                return;
        }
    }

    public /* synthetic */ aaki(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ aaki(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
