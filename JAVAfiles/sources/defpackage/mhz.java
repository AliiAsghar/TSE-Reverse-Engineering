package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mhz implements algk {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ mhz(mic micVar, MessageCoreData messageCoreData, int i, amxb amxbVar, amgl amglVar, int i2) {
        this.f = i2;
        this.d = micVar;
        this.b = messageCoreData;
        this.a = i;
        this.e = amxbVar;
        this.c = amglVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.concurrent.locks.Lock, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.concurrent.locks.Lock, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.util.concurrent.locks.Lock, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        Object obj2;
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ret retVar = (ret) obj;
                        if (retVar != null) {
                            Object obj3 = this.b;
                            if (((rez) this.d).a) {
                                ((Optional) this.e).ifPresent(new wog(retVar, this.a, 0));
                            }
                            rfa rfaVar = (rfa) obj3;
                            rfaVar.h(rfaVar.d(retVar, (wng) this.c));
                        }
                        return null;
                    }
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    Object obj4 = this.d;
                    ?? r5 = this.b;
                    Object obj5 = this.c;
                    if (booleanValue) {
                        int i2 = this.a;
                        Object obj6 = this.e;
                        vqp vqpVar = (vqp) obj5;
                        d.s(!vqpVar.e.j());
                        vyv vyvVar = vqpVar.m;
                        qzy qzyVar = new qzy(vqpVar, (MessageCoreData) r5, (Uri) obj4, (String) obj6, i2, 4);
                        vyvVar.a.lock();
                        try {
                            return qzyVar.get();
                        } finally {
                            vyvVar.a.unlock();
                        }
                    }
                    vqp vqpVar2 = (vqp) obj5;
                    return ydk.i(vqpVar2.c, (Uri) obj4, new File(vqpVar2.c.getFilesDir(), "rcs_attachments"), r5.ag(), null, vqpVar2.d);
                }
                final Boolean bool = (Boolean) obj;
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                Object obj7 = this.c;
                Object obj8 = this.b;
                final int i3 = this.a;
                final ContentValues contentValues = (ContentValues) this.d;
                final rew rewVar = (rew) obj8;
                final rfa rfaVar2 = (rfa) obj7;
                smr a = ((qpj) rfaVar2.G.b()).a(rewVar.a, new armf() { // from class: ren
                    @Override // defpackage.armf, defpackage.arme
                    public final Object b() {
                        if (uzz.f()) {
                            atomicBoolean.set(true);
                        }
                        Boolean bool2 = bool;
                        ContentValues contentValues2 = contentValues;
                        int i4 = i3;
                        rew rewVar2 = rewVar;
                        rfa rfaVar3 = rfa.this;
                        ruu ruuVar = new ruu(((xhz) rfaVar3.M.b()).b(rewVar2.a, i4, true ^ ((nwo) rfaVar3.S.b()).a()));
                        boolean booleanValue2 = bool2.booleanValue();
                        rew e = rfaVar3.e(contentValues2, i4);
                        ruuVar.b(rfaVar3.f(((msk) rfaVar3.I.b()).g(e.a, new qwq(e.b, 14)), booleanValue2));
                        return ruuVar.a();
                    }
                });
                if (((nxg) rfaVar2.O.b()).a() && (obj2 = this.e) != null) {
                    rfaVar2.K.f((ahqq) obj2, new ahka("ReceiveSmsMessageHelper#shadowOrRealLaunchTimerByBlockingExecutor"), null, ahqp.SUCCESS);
                }
                return Optional.of(new rer(a, atomicBoolean.get()));
            }
            Object obj9 = this.c;
            ((mic) this.d).bu(this.b, this.a, (amxb) this.e, (amgl) obj9);
            return null;
        }
        Object obj10 = this.e;
        ((mic) this.b).br(this.c, this.a, (mbh) this.d, (amgl) obj10);
        return null;
    }

    public /* synthetic */ mhz(mic micVar, MessageCoreData messageCoreData, int i, mbh mbhVar, amgl amglVar, int i2) {
        this.f = i2;
        this.b = micVar;
        this.c = messageCoreData;
        this.a = i;
        this.d = mbhVar;
        this.e = amglVar;
    }

    public /* synthetic */ mhz(rez rezVar, Optional optional, rfa rfaVar, int i, wng wngVar, int i2) {
        this.f = i2;
        this.d = rezVar;
        this.e = optional;
        this.b = rfaVar;
        this.a = i;
        this.c = wngVar;
    }

    public /* synthetic */ mhz(rfa rfaVar, rew rewVar, int i, ContentValues contentValues, ahqq ahqqVar, int i2) {
        this.f = i2;
        this.c = rfaVar;
        this.b = rewVar;
        this.a = i;
        this.d = contentValues;
        this.e = ahqqVar;
    }

    public /* synthetic */ mhz(vqp vqpVar, MessageCoreData messageCoreData, Uri uri, String str, int i, int i2) {
        this.f = i2;
        this.c = vqpVar;
        this.b = messageCoreData;
        this.d = uri;
        this.e = str;
        this.a = i;
    }
}
