package defpackage;

import android.content.Context;
import android.content.Intent;
import android.telephony.SmsMessage;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahmv {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public ahmv(Context context, armf armfVar, mbl mblVar, ydh ydhVar, yfo yfoVar, uff uffVar, armf armfVar2, wfh wfhVar, xnv xnvVar) {
        this.i = context;
        this.b = armfVar;
        this.e = mblVar;
        this.g = ydhVar;
        this.a = yfoVar;
        this.f = uffVar;
        this.d = armfVar2;
        this.c = wfhVar;
        this.h = xnvVar;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    public final ahmu a(Executor executor, apwt apwtVar, armf armfVar) {
        ahms ahmsVar = (ahms) this.a.b();
        ahmsVar.getClass();
        ahkj ahkjVar = (ahkj) this.c.b();
        ahkjVar.getClass();
        adec adecVar = (adec) this.d.b();
        adecVar.getClass();
        algw algwVar = (algw) this.f.b();
        algwVar.getClass();
        algw algwVar2 = (algw) ((apxx) this.g).a;
        algw algwVar3 = (algw) this.h.b();
        algwVar3.getClass();
        executor.getClass();
        apwtVar.getClass();
        return new ahmu(ahmsVar, this.b, ahkjVar, adecVar, this.e, algwVar, algwVar2, algwVar3, this.i, executor, apwtVar, armfVar);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [armf, java.lang.Object] */
    public final void b(cg cgVar) {
        ((xnv) this.h).f().toEpochMilli();
        if (((wfh) this.c).L()) {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            intent.putExtra("mimeTypes", rvr.c);
            intent.putExtra("android.intent.extra.LOCAL_ONLY", false);
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            cgVar.startActivityForResult(intent, 1400);
            return;
        }
        Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
        intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*"});
        intent2.putExtra("mimeTypes", rvr.a);
        intent2.putExtra("android.intent.extra.LOCAL_ONLY", false);
        intent2.addCategory("android.intent.category.OPENABLE");
        intent2.setType("image/*");
        cgVar.startActivityForResult(intent2, 1400);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [arwe, java.lang.Object] */
    public final void c(MessageIdType messageIdType) {
        qjh.l(this.i, null, new aafa(this, messageIdType, (arpe) null, 2), 3);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, tqx] */
    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [armf, java.lang.Object] */
    public final void d(ConversationIdType conversationIdType, int i, MessageIdType messageIdType) {
        MessageCoreData messageCoreData;
        long epochMilli;
        if (!messageIdType.b()) {
            messageCoreData = ((rwd) this.c.b()).q(messageIdType);
        } else {
            messageCoreData = null;
        }
        if (messageCoreData != null || ((odl) this.f.b()).a()) {
            ?? r0 = this.a;
            if (messageCoreData != null) {
                epochMilli = messageCoreData.n() + 1;
            } else {
                epochMilli = ((xnv) this.e.b()).f().toEpochMilli();
            }
            MessageCoreData n = r0.n(conversationIdType, i, epochMilli);
            if (messageCoreData != null && !messageCoreData.cA()) {
                n.bp(false);
            }
            ((rvw) this.g.b()).a(n);
            if (i == 232) {
                ((Optional) ((apxx) this.d).a).ifPresent(new aagi(yzm.q, 4));
            }
        }
    }

    public final aeqa e(alog alogVar, nfw nfwVar, lrc lrcVar, ascd ascdVar) {
        String string = ((Context) this.h).getString(R.string.sim_selector_dialog_title);
        string.getClass();
        ArrayList arrayList = new ArrayList(aqjn.J(alogVar, 10));
        Iterator<E> it = alogVar.iterator();
        while (it.hasNext()) {
            nfw nfwVar2 = (nfw) it.next();
            nfwVar2.getClass();
            arrayList.add(new aeta(f(nfwVar2), nfwVar2.k(), nfwVar2.j(), d.F(nfwVar2, nfwVar), nfwVar2.p(), new zdh(ascdVar, nfwVar2, 7)));
        }
        String string2 = ((Context) this.h).getString(R.string.sim_selector_dialog_confirm);
        string2.getClass();
        aewr aewrVar = new aewr(string2, new kdt((Object) lrcVar, (Object) this, (Object) ascdVar, 18, (byte[]) null));
        String string3 = ((Context) this.h).getString(R.string.sim_selector_dialog_dismiss);
        string3.getClass();
        return new aeqa(string, arrayList, null, null, aewrVar, new aewr(string3, new yyy(lrcVar, 17)), null, 76);
    }

    public final aeyo f(nfw nfwVar) {
        int ba;
        char h = arro.h(((yjy) this.g).h(nfwVar.b()).d() + 1);
        if (nfwVar.a() == 0) {
            ba = ((Context) this.h).getColor(R.color.sim_icon_text_color);
        } else {
            ba = adom.ba((Context) this.h, nfwVar.a());
        }
        return new aeyo(h, ba);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, okf] */
    public final nfw g() {
        if (this.g.a()) {
            return (nfw) ((zeo) this.a).e.c();
        }
        return null;
    }

    public final arqg h(voo vooVar, msh mshVar, zem zemVar) {
        mshVar.getClass();
        return new zdh(this, new jda(this, vooVar, mshVar, zemVar, 16, (short[]) null), 3, null);
    }

    public final arqg i(mkl mklVar, zem zemVar) {
        mklVar.getClass();
        zemVar.getClass();
        return new zdh(this, new kdt((Object) this, (Object) mklVar, zemVar, 16), 3, null);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [arwe, java.lang.Object] */
    public final void j(MessageCoreData messageCoreData, Integer num) {
        messageCoreData.getClass();
        if (!yqt.a().booleanValue() && ((Set) this.i.b()).isEmpty()) {
            return;
        }
        akrh e = aktp.e("IncomingMessageSpamProtectionEntrypoint.checkIfIncomingMessageIsSpam");
        try {
            qjh.l(this.b, null, new wfj(this, messageCoreData, num, (arpe) null, 2), 3);
            armd.i(e, null);
        } finally {
        }
    }

    public final int k() {
        return ((AtomicInteger) this.g).get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [armf, java.lang.Object] */
    public final void l(int i, String str) {
        boolean z;
        xyl.h();
        boolean b = ((xav) this.d.b()).b(str);
        boolean z2 = false;
        if (((xbi) this.b.b()).e(i) && b) {
            z = true;
        } else {
            z = false;
        }
        int[] calculateLength = SmsMessage.calculateLength(str, z);
        ((AtomicInteger) this.g).set(calculateLength[0]);
        ((AtomicInteger) this.f).set(calculateLength[1]);
        ((AtomicInteger) this.e).set(calculateLength[2]);
        xbe a = ((xbf) this.c.b()).a(i);
        int a2 = ((xbi) this.b.b()).a(i);
        Object obj = this.a;
        if (a2 > 0 && ((AtomicInteger) this.g).get() > a2) {
            z2 = true;
        }
        ((AtomicBoolean) obj).set(z2);
        Object obj2 = this.h;
        if (a2 <= 0) {
            a2 = Integer.MAX_VALUE;
        }
        ((AtomicInteger) obj2).set(a2);
        int h = a.h();
        if (h > 0) {
            int i2 = calculateLength[1];
            if (((AtomicInteger) this.e).get() + i2 < 140) {
                h >>= 1;
            }
            if (i2 > h) {
                ((AtomicBoolean) this.a).set(true);
            }
        }
    }

    public final boolean m() {
        return ((AtomicBoolean) this.a).get();
    }

    public ahmv(anen anenVar, anen anenVar2, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7) {
        this.a = anenVar;
        this.i = anenVar2;
        this.e = armfVar;
        this.c = armfVar2;
        this.g = armfVar3;
        this.b = armfVar4;
        this.h = armfVar5;
        this.f = armfVar6;
        this.d = armfVar7;
    }

    public ahmv(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
        armfVar5.getClass();
        this.e = armfVar5;
        armfVar6.getClass();
        this.f = armfVar6;
        armfVar7.getClass();
        this.g = armfVar7;
        armfVar8.getClass();
        this.h = armfVar8;
        armfVar9.getClass();
        this.i = armfVar9;
    }

    public ahmv(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        armfVar.getClass();
        this.c = armfVar;
        armfVar2.getClass();
        this.d = armfVar2;
        armfVar3.getClass();
        this.b = armfVar3;
        armfVar4.getClass();
        this.g = armfVar4;
        armfVar5.getClass();
        this.e = armfVar5;
        armfVar6.getClass();
        this.f = armfVar6;
        armfVar7.getClass();
        this.i = armfVar7;
        armfVar8.getClass();
        this.a = armfVar8;
        armfVar9.getClass();
        this.h = armfVar9;
    }

    public ahmv(byte[] bArr, byte[] bArr2) {
        agmi a = agmk.a();
        a.d = 4;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "cms_notifications.cms_id";
        a.c = new wsy();
        sib sibVar = new sib(a.a());
        this.e = sibVar;
        agmi a2 = agmk.a();
        a2.d = 2;
        a2.a = "cms_notifications.cms_last_mod_seq";
        a2.c = new wsy();
        sib sibVar2 = new sib(a2.a());
        this.f = sibVar2;
        agmi a3 = agmk.a();
        a3.d = 4;
        a3.a = "cms_notifications.cms_correlation_id";
        a3.c = new wsy();
        sib sibVar3 = new sib(a3.a());
        this.i = sibVar3;
        agmi a4 = agmk.a();
        a4.d = 4;
        a4.a = "cms_notifications.from_address";
        a4.c = new wsy();
        sib sibVar4 = new sib(a4.a());
        this.g = sibVar4;
        agmi a5 = agmk.a();
        a5.d = 4;
        a5.a = "cms_notifications.to_address";
        a5.c = new wsy();
        sib sibVar5 = new sib(a5.a());
        this.b = sibVar5;
        agmi a6 = agmk.a();
        a6.d = 4;
        a6.c(true);
        a6.a = "cms_notifications.correlation_text";
        a6.c = new wsy();
        sib sibVar6 = new sib(a6.a());
        this.h = sibVar6;
        agmi a7 = agmk.a();
        a7.d = 2;
        a7.a = "cms_notifications.modified_at_timestamp";
        a7.c = new wsy();
        sib sibVar7 = new sib(a7.a());
        this.c = sibVar7;
        agmi a8 = agmk.a();
        a8.d = 2;
        a8.a = "cms_notifications.message_received_timestamp";
        a8.c = new wsy();
        sib sibVar8 = new sib(a8.a());
        this.a = sibVar8;
        this.d = new sib[]{sibVar, sibVar2, sibVar3, sibVar4, sibVar5, sibVar6, sibVar7, sibVar8};
    }

    public ahmv(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.e = armfVar;
        armfVar2.getClass();
        this.i = armfVar2;
        armfVar3.getClass();
        this.g = armfVar3;
        armfVar4.getClass();
        this.f = armfVar4;
        armfVar5.getClass();
        this.a = armfVar5;
        armfVar6.getClass();
        this.b = armfVar6;
        armfVar7.getClass();
        this.h = armfVar7;
        this.c = armfVar8;
        this.d = armfVar9;
    }

    public ahmv(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, byte[] bArr) {
        armfVar.getClass();
        this.g = armfVar;
        armfVar2.getClass();
        this.c = armfVar2;
        armfVar3.getClass();
        this.h = armfVar3;
        armfVar4.getClass();
        this.e = armfVar4;
        armfVar5.getClass();
        this.b = armfVar5;
        armfVar6.getClass();
        this.a = armfVar6;
        armfVar7.getClass();
        this.d = armfVar7;
        armfVar8.getClass();
        this.f = armfVar8;
        armfVar9.getClass();
        this.i = armfVar9;
    }

    public ahmv(byte[] bArr) {
        agmi a = agmk.a();
        a.d = 2;
        a.j(true);
        a.f(true);
        a.c(true);
        a.a = "cms_status._id";
        a.c = new wsy();
        sip sipVar = new sip(a.a());
        this.b = sipVar;
        agmi a2 = agmk.a();
        a2.d = 1;
        a2.a = "cms_status.table_type";
        a2.c = new wsy();
        sip sipVar2 = new sip(a2.a());
        this.a = sipVar2;
        agmi a3 = agmk.a();
        a3.d = 4;
        a3.a = "cms_status.item_id";
        a3.c = new wsy();
        sip sipVar3 = new sip(a3.a());
        this.h = sipVar3;
        agmi a4 = agmk.a();
        a4.d = 4;
        a4.a = "cms_status.cms_id";
        a4.c = new wsy();
        sip sipVar4 = new sip(a4.a());
        this.e = sipVar4;
        agmi a5 = agmk.a();
        a5.d = 1;
        a5.a = "cms_status.timestamp";
        a5.c = new wsy();
        sip sipVar5 = new sip(a5.a());
        this.c = sipVar5;
        agmi a6 = agmk.a();
        a6.d = 1;
        a6.a = "cms_status.event_type";
        a6.c = new wsy();
        sip sipVar6 = new sip(a6.a());
        this.f = sipVar6;
        agmi a7 = agmk.a();
        a7.d = 4;
        a7.a = "cms_status.status";
        a7.c = new wsy();
        sip sipVar7 = new sip(a7.a());
        this.g = sipVar7;
        agmi a8 = agmk.a();
        a8.d = 1;
        a8.a = "cms_status.attempt_number";
        a8.c = new wsy();
        sip sipVar8 = new sip(a8.a());
        this.i = sipVar8;
        this.d = new sip[]{sipVar, sipVar2, sipVar3, sipVar4, sipVar5, sipVar6, sipVar7, sipVar8};
    }

    public ahmv() {
        agmi a = agmk.a();
        a.d = 1;
        a.j(true);
        a.f(true);
        a.c(true);
        a.d(true);
        a.b = new wso(18);
        a.a = "file_transfer.message_id";
        a.c = new wsy();
        xoy xoyVar = new xoy(a.a());
        this.h = xoyVar;
        agmi a2 = agmk.a();
        a2.d = 4;
        a2.c(true);
        a2.a = "file_transfer.transfer_id";
        a2.c = new wsy();
        xoy xoyVar2 = new xoy(a2.a());
        this.b = xoyVar2;
        agmi a3 = agmk.a();
        a3.d = 1;
        a3.a = "file_transfer.transfer_type";
        a3.c = new wsy();
        xoy xoyVar3 = new xoy(a3.a());
        this.d = xoyVar3;
        agmi a4 = agmk.a();
        a4.d = 5;
        a4.a = "file_transfer.attachment_upload_response";
        a4.c = new wsy();
        xoy xoyVar4 = new xoy(a4.a());
        this.e = xoyVar4;
        agmi a5 = agmk.a();
        a5.d = 5;
        a5.a = "file_transfer.file_information";
        a5.c = new wsy();
        xoy xoyVar5 = new xoy(a5.a());
        this.f = xoyVar5;
        agmi a6 = agmk.a();
        a6.d = 5;
        a6.a = "file_transfer.thumbnail_information";
        a6.c = new wsy();
        xoy xoyVar6 = new xoy(a6.a());
        this.a = xoyVar6;
        agmi a7 = agmk.a();
        a7.d = 4;
        a7.a = "file_transfer.transfer_handle";
        a7.c = new wsy();
        xoy xoyVar7 = new xoy(a7.a());
        this.c = xoyVar7;
        agmi a8 = agmk.a();
        a8.d = 5;
        a8.a = "file_transfer.opaque_data";
        a8.c = new wsy();
        xoy xoyVar8 = new xoy(a8.a());
        this.g = xoyVar8;
        this.i = new xoy[]{xoyVar, xoyVar2, xoyVar3, xoyVar4, xoyVar5, xoyVar6, xoyVar7, xoyVar8};
    }

    public ahmv(Context context, armf armfVar, armf armfVar2, armf armfVar3) {
        this.a = new AtomicBoolean();
        this.g = new AtomicInteger();
        this.f = new AtomicInteger();
        AtomicInteger atomicInteger = new AtomicInteger();
        this.e = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        this.h = atomicInteger2;
        this.i = context;
        this.d = armfVar;
        this.b = armfVar2;
        this.c = armfVar3;
        atomicInteger.set(Integer.MAX_VALUE);
        atomicInteger2.set(Integer.MAX_VALUE);
    }

    public ahmv(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, arwe arweVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        armfVar8.getClass();
        arweVar.getClass();
        this.i = armfVar;
        this.e = armfVar2;
        this.h = armfVar3;
        this.d = armfVar4;
        this.f = armfVar5;
        this.g = armfVar6;
        this.a = armfVar7;
        this.c = armfVar8;
        this.b = arweVar;
    }

    public ahmv(zaw zawVar, zeh zehVar, yzk yzkVar, zbl zblVar, zap zapVar, lre lreVar, zbe zbeVar, znj znjVar, jxv jxvVar) {
        zawVar.getClass();
        zehVar.getClass();
        yzkVar.getClass();
        zblVar.getClass();
        zapVar.getClass();
        lreVar.getClass();
        zbeVar.getClass();
        znjVar.getClass();
        jxvVar.getClass();
        this.f = zawVar;
        this.b = zehVar;
        this.i = yzkVar;
        this.g = zblVar;
        this.e = zapVar;
        this.a = lreVar;
        this.h = zbeVar;
        this.d = znjVar;
        this.c = jxvVar;
    }

    public ahmv(arwe arweVar, zdy zdyVar, zen zenVar, zeo zeoVar, zcr zcrVar, zbk zbkVar, okf okfVar, armf armfVar, armf armfVar2) {
        arweVar.getClass();
        zdyVar.getClass();
        zenVar.getClass();
        zeoVar.getClass();
        zcrVar.getClass();
        zbkVar.getClass();
        okfVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.c = arweVar;
        this.e = zdyVar;
        this.f = zenVar;
        this.a = zeoVar;
        this.h = zcrVar;
        this.i = zbkVar;
        this.g = okfVar;
        this.d = armfVar;
        this.b = armfVar2;
    }

    public ahmv(Context context, zdy zdyVar, zen zenVar, zdi zdiVar, zbk zbkVar, armf armfVar, armf armfVar2, armf armfVar3) {
        context.getClass();
        zdyVar.getClass();
        zenVar.getClass();
        zdiVar.getClass();
        zbkVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        this.g = context;
        this.e = zdyVar;
        this.f = zenVar;
        this.h = zdiVar;
        this.i = zbkVar;
        this.d = armfVar;
        this.a = armfVar2;
        this.b = armfVar3;
        this.c = new jdn(zenVar.e, zdiVar.i, new igb(this, (arpe) null, 19), 17, null);
    }

    public ahmv(Context context, arwe arweVar, zeo zeoVar, nfx nfxVar, yjy yjyVar, lre lreVar, okf okfVar, zen zenVar) {
        asai aghwVar;
        context.getClass();
        arweVar.getClass();
        zeoVar.getClass();
        nfxVar.getClass();
        yjyVar.getClass();
        lreVar.getClass();
        okfVar.getClass();
        zenVar.getClass();
        this.h = context;
        this.d = arweVar;
        this.b = zeoVar;
        this.e = nfxVar;
        this.g = yjyVar;
        this.a = lreVar;
        this.f = okfVar;
        this.c = zenVar;
        if (okfVar.a()) {
            ascv ascvVar = zeoVar.e;
            ncq a = nfxVar.a();
            a.getClass();
            aghwVar = arrn.P(ascvVar, lga.as(a), zenVar.e, new jit(this, (arpe) null, 4));
        } else {
            aghwVar = new aghw(new zec(), 9);
        }
        this.i = aghwVar;
    }

    public ahmv(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, tqx tqxVar, nzq nzqVar, arwe arweVar, arpi arpiVar, armf armfVar5, armf armfVar6) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        tqxVar.getClass();
        nzqVar.getClass();
        arweVar.getClass();
        arpiVar.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        this.c = armfVar;
        this.g = armfVar2;
        this.b = armfVar3;
        this.d = armfVar4;
        this.a = tqxVar;
        this.h = nzqVar;
        this.i = arweVar;
        this.e = armfVar5;
        this.f = armfVar6;
    }
}
