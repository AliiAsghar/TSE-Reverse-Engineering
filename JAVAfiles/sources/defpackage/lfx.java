package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.LruCache;
import com.google.android.apps.messaging.multishare.viewmodel.MultiShareViewModel;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfx {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public lfx(Context context, arpi arpiVar, jxv jxvVar, lkd lkdVar, Conversation conversation, obk obkVar) {
        context.getClass();
        arpiVar.getClass();
        lkdVar.getClass();
        conversation.getClass();
        obkVar.getClass();
        this.a = context;
        this.h = arpiVar;
        this.e = jxvVar;
        this.d = lkdVar;
        this.g = conversation;
        this.f = obkVar;
        this.b = new LruCache(100);
        this.c = conversation.b();
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [arpi, java.lang.Object] */
    public final qkg a(arwe arweVar, kay kayVar) {
        ascd ascdVar;
        aeki aekiVar = new aeki(new aeje(kayVar.c), new aekh((byte[]) null), kayVar.c, kayVar.b, new jkq(this, kayVar, 16, null), new jkq(this, kayVar, 17, null));
        Uri uri = kayVar.a.a;
        uri.getClass();
        miz mizVar = kayVar.d;
        kaz kazVar = new kaz(mizVar.b(), uri);
        if (!((LruCache) this.b).snapshot().containsKey(kazVar)) {
            ((LruCache) this.b).put(kazVar, ascy.a(aekiVar));
        }
        if (((ascd) ((LruCache) this.b).get(kazVar)) != null) {
            ascdVar = (ascd) ((LruCache) this.b).get(kazVar);
        } else {
            ascd a = ascy.a(aekiVar);
            ((LruCache) this.b).put(kazVar, a);
            ascdVar = a;
        }
        qjh.l(arweVar, this.h, new kba(ascdVar, this, uri, kayVar, mizVar, null), 2);
        ascdVar.getClass();
        return qkq.j(ascdVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [alhr, java.lang.Object] */
    public final mxe b() {
        return (mxe) this.g.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [alhr, java.lang.Object] */
    public final ncq c() {
        return (ncq) this.e.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, mjg] */
    /* JADX WARN: Type inference failed for: r1v4, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [alhr, java.lang.Object] */
    public final akul d(final mjq mjqVar, final myr myrVar, final alog alogVar, MessageId messageId, final MessageId messageId2, final mvw mvwVar, final amgj amgjVar, final atok atokVar, final List list) {
        akul ag;
        final long epochMilli = ((xnv) this.f.b()).f().toEpochMilli();
        final long a = ((xnv) this.f.b()).a();
        final akul b = ((ncq) this.e.get()).b();
        if (messageId != null) {
            ag = this.a.j(messageId);
        } else {
            ag = aktp.ag(null);
        }
        final akul akulVar = ag;
        return aktp.an(b, akulVar).i(new ancr() { // from class: mvz
            /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
            @Override // defpackage.ancr
            public final ListenableFuture a() {
                mzg mzgVar = (mzg) lfx.this.h.b();
                mwc mwcVar = (mwc) albo.bQ(b);
                miz mizVar = (miz) albo.bQ(akulVar);
                MessageId messageId3 = messageId2;
                mvw mvwVar2 = mvwVar;
                amgj amgjVar2 = amgjVar;
                long j = epochMilli;
                long j2 = a;
                return mzgVar.c(mjqVar, mwcVar, myrVar, alogVar, mizVar, messageId3, mvwVar2, amgjVar2, j, j2, atokVar, list);
            }
        }, this.c);
    }

    public lfx(apwt apwtVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6) {
        apwtVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        this.a = apwtVar;
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
        this.e = armfVar4;
        this.f = armfVar5;
        this.g = armfVar6;
        cg cgVar = (cg) armfVar.b();
        arml b = armd.b(3, new kjm(new kjm(cgVar, 16), 17));
        int i = arsc.a;
        this.h = new eot(new arrh(MultiShareViewModel.class), new kjm(b, 18), new kfq(cgVar, b, 10), new kjm(b, 19));
    }

    public lfx(anen anenVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, apwt apwtVar, armf armfVar7, BugleConversationId bugleConversationId, ncq ncqVar, ncq ncqVar2, mjg mjgVar) {
        this.c = anenVar;
        this.h = armfVar4;
        this.f = apwtVar;
        this.a = mjgVar;
        this.b = albo.D(new mrf(armfVar, armfVar2, bugleConversationId, ncqVar2, 15));
        this.e = albo.D(new ubi(armfVar, armfVar3, bugleConversationId, ncqVar, ncqVar2, armfVar7, 1));
        this.d = albo.D(new msp(this, armfVar5, 14));
        this.g = albo.D(new mrf(this, armfVar6, bugleConversationId, ncqVar, 16));
    }
}
