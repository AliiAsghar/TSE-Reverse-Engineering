package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lgg {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public lgg(Context context, wyp wypVar, ydf ydfVar, xnv xnvVar, ryr ryrVar) {
        this.e = context;
        this.d = wypVar;
        this.a = ydfVar;
        this.c = xnvVar;
        this.b = ryrVar;
    }

    public static void c(List list, List list2) {
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        Integer valueOf4;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
            tbt tbtVar = new tbt();
            tbtVar.aj("updateMessagePartsForResizingInTransaction");
            Uri w = messagePartCoreData.w();
            valueOf = Integer.valueOf(a.bp().c());
            int intValue = valueOf.intValue();
            valueOf2 = Integer.valueOf(a.bp().c());
            int intValue2 = valueOf2.intValue();
            if (intValue2 < 4020) {
                agnc.t("output_uri", intValue2);
            }
            if (intValue >= 4020) {
                if (w == null) {
                    tbtVar.a.putNull("output_uri");
                } else {
                    tbtVar.a.put("output_uri", w.toString());
                }
            }
            long p = messagePartCoreData.p();
            valueOf3 = Integer.valueOf(a.bp().c());
            int intValue3 = valueOf3.intValue();
            valueOf4 = Integer.valueOf(a.bp().c());
            int intValue4 = valueOf4.intValue();
            if (intValue4 < 4020) {
                agnc.t("target_size", intValue4);
            }
            if (intValue3 >= 4020) {
                tbtVar.a.put("target_size", Long.valueOf(p));
            }
            tbtVar.q(messagePartCoreData.I());
            tbtVar.v(new rbw(messagePartCoreData, 17));
            tbtVar.ag();
            if (tbtVar.a().e() > 0) {
                list2.add(messagePartCoreData);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ascd] */
    public final void a() {
        this.e.f(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    public final mbs b(armf armfVar) {
        xnv xnvVar = (xnv) this.b.b();
        xnvVar.getClass();
        alhr alhrVar = (alhr) this.e.b();
        alhrVar.getClass();
        ((anen) this.a.b()).getClass();
        return new mbs(this.c, armfVar, xnvVar, alhrVar, this.d);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [arwe, java.lang.Object] */
    public final akul d(Function function) {
        akul c;
        c = qjh.c(this.a, arpj.a, arwf.a, new qsk(this, function, (arpe) null, 2));
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.arqv r5, defpackage.arpe r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.qtd
            if (r0 == 0) goto L13
            r0 = r6
            qtd r0 = (defpackage.qtd) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            qtd r0 = new qtd
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.c
            arpl r1 = defpackage.arpl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.aqil.P(r6)
            goto L40
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.aqil.P(r6)
            java.util.Collection r6 = r4.f()
            java.util.Iterator r6 = r6.iterator()
            r2 = r5
            r5 = r6
        L40:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L57
            java.lang.Object r6 = r5.next()
            r0.a = r2
            r0.b = r5
            r0.d = r3
            java.lang.Object r6 = r2.a(r6, r0)
            if (r6 != r1) goto L40
            return r1
        L57:
            arnb r5 = defpackage.arnb.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgg.e(arqv, arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [osw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.concurrent.locks.Lock, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.concurrent.locks.Lock, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.Iterable] */
    public final Collection f() {
        if (this.e.a()) {
            Object b = this.c.b();
            b.getClass();
            ?? r1 = this.d;
            Set set = (Set) b;
            r1.lock();
            try {
                ?? r2 = this.b;
                r1.unlock();
                return aqjn.h(set, r2);
            } finally {
            }
        }
        this.d.lock();
        try {
            return this.b;
        } finally {
        }
    }

    public final void g(Consumer consumer) {
        Iterator it = f().iterator();
        while (it.hasNext()) {
            consumer.q(it.next());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.locks.Lock, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    public final void h(Object obj) {
        obj.getClass();
        ?? r0 = this.d;
        r0.lock();
        try {
            this.b.add(obj);
        } finally {
            r0.unlock();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.locks.Lock, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    public final void i(Object obj) {
        obj.getClass();
        ?? r0 = this.d;
        r0.lock();
        try {
            this.b.remove(obj);
        } finally {
            r0.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        if (r7 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(defpackage.arpe r7) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgg.j(arpe):java.lang.Object");
    }

    public lgg(Context context, arwe arweVar, lgd lgdVar) {
        context.getClass();
        arweVar.getClass();
        lgdVar.getClass();
        this.c = context;
        this.d = arweVar;
        this.b = lgdVar;
        this.e = ascy.a(null);
        this.a = new aeqa("", arnv.a, null, null, null, null, kek.m, 60);
    }

    public lgg(Context context, arwe arweVar, ghw ghwVar, jxv jxvVar) {
        context.getClass();
        arweVar.getClass();
        ghwVar.getClass();
        jxvVar.getClass();
        this.c = context;
        this.d = arweVar;
        String str = context.getString(R.string.disable_reason_empty_input) + " " + context.getString(R.string.compose_icon_send_content_description);
        this.b = str;
        this.a = context.getString(R.string.disable_reason_too_many_characters) + " " + context.getString(R.string.compose_icon_send_content_description);
        jdn jdnVar = new jdn(ghwVar.a, jxvVar.a, new lgx(this, (arpe) null, 0), 17, null);
        int i = ascp.a;
        this.e = arrn.T(jdnVar, arweVar, asco.b, new lgu(str));
    }

    public lgg(ljp ljpVar, lhm lhmVar, lig ligVar, lgg lggVar, izz izzVar) {
        ljpVar.getClass();
        lhmVar.getClass();
        ligVar.getClass();
        lggVar.getClass();
        izzVar.getClass();
        this.e = ljpVar;
        this.a = lhmVar;
        this.d = ligVar;
        this.c = lggVar;
        this.b = izzVar;
    }

    public lgg(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        armfVar.getClass();
        this.c = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.e = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
        armfVar5.getClass();
        this.a = armfVar5;
    }

    public lgg() {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "conversation_matcher_cache._id";
        a.c = new wsy();
        qpq qpqVar = new qpq(a.a());
        this.a = qpqVar;
        agmi a2 = agmk.a();
        a2.d = 1;
        a2.i(true);
        a2.c(true);
        a2.a = "conversation_matcher_cache.matcher_version";
        a2.e(true);
        a2.c = new wsy();
        qpq qpqVar2 = new qpq(a2.a());
        this.e = qpqVar2;
        agmi a3 = agmk.a();
        a3.d = 4;
        a3.i(true);
        a3.a = "conversation_matcher_cache.destination_key";
        a3.e(true);
        a3.c = new wsy();
        qpq qpqVar3 = new qpq(a3.a());
        this.b = qpqVar3;
        agmi a4 = agmk.a();
        a4.d = 1;
        a4.i(true);
        a4.c(true);
        a4.d(true);
        a4.b = new qaa(10);
        a4.a = "conversation_matcher_cache.conversation_id";
        a4.e(true);
        a4.c = new wsy();
        qpq qpqVar4 = new qpq(a4.a());
        this.c = qpqVar4;
        this.d = new qpq[]{qpqVar, qpqVar2, qpqVar3, qpqVar4};
    }

    public lgg(qso qsoVar, armf armfVar, armf armfVar2, ozk ozkVar, arwe arweVar) {
        qsoVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        arweVar.getClass();
        this.b = qsoVar;
        this.e = armfVar;
        this.a = armfVar2;
        this.c = ozkVar;
        this.d = arweVar;
    }

    public lgg(armf armfVar, arwe arweVar, osw oswVar) {
        armfVar.getClass();
        arweVar.getClass();
        this.c = armfVar;
        this.a = arweVar;
        this.e = oswVar;
        this.d = new ReentrantLock();
        if (oswVar.a()) {
            this.b = aqjn.az(arnv.a);
            return;
        }
        Object b = armfVar.b();
        b.getClass();
        this.b = aqjn.az((Collection) b);
    }
}
