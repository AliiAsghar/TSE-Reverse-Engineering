package defpackage;

import android.telephony.ServiceState;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import com.google.android.apps.messaging.shared.ui.attachment.MessageAttachmentContainer;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.time.Duration;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xpw implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ xpw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, arqr] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        msh mshVar = null;
        switch (this.b) {
            case 0:
                String str = (String) obj;
                aozy aozyVar = (aozy) this.a;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                xpv xpvVar = (xpv) aozyVar.b;
                xpv xpvVar2 = xpv.a;
                str.getClass();
                xpvVar.b |= 4;
                xpvVar.e = str;
                return;
            case 1:
                ((xpe) this.a).d((xpg) obj);
                return;
            case 2:
                String str2 = (String) obj;
                aozy aozyVar2 = (aozy) this.a;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                xpv xpvVar3 = (xpv) aozyVar2.b;
                xpv xpvVar4 = xpv.a;
                str2.getClass();
                xpvVar3.b |= 64;
                xpvVar3.i = str2;
                return;
            case 3:
                amgl amglVar = (amgl) obj;
                amrk amrkVar = (amrk) ((aozy) this.a).s();
                if (!amglVar.b.isMutable()) {
                    amglVar.u();
                }
                amgu amguVar = (amgu) amglVar.b;
                amgu amguVar2 = amgu.a;
                amrkVar.getClass();
                amguVar.at = amrkVar;
                amguVar.d |= 256;
                return;
            case 4:
                d.au(this.a, (vae) obj);
                return;
            case 5:
                Duration duration = (Duration) obj;
                if (duration.toMillis() <= 0) {
                    Object obj2 = this.a;
                    alwl alwlVar = (alwl) xrz.a.i();
                    alwlVar.X(ydl.z, duration);
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadInfo$Builder", "build", 75, "FileUploadInfo.java")).q("Ignoring invalid duration for audio file");
                    ((xry) obj2).b(null);
                    return;
                }
                return;
            case 6:
                String str3 = (String) obj;
                aozy aozyVar3 = (aozy) this.a;
                if (!aozyVar3.b.isMutable()) {
                    aozyVar3.u();
                }
                qep qepVar = (qep) aozyVar3.b;
                qep qepVar2 = qep.a;
                str3.getClass();
                qepVar.c = str3;
                return;
            case 7:
                String str4 = (String) obj;
                aozy aozyVar4 = (aozy) this.a;
                if (!aozyVar4.b.isMutable()) {
                    aozyVar4.u();
                }
                xsb xsbVar = (xsb) aozyVar4.b;
                xsb xsbVar2 = xsb.a;
                str4.getClass();
                xsbVar.b |= 4;
                xsbVar.e = str4;
                return;
            case 8:
                aozb aozbVar = (aozb) obj;
                aozy aozyVar5 = (aozy) this.a;
                if (!aozyVar5.b.isMutable()) {
                    aozyVar5.u();
                }
                xsb xsbVar3 = (xsb) aozyVar5.b;
                xsb xsbVar4 = xsb.a;
                aozbVar.getClass();
                xsbVar3.b |= 8;
                xsbVar3.f = aozbVar;
                return;
            case 9:
                qel qelVar = (qel) new pwb().m().fu((ContentType) obj);
                aozy aozyVar6 = (aozy) this.a;
                if (!aozyVar6.b.isMutable()) {
                    aozyVar6.u();
                }
                xsb xsbVar5 = (xsb) aozyVar6.b;
                xsb xsbVar6 = xsb.a;
                qelVar.getClass();
                xsbVar5.j = qelVar;
                xsbVar5.b |= 128;
                return;
            case 10:
                amrl amrlVar = (amrl) obj;
                Object obj3 = this.a;
                aozy aozyVar7 = (aozy) obj3;
                if (!aozyVar7.b.isMutable()) {
                    aozyVar7.u();
                }
                amgu amguVar3 = (amgu) ((amgl) obj3).b;
                amgu amguVar4 = amgu.a;
                amrlVar.getClass();
                amguVar3.ay = amrlVar;
                amguVar3.d |= 8192;
                return;
            case 11:
                xth xthVar = (xth) obj;
                Object obj4 = this.a;
                obj4.getClass();
                xthVar.getClass();
                xthVar.f((xtg) obj4);
                return;
            case 12:
                qky qkyVar = (qky) obj;
                Object obj5 = this.a;
                ContactIconView contactIconView = (ContactIconView) obj5;
                String str5 = contactIconView.m;
                long j = contactIconView.j;
                String str6 = contactIconView.k;
                long j2 = contactIconView.l;
                if (str5 != null) {
                    mshVar = ((msk) contactIconView.r.b()).n(str5);
                }
                qkyVar.h((View) obj5, j, str6, j2, mshVar, 6);
                return;
            case 13:
                String str7 = ((aouy) obj).f;
                if (!ytd.h(str7)) {
                    View view = (View) this.a;
                    view.setContentDescription(view.getContext().getResources().getString(R.string.sticker_content_description, str7));
                    return;
                }
                return;
            case 14:
                xzb.i("Bugle", (Throwable) obj, "Failed to get sticker ".concat(String.valueOf(yyb.bh(this.a))));
                return;
            case 15:
                ((MessageAttachmentContainer) this.a).b((MessagePartCoreData) obj);
                return;
            case 16:
                this.a.a(obj);
                return;
            case 17:
                this.a.a(obj);
                return;
            case 18:
                ((alpr) this.a).c((yap) obj);
                return;
            case 19:
                int state = ((ServiceState) obj).getState();
                Object obj6 = this.a;
                yav yavVar = (yav) obj6;
                int andSet = yavVar.o.getAndSet(state);
                if (andSet != state) {
                    alvw d = yav.d.d();
                    d.X(alwp.a, "BugleConnectivity");
                    ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "onServiceStateChanged", 562, "ConnectivityUtilImpl.java")).D("onServiceStateChanged: %s to %s", yav.x(andSet), yav.x(state));
                    qjb.a(new ebm(obj6, state, 11), yavVar.i);
                    return;
                }
                return;
            default:
                ybd ybdVar = (ybd) this.a;
                yaz yazVar = (yaz) obj;
                yaz yazVar2 = (yaz) ybdVar.i.getAndSet(yazVar);
                ybdVar.j.set(yazVar2);
                ((alwl) ybd.a.m().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorLThroughRServiceState", "onNetworkStateChanged", 210, "NetworkStateMonitorLThroughRServiceState.java")).J("NetworkStateMonitorLThroughRServiceState onNetworkStateChanged for subId %d: %s to %s", Integer.valueOf(ybdVar.f), yazVar2, yazVar);
                ybdVar.d.q(Integer.valueOf(ybdVar.f));
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            case 1:
                return Consumer$CC.$default$andThen(this, consumer);
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            case 3:
                return Consumer$CC.$default$andThen(this, consumer);
            case 4:
                return Consumer$CC.$default$andThen(this, consumer);
            case 5:
                return Consumer$CC.$default$andThen(this, consumer);
            case 6:
                return Consumer$CC.$default$andThen(this, consumer);
            case 7:
                return Consumer$CC.$default$andThen(this, consumer);
            case 8:
                return Consumer$CC.$default$andThen(this, consumer);
            case 9:
                return Consumer$CC.$default$andThen(this, consumer);
            case 10:
                return Consumer$CC.$default$andThen(this, consumer);
            case 11:
                return Consumer$CC.$default$andThen(this, consumer);
            case 12:
                return Consumer$CC.$default$andThen(this, consumer);
            case 13:
                return Consumer$CC.$default$andThen(this, consumer);
            case 14:
                return Consumer$CC.$default$andThen(this, consumer);
            case 15:
                return Consumer$CC.$default$andThen(this, consumer);
            case 16:
                return Consumer$CC.$default$andThen(this, consumer);
            case 17:
                return Consumer$CC.$default$andThen(this, consumer);
            case 18:
                return Consumer$CC.$default$andThen(this, consumer);
            case 19:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }
}
