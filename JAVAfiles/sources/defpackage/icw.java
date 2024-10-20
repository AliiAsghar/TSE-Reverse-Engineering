package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Instant;
import java.io.File;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class icw extends arpw implements arqv {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icw(aenr aenrVar, byn bynVar, byn bynVar2, byn bynVar3, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.e = i;
        this.a = aenrVar;
        this.d = bynVar;
        this.c = bynVar2;
        this.b = bynVar3;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((icw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 1:
                return ((icw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 2:
                return ((icw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((icw) c(bool, (arpe) obj2)).b(arnb.a);
            case 4:
                return ((icw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 5:
                return ((icw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 6:
                return ((icw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 7:
                return ((icw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 8:
                return ((icw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 9:
                return ((icw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 10:
                return ((icw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 11:
                return ((icw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            default:
                return ((icw) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04bf A[Catch: Exception -> 0x04c6, TryCatch #5 {Exception -> 0x04c6, blocks: (B:119:0x0494, B:125:0x04b8, B:128:0x04c3, B:131:0x04bf), top: B:118:0x0494 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018a  */
    /* JADX WARN: Type inference failed for: r0v108, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v131, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v142, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v162, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v163, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v164, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v170, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v171, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v172, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [khb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, agak] */
    /* JADX WARN: Type inference failed for: r0v63, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, mnk] */
    /* JADX WARN: Type inference failed for: r0v90, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v26, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v60, types: [java.lang.Object, mnk] */
    /* JADX WARN: Type inference failed for: r2v62, types: [com.google.android.apps.messaging.shared.api.messaging.Conversation, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v82, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v98, types: [afdz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v27, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.google.android.apps.messaging.shared.api.messaging.Conversation, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [asai, java.lang.Object] */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 1398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.icw.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [afdz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.google.android.apps.messaging.shared.api.messaging.Conversation, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, mnk] */
    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [khb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, agak] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        switch (this.e) {
            case 0:
                Object obj2 = this.a;
                Object obj3 = this.b;
                return new icw((arrx) obj2, (idb) obj3, (icg) this.c, (aqsm) this.d, arpeVar, 0);
            case 1:
                Object obj4 = this.b;
                Object obj5 = this.c;
                return new icw((hbb) obj4, (Context) obj5, (String) this.d, (String) this.a, arpeVar, 1);
            case 2:
                Object obj6 = this.b;
                Object obj7 = this.c;
                return new icw((sjr) obj6, (iql) obj7, (Instant) this.a, (Instant) this.d, arpeVar, 2);
            case 3:
                Object obj8 = this.c;
                return new icw((gpx) obj8, (kkc) this.a, (khb) this.d, (lfl) this.b, arpeVar, 3);
            case 4:
                Object obj9 = this.d;
                return new icw((enf) obj9, (cit) this.b, (agak) this.a, (View) this.c, arpeVar, 4);
            case 5:
                Object obj10 = this.a;
                Object obj11 = this.b;
                return new icw((UUID) obj10, (lvu) obj11, (File) this.d, (icl) this.c, arpeVar, 5);
            case 6:
                Object obj12 = this.b;
                Object obj13 = this.a;
                return new icw((lwh) obj12, (UUID) obj13, (File) this.d, (icl) this.c, arpeVar, 6);
            case 7:
                return new icw((mnl) this.d, (Conversation) this.c, (mnk) this.b, (Recipient) this.a, arpeVar, 7);
            case 8:
                Object obj14 = this.b;
                Object obj15 = this.c;
                return new icw((pyz) obj14, (Uri) obj15, (pzy) this.d, (String) this.a, arpeVar, 8);
            case 9:
                Object obj16 = this.d;
                Object obj17 = this.c;
                return new icw((wyp) obj16, (ConversationIdType) obj17, (String) this.a, (MessageIdType) this.b, arpeVar, 9);
            case 10:
                return new icw((aeoa) this.a, (byn) this.d, (byn) this.c, (byn) this.b, arpeVar, 10);
            case 11:
                return new icw((aenr) this.a, (byn) this.d, (byn) this.c, (byn) this.b, arpeVar, 11);
            default:
                Object obj18 = this.d;
                ?? r2 = this.a;
                Object obj19 = this.c;
                return new icw((afdv) obj18, (afdz) r2, (Uri) obj19, (Bundle) this.b, arpeVar, 12);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icw(aeoa aeoaVar, byn bynVar, byn bynVar2, byn bynVar3, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.e = i;
        this.a = aeoaVar;
        this.d = bynVar;
        this.c = bynVar2;
        this.b = bynVar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icw(afdv afdvVar, afdz afdzVar, Uri uri, Bundle bundle, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.e = i;
        this.d = afdvVar;
        this.a = afdzVar;
        this.c = uri;
        this.b = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icw(arrx arrxVar, idb idbVar, icg icgVar, aqsm aqsmVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.e = i;
        this.a = arrxVar;
        this.b = idbVar;
        this.c = icgVar;
        this.d = aqsmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icw(enf enfVar, cit citVar, agak agakVar, View view, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.e = i;
        this.d = enfVar;
        this.b = citVar;
        this.a = agakVar;
        this.c = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icw(gpx gpxVar, kkc kkcVar, khb khbVar, lfl lflVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.e = i;
        this.c = gpxVar;
        this.a = kkcVar;
        this.d = khbVar;
        this.b = lflVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icw(hbb hbbVar, Context context, String str, String str2, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.e = i;
        this.b = hbbVar;
        this.c = context;
        this.d = str;
        this.a = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icw(UUID uuid, lvu lvuVar, File file, icl iclVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.e = i;
        this.a = uuid;
        this.b = lvuVar;
        this.d = file;
        this.c = iclVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icw(lwh lwhVar, UUID uuid, File file, icl iclVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.e = i;
        this.b = lwhVar;
        this.a = uuid;
        this.d = file;
        this.c = iclVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icw(mnl mnlVar, Conversation conversation, mnk mnkVar, Recipient recipient, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.e = i;
        this.d = mnlVar;
        this.c = conversation;
        this.b = mnkVar;
        this.a = recipient;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icw(pyz pyzVar, Uri uri, pzy pzyVar, String str, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.e = i;
        this.b = pyzVar;
        this.c = uri;
        this.d = pzyVar;
        this.a = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icw(sjr sjrVar, iql iqlVar, Instant instant, Instant instant2, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.e = i;
        this.b = sjrVar;
        this.c = iqlVar;
        this.a = instant;
        this.d = instant2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icw(wyp wypVar, ConversationIdType conversationIdType, String str, MessageIdType messageIdType, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.e = i;
        this.d = wypVar;
        this.c = conversationIdType;
        this.a = str;
        this.b = messageIdType;
    }
}
