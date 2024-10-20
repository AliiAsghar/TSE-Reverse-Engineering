package defpackage;

import android.content.Context;
import android.media.MediaActionSound;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.firebase.iid.FirebaseInstanceId;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ytr implements Callable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ytr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v75, types: [men, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v77, types: [mek, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object bQ;
        MessageIdType messageIdType;
        Object apply;
        int i = 3;
        int i2 = 2;
        byte[] bArr = null;
        boolean z = true;
        int i3 = 0;
        switch (this.b) {
            case 0:
                ((ytw) this.a).k.c("Bugle.VerifiedSms.Registration.RcsTokenReceived.Counts");
                return null;
            case 1:
                return Boolean.valueOf(Collection.EL.stream((List) albo.bQ(albo.bO(this.a))).filter(new ytt(i3)).anyMatch(new ytt(i2)));
            case 2:
                int i4 = 0;
                do {
                    ?? r1 = this.a;
                    if (i4 < ((alsx) r1).c) {
                        bQ = albo.bQ((akul) r1.get(i4));
                        i4++;
                    } else {
                        ytw.a.q("There was no phone numbers/IMSIs registered by C11N flow.");
                        return false;
                    }
                } while (!Boolean.TRUE.equals(bQ));
                ytw.a.q("There was a phone number/IMSI registered by C11N flow.");
                return true;
            case 3:
                return yup.d((Context) this.a);
            case 4:
                yyp yypVar = (yyp) this.a;
                if (!((yyt) yypVar.a.b()).c() || !((lrf) yypVar.b.b()).c()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                return (List) ((Optional) this.a).get();
            case 6:
                lbz lbzVar = (lbz) ((agoz) this.a).n();
                try {
                    ryi ryiVar = new ryi();
                    ryiVar.c(stl.e(lbzVar).cR());
                    lbzVar.close();
                    return ryiVar;
                } catch (Throwable th) {
                    try {
                        lbzVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 7:
                return ((agoz) this.a).t();
            case 8:
                zvs zvsVar = (zvs) this.a;
                ypr yprVar = (ypr) zvsVar.c.b();
                ConversationIdType conversationIdType = zvsVar.e;
                conversationIdType.getClass();
                aiut.b();
                Object c = yprVar.f.c("SpamDatabaseOperations#updateConversationSpamDismissStatus", new ylq(yprVar, conversationIdType, i, bArr));
                c.getClass();
                Boolean bool = (Boolean) c;
                bool.booleanValue();
                return bool;
            case 9:
                zwt zwtVar = (zwt) this.a;
                return zwtVar.i.k(zwtVar.e.t());
            case 10:
                return ((zwt) this.a).g.t();
            case 11:
                zwx zwxVar = (zwx) this.a;
                ParticipantsTable.BindData a = zwxVar.d.k(zwxVar.b.t()).a();
                if (a != null) {
                    return a.A();
                }
                return tqr.VERIFICATION_NA;
            case 12:
                zxf zxfVar = (zxf) this.a;
                int o = ((rsr) zxfVar.g.a()).o();
                int q = ((rsr) zxfVar.g.a()).q();
                yay a2 = ((yaq) zxfVar.c.a()).a(o, q);
                ((alwl) zxf.a.m().h("com/google/android/apps/messaging/ui/conversation/conversationbottombar/ConversationBottomBarDataService", "shouldShowNoConnectionBar", 104, "ConversationBottomBarDataService.java")).J("shouldShowNoConnectionBar for protocol %d, subId %d: %s.", Integer.valueOf(o), Integer.valueOf(q), a2);
                return new zxe(a2.equals(yay.UNAVAILABLE));
            case 13:
                xze xzeVar = aalt.c;
                stj a3 = stl.a();
                a3.w("getSpecificMessageAnnotations");
                a3.e(new aaky(this.a, 5));
                stf stfVar = (stf) a3.b().n();
                try {
                    alog cR = stfVar.cR();
                    stfVar.close();
                    return cR;
                } catch (Throwable th3) {
                    try {
                        stfVar.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            case 14:
                return this.a.b();
            case 15:
                return this.a.b();
            case 16:
                xze xzeVar2 = aalt.c;
                sxy d = MessagesTable.d();
                d.w("getLastMessageIdInConversation");
                d.e(new aakq(10));
                d.g(new aaky(((rrl) this.a).c, i3));
                d.h(new atkn((Object) MessagesTable.c.g, false));
                d.u(1);
                sxt sxtVar = (sxt) d.b().n();
                try {
                    if (sxtVar.moveToFirst()) {
                        messageIdType = sxtVar.E();
                    } else {
                        messageIdType = rvc.a;
                    }
                    sxtVar.close();
                    return messageIdType;
                } catch (Throwable th5) {
                    try {
                        sxtVar.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            case 17:
                Optional ofNullable = Optional.ofNullable(FirebaseInstanceId.b().g());
                if (!ofNullable.isPresent()) {
                    return null;
                }
                return (String) ofNullable.get();
            case 18:
                return Long.valueOf(acmd.b(((aalt) this.a).y.getContentResolver(), "android_id", 0L));
            case 19:
                ydx ydxVar = (ydx) ((aats) this.a).f.b();
                akrh e = aktp.e("GifDatabaseOperations#getRecentGifs");
                try {
                    xyl.h();
                    ArrayList arrayList = new ArrayList();
                    tfy tfyVar = new tfy(tgb.a);
                    tfyVar.w("getRecentGifs");
                    apply = new ybe(9).apply(new tga());
                    tfyVar.k(new agpw((tga) apply));
                    tfyVar.c(new atkn((Object) tgb.c.c, false));
                    tfv tfvVar = (tfv) tfyVar.b().n();
                    while (tfvVar.moveToNext()) {
                        try {
                            tfr tfrVar = (tfr) tfvVar.cK();
                            if (uhl.i(tfrVar.h(), ydxVar.a).exists()) {
                                arrayList.add((tfr) tfvVar.cK());
                            } else {
                                akrh e2 = aktp.e("GifDatabaseOperations#deleteRecentGif");
                                try {
                                    tfw tfwVar = new tfw();
                                    tfwVar.f("deleteRecentGif");
                                    tfwVar.b(new xol(tfrVar, 19));
                                    tfwVar.d();
                                    e2.close();
                                } catch (Throwable th7) {
                                    try {
                                        e2.close();
                                    } catch (Throwable th8) {
                                        th7.addSuppressed(th8);
                                    }
                                    throw th7;
                                }
                            }
                        } finally {
                        }
                    }
                    tfvVar.close();
                    e.close();
                    return arrayList;
                } catch (Throwable th9) {
                    try {
                        e.close();
                    } catch (Throwable th10) {
                        th9.addSuppressed(th10);
                    }
                    throw th9;
                }
            default:
                aava aavaVar = (aava) this.a;
                MediaActionSound mediaActionSound = aavaVar.j;
                mediaActionSound.getClass();
                mediaActionSound.load(0);
                aavaVar.j.load(2);
                aavaVar.j.load(3);
                return null;
        }
    }
}
