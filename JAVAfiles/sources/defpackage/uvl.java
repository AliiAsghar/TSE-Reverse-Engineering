package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uvl {
    public uvl() {
    }

    public static alog a(Map map) {
        Stream map2 = Collection.EL.stream(map.entrySet()).map(new unt(18));
        int i = alog.d;
        return (alog) map2.collect(alls.a);
    }

    public static akul b() {
        return aktp.ag("");
    }

    public static akul c() {
        return aktp.ag(new ArrayList());
    }

    public static akul d() {
        return aktp.ag(new ArrayList());
    }

    public static int e(int i) {
        return i - 1;
    }

    public static int f(int i) {
        return i - 1;
    }

    public static final utz g(String str) {
        return uuh.i(uuh.b, str, false);
    }

    public static final utz h(String str) {
        return uuh.n(uuh.b, str, false);
    }

    public static String i(Context context) {
        return "com.google.android.apps.messaging#".concat(String.valueOf(context.getPackageName()));
    }

    public static uvl j(Context context) {
        akrh e = aktp.e("PreferenceFileInitModule#providePreferenceFileInit");
        try {
            abjc.b = context;
            uvl uvlVar = new uvl();
            e.close();
            return uvlVar;
        } catch (Throwable th) {
            try {
                e.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String k() {
        return l(3622735);
    }

    public static String l(int i) {
        return String.format("#%06X", Integer.valueOf(i & 16777215));
    }

    public static boolean m(rtr rtrVar) {
        return rtrVar.W(false);
    }

    public static boolean n(byte[] bArr) {
        if (bArr != null && bArr.length == 32) {
            return true;
        }
        return false;
    }

    public static boolean o(rry rryVar) {
        wks wksVar = rryVar.p;
        if ((wksVar == null || wksVar.b.isEmpty()) && !rryVar.q) {
            if (!abal.c() || !rryVar.al()) {
                if (!((Boolean) wsm.a.e()).booleanValue() || !rryVar.aJ()) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public static agmh[] p() {
        return (agmh[]) rkq.e.a;
    }

    public static agna q() {
        agmy a = agna.a();
        a.f("bugle_backup_db");
        a.c("backup");
        a.b(120);
        a.g(3);
        a.e(new alob().g());
        a.a = new tda();
        return a.a();
    }

    public static Action r(rjk rjkVar, MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        if (!messageCoreData.cJ() && !messageCoreData.cS()) {
            xyo a = rjk.a.a();
            a.H("Message is not a File Transfer. Message:");
            a.H(messageCoreData);
            a.q();
            return null;
        }
        if (!messageCoreData.bU() && !messageCoreData.bW() && !messageCoreData.bX()) {
            xyo a2 = rjk.a.a();
            a2.H("Message is not ready to resume. Message:");
            a2.H(messageCoreData);
            a2.z("status", messageCoreData.ay());
            a2.q();
            return null;
        }
        return rjkVar.a(messageCoreData.B());
    }

    public static int s(int i) {
        xyl.d(i, 31, 38);
        return i - 31;
    }

    public static int t(int i) {
        xyl.d(i, 11, 18);
        return i - 11;
    }

    public static int u(MessageCoreData messageCoreData) {
        if (messageCoreData.cw()) {
            if (messageCoreData.ck()) {
                return 16;
            }
            return 36;
        }
        if (messageCoreData.cP()) {
            return 15;
        }
        return 35;
    }

    public static String v(int i) {
        switch (i) {
            case 0:
                return "sms_send";
            case 1:
                return "mms_send";
            case 2:
                return "mms_download";
            case 3:
                return "rcs_send";
            case 4:
                return "rcs_ft_upload";
            case 5:
                return "rcs_ft_download";
            case 6:
                return "cloud_sync_send";
            case 7:
                return "cloud_sync_attachment_download";
            default:
                xyl.c(a.bV(i, "ProcessPendingMessagesAction: unknown channel "));
                return "unknown";
        }
    }

    public uvl(uuc uucVar, uub uubVar, armf armfVar) {
        akrh e = aktp.e("FlagsInitializer#constructor");
        try {
            uucVar.a();
            uubVar.a();
            armfVar.b();
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
