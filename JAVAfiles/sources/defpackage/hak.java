package defpackage;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.Scope;
import j$.time.Duration;
import j$.util.Optional;
import java.io.File;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hak extends arpw implements arqv {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hak(alog alogVar, miu miuVar, miw miwVar, ConversationId conversationId, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.d = alogVar;
        this.b = miuVar;
        this.c = miwVar;
        this.e = conversationId;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.f) {
            case 0:
                return ((hak) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 1:
                return ((hak) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 2:
                return ((hak) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 3:
                return ((hak) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 4:
                return ((hak) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 5:
                return ((hak) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 6:
                return ((hak) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 7:
                return ((hak) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 8:
                return ((hak) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 9:
                return ((hak) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 10:
                return ((hak) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 11:
                return ((hak) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 12:
                return ((hak) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 13:
                return ((hak) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 14:
                return ((hak) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 15:
                return ((hak) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 16:
                return ((hak) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 17:
                return ((hak) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 18:
                return ((hak) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 19:
                return ((hak) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            default:
                return ((hak) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:239:0x06cc, code lost:
    
        if (r1 != r0) goto L197;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, arlq] */
    /* JADX WARN: Type inference failed for: r1v207, types: [java.lang.Object, arqv] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v78, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v85, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v92, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [miu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, miw] */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    @Override // defpackage.arpq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 2046
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hak.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r10v6, types: [asai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, arqv] */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r4v11, types: [com.google.android.apps.messaging.shared.api.messaging.MessageId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [miu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, miw] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, afcq] */
    /* JADX WARN: Type inference failed for: r6v2, types: [gsq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, arlq] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        switch (this.f) {
            case 0:
                Object obj2 = this.b;
                Object obj3 = this.c;
                return new hak((hgi) obj2, (gys) obj3, (AtomicInteger) this.d, (ListenableFuture) this.e, arpeVar, 0);
            case 1:
                Object obj4 = this.e;
                return new hak((gsx) obj4, (gys) this.d, (gsq) this.c, (Context) this.b, arpeVar, 1);
            case 2:
                Object obj5 = this.d;
                Object obj6 = this.b;
                return new hak((ConstraintTrackingWorker) obj5, (gsx) obj6, (hgi) this.c, (gys) this.e, arpeVar, 2);
            case 3:
                Object obj7 = this.b;
                return new hak((idb) obj7, (abmw) this.c, (arlq) this.e, (Duration) this.d, arpeVar, 3);
            case 4:
                return new hak((alog) this.d, (miu) this.b, (miw) this.c, (ConversationId) this.e, arpeVar, 4);
            case 5:
                return new hak((jpm) this.b, this.d, this.e, arpeVar, 5);
            case 6:
                Object obj8 = this.e;
                Object obj9 = this.b;
                return new hak((jrr) obj8, (jgz) obj9, (jnd) this.c, (String) this.d, arpeVar, 6);
            case 7:
                Object obj10 = this.b;
                return new hak((jmt) obj10, (nei) this.c, (afcq) this.e, (arqr) this.d, arpeVar, 7);
            case 8:
                return new hak((asai) this.d, (lrc) this.c, (jzf) this.b, (arsb) this.e, arpeVar, 8);
            case 9:
                ?? r3 = this.d;
                ?? r4 = this.c;
                Object obj11 = this.e;
                return new hak((ascd) r3, (MessageId) r4, (aers) obj11, (kcr) this.b, arpeVar, 9);
            case 10:
                return new hak((ascd) this.d, (MessageId) this.e, (kep) this.c, (ken) this.b, arpeVar, 10);
            case 11:
                Object obj12 = this.c;
                Object obj13 = this.e;
                return new hak((lhe) obj12, (ahqq) obj13, (jhc) this.b, (atok) this.d, arpeVar, 11);
            case 12:
                Object obj14 = this.d;
                Object obj15 = this.c;
                return new hak((UUID) obj14, (lvu) obj15, (File) this.e, (icg) this.b, arpeVar, 12);
            case 13:
                Object obj16 = this.c;
                Object obj17 = this.d;
                return new hak((lwh) obj16, (UUID) obj17, (File) this.e, (icg) this.b, arpeVar, 13);
            case 14:
                Object obj18 = this.c;
                Object obj19 = this.b;
                return new hak((lxo) obj18, (ParcelFileDescriptor) obj19, (abmp) this.e, (aozb) this.d, arpeVar, 14);
            case 15:
                Object obj20 = this.c;
                Object obj21 = this.b;
                return new hak((lxo) obj20, (ParcelFileDescriptor) obj21, (abmp) this.e, (aozb) this.d, arpeVar, 15, null);
            case 16:
                Object obj22 = this.b;
                Object obj23 = this.e;
                return new hak((mpu) obj22, (Optional) obj23, (alog) this.c, (String) this.d, arpeVar, 16);
            case 17:
                return new hak((arqv) this.e, this.b, this.c, (arsb) this.d, arpeVar, 17);
            case 18:
                Object obj24 = this.e;
                Object obj25 = this.b;
                return new hak((rcr) obj24, (rbu) obj25, (rdq) this.c, (amra) this.d, arpeVar, 18);
            case 19:
                Object obj26 = this.c;
                Object obj27 = this.e;
                return new hak((reb) obj26, (rut) obj27, (rdq) this.b, (amra) this.d, arpeVar, 19);
            default:
                Object obj28 = this.c;
                Object obj29 = this.d;
                return new hak((twn) obj28, (String) obj29, (twm) this.b, (Scope) this.e, arpeVar, 20);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hak(ConstraintTrackingWorker constraintTrackingWorker, gsx gsxVar, hgi hgiVar, gys gysVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.d = constraintTrackingWorker;
        this.b = gsxVar;
        this.c = hgiVar;
        this.e = gysVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hak(arqv arqvVar, Object obj, Object obj2, arsb arsbVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.e = arqvVar;
        this.b = obj;
        this.c = obj2;
        this.d = arsbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hak(asai asaiVar, lrc lrcVar, jzf jzfVar, arsb arsbVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.d = asaiVar;
        this.c = lrcVar;
        this.b = jzfVar;
        this.e = arsbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hak(ascd ascdVar, MessageId messageId, aers aersVar, kcr kcrVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.d = ascdVar;
        this.c = messageId;
        this.e = aersVar;
        this.b = kcrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hak(ascd ascdVar, MessageId messageId, kep kepVar, ken kenVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.d = ascdVar;
        this.e = messageId;
        this.c = kepVar;
        this.b = kenVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hak(gsx gsxVar, gys gysVar, gsq gsqVar, Context context, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.e = gsxVar;
        this.d = gysVar;
        this.c = gsqVar;
        this.b = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hak(hgi hgiVar, gys gysVar, AtomicInteger atomicInteger, ListenableFuture listenableFuture, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.b = hgiVar;
        this.c = gysVar;
        this.d = atomicInteger;
        this.e = listenableFuture;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hak(idb idbVar, abmw abmwVar, arlq arlqVar, Duration duration, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.b = idbVar;
        this.c = abmwVar;
        this.e = arlqVar;
        this.d = duration;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hak(UUID uuid, lvu lvuVar, File file, icg icgVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.d = uuid;
        this.c = lvuVar;
        this.e = file;
        this.b = icgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hak(jmt jmtVar, nei neiVar, afcq afcqVar, arqr arqrVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.b = jmtVar;
        this.c = neiVar;
        this.e = afcqVar;
        this.d = arqrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hak(jpm jpmVar, arqr arqrVar, arqr arqrVar2, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.b = jpmVar;
        this.c = "ConversationDraftPersistence.saveDiff";
        this.d = arqrVar;
        this.e = arqrVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hak(jrr jrrVar, jgz jgzVar, jnd jndVar, String str, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.e = jrrVar;
        this.b = jgzVar;
        this.c = jndVar;
        this.d = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hak(lhe lheVar, ahqq ahqqVar, jhc jhcVar, atok atokVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.c = lheVar;
        this.e = ahqqVar;
        this.b = jhcVar;
        this.d = atokVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hak(lwh lwhVar, UUID uuid, File file, icg icgVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.c = lwhVar;
        this.d = uuid;
        this.e = file;
        this.b = icgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hak(lxo lxoVar, ParcelFileDescriptor parcelFileDescriptor, abmp abmpVar, aozb aozbVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.c = lxoVar;
        this.b = parcelFileDescriptor;
        this.e = abmpVar;
        this.d = aozbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hak(lxo lxoVar, ParcelFileDescriptor parcelFileDescriptor, abmp abmpVar, aozb aozbVar, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.f = i;
        this.c = lxoVar;
        this.b = parcelFileDescriptor;
        this.e = abmpVar;
        this.d = aozbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hak(mpu mpuVar, Optional optional, alog alogVar, String str, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.b = mpuVar;
        this.e = optional;
        this.c = alogVar;
        this.d = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hak(rcr rcrVar, rbu rbuVar, rdq rdqVar, amra amraVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.e = rcrVar;
        this.b = rbuVar;
        this.c = rdqVar;
        this.d = amraVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hak(reb rebVar, rut rutVar, rdq rdqVar, amra amraVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.c = rebVar;
        this.e = rutVar;
        this.b = rdqVar;
        this.d = amraVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hak(twn twnVar, String str, twm twmVar, Scope scope, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.f = i;
        this.c = twnVar;
        this.d = str;
        this.b = twmVar;
        this.e = scope;
    }
}
