package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mry implements alhr {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ mry(Object obj, boolean z, Object obj2, int i) {
        this.d = i;
        this.b = obj;
        this.a = z;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [mre, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [alhr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [msh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r6v3, types: [rtz, java.lang.Object] */
    @Override // defpackage.alhr
    public final Object get() {
        ConversationIdType j;
        agnw d;
        agnw d2;
        int i = this.d;
        if (i != 0) {
            boolean z = true;
            if (i != 1) {
                int i2 = 2;
                if (i != 2) {
                    boolean z2 = this.a;
                    ?? r4 = this.b;
                    Object obj = this.c;
                    if (!z2 && r4.E().i() && ((r4.cI() || r4.cS()) && !r4.cM())) {
                        r4.bR(((qdx) ((rvw) obj).c.b()).a());
                    }
                    rvw rvwVar = (rvw) obj;
                    MessageIdType b = rvwVar.b(r4);
                    xyl.r(b.a);
                    r4.bQ(b);
                    rwn F = r4.F();
                    if (F != null) {
                        String[] strArr = stt.a;
                        int i3 = ssv.a;
                        tpk tpkVar = new tpk((short[]) null);
                        tpkVar.i(b);
                        tpkVar.h(F.a);
                        stm g = tpkVar.g();
                        d = agnc.d("$primary");
                        d2 = agnc.d("$primary");
                        if (Long.valueOf(agnc.a(d2, "message_captions", g, new spl(d, 10), new rbc(20))).longValue() < 0) {
                            z = false;
                        }
                        d.s(z);
                    }
                    ((uhj) rvwVar.b.b()).j(r4.z(), b, new String[0]);
                    for (MessagePartCoreData messagePartCoreData : r4.W()) {
                        messagePartCoreData.aM(b);
                        rvwVar.c(messagePartCoreData, r4.z());
                    }
                    if (r4.cD() && ((rwv) rvwVar.e.b()).a().booleanValue()) {
                        rwv rwvVar = (rwv) rvwVar.e.b();
                        r4.getClass();
                        akrh e = aktp.e("OutgoingMessageInsertionListenersManager::onInsertInTransaction");
                        try {
                            Iterator it = rwvVar.b().iterator();
                            while (it.hasNext()) {
                                ((rwt) it.next()).fK();
                            }
                            armd.i(e, null);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                armd.i(e, th);
                                throw th2;
                            }
                        }
                    }
                    return b;
                }
                boolean booleanValue = ((Boolean) qpf.a.e()).booleanValue();
                ?? r6 = this.b;
                boolean z3 = this.a;
                Object obj2 = this.c;
                if (booleanValue) {
                    if (!z3) {
                        ruv ruvVar = (ruv) obj2;
                        if (ruvVar.o) {
                            vsi a = vsj.a();
                            a.h(true);
                            a.g(false);
                            a.n(amku.UNKNOWN_TRIGGER_SOURCE);
                            a.b(false);
                            a.i(ruvVar.f);
                            ruvVar.p.ifPresent(new rug(a, i2));
                            ruvVar.r.ifPresent(new rug(a, 3));
                            ruvVar.q.ifPresent(new rug(a, 4));
                            ruvVar.m.ifPresent(new rug(a, 5));
                            a.p(ruvVar.l);
                            rdc rdcVar = (rdc) ((rul) r6).l.b();
                            vsj a2 = a.a();
                            if (a2.d) {
                                j = ((vsh) rdcVar.a.b()).a(a2);
                            } else {
                                throw new IllegalArgumentException("isRcsGroup must be true.");
                            }
                        } else {
                            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                            vhf vhfVar = new vhf(atomicBoolean, obj2, 1, null);
                            Stream map = Collection.EL.stream(ruvVar.f).filter(new rsi(8)).map(new rsc(r6, 20));
                            int i4 = alog.d;
                            ConversationIdType x = ((qpj) ((rul) r6).k.b()).c((alog) map.collect(alls.a), vhfVar).x();
                            aibf aibfVar = new aibf();
                            aibfVar.j(x);
                            aibfVar.k(atomicBoolean.get());
                            return aibfVar.i();
                        }
                    }
                    j = ((rul) r6).o(wxr.f, ((ruv) obj2).b);
                } else {
                    if (!z3) {
                        j = uxi.j(r6, ((ruv) obj2).b);
                    }
                    j = ((rul) r6).o(wxr.f, ((ruv) obj2).b);
                }
                if (!j.b()) {
                    return rut.a(j);
                }
                return rut.b(((rul) r6).k((ruv) obj2));
            }
            if (this.a) {
                return mru.BOT;
            }
            String str = (String) this.c.get();
            if (str == null) {
                return mru.UNKNOWN_SENDER;
            }
            if (((Boolean) yig.ar.e()).booleanValue() && (lgc.C(str) || lgc.D(str))) {
                return mru.SATELLITE_ESP;
            }
            Object obj3 = this.b;
            if (((Boolean) ((utz) yig.Q.get()).e()).booleanValue() && ((msx) ((mrw) obj3).a.b()).h(str)) {
                return mru.PENPAL_BOT;
            }
            if (msx.g(str)) {
                return mru.EMAIL;
            }
            if (str.equals("ʼWAP_PUSH_SI!ʼ")) {
                return mru.WAP_PUSH_SI;
            }
            if (!str.equals("ʼUNKNOWN_SENDER!ʼ") && !str.isEmpty()) {
                mrw mrwVar = (mrw) obj3;
                String replace = str.replace("\\s+|-", "");
                if (!TextUtils.isEmpty(replace)) {
                    for (int i5 = 0; i5 < replace.length(); i5++) {
                        if (Character.isAlphabetic(Character.codePointAt(replace, i5))) {
                            return mru.ALPHA_CODE_OR_PHONEWORD;
                        }
                    }
                }
                if (!str.isEmpty() && str.charAt(0) == '+') {
                    for (int i6 = 1; i6 < str.length(); i6++) {
                        if (Character.isDigit(str.charAt(i6))) {
                        }
                    }
                    return mru.E164_LIKE;
                }
                if (((msx) mrwVar.a.b()).j(str)) {
                    return mru.NATIONAL_OR_LOCAL;
                }
                return mru.INVALID;
            }
            return mru.UNKNOWN_SENDER;
        }
        return ((msb) this.b).c.b().i(this.c, this.a);
    }

    public /* synthetic */ mry(msb msbVar, msh mshVar, boolean z, int i) {
        this.d = i;
        this.b = msbVar;
        this.c = mshVar;
        this.a = z;
    }

    public /* synthetic */ mry(rvw rvwVar, boolean z, MessageCoreData messageCoreData, int i) {
        this.d = i;
        this.c = rvwVar;
        this.a = z;
        this.b = messageCoreData;
    }
}
