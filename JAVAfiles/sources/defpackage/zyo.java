package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.etouffee.info.DetailsPageE2eeInfoRequest;
import com.google.android.apps.messaging.shared.datamodel.etouffee.info.E2eeInfo;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zyo extends arpw implements arqy {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    final /* synthetic */ zyp f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyo(zyp zypVar, arpe arpeVar) {
        super(5, arpeVar);
        this.f = zypVar;
    }

    /* JADX WARN: Type inference failed for: r1v26, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [miu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, nfw] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.lang.Iterable] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Integer num;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z;
        List y;
        zyn zysVar;
        String y2;
        arpl arplVar = arpl.a;
        if (this.a != 0) {
            obj3 = this.c;
            Object obj5 = this.b;
            aqil.P(obj);
            obj2 = obj;
            obj4 = obj5;
        } else {
            aqil.P(obj);
            ?? r2 = this.b;
            Object obj6 = this.c;
            ?? r8 = this.d;
            ?? r9 = this.e;
            if (r2 instanceof mll) {
                zyp zypVar = this.f;
                mll mllVar = (mll) r2;
                if (mllVar.b() != mit.GROUP ? !(mllVar.p() || ((num = (Integer) zypVar.i.b()) != null && num.intValue() == 1)) : !(((trz) zypVar.m.b()).i() && mllVar.r() == 2)) {
                    alvw g = zyp.a.g();
                    g.X(alwp.a, "BugleCdp");
                    ((alvg) g.h("com/google/android/apps/messaging/ui/conversation/details/encryption/e2eestatus/E2eeStatusUiAdapterImpl$createUiData$1", "invokeSuspend", 92, "E2eeStatusUiAdapterImpl.kt")).q("Conversation is not or has ever been encrypted");
                    return null;
                }
                zyp zypVar2 = this.f;
                this.b = r2;
                this.c = obj6;
                this.d = null;
                this.a = 1;
                if (r8 != 0 && r8.i().flatMap(new zvp(yzm.k, 3)).isPresent()) {
                    if (((nxk) zypVar2.n.b()).a() && r2.k()) {
                        E2eeInfo e2eeInfo = new E2eeInfo(aqjn.B(uao.c, uao.b));
                        LinkedHashMap linkedHashMap = new LinkedHashMap(arrn.r(aqjn.i(aqjn.J(r9, 10)), 16));
                        for (Object obj7 : r9) {
                            linkedHashMap.put(obj7, e2eeInfo);
                        }
                        obj2 = new uan(e2eeInfo, linkedHashMap, r8);
                    } else {
                        Conversation conversation = zypVar2.f;
                        String b = r2.c().b();
                        b.getClass();
                        obj2 = arrn.I(zypVar2.h, null, null, new whw(zypVar2, new DetailsPageE2eeInfoRequest(b, conversation, amkd.DETAILS_PAGE_OPEN), (arpe) null, 11), 3).n(this);
                    }
                } else {
                    alvw i = zyp.a.i();
                    i.X(alwp.a, "BugleCdp");
                    ((alvg) i.h("com/google/android/apps/messaging/ui/conversation/details/encryption/e2eestatus/E2eeStatusUiAdapterImpl", "fetchE2ee", BasePaymentResult.ERROR_REQUEST_FAILED, "E2eeStatusUiAdapterImpl.kt")).q("RCS identifier is missing for conversation");
                    obj2 = null;
                }
                if (obj2 != arplVar) {
                    obj3 = obj6;
                    obj4 = r2;
                } else {
                    return arplVar;
                }
            } else {
                alvw i2 = zyp.a.i();
                i2.X(alwp.a, "BugleCdp");
                ((alvg) i2.h("com/google/android/apps/messaging/ui/conversation/details/encryption/e2eestatus/E2eeStatusUiAdapterImpl$createUiData$1", "invokeSuspend", 89, "E2eeStatusUiAdapterImpl.kt")).q("E2eeStatus is displayed only for Bugle conversations");
                throw new IllegalStateException("kotlin.Unit");
            }
        }
        uan uanVar = (uan) obj2;
        if (uanVar == null) {
            return this.f.a();
        }
        mll mllVar2 = (mll) obj4;
        if (mllVar2.b() == mit.GROUP) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            y = aqjn.B(uao.c, uao.b);
        } else {
            y = aqjn.y(uao.b);
        }
        aron aronVar = new aron((byte[]) null);
        for (Map.Entry entry : uanVar.b.entrySet()) {
            if (!((E2eeInfo) entry.getValue()).a.containsAll(y)) {
                String p = ((ResolvedRecipient) entry.getKey()).p();
                if (!TextUtils.isEmpty(p)) {
                    String y3 = wfh.y(p);
                    y3.getClass();
                    aronVar.add(0, y3);
                } else {
                    if (qta.r()) {
                        y2 = wfh.x(((ResolvedRecipient) entry.getKey()).r(true));
                    } else {
                        y2 = wfh.y(((ResolvedRecipient) entry.getKey()).r(true));
                    }
                    y2.getClass();
                    aronVar.add(y2);
                }
            }
        }
        alog aZ = alzz.aZ(aqjn.x(aronVar));
        boolean containsAll = uanVar.a.a.containsAll(y);
        mwc mwcVar = (mwc) obj3;
        boolean z2 = mwcVar.c.h;
        boolean contains = mwcVar.d.contains(mjq.RICH);
        if (z) {
            Context context = (Context) ((zfj) this.f.k.b()).a.b();
            context.getClass();
            zysVar = new zyr(context, z2, containsAll, aZ);
        } else {
            znp znpVar = (znp) this.f.l.b();
            amjj x = mllVar2.x();
            Map map = uanVar.b;
            nfw nfwVar = uanVar.c;
            ?? r6 = znpVar.a;
            alor bc = alzz.bc(map);
            Context context2 = (Context) r6.b();
            context2.getClass();
            Object obj8 = znpVar.b;
            x.getClass();
            zysVar = new zys(context2, contains, z2, x, bc, nfwVar, containsAll, aZ);
        }
        zyq a = zysVar.a();
        if (a.a != null) {
            return a;
        }
        return this.f.a();
    }

    @Override // defpackage.arqy
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        zyo zyoVar = new zyo(this.f, (arpe) obj5);
        zyoVar.b = (miu) obj;
        zyoVar.c = (mwc) obj2;
        zyoVar.d = (nfw) obj3;
        zyoVar.e = (alog) obj4;
        return zyoVar.b(arnb.a);
    }
}
