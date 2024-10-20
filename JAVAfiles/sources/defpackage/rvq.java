package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rvq {
    private static final xze a = xze.g("Bugle", "IntentConverter");
    private final ydh b;
    private final Context c;
    private final armf d;
    private final ydk e;
    private final mbl f;
    private final rtg g;
    private final tqx h;

    public rvq(ydh ydhVar, Context context, armf armfVar, ydk ydkVar, mbl mblVar, rtg rtgVar, tqx tqxVar) {
        this.b = ydhVar;
        this.c = context;
        this.d = armfVar;
        this.e = ydkVar;
        this.f = mblVar;
        this.g = rtgVar;
        this.h = tqxVar;
    }

    public final MessageCoreData a(Intent intent) {
        ArrayList arrayList;
        Optional ofNullable;
        String action = intent.getAction();
        String stringExtra = intent.getStringExtra("android.intent.extra.SUBJECT");
        boolean booleanExtra = intent.getBooleanExtra("extra_subject_mandatory", false);
        MessageCoreData messageCoreData = null;
        if (!"android.intent.action.SEND".equals(action) && !"android.intent.action.SENDTO".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            if ("android.intent.action.SEND_MULTIPLE".equals(action)) {
                arrayList = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
            } else {
                a.q("Unsupported action type for sharing: ".concat(String.valueOf(action)));
                return null;
            }
        } else {
            arrayList = new ArrayList(1);
            arrayList.add((Uri) intent.getParcelableExtra("android.intent.extra.STREAM"));
        }
        tqx tqxVar = this.h;
        int i = yft.a;
        if (intent == null) {
            ofNullable = Optional.empty();
        } else {
            String stringExtra2 = intent.getStringExtra("sms_body");
            Uri data = intent.getData();
            if (TextUtils.isEmpty(stringExtra2) && data != null) {
                stringExtra2 = data.isHierarchical() ? data.getQueryParameter("body") : Uri.parse(data.toString().replaceFirst(":", "://")).getQueryParameter("body");
            }
            if (TextUtils.isEmpty(stringExtra2)) {
                stringExtra2 = intent.getStringExtra("android.intent.extra.TEXT");
            }
            ofNullable = Optional.ofNullable(stringExtra2);
        }
        MessageCoreData k = tqxVar.k((String) ofNullable.orElse(null));
        if (arrayList != null) {
            try {
                Iterator it = b(arrayList, intent.getType()).iterator();
                while (it.hasNext()) {
                    PendingAttachmentData pendingAttachmentData = (PendingAttachmentData) it.next();
                    aozy createBuilder = amoq.a.createBuilder();
                    aozy createBuilder2 = ampm.a.createBuilder();
                    String U = pendingAttachmentData.U();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    ampm ampmVar = (ampm) createBuilder2.b;
                    U.getClass();
                    ampmVar.b |= 8;
                    ampmVar.g = U;
                    aaui.i(createBuilder, createBuilder2, pendingAttachmentData.m(), pendingAttachmentData.M());
                    pendingAttachmentData.f = (amoq) createBuilder.s();
                    k.aH(pendingAttachmentData);
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        messageCoreData = k;
        if (messageCoreData != null && stringExtra != null && booleanExtra) {
            messageCoreData.bt(stringExtra);
        }
        return messageCoreData;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList b(java.util.ArrayList r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rvq.b(java.util.ArrayList, java.lang.String):java.util.ArrayList");
    }
}
