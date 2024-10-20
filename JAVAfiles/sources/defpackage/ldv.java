package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Binder;
import android.util.Log;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ldv implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ldv(Context context, boolean z, acit acitVar, int i) {
        this.d = i;
        this.b = context;
        this.a = z;
        this.c = acitVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, ezb] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, ncp] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object, aiql] */
    @Override // java.lang.Runnable
    public final void run() {
        ezb ezbVar;
        String notificationDelegate;
        int i = 3;
        switch (this.d) {
            case 0:
                Object obj = this.b;
                Object obj2 = this.c;
                try {
                    MessageCoreData q = ((rwd) ((ldy) obj).f.b()).q((MessageIdType) obj2);
                    if (q == null) {
                        xyo e = ldy.b.e();
                        e.H("Couldn't read.");
                        e.c((MessageIdType) obj2);
                        e.H("when logging link preview click.");
                        e.q();
                        return;
                    }
                    aozy createBuilder = amgy.a.createBuilder();
                    if (true == this.a) {
                        i = 4;
                    }
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amgy amgyVar = (amgy) createBuilder.b;
                    amgyVar.c = a.an(i);
                    amgyVar.b |= 1;
                    aozy createBuilder2 = amih.a.createBuilder();
                    aqax aqaxVar = aqax.CONVERSATION_VIEW;
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    amih amihVar = (amih) createBuilder2.b;
                    amihVar.d = aqaxVar.a();
                    amihVar.b |= 2;
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    amih amihVar2 = (amih) createBuilder2.b;
                    amihVar2.c = a.an(4);
                    amihVar2.b = 1 | amihVar2.b;
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    amih amihVar3 = (amih) createBuilder2.b;
                    amgy amgyVar2 = (amgy) createBuilder.s();
                    amgyVar2.getClass();
                    amihVar3.e = amgyVar2;
                    amihVar3.b |= 4;
                    ((ldy) obj).c.W(q, (amih) createBuilder2.s());
                    return;
                } catch (Exception e2) {
                    xyo b = ldy.b.b();
                    b.H("Couldn't log link preview click.");
                    b.c((MessageIdType) obj2);
                    b.r(e2);
                    return;
                }
            case 1:
                ?? r0 = this.b;
                boolean z = this.a;
                Object obj3 = this.c;
                try {
                    synchronized (((ezc) obj3).a) {
                        if (((ezc) obj3).c && z) {
                            return;
                        }
                        while (true) {
                            synchronized (((ezc) obj3).a) {
                                ezbVar = (ezb) ((ezc) obj3).b.poll();
                            }
                            if (ezbVar == null) {
                                r0.a();
                                return;
                            }
                            ezbVar.a();
                        }
                    }
                } catch (Exception e3) {
                    ((ezc) obj3).a(e3);
                    return;
                }
            case 2:
                ?? r02 = this.c;
                mkt mktVar = (mkt) this.b;
                xhv a = mktVar.j.a(r02.z());
                if (((qih) mktVar.h.b()).d(r02.z(), a)) {
                    qih qihVar = (qih) mktVar.h.b();
                    ConversationIdType z2 = r02.z();
                    syc sycVar = new syc();
                    sycVar.i(r02.B());
                    String[] f = qihVar.f(z2, new syb(sycVar));
                    if (f != null) {
                        mktVar.k.f(mktVar.b, f, this.a);
                    }
                }
                if (a.c()) {
                    Uri t = r02.t();
                    if (t != null) {
                        mktVar.g.Z(t);
                        return;
                    }
                    alwl alwlVar = (alwl) mkt.a.i();
                    alwlVar.X(ydl.a, r02.B().a());
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/api/messaging/control/markasread/MarkMessagesAsReadHandler", "doBackgroundWork", 278, "MarkMessagesAsReadHandler.java")).q("Message has a null uri");
                    return;
                }
                return;
            case 3:
                ?? r03 = this.c;
                Object obj4 = this.b;
                if (r03.size() >= 10) {
                    Iterator<E> it = ((ndj) obj4).a().iterator();
                    while (it.hasNext()) {
                        ((ndk) it.next()).a();
                    }
                    return;
                } else {
                    for (ndk ndkVar : ((ndj) obj4).a()) {
                        boolean z3 = this.a;
                        if (((Boolean) ((ndl) ndkVar.a).a.a(r03, Boolean.valueOf(z3))).booleanValue()) {
                            qiu.h(ndkVar.b.a());
                        }
                    }
                    return;
                }
            case 4:
                boolean z4 = this.a;
                Object obj5 = this.c;
                xxh xxhVar = (xxh) this.b;
                qjh.l(xxhVar.n, null, new xxg(xxhVar, (String) obj5, z4, null), 3);
                return;
            case 5:
                this.b.a((String) this.c, this.a);
                return;
            case 6:
                ((aker) this.c).a(this.a, (Uri) this.b);
                return;
            case 7:
                Object obj6 = this.c;
                Object obj7 = this.b;
                try {
                    if (Binder.getCallingUid() != ((Context) obj7).getApplicationInfo().uid) {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + ((Context) obj7).getPackageName());
                    } else {
                        SharedPreferences.Editor edit = aode.af((Context) obj7).edit();
                        edit.putBoolean("proxy_notification_initialized", true);
                        edit.apply();
                        NotificationManager notificationManager = (NotificationManager) ((Context) obj7).getSystemService(NotificationManager.class);
                        if (!this.a) {
                            notificationDelegate = notificationManager.getNotificationDelegate();
                            if ("com.google.android.gms".equals(notificationDelegate)) {
                                notificationManager.setNotificationDelegate(null);
                            }
                        } else {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        }
                    }
                    return;
                } finally {
                    ((acit) obj6).d(null);
                }
            default:
                ((arcr) this.c).l.c(this.b, this.a);
                return;
        }
    }

    public ldv(arcr arcrVar, arau arauVar, boolean z, int i) {
        this.d = i;
        this.b = arauVar;
        this.a = z;
        this.c = arcrVar;
    }

    public /* synthetic */ ldv(Object obj, Object obj2, boolean z, int i) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = z;
    }

    public /* synthetic */ ldv(Object obj, boolean z, Object obj2, int i) {
        this.d = i;
        this.c = obj;
        this.a = z;
        this.b = obj2;
    }

    public /* synthetic */ ldv(Set set, ndj ndjVar, boolean z, int i) {
        this.d = i;
        this.c = set;
        this.b = ndjVar;
        this.a = z;
    }
}
