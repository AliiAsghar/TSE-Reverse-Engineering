package com.google.android.apps.messaging.shared.datamodel.verifiedsmsworkers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.akec;
import defpackage.akul;
import defpackage.albo;
import defpackage.ancd;
import defpackage.ancj;
import defpackage.anee;
import defpackage.anen;
import defpackage.anlz;
import defpackage.anma;
import defpackage.anmb;
import defpackage.anmd;
import defpackage.anme;
import defpackage.anmq;
import defpackage.aozs;
import defpackage.aozy;
import defpackage.apag;
import defpackage.aqrs;
import defpackage.aquu;
import defpackage.aquw;
import defpackage.aqux;
import defpackage.arkw;
import defpackage.arkx;
import defpackage.arlj;
import defpackage.gsi;
import defpackage.gsu;
import defpackage.gsx;
import defpackage.uht;
import defpackage.uhw;
import defpackage.ukd;
import defpackage.vcv;
import defpackage.vdm;
import defpackage.vjs;
import defpackage.xyo;
import defpackage.xze;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RetrieveBrandPublicKeysWork extends gsx {
    private static final xze f = xze.g("Bugle", "RetrieveBrandPublicKeysWork");
    public final ukd e;
    private final anen g;
    private final vjs h;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        vjs Sh();

        ukd dO();

        anen k();
    }

    public RetrieveBrandPublicKeysWork(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        a aVar = (a) akec.w(context, a.class);
        this.e = aVar.dO();
        this.g = aVar.k();
        this.h = aVar.Sh();
        xyo a2 = f.a();
        a2.H("RetrieveBrandPublicKeysWork created.");
        a2.q();
    }

    @Override // defpackage.gsx
    public final ListenableFuture b() {
        Optional empty;
        xze xzeVar = f;
        xzeVar.l("Beginning vsms RetrieveBrandPublicKeysWork work");
        gsi f2 = f();
        ukd.a.l("Creating GetPublicKeysRequest from input data");
        String d = f2.d("vsms_retrieve_brand_keys_sender_id_key");
        if (TextUtils.isEmpty(d)) {
            ukd.a.q("Cannot create vsms GetPublicKeysRequest for empty sender");
            empty = Optional.empty();
        } else {
            int a2 = f2.a("vsms_retrieve_brand_keys_mcc_key", -1);
            int a3 = f2.a("vsms_retrieve_brand_keys_mnc_key", -1);
            if (a2 != -1 && a3 != -1) {
                aozy createBuilder = anlz.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                anlz anlzVar = (anlz) createBuilder.b;
                d.getClass();
                anlzVar.d = d;
                aozy createBuilder2 = anmb.a.createBuilder();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                apag apagVar = createBuilder2.b;
                ((anmb) apagVar).b = a2;
                if (!apagVar.isMutable()) {
                    createBuilder2.u();
                }
                ((anmb) createBuilder2.b).c = a3;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                anlz anlzVar2 = (anlz) createBuilder.b;
                anmb anmbVar = (anmb) createBuilder2.s();
                anmbVar.getClass();
                anlzVar2.e = anmbVar;
                anlzVar2.b |= 2;
                anlz anlzVar3 = (anlz) createBuilder.s();
                xyo a4 = ukd.a.a();
                a4.H("Successfully created vsms GetPublicKeysRequest");
                a4.L("senderId", d);
                a4.x("mcc", a2);
                a4.x("mnc", a3);
                a4.q();
                empty = Optional.of(anlzVar3);
            } else {
                ukd.a.q("Cannot create vsms GetPublicKeysRequest for missing mcc/mnc");
                empty = Optional.empty();
            }
        }
        if (empty.isEmpty()) {
            xzeVar.q("Invalid data for requesting vsms brand keys.");
            return albo.bI(new gsu());
        }
        vjs vjsVar = this.h;
        aozy builder = ((apag) empty.get()).toBuilder();
        anmq y = vjs.y();
        if (!builder.b.isMutable()) {
            builder.u();
        }
        Object obj = vjsVar.a;
        anlz anlzVar4 = (anlz) builder.b;
        y.getClass();
        anlzVar4.c = y;
        anlzVar4.b |= 1;
        anlz anlzVar5 = (anlz) builder.s();
        anmd anmdVar = (anmd) ((vdm) obj).a().h(((Long) vcv.h.e()).longValue(), TimeUnit.MILLISECONDS);
        aqrs aqrsVar = anmdVar.a;
        aqux aquxVar = anme.a;
        if (aquxVar == null) {
            synchronized (anme.class) {
                aquxVar = anme.a;
                if (aquxVar == null) {
                    aquu a5 = aqux.a();
                    a5.e = aquw.UNARY;
                    a5.a = aqux.c("google.communications.verifiedsms.v1.MessageVerificationService", "GetPublicKeys");
                    a5.b();
                    anlz anlzVar6 = anlz.a;
                    aozs aozsVar = arkx.a;
                    a5.c = new arkw(anlzVar6);
                    a5.d = new arkw(anma.a);
                    aquxVar = a5.a();
                    anme.a = aquxVar;
                }
            }
        }
        anee o = anee.o(akul.g(arlj.a(aqrsVar.a(aquxVar, anmdVar.b), anlzVar5)));
        this.e.getClass();
        return ancd.f(ancj.f(o, new uhw(5), this.g), Throwable.class, new uht(this, 17), this.g);
    }
}
