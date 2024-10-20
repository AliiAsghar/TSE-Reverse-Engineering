package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ryr {
    private static final xze a = xze.g("Bugle", "AttachmentUtils");
    private final Context b;
    private final ydf c;
    private final ydk d;
    private final xbf e;
    private int f = -1;
    private final armf g;
    private final armf h;
    private final wfh i;

    public ryr(Context context, ydf ydfVar, ydk ydkVar, xbf xbfVar, wfh wfhVar, armf armfVar, armf armfVar2) {
        this.b = context;
        this.c = ydfVar;
        this.d = ydkVar;
        this.e = xbfVar;
        this.i = wfhVar;
        this.g = armfVar;
        this.h = armfVar2;
    }

    private final int e(int i) {
        int i2 = this.f;
        if (i2 == -1) {
            int b = this.c.b(i);
            this.f = b;
            return b;
        }
        return i2;
    }

    private static boolean f(MessagePartCoreData messagePartCoreData) {
        if (!messagePartCoreData.aV()) {
            return false;
        }
        if (((Boolean) vof.a.e()).booleanValue() && messagePartCoreData.bi()) {
            return false;
        }
        return true;
    }

    public final long a(Context context, MessagePartCoreData messagePartCoreData, long j) {
        xyl.l(context);
        xyl.l(messagePartCoreData);
        boolean z = true;
        if (!gh.e(messagePartCoreData.U()) && !gh.z(messagePartCoreData.U())) {
            z = false;
        }
        xyl.k(z);
        Uri t = messagePartCoreData.t();
        if (t == null) {
            return j;
        }
        ygt ygtVar = new ygt(context);
        try {
            try {
                ygtVar.c(t);
                j = ygtVar.d(j);
            } catch (IOException e) {
                xyo c = a.c();
                c.H("Error extracting duration from");
                c.H(t);
                c.r(e);
            }
            return j;
        } finally {
            ygtVar.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r19, int r20, android.net.Uri r21, long r22) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ryr.b(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, int, android.net.Uri, long):java.util.List");
    }

    final boolean c(MessagePartCoreData messagePartCoreData, long j, boolean z) {
        Uri t = messagePartCoreData.t();
        if (!messagePartCoreData.bq()) {
            return false;
        }
        Uri t2 = messagePartCoreData.t();
        if ((!((Boolean) uif.a.e()).booleanValue() || !z || t2 == null || this.d.b(t2) <= ((Long) uif.e.e()).longValue()) && ((messagePartCoreData.w() == null || messagePartCoreData.p() <= j) && (t == null || this.d.b(t) <= j))) {
            return false;
        }
        return true;
    }

    public final void d(MessageCoreData messageCoreData, Uri uri, long j, List list) {
        boolean z;
        Iterator it = list.iterator();
        boolean z2 = false;
        boolean z3 = false;
        loop0: while (true) {
            z = z3;
            while (it.hasNext()) {
                tql I = ((MessagePartCoreData) it.next()).I();
                if (I.a()) {
                    if (I == tql.TOO_LARGE) {
                        break;
                    } else {
                        z3 = true;
                    }
                }
            }
            z3 = true;
        }
        Iterator it2 = messageCoreData.W().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (((MessagePartCoreData) it2.next()).w() != null) {
                z2 = true;
                break;
            }
        }
        ConversationIdType z4 = messageCoreData.z();
        if (!((Boolean) vof.a.e()).booleanValue() || messageCoreData.O() == null) {
            messageCoreData.bS(z4, uri, j);
        }
        if (z3) {
            if (z) {
                messageCoreData.bd(j);
                return;
            } else {
                messageCoreData.aT(j);
                return;
            }
        }
        if (z2) {
            messageCoreData.ba(j);
        }
    }
}
