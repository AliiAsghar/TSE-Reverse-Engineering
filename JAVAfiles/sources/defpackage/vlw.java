package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.action.RedownloadMessageAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Comparator;
import j$.util.Optional;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vlw {
    public static final alwo a = alwo.o("BugleNotifications");
    public static final Map b;
    public static final Comparator c;
    public final Context d;
    public final anen e;
    public final anen f;
    public final vmy g;
    public final Optional h;
    public final wnt i;
    public final Map j;
    public final qoq k;
    public final xbi l;
    public final armf m;
    public final Optional n;
    public final Optional o;
    public final armf p;
    public final armf q;
    public final armf r;
    public final vti s;
    public final wfh t;
    private final armf u;
    private final riz v;
    private final armf w;

    static {
        EnumMap enumMap = new EnumMap(vkf.class);
        b = enumMap;
        enumMap.put((EnumMap) vkf.NAT_COPY_OTP, (vkf) 0);
        enumMap.put((EnumMap) vkf.NAT_MARK_AS_READ, (vkf) 1);
        enumMap.put((EnumMap) vkf.NAT_DOWNLOAD_MMS, (vkf) 2);
        enumMap.put((EnumMap) vkf.NAT_NON_TEXT_SMART_ACTION, (vkf) 3);
        enumMap.put((EnumMap) vkf.NAT_TEXT_CLASSIFIER_ACTION, (vkf) 4);
        enumMap.put((EnumMap) vkf.NAT_QUICK_REPLY, (vkf) 5);
        enumMap.put((EnumMap) vkf.NAT_REMINDER, (vkf) 6);
        enumMap.put((EnumMap) vkf.NAT_WEARABLE_QUICK_REPLY, (vkf) 7);
        enumMap.put((EnumMap) vkf.NAT_WEARABLE_OPEN_CONVERSATION, (vkf) 8);
        enumMap.put((EnumMap) vkf.NAT_WEARABLE_CALL, (vkf) 9);
        c = Comparator.CC.comparing(new vil(18), Comparator.CC.comparingInt(new kmb(8)));
    }

    public vlw(Context context, anen anenVar, anen anenVar2, vmy vmyVar, Optional optional, wnt wntVar, armf armfVar, riz rizVar, Map map, vti vtiVar, qoq qoqVar, wfh wfhVar, xbi xbiVar, armf armfVar2, armf armfVar3, Optional optional2, Optional optional3, armf armfVar4, armf armfVar5, armf armfVar6) {
        this.d = context;
        this.e = anenVar;
        this.f = anenVar2;
        this.g = vmyVar;
        this.h = optional;
        this.i = wntVar;
        this.u = armfVar;
        this.v = rizVar;
        this.j = map;
        this.s = vtiVar;
        this.k = qoqVar;
        this.t = wfhVar;
        this.l = xbiVar;
        this.w = armfVar2;
        this.m = armfVar3;
        this.n = optional3;
        this.o = optional2;
        this.p = armfVar4;
        this.q = armfVar5;
        this.r = armfVar6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean c(boolean z, alog alogVar) {
        if (!z) {
            return false;
        }
        int size = alogVar.size();
        int i = 0;
        while (i < size) {
            int c2 = ((rry) alogVar.get(i)).c();
            i++;
            if (c2 != 2) {
                return true;
            }
        }
        return false;
    }

    public final int a() {
        if (((yxb) this.w.b()).a()) {
            return 2;
        }
        return 1;
    }

    public final akul b(ConversationIdType conversationIdType, vmr vmrVar, int i) {
        boolean z;
        if (vmrVar.e) {
            MessageIdType messageIdType = vmrVar.f;
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            if (messageIdType.b()) {
                ((alwl) ((alwl) a.i()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createDownloadMmsAction", 703, "IncomingMessageActionCreator.java")).q("Message id is empty, not creating download mms action");
                return aktp.ag(null);
            }
            rhk rhkVar = (rhk) ((ubl) this.u.b()).c.b();
            Context context = this.d;
            riz rizVar = this.v;
            Context context2 = (Context) rizVar.a.b();
            context2.getClass();
            xnv xnvVar = (xnv) rizVar.c.b();
            xnvVar.getClass();
            qoq qoqVar = (qoq) rizVar.d.b();
            qoqVar.getClass();
            rjk rjkVar = (rjk) rizVar.e.b();
            rjkVar.getClass();
            rji rjiVar = (rji) rizVar.f.b();
            rjiVar.getClass();
            rcz rczVar = (rcz) rizVar.g.b();
            rczVar.getClass();
            PendingIntent a2 = rhkVar.a(context, new RedownloadMessageAction(context2, rizVar.b, xnvVar, qoqVar, rjkVar, rjiVar, rczVar, rizVar.h, rizVar.i, rizVar.j, rizVar.k, messageIdType, true, z), 119, true, upb.j(this.d, conversationIdType, messageIdType, new String[0]));
            Context context3 = this.d;
            return aktp.ag(vke.b(vkf.NAT_DOWNLOAD_MMS, IconCompat.g(context3, R.drawable.quantum_gm_ic_file_download_white_24), context3.getString(R.string.im_notification_download_mms), a2, Optional.empty()).a());
        }
        ((alwl) a.m().h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createDownloadMmsAction", 696, "IncomingMessageActionCreator.java")).q("Manual download not needed");
        return aktp.ag(null);
    }
}
