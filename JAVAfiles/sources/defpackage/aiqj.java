package defpackage;

import android.content.Context;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiqj {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;

    public aiqj(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.e = armfVar3;
        armfVar4.getClass();
        this.f = armfVar4;
        armfVar5.getClass();
        this.k = armfVar5;
        armfVar6.getClass();
        this.c = armfVar6;
        armfVar7.getClass();
        this.h = armfVar7;
        armfVar8.getClass();
        this.j = armfVar8;
        armfVar9.getClass();
        this.i = armfVar9;
        armfVar10.getClass();
        this.d = armfVar10;
        armfVar11.getClass();
        this.g = armfVar11;
    }

    public static final void t(yni yniVar, ConversationIdType conversationIdType) {
        if (yniVar.b != null) {
            return;
        }
        swt a = sww.a();
        a.w("SpamLoggingMetadata#cacheClassification");
        a.c(new yec(conversationIdType, 13));
        a.z((String) DesugarArrays.stream(new atkn[]{new atkn(sww.c.a, true)}).map(new sho(10)).collect(Collectors.joining(", ")));
        yniVar.b = a.b().t();
    }

    public static final void u(yni yniVar, ConversationIdType conversationIdType) {
        if (yniVar.c != null) {
            return;
        }
        sxy d = MessagesTable.d();
        d.w("SpamLoggingMetadata#cacheLatestMessages");
        d.f(rwd.y(conversationIdType));
        d.h(new atkn((Object) MessagesTable.c.i, false));
        Object e = ymd.e.e();
        e.getClass();
        d.u(((Number) e).intValue());
        alog<MessagesTable.BindData> a = d.b().t().a();
        ArrayList arrayList = new ArrayList(aqjn.J(a, 10));
        for (MessagesTable.BindData bindData : a) {
            bindData.getClass();
            arrayList.add(yyb.E(bindData));
        }
        yniVar.c = arrayList;
    }

    private final ListenableFuture y() {
        ListenableFuture a;
        Object obj = this.j;
        synchronized (((airl) obj).a) {
            if (((airl) obj).c == null) {
                airl.b();
            }
            a = ((airl) obj).c.a();
        }
        return a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final ListenableFuture a() {
        return ancj.f(y(), new agui(this, 16), this.b);
    }

    public final ListenableFuture b(String str) {
        return ancj.f(y(), new agui(str, 17), andi.a);
    }

    public final ListenableFuture c() {
        return ancj.f(y(), new ahnx(16), andi.a);
    }

    public final ListenableFuture d(String str) {
        return ancj.f(b(ahmc.L(str)), new agui(str, 18), andi.a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, anen] */
    public final ListenableFuture e(String str, boolean z) {
        return this.b.submit(new mti(this, str, z, 7));
    }

    public final File f() {
        return ((Context) this.a).getCacheDir();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Set, java.lang.Object] */
    public final void g(aiql aiqlVar) {
        ((agcp) this.k).a.add(aiqlVar);
    }

    public final void h() {
        Object obj = this.j;
        airl airlVar = (airl) obj;
        synchronized (airlVar.b) {
            airk airkVar = ((airl) obj).d;
        }
        synchronized (airlVar.a) {
            airk airkVar2 = ((airl) obj).c;
            if (airkVar2 != null) {
                airkVar2.c();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [alhr, java.lang.Object] */
    public final void i() {
        aquc aqucVar = (aquc) this.h.get();
        if (aqucVar.f().equals(aqsd.TRANSIENT_FAILURE)) {
            Log.d("ExpressiveStickerClient", "RPCChannel was in TRANSIENT_FAILURE state.");
            aqucVar.e();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Set, java.lang.Object] */
    public final void j(aiql aiqlVar) {
        ((agcp) this.k).a.remove(aiqlVar);
    }

    public final boolean k(String str) {
        return ((agcp) this.k).v().contains(str);
    }

    public final aozy l(String str, Locale locale, aouz aouzVar) {
        String upperCase;
        int i;
        aozy createBuilder = aovf.a.createBuilder();
        aozy createBuilder2 = aous.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        Object obj = this.c;
        aous aousVar = (aous) createBuilder2.b;
        aousVar.c = (aoda) obj;
        aousVar.b |= 1;
        String locale2 = locale.toString();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        aous aousVar2 = (aous) createBuilder2.b;
        locale2.getClass();
        aousVar2.d = locale2;
        TelephonyManager telephonyManager = (TelephonyManager) ((Context) this.a).getSystemService("phone");
        if (telephonyManager == null) {
            upperCase = locale.getCountry();
        } else {
            String simCountryIso = telephonyManager.getSimCountryIso();
            if (TextUtils.isEmpty(simCountryIso)) {
                simCountryIso = telephonyManager.getNetworkCountryIso();
                if (TextUtils.isEmpty(simCountryIso)) {
                    simCountryIso = locale.getCountry();
                }
            }
            upperCase = simCountryIso.toUpperCase();
        }
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        aous aousVar3 = (aous) createBuilder2.b;
        upperCase.getClass();
        aousVar3.e = upperCase;
        aous aousVar4 = (aous) createBuilder2.s();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        aovf aovfVar = (aovf) apagVar;
        aousVar4.getClass();
        aovfVar.c = aousVar4;
        aovfVar.b |= 1;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        str.getClass();
        ((aovf) apagVar2).d = str;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        aovf aovfVar2 = (aovf) createBuilder.b;
        aouzVar.getClass();
        aovfVar2.g = aouzVar;
        aovfVar2.b |= 2;
        List v = ((agcp) this.k).v();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        aovf aovfVar3 = (aovf) createBuilder.b;
        apax apaxVar = aovfVar3.e;
        if (!apaxVar.c()) {
            aovfVar3.e = apag.mutableCopy(apaxVar);
        }
        aoyj.addAll(v, aovfVar3.e);
        int i2 = ((aoda) this.c).b;
        int aK = a.aK(i2);
        if (aK != 0 && aK == 12) {
            i = 7;
        } else {
            int aK2 = a.aK(i2);
            if (aK2 == 0 || aK2 != 5) {
                i = 5;
            } else {
                i = 6;
            }
        }
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((aovf) createBuilder.b).f = a.ao(i);
        return createBuilder;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    public final yni m(ypm ypmVar) {
        aiut.b();
        yni yniVar = new yni(((xnv) this.a.b()).f().toEpochMilli());
        t(yniVar, ypmVar.b);
        s(yniVar, ypmVar.f, ypmVar.b);
        p(yniVar, ypmVar.b);
        yniVar.d = ypmVar;
        return yniVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    public final yni n(ParticipantsTable.BindData bindData, tqc tqcVar) {
        aiut.b();
        yni yniVar = new yni(((xnv) this.a.b()).f().toEpochMilli());
        yniVar.f = bindData;
        yniVar.g = tqcVar;
        return yniVar;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [arpi, java.lang.Object] */
    public final Object o(MessageIdType messageIdType, ConversationIdType conversationIdType, yni yniVar, arpe arpeVar) {
        return arro.q(this.c, new yng(this, yniVar, conversationIdType, messageIdType, null), arpeVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
    public final void p(yni yniVar, ConversationIdType conversationIdType) {
        tqc r;
        if (yniVar.g == null && (r = ((rtz) this.j.b()).r(conversationIdType)) != null) {
            yniVar.g = r;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
    public final void q(yni yniVar, ConversationIdType conversationIdType) {
        if (yniVar.e != null) {
            return;
        }
        yniVar.e = ((rtz) this.j.b()).K(conversationIdType);
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [armf, java.lang.Object] */
    public final void r(yni yniVar, MessageIdType messageIdType, ConversationIdType conversationIdType) {
        MessageCoreData u;
        if (yniVar.d == null) {
            u(yniVar, conversationIdType);
            List list = yniVar.c;
            list.getClass();
            Object obj = null;
            if (messageIdType != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (d.F(((ypm) next).a, messageIdType)) {
                        obj = next;
                        break;
                    }
                }
                yniVar.d = (ypm) obj;
                if (yniVar.d == null && (u = ((rwd) this.e.b()).u(messageIdType)) != null) {
                    yniVar.d = yyb.F(u);
                    return;
                }
                return;
            }
            if (!list.isEmpty()) {
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    Object previous = listIterator.previous();
                    if (((ypm) previous).d) {
                        obj = previous;
                        break;
                    }
                }
                yniVar.d = (ypm) obj;
                if (yniVar.d == null) {
                    sxy d = MessagesTable.d();
                    d.w("SpamLoggingMetadata#cacheTargetMessage");
                    syc y = rwd.y(conversationIdType);
                    y.Q(100, 115);
                    d.f(y);
                    d.h(new atkn((Object) MessagesTable.c.i, false));
                    d.u(1);
                    alog t = d.b().t();
                    t.getClass();
                    MessagesTable.BindData bindData = (MessagesTable.BindData) aqjn.ah(t);
                    if (bindData != null) {
                        yniVar.d = yyb.E(bindData);
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [armf, java.lang.Object] */
    public final void s(yni yniVar, String str, ConversationIdType conversationIdType) {
        Object obj;
        String str2;
        ParticipantsTable.BindData bindData;
        if (yniVar.f == null) {
            q(yniVar, conversationIdType);
            List list = yniVar.e;
            list.getClass();
            Object obj2 = null;
            if (str != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (d.F(((ParticipantsTable.BindData) next).M(), str)) {
                        obj2 = next;
                        break;
                    }
                }
                bindData = (ParticipantsTable.BindData) obj2;
                if (bindData == null) {
                    bindData = ((rxq) this.i.b()).a(str);
                }
            } else {
                u(yniVar, conversationIdType);
                List list2 = yniVar.c;
                list2.getClass();
                Iterator it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (((ypm) obj).d) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                ypm ypmVar = (ypm) obj;
                if (ypmVar != null) {
                    str2 = ypmVar.f;
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    Iterator it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        if (d.F(((ParticipantsTable.BindData) next2).M(), str2)) {
                            obj2 = next2;
                            break;
                        }
                    }
                    bindData = (ParticipantsTable.BindData) obj2;
                    if (bindData == null) {
                        bindData = (ParticipantsTable.BindData) aqjn.Z(list);
                    }
                } else {
                    bindData = (ParticipantsTable.BindData) aqjn.Z(list);
                }
            }
            if (bindData != null) {
                yniVar.f = bindData;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r2v2, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(defpackage.aozy r7, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r8, defpackage.yni r9, defpackage.arpe r10) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiqj.v(aozy, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, yni, arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, arml] */
    public final CronetEngine w() {
        return (CronetEngine) this.j.a();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [armf, java.lang.Object] */
    public final xiu x(long j, long j2) {
        Context context = (Context) this.a.b();
        context.getClass();
        mce mceVar = (mce) this.b.b();
        mceVar.getClass();
        mbl mblVar = (mbl) this.e.b();
        mblVar.getClass();
        ((mbl) this.f.b()).getClass();
        yyt yytVar = (yyt) this.k.b();
        yytVar.getClass();
        wzs wzsVar = (wzs) this.c.b();
        wzsVar.getClass();
        ((ogo) this.h.b()).getClass();
        ((ogm) this.i.b()).getClass();
        ogq ogqVar = (ogq) this.d.b();
        ogqVar.getClass();
        return new xiu(context, mceVar, mblVar, yytVar, wzsVar, this.j, ogqVar, j, j2);
    }

    public aiqj(Context context, ogg oggVar, ogj ogjVar, ogf ogfVar, ogi ogiVar, ogh oghVar, xop xopVar, vdq vdqVar, por porVar) {
        context.getClass();
        vdqVar.getClass();
        this.a = context;
        this.f = oggVar;
        this.d = ogjVar;
        this.e = ogfVar;
        this.h = ogiVar;
        this.i = oghVar;
        this.c = xopVar;
        this.g = vdqVar;
        this.k = porVar;
        this.b = alvi.m("com/google/android/apps/messaging/shared/transfer/cronet/BugleQuicCronetEngine");
        this.j = armd.a(new xoq(this));
    }

    public aiqj(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, arpi arpiVar) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        armfVar8.getClass();
        armfVar9.getClass();
        armfVar10.getClass();
        arpiVar.getClass();
        this.h = armfVar;
        this.d = armfVar2;
        this.b = armfVar3;
        this.i = armfVar4;
        this.j = armfVar5;
        this.e = armfVar6;
        this.f = armfVar7;
        this.k = armfVar8;
        this.a = armfVar9;
        this.g = armfVar10;
        this.c = arpiVar;
    }

    public aiqj(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11) {
        armfVar.getClass();
        this.c = armfVar;
        armfVar2.getClass();
        this.h = armfVar2;
        armfVar3.getClass();
        this.d = armfVar3;
        armfVar4.getClass();
        this.b = armfVar4;
        armfVar5.getClass();
        this.g = armfVar5;
        armfVar6.getClass();
        this.k = armfVar6;
        armfVar7.getClass();
        this.e = armfVar7;
        armfVar8.getClass();
        this.a = armfVar8;
        armfVar9.getClass();
        this.j = armfVar9;
        armfVar10.getClass();
        this.i = armfVar10;
        armfVar11.getClass();
        this.f = armfVar11;
    }

    public aiqj(Context context, anen anenVar, aoda aodaVar, alhr alhrVar, String str, agcp agcpVar, airh airhVar, airm airmVar, Uri uri, alhr alhrVar2) {
        this.a = context;
        this.b = anenVar;
        this.c = aodaVar;
        this.i = alhrVar2;
        ArrayList arrayList = new ArrayList();
        aqut aqutVar = new aqut();
        aqutVar.h(new aquj("X-Goog-Api-Key", aqut.c), str);
        arrayList.add(new arll(aqutVar, 0));
        this.h = alhrVar;
        this.d = albo.D(new ylq(alhrVar, arrayList, 20));
        this.k = agcpVar;
        this.g = airhVar;
        this.j = new airl(this);
        this.e = algw.h(airmVar);
        this.f = uri != null ? algw.i(uri.buildUpon().appendQueryParameter("key", str).appendQueryParameter("alt", "proto").build()) : alfd.a;
    }
}
