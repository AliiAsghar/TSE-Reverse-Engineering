package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class val {
    public static final utz a;
    private static final int b;
    private static final String c;
    private static final String d;
    private static final String e;
    private final Context f;
    private final xnv g;
    private final armf h;
    private final ydf i;
    private final xbf j;
    private final yfo k;
    private final ryr l;
    private final ydk m;
    private final mbl n;
    private final xwc o;
    private final rct p;
    private final hgj q;

    static {
        int millis = (int) TimeUnit.SECONDS.toMillis(5L);
        b = millis;
        c = "<par dur=\"" + millis + "ms\"><img src=\"%s\" region=\"Image\" /></par>";
        d = "<par dur=\"" + millis + "ms\"><text src=\"%s\" region=\"Text\" /></par>";
        e = "<par dur=\"" + millis + "ms\"><ref src=\"%s\" /></par>";
        a = uuh.e(uuh.b, "max_image_width_height_rcs", 131072);
    }

    public val(Context context, xnv xnvVar, armf armfVar, ydf ydfVar, xbf xbfVar, yfo yfoVar, ryr ryrVar, ydk ydkVar, mbl mblVar, xwc xwcVar, rct rctVar, hgj hgjVar) {
        this.f = context;
        this.g = xnvVar;
        this.h = armfVar;
        this.i = ydfVar;
        this.j = xbfVar;
        this.k = yfoVar;
        this.l = ryrVar;
        this.m = ydkVar;
        this.n = mblVar;
        this.o = xwcVar;
        this.p = rctVar;
        this.q = hgjVar;
    }

    public static String a(String str, String str2, String str3, int i, String str4) {
        if (str != null) {
            return str;
        }
        if (true == TextUtils.isEmpty(str2)) {
            str2 = str3;
        }
        return String.format(str4, Integer.valueOf(i), str2);
    }

    private static void c(gs gsVar, String str) {
        gsVar.g(str.getBytes());
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str = str.substring(0, lastIndexOf);
        }
        gsVar.f(str.getBytes());
    }

    private final long d(gqg gqgVar, MessagePartCoreData messagePartCoreData, String str) {
        Uri t = messagePartCoreData.t();
        if (t == null) {
            xzb.g("Bugle", "Null otherPart uri");
            return 0L;
        }
        String U = messagePartCoreData.U();
        U.getClass();
        if (xzb.q("Bugle", 2)) {
            xzb.l("Bugle", "addPart attachmentUrl: ".concat(t.toString()));
        }
        long b2 = this.m.b(t);
        e(gqgVar, str, t, U);
        return b2;
    }

    private static void e(gqg gqgVar, String str, Uri uri, String str2) {
        gs gsVar = new gs();
        gsVar.e = uri;
        gsVar.h(str2.getBytes());
        c(gsVar, str);
        gqgVar.l(gsVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:313:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x08d3  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0882  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.aknw b(android.content.Context r54, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r55, int r56) {
        /*
            Method dump skipped, instructions count: 2342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.val.b(android.content.Context, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, int):aknw");
    }
}
